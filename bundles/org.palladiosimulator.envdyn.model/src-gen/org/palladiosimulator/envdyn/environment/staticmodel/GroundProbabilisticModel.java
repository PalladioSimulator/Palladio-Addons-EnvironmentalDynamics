/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;

import tools.mdsd.modelingfoundations.identifier.Entity;

import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Probabilistic Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getInstantiatedFactor <em>Instantiated Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticModel()
 * @model
 * @generated
 */
public interface GroundProbabilisticModel extends Entity {
	/**
	 * Returns the value of the '<em><b>Instantiated Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Factor</em>' reference.
	 * @see #setInstantiatedFactor(TemplateFactor)
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticModel_InstantiatedFactor()
	 * @model required="true"
	 * @generated
	 */
	TemplateFactor getInstantiatedFactor();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getInstantiatedFactor <em>Instantiated Factor</em>}' reference.
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
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticModel_Distribution()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistribution getDistribution();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getDistribution <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(ProbabilityDistribution value);

} // GroundProbabilisticModel
