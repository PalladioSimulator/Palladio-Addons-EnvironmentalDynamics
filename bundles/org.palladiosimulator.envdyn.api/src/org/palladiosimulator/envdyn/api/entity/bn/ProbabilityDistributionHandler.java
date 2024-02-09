package org.palladiosimulator.envdyn.api.entity.bn;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

import tools.mdsd.probdist.api.entity.CategoricalValue;
import tools.mdsd.probdist.api.entity.ProbabilityDistributionFunction;

public abstract class ProbabilityDistributionHandler {

    private final Map<GroundRandomVariable, ProbabilityDistributionFunction<CategoricalValue>> modelCache = new HashMap<>();

    public ProbabilityDistributionFunction<CategoricalValue> getPDF(GroundRandomVariable variable) {
        if (modelCache.isEmpty()) {
            initialize();
        }
        return modelCache.get(variable);
    }

    protected void cache(GroundRandomVariable variable, ProbabilityDistributionFunction<CategoricalValue> pdf) {
        modelCache.put(variable, pdf);
    }

    protected abstract void initialize();
}
