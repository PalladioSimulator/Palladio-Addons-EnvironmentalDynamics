/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceType;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependence Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl#isContingent <em>Contingent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependenceRelationImpl extends RelationImpl implements DependenceRelation
{
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DependenceType TYPE_EDEFAULT = DependenceType.DIRECTED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DependenceType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TemplateVariable target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TemplateVariable source;

	/**
	 * The default value of the '{@link #isContingent() <em>Contingent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContingent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINGENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContingent() <em>Contingent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContingent()
	 * @generated
	 * @ordered
	 */
	protected boolean contingent = CONTINGENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenceRelationImpl()
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
		return TemplatevariablePackage.Literals.DEPENDENCE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenceType getType()
	{
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DependenceType newType)
	{
		DependenceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.DEPENDENCE_RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getTarget()
	{
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TemplateVariable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.DEPENDENCE_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetTarget()
	{
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TemplateVariable newTarget)
	{
		TemplateVariable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.DEPENDENCE_RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getSource()
	{
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TemplateVariable)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetSource()
	{
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(TemplateVariable newSource)
	{
		TemplateVariable oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContingent()
	{
		return contingent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContingent(boolean newContingent)
	{
		boolean oldContingent = contingent;
		contingent = newContingent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.DEPENDENCE_RELATION__CONTINGENT, oldContingent, contingent));
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
			case TemplatevariablePackage.DEPENDENCE_RELATION__TYPE:
				return getType();
			case TemplatevariablePackage.DEPENDENCE_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TemplatevariablePackage.DEPENDENCE_RELATION__CONTINGENT:
				return isContingent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case TemplatevariablePackage.DEPENDENCE_RELATION__TYPE:
				setType((DependenceType)newValue);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__TARGET:
				setTarget((TemplateVariable)newValue);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE:
				setSource((TemplateVariable)newValue);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__CONTINGENT:
				setContingent((Boolean)newValue);
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
			case TemplatevariablePackage.DEPENDENCE_RELATION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__TARGET:
				setTarget((TemplateVariable)null);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE:
				setSource((TemplateVariable)null);
				return;
			case TemplatevariablePackage.DEPENDENCE_RELATION__CONTINGENT:
				setContingent(CONTINGENT_EDEFAULT);
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
			case TemplatevariablePackage.DEPENDENCE_RELATION__TYPE:
				return type != TYPE_EDEFAULT;
			case TemplatevariablePackage.DEPENDENCE_RELATION__TARGET:
				return target != null;
			case TemplatevariablePackage.DEPENDENCE_RELATION__SOURCE:
				return source != null;
			case TemplatevariablePackage.DEPENDENCE_RELATION__CONTINGENT:
				return contingent != CONTINGENT_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", contingent: ");
		result.append(contingent);
		result.append(')');
		return result.toString();
	}

} //DependenceRelationImpl
