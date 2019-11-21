package org.palladiosimulator.envdyn.api.util;

import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.Relation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

import com.google.common.collect.Sets;

public class TemplateDefinitionsFilter {

	private final TemplateVariableDefinitions definitions;

	private TemplateDefinitionsFilter(TemplateVariableDefinitions definitions) {
		this.definitions = definitions;
	}

	public static TemplateDefinitionsFilter get(TemplateVariableDefinitions definitions) {
		return new TemplateDefinitionsFilter(definitions);
	}

	public Set<DependenceRelation> filterAllDependenceRelations() {
		return getRelations().filter(DependenceRelation.class::isInstance).map(DependenceRelation.class::cast)
				.collect(toSet());
	}

	public Optional<TemplateFactor> findTemplateFactorWith(List<TemplateVariable> scope) {
		return getTemplateFactors().filter(withSameScope(scope)).findFirst();
	}

	private Predicate<TemplateFactor> withSameScope(List<TemplateVariable> scope) {
		return factor -> {
			if (scope.size() != factor.getScope().size()) {
				return false;
			}
			
			Set<String> givenScope = asIds(scope);
			Set<String> factorScope = asIds(factor.getScope());
			boolean result = Sets.difference(givenScope, factorScope).isEmpty();
			return result;
		};
	}

	private Set<String> asIds(List<TemplateVariable> templates) {
		Set<String> ids = Sets.newHashSet();
		for (TemplateVariable each : templates) {
			ids.add(each.getId());
		}
		return ids;
	}
	
	public Stream<TemplateFactor> getTemplateFactors() {
		return definitions.getFactors().stream();
	}

	public Stream<Relation> getRelations() {
		return definitions.getRelation().stream();
	}

	public Stream<TemplateVariable> getVariables() {
		return definitions.getVariables().stream();
	}

}
