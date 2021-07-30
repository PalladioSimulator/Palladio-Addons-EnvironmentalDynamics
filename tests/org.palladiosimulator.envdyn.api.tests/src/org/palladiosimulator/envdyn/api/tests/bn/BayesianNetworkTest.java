package org.palladiosimulator.envdyn.api.tests.bn;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork.InputValue;
import org.palladiosimulator.envdyn.api.generator.BayesianNetworkGenerator;
import org.palladiosimulator.envdyn.api.tests.util.ModelLoader;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

public class BayesianNetworkTest extends BayesianModelTest {

	private final static int EXPECTED_NUMBER_OF_VARIABLES = 12;
	private final static int EXPECTED_NUMBER_OF_LOCAL_NETWORKS = 7;
	private final static int EXPECTED_NUMBER_OF_LOCAL_MODELS = EXPECTED_NUMBER_OF_VARIABLES;
	
	private TemplateVariableDefinitions templateDefinitions;
	private BayesianNetwork bayNetwork;
	private List<InputValue> sample;

	@Before
	public void reset() {
		templateDefinitions = null;
		bayNetwork = null;
		sample = null;
	}

	@Test
	public void bnGenerationTest() {
		givenAnnotatedModelsAndTemplateDefinitions();
		whenGeneratingBN();
		thenBNIsProperlyGenerated();
	}

	@Test
	public void bnSampleTest() {
		givenBayesianNetwork();
		whenStartSampling();
		thenSampleIsValid();
	}

	private void givenAnnotatedModelsAndTemplateDefinitions() {
		templateDefinitions = (TemplateVariableDefinitions) ModelLoader.get().loadTemplates().getContents().get(0);
	}

	private void whenGeneratingBN() {
		bayNetwork = new BayesianNetworkGenerator(templateDefinitions).generate(APPLIED_MODELS);
	}

	private void thenBNIsProperlyGenerated() {
		assertTrue(bayNetwork.getGroundVariables().size() == EXPECTED_NUMBER_OF_VARIABLES);
		assertTrue(bayNetwork.getLocalProbabilisticNetworks().size() == EXPECTED_NUMBER_OF_LOCAL_NETWORKS);
		assertTrue(bayNetwork.get().getLocalModels().size() == EXPECTED_NUMBER_OF_LOCAL_MODELS);
	}

	private void givenBayesianNetwork() {
		bayNetwork = loadBayesianNetwork();
	}

	private void whenStartSampling() {
		sample = bayNetwork.sample();
	}

	private void thenSampleIsValid() {
		Double probability = bayNetwork.probability(sample);
		assertNotNull(probability);
		assertNotSame(ZERO_PROBABILITY, probability.doubleValue());
	}

}
