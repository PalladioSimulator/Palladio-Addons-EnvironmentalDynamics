package org.palladiosimulator.envdyn.api.generator;

import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork.getTemplates;
import static org.palladiosimulator.envdyn.api.util.InductiveDynamicBehaviourQuerying.deriveScopeFrom;

import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.Relation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import tools.mdsd.probdist.distributiontype.DistributiontypeFactory;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionType;

/*
 * This generator is rather a partial model generator, since the model can only derived and generated w.r.t. a given bayesian network. 
 * This generator is supposed to be seen as a convenience class, since the dynamic behavious extension should be rather 
 * modeled by the developer. 
 */
public class DynamicBayesianNetworkGenerator extends ProbabilisticNetworkGenerator<DynamicBayesianNetwork> {

	private final static String DBN_PREFIX = "DynamicBayesianNetwork";
	private final static String REPO_NAME = "TmpRepo";
	private final static DynamicmodelFactory FACTORY = DynamicmodelFactory.eINSTANCE;

	public DynamicBayesianNetworkGenerator(TemplateVariableDefinitions definitions) {
		super(definitions);
	}

	@Override
	public DynamicBayesianNetwork createProbabilisticNetwork(GroundProbabilisticNetwork network) {
		BayesianNetwork initial = new BayesianNetworkGenerator(definitions).createProbabilisticNetwork(network);
		DynamicBehaviourExtension extension = createDynamicBehaviourExtensionAndRepo(initial);
		return new DynamicBayesianNetwork(createDistributionSkeleton(extension), initial, extension);
	}

	private DynamicBehaviourExtension createDynamicBehaviourExtensionAndRepo(BayesianNetwork initial) {
		DynamicBehaviourRepository dynRepo = FACTORY.createDynamicBehaviourRepository();
		dynRepo.setEntityName(REPO_NAME);

		DynamicBehaviourExtension dynamics = createDynamicBehaviourExtension(initial);
		dynRepo.getExtensions().add(dynamics);

		return dynamics;
	}

	private DynamicBehaviourExtension createDynamicBehaviourExtension(BayesianNetwork initial) {
		DynamicBehaviourExtension extension = FACTORY.createDynamicBehaviourExtension();
		extension.setGroundNetwork(initial.get());
		extension.setBehaviour(createInductiveDynamics(initial));
		return extension;
	}

	private DynamicBehaviour createInductiveDynamics(BayesianNetwork initial) {
		InductiveDynamicBehaviour dynamics = FACTORY.createInductiveDynamicBehaviour();
		for (LocalProbabilisticNetwork eachLocal : initial.getLocalProbabilisticNetworks()) {
			for (InterTimeSliceInduction eachInduction : createInterTimeSliceInductions(eachLocal)) {
				TemporalDynamic dynamic = createTemporalDynamic(eachInduction, eachLocal);
				eachInduction.setLocalModel(dynamic);

				dynamics.getLocalModels().add(dynamic);
				dynamics.getTimeSliceInductions().add(eachInduction);
			}
		}
		return dynamics;
	}

	private Set<InterTimeSliceInduction> createInterTimeSliceInductions(LocalProbabilisticNetwork localNetwork) {
		TemplateDefinitionsQuerying defQuery = createDefinitionQuerying(localNetwork);
		return localNetwork.getGroundRandomVariables().stream().map(v -> createInterTimeSliceInductions(v, defQuery))
				.filter(Optional::isPresent).map(Optional::get).collect(toSet());
	}

	private Optional<InterTimeSliceInduction> createInterTimeSliceInductions(GroundRandomVariable variable,
			TemplateDefinitionsQuerying defQuery) {
//		for (TemplateVariable each : defQuery.filterInterfaceVariables()) {
//			if (areEqual(each, variable.getInstantiatedTemplate())) {
//				Set<TemporalRelation> temporalStructure = defQuery.filterTemporalRelationsWithTarget(each);
//				return Optional.of(createInterTimeSliceInduction(variable, temporalStructure));
//			}
//		}
		Set<TemporalRelation> temporalStructure = defQuery
				.filterTemporalRelationsWithTarget(variable.getInstantiatedTemplate());
		if (temporalStructure.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(createInterTimeSliceInduction(variable, temporalStructure));
	}

	private InterTimeSliceInduction createInterTimeSliceInduction(GroundRandomVariable appliedVariable,
			Set<TemporalRelation> temporalStructure) {
		InterTimeSliceInduction induction = FACTORY.createInterTimeSliceInduction();
		induction.setAppliedGroundVariable(appliedVariable);
		induction.getTemporalStructure().addAll(temporalStructure);
		return induction;
	}

	private TemporalDynamic createTemporalDynamic(InterTimeSliceInduction induction,
			LocalProbabilisticNetwork localNetwork) {
		TemplateFactor temporalFactor = createDefinitionQuerying(localNetwork)
				.findTemporalTemplateFactorWith(deriveScopeFrom(induction))
				.orElseThrow(() -> new EnvironmentalDynamicsException("There is no scope defined."));
		return createLocalDynamicModel(temporalFactor, induction.getAppliedGroundVariable());
	}

	private TemporalDynamic createLocalDynamicModel(TemplateFactor temporalFactor, GroundRandomVariable variable) {
		TemporalDynamic dynamic = FACTORY.createTemporalDynamic();
		dynamic.setEntityName(String.format("%s_Temporal", variable.getEntityName()));
		dynamic.setInstantiatedFactor(temporalFactor);
		return dynamic;
	}

	private TemplateDefinitionsQuerying createDefinitionQuerying(LocalProbabilisticNetwork localNetwork) {
		Set<TemplateVariable> templateScope = getTemplates(localNetwork);
		Set<Relation> relationScope = getRelations(templateScope);
		return TemplateDefinitionsQuerying.withScope(relationScope, templateScope);
	}

	private Set<Relation> getRelations(Set<TemplateVariable> templateScope) {
		EObject defs = Lists.newArrayList(templateScope).get(0).eContainer();
		return Sets.newHashSet(TemplateVariableDefinitions.class.cast(defs).getRelation());
	}

	private ProbabilityDistributionSkeleton createDistributionSkeleton(DynamicBehaviourExtension dynamics) {
		ProbabilityDistributionSkeleton skeleton = DistributiontypeFactory.eINSTANCE
				.createProbabilityDistributionSkeleton();
		skeleton.setEntityName(String.format("%s1_%2s", DBN_PREFIX, dynamics.getEntityName()));
		// TODO this is not always the case and should be resolved
		skeleton.setType(ProbabilityDistributionType.DISCRETE);
		// skeleton.getParamStructures().add(...);
		return skeleton;
	}

}
