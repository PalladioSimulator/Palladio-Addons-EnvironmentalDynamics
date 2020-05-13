/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.envdyn.environment.dynamicmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicmodelFactoryImpl extends EFactoryImpl implements DynamicmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DynamicmodelFactory init() {
		try {
			DynamicmodelFactory theDynamicmodelFactory = (DynamicmodelFactory)EPackage.Registry.INSTANCE.getEFactory(DynamicmodelPackage.eNS_URI);
			if (theDynamicmodelFactory != null) {
				return theDynamicmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DynamicmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY: return createDynamicBehaviourRepository();
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION: return createDynamicBehaviourExtension();
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR: return createInductiveDynamicBehaviour();
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION: return createInterTimeSliceInduction();
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION: return createIntraTimeSliceInduction();
			case DynamicmodelPackage.TEMPORAL_DYNAMIC: return createTemporalDynamic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicBehaviourRepository createDynamicBehaviourRepository() {
		DynamicBehaviourRepositoryImpl dynamicBehaviourRepository = new DynamicBehaviourRepositoryImpl();
		return dynamicBehaviourRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicBehaviourExtension createDynamicBehaviourExtension() {
		DynamicBehaviourExtensionImpl dynamicBehaviourExtension = new DynamicBehaviourExtensionImpl();
		return dynamicBehaviourExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InductiveDynamicBehaviour createInductiveDynamicBehaviour() {
		InductiveDynamicBehaviourImpl inductiveDynamicBehaviour = new InductiveDynamicBehaviourImpl();
		return inductiveDynamicBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterTimeSliceInduction createInterTimeSliceInduction() {
		InterTimeSliceInductionImpl interTimeSliceInduction = new InterTimeSliceInductionImpl();
		return interTimeSliceInduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntraTimeSliceInduction createIntraTimeSliceInduction() {
		IntraTimeSliceInductionImpl intraTimeSliceInduction = new IntraTimeSliceInductionImpl();
		return intraTimeSliceInduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDynamic createTemporalDynamic() {
		TemporalDynamicImpl temporalDynamic = new TemporalDynamicImpl();
		return temporalDynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicmodelPackage getDynamicmodelPackage() {
		return (DynamicmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DynamicmodelPackage getPackage() {
		return DynamicmodelPackage.eINSTANCE;
	}

} //DynamicmodelFactoryImpl
