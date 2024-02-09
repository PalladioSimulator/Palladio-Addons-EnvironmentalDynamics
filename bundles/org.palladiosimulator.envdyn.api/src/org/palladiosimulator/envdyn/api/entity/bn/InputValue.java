package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.NumericalValue;
import tools.mdsd.probdist.api.entity.Value;

public class InputValue<V> {

    private final GroundRandomVariable variable;

    private Value<V> value;

    private InputValue(Value<V> value, GroundRandomVariable variable) {
        this.value = value;
        this.variable = variable;
    }

    public static <V> InputValue<V> create(Value<V> value, GroundRandomVariable variable) {
        return new InputValue<>(value, variable);
    }

    public GroundRandomVariable getVariable() {
        return variable;
    }

    public Value<V> getValue() {
        return value;
    }

    public void setValue(Value<V> value) {
        this.value = value;
    }

    public CategoricalValue asCategorical() throws ClassCastException {
        return (CategoricalValue) value;
    }

    public NumericalValue asNumerical() throws ClassCastException {
        return (NumericalValue) value;
    }

}