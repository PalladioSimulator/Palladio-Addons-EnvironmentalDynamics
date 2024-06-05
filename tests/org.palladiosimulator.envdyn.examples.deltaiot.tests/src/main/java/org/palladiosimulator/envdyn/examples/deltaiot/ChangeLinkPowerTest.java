package org.palladiosimulator.envdyn.examples.deltaiot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.PCMRandomVariable;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.system.System;
import org.palladiosimulator.pcm.system.SystemPackage;

import de.uka.ipd.sdq.stoex.VariableReference;

public class ChangeLinkPowerTest {

    private ResourceSet rs;

    @Before
    public void setUp() throws Exception {
        List<EPackage> packages = Arrays.asList(SystemPackage.eINSTANCE, ResourceenvironmentPackage.eINSTANCE,
                AllocationPackage.eINSTANCE);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        registerFactories(reg, packages);

        rs = new ResourceSetImpl();
        registerPackages(rs, packages);
    }

    private void registerFactories(Resource.Factory.Registry reg, List<EPackage> packages) {
        for (EPackage ePackage : packages) {
            reg.getExtensionToFactoryMap()
                .put(ePackage.getName(), new XMIResourceFactoryImpl());
        }
    }

    private void registerPackages(ResourceSet set, List<EPackage> packages) {
        /*
         * set.getPackageRegistry() .put(CompositionPackage.eNS_URI, CompositionPackage.eINSTANCE);
         * set.getPackageRegistry() .put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
         */
        // set.getPackageRegistry()
        // .put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
//        set.getPackageRegistry().put(StochasticExpressions.eNS_URI, StochasticExpressions.eINSTANCE);
        for (EPackage ePackage : packages) {
            set.getPackageRegistry()
                .put(ePackage.getNsURI(), ePackage);
        }
    }

    private URI getResourceUri(String resourceName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        String resourcePath = getClass().getPackageName()
            .replace(".", "/") + "/" + resourceName;
        URL resourceURL = classLoader.getResource(resourcePath);
        java.net.URI javaURI = resourceURL.toURI(); // Java URI
        URI systemURI = URI.createURI(javaURI.toString()); // EMF URI
        return systemURI;
    }

    @Test
    public void testChangeLinkPowerWorks() throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        // src\main\resources\org\palladiosimulator\envdyn\examples\deltaiot
        /*
         * String resourcePath = getClass().getPackageName() .replace(".", "/") +
         * "/DeltaIoTSystem.system"; URL resourceURL = classLoader.getResource(resourcePath);
         * java.net.URI javaURI = resourceURL.toURI(); // Java URI URI systemURI =
         * URI.createURI(javaURI.toString()); // EMF URI
         */
//        URI systemEmfURI = URI.createURI("platform:/resource/model/DeltaIoTSystem.system");

        URI systemURI = getResourceUri("DeltaIoTSystem.system");
        URI resourceEnvironmentURI = getResourceUri("DeltaIoTResources.resourceenvironment");
        URI allocationURI = getResourceUri("DeltaIotAllocation.allocation");

        // Refer to an existing transformation via URI
        String resourceBasePath = getClass().getPackageName()
            .replace(".", "/");
        String transformationResourcePath = resourceBasePath + "/changeLinkPower.qvto";
        URL transformationResourceURL = classLoader.getResource(transformationResourcePath);
        // org/palladiosimulator/envdyn/examples/deltaiot/reconfigurations/changeLinkPower.qvto
        java.net.URI javaTransformationURI = transformationResourceURL.toURI(); // Java URI
        URI transformationURI = URI.createURI(javaTransformationURI.toString()); // EMF URI
//        URI transformationURI = URI.createURI("platform:/resource/myqvtprj/ChangeTheWorld.qvto");
        // create executor for the given transformation
        TransformationExecutor executor = new TransformationExecutor(transformationURI);

        // define the transformation input
        // Remark: we take the objects from a resource, however
        // a list of arbitrary in-memory EObjects may be passed
//        ResourceSet resourceSet = new ResourceSetImpl();
        Resource systemResource = loadResource(rs, systemURI);
        EObject systemObject = systemResource.getContents()
            .get(0);
        Resource resourceEnvironmentResource = loadResource(rs, resourceEnvironmentURI);
        EObject resourceEnvironmentObject = resourceEnvironmentResource.getContents()
            .get(0);
        Resource allocationResource = loadResource(rs, allocationURI);
        EObject allocationObject = allocationResource.getContents()
            .get(0);

        List<EObject> inObjects = Arrays.asList(systemObject, resourceEnvironmentObject, allocationObject);

        // create the input extent with its initial contents
        ModelExtent systemInput = new BasicModelExtent(Collections.singletonList(systemObject));
        ModelExtent resourceEnvironmentInput = new BasicModelExtent(
                Collections.singletonList(resourceEnvironmentObject));
        ModelExtent allocationInput = new BasicModelExtent(Collections.singletonList(allocationObject));
        // create an empty extent to catch the output
        // ModelExtent output = new BasicModelExtent();

