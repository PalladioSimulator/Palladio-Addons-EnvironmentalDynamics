package org.palladiosimulator.envdyn.examples.deltaiot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
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

    private static final String REFERENCE_NAME = "TransmissionPower6to4";

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
    public void testChangeLinkPowerWorks() throws URISyntaxException {
        URI systemURI = getResourceUri("DeltaIoTSystem.system");
        URI resourceEnvironmentURI = getResourceUri("DeltaIoTResources.resourceenvironment");
        URI allocationURI = getResourceUri("DeltaIotAllocation.allocation");

        URI transformationURI = getResourceUri("changeLinkPower.qvto");

        Resource systemResource = loadResource(rs, systemURI);
        EObject systemObject = systemResource.getContents()
            .get(0);
        Resource resourceEnvironmentResource = loadResource(rs, resourceEnvironmentURI);
        EObject resourceEnvironmentObject = resourceEnvironmentResource.getContents()
            .get(0);
        Resource allocationResource = loadResource(rs, allocationURI);
        EObject allocationObject = allocationResource.getContents()
            .get(0);

        ModelExtent systemInput = new BasicModelExtent(Collections.singletonList(systemObject));
        ModelExtent resourceEnvironmentInput = new BasicModelExtent(
                Collections.singletonList(resourceEnvironmentObject));
        ModelExtent allocationInput = new BasicModelExtent(Collections.singletonList(allocationObject));

        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setLog(new TestQVTOLogger());
        context.setConfigProperty("link", "_oDy78MWTEem8XvI7PKw-OA");
        context.setConfigProperty("referenceName", REFERENCE_NAME);
        context.setConfigProperty("value", 1);

        ExecutionDiagnostic actualResult = executeTrafo(transformationURI, context, systemInput,
                resourceEnvironmentInput, allocationInput);

        assertThat(actualResult.getSeverity()).isEqualTo(Diagnostic.OK);
        System actualSystem = (System) systemObject;
        PCMRandomVariable actualRandomVariable = findRandomVariable(actualSystem, "_uUhk4MVsEem8XvI7PKw-OA",
                REFERENCE_NAME);
        assertThat(actualRandomVariable.getSpecification()).isEqualTo("1");
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

    private Resource loadResource(ResourceSet rs, URI uri) {
        Resource resource = rs.getResource(uri, true);
        if (resource == null) {
            throw new RuntimeException("unable to load: " + uri);
        }
        return resource;
    }

    private PCMRandomVariable findRandomVariable(System system, String assemblyContextId, String referenceName) {
        AssemblyContext actualContext = findAssemblyContext(system, assemblyContextId);
        assertNotNull(actualContext);
        VariableUsage actualVariableUsage = findUsage(actualContext, referenceName);
        VariableCharacterisation actualVariableCharacterisation = actualVariableUsage
            .getVariableCharacterisation_VariableUsage()
            .get(0);
        PCMRandomVariable randomVariable = actualVariableCharacterisation.getSpecification_VariableCharacterisation();
        return randomVariable;
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

    private ExecutionDiagnostic executeTrafo(URI trafoUri, ExecutionContext context, ModelExtent... modelParameters) {
        TransformationExecutor executor = new TransformationExecutor(trafoUri);
        try {
            ExecutionDiagnostic result = executor.execute(context, modelParameters);
            return result;
        } finally {
            executor.cleanup();
        }
    }
}
