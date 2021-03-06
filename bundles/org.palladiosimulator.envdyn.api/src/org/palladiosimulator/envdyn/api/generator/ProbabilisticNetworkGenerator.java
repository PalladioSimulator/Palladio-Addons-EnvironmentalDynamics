package org.palladiosimulator.envdyn.api.generator;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.envdyn.api.generator.annotation.AnnotationInstantiationStrategy;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;

public abstract class ProbabilisticNetworkGenerator<T> {
	
	protected final TemplateVariableDefinitions definitions;
	protected final NetworkInstantiationStrategy instantiationStrategy;

	protected ProbabilisticNetworkGenerator(TemplateVariableDefinitions definitions,
			NetworkInstantiationStrategy instantiationStrategy) {
		this.definitions = definitions;
		this.instantiationStrategy = instantiationStrategy;
	}

	protected ProbabilisticNetworkGenerator(TemplateVariableDefinitions definitions) {
		this(definitions, new AnnotationInstantiationStrategy(definitions));
	}

	public T generate(ResourceSet appliedModels) {
		return createProbabilisticNetwork(instantiationStrategy.instantiate(appliedModels));
	}

	public abstract T createProbabilisticNetwork(GroundProbabilisticNetwork network);
}
