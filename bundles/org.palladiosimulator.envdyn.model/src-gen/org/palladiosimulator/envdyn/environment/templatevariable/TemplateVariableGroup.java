/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Variable Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup#getGroupedTemplates <em>Grouped Templates</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableGroup()
 * @model
 * @generated
 */
public interface TemplateVariableGroup extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Grouped Templates</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Templates</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#getTemplateVariableGroup_GroupedTemplates()
	 * @model required="true"
	 * @generated
	 */
	EList<TemplateVariable> getGroupedTemplates();

} // TemplateVariableGroup
