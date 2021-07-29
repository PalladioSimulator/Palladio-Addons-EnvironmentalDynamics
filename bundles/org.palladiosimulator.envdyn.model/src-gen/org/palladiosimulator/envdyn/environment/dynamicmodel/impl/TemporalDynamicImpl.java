/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

import tools.mdsd.probdist.distributionfunction.ProbabilityDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Dynamic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl#getInstantiatedFactor <em>Instantiated Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemporalDynamicImpl extends EntityImpl implements TemporalDynamic {
	/**
	 * The cached value of the '{@link #getInstantiatedFactor() <em>Instantiated Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedFactor()
	 * @generated
	 * @ordered
	 */
	protected TemplateFactor instantiatedFactor;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistribution distribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDynamicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicmodelPackage.Literals.TEMPORAL_DYNAMIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateFactor getInstantiatedFactor() {
		if (instantiatedFactor != null && instantiatedFactor.eIsProxy()) {
			InternalEObject oldInstantiatedFactor = (InternalEObject)instantiatedFactor;
			instantiatedFactor = (TemplateFactor)eResolveProxy(oldInstantiatedFactor);
			if (instantiatedFactor != oldInstantiatedFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR, oldInstantiatedFactor, instantiatedFactor));
			}
		}
		return instantiatedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateFactor basicGetInstantiatedFactor() {
		return instantiatedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiatedFactor(TemplateFactor newInstantiatedFactor) {
		TemplateFactor oldInstantiatedFactor = instantiatedFactor;
		instantiatedFactor = newInstantiatedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR, oldInstantiatedFactor, instantiatedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilityDistribution getDistribution() {
		if (distribution != null && distribution.eIsProxy()) {
			InternalEObject oldDistribution = (InternalEObject)distribution;
			distribution = (ProbabilityDistribution)eResolveProxy(oldDistribution);
			if (distribution != oldDistribution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION, oldDistribution, distribution));
			}
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistribution basicGetDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistribution(ProbabilityDistribution newDistribution) {
		ProbabilityDistribution oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR:
				if (resolve) return getInstantiatedFactor();
				return basicGetInstantiatedFactor();
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR:
				setInstantiatedFactor((TemplateFactor)newValue);
				return;
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION:
				setDistribution((ProbabilityDistribution)newValue);
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR:
				setInstantiatedFactor((TemplateFactor)null);
				return;
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION:
				setDistribution((ProbabilityDistribution)null);
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR:
				return instantiatedFactor != null;
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION:
				return distribution != null;
		}
		return super.eIsSet(featureID);
	}

} //TemporalDynamicImpl
