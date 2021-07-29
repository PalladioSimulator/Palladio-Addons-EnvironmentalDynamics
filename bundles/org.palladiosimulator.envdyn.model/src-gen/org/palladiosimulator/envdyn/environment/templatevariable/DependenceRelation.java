/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependence Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#isContingent <em>Contingent</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getDependenceRelation()
 * @model
 * @generated
 */
public interface DependenceRelation extends Relation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceType
	 * @see #setType(DependenceType)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getDependenceRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	DependenceType getType();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceType
	 * @see #getType()
	 * @generated
	 */
	void setType(DependenceType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getDependenceRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getTarget();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TemplateVariable value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getDependenceRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getSource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TemplateVariable value);

	/**
	 * Returns the value of the '<em><b>Contingent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingent</em>' attribute.
	 * @see #setContingent(boolean)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getDependenceRelation_Contingent()
	 * @model required="true"
	 * @generated
	 */
	boolean isContingent();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#isContingent <em>Contingent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingent</em>' attribute.
	 * @see #isContingent()
	 * @generated
	 */
	void setContingent(boolean value);

} // DependenceRelation
