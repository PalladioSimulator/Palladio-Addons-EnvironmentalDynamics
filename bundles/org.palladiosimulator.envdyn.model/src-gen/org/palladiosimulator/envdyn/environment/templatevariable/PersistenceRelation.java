/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation#getInterfaceVariable <em>Interface Variable</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getPersistenceRelation()
 * @model
 * @generated
 */
public interface PersistenceRelation extends TemporalRelation {
	/**
	 * Returns the value of the '<em><b>Interface Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Variable</em>' reference.
	 * @see #setInterfaceVariable(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getPersistenceRelation_InterfaceVariable()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getInterfaceVariable();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation#getInterfaceVariable <em>Interface Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Variable</em>' reference.
	 * @see #getInterfaceVariable()
	 * @generated
	 */
	void setInterfaceVariable(TemplateVariable value);

} // PersistenceRelation
