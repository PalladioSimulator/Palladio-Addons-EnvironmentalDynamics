package org.palladiosimulator.envdyn.api.entity.bn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.envdyn.api.entity.ProbabilisticModel;
import org.palladiosimulator.envdyn.api.entity.TemplateVariableTopology;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork.InputValue;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateVariableFilter;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import tools.mdsd.probdist.api.builder.ProbabilityDistributionBuilder;
import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.ConditionalProbabilityDistribution;
import tools.mdsd.probdist.api.entity.ConditionalProbabilityDistribution.Conditional;
import tools.mdsd.probdist.api.entity.NumericalValue;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.UnivariateProbabilitiyMassFunction;
import tools.mdsd.probdist.api.entity.UnivariateProbabilityDensityFunction;
import tools.mdsd.probdist.api.entity.Value;
import tools.mdsd.probdist.model.probdist.distributionfunction.ProbabilityDistribution;
import tools.mdsd.probdist.model.probdist.distributiontype.ProbabilityDistributionSkeleton;
import tools.mdsd.probdist.model.probdist.distributiontype.ProbabilityDistributionType;

public class BayesianNetwork extends ProbabilityDistributionFunction<List<InputValue>>
		implements ProbabilisticModel<InputValue> {

	public static class InputValue {

		public final Value<?> value;
		public final GroundRandomVariable variable;

		private InputValue(Value<?> value, GroundRandomVariable variable) {
			this.value = value;
			this.variable = variable;
		}

		public static InputValue create(Value<?> value, GroundRandomVariable variable) {
			return new InputValue(value, variable);
		}

		public CategoricalValue asCategorical() throws ClassCastException {
			return (CategoricalValue) value;
		}

		public NumericalValue asNumerical() throws ClassCastException {
			return (NumericalValue) value;
		}

	}

	private static class LocalProbabilisticModelHandler {

		private final static LocalProbabilisticModelHandler handlerInstance = new LocalProbabilisticModelHandler();

		private final Map<GroundRandomVariable, ProbabilityDistributionFunction<?>> modelCache = new HashMap<>();

		private LocalProbabilisticModelHandler() {

		}

		public static LocalProbabilisticModelHandler get() {
			return handlerInstance;
		}

		public ProbabilityDistributionFunction<?> getLocalPD(GroundRandomVariable variable) {
			return queryCache(variable).orElse(createAndCachePD(variable));
		}

		public ConditionalProbabilityDistribution getLocalCPD(GroundRandomVariable variable) {
			return (ConditionalProbabilityDistribution) queryCache(variable).orElse(createAndCacheCPD(variable));
		}

		private Optional<ProbabilityDistributionFunction<?>> queryCache(GroundRandomVariable variable) {
			return Optional.ofNullable(modelCache.get(variable));
		}

		private ProbabilityDistributionFunction<?> createAndCachePD(GroundRandomVariable variable) {
			ProbabilityDistribution distribution = variable.getDescriptiveModel().getDistribution();
			ProbabilityDistributionFunction<?> pdf = ProbabilityDistributionBuilder.create().withStructure(distribution)
					.build();
			cache(variable, pdf);
			return pdf;
		}

		private ProbabilityDistributionFunction<?> createAndCacheCPD(GroundRandomVariable variable) {
			ProbabilityDistribution distribution = variable.getDescriptiveModel().getDistribution();
			ProbabilityDistributionFunction<?> pdf = ProbabilityDistributionBuilder.create().withStructure(distribution)
					.asConditionalProbabilityDistribution().build();
			cache(variable, pdf);
			return pdf;
		}

		private void cache(GroundRandomVariable variable, ProbabilityDistributionFunction<?> pdf) {
			modelCache.put(variable, pdf);
		}

	}

	private final GroundProbabilisticNetwork groundNetwork;
	private final TemplateVariableTopology templateTopology;
	private final TemplateVariableFilter variableFilter;

	public BayesianNetwork(ProbabilityDistributionSkeleton distSkeleton, GroundProbabilisticNetwork groundNetwork) {
		super(distSkeleton);

		this.groundNetwork = groundNetwork;
		this.variableFilter = TemplateVariableFilter.get(resolveAllTemplates(), resolveAllRelations());
		this.templateTopology = new TemplateVariableTopology(this.variableFilter);

		checkConsistency();
	}

	private void checkConsistency() {
		for (GroundRandomVariable each : groundNetwork.getGroundRandomVariables()) {
			if (allParentsInstantiated(each) == false) {
				throw new EnvironmentalDynamicsException(
						String.format("The parents of ground variable with template %s is not instantiated correctly.",
								each.getInstantiatedTemplate().getEntityName()));
			}
		}
	}

	private boolean allParentsInstantiated(GroundRandomVariable variable) {
		Set<TemplateVariable> parents = variableFilter.filterAllParentsOf(variable.getInstantiatedTemplate());
		if (parents.isEmpty()) {
			return true;
		}

		List<GroundRandomVariable> instantiatedParents = filterAllGroundVaribales(
				v -> parents.contains(v.getInstantiatedTemplate()));
		instantiatedParents.removeIf(appliedObjectsAreSubsetOf(variable.getAppliedObjects()));
		return instantiatedParents.isEmpty() == false
				&& instantiatedParents.size() <= variable.getAppliedObjects().size();
	}

	private Predicate<GroundRandomVariable> appliedObjectsAreSubsetOf(List<EObject> appliedObjects) {
		return v -> appliedObjects.containsAll(v.getAppliedObjects());
	}

	private List<GroundRandomVariable> filterAllGroundVaribales(Predicate<GroundRandomVariable> criteria) {
		return getGroundVariables().stream().filter(criteria).collect(Collectors.toList());
	}

	// TODO Input specification has to be reconsidered
	@Override
	public Double probability(List<InputValue> value) {
		checkValidity(value);

		var result = 1.0;
		for (GroundRandomVariable each : getTopologicallyOrderedGroundVariables()) {
			result *= calculateLocalProbability(each, value);
		}
		return result;
	}

	@Override
	public List<InputValue> sample() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	@Override
	public Double infer(List<InputValue> inputs) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	private List<GroundRandomVariable> getTopologicallyOrderedGroundVariables() {
		List<GroundRandomVariable> topologicallyOrdered = new ArrayList<>();
		templateTopology.getTopologicallyOrderedTemplates()
				.forEachRemaining((templates) -> topologicallyOrdered.addAll(filterAllGroundVariables(templates)));
		return topologicallyOrdered;
	}

	private List<GroundRandomVariable> filterAllGroundVariables(Set<TemplateVariable> templates) {
		return getGroundVariables().stream().filter(v -> templates.contains(v.getInstantiatedTemplate()))
				.collect(Collectors.toList());
	}

	private double calculateLocalProbability(GroundRandomVariable variable, List<InputValue> inputs) {
		ProbabilityDistributionFunction<?> pdf;
		if (isParentless(variable)) {
			pdf = LocalProbabilisticModelHandler.get().getLocalPD(variable);
		} else {
			pdf = LocalProbabilisticModelHandler.get().getLocalCPD(variable)
					.given(resolveConditionals(variable, inputs));
		}

		return calculateLocalProbability(pdf, getInputValue(variable, inputs));
	}

	private List<Conditional> resolveConditionals(GroundRandomVariable variable, List<InputValue> inputs) {
		// TODO this has to be addressed differently
		return null;
	}

	private double calculateLocalProbability(ProbabilityDistributionFunction<?> pdf, InputValue inputValue) {
		try {
			ProbabilityDistributionSkeleton skeleton = pdf.getDistributionSkeleton();
			if (skeleton.getType() == ProbabilityDistributionType.DISCRETE) {
				return UnivariateProbabilitiyMassFunction.class.cast(pdf).probability(inputValue.asCategorical());
			}
			return UnivariateProbabilityDensityFunction.class.cast(pdf).probability(inputValue.asNumerical());
		} catch (ClassCastException e) {
			throw new EnvironmentalDynamicsException("The distributions input space do not match.", e);
		}

	}

	private boolean isParentless(GroundRandomVariable variable) {
		return variableFilter.filterAllParentsOf(variable.getInstantiatedTemplate()).isEmpty();
	}

	private InputValue getInputValue(GroundRandomVariable variable, List<InputValue> inputs) {
		return inputs.stream().filter(input -> input.variable == variable).findFirst()
				.orElseThrow(() -> new IllegalArgumentException(
						String.format("The network does not contain the ground random variable for template %s",
								variable.getInstantiatedTemplate().getEntityName())));
	}

	@Override
	public void learn(List<InputValue> trainingData) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public List<GroundRandomVariable> getGroundVariables() {
		return groundNetwork.getGroundRandomVariables();
	}

	// Assuming no random variable needs to be marginalized
	private void checkValidity(List<InputValue> inputs) {
		if (getGroundVariables().size() != inputs.size()) {
			throw new IllegalArgumentException("The input size does not match the size network variables.");
		}

		for (InputValue each : inputs) {
			if (getGroundVariables().contains(each.variable) == false) {
				throw new IllegalArgumentException(
						String.format("The network does not contain the ground random variable for template %s",
								each.variable.getInstantiatedTemplate().getEntityName()));
			}
		}
	}

	private Set<DependenceRelation> resolveAllRelations() {
		return getGroundVariables().stream().flatMap(v -> v.getDependenceStructure().stream()).distinct()
				.collect(Collectors.toSet());
	}

	private Set<TemplateVariable> resolveAllTemplates() {
		return getGroundVariables().stream().map(GroundRandomVariable::getInstantiatedTemplate).distinct()
				.collect(Collectors.toSet());
	}

}
