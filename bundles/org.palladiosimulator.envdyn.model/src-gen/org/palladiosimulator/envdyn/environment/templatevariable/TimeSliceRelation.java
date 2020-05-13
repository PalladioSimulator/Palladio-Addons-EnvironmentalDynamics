/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slice Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTimeSliceRelation()
 * @model
 * @generated
 */
public interface TimeSliceRelation extends TemporalRelation
{
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTimeSliceRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getSource();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TemplateVariable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTimeSliceRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getTarget();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TemplateVariable value);

} // TimeSliceRelation
