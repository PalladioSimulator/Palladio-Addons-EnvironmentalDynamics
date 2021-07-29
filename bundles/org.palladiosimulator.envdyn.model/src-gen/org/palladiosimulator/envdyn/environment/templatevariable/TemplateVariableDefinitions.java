/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Variable Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getFactors <em>Factors</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getTemplateGroups <em>Template Groups</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions()
 * @model
 * @generated
 */
public interface TemplateVariableDefinitions extends Entity {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Factors</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factors</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions_Factors()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateFactor> getFactors();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

	/**
	 * Returns the value of the '<em><b>Template Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Groups</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableDefinitions_TemplateGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateVariableGroup> getTemplateGroups();

} // TemplateVariableDefinitions
