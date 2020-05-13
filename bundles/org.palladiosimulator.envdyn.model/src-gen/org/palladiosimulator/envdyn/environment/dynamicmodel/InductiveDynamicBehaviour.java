/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inductive Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour#getTimeSliceInductions <em>Time Slice Inductions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getInductiveDynamicBehaviour()
 * @model
 * @generated
 */
public interface InductiveDynamicBehaviour extends DynamicBehaviour
{
	/**
	 * Returns the value of the '<em><b>Time Slice Inductions</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slice Inductions</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getInductiveDynamicBehaviour_TimeSliceInductions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TimeSliceInduction> getTimeSliceInductions();

} // InductiveDynamicBehaviour
