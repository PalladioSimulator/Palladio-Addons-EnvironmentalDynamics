/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;

import tools.mdsd.modelingfoundations.identifier.Entity;

import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal Dynamic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getInstantiatedFactor <em>Instantiated Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTemporalDynamic()
 * @model
 * @generated
 */
public interface TemporalDynamic extends Entity {
	/**
	 * Returns the value of the '<em><b>Instantiated Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Factor</em>' reference.
	 * @see #setInstantiatedFactor(TemplateFactor)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTemporalDynamic_InstantiatedFactor()
	 * @model required="true"
	 * @generated
	 */
	TemplateFactor getInstantiatedFactor();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getInstantiatedFactor <em>Instantiated Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Factor</em>' reference.
	 * @see #getInstantiatedFactor()
	 * @generated
	 */
	void setInstantiatedFactor(TemplateFactor value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see #setDistribution(ProbabilityDistribution)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTemporalDynamic_Distribution()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistribution getDistribution();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistribution <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(ProbabilityDistribution value);

} // TemporalDynamic
