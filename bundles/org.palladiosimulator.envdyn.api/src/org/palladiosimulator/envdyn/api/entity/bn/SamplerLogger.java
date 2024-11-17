package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

public interface SamplerLogger {
    void onSample(GroundRandomVariable variable, Object value);
}
