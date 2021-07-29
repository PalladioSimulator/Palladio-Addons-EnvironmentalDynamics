/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Probabilistic Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork#getGroundRandomVariables <em>Ground Random Variables</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getLocalProbabilisticNetwork()
 * @model
 * @generated
 */
public interface LocalProbabilisticNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Ground Random Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Random Variables</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getLocalProbabilisticNetwork_GroundRandomVariables()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GroundRandomVariable> getGroundRandomVariables();

} // LocalProbabilisticNetwork
