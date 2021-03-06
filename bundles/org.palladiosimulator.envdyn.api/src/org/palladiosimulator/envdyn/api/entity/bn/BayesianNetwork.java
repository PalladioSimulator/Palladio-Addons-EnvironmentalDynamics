package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.areEqual;

import java.util.List;
import java.util.Set;

import org.palladiosimulator.envdyn.api.entity.ProbabilisticModel;
import org.palladiosimulator.envdyn.api.entity.TemplateVariableTopology;
import org.palladiosimulator.envdyn.api.entity.TemplateVariableTopology.TopologyIterator;
import org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork.InputValue;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import com.google.common.collect.Lists;

import tools.mdsd.probdist.api.builder.ProbabilityDistributionBuilder;
import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.Conditionable.Conditional;
import tools.mdsd.probdist.api.entity.ConditionalProbabilityDistribution;
import tools.mdsd.probdist.api.entity.NumericalValue;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.UnivariateProbabilitiyMassFunction;
import tools.mdsd.probdist.api.entity.UnivariateProbabilityDensityFunction;
import tools.mdsd.probdist.api.entity.Value;
import tools.mdsd.probdist.distributionfunction.Domain;
import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionType;

public class BayesianNetwork extends ProbabilityDistributionFunction<List<InputValue>>
		implements ProbabilisticModel<InputValue> {

	public static class InputValue {

		public Value<?> value;
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

	private class LocalProbabilisticModelHandler extends ProbabilityDistributionHandler {

		@Override
		protected void initialize() {
			getLocalProbabilisticNetworks().forEach(this::createAndCache);
		}
		
		private void createAndCache(LocalProbabilisticNetwork localNetwork) {
			TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
					.withTemplateScope(getTemplates(localNetwork));
			for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
				if (defQuery.filterAllParentsOf(each.getInstantiatedTemplate()).isEmpty()) {
					createAndCachePD(each);
				} else {
					createAndCacheCPD(each);
				}
			}
		}
		
		private void createAndCachePD(GroundRandomVariable variable) {
			ProbabilityDistribution distribution = variable.getDescriptiveModel().getDistribution();
			ProbabilityDistributionFunction<?> pdf = ProbabilityDistributionBuilder.create().withStructure(distribution)
					.build();
			cache(variable, pdf);
		}

		private void createAndCacheCPD(GroundRandomVariable variable) {
			ProbabilityDistribution distribution = variable.getDescriptiveModel().getDistribution();
			ProbabilityDistributionFunction<?> pdf = ProbabilityDistributionBuilder.create().withStructure(distribution)
					.asConditionalProbabilityDistribution().build();
			cache(variable, pdf);
		}

	}

	private final GroundProbabilisticNetwork groundNetwork;
	private final LocalProbabilisticModelHandler probModelHandler;

	public BayesianNetwork(ProbabilityDistributionSkeleton distSkeleton, GroundProbabilisticNetwork groundNetwork) {
		super(distSkeleton);

		this.groundNetwork = groundNetwork;
		this.probModelHandler = new LocalProbabilisticModelHandler();

		checkConsistency();
	}

	private void checkConsistency() {
		groundNetwork.getLocalProbabilisticModels().forEach(this::allParentsInstantiated);
	}

	private void allParentsInstantiated(LocalProbabilisticNetwork localNetwork) {
		for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
			if (allParentsInstantiated(each, localNetwork) == false) {
				throw new EnvironmentalDynamicsException(
						String.format("The parents of ground variable with template %s is not instantiated correctly.",
								each.getInstantiatedTemplate().getEntityName()));
			}
		}
	}

	private boolean allParentsInstantiated(GroundRandomVariable variable, LocalProbabilisticNetwork localNetwork) {
		TemplateDefinitionsQuerying templateQuery = TemplateDefinitionsQuerying
				.withTemplateScope(getTemplates(localNetwork));

		TemplateVariable templateToCheck = variable.getInstantiatedTemplate();
		Set<TemplateVariable> parents = templateQuery.filterAllParentsOf(templateToCheck);
		if (parents.isEmpty()) {
			return true;
		}

		for (TemplateVariable eachParent : parents) {
			List<GroundRandomVariable> instantiated = filterGroundVariablesInstantiating(eachParent, localNetwork);
			if (instantiated.isEmpty()) {
				DependenceRelation relation = templateQuery.findRelation(eachParent, templateToCheck).get();
				if (relation.isContingent() == false) {
					return false;
				}
			}
		}
		return true;
	}

	private List<GroundRandomVariable> filterGroundVariablesInstantiating(TemplateVariable template,
			LocalProbabilisticNetwork localNetwork) {
		return localNetwork.getGroundRandomVariables().stream()
				.filter(v -> areEqual(template, v.getInstantiatedTemplate())).collect(toList());
	}

	private List<GroundRandomVariable> filterGroundVariablesInstantiating(Set<TemplateVariable> templates,
			LocalProbabilisticNetwork localNetwork) {
		return templates.stream().flatMap(t -> filterGroundVariablesInstantiating(t, localNetwork).stream())
				.collect(toList());
	}

	@Override
	public Double probability(List<InputValue> inputs) {
		checkValidity(inputs);

		return calculateProability(inputs);
	}

	@Override
	public List<InputValue> sample() {
		return sampleNext();
	}

	@Override
	public Double infer(List<InputValue> inputs) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	@Override
	public void learn(List<InputValue> trainingData) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
	
	public static Set<TemplateVariable> getTemplates(LocalProbabilisticNetwork localNetwork) {
		return localNetwork.getGroundRandomVariables().stream().map(GroundRandomVariable::getInstantiatedTemplate)
				.distinct().collect(toSet());
	}

	public GroundProbabilisticNetwork get() {
		return groundNetwork;
	}
	
	public List<LocalProbabilisticNetwork> getLocalProbabilisticNetworks() {
		return groundNetwork.getLocalProbabilisticModels();
	}
	
	public List<GroundRandomVariable> getGroundVariables() {
		return groundNetwork.getLocalProbabilisticModels().stream().flatMap(v -> v.getGroundRandomVariables().stream())
				.collect(toList());
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

	private double calculateProability(List<InputValue> inputs) {
		double probability = 1;
		for (LocalProbabilisticNetwork eachLocal : groundNetwork.getLocalProbabilisticModels()) {
			for (GroundRandomVariable eachVariable : orderGroundVariablesTopologically(eachLocal)) {
				InputValue input = getInputValue(eachVariable, inputs);
				probability *= calculateLocalProbability(getPDF(eachVariable, inputs), input);
			}
		}
		return probability;
	}

	private double calculateLocalProbability(ProbabilityDistributionFunction<?> pdf, InputValue inputValue) {
		try {
			ProbabilityDistributionSkeleton skeleton = pdf.getDistributionSkeleton();
			if (skeleton.getType() == ProbabilityDistributionType.DISCRETE) {
				return calculateLocalProbability(pdf, inputValue.asCategorical());
			}
			return UnivariateProbabilityDensityFunction.class.cast(pdf).probability(inputValue.asNumerical());
		} catch (ClassCastException e) {
			throw new EnvironmentalDynamicsException("The distributions input space do not match.", e);
		}

	}

	private double calculateLocalProbability(ProbabilityDistributionFunction<?> pdf, CategoricalValue value) {
		if (UnivariateProbabilitiyMassFunction.class.isInstance(pdf)) {
			return UnivariateProbabilitiyMassFunction.class.cast(pdf).probability(value);
		}
		return ConditionalProbabilityDistribution.class.cast(pdf).probability(value);
	}

	private List<InputValue> sampleNext() {
		List<InputValue> samples = Lists.newArrayList();
		for (LocalProbabilisticNetwork eachLocal : groundNetwork.getLocalProbabilisticModels()) {
			for (GroundRandomVariable eachVariable : orderGroundVariablesTopologically(eachLocal)) {
				Value<?> value = (Value<?>) getPDF(eachVariable, samples).sample();
				samples.add(InputValue.create(value, eachVariable));
			}
		}
		return samples;
	}

	private List<GroundRandomVariable> orderGroundVariablesTopologically(LocalProbabilisticNetwork localNetwork) {
		List<GroundRandomVariable> topologicallyOrdered = Lists.newArrayList();

		TopologyIterator iterator = getTopologyIterator(localNetwork);
		while (iterator.hasNext()) {
			topologicallyOrdered.addAll(filterGroundVariablesInstantiating(iterator.next(), localNetwork));
		}

		return topologicallyOrdered;
	}

	private TopologyIterator getTopologyIterator(LocalProbabilisticNetwork localNetwork) {
		TemplateDefinitionsQuerying templateQuery = TemplateDefinitionsQuerying
				.withTemplateScope(getTemplates(localNetwork));
		return new TemplateVariableTopology(templateQuery).topologicallyOrderedTemplates();
	}

	protected ProbabilityDistributionFunction<?> getPDF(GroundRandomVariable variable, List<InputValue> history) {
		ProbabilityDistributionFunction<?> pdf = probModelHandler.getPDF(variable);
		if (ConditionalProbabilityDistribution.class.isInstance(pdf)) {
			ConditionalProbabilityDistribution.class.cast(pdf).given(resolveConditionals(variable, history));
		}
		return pdf;
	}

	private List<Conditional> resolveConditionals(GroundRandomVariable variable, List<InputValue> history) {
		LocalProbabilisticNetwork localNetwork = (LocalProbabilisticNetwork) variable.eContainer();
		TemplateDefinitionsQuerying templateQuery = TemplateDefinitionsQuerying
				.withTemplateScope(getTemplates(localNetwork));

		List<GroundRandomVariable> instantiatedParents = filterGroundVariablesInstantiating(
				templateQuery.filterAllParentsOf(variable.getInstantiatedTemplate()), localNetwork);
		return instantiatedParents.stream().map(each -> getInputValue(each, history)).map(this::toConditional)
				.collect(toList());
	}

	private Conditional toConditional(InputValue value) {
		return new Conditional(getDomain(value), value.value);
	}

	private Domain getDomain(InputValue input) {
		if (NumericalValue.class.isInstance(input.value)) {
			return NumericalValue.class.cast(input.value).getDomain();
		} else {
			return CategoricalValue.class.cast(input.value).getDomain();
		}
	}

	protected static InputValue getInputValue(GroundRandomVariable variable, List<InputValue> inputs) {
		return inputs.stream().filter(input -> input.variable.getId().equals(variable.getId())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException(
						String.format("The network does not contain the ground random variable for template %s",
								variable.getInstantiatedTemplate().getEntityName())));
	}

}
