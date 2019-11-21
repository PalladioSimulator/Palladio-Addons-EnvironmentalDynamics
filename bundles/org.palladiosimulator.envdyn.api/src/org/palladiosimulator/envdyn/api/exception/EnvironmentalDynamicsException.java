package org.palladiosimulator.envdyn.api.exception;

public class EnvironmentalDynamicsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnvironmentalDynamicsException(String errorMessage) {
		super(errorMessage);
	}	
	
	public EnvironmentalDynamicsException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}

}
