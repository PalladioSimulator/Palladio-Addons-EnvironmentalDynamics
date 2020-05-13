/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Probabilistic Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl#getLocalModels <em>Local Models</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl#getLocalProbabilisticModels <em>Local Probabilistic Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundProbabilisticNetworkImpl extends EntityImpl implements GroundProbabilisticNetwork
{
	/**
	 * The cached value of the '{@link #getLocalModels() <em>Local Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalModels()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundProbabilisticModel> localModels;

	/**
	 * The cached value of the '{@link #getLocalProbabilisticModels() <em>Local Probabilistic Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalProbabilisticModels()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalProbabilisticNetwork> localProbabilisticModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundProbabilisticNetworkImpl()
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
		return StaticmodelPackage.Literals.GROUND_PROBABILISTIC_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GroundProbabilisticModel> getLocalModels()
	{
		if (localModels == null) {
			localModels = new EObjectContainmentEList<GroundProbabilisticModel>(GroundProbabilisticModel.class, this, StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS);
		}
		return localModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalProbabilisticNetwork> getLocalProbabilisticModels()
	{
		if (localProbabilisticModels == null) {
			localProbabilisticModels = new EObjectContainmentEList<LocalProbabilisticNetwork>(LocalProbabilisticNetwork.class, this, StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS);
		}
		return localProbabilisticModels;
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return ((InternalEList<?>)getLocalModels()).basicRemove(otherEnd, msgs);
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS:
				return ((InternalEList<?>)getLocalProbabilisticModels()).basicRemove(otherEnd, msgs);
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return getLocalModels();
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS:
				return getLocalProbabilisticModels();
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				getLocalModels().clear();
				getLocalModels().addAll((Collection<? extends GroundProbabilisticModel>)newValue);
				return;
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS:
				getLocalProbabilisticModels().clear();
				getLocalProbabilisticModels().addAll((Collection<? extends LocalProbabilisticNetwork>)newValue);
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				getLocalModels().clear();
				return;
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS:
				getLocalProbabilisticModels().clear();
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return localModels != null && !localModels.isEmpty();
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS:
				return localProbabilisticModels != null && !localProbabilisticModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundProbabilisticNetworkImpl
