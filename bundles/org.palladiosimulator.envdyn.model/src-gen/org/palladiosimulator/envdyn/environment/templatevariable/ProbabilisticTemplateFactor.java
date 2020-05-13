/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Template Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor#getDistributionFamily <em>Distribution Family</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getProbabilisticTemplateFactor()
 * @model
 * @generated
 */
public interface ProbabilisticTemplateFactor extends TemplateFactor {
	/**
	 * Returns the value of the '<em><b>Distribution Family</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Family</em>' reference.
	 * @see #setDistributionFamily(ProbabilityDistributionSkeleton)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getProbabilisticTemplateFactor_DistributionFamily()
	 * @model required="true"
	 * @generated
	 */
	ProbabilityDistributionSkeleton getDistributionFamily();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor#getDistributionFamily <em>Distribution Family</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Family</em>' reference.
	 * @see #getDistributionFamily()
	 * @generated
	 */
	void setDistributionFamily(ProbabilityDistributionSkeleton value);

} // ProbabilisticTemplateFactor
