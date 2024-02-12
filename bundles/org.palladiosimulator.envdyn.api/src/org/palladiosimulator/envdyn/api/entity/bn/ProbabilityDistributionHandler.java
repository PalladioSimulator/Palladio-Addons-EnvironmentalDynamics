package org.palladiosimulator.envdyn.api.entity.bn;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;
import tools.mdsd.probdist.api.entity.Value;

public abstract class ProbabilityDistributionHandler<I extends Value<?>> {

    private final Map<GroundRandomVariable, ProbabilityDistributionFunction<I>> modelCache = new HashMap<>();

    public ProbabilityDistributionFunction<I> getPDF(GroundRandomVariable variable) {
        if (modelCache.isEmpty()) {
            initialize();
        }
        return modelCache.get(variable);
    }

    protected void cache(GroundRandomVariable variable, ProbabilityDistributionFunction<I> pdf) {
        modelCache.put(variable, pdf);
    }

    protected abstract void initialize();
}
