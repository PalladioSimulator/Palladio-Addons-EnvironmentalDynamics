/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel;

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
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory
 * @model kind="package"
 * @generated
 */
public interface DynamicmodelPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dynamicmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/Environment/DynamicModel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dynamicmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DynamicmodelPackage eINSTANCE = org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourRepositoryImpl <em>Dynamic Behaviour Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourRepositoryImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviourRepository()
	 * @generated
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Behaviour Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Behaviour Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_REPOSITORY_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl <em>Dynamic Behaviour Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviourExtension()
	 * @generated
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION__MODEL = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dynamic Behaviour Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dynamic Behaviour Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_EXTENSION_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourImpl <em>Dynamic Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviour()
	 * @generated
	 */
	int DYNAMIC_BEHAVIOUR = 2;

	/**
	 * The feature id for the '<em><b>Local Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR__LOCAL_MODELS = 0;

	/**
	 * The number of structural features of the '<em>Dynamic Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dynamic Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InductiveDynamicBehaviourImpl <em>Inductive Dynamic Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InductiveDynamicBehaviourImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getInductiveDynamicBehaviour()
	 * @generated
	 */
	int INDUCTIVE_DYNAMIC_BEHAVIOUR = 3;

	/**
	 * The feature id for the '<em><b>Local Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_DYNAMIC_BEHAVIOUR__LOCAL_MODELS = DYNAMIC_BEHAVIOUR__LOCAL_MODELS;

	/**
	 * The feature id for the '<em><b>Time Slice Inductions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS = DYNAMIC_BEHAVIOUR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inductive Dynamic Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_DYNAMIC_BEHAVIOUR_FEATURE_COUNT = DYNAMIC_BEHAVIOUR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inductive Dynamic Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDUCTIVE_DYNAMIC_BEHAVIOUR_OPERATION_COUNT = DYNAMIC_BEHAVIOUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl <em>Time Slice Induction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getTimeSliceInduction()
	 * @generated
	 */
	int TIME_SLICE_INDUCTION = 7;

	/**
	 * The feature id for the '<em><b>Descriptive Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Applied Ground Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_INDUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_INDUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InterTimeSliceInductionImpl <em>Inter Time Slice Induction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InterTimeSliceInductionImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getInterTimeSliceInduction()
	 * @generated
	 */
	int INTER_TIME_SLICE_INDUCTION = 4;

	/**
	 * The feature id for the '<em><b>Descriptive Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL = TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL;

	/**
	 * The feature id for the '<em><b>Applied Ground Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE = TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE;

	/**
	 * The feature id for the '<em><b>Temporal Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE = TIME_SLICE_INDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inter Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TIME_SLICE_INDUCTION_FEATURE_COUNT = TIME_SLICE_INDUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Inter Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_TIME_SLICE_INDUCTION_OPERATION_COUNT = TIME_SLICE_INDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.IntraTimeSliceInductionImpl <em>Intra Time Slice Induction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.IntraTimeSliceInductionImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getIntraTimeSliceInduction()
	 * @generated
	 */
	int INTRA_TIME_SLICE_INDUCTION = 5;

	/**
	 * The feature id for the '<em><b>Descriptive Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL = TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL;

	/**
	 * The feature id for the '<em><b>Applied Ground Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE = TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE;

	/**
	 * The feature id for the '<em><b>Dependence Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE = TIME_SLICE_INDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intra Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_TIME_SLICE_INDUCTION_FEATURE_COUNT = TIME_SLICE_INDUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Intra Time Slice Induction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRA_TIME_SLICE_INDUCTION_OPERATION_COUNT = TIME_SLICE_INDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl <em>Temporal Dynamic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getTemporalDynamic()
	 * @generated
	 */
	int TEMPORAL_DYNAMIC = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Instantiated Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distribution Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temporal Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Temporal Dynamic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_DYNAMIC_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository <em>Dynamic Behaviour Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Behaviour Repository</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository
	 * @generated
	 */
	EClass getDynamicBehaviourRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository#getExtensions()
	 * @see #getDynamicBehaviourRepository()
	 * @generated
	 */
	EReference getDynamicBehaviourRepository_Extensions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension <em>Dynamic Behaviour Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Behaviour Extension</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension
	 * @generated
	 */
	EClass getDynamicBehaviourExtension();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getModel()
	 * @see #getDynamicBehaviourExtension()
	 * @generated
	 */
	EReference getDynamicBehaviourExtension_Model();

	/**
	 * Returns the meta object for the containment reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension#getBehaviour()
	 * @see #getDynamicBehaviourExtension()
	 * @generated
	 */
	EReference getDynamicBehaviourExtension_Behaviour();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour <em>Dynamic Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Behaviour</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour
	 * @generated
	 */
	EClass getDynamicBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour#getLocalModels <em>Local Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Models</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour#getLocalModels()
	 * @see #getDynamicBehaviour()
	 * @generated
	 */
	EReference getDynamicBehaviour_LocalModels();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour <em>Inductive Dynamic Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inductive Dynamic Behaviour</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour
	 * @generated
	 */
	EClass getInductiveDynamicBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour#getTimeSliceInductions <em>Time Slice Inductions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Slice Inductions</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour#getTimeSliceInductions()
	 * @see #getInductiveDynamicBehaviour()
	 * @generated
	 */
	EReference getInductiveDynamicBehaviour_TimeSliceInductions();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction <em>Inter Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Time Slice Induction</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction
	 * @generated
	 */
	EClass getInterTimeSliceInduction();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction#getTemporalStructure <em>Temporal Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Temporal Structure</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction#getTemporalStructure()
	 * @see #getInterTimeSliceInduction()
	 * @generated
	 */
	EReference getInterTimeSliceInduction_TemporalStructure();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction <em>Intra Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intra Time Slice Induction</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction
	 * @generated
	 */
	EClass getIntraTimeSliceInduction();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction#getDependenceStructure <em>Dependence Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependence Structure</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction#getDependenceStructure()
	 * @see #getIntraTimeSliceInduction()
	 * @generated
	 */
	EReference getIntraTimeSliceInduction_DependenceStructure();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic <em>Temporal Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Dynamic</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic
	 * @generated
	 */
	EClass getTemporalDynamic();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getInstantiatedFactor <em>Instantiated Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instantiated Factor</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getInstantiatedFactor()
	 * @see #getTemporalDynamic()
	 * @generated
	 */
	EReference getTemporalDynamic_InstantiatedFactor();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistributionFunction <em>Distribution Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution Function</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic#getDistributionFunction()
	 * @see #getTemporalDynamic()
	 * @generated
	 */
	EReference getTemporalDynamic_DistributionFunction();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction <em>Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slice Induction</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction
	 * @generated
	 */
	EClass getTimeSliceInduction();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getDescriptiveModel <em>Descriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptive Model</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getDescriptiveModel()
	 * @see #getTimeSliceInduction()
	 * @generated
	 */
	EReference getTimeSliceInduction_DescriptiveModel();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getAppliedGroundVariable <em>Applied Ground Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applied Ground Variable</em>'.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction#getAppliedGroundVariable()
	 * @see #getTimeSliceInduction()
	 * @generated
	 */
	EReference getTimeSliceInduction_AppliedGroundVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DynamicmodelFactory getDynamicmodelFactory();

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
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourRepositoryImpl <em>Dynamic Behaviour Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourRepositoryImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviourRepository()
		 * @generated
		 */
		EClass DYNAMIC_BEHAVIOUR_REPOSITORY = eINSTANCE.getDynamicBehaviourRepository();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS = eINSTANCE.getDynamicBehaviourRepository_Extensions();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl <em>Dynamic Behaviour Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourExtensionImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviourExtension()
		 * @generated
		 */
		EClass DYNAMIC_BEHAVIOUR_EXTENSION = eINSTANCE.getDynamicBehaviourExtension();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOUR_EXTENSION__MODEL = eINSTANCE.getDynamicBehaviourExtension_Model();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR = eINSTANCE.getDynamicBehaviourExtension_Behaviour();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourImpl <em>Dynamic Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicBehaviourImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getDynamicBehaviour()
		 * @generated
		 */
		EClass DYNAMIC_BEHAVIOUR = eINSTANCE.getDynamicBehaviour();

		/**
		 * The meta object literal for the '<em><b>Local Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_BEHAVIOUR__LOCAL_MODELS = eINSTANCE.getDynamicBehaviour_LocalModels();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InductiveDynamicBehaviourImpl <em>Inductive Dynamic Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InductiveDynamicBehaviourImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getInductiveDynamicBehaviour()
		 * @generated
		 */
		EClass INDUCTIVE_DYNAMIC_BEHAVIOUR = eINSTANCE.getInductiveDynamicBehaviour();

		/**
		 * The meta object literal for the '<em><b>Time Slice Inductions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS = eINSTANCE.getInductiveDynamicBehaviour_TimeSliceInductions();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InterTimeSliceInductionImpl <em>Inter Time Slice Induction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.InterTimeSliceInductionImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getInterTimeSliceInduction()
		 * @generated
		 */
		EClass INTER_TIME_SLICE_INDUCTION = eINSTANCE.getInterTimeSliceInduction();

		/**
		 * The meta object literal for the '<em><b>Temporal Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE = eINSTANCE.getInterTimeSliceInduction_TemporalStructure();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.IntraTimeSliceInductionImpl <em>Intra Time Slice Induction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.IntraTimeSliceInductionImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getIntraTimeSliceInduction()
		 * @generated
		 */
		EClass INTRA_TIME_SLICE_INDUCTION = eINSTANCE.getIntraTimeSliceInduction();

		/**
		 * The meta object literal for the '<em><b>Dependence Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE = eINSTANCE.getIntraTimeSliceInduction_DependenceStructure();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl <em>Temporal Dynamic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TemporalDynamicImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getTemporalDynamic()
		 * @generated
		 */
		EClass TEMPORAL_DYNAMIC = eINSTANCE.getTemporalDynamic();

		/**
		 * The meta object literal for the '<em><b>Instantiated Factor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR = eINSTANCE.getTemporalDynamic_InstantiatedFactor();

		/**
		 * The meta object literal for the '<em><b>Distribution Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION = eINSTANCE.getTemporalDynamic_DistributionFunction();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl <em>Time Slice Induction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.TimeSliceInductionImpl
		 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl#getTimeSliceInduction()
		 * @generated
		 */
		EClass TIME_SLICE_INDUCTION = eINSTANCE.getTimeSliceInduction();

		/**
		 * The meta object literal for the '<em><b>Descriptive Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL = eINSTANCE.getTimeSliceInduction_DescriptiveModel();

		/**
		 * The meta object literal for the '<em><b>Applied Ground Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE = eINSTANCE.getTimeSliceInduction_AppliedGroundVariable();

	}

} //DynamicmodelPackage
