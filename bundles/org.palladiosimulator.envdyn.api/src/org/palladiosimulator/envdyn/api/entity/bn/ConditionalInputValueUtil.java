package org.palladiosimulator.envdyn.api.entity.bn;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.palladiosimulator.envdyn.api.entity.bn.DynamicBayesianNetwork.ConditionalInputValue;

import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.Conditionable.Conditional;

public class ConditionalInputValueUtil {
    public List<Conditional<CategoricalValue>> asConditionals(List<ConditionalInputValue> conditionals) {
        return conditionals.stream()
            .map(Conditional.class::cast)
            .collect(toList());
    }

    public List<ConditionalInputValue> toConditionalInputs(List<InputValue> inputs) {
        return inputs.stream()
            .map(this::toConditionalInput)
            .collect(toList());
    }

    private ConditionalInputValue toConditionalInput(InputValue input) {
        return ConditionalInputValue.create(new Conditional(input.getValue()
            .getDomain(), input.getValue()), input.getVariable());
    }

    public List<InputValue> toInputValues(List<ConditionalInputValue> conditionals) {
        return conditionals.stream()
            .map(this::toInputValue)
            .collect(toList());
    }

    private InputValue toInputValue(ConditionalInputValue conditional) {
        return InputValue.create(conditional.getValue(), conditional.getGroundVariable());
    }
}
