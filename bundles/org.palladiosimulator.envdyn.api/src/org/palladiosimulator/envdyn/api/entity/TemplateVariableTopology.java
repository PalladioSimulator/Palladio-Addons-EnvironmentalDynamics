package org.palladiosimulator.envdyn.api.entity;

import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.contains;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import com.google.common.collect.Maps;

public class TemplateVariableTopology {

	public class TopologyIterator implements Iterator<TemplateVariable> {

		private int levelCounter = 0;
		private int increment = 1;

		@Override
		public boolean hasNext() {
			return increment > 0 ? levelCounter != topologyLevels.size() : levelCounter < 0;
		}

		@Override
		public TemplateVariable next() {
			TemplateVariable next = topologyLevels.get(levelCounter);

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

	private final TemplateDefinitionsQuerying templateQuery;
	private final Map<Integer, TemplateVariable> topologyLevels;

	public TemplateVariableTopology(TemplateDefinitionsQuerying templateQuery) {
		this.templateQuery = templateQuery;
		this.topologyLevels = Maps.newHashMap();

		orderTopologically();
	}

	public TopologyIterator getTopologicallyOrderedTemplates() {
		return new TopologyIterator();
	}

	private void orderTopologically() {
		Set<TemplateVariable> templates = templateQuery.getTemplateVariables();
		int topologyDepth = templates.size();
		for (int i = 0; i < topologyDepth; i++) {
			TemplateVariable template = selectAnyWithOrderedParents(templates);
			
			addToTopology(i, template);
			
			templates.remove(template);
		}
	}

	private TemplateVariable selectAnyWithOrderedParents(Set<TemplateVariable> templates) {
		for (TemplateVariable any : templates) {
			Set<TemplateVariable> parents = templateQuery.filterAllParentsOf(any);
			if (inTopology(parents)) {
				return any;
			}
		}

		throw new EnvironmentalDynamicsException("The templates cannot be ordered topologically.");
	}

	private boolean inTopology(Set<TemplateVariable> parents) {
		if (parents.isEmpty()) {
			return true;
		}
		return parents.stream().allMatch(p -> contains(p, topologyLevels.values()));
	}

	private void addToTopology(Integer level, TemplateVariable template) {
		topologyLevels.put(level, template);
	}

}