        // setup the execution environment details ->
        // configuration properties, logger, monitor object etc.
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setLog(new TestQVTOLogger());
        // context.setConfigProperty("keepModeling", true);
        // TODO: add simexp modeling parameters
        context.setConfigProperty("link", "_oDy78MWTEem8XvI7PKw-OA");
        context.setConfigProperty("referenceName", "TransmissionPower6to4");
        context.setConfigProperty("value", 1);

        // run the transformation assigned to the executor with the given
        // input and output and execution context -> ChangeTheWorld(in, out)
        // Remark: variable arguments count is supported

        // ExecutionContext executionContext, ModelExtent... modelParameters
        ExecutionDiagnostic actualResult = executor.execute(context, systemInput, resourceEnvironmentInput,
                allocationInput);

//     // check the result for success
//     if(result.getSeverity() == Diagnostic.OK) {
//         // the output objects got captured in the output extent
//         List<EObject> outObjects = output.getContents();
//         // let's persist them using a resource 
//             ResourceSet resourceSet2 = new ResourceSetImpl();
//         Resource outResource = resourceSet2.getResource(
//                 URI.createURI("platform:/resource/myqvtprj/tomorrow.betterWorld"), true);
//         outResource.getContents().addAll(outObjects);
//         outResource.save(Collections.emptyMap());
//     } else {
//         // turn the result diagnostic into status and send it to error log          
//         IStatus status = BasicDiagnostic.toIStatus(result);
//         Activator.getDefault().getLog().log(status);
//     }

        assertThat(actualResult.getSeverity()).isEqualTo(Diagnostic.OK);
        // List<EObject> actualOutput = output.getContents();

        // EObject actualObject = inObjects.get(0);
        System actualSystem = (System) systemObject;

        AssemblyContext actualContext = findAssemblyContext(actualSystem, "_uUhk4MVsEem8XvI7PKw-OA");
        assertNotNull(actualContext);
        VariableUsage actualVariableUsage = findUsage(actualContext, "TransmissionPower6to4");
        VariableCharacterisation actualVariableCharacterisation = actualVariableUsage
            .getVariableCharacterisation_VariableUsage()
            .get(0);
        PCMRandomVariable actualRandomVariable = actualVariableCharacterisation
            .getSpecification_VariableCharacterisation();
        assertThat(actualRandomVariable.getSpecification()).isEqualTo("1");

//         assertThat(actualOutput.)

//        URI transformationURI = null;
////        protected void setUpInternalExecutor(URI uri, Optional<EPackage.Registry> registry) {
////            if (registry.isPresent()) {
////                executor = new TransformationExecutor(uri, registry.get());
////            } else {
////          executor = new TransformationExecutor(uri);
////            }
////        }
////        
//        TransformationExecutor executor = new TransformationExecutor(transformationURI);
//
//        Map<String, Object> contextParams = new HashMap<>();
//        // FIXME: Provide content
//        ExecutionContext executionContext = setupExecutionContext(contextParams);
//
//        // model parameters
//        Map<String, Object> modelCtxParameters = new HashMap<>();
//        contextParams.put("linkId", "4711");
//        ModelExtent modelParameters = setupModelExtend(modelCtxParameters);
//        ExecutionDiagnostic actualResult = executor.execute(executionContext, modelParameters);
//        executor.cleanup();
    }

    private Resource loadResource(ResourceSet rs, URI uri) {
        Resource resource = rs.getResource(uri, true);
        if (resource == null) {
            throw new RuntimeException("unable to load: " + uri);
        }
        return resource;
    }

    private AssemblyContext findAssemblyContext(System actualSystem, String id) {
        for (AssemblyContext ac : actualSystem.getAssemblyContexts__ComposedStructure()) {
            if (ac.getId()
                .equals(id)) {
                return ac;
            }
        }
        return null;
    }

    private VariableUsage findUsage(AssemblyContext actualContext, String referenceName) {
        for (VariableUsage vu : actualContext.getConfigParameterUsages__AssemblyContext()) {
            VariableReference namedReference = (VariableReference) vu.getNamedReference__VariableUsage();
            if (namedReference.getReferenceName()
                .equals(referenceName)) {
                return vu;
            }
        }
        return null;
    }

//    private ExecutionContext setupExecutionContext(Map<String, Object> contextParams) {
//        ExecutionContextImpl result = new ExecutionContextImpl();
//        // FIXME: provide logger
////        Log log = new QVTOReconfigurationLogger(getClass());
////        result.setLog(log);
//        for (Map.Entry<String, Object> contextParam : contextParams.entrySet()) {
//            result.setConfigProperty(contextParam.getKey(), contextParam.getValue());
//        }
//        return result;
//    }

}
