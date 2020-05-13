/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inductive Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InductiveDynamicBehaviourImpl#getTimeSliceInductions <em>Time Slice Inductions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InductiveDynamicBehaviourImpl extends DynamicBehaviourImpl implements InductiveDynamicBehaviour
{
	/**
	 * The cached value of the '{@link #getTimeSliceInductions() <em>Time Slice Inductions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSliceInductions()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeSliceInduction> timeSliceInductions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InductiveDynamicBehaviourImpl()
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
		return DynamicmodelPackage.Literals.INDUCTIVE_DYNAMIC_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimeSliceInduction> getTimeSliceInductions()
	{
		if (timeSliceInductions == null) {
			timeSliceInductions = new EObjectContainmentEList<TimeSliceInduction>(TimeSliceInduction.class, this, DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS);
		}
		return timeSliceInductions;
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
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS:
				return ((InternalEList<?>)getTimeSliceInductions()).basicRemove(otherEnd, msgs);
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
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS:
				return getTimeSliceInductions();
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
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS:
				getTimeSliceInductions().clear();
				getTimeSliceInductions().addAll((Collection<? extends TimeSliceInduction>)newValue);
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
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS:
				getTimeSliceInductions().clear();
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
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS:
				return timeSliceInductions != null && !timeSliceInductions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InductiveDynamicBehaviourImpl
