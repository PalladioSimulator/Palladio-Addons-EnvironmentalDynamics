/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import tools.mdsd.modelingfoundations.identifier.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Variable Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableGroupImpl#getGroupedTemplates <em>Grouped Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateVariableGroupImpl extends NamedElementImpl implements TemplateVariableGroup {
	/**
	 * The cached value of the '{@link #getGroupedTemplates() <em>Grouped Templates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateVariable> groupedTemplates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateVariableGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateVariable> getGroupedTemplates() {
		if (groupedTemplates == null) {
			groupedTemplates = new EObjectResolvingEList<TemplateVariable>(TemplateVariable.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES);
		}
		return groupedTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES:
				return getGroupedTemplates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES:
				getGroupedTemplates().clear();
				getGroupedTemplates().addAll((Collection<? extends TemplateVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES:
				getGroupedTemplates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES:
				return groupedTemplates != null && !groupedTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateVariableGroupImpl
