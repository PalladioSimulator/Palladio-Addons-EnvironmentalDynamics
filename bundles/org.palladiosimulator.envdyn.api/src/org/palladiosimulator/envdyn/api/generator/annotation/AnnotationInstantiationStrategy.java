package org.palladiosimulator.envdyn.api.generator.annotation;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.generator.NetworkInstantiationStrategy;
import org.palladiosimulator.envdyn.api.generator.annotation.InstantiationContextProvider.ResolvedInstantiationContext;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AnnotationInstantiationStrategy implements NetworkInstantiationStrategy {

	private final static StaticmodelFactory MODEL_FACTORY = StaticmodelFactory.eINSTANCE;

	// private final TemplateVariableDefinitions templateDefinitions;
	private final InstantiationContextProvider contextProvider;

	public AnnotationInstantiationStrategy(TemplateVariableDefinitions templateDefinitions) {
		// this.templateDefinitions = templateDefinitions;
		this.contextProvider = new InstantiationContextProvider(templateDefinitions);
	}

	@Override
	public GroundProbabilisticNetwork instantiate(ResourceSet appliedModels) {
		contextProvider.resolve(appliedModels);
		return instantiateNetwork();
	}

	private GroundProbabilisticNetwork instantiateNetwork() {
		List<LocalProbabilisticNetwork> localNetworks = Lists.newArrayList();
		List<GroundProbabilisticModel> groundModels = Lists.newArrayList();
		for (String eachTag : contextProvider.getInstantiationTags()) {
			ResolvedInstantiationContext resolved = contextProvider.getInstantiationContextsOf(eachTag);
			List<GroundRandomVariable> groundVariables = instantiateGroundVariables(resolved);
			for (GroundRandomVariable each : groundVariables) {
				groundModels.add(instantiateAndSetLocalModel(each, resolved));
			}

			localNetworks.add(createLocalProbabilisticModel(groundVariables));
		}

		return instantiateGroundNetwork(groundModels, localNetworks);
	}

	private LocalProbabilisticNetwork createLocalProbabilisticModel(List<GroundRandomVariable> variables) {
		LocalProbabilisticNetwork model = MODEL_FACTORY.createLocalProbabilisticNetwork();
		model.getGroundRandomVariables().addAll(variables);
		return model;
	}

	private List<GroundRandomVariable> instantiateGroundVariables(ResolvedInstantiationContext resolved) {
		List<GroundRandomVariable> result = Lists.newArrayList();
		for (TemplateVariable each : resolved.getInstantiatedTemplates()) {
			if (resolved.singleInstantiation(each)) {
				result.add(createRandomVariable(each, resolved));
			} else {
				result.addAll(createRandomVariables(each, resolved));
			}
		}
		return result;
	}

	private GroundRandomVariable createRandomVariable(TemplateVariable template,
			ResolvedInstantiationContext resolved) {
		TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
				.withBaseTemplatesOnly((TemplateVariableDefinitions) template.eContainer());

		Set<EObject> appliedObjects = resolved.filterElementsInstantiating(template);
		Set<DependenceRelation> dependenceStructure = defQuery.filterRelationsWithTarget(Sets.newHashSet(template));

		return createRandomVariable(template, dependenceStructure, appliedObjects);
	}

	private List<GroundRandomVariable> createRandomVariables(TemplateVariable template,
			ResolvedInstantiationContext resolved) {
		List<GroundRandomVariable> variables = Lists.newArrayList();
		for (InstantiationContext each : resolved.filterContextsIncluding(template)) {
			TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
					.withBaseTemplatesOnly((TemplateVariableDefinitions) template.eContainer());

			Set<EObject> appliedObjects = Sets.newHashSet(each.getAppliedObject());
			Set<DependenceRelation> dependenceStructure = defQuery.filterRelationsWithTarget(Sets.newHashSet(template));

			variables.add(createRandomVariable(template, dependenceStructure, appliedObjects));
		}
		return variables;
	}

	private GroundRandomVariable createRandomVariable(TemplateVariable template,
			Set<DependenceRelation> dependenceStructure, Set<EObject> appliedObjects) {
		GroundRandomVariable variable = MODEL_FACTORY.createGroundRandomVariable();
		variable.getAppliedObjects().addAll(appliedObjects);
		variable.setInstantiatedTemplate(template);
		variable.getDependenceStructure().addAll(dependenceStructure);
		return variable;
	}

	private GroundProbabilisticModel instantiateAndSetLocalModel(GroundRandomVariable variable,
			ResolvedInstantiationContext resolved) {
		return createAndSetLocalModel(variable, resolveTemplateFactor(variable, resolved));
	}

	private GroundProbabilisticModel createAndSetLocalModel(GroundRandomVariable variable, TemplateFactor factor) {
		GroundProbabilisticModel model = createLocalModel(variable, factor);
		variable.setDescriptiveModel(model);
		return model;
	}

	private GroundProbabilisticModel createLocalModel(GroundRandomVariable variable, TemplateFactor factor) {
		GroundProbabilisticModel localModel = MODEL_FACTORY.createGroundProbabilisticModel();
		localModel.setInstantiatedFactor(factor);
		return localModel;
	}

	private TemplateFactor resolveTemplateFactor(GroundRandomVariable variable, ResolvedInstantiationContext resolved) {
		TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
				.withTemplateScope(resolved.getInstantiatedTemplates());

		TemplateVariable instantiated = variable.getInstantiatedTemplate();
		List<TemplateVariable> scope = Lists.newArrayList(instantiated);
		scope.addAll(defQuery.getParents(defQuery.filterRelationsWithTarget(Sets.newHashSet(instantiated))));

		return defQuery.findTemplateFactorWith(scope)
				.orElseThrow(() -> new EnvironmentalDynamicsException(
						String.format("There is no template factor for template variable %s",
								variable.getInstantiatedTemplate().getEntityName())));
	}

	private GroundProbabilisticNetwork instantiateGroundNetwork(List<GroundProbabilisticModel> goundModels,
			List<LocalProbabilisticNetwork> localNetworks) {
		GroundProbabilisticNetwork network = MODEL_FACTORY.createGroundProbabilisticNetwork();
		network.getLocalModels().addAll(goundModels);
		network.getLocalProbabilisticModels().addAll(localNetworks);
		return network;
	}
}
