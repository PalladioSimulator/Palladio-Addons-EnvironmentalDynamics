/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Behaviour Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicBehaviourExtensionImpl extends EntityImpl implements DynamicBehaviourExtension
{
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected GroundProbabilisticNetwork model;

	/**
	 * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviour()
	 * @generated
	 * @ordered
	 */
	protected DynamicBehaviour behaviour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviourExtensionImpl()
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
		return DynamicmodelPackage.Literals.DYNAMIC_BEHAVIOUR_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundProbabilisticNetwork getModel()
	{
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (GroundProbabilisticNetwork)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundProbabilisticNetwork basicGetModel()
	{
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(GroundProbabilisticNetwork newModel)
	{
		GroundProbabilisticNetwork oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicBehaviour getBehaviour()
	{
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviour(DynamicBehaviour newBehaviour, NotificationChain msgs)
	{
		DynamicBehaviour oldBehaviour = behaviour;
		behaviour = newBehaviour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR, oldBehaviour, newBehaviour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehaviour(DynamicBehaviour newBehaviour)
	{
		if (newBehaviour != behaviour) {
			NotificationChain msgs = null;
			if (behaviour != null)
				msgs = ((InternalEObject)behaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR, null, msgs);
			if (newBehaviour != null)
				msgs = ((InternalEObject)newBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR, null, msgs);
			msgs = basicSetBehaviour(newBehaviour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR, newBehaviour, newBehaviour));
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR:
				return basicSetBehaviour(null, msgs);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR:
				return getBehaviour();
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL:
				setModel((GroundProbabilisticNetwork)newValue);
				return;
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR:
				setBehaviour((DynamicBehaviour)newValue);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL:
				setModel((GroundProbabilisticNetwork)null);
				return;
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR:
				setBehaviour((DynamicBehaviour)null);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__MODEL:
				return model != null;
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR:
				return behaviour != null;
		}
		return super.eIsSet(featureID);
	}

} //DynamicBehaviourExtensionImpl
