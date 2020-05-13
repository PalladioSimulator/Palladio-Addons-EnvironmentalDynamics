/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction#getTemporalStructure <em>Temporal Structure</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getInterTimeSliceInduction()
 * @model
 * @generated
 */
public interface InterTimeSliceInduction extends TimeSliceInduction
{
	/**
	 * Returns the value of the '<em><b>Temporal Structure</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Structure</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getInterTimeSliceInduction_TemporalStructure()
	 * @model required="true"
	 * @generated
	 */
	EList<TemporalRelation> getTemporalStructure();

} // InterTimeSliceInduction
