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
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl#getDistributionFunction <em>Distribution Function</em>}</li>
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
	 * The cached value of the '{@link #getDistributionFunction() <em>Distribution Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionFunction()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistribution distributionFunction;

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
	public ProbabilityDistribution getDistributionFunction() {
		if (distributionFunction != null && distributionFunction.eIsProxy()) {
			InternalEObject oldDistributionFunction = (InternalEObject)distributionFunction;
			distributionFunction = (ProbabilityDistribution)eResolveProxy(oldDistributionFunction);
			if (distributionFunction != oldDistributionFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION, oldDistributionFunction, distributionFunction));
			}
		}
		return distributionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistribution basicGetDistributionFunction() {
		return distributionFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionFunction(ProbabilityDistribution newDistributionFunction) {
		ProbabilityDistribution oldDistributionFunction = distributionFunction;
		distributionFunction = newDistributionFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION, oldDistributionFunction, distributionFunction));
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION:
				if (resolve) return getDistributionFunction();
				return basicGetDistributionFunction();
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION:
				setDistributionFunction((ProbabilityDistribution)newValue);
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION:
				setDistributionFunction((ProbabilityDistribution)null);
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
			case DynamicmodelPackage.TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION:
				return distributionFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //TemporalDynamicImpl
