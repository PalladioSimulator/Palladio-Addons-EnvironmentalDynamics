package org.palladiosimulator.envdyn.api.util;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

import static org.palladiosimulator.envdyn.api.util.InductiveDynamicBehaviourQuerying.getSource;
import static org.palladiosimulator.envdyn.api.util.InductiveDynamicBehaviourQuerying.getTarget;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.Relation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;

import com.google.common.collect.Sets;

public class TemplateDefinitionsQuerying {

	private class QueryingScope {

		private final Set<Relation> relationScope;
		private final Set<TemplateVariable> templateScope;

		public QueryingScope(TemplateVariableDefinitions definitions) {
			this.relationScope = Sets.newHashSet(definitions.getRelation());
			this.templateScope = resolveBaseTemplates(definitions.getVariables());
		}

		public QueryingScope(Collection<Relation> relationScope, Collection<TemplateVariable> templateScope) {
			this.relationScope = Sets.newHashSet(relationScope);
			this.templateScope = Sets.newHashSet(templateScope);

			checkValidity();

			adjustScope();
		}

		public Stream<Relation> getRelations() {
			return relationScope.stream();
		}

		public Stream<TemplateVariable> getTemplates() {
			return templateScope.stream();
		}

		public Set<TemplateVariable> adjustToScope(Set<TemplateVariable> templates) {
			for (TemplateVariable each : templates) {
				if (containsNot(each, templateScope)) {
					templates.remove(each);
					templates.add(findTemplateInScope(each));
				}
			}
			return templates;
		}

		private void checkValidity() {
			Map<String, List<TemplateVariable>> baseTemplates = getTemplates()
					.collect(groupingBy(TemplateVariable::getId));
			for (String each : baseTemplates.keySet()) {
				if (baseTemplates.get(each).size() > 1) {
					throw new EnvironmentalDynamicsException(
							"It is required that only one of the templates in the refined template hierarchy is in the scope");
				}
			}
		}

		private void adjustScope() {
			for (TemplateVariable each : templateScope) {
				TemplateVariable base = resolveBaseTemplate(each);
				if (areNotEqual(each, base)) {
					adjustRelationScope(base, each);
				}
			}
		}

		private Set<TemplateVariable> resolveBaseTemplates(List<TemplateVariable> templates) {
			Set<TemplateVariable> baseTemplates = Sets.newHashSet();
			for (TemplateVariable each : templates) {
				TemplateVariable base = resolveBaseTemplate(each);
				if (areEqual(each, base)) {
					baseTemplates.add(each);
				}
			}
			return baseTemplates;
		}

		private TemplateVariable resolveBaseTemplate(TemplateVariable template) {
			return template.getRefines() != null ? resolveBaseTemplate(template.getRefines()) : template;
		}

		private void adjustRelationScope(TemplateVariable base, TemplateVariable sub) {
			for (Relation each : Sets.newHashSet(relationScope)) {
				if (each instanceof DependenceRelation) {
					adjustDependenceRelation(base, sub, (DependenceRelation) each);
				} else if (each instanceof PersistenceRelation) {
					adjustPersistenceRelation(base, sub, (PersistenceRelation) each);
				}
			}
		}

		private void adjustPersistenceRelation(TemplateVariable base, TemplateVariable sub,
				PersistenceRelation relation) {
			if (areEqual(relation.getInterfaceVariable(), base)) {
				relationScope.add(copyAndAdjust(relation, sub));
			}
		}

		private void adjustDependenceRelation(TemplateVariable base, TemplateVariable sub,
				DependenceRelation relation) {
			if (areEqual(relation.getSource(), base)) {
				relationScope.remove(relation);
				relationScope.add(copyAndAdjustSource(relation, sub));
			} else if (areEqual(relation.getTarget(), base)) {
				relationScope.remove(relation);
				relationScope.add(copyAndAdjustTarget(relation, sub));
			}
		}

		private Relation copyAndAdjust(PersistenceRelation relation, TemplateVariable sub) {
			PersistenceRelation adjustedCopy = (PersistenceRelation) EcoreUtil.copy(relation);
			adjustedCopy.setInterfaceVariable(sub);
			return adjustedCopy;
		}

		private Relation copyAndAdjustSource(DependenceRelation relation, TemplateVariable sub) {
			DependenceRelation adjustedCopy = (DependenceRelation) EcoreUtil.copy(relation);
			adjustedCopy.setSource(sub);
			return adjustedCopy;
		}

		private Relation copyAndAdjustTarget(DependenceRelation relation, TemplateVariable sub) {
			DependenceRelation adjustedCopy = (DependenceRelation) EcoreUtil.copy(relation);
			adjustedCopy.setTarget(sub);
			return adjustedCopy;
		}

