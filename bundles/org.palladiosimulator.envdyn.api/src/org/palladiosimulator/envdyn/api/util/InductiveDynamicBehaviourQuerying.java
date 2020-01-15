package org.palladiosimulator.envdyn.api.util;

import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.containsNot;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation;

import com.google.common.collect.Lists;

public class InductiveDynamicBehaviourQuerying {

	private final InductiveDynamicBehaviour dynamics;

	private InductiveDynamicBehaviourQuerying(InductiveDynamicBehaviour dynamics) {
		this.dynamics = dynamics;
	}

	private InductiveDynamicBehaviourQuerying(DynamicBehaviourExtension dynamics) {
		if (InductiveDynamicBehaviour.class.isInstance(dynamics.getBehaviour())) {
			this.dynamics = InductiveDynamicBehaviour.class.cast(dynamics.getBehaviour());
		} else {
			throw new EnvironmentalDynamicsException("Only inductive dynamic behaviour extensions are supported.");
		}
	}

	public static InductiveDynamicBehaviourQuerying create(DynamicBehaviourExtension dynamics) {
		return new InductiveDynamicBehaviourQuerying(dynamics);
	}

	public Set<InterTimeSliceInduction> getInterTimeSliceInductions() {
		return dynamics.getTimeSliceInductions().stream().filter(InterTimeSliceInduction.class::isInstance)
				.map(InterTimeSliceInduction.class::cast).collect(toSet());
	}

	public Set<IntraTimeSliceInduction> getIntraTimeSliceInductions() {
		return dynamics.getTimeSliceInductions().stream().filter(IntraTimeSliceInduction.class::isInstance)
				.map(IntraTimeSliceInduction.class::cast).collect(toSet());
	}

	public Set<TemplateVariable> filterInterfaceVariables() {
		return getTemporalRelations().stream().map(InductiveDynamicBehaviourQuerying::getSource).collect(toSet());
	}

	public static List<TemplateVariable> deriveScopeFrom(InterTimeSliceInduction induction) {
		List<TemplateVariable> result = Lists.newArrayList();
		for (TemporalRelation each : induction.getTemporalStructure()) {
			TemplateVariable candidate = getSource(each);
			if (containsNot(candidate, result)) {
				result.add(candidate);
			}

			candidate = getTarget(each);
			if (containsNot(candidate, result)) {
				result.add(candidate);
			}
		}
		return result;
	}

	public Optional<TimeSliceInduction> findInductionExtending(GroundRandomVariable variable) {
		return dynamics.getTimeSliceInductions().stream().filter(isExtensionOf(variable)).findFirst();
	}

	private Predicate<TimeSliceInduction> isExtensionOf(GroundRandomVariable variable) {
		return i -> i.getAppliedGroundVariable().getId().equals(variable.getId());
	}

	public static TemplateVariable getTarget(TemporalRelation relation) {
		if (PersistenceRelation.class.isInstance(relation)) {
			return PersistenceRelation.class.cast(relation).getInterfaceVariable();
		} else {
			return TimeSliceRelation.class.cast(relation).getTarget();
		}
	}

	public static TemplateVariable getSource(TemporalRelation relation) {
		if (PersistenceRelation.class.isInstance(relation)) {
			return PersistenceRelation.class.cast(relation).getInterfaceVariable();
		} else {
			return TimeSliceRelation.class.cast(relation).getSource();
		}
	}

	private Set<TemporalRelation> getTemporalRelations() {
		return dynamics.getTimeSliceInductions().stream().filter(InterTimeSliceInduction.class::isInstance)
				.map(InterTimeSliceInduction.class::cast).flatMap(each -> each.getTemporalStructure().stream())
				.collect(toSet());
	}

}
