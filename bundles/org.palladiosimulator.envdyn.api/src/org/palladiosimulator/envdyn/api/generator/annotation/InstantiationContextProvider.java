package org.palladiosimulator.envdyn.api.generator.annotation;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.util.AnnotationHandler.filterAnnotated;
import static org.palladiosimulator.envdyn.api.util.AnnotationHandler.getInstantiationTag;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.AnnotationHandler;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class InstantiationContextProvider {

	public static class ResolvedInstantiationContext {

		private final Set<InstantiationContext> instantiationContexts;
		private final Set<TemplateVariable> instantiatedtemplates;

		private ResolvedInstantiationContext() {
			this.instantiationContexts = Sets.newHashSet();
			this.instantiatedtemplates = Sets.newHashSet();
		}

		private ResolvedInstantiationContext(String tag, Set<InstantiationContext> instantiationContexts) {
			this.instantiationContexts = instantiationContexts;
			this.instantiatedtemplates = getCommonTemplateStructure(instantiationContexts);
		}

		public static ResolvedInstantiationContext create(String tag, Set<InstantiationContext> instantiationContexts) {
			return new ResolvedInstantiationContext(tag, instantiationContexts);
		}

		public static ResolvedInstantiationContext empty() {
			return new ResolvedInstantiationContext();
		}

		public Set<TemplateVariable> getInstantiatedTemplates() {
			return instantiatedtemplates;
		}

		public void resolve() {
			for (TemplateVariable eachTemplate : instantiatedtemplates) {
				for (InstantiationContext eachContext : instantiationContexts) {
					if (eachContext.signaturesIntersect(eachTemplate)) {
						eachContext.toInstantiate(eachTemplate);
					}
				}
			}
		}

		public Set<EObject> filterElementsInstantiating(TemplateVariable template) {
			return filterContextsIncluding(template).stream().map(InstantiationContext::getAppliedObject)
					.collect(toSet());
		}

		public Set<InstantiationContext> filterContextsIncluding(TemplateVariable template) {
			return instantiationContexts.stream().filter(contextsInstantiating(template)).collect(toSet());
		}

		private Predicate<InstantiationContext> contextsInstantiating(TemplateVariable template) {
			return c -> contains(template, c.getTemplates());
		}

		private boolean contains(TemplateVariable template, Collection<TemplateVariable> templates) {
			return templates.stream().anyMatch(t -> t.getId().equals(template.getId()));
		}
		
		

		private Set<TemplateVariable> getCommonTemplateStructure(Set<InstantiationContext> contexts) {
			InstantiationContext anyContext = Lists.newArrayList(contexts).get(0);
			EObject anyElement = anyContext.getAppliedObject();

			List<TemplateVariableGroup> groups = ANNOTATION_HANDLER.getTemplateGroups(anyContext.getStereotype(),
					anyElement);
			if (groups.size() > 0) {
				return retrieveCommonTemplateStructure(contexts);
			}

			List<TemplateVariable> templates = ANNOTATION_HANDLER.getTemplates(anyContext.getStereotype(), anyElement);
			if (templates.size() > 0) {
				return retrieveCommonTemplate(contexts);
			}

			throw new EnvironmentalDynamicsException(String
					.format("There are no template instntiations for instantiation tag %s", anyContext.getTagId()));
		}

		private Set<TemplateVariable> retrieveCommonTemplateStructure(Set<InstantiationContext> contexts) {
			Map<String, List<TemplateVariableGroup>> groupCluster = contexts.stream()
					.flatMap(each -> ANNOTATION_HANDLER.getTemplateGroups(each.getStereotype(), each.getAppliedObject()).stream())
					.collect(groupingBy(TemplateVariableGroup::getEntityName));
			
			for (String each : groupCluster.keySet()) {
				TemplateVariableGroup group = groupCluster.get(each).get(0);
				boolean isInAllContextsIncluded = contexts.stream().allMatch(c -> {
					List<TemplateVariableGroup> groups = ANNOTATION_HANDLER.getTemplateGroups(c.getStereotype(), c.getAppliedObject());
					return groups.stream().anyMatch(g -> g.getEntityName().equals(group.getEntityName()));
				});
				if (isInAllContextsIncluded) {
					return Sets.newHashSet(group.getGroupedTemplates());
				}
			}

			throw new EnvironmentalDynamicsException("There is no common template structure.");
		}

		private Set<TemplateVariable> retrieveCommonTemplate(Set<InstantiationContext> contexts) {
			Map<String, List<TemplateVariable>> templateCluster = contexts.stream()
					.flatMap(each -> ANNOTATION_HANDLER.getTemplates(each.getStereotype(), each.getAppliedObject()).stream())
					.collect(groupingBy(TemplateVariable::getId));
			
			for (String each : templateCluster.keySet()) {
				TemplateVariable template = templateCluster.get(each).get(0);
				boolean isInAllContextsIncluded = contexts.stream().allMatch(c -> {
					List<TemplateVariable> templates = ANNOTATION_HANDLER.getTemplates(c.getStereotype(), c.getAppliedObject());
					return contains(template, templates);
				});
				if (isInAllContextsIncluded) {
					return Sets.newHashSet(template);
				}
			}

			throw new EnvironmentalDynamicsException("There is no common template structure.");
		}

	}

	protected static AnnotationHandler ANNOTATION_HANDLER;

	private final Map<String, ResolvedInstantiationContext> instantiationContexts = Maps.newHashMap();

	public InstantiationContextProvider(TemplateVariableDefinitions definitions) {
		ANNOTATION_HANDLER = new AnnotationHandler(definitions);
	}

	public Set<String> getInstantiationTags() {
		return instantiationContexts.keySet();
	}

	public ResolvedInstantiationContext getInstantiationContextsOf(String tag) {
		return Optional.ofNullable(instantiationContexts.get(tag)).orElse(ResolvedInstantiationContext.empty());
	}

	public void resolve(ResourceSet appliedModels) {
		resolveInstantiationContexts(filterAnnotated(appliedModels));
	}

	private void resolveInstantiationContexts(List<EObject> appliedElements) {
		toGroupedInstantiationContexts(appliedElements).forEach(this::resolveInstantationContexts);
	}

	private Map<String, List<InstantiationContext>> toGroupedInstantiationContexts(List<EObject> appliedElements) {
		return toInstantiationContexts(appliedElements).stream().collect(groupingBy(InstantiationContext::getTagId));
	}

	private Set<InstantiationContext> toInstantiationContexts(List<EObject> appliedElements) {
		return appliedElements.stream().map(this::toInstantiationContext).collect(toSet());
	}

	private InstantiationContext toInstantiationContext(EObject appliedElement) {
		return createInstantiationContext(getInstantiationTag(appliedElement), appliedElement);
	}

	private InstantiationContext createInstantiationContext(Stereotype instantiationTag, EObject appliedElement) {
		return new InstantiationContext(instantiationTag, appliedElement);
	}

	private void resolveInstantationContexts(String tag, List<InstantiationContext> contexts) {
		ResolvedInstantiationContext context = ResolvedInstantiationContext.create(tag, Sets.newHashSet(contexts));
		context.resolve();

		addResolvedInstantiationContext(tag, context);
	}

	private void addResolvedInstantiationContext(String tag, ResolvedInstantiationContext resolved) {
		instantiationContexts.put(tag, resolved);
	}

}
