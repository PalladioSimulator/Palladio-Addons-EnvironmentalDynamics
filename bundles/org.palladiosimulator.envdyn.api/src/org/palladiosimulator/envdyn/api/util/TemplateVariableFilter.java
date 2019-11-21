package org.palladiosimulator.envdyn.api.util;

import static java.util.stream.Collectors.toSet;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

public class TemplateVariableFilter {

	private final Set<TemplateVariable> templates;
	private final Set<DependenceRelation> relations;

	private TemplateVariableFilter(Set<TemplateVariable> templates, Set<DependenceRelation> relations) {
		this.templates = templates;
		this.relations = relations;
	}

	public static TemplateVariableFilter get(Set<TemplateVariable> templates, Set<DependenceRelation> relations) {
		return new TemplateVariableFilter(templates, relations);
	}

	public static TemplateVariableFilter get(TemplateVariableDefinitions definitions) {
		Set<TemplateVariable> variables = new HashSet<TemplateVariable>(definitions.getVariables());
		Set<DependenceRelation> relations = definitions.getRelation().stream()
				.filter(DependenceRelation.class::isInstance).map(DependenceRelation.class::cast).collect(toSet());
		return new TemplateVariableFilter(variables, relations);
	}

	public Set<TemplateVariable> getParents(List<DependenceRelation> dependenceStructure) {
		return dependenceStructure.stream().map(DependenceRelation::getSource).collect(toSet());
	}

	public Set<TemplateVariable> filterAllChildsOf(Set<TemplateVariable> templates) {
		return templates.stream().flatMap(t -> filterAllChildsOf(t).stream()).collect(toSet());
	}

	public Set<TemplateVariable> filterAllParentsOf(TemplateVariable template) {
		TemplateVariable baseTemplate = resolveBaseTemplate(template);
		return templates.stream().filter(parentsOf(baseTemplate)).collect(toSet());
	}

	public Set<TemplateVariable> filterAllChildsOf(TemplateVariable template) {
		TemplateVariable baseTemplate = resolveBaseTemplate(template);
		return templates.stream().filter(childsOf(baseTemplate)).collect(toSet());
	}

	private Predicate<TemplateVariable> parentsOf(TemplateVariable template) {
		return t -> relations.stream().anyMatch(hasRelation(t, template));
	}

	private Predicate<TemplateVariable> childsOf(TemplateVariable template) {
		return t -> relations.stream().anyMatch(hasRelation(template, t));
	}

	private Predicate<DependenceRelation> hasRelation(TemplateVariable source, TemplateVariable target) {
		return r -> r.getSource().getId().equals(source.getId()) && r.getTarget().getId().equals(target.getId());
	}

	public boolean relationExist(TemplateVariable source, TemplateVariable target) {
//		TemplateVariable baseSource = resolveBaseTemplate(source);
//		TemplateVariable baseTarget = resolveBaseTemplate(target);
//		return relations.stream().noneMatch(hasRelation(baseSource, baseTarget));
		return findRelation(source, target).isPresent();
	}

	public Set<TemplateVariable> filterChildless() {
		return templates.stream().filter(variablesWithoutChild(relations)).collect(toSet());
	}

	public Set<TemplateVariable> filterParentless() {
		return templates.stream().filter(variablesWithoutParent(relations)).collect(toSet());
	}

	private Predicate<TemplateVariable> variablesWithoutParent(Set<DependenceRelation> relations) {
		return v -> relations.stream().anyMatch(r -> r.getTarget().getId().equals(v.getId()));
	}

	private Predicate<TemplateVariable> variablesWithoutChild(Set<DependenceRelation> relations) {
		return v -> relations.stream().anyMatch(r -> r.getSource().getId().equals(v.getId())) == false;
	}

	public Optional<DependenceRelation> findRelation(TemplateVariable source, TemplateVariable target) {
		TemplateVariable baseSource = resolveBaseTemplate(source);
		TemplateVariable baseTarget = resolveBaseTemplate(target);
		return relations.stream().filter(hasSource(baseSource).and(hasTarget(baseTarget))).findFirst();
	}

	public Set<DependenceRelation> filterRelationsWithSource(Set<TemplateVariable> templates) {
		Set<TemplateVariable> baseTemplates = resolveBaseTemplate(templates);
		return relations.stream().filter(withSource(baseTemplates)).collect(toSet());
	}

	private Predicate<DependenceRelation> withSource(Set<TemplateVariable> templates) {
		return r -> templates.stream().anyMatch(t -> areEqual(r.getSource(), t));
	}

	private Predicate<DependenceRelation> hasSource(TemplateVariable template) {
		return r -> areEqual(template, r.getSource());
	}

	private Predicate<DependenceRelation> hasTarget(TemplateVariable template) {
		return r -> areEqual(template, r.getTarget());
	}

	public static boolean areEqual(TemplateVariable var1, TemplateVariable var2) {
		return var1.getId().equals(var2.getId());
	}

	private Set<TemplateVariable> resolveBaseTemplate(Set<TemplateVariable> templates) {
		return templates.stream().map(this::resolveBaseTemplate).collect(toSet());
	}
	
	private TemplateVariable resolveBaseTemplate(TemplateVariable template) {
		if (Optional.ofNullable(template.getRefines()).isPresent()) {
			return resolveBaseTemplate(template.getRefines());
		}
		return template;
	}

}
