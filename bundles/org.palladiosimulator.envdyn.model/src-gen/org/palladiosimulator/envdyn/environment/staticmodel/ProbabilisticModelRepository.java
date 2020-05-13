/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Model Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getProbabilisticModelRepository()
 * @model
 * @generated
 */
public interface ProbabilisticModelRepository extends Entity
{
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getProbabilisticModelRepository_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroundProbabilisticNetwork> getModels();

} // ProbabilisticModelRepository
