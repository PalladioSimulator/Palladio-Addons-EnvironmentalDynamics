/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.PersistenceRelationImpl#getInterfaceVariable <em>Interface Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistenceRelationImpl extends TemporalRelationImpl implements PersistenceRelation {
	/**
	 * The cached value of the '{@link #getInterfaceVariable() <em>Interface Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceVariable()
	 * @generated
	 * @ordered
	 */
	protected TemplateVariable interfaceVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatevariablePackage.Literals.PERSISTENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getInterfaceVariable() {
		if (interfaceVariable != null && interfaceVariable.eIsProxy()) {
			InternalEObject oldInterfaceVariable = (InternalEObject)interfaceVariable;
			interfaceVariable = (TemplateVariable)eResolveProxy(oldInterfaceVariable);
			if (interfaceVariable != oldInterfaceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE, oldInterfaceVariable, interfaceVariable));
			}
		}
		return interfaceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetInterfaceVariable() {
		return interfaceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceVariable(TemplateVariable newInterfaceVariable) {
		TemplateVariable oldInterfaceVariable = interfaceVariable;
		interfaceVariable = newInterfaceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE, oldInterfaceVariable, interfaceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE:
				if (resolve) return getInterfaceVariable();
				return basicGetInterfaceVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE:
				setInterfaceVariable((TemplateVariable)newValue);
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
			case TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE:
				setInterfaceVariable((TemplateVariable)null);
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
			case TemplatevariablePackage.PERSISTENCE_RELATION__INTERFACE_VARIABLE:
				return interfaceVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //PersistenceRelationImpl
