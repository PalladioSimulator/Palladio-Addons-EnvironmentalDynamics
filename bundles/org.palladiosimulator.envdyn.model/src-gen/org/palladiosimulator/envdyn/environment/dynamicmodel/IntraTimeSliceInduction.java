/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intra Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction#getDependenceStructure <em>Dependence Structure</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getIntraTimeSliceInduction()
 * @model
 * @generated
 */
public interface IntraTimeSliceInduction extends TimeSliceInduction {
	/**
	 * Returns the value of the '<em><b>Dependence Structure</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence Structure</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getIntraTimeSliceInduction_DependenceStructure()
	 * @model required="true"
	 * @generated
	 */
	EList<DependenceRelation> getDependenceStructure();

} // IntraTimeSliceInduction
