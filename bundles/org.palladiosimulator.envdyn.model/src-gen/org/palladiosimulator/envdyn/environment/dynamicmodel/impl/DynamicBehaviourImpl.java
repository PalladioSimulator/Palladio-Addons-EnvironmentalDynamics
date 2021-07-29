/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourImpl#getLocalModels <em>Local Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DynamicBehaviourImpl extends MinimalEObjectImpl.Container implements DynamicBehaviour {
	/**
	 * The cached value of the '{@link #getLocalModels() <em>Local Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalDynamic> localModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicmodelPackage.Literals.DYNAMIC_BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalDynamic> getLocalModels() {
		if (localModels == null) {
			localModels = new EObjectContainmentEList<TemporalDynamic>(TemporalDynamic.class, this, DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS);
		}
		return localModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS:
				return ((InternalEList<?>)getLocalModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS:
				return getLocalModels();
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS:
				getLocalModels().clear();
				getLocalModels().addAll((Collection<? extends TemporalDynamic>)newValue);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS:
				getLocalModels().clear();
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR__LOCAL_MODELS:
				return localModels != null && !localModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicBehaviourImpl
