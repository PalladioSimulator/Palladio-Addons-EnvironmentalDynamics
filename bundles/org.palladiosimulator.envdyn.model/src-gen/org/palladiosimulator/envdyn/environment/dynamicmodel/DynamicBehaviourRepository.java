/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behaviour Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviourRepository()
 * @model
 * @generated
 */
public interface DynamicBehaviourRepository extends Entity
{
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviourRepository_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicBehaviourExtension> getExtensions();

} // DynamicBehaviourRepository
