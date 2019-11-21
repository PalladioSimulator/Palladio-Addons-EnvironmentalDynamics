package org.palladiosimulator.envdyn.api.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateVariableFilter;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

public class TemplateVariableTopology {

	public class TopologyIterator implements Iterator<Set<TemplateVariable>> {

		private int levelCounter = 0;
		private int increment = 1;

		@Override
		public boolean hasNext() {
			return increment > 0 ? levelCounter == (topologyLevels.size() - 1) : levelCounter < 0;
		}

		@Override
		public Set<TemplateVariable> next() {
			Set<TemplateVariable> next = topologyLevels.get(levelCounter);

			incrementCounter();

			return next;
		}

		public void reverse() {
			if (levelCounter != 0) {
				throw new EnvironmentalDynamicsException("This method has to be executed before traversing.");
			}

			levelCounter = topologyLevels.size() - 1;
			increment = -1;
		}

		private void incrementCounter() {
			levelCounter += increment;
		}

	}

	private final List<Set<TemplateVariable>> topologyLevels = new ArrayList<>();
	private final TemplateVariableFilter variableFilter;

	public TemplateVariableTopology(TemplateVariableFilter variableFilter) {
		this.variableFilter = variableFilter;

		orderTopologically();
	}

	public TopologyIterator getTopologicallyOrderedTemplates() {
		return new TopologyIterator();
	}

	private void orderTopologically() {
		boolean stillTemplatesToOrder = true;
		while (stillTemplatesToOrder) {
			Set<TemplateVariable> level;
			if (topologyLevels.isEmpty()) {
				level = variableFilter.filterParentless();
			} else {
				level = filterNextTopologicalStage();
			}

			if (level.isEmpty()) {
				stillTemplatesToOrder = false;
			} else {
				addTopologyLevel(level);
			}
		}
	}

	private Set<TemplateVariable> filterNextTopologicalStage() {
		Set<TemplateVariable> lastStage = topologyLevels.get(topologyLevels.size());
		Set<TemplateVariable> candidates = variableFilter.filterAllChildsOf(lastStage);
		Set<DependenceRelation> relations = variableFilter.filterRelationsWithSource(candidates);
		
		candidates.removeIf(isTargetIn(relations));
		
		return candidates;
	}

	private Predicate<TemplateVariable> isTargetIn(Set<DependenceRelation> relations) {
		return t -> relations.stream().anyMatch(r -> r.getTarget().getId().equals(t.getId()));
	}

	private void addTopologyLevel(Set<TemplateVariable> level) {
		topologyLevels.add(level);
	}

}
