package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.NumericalValue;
import tools.mdsd.probdist.api.entity.Value;

public class InputValue<I extends Value<?>> {

    private final GroundRandomVariable variable;

    private I value;

    private InputValue(I value, GroundRandomVariable variable) {
        this.value = value;
        this.variable = variable;
    }

    public static <I extends Value<?>> InputValue<I> create(I value, GroundRandomVariable variable) {
        return new InputValue<>(value, variable);
    }

    public GroundRandomVariable getVariable() {
        return variable;
    }

    public I getValue() {
        return value;
    }

    public void setValue(I value) {
        this.value = value;
    }

    public CategoricalValue asCategorical() throws ClassCastException {
        return (CategoricalValue) value;
    }

    public NumericalValue asNumerical() throws ClassCastException {
        return (NumericalValue) value;
    }

}