package org.palladiosimulator.envdyn.api.generator.annotation;

import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.GROUND_VARIABLE_DELIMITER;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.INSTANTIATION_POSTFIX;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.generator.NetworkInstantiationStrategy;
import org.palladiosimulator.envdyn.api.generator.annotation.InstantiationContextProvider.ResolvedInstantiationContext;
import org.palladiosimulator.envdyn.api.util.AnnotationHandler;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class AnnotationInstantiationStrategy implements NetworkInstantiationStrategy {
	
	private static class GroundRandomVariableCache {
		
		Set<GroundRandomVariable> cache;
		
		public GroundRandomVariableCache() {
			this.cache = Sets.newHashSet();
		}
		
		public void cache(GroundRandomVariable variable) {
			cache.add(variable);
		}
		
		public Optional<GroundRandomVariable> findVariableWith(TemplateVariable template, Set<EObject> objects) {
			return cache.stream()
					.filter(variableInstantiating(template, objects))
					.findFirst();
					
		}

		private Predicate<GroundRandomVariable> variableInstantiating(TemplateVariable template,
				Set<EObject> objects) {
			return variable -> {
				boolean unequalTemplates = !variable.getInstantiatedTemplate().getId().equals(template.getId());
				if (unequalTemplates) {
					return false;
				}
				
				List<EObject> appliedObjs = Lists.newArrayList(variable.getAppliedObjects());
				for (EObject each : objects) {
					appliedObjs.removeIf(obj -> obj == each);
				}
				return appliedObjs.size() == 0;
			};
		}
		
	}
	
	private final static StaticmodelFactory MODEL_FACTORY = StaticmodelFactory.eINSTANCE;

	private final InstantiationContextProvider contextProvider;
	private final GroundRandomVariableCache groundVariableCache;

	public AnnotationInstantiationStrategy(TemplateVariableDefinitions templateDefinitions) {
		this.contextProvider = new InstantiationContextProvider(templateDefinitions);
		this.groundVariableCache = new GroundRandomVariableCache();
	}

	@Override
	public GroundProbabilisticNetwork instantiate(ResourceSet appliedModels) {
		contextProvider.resolve(appliedModels);
		return instantiateNetwork();
	}

	private GroundProbabilisticNetwork instantiateNetwork() {
		List<LocalProbabilisticNetwork> localNetworks = Lists.newArrayList();
		List<LocalProbabilisticModel> groundModels = Lists.newArrayList();
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
			GroundRandomVariable variable = createRandomVariable(each, resolved);
			result.add(variable);
		}
		return result;
	}

	private GroundRandomVariable createRandomVariable(TemplateVariable template,
			ResolvedInstantiationContext resolved) {
		TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
				.withBaseTemplatesOnly((TemplateVariableDefinitions) template.eContainer());

		Set<EObject> appliedObjects = resolved.filterElementsInstantiating(template);
		Set<DependenceRelation> dependenceStructure = defQuery.filterRelationsWithTarget(Sets.newHashSet(template));
		
		Optional<GroundRandomVariable> cachedVariable = groundVariableCache.findVariableWith(template, appliedObjects);
		if (cachedVariable.isPresent()) {
			return cachedVariable.get();
		}

		GroundRandomVariable variable = createRandomVariable(template, dependenceStructure, appliedObjects);
		groundVariableCache.cache(variable);
		return variable;
	}

	private GroundRandomVariable createRandomVariable(TemplateVariable template,
			Set<DependenceRelation> dependenceStructure, Set<EObject> appliedObjects) {
		GroundRandomVariable variable = MODEL_FACTORY.createGroundRandomVariable();
		variable.setEntityName(constructNameOf(template, appliedObjects));
		variable.getAppliedObjects().addAll(appliedObjects);
		variable.setInstantiatedTemplate(template);
		variable.getDependenceStructure().addAll(dependenceStructure);
		return variable;
	}

	private LocalProbabilisticModel instantiateAndSetLocalModel(GroundRandomVariable variable,
			ResolvedInstantiationContext resolved) {
		return createAndSetLocalModel(variable, resolveTemplateFactor(variable, resolved));
	}

	private LocalProbabilisticModel createAndSetLocalModel(GroundRandomVariable variable, TemplateFactor factor) {
		LocalProbabilisticModel model = createLocalModel(variable, factor);
		variable.setLocalModel(model);
		return model;
	}

	private LocalProbabilisticModel createLocalModel(GroundRandomVariable variable, TemplateFactor factor) {
		LocalProbabilisticModel localModel = MODEL_FACTORY.createLocalProbabilisticModel();
		localModel.setEntityName(constructNameOf(variable, factor));
		localModel.setInstantiatedFactor(factor);
		return localModel;
	}

	private TemplateFactor resolveTemplateFactor(GroundRandomVariable variable, ResolvedInstantiationContext resolved) {
		TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
				.withTemplateScope(resolved.getInstantiatedTemplates());

		TemplateVariable instantiated = variable.getInstantiatedTemplate();
		List<TemplateVariable> scope = Lists.newArrayList(instantiated);
		scope.addAll(defQuery.getParents(defQuery.filterRelationsWithTarget(Sets.newHashSet(instantiated))));

		return defQuery.findNonTemporalTemplateFactorWith(scope)
				.orElseThrow(() -> new EnvironmentalDynamicsException(
						String.format("There is no template factor for template variable %s",
								variable.getInstantiatedTemplate().getEntityName())));
	}

	private GroundProbabilisticNetwork instantiateGroundNetwork(List<LocalProbabilisticModel> goundModels,
			List<LocalProbabilisticNetwork> localNetworks) {
		GroundProbabilisticNetwork network = MODEL_FACTORY.createGroundProbabilisticNetwork();
		network.getLocalModels().addAll(goundModels);
		network.getLocalNetworks().addAll(localNetworks);
		return network;
	}

	private String constructNameOf(TemplateVariable template, Set<EObject> appliedObjects) {
		StringBuilder builder = new StringBuilder();
		builder.append(constructNameOf(Lists.newArrayList(appliedObjects)));
		builder.append(GROUND_VARIABLE_DELIMITER);
		builder.append(template.getEntityName());
		builder.append(INSTANTIATION_POSTFIX);
		return builder.toString();
	}

	private String constructNameOf(GroundRandomVariable variable, TemplateFactor factor) {
		return concat(variable.getEntityName(), concat(factor.getEntityName(), INSTANTIATION_POSTFIX));
	}

	private String constructNameOf(List<EObject> appliedObjects) {
		EObject any = appliedObjects.get(0);
		return AnnotationHandler.getTaggedId(any, AnnotationHandler.getInstantiationTag(any));
	}

	private String concat(String string1, String string2) {
		return string1.concat(GROUND_VARIABLE_DELIMITER).concat(string2);
	}

}
