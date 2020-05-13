/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl#isTemporal <em>Temporal</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TemplateFactorImpl extends EntityImpl implements TemplateFactor
{
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateVariable> scope;

	/**
	 * The default value of the '{@link #isTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TEMPORAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemporal()
	 * @generated
	 * @ordered
	 */
	protected boolean temporal = TEMPORAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateFactorImpl()
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
		return TemplatevariablePackage.Literals.TEMPLATE_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemplateVariable> getScope()
	{
		if (scope == null) {
			scope = new EObjectResolvingEList<TemplateVariable>(TemplateVariable.class, this, TemplatevariablePackage.TEMPLATE_FACTOR__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTemporal()
	{
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(boolean newTemporal)
	{
		boolean oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.TEMPLATE_FACTOR__TEMPORAL, oldTemporal, temporal));
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
			case TemplatevariablePackage.TEMPLATE_FACTOR__SCOPE:
				return getScope();
			case TemplatevariablePackage.TEMPLATE_FACTOR__TEMPORAL:
				return isTemporal();
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
			case TemplatevariablePackage.TEMPLATE_FACTOR__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends TemplateVariable>)newValue);
				return;
			case TemplatevariablePackage.TEMPLATE_FACTOR__TEMPORAL:
				setTemporal((Boolean)newValue);
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
			case TemplatevariablePackage.TEMPLATE_FACTOR__SCOPE:
				getScope().clear();
				return;
			case TemplatevariablePackage.TEMPLATE_FACTOR__TEMPORAL:
				setTemporal(TEMPORAL_EDEFAULT);
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
			case TemplatevariablePackage.TEMPLATE_FACTOR__SCOPE:
				return scope != null && !scope.isEmpty();
			case TemplatevariablePackage.TEMPLATE_FACTOR__TEMPORAL:
				return temporal != TEMPORAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (temporal: ");
		result.append(temporal);
		result.append(')');
		return result.toString();
	}

} //TemplateFactorImpl
