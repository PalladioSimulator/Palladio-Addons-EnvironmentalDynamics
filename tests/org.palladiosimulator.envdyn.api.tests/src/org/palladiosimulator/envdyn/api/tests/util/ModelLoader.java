package org.palladiosimulator.envdyn.api.tests.util;

import java.nio.file.Paths;

import org.eclipse.emf.common.util.URI;
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
	private final static String SYSTEM_EXTENSION = "system";
	private final static String TEMPLATE_DEFINITION_EXTENSION = "templatevariable";
	private final static String MODEL_FOLDER_NAME = "models";
	private final static String RESOURCE_ENVIRONMENT_FILE = String.format("%1s.%2s", "DeltaIoTResources",
			RESOURCE_ENVIRONMENT_EXTENSION);
	private final static String SYSTEM_FILE = String.format("%1s.%2s", "DeltaIoTSystem", SYSTEM_EXTENSION);
	private final static String TEMPLATES_FILE = String.format("%1s.%2s", "DeltaIoTTemplateVariables",
			TEMPLATE_DEFINITION_EXTENSION);
	private final static ModelLoader LOADER_INSTANCE = new ModelLoader();

	private final URI resourceEnvURI;
	private final URI systemURI;
	private final URI templatesURI;
	private final ResourceSet resourceSet;

	private ModelLoader() {
		this.resourceEnvURI = URI.createFileURI(constructPath(RESOURCE_ENVIRONMENT_FILE));
		this.systemURI = URI.createFileURI(constructPath(SYSTEM_FILE));
		this.templatesURI = URI.createFileURI(constructPath(TEMPLATES_FILE));
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
				.getResource(URI.createFileURI(constructPath("profile.emfprofile_diagram")), true).getContents().get(0);

		this.resourceSet.getPackageRegistry().put(envTags.getNsURI(), envTags);
	}

	private String constructPath(String fileName) {
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

}
