package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

public interface SamplerLogger {
    void onSample(String context, GroundRandomVariable variable, Object value);
}
