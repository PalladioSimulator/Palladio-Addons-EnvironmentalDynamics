/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intra Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.IntraTimeSliceInductionImpl#getDependenceStructure <em>Dependence Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntraTimeSliceInductionImpl extends TimeSliceInductionImpl implements IntraTimeSliceInduction
{
	/**
	 * The cached value of the '{@link #getDependenceStructure() <em>Dependence Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenceStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<DependenceRelation> dependenceStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntraTimeSliceInductionImpl()
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
		return DynamicmodelPackage.Literals.INTRA_TIME_SLICE_INDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependenceRelation> getDependenceStructure()
	{
		if (dependenceStructure == null) {
			dependenceStructure = new EObjectResolvingEList<DependenceRelation>(DependenceRelation.class, this, DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE);
		}
		return dependenceStructure;
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
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE:
				return getDependenceStructure();
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
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE:
				getDependenceStructure().clear();
				getDependenceStructure().addAll((Collection<? extends DependenceRelation>)newValue);
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
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE:
				getDependenceStructure().clear();
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
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE:
				return dependenceStructure != null && !dependenceStructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntraTimeSliceInductionImpl
