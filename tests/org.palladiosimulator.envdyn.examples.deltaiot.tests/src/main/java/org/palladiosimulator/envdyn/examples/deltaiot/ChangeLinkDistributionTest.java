package org.palladiosimulator.envdyn.examples.deltaiot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.seff.AbstractAction;
import org.palladiosimulator.pcm.seff.AbstractBranchTransition;
import org.palladiosimulator.pcm.seff.BranchAction;
import org.palladiosimulator.pcm.seff.ProbabilisticBranchTransition;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
import org.palladiosimulator.pcm.seff.StopAction;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemPackage;

public class ChangeLinkDistributionTest {

    /**
     * Mote10; link15
     */
    private static final String ASSEMBLY_CONNECTOR = "_0knC4MVsEem8XvI7PKw-OA";
    private static final String PROBABILISTIC_BRANCH_TRANSITION = "TransmitToMote6";
    private static final double VALUE = 0.4;

    private final ResourceHelper resourceHelper = new ResourceHelper();

    private ResourceSet rs;

    @Before
    public void setUp() throws Exception {
        List<EPackage> packages = Arrays.asList(SystemPackage.eINSTANCE, RepositoryPackage.eINSTANCE);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        registerFactories(reg, packages);

        rs = new ResourceSetImpl();
        registerPackages(rs, packages);
    }

    private void registerFactories(Resource.Factory.Registry reg, List<EPackage> packages) {
        Map<String, Object> extensionToFactoryMap = reg.getExtensionToFactoryMap();
        for (EPackage ePackage : packages) {
            extensionToFactoryMap.put(ePackage.getName(), new XMIResourceFactoryImpl());
        }
    }

    private void registerPackages(ResourceSet set, List<EPackage> packages) {
        Registry packageRegistry = set.getPackageRegistry();
        for (EPackage ePackage : packages) {
            packageRegistry.put(ePackage.getNsURI(), ePackage);
        }
    }

    @Test
    public void testChangeLinkDistribution() throws URISyntaxException {
        URI systemURI = resourceHelper.getResourceUri("DeltaIoTSystem.system");
        URI repositoryURI = resourceHelper.getResourceUri("DeltaIoTRepository.repository");
        URI transformationURI = resourceHelper.getTransaformationUri("changeLinkDistribution.qvto");
        Resource systemResource = resourceHelper.loadResource(rs, systemURI);
        EObject systemObject = systemResource.getContents()
            .get(0);
        Resource repositoryResource = resourceHelper.loadResource(rs, repositoryURI);
        EObject repositoryObject = repositoryResource.getContents()
            .get(0);
        ModelExtent systemInput = new BasicModelExtent(Collections.singletonList(systemObject));
        ModelExtent repositoryInput = new BasicModelExtent(Collections.singletonList(repositoryObject));
        ExecutionContextImpl context = createExecutionContext(ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION,
                VALUE);

        ExecutionDiagnostic actualResult = executeTrafo(transformationURI, context, repositoryInput, systemInput);

        assertThat(actualResult.getSeverity()).isEqualTo(Diagnostic.OK);
        Repository actualRepository = (Repository) repositoryObject;

        ProbabilisticBranchTransition actualBranchTrans = findProbabilisticBranchTransition(actualRepository,
                (System) systemObject, ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION);
        assertThat(actualBranchTrans.getBranchProbability()).isEqualTo(VALUE);

    }

    @Test
    public void testChangeLinkDistributionSanityCheckLessOrEqualZero() throws URISyntaxException {
        double expectedNegativeValue = -0.02;
        double expectedValue = 0.0;
        URI systemURI = resourceHelper.getResourceUri("DeltaIoTSystem.system");
        URI repositoryURI = resourceHelper.getResourceUri("DeltaIoTRepository.repository");
        URI transformationURI = resourceHelper.getTransaformationUri("changeLinkDistribution.qvto");
        Resource systemResource = resourceHelper.loadResource(rs, systemURI);
        EObject systemObject = systemResource.getContents()
            .get(0);
        Resource repositoryResource = resourceHelper.loadResource(rs, repositoryURI);
        EObject repositoryObject = repositoryResource.getContents()
            .get(0);
        ModelExtent systemInput = new BasicModelExtent(Collections.singletonList(systemObject));
        ModelExtent repositoryInput = new BasicModelExtent(Collections.singletonList(repositoryObject));
        ExecutionContextImpl context = createExecutionContext(ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION,
                expectedNegativeValue);

        ExecutionDiagnostic actualResult = executeTrafo(transformationURI, context, repositoryInput, systemInput);

        assertThat(actualResult.getSeverity()).isEqualTo(Diagnostic.OK);
        Repository actualRepository = (Repository) repositoryObject;

        ProbabilisticBranchTransition actualBranchTrans = findProbabilisticBranchTransition(actualRepository,
                (System) systemObject, ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION);
        assertThat(actualBranchTrans.getBranchProbability()).isEqualTo(expectedValue);
    }

