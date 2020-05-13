/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Probabilistic Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.LocalProbabilisticNetworkImpl#getGroundRandomVariables <em>Ground Random Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalProbabilisticNetworkImpl extends MinimalEObjectImpl.Container implements LocalProbabilisticNetwork
{
	/**
	 * The cached value of the '{@link #getGroundRandomVariables() <em>Ground Random Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundRandomVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundRandomVariable> groundRandomVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProbabilisticNetworkImpl()
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
		return StaticmodelPackage.Literals.LOCAL_PROBABILISTIC_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GroundRandomVariable> getGroundRandomVariables()
	{
		if (groundRandomVariables == null) {
			groundRandomVariables = new EObjectContainmentEList<GroundRandomVariable>(GroundRandomVariable.class, this, StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES);
		}
		return groundRandomVariables;
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
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES:
				return ((InternalEList<?>)getGroundRandomVariables()).basicRemove(otherEnd, msgs);
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
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES:
				return getGroundRandomVariables();
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
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES:
				getGroundRandomVariables().clear();
				getGroundRandomVariables().addAll((Collection<? extends GroundRandomVariable>)newValue);
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
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES:
				getGroundRandomVariables().clear();
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
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES:
				return groundRandomVariables != null && !groundRandomVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocalProbabilisticNetworkImpl
