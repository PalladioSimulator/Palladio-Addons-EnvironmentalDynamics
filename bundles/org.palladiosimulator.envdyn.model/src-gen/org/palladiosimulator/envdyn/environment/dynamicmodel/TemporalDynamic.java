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
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistributionFunction <em>Distribution Function</em>}</li>
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
	 * Returns the value of the '<em><b>Distribution Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Function</em>' reference.
	 * @see #setDistributionFunction(ProbabilityDistribution)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTemporalDynamic_DistributionFunction()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistribution getDistributionFunction();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistributionFunction <em>Distribution Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Function</em>' reference.
	 * @see #getDistributionFunction()
	 * @generated
	 */
	void setDistributionFunction(ProbabilityDistribution value);

} // TemporalDynamic
