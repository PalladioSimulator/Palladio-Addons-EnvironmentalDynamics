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

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Behaviour Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourRepositoryImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicBehaviourRepositoryImpl extends EntityImpl implements DynamicBehaviourRepository {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicBehaviourExtension> extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicBehaviourRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicmodelPackage.Literals.DYNAMIC_BEHAVIOUR_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DynamicBehaviourExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<DynamicBehaviourExtension>(DynamicBehaviourExtension.class, this, DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS:
				return getExtensions();
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends DynamicBehaviourExtension>)newValue);
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS:
				getExtensions().clear();
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DynamicBehaviourRepositoryImpl
