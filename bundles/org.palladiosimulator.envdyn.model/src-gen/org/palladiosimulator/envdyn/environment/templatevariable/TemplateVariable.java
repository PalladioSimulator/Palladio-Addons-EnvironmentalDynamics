/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#isShared <em>Shared</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getRefines <em>Refines</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariable()
 * @model
 * @generated
 */
public interface TemplateVariable extends Entity {
	/**
	 * Returns the value of the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared</em>' attribute.
	 * @see #setShared(boolean)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariable_Shared()
	 * @model required="true"
	 * @generated
	 */
	boolean isShared();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#isShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #isShared()
	 * @generated
	 */
	void setShared(boolean value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariable_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LogicalVariable> getSignature();

	/**
	 * Returns the value of the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refines</em>' reference.
	 * @see #setRefines(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariable_Refines()
	 * @model
	 * @generated
	 */
	TemplateVariable getRefines();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getRefines <em>Refines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refines</em>' reference.
	 * @see #getRefines()
	 * @generated
	 */
	void setRefines(TemplateVariable value);

} // TemplateVariable
