package org.palladiosimulator.envdyn.api.generator.annotation;

import static java.util.stream.Collectors.groupingBy;
import static org.palladiosimulator.envdyn.api.util.AnnotationHandler.filterAnnotated;
import static org.palladiosimulator.envdyn.api.util.AnnotationHandler.getInstantiationTag;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.envdyn.api.util.AnnotationHandler;
import org.palladiosimulator.envdyn.environment.templatevariable.Argument;
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
            this.instantiationContexts = Sets.newLinkedHashSet();
            this.instantiatedtemplates = Sets.newLinkedHashSet();
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

        public boolean singleInstantiation(TemplateVariable template) {
            if (template.isShared()) {
                return true;
            }
            return nonMultiInstantiation(template);
        }

        public Set<EObject> filterElementsInstantiating(TemplateVariable template) {
            return filterContextsIncluding(template).stream()
                .map(InstantiationContext::getAppliedObject)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        public Set<InstantiationContext> filterContextsIncluding(TemplateVariable template) {
            return instantiationContexts.stream()
                .filter(contextsInstantiating(template))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        private Predicate<InstantiationContext> contextsInstantiating(TemplateVariable template) {
            return c -> contains(template, c.getTemplates());
        }

        private boolean contains(TemplateVariable template, Set<TemplateVariable> templates) {
            return templates.stream()
                .anyMatch(t -> t.getId()
                    .equals(template.getId()));
        }

        private boolean nonMultiInstantiation(TemplateVariable template) {
            Map<Argument, List<InstantiationContext>> instantiationCluster = filterContextsIncluding(template).stream()
                .collect(Collectors.groupingBy(InstantiationContext::getArgument));
            return instantiationCluster.values()
                .stream()
                .allMatch(contexts -> contexts.size() == 1);
        }

        private Set<TemplateVariable> getCommonTemplateStructure(Set<InstantiationContext> contexts) {
            List<TemplateVariable> result = Lists.newArrayList();
            InstantiationContext dummyContext = Lists.newArrayList(contexts)
                .get(0);
            EObject dummyElement = dummyContext.getAppliedObject();

            Optional<TemplateVariableGroup> group = ANNOTATION_HANDLER.getTemplateGroup(dummyContext.getStereotype(),
                    dummyElement);
            if (group.isPresent()) {
                EcoreUtil.resolveAll(group.get());
                result.addAll(group.get()
                    .getGroupedTemplates());
            } else {
                result.add(ANNOTATION_HANDLER.getTemplate(dummyContext.getStereotype(), dummyElement)
                    .get());
            }

            return Sets.newLinkedHashSet(result);
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
        return Optional.ofNullable(instantiationContexts.get(tag))
            .orElse(ResolvedInstantiationContext.empty());
    }

    public void resolve(ResourceSet appliedModels) {
        resolveInstantiationContexts(filterAnnotated(appliedModels));
    }

    private void resolveInstantiationContexts(List<EObject> appliedElements) {
        toGroupedInstantiationContexts(appliedElements).forEach(this::resolveInstantationContexts);
    }

    private Map<String, List<InstantiationContext>> toGroupedInstantiationContexts(List<EObject> appliedElements) {
        return toInstantiationContexts(appliedElements).stream()
            .collect(groupingBy(InstantiationContext::getTagId));
    }

    private Set<InstantiationContext> toInstantiationContexts(List<EObject> appliedElements) {
        return appliedElements.stream()
            .map(this::toInstantiationContext)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private InstantiationContext toInstantiationContext(EObject appliedElement) {
        return createInstantiationContext(getInstantiationTag(appliedElement), appliedElement);
    }

    private InstantiationContext createInstantiationContext(Stereotype instantiationTag, EObject appliedElement) {
        return new InstantiationContext(instantiationTag, appliedElement);
    }

    private void resolveInstantationContexts(String tag, List<InstantiationContext> contexts) {
        ResolvedInstantiationContext context = ResolvedInstantiationContext.create(tag,
                Sets.newLinkedHashSet(contexts));
        context.resolve();

        addResolvedInstantiationContext(tag, context);
    }

    private void addResolvedInstantiationContext(String tag, ResolvedInstantiationContext resolved) {
        instantiationContexts.put(tag, resolved);
    }

}
