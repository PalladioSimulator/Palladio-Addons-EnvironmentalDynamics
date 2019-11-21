package org.palladiosimulator.envdyn.api.generator.annotation;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.generator.NetworkInstantiationStrategy;
import org.palladiosimulator.envdyn.api.generator.annotation.InstantiationContextProvider.ResolvedInstantiationContext;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsFilter;
import org.palladiosimulator.envdyn.api.util.TemplateVariableFilter;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AnnotationInstantiationStrategy implements NetworkInstantiationStrategy {

	private final static StaticmodelFactory MODEL_FACTORY = StaticmodelFactory.eINSTANCE;

	private final TemplateDefinitionsFilter templateDefinitionsUtil;
	private final TemplateVariableFilter templateFilter;
	private final InstantiationContextProvider contextProvider;

	public AnnotationInstantiationStrategy(TemplateVariableDefinitions templateDefinitions) {
		this.templateDefinitionsUtil = TemplateDefinitionsFilter.get(templateDefinitions);
		this.templateFilter = createVariableUtil();
		this.contextProvider = new InstantiationContextProvider(templateDefinitions);
	}

	private TemplateVariableFilter createVariableUtil() {
		Set<DependenceRelation> relations = templateDefinitionsUtil.filterAllDependenceRelations();
		Set<TemplateVariable> variables = templateDefinitionsUtil.getVariables().collect(toSet());
		return TemplateVariableFilter.get(variables, relations);
	}

	@Override
	public GroundProbabilisticNetwork instantiate(ResourceSet appliedModels) {
		contextProvider.resolve(appliedModels);
		return instantiateNetwork();
	}

	private GroundProbabilisticNetwork instantiateNetwork() {
		List<GroundRandomVariable> groundVariables = instantiateGroundVariables();
		List<LocalProbabilisticModel> localModels = instantiateAndSetLocalModels(groundVariables);
		return instantiateGroundNetwork(groundVariables, localModels);
	}

	private List<GroundRandomVariable> instantiateGroundVariables() {
		Set<ResolvedInstantiationContext> resolved = Sets.newHashSet();
		for (String eachTag : contextProvider.getInstantiationTags()) {
			resolved.add(contextProvider.getInstantiationContextsOf(eachTag));
		}
		return resolved.stream().flatMap(this::createGroundVariables).collect(toList());
	}

	private Stream<GroundRandomVariable> createGroundVariables(ResolvedInstantiationContext resolved) {
		List<GroundRandomVariable> result = Lists.newArrayList();
		for (TemplateVariable each : resolved.getInstantiatedTemplates()) {
			if (resolved.singleInstantiation(each)) {
				result.add(createRandomVariable(each, resolved.filterElementsInstantiating(each)));
			} else {
				result.addAll(createRandomVariables(each, resolved));
			}
		}
		return result.stream();
	}

	private List<GroundRandomVariable> createRandomVariables(TemplateVariable template,
			ResolvedInstantiationContext resolved) {
		return resolved.filterContextsIncluding(template).stream().map(c -> Sets.newHashSet(c.getAppliedObject()))
				.map(o -> createRandomVariable(template, o)).collect(toList());
	}

	private GroundRandomVariable createRandomVariable(TemplateVariable template, Set<EObject> appliedObjects) {
		GroundRandomVariable variable = MODEL_FACTORY.createGroundRandomVariable();
		variable.getAppliedObjects().addAll(appliedObjects);
		variable.setInstantiatedTemplate(template);
		variable.getDependenceStructure().addAll(resolveDependenceStructure(template));
		return variable;
	}

	private Set<DependenceRelation> resolveDependenceStructure(TemplateVariable template) {
		return filterParents(template).map(p -> findRelation(p, template)).collect(toSet());
	}

	private Stream<TemplateVariable> filterParents(TemplateVariable template) {
		return templateFilter.filterAllParentsOf(template).stream();
	}

	private DependenceRelation findRelation(TemplateVariable source, TemplateVariable target) {
		return templateFilter.findRelation(source, target).get();
	}

	private List<LocalProbabilisticModel> instantiateAndSetLocalModels(List<GroundRandomVariable> variables) {
		List<LocalProbabilisticModel> instantiatedModels = Lists.newArrayList();
		for (GroundRandomVariable each : variables) {
			LocalProbabilisticModel model = createLocalModel(each);
			each.setDescriptiveModel(model);
			instantiatedModels.add(model);
		}
		return instantiatedModels;
	}

	private LocalProbabilisticModel createLocalModel(GroundRandomVariable variable) {
		LocalProbabilisticModel localModel = MODEL_FACTORY.createLocalProbabilisticModel();
		localModel.setInstantiatedFactor(resolveTemplateFactor(variable));
		return localModel;
	}

	private TemplateFactor resolveTemplateFactor(GroundRandomVariable variable) {
		List<TemplateVariable> scope = Lists.newArrayList(variable.getInstantiatedTemplate());
		scope.addAll(templateFilter.getParents(variable.getDependenceStructure()));

		return templateDefinitionsUtil.findTemplateFactorWith(scope)
				.orElseThrow(() -> new EnvironmentalDynamicsException(
						String.format("There is no template factor for template variable %s",
								variable.getInstantiatedTemplate().getEntityName())));
	}

	private GroundProbabilisticNetwork instantiateGroundNetwork(List<GroundRandomVariable> groundVariables,
			List<LocalProbabilisticModel> localModels) {
		GroundProbabilisticNetwork network = MODEL_FACTORY.createGroundProbabilisticNetwork();
		network.getGroundRandomVariables().addAll(groundVariables);
		network.getLocalModels().addAll(localModels);
		return network;
	}
}
