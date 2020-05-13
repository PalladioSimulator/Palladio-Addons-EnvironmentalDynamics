/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage
 * @generated
 */
public interface TemplatevariableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatevariableFactory eINSTANCE = org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Template Variable Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Variable Definitions</em>'.
	 * @generated
	 */
	TemplateVariableDefinitions createTemplateVariableDefinitions();

	/**
	 * Returns a new object of class '<em>Template Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Variable</em>'.
	 * @generated
	 */
	TemplateVariable createTemplateVariable();

	/**
	 * Returns a new object of class '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument</em>'.
	 * @generated
	 */
	Argument createArgument();

	/**
	 * Returns a new object of class '<em>Probabilistic Template Factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probabilistic Template Factor</em>'.
	 * @generated
	 */
	ProbabilisticTemplateFactor createProbabilisticTemplateFactor();

	/**
	 * Returns a new object of class '<em>Dependence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependence Relation</em>'.
	 * @generated
	 */
	DependenceRelation createDependenceRelation();

	/**
	 * Returns a new object of class '<em>Persistence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Relation</em>'.
	 * @generated
	 */
	PersistenceRelation createPersistenceRelation();

	/**
	 * Returns a new object of class '<em>Time Slice Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slice Relation</em>'.
	 * @generated
	 */
	TimeSliceRelation createTimeSliceRelation();

	/**
	 * Returns a new object of class '<em>Template Variable Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Variable Group</em>'.
	 * @generated
	 */
	TemplateVariableGroup createTemplateVariableGroup();

	/**
	 * Returns a new object of class '<em>Logical Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Variable</em>'.
	 * @generated
	 */
	LogicalVariable createLogicalVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemplatevariablePackage getTemplatevariablePackage();

} //TemplatevariableFactory
