/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getLocalModel <em>Local Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getAppliedGroundVariable <em>Applied Ground Variable</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTimeSliceInduction()
 * @model abstract="true"
 * @generated
 */
public interface TimeSliceInduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Local Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Model</em>' reference.
	 * @see #setLocalModel(TemporalDynamic)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTimeSliceInduction_LocalModel()
	 * @model required="true"
	 * @generated
	 */
	TemporalDynamic getLocalModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getLocalModel <em>Local Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Model</em>' reference.
	 * @see #getLocalModel()
	 * @generated
	 */
	void setLocalModel(TemporalDynamic value);

	/**
	 * Returns the value of the '<em><b>Applied Ground Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Ground Variable</em>' reference.
	 * @see #setAppliedGroundVariable(GroundRandomVariable)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getTimeSliceInduction_AppliedGroundVariable()
	 * @model required="true"
	 * @generated
	 */
	GroundRandomVariable getAppliedGroundVariable();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getAppliedGroundVariable <em>Applied Ground Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Ground Variable</em>' reference.
	 * @see #getAppliedGroundVariable()
	 * @generated
	 */
	void setAppliedGroundVariable(GroundRandomVariable value);

} // TimeSliceInduction
