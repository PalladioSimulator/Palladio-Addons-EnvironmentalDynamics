package org.palladiosimulator.envdyn.api.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;

public interface NetworkInstantiationStrategy {

	public GroundProbabilisticNetwork instantiate(ResourceSet appliedModels);
}