		private TemplateVariable findTemplateInScope(TemplateVariable outOfScopeTemplate) {
			for (TemplateVariable each : templateScope) {
				if (areEqual(resolveBaseTemplate(each), resolveBaseTemplate(outOfScopeTemplate))) {
					return each;
				}
			}

			throw new EnvironmentalDynamicsException(String.format("Template variable %s is not in the queried scope.",
					outOfScopeTemplate.getEntityName()));
		}

	}

	private final QueryingScope scope;
	private final TemplateVariableDefinitions definitions;

	private TemplateDefinitionsQuerying(Collection<Relation> relationScope, Collection<TemplateVariable> templateScope,
			TemplateVariableDefinitions defintions) {
		this.scope = new QueryingScope(relationScope, templateScope);
		this.definitions = defintions;
	}

	private TemplateDefinitionsQuerying(TemplateVariableDefinitions defintions) {
		this.scope = new QueryingScope(defintions);
		this.definitions = defintions;
	}

	public static TemplateDefinitionsQuerying withBaseTemplatesOnly(TemplateVariableDefinitions definitions) {
		return new TemplateDefinitionsQuerying(definitions);
	}

	public static TemplateDefinitionsQuerying withScope(Set<Relation> relationScope,
			Set<TemplateVariable> templateScope) {
		return new TemplateDefinitionsQuerying(relationScope, templateScope,
				getTemplateVariableDefinitions(templateScope));
	}

	public static TemplateDefinitionsQuerying withTemplateScope(Set<TemplateVariable> templateScope) {
		TemplateVariableDefinitions definitions = getTemplateVariableDefinitions(templateScope);
		Set<Relation> dRelations = Sets.newHashSet();
		for (Relation each : filterDependenceRelations(definitions)) {
			DependenceRelation dRelation = (DependenceRelation) each;
			if (Boolean.logicalOr(contains(dRelation.getSource(), templateScope),
					contains(dRelation.getTarget(), templateScope))) {
				dRelations.add(dRelation);
			}
		}
		return new TemplateDefinitionsQuerying(dRelations, templateScope, definitions);
	}

	public static boolean contains(TemplateVariable template, Collection<TemplateVariable> templates) {
		return templates.stream().anyMatch(t -> areEqual(template, t));
	}

	public static boolean containsNot(TemplateVariable template, Collection<TemplateVariable> templates) {
		return templates.stream().noneMatch(t -> areEqual(template, t));
	}

	public static boolean areEqual(TemplateVariable var1, TemplateVariable var2) {
		return var1.getId().equals(var2.getId());
	}

	public static boolean areNotEqual(TemplateVariable var1, TemplateVariable var2) {
		return areEqual(var1, var2) == false;
	}

	public Set<TemporalRelation> filterTemporalRelationsWithSource(TemplateVariable interfaceVariable) {
		return filterTemporalRelations().stream().filter(hasTemporalSource(interfaceVariable)).collect(toSet());
	}

	public Set<TemporalRelation> filterTemporalRelationsWithTarget(TemplateVariable interfaceVariable) {
		return filterTemporalRelations().stream().filter(hasTemporalTarget(interfaceVariable)).collect(toSet());
	}

	private Predicate<TemporalRelation> hasTemporalSource(TemplateVariable interfaceVariable) {
		return r -> areEqual(getSource(r), interfaceVariable);
	}
	
	private Predicate<TemporalRelation> hasTemporalTarget(TemplateVariable interfaceVariable) {
		return r -> areEqual(getTarget(r), interfaceVariable);
	}

	public Set<TemplateVariable> filterInterfaceVariables() {
		return filterTemporalRelations().stream().map(r -> getSource(r)).collect(toSet());
	}

	public Set<TemplateVariable> getTemplateVariables() {
		return scope.getTemplates().collect(toSet());
	}

	public Optional<TemplateFactor> findTemporalTemplateFactorWith(List<TemplateVariable> scope) {
		return getTemplateFactors().filter(withSameScope(scope).and(isTemporal())).findFirst();
	}

	public Optional<TemplateFactor> findNonTemporalTemplateFactorWith(List<TemplateVariable> scope) {
		return getTemplateFactors().filter(withSameScope(scope).and(isNonTemporal())).findFirst();
	}

	private Predicate<TemplateFactor> isTemporal() {
		return TemplateFactor::isTemporal;
	}

	private Predicate<TemplateFactor> isNonTemporal() {
		return isTemporal().negate();
	}

	private static TemplateVariableDefinitions getTemplateVariableDefinitions(Set<TemplateVariable> templateScope) {
		Iterator<TemplateVariable> iterator = templateScope.iterator();
		if (iterator.hasNext()) {
			return (TemplateVariableDefinitions) iterator.next().eContainer();
		}
		return null;
	}

	private Predicate<TemplateFactor> withSameScope(List<TemplateVariable> scope) {
		return factor -> {
			if (scope.size() != factor.getScope().size()) {
				return false;
			}

			Set<String> givenScope = asIds(scope);
			Set<String> factorScope = asIds(factor.getScope());
			return Sets.difference(givenScope, factorScope).isEmpty();
		};
	}

