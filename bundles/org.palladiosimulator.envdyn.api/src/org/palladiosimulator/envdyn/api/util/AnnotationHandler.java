package org.palladiosimulator.envdyn.api.util;

import static java.util.stream.Collectors.toList;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.STEREOTYPE_INSTANTATION_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_ARGUMENT_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_TEMPLATE_GROUP_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_TEMPLATE_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_UNIQUE_NAME;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.modelversioning.emfprofile.Stereotype;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.envdyn.environment.templatevariable.Argument;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;

import com.google.common.collect.Lists;

public class AnnotationHandler {
	
	private final TemplateVariableDefinitions definitions;
	
	public AnnotationHandler(TemplateVariableDefinitions definitions) {
		this.definitions = definitions;
	}

	public static String getTaggedId(EObject appliedElement, Stereotype tag) {
		return StereotypeAPI.getTaggedValue(appliedElement, TAGGED_UNIQUE_NAME, tag.getName());
	}
	
	public static Stereotype getInstantiationTag(EObject obj) {
		return StereotypeAPI.getAppliedStereotypes(obj).stream()
				.filter(s -> s.getName().equals(STEREOTYPE_INSTANTATION_NAME)).findFirst().get();
	}
	
	public static List<EObject> filterAnnotated(ResourceSet appliedModels) {
		Stream<Resource> resources = appliedModels.getResources().stream();
		return resources.flatMap(fitlerAnnotatedElements()).collect(toList());
	}

	private static Function<Resource, Stream<EObject>> fitlerAnnotatedElements() {
		return appliedModel -> {
			List<EObject> annotatedElements = Lists.newArrayList();
			for (TreeIterator<EObject> iterator = appliedModel.getAllContents(); iterator.hasNext();) {
				EObject next = iterator.next();
				if (StereotypeAPI.isStereotypeApplied(next, STEREOTYPE_INSTANTATION_NAME)) {
					annotatedElements.add(next);
				}
			}
			return annotatedElements.stream();
		};
	}
	
	public Optional<TemplateVariableGroup> getTemplateGroup(Stereotype tag, EObject appliedElement) {
		return Optional.ofNullable(
				(TemplateVariableGroup) getAppliedParameter(tag, appliedElement, TAGGED_TEMPLATE_GROUP_NAME));
	}

	public Optional<TemplateVariable> getTemplate(Stereotype tag, EObject appliedElement) {
		return Optional
				.ofNullable((TemplateVariable) getAppliedParameter(tag, appliedElement, TAGGED_TEMPLATE_NAME));
	}
	
	public Optional<Argument> getArgument(EObject appliedElement, Stereotype tag) {
		return Optional.ofNullable((Argument) getAppliedParameter(tag, appliedElement, TAGGED_ARGUMENT_NAME));
	}

	private Object getAppliedParameter(Stereotype tag, EObject appliedElement, String refName) {
		StereotypeApplication application = StereotypeAPI.getStereotypeApplication(appliedElement, tag);
		//TODO this is a quick fix; a better solution should be implemented
		application.eResource().getResourceSet().getResources().add(definitions.eResource());
		return application.eGet(StereotypeAPI.getParameter(tag, refName));
	}
}
