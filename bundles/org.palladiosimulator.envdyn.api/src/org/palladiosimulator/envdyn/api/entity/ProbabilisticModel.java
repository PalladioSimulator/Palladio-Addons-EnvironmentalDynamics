package org.palladiosimulator.envdyn.api.entity;

import java.util.List;

public interface ProbabilisticModel<T> {

	// Assuming all inputs match the random variable signature
	public Double infer(List<T> inputs);

	public void learn(List<T> trainingData);

}
