package org.palladiosimulator.envdyn.api.generator.annotation;

import static org.palladiosimulator.envdyn.api.util.AnnotationHandler.getTaggedId;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.environment.templatevariable.Argument;
import org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class InstantiationContext {

    private final String id;
    private final Stereotype tag;
    private final Argument argument;
    private final EObject appliedObject;
    private final Set<TemplateVariable> instantiatedTemplates;

    public InstantiationContext(Stereotype tag, EObject appliedObject) {
        this.id = getTaggedId(appliedObject, tag);
        this.tag = tag;
        this.argument = InstantiationContextProvider.ANNOTATION_HANDLER.getArgument(appliedObject, tag)
            .orElseThrow(() -> new EnvironmentalDynamicsException("There is no argument specified."));
        this.appliedObject = appliedObject;
        this.instantiatedTemplates = Sets.newLinkedHashSet();
    }

    public Argument getArgument() {
        return argument;
    }

    public String getTagId() {
        return id;
    }

    public Stereotype getStereotype() {
        return tag;
    }

    public Set<TemplateVariable> getTemplates() {
        return instantiatedTemplates;
    }

    public void toInstantiate(TemplateVariable template) {
        instantiatedTemplates.add(template);
    }

    public EObject getAppliedObject() {
        return appliedObject;
    }

    public boolean signatureMatches(TemplateVariable template) {
        List<Argument> signature = signatureAsArgs(template);
        if (signature.size() > 1) {
            return false;
        }
        return isIncluded(getArgument(), signature);
    }

    public boolean signaturesIntersect(TemplateVariable template) {
        return signaturesIntersect(signatureAsArgs(template));
    }

    public boolean signaturesIntersect(List<Argument> signature) {
        return isIncluded(getArgument(), signature);
    }

    private List<Argument> signatureAsArgs(TemplateVariable template) {
        List<Argument> argSignature = Lists.newArrayList();

        Optional.ofNullable(template.getRefines())
            .ifPresent(t -> argSignature.addAll(signatureAsArgs(t)));

        for (LogicalVariable each : template.getSignature()) {
            argSignature.add(each.getArgument());
        }
        return argSignature;
    }

    private boolean isIncluded(Argument arg, List<Argument> signature) {
        return signature.stream()
            .anyMatch(equalArgs(arg));
    }

    private Predicate<Argument> equalArgs(Argument argToCheck) {
        return arg -> arg.getId()
            .equals(argToCheck.getId());
    }

}
