package org.palladiosimulator.envdyn.api.tests.bn;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork;
import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork.Trajectory;
import org.palladiosimulator.envdyn.api.generator.DynamicBayesianNetworkGenerator;
import org.palladiosimulator.envdyn.api.tests.util.ModelLoader;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

public class DynamicBayesianNetworkTest extends BayesianModelTest {

	private final static int SAMPLED_TIME_SLICES = 5;
	
	private GroundProbabilisticNetwork groundNetwork;
	private DynamicBayesianNetwork dynBayNetwork;
	private Trajectory sampledTraj;

	@Before
	public void reset() {
		groundNetwork = null;
		dynBayNetwork = null;
		sampledTraj = null;
	}
	
	@Test
	public void dbnGenerationTest() {
		givenGroundProbabilisticModel();
		whenGeneratingDBN();
		thenDBNIsProperlyGenerated();
	}

	@Test
	public void dbnSampleTest() {
		givenDynamicBayesianNetwork();
		whenStartSampling();
		thenSampleIsValid();
	}
	
	@Test
	public void dbnTrajectorySamplingTest() {
		givenDynamicBayesianNetwork();
		whenStartSamplingATrajectory();
		thenTheTrajectoryIsValid();
	}

	private void givenGroundProbabilisticModel() {
		groundNetwork = loadBayesianNetwork().get();
	}

	private void whenGeneratingDBN() {
		TemplateVariableDefinitions definitions = (TemplateVariableDefinitions) ModelLoader.get().loadTemplates()
				.getContents().get(0);
		dynBayNetwork = new DynamicBayesianNetworkGenerator(definitions).createProbabilisticNetwork(groundNetwork);
	}

	private void thenDBNIsProperlyGenerated() {
		assertTrue(dynBayNetwork != null);
	}

	private void givenDynamicBayesianNetwork() {
		DynamicBehaviourRepository repo = (DynamicBehaviourRepository) ModelLoader.get().loadDynamicBehaviourRepo()
				.getContents().get(0);
		DynamicBehaviourExtension dynamics = repo.getExtensions().get(0);
		dynBayNetwork = new DynamicBayesianNetwork(null, loadBayesianNetwork(), dynamics);
	}

	private void whenStartSampling() {
		sampledTraj = dynBayNetwork.sample();
	}

	private void thenSampleIsValid() {
		Double probability = dynBayNetwork.probability(sampledTraj);
		assertNotNull(probability);
		assertNotSame(ZERO_PROBABILITY, probability.doubleValue());
	}
	
	private void whenStartSamplingATrajectory() {
		sampledTraj = dynBayNetwork.unrollForSampling(SAMPLED_TIME_SLICES);
	}

	private void thenTheTrajectoryIsValid() {
		thenSampleIsValid();
	}

}
