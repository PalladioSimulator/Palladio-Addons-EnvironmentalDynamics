package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;
import static org.palladiosimulator.envdyn.api.util.TemplateDefinitionsQuerying.contains;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
import tools.mdsd.probdist.api.entity.ConditionableProbabilityDistribution;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.Value;
import tools.mdsd.probdist.api.factory.IProbabilityDistributionFactory;
import tools.mdsd.probdist.distributionfunction.Domain;
import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;
import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;

public class DynamicBayesianNetwork<I extends Value<?>> extends ProbabilityDistributionFunction<Trajectory<I>>
        implements ProbabilisticModel<Trajectory<I>>, Conditionable<I> {

    private final static int SINGLE_TIME_SLICE = 0;

    public static class ConditionalInputValue<I extends Value<?>> extends Conditional<I> {

        private final GroundRandomVariable variable;

        private ConditionalInputValue(Domain valueSpace, I value, GroundRandomVariable variable) {
            super(valueSpace, value);

            this.variable = variable;
        }

        public static <I extends Value<?>> ConditionalInputValue<I> create(Conditional<I> conditional,
                GroundRandomVariable variable) {
            return new ConditionalInputValue<>(conditional.getValueSpace(), conditional.getValue(), variable);
        }

        public GroundRandomVariable getGroundVariable() {
            return variable;
        }

    }

    public static class Trajectory<I extends Value<?>> {

        private final int trajLength;
        private final Map<Integer, List<InputValue<I>>> samplePath;

        private Trajectory(int trajLength, Map<Integer, List<InputValue<I>>> samplePath) {
            this.trajLength = trajLength;
            this.samplePath = samplePath;
        }

        public static <I extends Value<?>> Trajectory<I> create(int timeSlices, List<List<InputValue<I>>> samples) {
            if (timeSlices != samples.size() - 1) {
                throw new IllegalArgumentException("The number of time slices must match the input sequence size.");
            }

            Map<Integer, List<InputValue<I>>> samplePath = Maps.newHashMap();
            for (int i = 0; i < timeSlices; i++) {
                samplePath.put(i, samples.get(i));
            }
            return new Trajectory<>(timeSlices, samplePath);
        }

        public static <I extends Value<?>> Trajectory<I> create(int timeSlices) {
            Map<Integer, List<InputValue<I>>> samplePath = Maps.newHashMap();
            for (int i = 0; i <= timeSlices; i++) {
                samplePath.put(i, Lists.newArrayList());
            }
            return new Trajectory<>(timeSlices, samplePath);
        }

        public List<InputValue<I>> valueAtTime(int timeSlice) {
            if (Boolean.logicalOr(timeSlice > samplePath.size(), timeSlice < 0)) {
                throw new IllegalArgumentException("The time slice is not in the range of the trajectory.");
            }
            return samplePath.get(timeSlice);
        }

        public boolean inTimeRange(int timeSlice) {
            return timeSlice <= trajLength;
        }

        public void append(List<InputValue<I>> samples) {
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

        private String stringifyTimeSlice(int timeSlice, List<InputValue<I>> values) {
            StringBuilder builder = new StringBuilder();
            for (InputValue<I> each : values) {
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

    private class TemporalProbabilityHandler extends ProbabilityDistributionHandler<I> {

        private final IProbabilityDistributionFactory<I> probabilityDistributionFactory;

        public TemporalProbabilityHandler(IProbabilityDistributionFactory<I> probabilityDistributionFactory) {
            this.probabilityDistributionFactory = probabilityDistributionFactory;
        }

        @Override
        protected void initialize() {
            List<LocalProbabilisticNetwork> localProbabilisticNetworks = initialDistribution
                .getLocalProbabilisticNetworks();
            localProbabilisticNetworks.forEach(this::createAndCache);
        }

        private void createAndCache(LocalProbabilisticNetwork localNetwork) {
            for (GroundRandomVariable each : localNetwork.getGroundRandomVariables()) {
                dynBehaviourQuery.findInductionExtending(each)
                    .ifPresent(i -> createAndCacheCPD(each, i.getDescriptiveModel()
                        .getDistributionFunction()));
            }
        }

        private void createAndCacheCPD(GroundRandomVariable variable, ProbabilityDistribution distribution) {
            ProbabilityDistributionBuilder<I> probabilityDistributionBuilder = probabilityDistributionFactory
                .getProbabilityDistributionBuilder();
            ProbabilityDistributionFunction<I> pdf = probabilityDistributionBuilder.withStructure(distribution)
                .asConditionalProbabilityDistribution()
                .build();
            cache(variable, pdf);
        }

        public ConditionableProbabilityDistribution<I> getCPD(GroundRandomVariable variable) {
            return (ConditionableProbabilityDistribution<I>) getPDF(variable);
        }

    }

    private final InductiveDynamicBehaviourQuerying dynBehaviourQuery;
    private final DynamicBehaviourExtension dynamics;
    private final BayesianNetwork<I> initialDistribution;
    private final TemporalProbabilityHandler probHandler;
    private final List<ConditionalInputValue<I>> conditionals;
    private final ConditionalInputValueUtil<I> conditionalInputValueUtil = new ConditionalInputValueUtil<>();
    private final SamplerLogger samplerLogger;

    public DynamicBayesianNetwork(ProbabilityDistributionSkeleton distSkeleton, BayesianNetwork<I> initialDistribution,
            DynamicBehaviourExtension dynamics, IProbabilityDistributionFactory<I> probabilityDistributionFactory) {
        super(distSkeleton);

        this.dynamics = dynamics;
        this.dynBehaviourQuery = InductiveDynamicBehaviourQuerying.create(dynamics);
        this.initialDistribution = initialDistribution;
        this.probHandler = new TemporalProbabilityHandler(probabilityDistributionFactory);
        this.conditionals = Lists.newArrayList();
        this.samplerLogger = SamplerLoggerDispatcher.INSTANCE;
    }

    @Override
    public Double probability(Trajectory<I> value) {
        return unrollForProbability(value);
    }

    @Override
    public void init(int seed) {
        if (initialized) {
            throw new RuntimeException("already initialized");
        }
        initialized = true;

        initialDistribution.init(seed);
        for (InterTimeSliceInduction each : dynBehaviourQuery.getInterTimeSliceInductions()) {
            ConditionableProbabilityDistribution<I> localCPD = probHandler.getCPD(each.getAppliedGroundVariable());
            localCPD.init(seed);
        }
        for (IntraTimeSliceInduction each : dynBehaviourQuery.getIntraTimeSliceInductions()) {
            ConditionableProbabilityDistribution<I> localCPD = getCPDFromInitial(each, conditionals);
            localCPD.init(seed);
        }
    }

    @Override
    public Trajectory<I> sample() {
        if (!initialized) {
            throw new RuntimeException("not initialized");
        }
        return unrollForSampling(SINGLE_TIME_SLICE);
    }

    @Override
    public Double infer(List<Trajectory<I>> inputs) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    @Override
    public void learn(List<Trajectory<I>> trainingData) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    @Override
    public DynamicBayesianNetwork<I> given(List<Conditional<I>> conditionals) {
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

    private void setConditionals(List<ConditionalInputValue<I>> conditionals) {
        this.conditionals.clear();
        this.conditionals.addAll(conditionals);
    }

    public Double unrollForProbability(Trajectory<I> traj) {
        double probability = 1;
        for (int timeSlice = 0; traj.inTimeRange(timeSlice); timeSlice++) {
            List<InputValue<I>> current = traj.valueAtTime(timeSlice);
            if (timeSlice == 0) {
                probability *= calculateInitialProbability(current);
            } else {
                List<InputValue<I>> last = traj.valueAtTime(timeSlice - 1);
                probability *= calculateProbability(current, last);
            }
        }
        return probability;
    }

    public Trajectory<I> unrollForSampling(int timeSlices) {
        Trajectory<I> samplePath = Trajectory.create(timeSlices);
        for (int i = 0; samplePath.inTimeRange(i); i++) {
            List<InputValue<I>> sample = sampleNext();
            setConditionals(conditionalInputValueUtil.toConditionalInputs(sample));
            samplePath.append(sample);
        }
        return samplePath;
    }

    private double calculateInitialProbability(List<InputValue<I>> inputs) {
        return initialDistribution.probability(inputs);
    }

    private double calculateProbability(List<InputValue<I>> current, List<InputValue<I>> last) {
        double probability = 1;
        for (InterTimeSliceInduction each : dynBehaviourQuery.getInterTimeSliceInductions()) {
            ConditionableProbabilityDistribution<I> localCPD = probHandler.getCPD(each.getAppliedGroundVariable());

            List<Conditional<I>> resolvedConditionals = resolveConditionals(each,
                    conditionalInputValueUtil.toConditionalInputs(last));
            InputValue<I> resolvedValue = conditionalInputValueUtil.getInputValue(each.getAppliedGroundVariable(),
                    current);

            ConditionableProbabilityDistribution<I> givenCPD = (ConditionableProbabilityDistribution<I>) localCPD
                .given(resolvedConditionals);
            I value = resolvedValue.getValue();
            probability *= givenCPD.probability(value);
        }

        for (IntraTimeSliceInduction each : dynBehaviourQuery.getIntraTimeSliceInductions()) {
            ConditionableProbabilityDistribution<I> localCPD = getCPDFromInitial(each,
                    conditionalInputValueUtil.toConditionalInputs(current));

            InputValue<I> resolvedInputValue = conditionalInputValueUtil.getInputValue(each.getAppliedGroundVariable(),
                    current);
            I resolvedValue = resolvedInputValue.getValue();
            probability *= localCPD.probability(resolvedValue);
        }
        return probability;
    }

    private List<InputValue<I>> sampleNext() {
        if (conditionals.isEmpty()) {
            return initialDistribution.sample();
        }
        return sampleNextGiven(conditionals);
    }

    private List<InputValue<I>> sampleNextGiven(List<ConditionalInputValue<I>> conditionals) {
        List<InputValue<I>> sample = Lists.newArrayList();
        for (InterTimeSliceInduction each : dynBehaviourQuery.getInterTimeSliceInductions()) {
            List<Conditional<I>> resolved = resolveConditionals(each, conditionals);
            GroundRandomVariable variable = each.getAppliedGroundVariable();
            ConditionableProbabilityDistribution<I> localCPD = probHandler.getCPD(variable);
            ConditionableProbabilityDistribution<I> given = (ConditionableProbabilityDistribution<I>) localCPD
                .given(resolved);
            I value = given.sample();
            samplerLogger.onSample(getClass().getSimpleName() + ":inter", variable, value);
            sample.add(InputValue.create(value, variable));
        }

        for (IntraTimeSliceInduction each : dynBehaviourQuery.getIntraTimeSliceInductions()) {
            ConditionableProbabilityDistribution<I> localCPD = getCPDFromInitial(each, conditionals);
            GroundRandomVariable variable = each.getAppliedGroundVariable();
            I value = localCPD.sample();
            samplerLogger.onSample(getClass().getSimpleName() + ":intra", variable, value);
            InputValue<I> inputValue = InputValue.create(value, variable);
            sample.add(inputValue);
        }

        return sample;
    }

    private ConditionableProbabilityDistribution<I> getCPDFromInitial(IntraTimeSliceInduction induction,
            List<ConditionalInputValue<I>> conditionals) {
        List<InputValue<I>> history = conditionalInputValueUtil.toInputValues(conditionals);
        ProbabilityDistributionFunction<I> pdf = initialDistribution.getPDF(induction.getAppliedGroundVariable(),
                history);
        return (ConditionableProbabilityDistribution<I>) pdf;
    }

    private List<Conditional<I>> resolveConditionals(InterTimeSliceInduction induction,
            List<ConditionalInputValue<I>> conditionals) {
        Set<TemplateVariable> interfaceVarParents = getInterfaceVariableParents(induction);

        List<ConditionalInputValue<I>> resolved = Lists.newArrayList();
        for (ConditionalInputValue<I> each : conditionals) {
            TemplateVariable instantiated = each.getGroundVariable()
                .getInstantiatedTemplate();
            if (contains(instantiated, interfaceVarParents)) {
                if (shareSameContext(induction.getAppliedGroundVariable(), each.getGroundVariable())) {
                    resolved.add(each);
                }
            }
        }
        return conditionalInputValueUtil.asConditionals(resolved);
    }

    private boolean shareSameContext(GroundRandomVariable parent, GroundRandomVariable child) {
        Set<EObject> parentContext = new LinkedHashSet<>(parent.getAppliedObjects());
        Set<EObject> childContext = new LinkedHashSet<>(child.getAppliedObjects());
        return Sets.intersection(parentContext, childContext)
            .size() > 0;
    }

    private Set<TemplateVariable> getInterfaceVariableParents(InterTimeSliceInduction induction) {
        return induction.getTemporalStructure()
            .stream()
            .map(InductiveDynamicBehaviourQuerying::getSource)
            .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    private void checkValidity(List<Conditional<I>> conditionals) {
        if (conditionals.isEmpty()) {
            return;
        }

        if (conditionals.stream()
            .allMatch(ConditionalInputValue.class::isInstance) == false) {
            throw new IllegalArgumentException(
                    "The conditionals cannot applied in the dynamic bayesian network context.");
        }
    }

    private List<ConditionalInputValue<I>> asConditionalInputValues(List<Conditional<I>> conditionals) {
        return conditionals.stream()
            .map(ConditionalInputValue.class::cast)
            .collect(toList());
    }
}
