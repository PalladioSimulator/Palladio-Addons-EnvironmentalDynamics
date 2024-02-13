package org.palladiosimulator.envdyn.api.tests.bn;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.BeforeClass;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork;
import org.palladiosimulator.envdyn.api.tests.util.ModelLoader;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;

import tools.mdsd.probdist.api.apache.supplier.MultinomialDistributionSupplier;
import tools.mdsd.probdist.api.apache.util.IProbabilityDistributionRepositoryLookup;
import tools.mdsd.probdist.api.apache.util.ProbabilityDistributionRepositoryLookup;
import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.factory.IProbabilityDistributionRegistry;
import tools.mdsd.probdist.api.factory.ProbabilityDistributionFactory;
import tools.mdsd.probdist.api.parser.DefaultParameterParser;
import tools.mdsd.probdist.api.parser.ParameterParser;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionRepository;

public class BayesianModelTest {

    protected final static double ZERO_PROBABILITY = 0;
    protected final static ResourceSet APPLIED_MODELS = new ResourceSetImpl();

    protected static ProbabilityDistributionFactory defaultProbabilityDistributionFactory;

    @BeforeClass
    public static void setUpModels() {
        APPLIED_MODELS.getResources()
            .add(ModelLoader.get()
                .loadResourceEnvironment());
        APPLIED_MODELS.getResources()
            .add(ModelLoader.get()
                .loadSystem());

        ProbabilityDistributionRepository distTypes = (ProbabilityDistributionRepository) ModelLoader.get()
            .loadDistributionTypes()
            .getContents()
            .get(0);
        IProbabilityDistributionRepositoryLookup probDistRepoLookup = new ProbabilityDistributionRepositoryLookup(
                distTypes);

        defaultProbabilityDistributionFactory = new ProbabilityDistributionFactory();
        IProbabilityDistributionRegistry<CategoricalValue> probabilityDistributionRegistry = defaultProbabilityDistributionFactory;
        ParameterParser parameterParser = new DefaultParameterParser();
        probabilityDistributionRegistry
            .register(new MultinomialDistributionSupplier(parameterParser, probDistRepoLookup));
    }

    protected BayesianNetwork<CategoricalValue> loadBayesianNetwork() {
        GroundProbabilisticNetwork groundNetwork = (GroundProbabilisticNetwork) ModelLoader.get()
            .loadGroundProbabilisticNetwork()
            .getContents()
            .get(0);
        return new BayesianNetwork<>(null, groundNetwork, defaultProbabilityDistributionFactory);
    }

}
