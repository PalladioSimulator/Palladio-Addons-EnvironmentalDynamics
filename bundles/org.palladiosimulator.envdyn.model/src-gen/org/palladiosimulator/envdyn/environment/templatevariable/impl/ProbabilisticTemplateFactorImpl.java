/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import tools.mdsd.probdist.distributiontype.ProbabilityDistributionSkeleton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Template Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.ProbabilisticTemplateFactorImpl#getDistributionFamily <em>Distribution Family</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticTemplateFactorImpl extends TemplateFactorImpl implements ProbabilisticTemplateFactor {
	/**
	 * The cached value of the '{@link #getDistributionFamily() <em>Distribution Family</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionFamily()
	 * @generated
	 * @ordered
	 */
	protected ProbabilityDistributionSkeleton distributionFamily;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticTemplateFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemplatevariablePackage.Literals.PROBABILISTIC_TEMPLATE_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilityDistributionSkeleton getDistributionFamily() {
		if (distributionFamily != null && distributionFamily.eIsProxy()) {
			InternalEObject oldDistributionFamily = (InternalEObject)distributionFamily;
			distributionFamily = (ProbabilityDistributionSkeleton)eResolveProxy(oldDistributionFamily);
			if (distributionFamily != oldDistributionFamily) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY, oldDistributionFamily, distributionFamily));
			}
		}
		return distributionFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilityDistributionSkeleton basicGetDistributionFamily() {
		return distributionFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistributionFamily(ProbabilityDistributionSkeleton newDistributionFamily) {
		ProbabilityDistributionSkeleton oldDistributionFamily = distributionFamily;
		distributionFamily = newDistributionFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY, oldDistributionFamily, distributionFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY:
				if (resolve) return getDistributionFamily();
				return basicGetDistributionFamily();
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
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY:
				setDistributionFamily((ProbabilityDistributionSkeleton)newValue);
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
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY:
				setDistributionFamily((ProbabilityDistributionSkeleton)null);
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
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY:
				return distributionFamily != null;
		}
		return super.eIsSet(featureID);
	}

} //ProbabilisticTemplateFactorImpl
