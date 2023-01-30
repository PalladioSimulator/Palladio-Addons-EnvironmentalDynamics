package org.palladiosimulator.envdyn.api.generator;

import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

import tools.mdsd.probdist.api.factory.IProbabilityDistributionFactory;
import tools.mdsd.probdist.distributiontype.DistributiontypeFactory;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionType;

public class BayesianNetworkGenerator extends ProbabilisticNetworkGenerator<BayesianNetwork> {

	private final static String BN_PREFIX = "BayesianNetwork";

	public BayesianNetworkGenerator(TemplateVariableDefinitions definitions) {
		super(definitions);
	}

	public BayesianNetworkGenerator(TemplateVariableDefinitions definitions,
			NetworkInstantiationStrategy instantiationStrategy) {
		super(definitions, instantiationStrategy);
	}

	@Override
	public BayesianNetwork createProbabilisticNetwork(GroundProbabilisticNetwork network, IProbabilityDistributionFactory probabilityDistributionFactory) {
		return new BayesianNetwork(createDistributionSkeleton(network), network, probabilityDistributionFactory);
	}

	private ProbabilityDistributionSkeleton createDistributionSkeleton(GroundProbabilisticNetwork network) {
		ProbabilityDistributionSkeleton skeleton = DistributiontypeFactory.eINSTANCE
				.createProbabilityDistributionSkeleton();
		skeleton.setEntityName(String.format("%s1_%2s", BN_PREFIX, network.getEntityName()));
		// TODO this is not always the case and should be resolved
		skeleton.setType(ProbabilityDistributionType.DISCRETE);
		// skeleton.getParamStructures().add(...);
		return skeleton;
	}

}