	private Set<String> asIds(List<TemplateVariable> templates) {
		Set<String> ids = Sets.newHashSet();
		for (TemplateVariable each : templates) {
			ids.add(each.getId());
		}
		return ids;
	}

	public Set<TemplateVariable> getParents(Set<DependenceRelation> dependenceStructure) {
		Set<TemplateVariable> interimResult = dependenceStructure.stream().map(DependenceRelation::getSource)
				.collect(toSet());
		return scope.adjustToScope(interimResult);
	}

	public Set<TemplateVariable> filterAllChildsOf(Set<TemplateVariable> templates) {
		return templates.stream().flatMap(t -> filterAllChildsOf(t).stream()).collect(toSet());
	}

	public Set<TemplateVariable> filterAllParentsOf(TemplateVariable template) {
		return scope.getTemplates().filter(parentsOf(template)).collect(toSet());
	}

	public Set<TemplateVariable> filterAllChildsOf(TemplateVariable template) {
		return scope.getTemplates().filter(childsOf(template)).collect(toSet());
	}

	private Predicate<TemplateVariable> parentsOf(TemplateVariable template) {
		return t -> filterDependenceRelations().stream().anyMatch(hasRelation(t, template));
	}

	private Predicate<TemplateVariable> childsOf(TemplateVariable template) {
		return t -> filterDependenceRelations().stream().anyMatch(hasRelation(template, t));
	}

	private Predicate<DependenceRelation> hasRelation(TemplateVariable source, TemplateVariable target) {
		return r -> r.getSource().getId().equals(source.getId()) && r.getTarget().getId().equals(target.getId());
	}

	public boolean relationExist(TemplateVariable source, TemplateVariable target) {
		return findRelation(source, target).isPresent();
	}

	public Set<TemplateVariable> filterChildless() {
		return scope.getTemplates().filter(variablesWithoutChild()).collect(toSet());
	}

	public Set<TemplateVariable> filterParentless() {
		return scope.getTemplates().filter(variablesWithoutParent()).collect(toSet());
	}

	private Predicate<TemplateVariable> variablesWithoutParent() {
		return t -> filterDependenceRelations().stream().noneMatch(r -> r.getTarget().getId().equals(t.getId()));
	}

	private Predicate<TemplateVariable> variablesWithoutChild() {
		return t -> filterDependenceRelations().stream().noneMatch(r -> r.getSource().getId().equals(t.getId()));
	}

	public Optional<DependenceRelation> findRelation(TemplateVariable source, TemplateVariable target) {
		return filterDependenceRelations().stream().filter(hasSource(source).and(hasTarget(target))).findFirst();
	}

	// Note, that the filtered dependency relations might be artificially added to
	// the scope and thus might be not included in the true relations.
	public Set<DependenceRelation> filterRelationsWithSource(Set<TemplateVariable> templates) {
		return filterDependenceRelations().stream().filter(withSource(templates)).collect(toSet());
	}

	// Note, that the filtered dependency relations might be artificially added to
	// the scope and thus might be not included in the true relations.
	public Set<DependenceRelation> filterRelationsWithTarget(Set<TemplateVariable> templates) {
		return filterDependenceRelations().stream().filter(withTarget(templates)).collect(toSet());
	}

	private Predicate<DependenceRelation> withSource(Set<TemplateVariable> templates) {
		return r -> templates.stream().anyMatch(t -> hasSource(t).test(r));
	}

	private Predicate<DependenceRelation> withTarget(Set<TemplateVariable> templates) {
		return r -> templates.stream().anyMatch(t -> hasTarget(t).test(r));
	}

	private Predicate<DependenceRelation> hasSource(TemplateVariable template) {
		return r -> areEqual(template, r.getSource());
	}

	private Predicate<DependenceRelation> hasTarget(TemplateVariable template) {
		return r -> areEqual(template, r.getTarget());
	}

	private Set<DependenceRelation> filterDependenceRelations() {
		return scope.getRelations().filter(DependenceRelation.class::isInstance).map(DependenceRelation.class::cast)
				.collect(toSet());
	}

	private Set<TemporalRelation> filterTemporalRelations() {
		return scope.getRelations().filter(TemporalRelation.class::isInstance).map(TemporalRelation.class::cast)
				.collect(toSet());
	}

	private Stream<TemplateFactor> getTemplateFactors() {
		if (this.definitions == null) {
			return Stream.empty();
		}
		return this.definitions.getFactors().stream();
	}

	private static Set<Relation> filterDependenceRelations(TemplateVariableDefinitions definitions) {
		if (definitions == null) {
			return Sets.newHashSet();
		}
		return definitions.getRelation().stream().filter(DependenceRelation.class::isInstance).collect(toSet());
	}
}
