/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage
 * @generated
 */
public interface DynamicmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicmodelFactory eINSTANCE = org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dynamic Behaviour Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Behaviour Repository</em>'.
	 * @generated
	 */
	DynamicBehaviourRepository createDynamicBehaviourRepository();

	/**
	 * Returns a new object of class '<em>Dynamic Behaviour Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Behaviour Extension</em>'.
	 * @generated
	 */
	DynamicBehaviourExtension createDynamicBehaviourExtension();

	/**
	 * Returns a new object of class '<em>Inductive Dynamic Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inductive Dynamic Behaviour</em>'.
	 * @generated
	 */
	InductiveDynamicBehaviour createInductiveDynamicBehaviour();

	/**
	 * Returns a new object of class '<em>Inter Time Slice Induction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Time Slice Induction</em>'.
	 * @generated
	 */
	InterTimeSliceInduction createInterTimeSliceInduction();

	/**
	 * Returns a new object of class '<em>Intra Time Slice Induction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intra Time Slice Induction</em>'.
	 * @generated
	 */
	IntraTimeSliceInduction createIntraTimeSliceInduction();

	/**
	 * Returns a new object of class '<em>Temporal Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Dynamic</em>'.
	 * @generated
	 */
	TemporalDynamic createTemporalDynamic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DynamicmodelPackage getDynamicmodelPackage();

} //DynamicmodelFactory
