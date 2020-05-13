/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory
 * @model kind="package"
 * @generated
 */
public interface StaticmodelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "staticmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/Environment/StaticModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "staticmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticmodelPackage eINSTANCE = org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl <em>Ground Random Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundRandomVariable()
	 * @generated
	 */
	int GROUND_RANDOM_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependence Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Descriptive Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__DESCRIPTIVE_MODEL = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applied Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ground Random Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ground Random Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_RANDOM_VARIABLE_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticModelImpl <em>Ground Probabilistic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticModelImpl
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundProbabilisticModel()
	 * @generated
	 */
	int GROUND_PROBABILISTIC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL__INSTANTIATED_FACTOR = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL__DISTRIBUTION = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Probabilistic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ground Probabilistic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_MODEL_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.ProbabilisticModelRepositoryImpl <em>Probabilistic Model Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.ProbabilisticModelRepositoryImpl
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getProbabilisticModelRepository()
	 * @generated
	 */
	int PROBABILISTIC_MODEL_REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_MODEL_REPOSITORY__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_MODEL_REPOSITORY__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_MODEL_REPOSITORY__MODELS = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabilistic Model Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_MODEL_REPOSITORY_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Probabilistic Model Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_MODEL_REPOSITORY_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl <em>Ground Probabilistic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundProbabilisticNetwork()
	 * @generated
	 */
	int GROUND_PROBABILISTIC_NETWORK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Local Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Probabilistic Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ground Probabilistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ground Probabilistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_PROBABILISTIC_NETWORK_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.LocalProbabilisticNetworkImpl <em>Local Probabilistic Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.LocalProbabilisticNetworkImpl
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getLocalProbabilisticNetwork()
	 * @generated
	 */
	int LOCAL_PROBABILISTIC_NETWORK = 4;

	/**
	 * The feature id for the '<em><b>Ground Random Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Local Probabilistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBABILISTIC_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Local Probabilistic Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_PROBABILISTIC_NETWORK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable <em>Ground Random Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Random Variable</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable
	 * @generated
	 */
	EClass getGroundRandomVariable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getInstantiatedTemplate <em>Instantiated Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Template</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getInstantiatedTemplate()
	 * @see #getGroundRandomVariable()
	 * @generated
	 */
	EReference getGroundRandomVariable_InstantiatedTemplate();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getDependenceStructure <em>Dependence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependence Structure</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getDependenceStructure()
	 * @see #getGroundRandomVariable()
	 * @generated
	 */
	EReference getGroundRandomVariable_DependenceStructure();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getDescriptiveModel <em>Descriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptive Model</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getDescriptiveModel()
	 * @see #getGroundRandomVariable()
	 * @generated
	 */
	EReference getGroundRandomVariable_DescriptiveModel();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getAppliedObjects <em>Applied Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Objects</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getAppliedObjects()
	 * @see #getGroundRandomVariable()
	 * @generated
	 */
	EReference getGroundRandomVariable_AppliedObjects();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel <em>Ground Probabilistic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Probabilistic Model</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel
	 * @generated
	 */
	EClass getGroundProbabilisticModel();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getInstantiatedFactor <em>Instantiated Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Factor</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getInstantiatedFactor()
	 * @see #getGroundProbabilisticModel()
	 * @generated
	 */
	EReference getGroundProbabilisticModel_InstantiatedFactor();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel#getDistribution()
	 * @see #getGroundProbabilisticModel()
	 * @generated
	 */
	EReference getGroundProbabilisticModel_Distribution();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository <em>Probabilistic Model Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Model Repository</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository
	 * @generated
	 */
	EClass getProbabilisticModelRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository#getModels()
	 * @see #getProbabilisticModelRepository()
	 * @generated
	 */
	EReference getProbabilisticModelRepository_Models();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork <em>Ground Probabilistic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Probabilistic Network</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork
	 * @generated
	 */
	EClass getGroundProbabilisticNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalModels <em>Local Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Models</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalModels()
	 * @see #getGroundProbabilisticNetwork()
	 * @generated
	 */
	EReference getGroundProbabilisticNetwork_LocalModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalProbabilisticModels <em>Local Probabilistic Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Probabilistic Models</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork#getLocalProbabilisticModels()
	 * @see #getGroundProbabilisticNetwork()
	 * @generated
	 */
	EReference getGroundProbabilisticNetwork_LocalProbabilisticModels();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork <em>Local Probabilistic Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Probabilistic Network</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork
	 * @generated
	 */
	EClass getLocalProbabilisticNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork#getGroundRandomVariables <em>Ground Random Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Random Variables</em>'.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork#getGroundRandomVariables()
	 * @see #getLocalProbabilisticNetwork()
	 * @generated
	 */
	EReference getLocalProbabilisticNetwork_GroundRandomVariables();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaticmodelFactory getStaticmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl <em>Ground Random Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundRandomVariable()
		 * @generated
		 */
		EClass GROUND_RANDOM_VARIABLE = eINSTANCE.getGroundRandomVariable();

		/**
		 * The meta object literal for the '<em><b>Instantiated Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE = eINSTANCE.getGroundRandomVariable_InstantiatedTemplate();

		/**
		 * The meta object literal for the '<em><b>Dependence Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE = eINSTANCE.getGroundRandomVariable_DependenceStructure();

		/**
		 * The meta object literal for the '<em><b>Descriptive Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_RANDOM_VARIABLE__DESCRIPTIVE_MODEL = eINSTANCE.getGroundRandomVariable_DescriptiveModel();

		/**
		 * The meta object literal for the '<em><b>Applied Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS = eINSTANCE.getGroundRandomVariable_AppliedObjects();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticModelImpl <em>Ground Probabilistic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticModelImpl
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundProbabilisticModel()
		 * @generated
		 */
		EClass GROUND_PROBABILISTIC_MODEL = eINSTANCE.getGroundProbabilisticModel();

		/**
		 * The meta object literal for the '<em><b>Instantiated Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_PROBABILISTIC_MODEL__INSTANTIATED_FACTOR = eINSTANCE.getGroundProbabilisticModel_InstantiatedFactor();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_PROBABILISTIC_MODEL__DISTRIBUTION = eINSTANCE.getGroundProbabilisticModel_Distribution();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.ProbabilisticModelRepositoryImpl <em>Probabilistic Model Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.ProbabilisticModelRepositoryImpl
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getProbabilisticModelRepository()
		 * @generated
		 */
		EClass PROBABILISTIC_MODEL_REPOSITORY = eINSTANCE.getProbabilisticModelRepository();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_MODEL_REPOSITORY__MODELS = eINSTANCE.getProbabilisticModelRepository_Models();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl <em>Ground Probabilistic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundProbabilisticNetworkImpl
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getGroundProbabilisticNetwork()
		 * @generated
		 */
		EClass GROUND_PROBABILISTIC_NETWORK = eINSTANCE.getGroundProbabilisticNetwork();

		/**
		 * The meta object literal for the '<em><b>Local Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS = eINSTANCE.getGroundProbabilisticNetwork_LocalModels();

		/**
		 * The meta object literal for the '<em><b>Local Probabilistic Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS = eINSTANCE.getGroundProbabilisticNetwork_LocalProbabilisticModels();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.LocalProbabilisticNetworkImpl <em>Local Probabilistic Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.LocalProbabilisticNetworkImpl
		 * @see org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl#getLocalProbabilisticNetwork()
		 * @generated
		 */
		EClass LOCAL_PROBABILISTIC_NETWORK = eINSTANCE.getLocalProbabilisticNetwork();

		/**
		 * The meta object literal for the '<em><b>Ground Random Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES = eINSTANCE.getLocalProbabilisticNetwork_GroundRandomVariables();

	}

} //StaticmodelPackage
