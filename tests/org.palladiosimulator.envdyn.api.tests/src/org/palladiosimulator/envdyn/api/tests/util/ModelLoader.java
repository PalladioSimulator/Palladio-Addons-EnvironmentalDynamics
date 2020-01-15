package org.palladiosimulator.envdyn.api.tests.util;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.modelversioning.emfprofile.EMFProfilePackage;
import org.modelversioning.emfprofile.Profile;
import org.modelversioning.emfprofileapplication.EMFProfileApplicationPackage;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.system.SystemPackage;

public class ModelLoader {

	private final static String RESOURCE_ENVIRONMENT_EXTENSION = "resourceenvironment";
	private final static String DISTRIBUTION_TYPE_EXTENSION = "distributiontype";
	private final static String SYSTEM_EXTENSION = "system";
	private final static String TEMPLATE_DEFINITION_EXTENSION = "templatevariable";
	private final static String STATIC_MODEL_EXTENSION = "staticmodel";
	private final static String DYNAMIC_MODEL_EXTENSION = "dynamicmodel";
	private final static String MODEL_FOLDER_NAME = "models";
	private final static String RESOURCE_ENVIRONMENT_FILE = String.format("%1s.%2s", "DeltaIoTResources",
			RESOURCE_ENVIRONMENT_EXTENSION);
	private final static String DISTRIBUTION_TYPE_FILE = String.format("%1s.%2s", "DeltaIoTDistributionTypes",
			DISTRIBUTION_TYPE_EXTENSION);
	private final static String SYSTEM_FILE = String.format("%1s.%2s", "DeltaIoTSystem", SYSTEM_EXTENSION);
	private final static String TEMPLATES_FILE = String.format("%1s.%2s", "DeltaIoTTemplateVariables",
			TEMPLATE_DEFINITION_EXTENSION);
	private final static String BN_FILE = String.format("%1s.%2s", "DeltaIoTNonTemporalEnvironmentModel",
			STATIC_MODEL_EXTENSION);
	private final static String DBN_FILE = String.format("%1s.%2s", "DeltaIoTEnvironmentalDynamics",
			DYNAMIC_MODEL_EXTENSION);
	private final static ModelLoader LOADER_INSTANCE = new ModelLoader();

	private final URI resourceEnvURI;
	private final URI distTypeURI;
	private final URI systemURI;
	private final URI templatesURI;
	private final URI bnURI;
	private final URI dbnURI;
	private final ResourceSet resourceSet;

	private ModelLoader() {
		this.resourceEnvURI = URI.createFileURI(makeAbsolute(RESOURCE_ENVIRONMENT_FILE));
		this.distTypeURI = URI.createFileURI(makeAbsolute(DISTRIBUTION_TYPE_FILE));
		this.systemURI = URI.createFileURI(makeAbsolute(SYSTEM_FILE));
		this.templatesURI = URI.createFileURI(makeAbsolute(TEMPLATES_FILE));
		this.bnURI = URI.createFileURI(makeAbsolute(BN_FILE));
		this.dbnURI = URI.createFileURI(makeAbsolute(DBN_FILE));
		this.resourceSet = new ResourceSetImpl();

		this.resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		this.resourceSet.getPackageRegistry().put(TemplatevariablePackage.eNS_URI, TemplatevariablePackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(RepositoryPackage.eNS_URI, RepositoryPackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(SystemPackage.eNS_URI, SystemPackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(TemplatevariablePackage.eNS_URI, TemplatevariablePackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(EMFProfilePackage.eNS_URI, EMFProfilePackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(EMFProfileApplicationPackage.eNS_URI,
				EMFProfileApplicationPackage.eINSTANCE);
		this.resourceSet.getPackageRegistry().put(NotationPackage.eNS_PREFIX, NotationPackage.eINSTANCE);

		Profile envTags = (Profile) this.resourceSet
				.getResource(URI.createFileURI(makeAbsolute("profile.emfprofile_diagram")), true).getContents().get(0);

		this.resourceSet.getPackageRegistry().put(envTags.getNsURI(), envTags);
	}

	private String makeAbsolute(String fileName) {
		return Paths.get(System.getProperty("user.dir"), Paths.get(MODEL_FOLDER_NAME, fileName).toString()).toString();
	}

	public static ModelLoader get() {
		return LOADER_INSTANCE;
	}

	public Resource loadTemplates() {
		return resourceSet.getResource(templatesURI, true);
	}

	public Resource loadResourceEnvironment() {
		return resourceSet.getResource(resourceEnvURI, true);
	}

	public Resource loadSystem() {
		return resourceSet.getResource(systemURI, true);
	}

	public Resource loadGroundProbabilisticNetwork() {
		return resourceSet.getResource(bnURI, true);
	}
	
	public Resource loadDynamicBehaviourRepo() {
		return resourceSet.getResource(dbnURI, true);
	}
	
	public Resource loadDistributionTypes() {
		return resourceSet.getResource(distTypeURI, true);
	}

	public void persist(EObject eObj) {
		Resource resource = resourceSet.createResource(URI.createFileURI(makeAbsolute("EnvDyn.dynamicmodel")));
		resource.getContents().add(eObj);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