    @Test
    public void testChangeLinkDistributionSanityCheckGreaterOrEqualOne() throws URISyntaxException {
        double expectedNegativeValue = 1.02;
        double expectedValue = 1.0;
        URI systemURI = resourceHelper.getResourceUri("DeltaIoTSystem.system");
        URI repositoryURI = resourceHelper.getResourceUri("DeltaIoTRepository.repository");
        URI transformationURI = resourceHelper.getTransaformationUri("changeLinkDistribution.qvto");
        Resource systemResource = resourceHelper.loadResource(rs, systemURI);
        EObject systemObject = systemResource.getContents()
            .get(0);
        Resource repositoryResource = resourceHelper.loadResource(rs, repositoryURI);
        EObject repositoryObject = repositoryResource.getContents()
            .get(0);
        ModelExtent systemInput = new BasicModelExtent(Collections.singletonList(systemObject));
        ModelExtent repositoryInput = new BasicModelExtent(Collections.singletonList(repositoryObject));
        ExecutionContextImpl context = createExecutionContext(ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION,
                expectedNegativeValue);

        ExecutionDiagnostic actualResult = executeTrafo(transformationURI, context, repositoryInput, systemInput);

        assertThat(actualResult.getSeverity()).isEqualTo(Diagnostic.OK);
        Repository actualRepository = (Repository) repositoryObject;

        ProbabilisticBranchTransition actualBranchTrans = findProbabilisticBranchTransition(actualRepository,
                (System) systemObject, ASSEMBLY_CONNECTOR, PROBABILISTIC_BRANCH_TRANSITION);
        assertThat(actualBranchTrans.getBranchProbability()).isEqualTo(expectedValue);
    }

    private ExecutionContextImpl createExecutionContext(String assemblyConnector, String probabilisticBranchTransition,
            double value) {
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setLog(new TestQVTOLogger());
        context.setConfigProperty("assemblyConnector", assemblyConnector);
        context.setConfigProperty("probabilisticBranchTransition", probabilisticBranchTransition);
        context.setConfigProperty("value", value);
        return context;
    }

    private ExecutionDiagnostic executeTrafo(URI trafoUri, ExecutionContext context, ModelExtent... modelParameters) {
        TransformationExecutor executor = new TransformationExecutor(trafoUri);
        try {
            ExecutionDiagnostic result = executor.execute(context, modelParameters);
            return result;
        } finally {
            executor.cleanup();
        }
    }

    private ProbabilisticBranchTransition findProbabilisticBranchTransition(Repository repository, System system,
            String assemblyContextId, String probabilisticBranchTransition) {
        AssemblyContext actualContext = findAssemblyContext(system, assemblyContextId);
        assertNotNull(actualContext);

        RepositoryComponent repositoryComponent = actualContext.getEncapsulatedComponent__AssemblyContext();
        BasicComponent basicComponent = (BasicComponent) repositoryComponent;
        EList<ServiceEffectSpecification> serviceEffectSpecificationsOfBasicComponent = basicComponent
            .getServiceEffectSpecifications__BasicComponent();

        for (ServiceEffectSpecification seff : serviceEffectSpecificationsOfBasicComponent) {
            ResourceDemandingSEFF rdSeff = (ResourceDemandingSEFF) seff;
            EList<AbstractAction> actions = rdSeff.getSteps_Behaviour();

            for (AbstractAction action : actions)
                if (action instanceof BranchAction) {
                    BranchAction branchAction = (BranchAction) action;
                    AbstractAction nextAction = branchAction;
                    while (nextAction != null) {
                        if (nextAction instanceof StopAction) {
                            break;
                        }
                        if (nextAction instanceof BranchAction) {
                            EList<AbstractBranchTransition> branchTransitions = ((BranchAction) nextAction)
                                .getBranches_Branch();
                            for (AbstractBranchTransition branchTrans : branchTransitions) {
                                ProbabilisticBranchTransition probBranchTransition = (ProbabilisticBranchTransition) branchTrans;
                                if (probBranchTransition.getEntityName()
                                    .equals(probabilisticBranchTransition)) {
                                    return probBranchTransition;
                                }
                            }
                        }
                        nextAction = nextAction.getSuccessor_AbstractAction();
                    }
                }

        }
        return null;
    }

    private AssemblyContext findAssemblyContext(System actualSystem, String assemblyConnectorId) {
        EList<Connector> connectors = actualSystem.getConnectors__ComposedStructure();
        for (Connector connector : connectors) {
            AssemblyConnector assembyCon = (AssemblyConnector) connector;
            if (assembyCon.getId()
                .equals(assemblyConnectorId)) {
                AssemblyContext assemblyCtxt = assembyCon.getRequiringAssemblyContext_AssemblyConnector();
                return assemblyCtxt;
            }
        }
        return null;
    }

}
