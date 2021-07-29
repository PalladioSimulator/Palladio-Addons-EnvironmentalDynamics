/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;
import org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slice Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeSliceRelationImpl extends TemporalRelationImpl implements TimeSliceRelation {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TemplateVariable target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSliceRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatevariablePackage.Literals.TIME_SLICE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (TemplateVariable)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(TemplateVariable newSource) {
		TemplateVariable oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (TemplateVariable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.TIME_SLICE_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TemplateVariable newTarget) {
		TemplateVariable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.TIME_SLICE_RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TemplatevariablePackage.TIME_SLICE_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE:
				setSource((TemplateVariable)newValue);
				return;
			case TemplatevariablePackage.TIME_SLICE_RELATION__TARGET:
				setTarget((TemplateVariable)newValue);
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
			case TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE:
				setSource((TemplateVariable)null);
				return;
			case TemplatevariablePackage.TIME_SLICE_RELATION__TARGET:
				setTarget((TemplateVariable)null);
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
			case TemplatevariablePackage.TIME_SLICE_RELATION__SOURCE:
				return source != null;
			case TemplatevariablePackage.TIME_SLICE_RELATION__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeSliceRelationImpl
