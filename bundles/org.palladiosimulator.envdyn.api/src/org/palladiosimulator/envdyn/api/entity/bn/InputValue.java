package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.NumericalValue;
import tools.mdsd.probdist.api.entity.Value;

public class InputValue {

    private final GroundRandomVariable variable;

    private Value<?> value;

    private InputValue(Value<?> value, GroundRandomVariable variable) {
        this.value = value;
        this.variable = variable;
    }

    public static InputValue create(Value<?> value, GroundRandomVariable variable) {
        return new InputValue(value, variable);
    }

    public GroundRandomVariable getVariable() {
        return variable;
    }

    public Value<?> getValue() {
        return value;
    }

    public void setValue(Value<?> value) {
        this.value = value;
    }

    public CategoricalValue asCategorical() throws ClassCastException {
        return (CategoricalValue) value;
    }

    public NumericalValue asNumerical() throws ClassCastException {
        return (NumericalValue) value;
    }

}