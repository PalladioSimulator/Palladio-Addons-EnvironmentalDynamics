/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;

import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InterTimeSliceInductionImpl#getTemporalStructure <em>Temporal Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterTimeSliceInductionImpl extends TimeSliceInductionImpl implements InterTimeSliceInduction {
	/**
	 * The cached value of the '{@link #getTemporalStructure() <em>Temporal Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemporalStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<TemporalRelation> temporalStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterTimeSliceInductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DynamicmodelPackage.Literals.INTER_TIME_SLICE_INDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TemporalRelation> getTemporalStructure() {
		if (temporalStructure == null) {
			temporalStructure = new EObjectResolvingEList<TemporalRelation>(TemporalRelation.class, this, DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE);
		}
		return temporalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE:
				return getTemporalStructure();
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
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE:
				getTemporalStructure().clear();
				getTemporalStructure().addAll((Collection<? extends TemporalRelation>)newValue);
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
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE:
				getTemporalStructure().clear();
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
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE:
				return temporalStructure != null && !temporalStructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterTimeSliceInductionImpl
