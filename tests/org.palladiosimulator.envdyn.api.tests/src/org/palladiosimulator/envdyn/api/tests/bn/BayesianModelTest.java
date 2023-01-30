package org.palladiosimulator.envdyn.api.tests.bn;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.api.tests.util.ModelLoader;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;

import tools.mdsd.probdist.api.apache.supplier.MultinomialDistributionSupplier;
import tools.mdsd.probdist.api.apache.util.DistributionTypeModelUtil;
import tools.mdsd.probdist.api.factory.IProbabilityDistributionRegistry;
import tools.mdsd.probdist.api.factory.ProbabilityDistributionFactory;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionRepository;

public class BayesianModelTest {
	
	protected final static double ZERO_PROBABILITY = 0;
	protected final static ResourceSet APPLIED_MODELS = new ResourceSetImpl();

    protected static ProbabilityDistributionFactory defaultProbabilityDistributionFactory;
    
	
	@BeforeClass
	public static void setUpModels() {
		APPLIED_MODELS.getResources().add(ModelLoader.get().loadResourceEnvironment());
		APPLIED_MODELS.getResources().add(ModelLoader.get().loadSystem());

		ProbabilityDistributionRepository distTypes = (ProbabilityDistributionRepository) ModelLoader.get()
				.loadDistributionTypes().getContents().get(0);
		DistributionTypeModelUtil.get(distTypes);
		
		defaultProbabilityDistributionFactory = new ProbabilityDistributionFactory();
		IProbabilityDistributionRegistry probabilityDistributionRegistry = defaultProbabilityDistributionFactory;
		probabilityDistributionRegistry.register(new MultinomialDistributionSupplier());
	}
	
	protected BayesianNetwork loadBayesianNetwork() {
		GroundProbabilisticNetwork groundNetwork = (GroundProbabilisticNetwork) ModelLoader.get()
				.loadGroundProbabilisticNetwork().getContents().get(0);
		return new BayesianNetwork(null, groundNetwork, defaultProbabilityDistributionFactory);
	}
	
	
}
