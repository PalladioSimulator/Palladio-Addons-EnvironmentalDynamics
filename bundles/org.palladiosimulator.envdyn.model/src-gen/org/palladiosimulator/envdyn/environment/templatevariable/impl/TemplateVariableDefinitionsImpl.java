/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.envdyn.environment.templatevariable.Argument;
import org.palladiosimulator.envdyn.environment.templatevariable.Relation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Variable Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl#getFactors <em>Factors</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl#getTemplateGroups <em>Template Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateVariableDefinitionsImpl extends EntityImpl implements TemplateVariableDefinitions
{
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateVariable> variables;

	/**
	 * The cached value of the '{@link #getFactors() <em>Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateFactor> factors;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relation;

	/**
	 * The cached value of the '{@link #getTemplateGroups() <em>Template Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateVariableGroup> templateGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateVariableDefinitionsImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return TemplatevariablePackage.Literals.TEMPLATE_VARIABLE_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateVariable> getVariables()
	{
		if (variables == null) {
			variables = new EObjectContainmentEList<TemplateVariable>(TemplateVariable.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateFactor> getFactors()
	{
		if (factors == null) {
			factors = new EObjectContainmentEList<TemplateFactor>(TemplateFactor.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS);
		}
		return factors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Argument> getArguments()
	{
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelation()
	{
		if (relation == null) {
			relation = new EObjectContainmentEList<Relation>(Relation.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateVariableGroup> getTemplateGroups()
	{
		if (templateGroups == null) {
			templateGroups = new EObjectContainmentEList<TemplateVariableGroup>(TemplateVariableGroup.class, this, TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS);
		}
		return templateGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
				return ((InternalEList<?>)getFactors()).basicRemove(otherEnd, msgs);
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				return ((InternalEList<?>)getTemplateGroups()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
				return getVariables();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
				return getFactors();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
				return getArguments();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
				return getRelation();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				return getTemplateGroups();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends TemplateVariable>)newValue);
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
				getFactors().clear();
				getFactors().addAll((Collection<? extends TemplateFactor>)newValue);
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends Relation>)newValue);
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				getTemplateGroups().clear();
				getTemplateGroups().addAll((Collection<? extends TemplateVariableGroup>)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
				getVariables().clear();
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
				getFactors().clear();
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
				getArguments().clear();
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
				getRelation().clear();
				return;
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				getTemplateGroups().clear();
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES:
				return variables != null && !variables.isEmpty();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__FACTORS:
				return factors != null && !factors.isEmpty();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__RELATION:
				return relation != null && !relation.isEmpty();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS:
				return templateGroups != null && !templateGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateVariableDefinitionsImpl
