package org.palladiosimulator.envdyn.api.entity.bn;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

public enum SamplerLoggerDispatcher implements SamplerLogger {
    INSTANCE;

    private SamplerLogger logger;

    private SamplerLoggerDispatcher() {
    }

    public void setSamplerLogger(SamplerLogger logger) {
        this.logger = logger;
    }

    @Override
    public void onSample(String context, GroundRandomVariable variable, Object value) {
        logger.onSample(context, variable, value);
    }
}