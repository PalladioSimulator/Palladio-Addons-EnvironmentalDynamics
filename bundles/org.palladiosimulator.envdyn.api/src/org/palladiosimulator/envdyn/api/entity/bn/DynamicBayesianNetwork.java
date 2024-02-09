package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static org.palladiosimulator.envdyn.api.entity.bn.BayesianNetwork.getInputValue;
import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.contains;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.envdyn.api.entity.ProbabilisticModel;
import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork.Trajectory;
import org.palladiosimulator.envdyn.api.exception.EnvironmentalDynamicsException;
import org.palladiosimulator.envdyn.api.util.InductiveDynamicBehaviourQuerying;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import tools.mdsd.probdist.api.builder.ProbabilityDistributionBuilder;
import tools.mdsd.probdist.api.entity.Conditionable;
import tools.mdsd.probdist.api.entity.ConditionalProbabilityDistribution;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.Value;
import tools.mdsd.probdist.api.factory.IProbabilityDistributionFactory;
import tools.mdsd.probdist.distributionfunction.Domain;
import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;

public class DynamicBayesianNetwork<I extends Value<?>> extends ProbabilityDistributionFunction<Trajectory>
        implements ProbabilisticModel<Trajectory>, Conditionable<DynamicBayesianNetwork<I>> {

    private final static int SINGLE_TIME_SLICE = 0;

    public static class ConditionalInputValue extends Conditional {

        private final GroundRandomVariable variable;

        private ConditionalInputValue(Domain valueSpace, Value<?> value, GroundRandomVariable variable) {
            super(valueSpace, value);

            this.variable = variable;
        }

        public static ConditionalInputValue create(Conditional conditional, GroundRandomVariable variable) {
            return new ConditionalInputValue(conditional.getValueSpace(), conditional.getValue(), variable);
        }

        public GroundRandomVariable getGroundVariable() {
            return variable;
        }

    }

    public static class Trajectory {

        private final int trajLength;
        private final Map<Integer, List<InputValue>> samplePath;

        private Trajectory(int trajLength, Map<Integer, List<InputValue>> samplePath) {
            this.trajLength = trajLength;
            this.samplePath = samplePath;
        }

        public static Trajectory create(int timeSlices, List<List<InputValue>> samples) {
            if (timeSlices != samples.size() - 1) {
                throw new IllegalArgumentException("The number of time slices must match the input sequence size.");
            }

            Map<Integer, List<InputValue>> samplePath = Maps.newHashMap();
            for (int i = 0; i < timeSlices; i++) {
                samplePath.put(i, samples.get(i));
            }
            return new Trajectory(timeSlices, samplePath);
        }

        public static Trajectory create(int timeSlices) {
            Map<Integer, List<InputValue>> samplePath = Maps.newHashMap();
            for (int i = 0; i <= timeSlices; i++) {
                samplePath.put(i, Lists.newArrayList());
            }
            return new Trajectory(timeSlices, samplePath);
        }

        public List<InputValue> valueAtTime(int timeSlice) {
            if (Boolean.logicalOr(timeSlice > samplePath.size(), timeSlice < 0)) {
                throw new IllegalArgumentException("The time slice is not in the range of the trajectory.");
            }
            return samplePath.get(timeSlice);
        }

        public boolean inTimeRange(int timeSlice) {
            return timeSlice <= trajLength;
        }

        public void append(List<InputValue> samples) {
            if (maxTrajSizeNotReached()) {
                samplePath.put(calculateTimeSlice(), samples);
            }
            // TODO logging
        }

        private Integer calculateTimeSlice() {
            for (Integer each : samplePath.keySet()) {
                if (samplePath.get(each)
                    .isEmpty()) {
                    return each;
                }
            }

            throw new EnvironmentalDynamicsException("The max trajectory size is reached");
        }

        private boolean maxTrajSizeNotReached() {
            return samplePath.size() >= trajLength;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (int each : samplePath.keySet()) {
                String timeSlice = stringifyTimeSlice(each, samplePath.get(each));
                builder.append(timeSlice);
                builder.append("\n");
            }
            return builder.toString();
        }

        private String stringifyTimeSlice(int timeSlice, List<InputValue> values) {
            StringBuilder builder = new StringBuilder();
            for (InputValue each : values) {
                builder.append(String.format("(Variable: %1s, Value: %2s),", each.getVariable()
                    .getEntityName(),
                        each.getValue()
                            .toString()));
            }

            String stringValues = builder.toString();
            return String.format("Time slice: %d, samples: [%s])", timeSlice,
                    stringValues.substring(0, stringValues.length() - 1));
        }

    }

    private class TemporalProbabilityHandler extends ProbabilityDistributionHandler {

        private final IProbabilityDistributionFactory probabilityDistributionFactory;

        public TemporalProbabilityHandler(IProbabilityDistributionFactory probabilityDistributionFactory) {
            this.probabilityDistributionFactory = probabilityDistributionFactory;
        }

        @Override
        protected void initialize() {
            initialDistribution.getLocalProbabilisticNetworks()
                .forEach(this::createAndCache);
        }

        private void createAndCache(LocalProbabilisticNetwork localNetwork) {
            for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
                dynBehaviourQuery.findInductionExtending(each)
                    .ifPresent(i -> createAndCacheCPD(each, i.getDescriptiveModel()
                        .getDistributionFunction()));
            }
        }

        private void createAndCacheCPD(GroundRandomVariable variable, ProbabilityDistribution distribution) {
            ProbabilityDistributionFunction<?> pdf = ProbabilityDistributionBuilder
                .create(probabilityDistributionFactory)
                .withStructure(distribution)
                .asConditionalProbabilityDistribution()
                .build();
            cache(variable, pdf);
        }

        public ConditionalProbabilityDistribution getCPD(GroundRandomVariable variable) {
            return ConditionalProbabilityDistribution.class.cast(getPDF(variable));
        }

    }

    private final InductiveDynamicBehaviourQuerying dynBehaviourQuery;
    private final DynamicBehaviourExtension dynamics;
    private final BayesianNetwork<I> initialDistribution;
    private final TemporalProbabilityHandler probHandler;
    private final List<ConditionalInputValue> conditionals;

    public DynamicBayesianNetwork(ProbabilityDistributionSkeleton distSkeleton, BayesianNetwork<I> initialDistribution,
            DynamicBehaviourExtension dynamics, IProbabilityDistributionFactory probabilityDistributionFactory) {
        super(distSkeleton);

        this.dynamics = dynamics;
        this.dynBehaviourQuery = InductiveDynamicBehaviourQuerying.create(dynamics);
        this.initialDistribution = initialDistribution;
        this.probHandler = new TemporalProbabilityHandler(probabilityDistributionFactory);
        this.conditionals = Lists.newArrayList();
    }

    @Override
    public Double probability(Trajectory value) {
        return unrollForProbability(value);
    }

    @Override
    public Trajectory sample() {
        return unrollForSampling(SINGLE_TIME_SLICE);
    }

    @Override
    public Double infer(List<Trajectory> inputs) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    @Override
    public void learn(List<Trajectory> trainingData) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    @Override
    public DynamicBayesianNetwork<I> given(List<Conditional> conditionals) {
        checkValidity(conditionals);

        setConditionals(asConditionalInputValues(conditionals));

        return this;
    }

    public BayesianNetwork<I> getBayesianNetwork() {
        return initialDistribution;
    }

    public DynamicBehaviourExtension getDynamics() {
        return dynamics;
    }

    private void setConditionals(List<ConditionalInputValue> conditionals) {
        this.conditionals.clear();
        this.conditionals.addAll(conditionals);
    }

    public Double unrollForProbability(Trajectory traj) {
        double probability = 1;
        for (int timeSlice = 0; traj.inTimeRange(timeSlice); timeSlice++) {
            List<InputValue> current = traj.valueAtTime(timeSlice);
            if (timeSlice == 0) {
                probability *= calculateInitialProbability(current);
            } else {
                List<InputValue> last = traj.valueAtTime(timeSlice - 1);
                probability *= calculateProbability(current, last);
            }
        }
        return probability;
    }

    public Trajectory unrollForSampling(int timeSlices) {
        Trajectory samplePath = Trajectory.create(timeSlices);
        for (int i = 0; samplePath.inTimeRange(i); i++) {
            List<InputValue> sample = sampleNext();
            setConditionals(toConditionalInputs(sample));
            samplePath.append(sample);
        }
        return samplePath;
    }

    private double calculateInitialProbability(List<InputValue> inputs) {
        return initialDistribution.probability(inputs);
    }

    private double calculateProbability(List<InputValue> current, List<InputValue> last) {
        double probability = 1;
        for (InterTimeSliceInduction each : dynBehaviourQuery.getInterTimeSliceInductions()) {
            ConditionalProbabilityDistribution localCPD = probHandler.getCPD(each.getAppliedGroundVariable());

            List<Conditional> resolvedConditionals = resolveConditionals(each, toConditionalInputs(last));
            InputValue resolvedValue = getInputValue(each.getAppliedGroundVariable(), current);

            probability *= localCPD.given(resolvedConditionals)
                .probability(resolvedValue.asCategorical());
        }

        for (IntraTimeSliceInduction each : dynBehaviourQuery.getIntraTimeSliceInductions()) {
            ConditionalProbabilityDistribution localCPD = getCPDFromInitial(each, toConditionalInputs(current));

            InputValue resolvedValue = getInputValue(each.getAppliedGroundVariable(), current);

            probability *= localCPD.probability(resolvedValue.asCategorical());
        }
        return probability;
    }

    private List<InputValue> sampleNext() {
        if (conditionals.isEmpty()) {
            return initialDistribution.sample();
        }
        return sampleNextGiven(conditionals);
    }

    private List<InputValue> sampleNextGiven(List<ConditionalInputValue> conditionals) {
        List<InputValue> sample = Lists.newArrayList();
        for (InterTimeSliceInduction each : dynBehaviourQuery.getInterTimeSliceInductions()) {
            List<Conditional> resolved = resolveConditionals(each, conditionals);
            ConditionalProbabilityDistribution localCPD = probHandler.getCPD(each.getAppliedGroundVariable());
            sample.add(InputValue.create(localCPD.given(resolved)
                .sample(), each.getAppliedGroundVariable()));
        }

        for (IntraTimeSliceInduction each : dynBehaviourQuery.getIntraTimeSliceInductions()) {
            ConditionalProbabilityDistribution localCPD = getCPDFromInitial(each, conditionals);
            sample.add(InputValue.create(localCPD.sample(), each.getAppliedGroundVariable()));
        }

        return sample;
    }

    private ConditionalProbabilityDistribution getCPDFromInitial(IntraTimeSliceInduction induction,
            List<ConditionalInputValue> conditionals) {
        List<InputValue> history = toInputValues(conditionals);
        ProbabilityDistributionFunction<?> pdf = initialDistribution.getPDF(induction.getAppliedGroundVariable(),
                history);
        return ConditionalProbabilityDistribution.class.cast(pdf);
    }

    private List<Conditional> resolveConditionals(InterTimeSliceInduction induction,
            List<ConditionalInputValue> conditionals) {
        Set<TemplateVariable> interfaceVarParents = getInterfaceVariableParents(induction);

        List<ConditionalInputValue> resolved = Lists.newArrayList();
        for (ConditionalInputValue each : conditionals) {
            TemplateVariable instantiated = each.getGroundVariable()
                .getInstantiatedTemplate();
            if (contains(instantiated, interfaceVarParents)) {
                if (shareSameContext(induction.getAppliedGroundVariable(), each.getGroundVariable())) {
                    resolved.add(each);
                }
            }
        }
        return asConditionals(resolved);
    }

    private boolean shareSameContext(GroundRandomVariable parent, GroundRandomVariable child) {
        Set<EObject> parentContext = Sets.newHashSet(parent.getAppliedObjects());
        Set<EObject> childContext = Sets.newHashSet(child.getAppliedObjects());
        return Sets.intersection(parentContext, childContext)
            .size() > 0;
    }

    private Set<TemplateVariable> getInterfaceVariableParents(InterTimeSliceInduction induction) {
        return induction.getTemporalStructure()
            .stream()
            .map(InductiveDynamicBehaviourQuerying::getSource)
            .collect(toSet());
    }

    private void checkValidity(List<Conditional> conditionals) {
        if (conditionals.isEmpty()) {
            return;
        }

        if (conditionals.stream()
            .allMatch(ConditionalInputValue.class::isInstance) == false) {
            throw new IllegalArgumentException(
                    "The conditionals cannot applied in the dynamic bayesian network context.");
        }
    }

    public static List<ConditionalInputValue> asConditionalInputValues(List<Conditional> conditionals) {
        return conditionals.stream()
            .map(ConditionalInputValue.class::cast)
            .collect(toList());
    }

    public static List<Conditional> asConditionals(List<ConditionalInputValue> conditionals) {
        return conditionals.stream()
            .map(Conditional.class::cast)
            .collect(toList());
    }

    public static List<ConditionalInputValue> toConditionalInputs(List<InputValue> inputs) {
        return inputs.stream()
            .map(DynamicBayesianNetwork::toConditionalInput)
            .collect(toList());
    }

    public static ConditionalInputValue toConditionalInput(InputValue input) {
        return ConditionalInputValue.create(new Conditional(input.getValue()
            .getDomain(), input.getValue()), input.getVariable());
    }

    public static List<InputValue> toInputValues(List<ConditionalInputValue> conditionals) {
        return conditionals.stream()
            .map(DynamicBayesianNetwork::toInputValue)
            .collect(toList());
    }

    public static InputValue toInputValue(ConditionalInputValue conditional) {
        return InputValue.create(conditional.getValue(), conditional.getGroundVariable());
    }

}
