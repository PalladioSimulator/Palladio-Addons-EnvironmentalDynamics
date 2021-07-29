/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#getScope <em>Scope</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#isTemporal <em>Temporal</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateFactor()
 * @model abstract="true"
 * @generated
 */
public interface TemplateFactor extends Entity {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateFactor_Scope()
	 * @model required="true"
	 * @generated
	 */
	EList<TemplateVariable> getScope();

	/**
	 * Returns the value of the '<em><b>Temporal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal</em>' attribute.
	 * @see #setTemporal(boolean)
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateFactor_Temporal()
	 * @model default="false"
	 * @generated
	 */
	boolean isTemporal();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#isTemporal <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporal</em>' attribute.
	 * @see #isTemporal()
	 * @generated
	 */
	void setTemporal(boolean value);

} // TemplateFactor
