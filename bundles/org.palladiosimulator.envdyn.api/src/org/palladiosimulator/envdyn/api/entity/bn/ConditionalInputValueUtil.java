package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork.ConditionalInputValue;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.Conditionable.Conditional;
import tools.mdsd.probdist.api.entity.Value;

public class ConditionalInputValueUtil<I extends Value<?>> {
    public List<Conditional<I>> asConditionals(List<ConditionalInputValue<I>> conditionals) {
        return conditionals.stream()
            .map(Conditional.class::cast)
            .collect(toList());
    }

    public List<ConditionalInputValue<I>> toConditionalInputs(List<InputValue<I>> inputs) {
        return inputs.stream()
            .map(this::toConditionalInput)
            .collect(toList());
    }

    private ConditionalInputValue<I> toConditionalInput(InputValue<I> input) {
        return ConditionalInputValue.create(new Conditional<>(input.getValue()
            .getDomain(), input.getValue()), input.getVariable());
    }

    public List<InputValue<I>> toInputValues(List<ConditionalInputValue<I>> conditionals) {
        return conditionals.stream()
            .map(this::toInputValue)
            .collect(toList());
    }

    private InputValue<I> toInputValue(ConditionalInputValue<I> conditional) {
        return InputValue.create(conditional.getValue(), conditional.getGroundVariable());
    }

    public InputValue<I> getInputValue(GroundRandomVariable variable, List<InputValue<I>> inputs) {
        return inputs.stream()
            .filter(input -> input.getVariable()
                .getId()
                .equals(variable.getId()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                    String.format("The network does not contain the ground random variable for template %s",
                            variable.getInstantiatedTemplate()
                                .getEntityName())));
    }
}
