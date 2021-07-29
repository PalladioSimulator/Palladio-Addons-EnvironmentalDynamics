/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage
 * @generated
 */
public interface StaticmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticmodelFactory eINSTANCE = org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ground Random Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Random Variable</em>'.
	 * @generated
	 */
	GroundRandomVariable createGroundRandomVariable();

	/**
	 * Returns a new object of class '<em>Local Probabilistic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Probabilistic Model</em>'.
	 * @generated
	 */
	LocalProbabilisticModel createLocalProbabilisticModel();

	/**
	 * Returns a new object of class '<em>Probabilistic Model Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Model Repository</em>'.
	 * @generated
	 */
	ProbabilisticModelRepository createProbabilisticModelRepository();

	/**
	 * Returns a new object of class '<em>Ground Probabilistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Probabilistic Network</em>'.
	 * @generated
	 */
	GroundProbabilisticNetwork createGroundProbabilisticNetwork();

	/**
	 * Returns a new object of class '<em>Local Probabilistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Probabilistic Network</em>'.
	 * @generated
	 */
	LocalProbabilisticNetwork createLocalProbabilisticNetwork();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaticmodelPackage getStaticmodelPackage();

} //StaticmodelFactory
