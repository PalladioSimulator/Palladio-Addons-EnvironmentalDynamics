package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork.ConditionalInputValue;

import tools.mdsd.probdist.api.entity.Conditionable.Conditional;
import tools.mdsd.probdist.api.entity.Value;

public class ConditionalInputValueUtil<I extends Value<?>> {
    public List<Conditional<I>> asConditionals(List<ConditionalInputValue<I>> conditionals) {
        return conditionals.stream()
            .map(Conditional.class::cast)
            .collect(toList());
    }

    public List<ConditionalInputValue<I>> toConditionalInputs(List<InputValue> inputs) {
        return inputs.stream()
            .map(this::toConditionalInput)
            .collect(toList());
    }

    private ConditionalInputValue<I> toConditionalInput(InputValue input) {
        return ConditionalInputValue.create(new Conditional<>(input.getValue()
            .getDomain(), input.getValue()), input.getVariable());
    }

    public List<InputValue> toInputValues(List<ConditionalInputValue<I>> conditionals) {
        return conditionals.stream()
            .map(this::toInputValue)
            .collect(toList());
    }

    private InputValue toInputValue(ConditionalInputValue<I> conditional) {
        return InputValue.create(conditional.getValue(), conditional.getGroundVariable());
    }
}
