/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Probabilistic Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalModels <em>Local Models</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalProbabilisticModels <em>Local Probabilistic Models</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticNetwork()
 * @model
 * @generated
 */
public interface GroundProbabilisticNetwork extends Entity
{
	/**
	 * Returns the value of the '<em><b>Local Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Models</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticNetwork_LocalModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GroundProbabilisticModel> getLocalModels();

	/**
	 * Returns the value of the '<em><b>Local Probabilistic Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Probabilistic Models</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundProbabilisticNetwork_LocalProbabilisticModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LocalProbabilisticNetwork> getLocalProbabilisticModels();

} // GroundProbabilisticNetwork
