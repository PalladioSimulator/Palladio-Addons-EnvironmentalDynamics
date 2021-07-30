package org.palladiosimulator.envdyn.api.util;

import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.STEREOTYPE_INSTANTATION_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_ARGUMENT_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_TEMPLATE_GROUP_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_TEMPLATE_NAME;
import static org.palladiosimulator.envdyn.api.generator.annotation.AnnotationConstants.TAGGED_UNIQUE_NAME;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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
		List<EObject> annotated = Lists.newArrayList();
		for (int i = 0; i < appliedModels.getResources().size(); i++) {
			Resource appliedModel = appliedModels.getResources().get(i);
			annotated.addAll(filterAnnotatedElements(appliedModel));
		}
		return annotated;
		// TODO check following:
		// Throws an java.util.ConcurrentModificationException whenever the resources
		// are iterated non-index based...
		// Stream<Resource> resources = appliedModels.getResources().stream();
		// return resources.flatMap(fitlerAnnotatedElements2()).collect(toList());
	}

	private static List<EObject> filterAnnotatedElements(Resource appliedModel) {
		List<EObject> annotatedElements = Lists.newArrayList();
		appliedModel.getAllContents().forEachRemaining(annotatedElements::add);

		annotatedElements.removeIf(noStereotypeIsApplied());

		return annotatedElements;

	}

	private static Predicate<EObject> noStereotypeIsApplied() {
		return obj -> StereotypeAPI.isStereotypeApplied(obj, STEREOTYPE_INSTANTATION_NAME) == false;
	}

//	private static Function<Resource, Stream<EObject>> fitlerAnnotatedElements() {
//		return appliedModel -> {
//			List<EObject> annotatedElements = Lists.newArrayList();
//			for (TreeIterator<EObject> iterator = appliedModel.getAllContents(); iterator.hasNext();) {
//				EObject next = iterator.next();
//				if (StereotypeAPI.isStereotypeApplied(next, STEREOTYPE_INSTANTATION_NAME)) {
//					annotatedElements.add(next);
//				}
//			}
//			return annotatedElements.stream();
//		};
//	}

	@SuppressWarnings("unchecked")
	public List<TemplateVariableGroup> getTemplateGroups(Stereotype tag, EObject appliedElement) {
		Object templateGroups = getAppliedParameter(tag, appliedElement, TAGGED_TEMPLATE_GROUP_NAME);
		return (List<TemplateVariableGroup>) templateGroups;
	}

	@SuppressWarnings("unchecked")
	public List<TemplateVariable> getTemplates(Stereotype tag, EObject appliedElement) {
		return (List<TemplateVariable>) getAppliedParameter(tag, appliedElement, TAGGED_TEMPLATE_NAME);
	}

	public Optional<Argument> getArgument(EObject appliedElement, Stereotype tag) {
		return Optional.ofNullable((Argument) getAppliedParameter(tag, appliedElement, TAGGED_ARGUMENT_NAME));
	}

	private Object getAppliedParameter(Stereotype tag, EObject appliedElement, String refName) {
		StereotypeApplication application = StereotypeAPI.getStereotypeApplication(appliedElement, tag);
		// TODO this is a quick fix; a better solution should be implemented
		application.eResource().getResourceSet().getResources().add(definitions.eResource());
		return application.eGet(StereotypeAPI.getParameter(tag, refName));
	}
}
