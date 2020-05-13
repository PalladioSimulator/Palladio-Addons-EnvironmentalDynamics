/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl#getDescriptiveModel <em>Descriptive Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl#getAppliedGroundVariable <em>Applied Ground Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TimeSliceInductionImpl extends MinimalEObjectImpl.Container implements TimeSliceInduction
{
	/**
	 * The cached value of the '{@link #getDescriptiveModel() <em>Descriptive Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptiveModel()
	 * @generated
	 * @ordered
	 */
	protected TemporalDynamic descriptiveModel;

	/**
	 * The cached value of the '{@link #getAppliedGroundVariable() <em>Applied Ground Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedGroundVariable()
	 * @generated
	 * @ordered
	 */
	protected GroundRandomVariable appliedGroundVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSliceInductionImpl()
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
		return DynamicmodelPackage.Literals.TIME_SLICE_INDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDynamic getDescriptiveModel()
	{
		if (descriptiveModel != null && descriptiveModel.eIsProxy()) {
			InternalEObject oldDescriptiveModel = (InternalEObject)descriptiveModel;
			descriptiveModel = (TemporalDynamic)eResolveProxy(oldDescriptiveModel);
			if (descriptiveModel != oldDescriptiveModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL, oldDescriptiveModel, descriptiveModel));
			}
		}
		return descriptiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDynamic basicGetDescriptiveModel()
	{
		return descriptiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescriptiveModel(TemporalDynamic newDescriptiveModel)
	{
		TemporalDynamic oldDescriptiveModel = descriptiveModel;
		descriptiveModel = newDescriptiveModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL, oldDescriptiveModel, descriptiveModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundRandomVariable getAppliedGroundVariable()
	{
		if (appliedGroundVariable != null && appliedGroundVariable.eIsProxy()) {
			InternalEObject oldAppliedGroundVariable = (InternalEObject)appliedGroundVariable;
			appliedGroundVariable = (GroundRandomVariable)eResolveProxy(oldAppliedGroundVariable);
			if (appliedGroundVariable != oldAppliedGroundVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE, oldAppliedGroundVariable, appliedGroundVariable));
			}
		}
		return appliedGroundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundRandomVariable basicGetAppliedGroundVariable()
	{
		return appliedGroundVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppliedGroundVariable(GroundRandomVariable newAppliedGroundVariable)
	{
		GroundRandomVariable oldAppliedGroundVariable = appliedGroundVariable;
		appliedGroundVariable = newAppliedGroundVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE, oldAppliedGroundVariable, appliedGroundVariable));
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
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL:
				if (resolve) return getDescriptiveModel();
				return basicGetDescriptiveModel();
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE:
				if (resolve) return getAppliedGroundVariable();
				return basicGetAppliedGroundVariable();
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
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL:
				setDescriptiveModel((TemporalDynamic)newValue);
				return;
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE:
				setAppliedGroundVariable((GroundRandomVariable)newValue);
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
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL:
				setDescriptiveModel((TemporalDynamic)null);
				return;
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE:
				setAppliedGroundVariable((GroundRandomVariable)null);
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
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL:
				return descriptiveModel != null;
			case DynamicmodelPackage.TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE:
				return appliedGroundVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //TimeSliceInductionImpl
