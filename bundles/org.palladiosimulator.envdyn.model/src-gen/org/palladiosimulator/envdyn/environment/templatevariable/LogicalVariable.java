/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getLogicalVariable()
 * @model
 * @generated
 */
public interface LogicalVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' reference.
	 * @see #setArgument(Argument)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getLogicalVariable_Argument()
	 * @model required="true"
	 * @generated
	 */
	Argument getArgument();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable#getArgument <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument</em>' reference.
	 * @see #getArgument()
	 * @generated
	 */
	void setArgument(Argument value);

} // LogicalVariable
