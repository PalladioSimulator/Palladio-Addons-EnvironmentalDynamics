/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour#getLocalModels <em>Local Models</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviour()
 * @model abstract="true"
 * @generated
 */
public interface DynamicBehaviour extends EObject
{
	/**
	 * Returns the value of the '<em><b>Local Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Models</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviour_LocalModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TemporalDynamic> getLocalModels();

} // DynamicBehaviour
