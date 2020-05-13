/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.envdyn.environment.staticmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticmodelFactoryImpl extends EFactoryImpl implements StaticmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticmodelFactory init() {
		try {
			StaticmodelFactory theStaticmodelFactory = (StaticmodelFactory)EPackage.Registry.INSTANCE.getEFactory(StaticmodelPackage.eNS_URI);
			if (theStaticmodelFactory != null) {
				return theStaticmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaticmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticmodelFactoryImpl() {
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
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE: return createGroundRandomVariable();
			case StaticmodelPackage.GROUND_PROBABILISTIC_MODEL: return createGroundProbabilisticModel();
			case StaticmodelPackage.PROBABILISTIC_MODEL_REPOSITORY: return createProbabilisticModelRepository();
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK: return createGroundProbabilisticNetwork();
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK: return createLocalProbabilisticNetwork();
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
	public GroundRandomVariable createGroundRandomVariable() {
		GroundRandomVariableImpl groundRandomVariable = new GroundRandomVariableImpl();
		return groundRandomVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundProbabilisticModel createGroundProbabilisticModel() {
		GroundProbabilisticModelImpl groundProbabilisticModel = new GroundProbabilisticModelImpl();
		return groundProbabilisticModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilisticModelRepository createProbabilisticModelRepository() {
		ProbabilisticModelRepositoryImpl probabilisticModelRepository = new ProbabilisticModelRepositoryImpl();
		return probabilisticModelRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroundProbabilisticNetwork createGroundProbabilisticNetwork() {
		GroundProbabilisticNetworkImpl groundProbabilisticNetwork = new GroundProbabilisticNetworkImpl();
		return groundProbabilisticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalProbabilisticNetwork createLocalProbabilisticNetwork() {
		LocalProbabilisticNetworkImpl localProbabilisticNetwork = new LocalProbabilisticNetworkImpl();
		return localProbabilisticNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticmodelPackage getStaticmodelPackage() {
		return (StaticmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaticmodelPackage getPackage() {
		return StaticmodelPackage.eINSTANCE;
	}

} //StaticmodelFactoryImpl
