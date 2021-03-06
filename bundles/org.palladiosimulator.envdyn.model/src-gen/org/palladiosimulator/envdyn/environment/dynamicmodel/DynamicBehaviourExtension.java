/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Behaviour Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getModel <em>Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviourExtension()
 * @model
 * @generated
 */
public interface DynamicBehaviourExtension extends Entity
{
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(GroundProbabilisticNetwork)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviourExtension_Model()
	 * @model required="true"
	 * @generated
	 */
	GroundProbabilisticNetwork getModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(GroundProbabilisticNetwork value);

	/**
	 * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour</em>' containment reference.
	 * @see #setBehaviour(DynamicBehaviour)
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#getDynamicBehaviourExtension_Behaviour()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DynamicBehaviour getBehaviour();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getBehaviour <em>Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour</em>' containment reference.
	 * @see #getBehaviour()
	 * @generated
	 */
	void setBehaviour(DynamicBehaviour value);

} // DynamicBehaviourExtension
