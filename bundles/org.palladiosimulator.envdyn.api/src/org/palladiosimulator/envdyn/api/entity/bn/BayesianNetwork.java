package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.areEqual;

import java.util.List;
import java.util.Set;

import org.palladiosimulator.envdyn.api.entity.ProbabilisticModel;
import org.palladiosimulator.envdyn.api.entity.TemplateVariableTopology;
import org.palladiosimulator.envdyn.api.entity.TemplateVariableTopology.TopologyIterator;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import com.google.common.collect.Lists;

import tools.mdsd.probdist.api.builder.ProbabilityDistributionBuilder;
import tools.mdsd.probdist.api.entity.Conditionable.Conditional;
import tools.mdsd.probdist.api.entity.ConditionableProbabilityDistribution;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.Value;
import tools.mdsd.probdist.api.factory.IProbabilityDistributionFactory;
import tools.mdsd.probdist.api.factory.ProbabilityCalculator;
import tools.mdsd.probdist.distributionfunction.Domain;
import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;

public class BayesianNetwork<I extends Value<?>> extends ProbabilityDistributionFunction<List<InputValue<I>>>
        implements ProbabilisticModel<InputValue<I>> {

    private class LocalProbabilisticModelHandler extends ProbabilityDistributionHandler<I> {
        private final IProbabilityDistributionFactory<I> probabilityDistributionFactory;

        public LocalProbabilisticModelHandler(IProbabilityDistributionFactory<I> probabilityDistributionFactory) {
            this.probabilityDistributionFactory = probabilityDistributionFactory;
        }

        @Override
        protected void initialize() {
            getLocalProbabilisticNetworks().forEach(this::createAndCache);
        }

        private void createAndCache(LocalProbabilisticNetwork localNetwork) {
            TemplateDefinitionsQuerying defQuery = TemplateDefinitionsQuerying
                .withTemplateScope(getTemplates(localNetwork));
            for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
                if (defQuery.filterAllParentsOf(each.getInstantiatedTemplate())
                    .isEmpty()) {
                    createAndCachePD(each);
                } else {
                    createAndCacheCPD(each);
                }
            }
        }

        private void createAndCachePD(GroundRandomVariable variable) {
            ProbabilityDistribution distribution = variable.getDescriptiveModel()
                .getDistribution();
            ProbabilityDistributionBuilder<I> probabilityDistributionBuilder = probabilityDistributionFactory
                .getProbabilityDistributionBuilder();
            ProbabilityDistributionFunction<I> pdf = probabilityDistributionBuilder.withStructure(distribution)
                .build();
            cache(variable, pdf);
        }

        private void createAndCacheCPD(GroundRandomVariable variable) {
            ProbabilityDistribution distribution = variable.getDescriptiveModel()
                .getDistribution();
            ProbabilityDistributionBuilder<I> probabilityDistributionBuilder = probabilityDistributionFactory
                .getProbabilityDistributionBuilder();
            ProbabilityDistributionFunction<I> pdf = probabilityDistributionBuilder.withStructure(distribution)
                .asConditionalProbabilityDistribution()
                .build();
            cache(variable, pdf);
        }

    }

    private final GroundProbabilisticNetwork groundNetwork;
    private final LocalProbabilisticModelHandler probModelHandler;
    private final ProbabilityCalculator<I> probabilityCalculator;
    private final ConditionalInputValueUtil<I> conditionalInputValueUtil = new ConditionalInputValueUtil<>();

    public BayesianNetwork(ProbabilityDistributionSkeleton distSkeleton, GroundProbabilisticNetwork groundNetwork,
            IProbabilityDistributionFactory<I> probabilityDistributionFactory) {
        super(distSkeleton);

        this.groundNetwork = groundNetwork;
        this.probModelHandler = new LocalProbabilisticModelHandler(probabilityDistributionFactory);
        this.probabilityCalculator = probabilityDistributionFactory.getProbabilityCalculator();

        checkConsistency();
    }

    private void checkConsistency() {
        groundNetwork.getLocalProbabilisticModels()
            .forEach(this::allParentsInstantiated);
    }

    private void allParentsInstantiated(LocalProbabilisticNetwork localNetwork) {
        for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
            if (allParentsInstantiated(each, localNetwork) == false) {
                throw new EnvironmentalDynamicsException(
                        String.format("The parents of ground variable with template %s is not instantiated correctly.",
                                each.getInstantiatedTemplate()
                                    .getEntityName()));
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
                DependenceRelation relation = templateQuery.findRelation(eachParent, templateToCheck)
                    .get();
                if (relation.isContingent() == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<GroundRandomVariable> filterGroundVariablesInstantiating(TemplateVariable template,
            LocalProbabilisticNetwork localNetwork) {
        return localNetwork.getGroundRandomVariables()
            .stream()
            .filter(v -> areEqual(template, v.getInstantiatedTemplate()))
            .collect(toList());
    }

    private List<GroundRandomVariable> filterGroundVariablesInstantiating(Set<TemplateVariable> templates,
            LocalProbabilisticNetwork localNetwork) {
        return templates.stream()
            .flatMap(t -> filterGroundVariablesInstantiating(t, localNetwork).stream())
            .collect(toList());
    }

    @Override
    public Double probability(List<InputValue<I>> inputs) {
        checkValidity(inputs);

        return calculateProability(inputs);
    }

    @Override
    public List<InputValue<I>> sample() {
        return sampleNext();
    }

    @Override
    public Double infer(List<InputValue<I>> inputs) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    @Override
    public void learn(List<InputValue<I>> trainingData) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    public static Set<TemplateVariable> getTemplates(LocalProbabilisticNetwork localNetwork) {
        return localNetwork.getGroundRandomVariables()
            .stream()
            .map(GroundRandomVariable::getInstantiatedTemplate)
            .distinct()
            .collect(toSet());
    }

    public GroundProbabilisticNetwork get() {
        return groundNetwork;
    }

    public List<LocalProbabilisticNetwork> getLocalProbabilisticNetworks() {
        return groundNetwork.getLocalProbabilisticModels();
    }

    public List<GroundRandomVariable> getGroundVariables() {
        return groundNetwork.getLocalProbabilisticModels()
            .stream()
            .flatMap(v -> v.getGroundRandomVariables()
                .stream())
            .collect(toList());
    }

    // Assuming no random variable needs to be marginalized
    private void checkValidity(List<InputValue<I>> inputs) {
        if (getGroundVariables().size() != inputs.size()) {
            throw new IllegalArgumentException("The input size does not match the size network variables.");
        }

        for (InputValue<I> each : inputs) {
            if (getGroundVariables().contains(each.getVariable()) == false) {
                throw new IllegalArgumentException(
                        String.format("The network does not contain the ground random variable for template %s",
                                each.getVariable()
                                    .getInstantiatedTemplate()
                                    .getEntityName()));
            }
        }
    }

    private double calculateProability(List<InputValue<I>> inputs) {
        double probability = 1;
        for (LocalProbabilisticNetwork eachLocal : groundNetwork.getLocalProbabilisticModels()) {
            for (GroundRandomVariable eachVariable : orderGroundVariablesTopologically(eachLocal)) {
                InputValue<I> input = conditionalInputValueUtil.getInputValue(eachVariable, inputs);
                ProbabilityDistributionFunction<I> pdf = getPDF(eachVariable, inputs);
                I value = input.getValue();
                probability *= probabilityCalculator.calculateLocalProbability(pdf, value);
            }
        }
        return probability;
    }

    private List<InputValue<I>> sampleNext() {
        List<InputValue<I>> samples = Lists.newArrayList();
        for (LocalProbabilisticNetwork eachLocal : groundNetwork.getLocalProbabilisticModels()) {
            for (GroundRandomVariable eachVariable : orderGroundVariablesTopologically(eachLocal)) {
                ProbabilityDistributionFunction<I> pdf = getPDF(eachVariable, samples);
                I value = pdf.sample();
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

    protected ProbabilityDistributionFunction<I> getPDF(GroundRandomVariable variable, List<InputValue<I>> history) {
        ProbabilityDistributionFunction<I> pdf = probModelHandler.getPDF(variable);
        if (pdf instanceof ConditionableProbabilityDistribution) {
            ConditionableProbabilityDistribution<I> conditionableProbabilityDistribution = (ConditionableProbabilityDistribution<I>) pdf;
            List<Conditional<I>> conditionals = resolveConditionals(variable, history);
            conditionableProbabilityDistribution.given(conditionals);
        }
        return pdf;
    }

    private List<Conditional<I>> resolveConditionals(GroundRandomVariable variable, List<InputValue<I>> history) {
        LocalProbabilisticNetwork localNetwork = (LocalProbabilisticNetwork) variable.eContainer();
        TemplateDefinitionsQuerying templateQuery = TemplateDefinitionsQuerying
            .withTemplateScope(getTemplates(localNetwork));

        List<GroundRandomVariable> instantiatedParents = filterGroundVariablesInstantiating(
                templateQuery.filterAllParentsOf(variable.getInstantiatedTemplate()), localNetwork);
        return instantiatedParents.stream()
            .map(each -> conditionalInputValueUtil.getInputValue(each, history))
            .map(this::toConditional)
            .collect(toList());
    }

    private Conditional<I> toConditional(InputValue<I> value) {
        return new Conditional<>(getDomain(value), value.getValue());
    }

    private Domain getDomain(InputValue<I> input) {
        return input.getValue()
            .getDomain();
    }
}
