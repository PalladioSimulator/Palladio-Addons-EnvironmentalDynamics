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

import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
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
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl#getLocalNetworks <em>Local Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundProbabilisticNetworkImpl extends EntityImpl implements GroundProbabilisticNetwork {
	/**
	 * The cached value of the '{@link #getLocalModels() <em>Local Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalModels()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalProbabilisticModel> localModels;

	/**
	 * The cached value of the '{@link #getLocalNetworks() <em>Local Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalProbabilisticNetwork> localNetworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundProbabilisticNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticmodelPackage.Literals.GROUND_PROBABILISTIC_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalProbabilisticModel> getLocalModels() {
		if (localModels == null) {
			localModels = new EObjectContainmentEList<LocalProbabilisticModel>(LocalProbabilisticModel.class, this, StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS);
		}
		return localModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalProbabilisticNetwork> getLocalNetworks() {
		if (localNetworks == null) {
			localNetworks = new EObjectContainmentEList<LocalProbabilisticNetwork>(LocalProbabilisticNetwork.class, this, StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS);
		}
		return localNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return ((InternalEList<?>)getLocalModels()).basicRemove(otherEnd, msgs);
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS:
				return ((InternalEList<?>)getLocalNetworks()).basicRemove(otherEnd, msgs);
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return getLocalModels();
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS:
				return getLocalNetworks();
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				getLocalModels().clear();
				getLocalModels().addAll((Collection<? extends LocalProbabilisticModel>)newValue);
				return;
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS:
				getLocalNetworks().clear();
				getLocalNetworks().addAll((Collection<? extends LocalProbabilisticNetwork>)newValue);
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				getLocalModels().clear();
				return;
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS:
				getLocalNetworks().clear();
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
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS:
				return localModels != null && !localModels.isEmpty();
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK__LOCAL_NETWORKS:
				return localNetworks != null && !localNetworks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundProbabilisticNetworkImpl
