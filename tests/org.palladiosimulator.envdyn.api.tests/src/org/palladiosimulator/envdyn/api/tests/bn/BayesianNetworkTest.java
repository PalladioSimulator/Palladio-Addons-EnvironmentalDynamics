package org.palladiosimulator.envdyn.api.tests.bn;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.api.generator.BayesianNetworkGenerator;
import org.palladiosimulator.envdyn.api.tests.util.ModelLoader;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

public class BayesianNetworkTest {

	private final static ResourceSet appliedModels = new ResourceSetImpl();

	private TemplateVariableDefinitions templateDefinitions;
	private BayesianNetwork bayNetwork;

	@BeforeClass
	public static void setUpModels() {
		appliedModels.getResources().add(ModelLoader.get().loadResourceEnvironment());
		appliedModels.getResources().add(ModelLoader.get().loadSystem());
	}

	@Test
	public void bnGenerationTest() {
		givenAnnotatedModelsAndTemplateDefinitions();
		whenGeneratingBN();
		thenBNIsProperlyGenerated();
	}

	private void givenAnnotatedModelsAndTemplateDefinitions() {
		templateDefinitions = (TemplateVariableDefinitions) ModelLoader.get().loadTemplates().getContents().get(0);
	}

	private void whenGeneratingBN() {
		bayNetwork = new BayesianNetworkGenerator(templateDefinitions).generate(appliedModels);
		ModelLoader.get().persist(bayNetwork.get());
	}

	private void thenBNIsProperlyGenerated() {
		assertTrue(bayNetwork.getGroundVariables().size() > 0);
	}

}
