/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory
 * @model kind="package"
 * @generated
 */
public interface TemplatevariablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "templatevariable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://palladiosimulator.org/Environment/TemplateVariable/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "templatevariable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemplatevariablePackage eINSTANCE = org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl <em>Template Variable Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariableDefinitions()
	 * @generated
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__FACTORS = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__RELATION = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Template Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS = IdentifierPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Template Variable Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Template Variable Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_DEFINITIONS_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableImpl <em>Template Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariable()
	 * @generated
	 */
	int TEMPLATE_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE__SIGNATURE = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE__REFINES = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl <em>Template Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateFactor()
	 * @generated
	 */
	int TEMPLATE_FACTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR__SCOPE = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR__TEMPORAL = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Template Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FACTOR_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.ArgumentImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.RelationImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.ProbabilisticTemplateFactorImpl <em>Probabilistic Template Factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.ProbabilisticTemplateFactorImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getProbabilisticTemplateFactor()
	 * @generated
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR__ID = TEMPLATE_FACTOR__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR__ENTITY_NAME = TEMPLATE_FACTOR__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR__SCOPE = TEMPLATE_FACTOR__SCOPE;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR__TEMPORAL = TEMPLATE_FACTOR__TEMPORAL;

	/**
	 * The feature id for the '<em><b>Distribution Family</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY = TEMPLATE_FACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Probabilistic Template Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR_FEATURE_COUNT = TEMPLATE_FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Probabilistic Template Factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBABILISTIC_TEMPLATE_FACTOR_OPERATION_COUNT = TEMPLATE_FACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl <em>Dependence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getDependenceRelation()
	 * @generated
	 */
	int DEPENDENCE_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION__TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION__TARGET = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION__SOURCE = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contingent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION__CONTINGENT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dependence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Dependence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCE_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemporalRelationImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemporalRelation()
	 * @generated
	 */
	int TEMPORAL_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION__ENTITY_NAME = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temporal Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_RELATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.PersistenceRelationImpl <em>Persistence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.PersistenceRelationImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getPersistenceRelation()
	 * @generated
	 */
	int PERSISTENCE_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_RELATION__ENTITY_NAME = TEMPORAL_RELATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Interface Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_RELATION__INTERFACE_VARIABLE = TEMPORAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persistence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_RELATION_FEATURE_COUNT = TEMPORAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persistence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_RELATION_OPERATION_COUNT = TEMPORAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl <em>Time Slice Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTimeSliceRelation()
	 * @generated
	 */
	int TIME_SLICE_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_RELATION__ENTITY_NAME = TEMPORAL_RELATION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_RELATION__SOURCE = TEMPORAL_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_RELATION__TARGET = TEMPORAL_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Slice Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_RELATION_FEATURE_COUNT = TEMPORAL_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Time Slice Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLICE_RELATION_OPERATION_COUNT = TEMPORAL_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableGroupImpl <em>Template Variable Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableGroupImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariableGroup()
	 * @generated
	 */
	int TEMPLATE_VARIABLE_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_GROUP__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Grouped Templates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Variable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_GROUP_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Variable Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_VARIABLE_GROUP_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.LogicalVariableImpl <em>Logical Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.LogicalVariableImpl
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getLogicalVariable()
	 * @generated
	 */
	int LOGICAL_VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VARIABLE__ARGUMENT = 0;

	/**
	 * The number of structural features of the '<em>Logical Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Logical Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceType <em>Dependence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceType
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getDependenceType()
	 * @generated
	 */
	int DEPENDENCE_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions <em>Template Variable Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Variable Definitions</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions
	 * @generated
	 */
	EClass getTemplateVariableDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getVariables()
	 * @see #getTemplateVariableDefinitions()
	 * @generated
	 */
	EReference getTemplateVariableDefinitions_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getFactors <em>Factors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Factors</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getFactors()
	 * @see #getTemplateVariableDefinitions()
	 * @generated
	 */
	EReference getTemplateVariableDefinitions_Factors();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getArguments()
	 * @see #getTemplateVariableDefinitions()
	 * @generated
	 */
	EReference getTemplateVariableDefinitions_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getRelation()
	 * @see #getTemplateVariableDefinitions()
	 * @generated
	 */
	EReference getTemplateVariableDefinitions_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getTemplateGroups <em>Template Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Groups</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions#getTemplateGroups()
	 * @see #getTemplateVariableDefinitions()
	 * @generated
	 */
	EReference getTemplateVariableDefinitions_TemplateGroups();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable <em>Template Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Variable</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable
	 * @generated
	 */
	EClass getTemplateVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signature</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getSignature()
	 * @see #getTemplateVariable()
	 * @generated
	 */
	EReference getTemplateVariable_Signature();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refines</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable#getRefines()
	 * @see #getTemplateVariable()
	 * @generated
	 */
	EReference getTemplateVariable_Refines();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor <em>Template Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Factor</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor
	 * @generated
	 */
	EClass getTemplateFactor();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scope</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#getScope()
	 * @see #getTemplateFactor()
	 * @generated
	 */
	EReference getTemplateFactor_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#isTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temporal</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor#isTemporal()
	 * @see #getTemplateFactor()
	 * @generated
	 */
	EAttribute getTemplateFactor_Temporal();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor <em>Probabilistic Template Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probabilistic Template Factor</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor
	 * @generated
	 */
	EClass getProbabilisticTemplateFactor();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor#getDistributionFamily <em>Distribution Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution Family</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor#getDistributionFamily()
	 * @see #getProbabilisticTemplateFactor()
	 * @generated
	 */
	EReference getProbabilisticTemplateFactor_DistributionFamily();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation <em>Dependence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependence Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation
	 * @generated
	 */
	EClass getDependenceRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getType()
	 * @see #getDependenceRelation()
	 * @generated
	 */
	EAttribute getDependenceRelation_Type();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getTarget()
	 * @see #getDependenceRelation()
	 * @generated
	 */
	EReference getDependenceRelation_Target();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#getSource()
	 * @see #getDependenceRelation()
	 * @generated
	 */
	EReference getDependenceRelation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#isContingent <em>Contingent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contingent</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation#isContingent()
	 * @see #getDependenceRelation()
	 * @generated
	 */
	EAttribute getDependenceRelation_Contingent();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation <em>Temporal Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation
	 * @generated
	 */
	EClass getTemporalRelation();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation <em>Persistence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistence Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation
	 * @generated
	 */
	EClass getPersistenceRelation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation#getInterfaceVariable <em>Interface Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Variable</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation#getInterfaceVariable()
	 * @see #getPersistenceRelation()
	 * @generated
	 */
	EReference getPersistenceRelation_InterfaceVariable();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation <em>Time Slice Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slice Relation</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation
	 * @generated
	 */
	EClass getTimeSliceRelation();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getSource()
	 * @see #getTimeSliceRelation()
	 * @generated
	 */
	EReference getTimeSliceRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation#getTarget()
	 * @see #getTimeSliceRelation()
	 * @generated
	 */
	EReference getTimeSliceRelation_Target();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup <em>Template Variable Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Variable Group</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup
	 * @generated
	 */
	EClass getTemplateVariableGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup#getGroupedTemplates <em>Grouped Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Templates</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup#getGroupedTemplates()
	 * @see #getTemplateVariableGroup()
	 * @generated
	 */
	EReference getTemplateVariableGroup_GroupedTemplates();

	/**
	 * Returns the meta object for class '{@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable <em>Logical Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Variable</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable
	 * @generated
	 */
	EClass getLogicalVariable();

	/**
	 * Returns the meta object for the reference '{@link org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argument</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable#getArgument()
	 * @see #getLogicalVariable()
	 * @generated
	 */
	EReference getLogicalVariable_Argument();

	/**
	 * Returns the meta object for enum '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceType <em>Dependence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependence Type</em>'.
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceType
	 * @generated
	 */
	EEnum getDependenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemplatevariableFactory getTemplatevariableFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl <em>Template Variable Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableDefinitionsImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariableDefinitions()
		 * @generated
		 */
		EClass TEMPLATE_VARIABLE_DEFINITIONS = eINSTANCE.getTemplateVariableDefinitions();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES = eINSTANCE.getTemplateVariableDefinitions_Variables();

		/**
		 * The meta object literal for the '<em><b>Factors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_DEFINITIONS__FACTORS = eINSTANCE.getTemplateVariableDefinitions_Factors();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS = eINSTANCE.getTemplateVariableDefinitions_Arguments();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_DEFINITIONS__RELATION = eINSTANCE.getTemplateVariableDefinitions_Relation();

		/**
		 * The meta object literal for the '<em><b>Template Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS = eINSTANCE.getTemplateVariableDefinitions_TemplateGroups();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableImpl <em>Template Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariable()
		 * @generated
		 */
		EClass TEMPLATE_VARIABLE = eINSTANCE.getTemplateVariable();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE__SIGNATURE = eINSTANCE.getTemplateVariable_Signature();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE__REFINES = eINSTANCE.getTemplateVariable_Refines();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl <em>Template Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateFactorImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateFactor()
		 * @generated
		 */
		EClass TEMPLATE_FACTOR = eINSTANCE.getTemplateFactor();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_FACTOR__SCOPE = eINSTANCE.getTemplateFactor_Scope();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_FACTOR__TEMPORAL = eINSTANCE.getTemplateFactor_Temporal();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.ArgumentImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.RelationImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.ProbabilisticTemplateFactorImpl <em>Probabilistic Template Factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.ProbabilisticTemplateFactorImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getProbabilisticTemplateFactor()
		 * @generated
		 */
		EClass PROBABILISTIC_TEMPLATE_FACTOR = eINSTANCE.getProbabilisticTemplateFactor();

		/**
		 * The meta object literal for the '<em><b>Distribution Family</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY = eINSTANCE.getProbabilisticTemplateFactor_DistributionFamily();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl <em>Dependence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.DependenceRelationImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getDependenceRelation()
		 * @generated
		 */
		EClass DEPENDENCE_RELATION = eINSTANCE.getDependenceRelation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE_RELATION__TYPE = eINSTANCE.getDependenceRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE_RELATION__TARGET = eINSTANCE.getDependenceRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCE_RELATION__SOURCE = eINSTANCE.getDependenceRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Contingent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCE_RELATION__CONTINGENT = eINSTANCE.getDependenceRelation_Contingent();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemporalRelationImpl <em>Temporal Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemporalRelationImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemporalRelation()
		 * @generated
		 */
		EClass TEMPORAL_RELATION = eINSTANCE.getTemporalRelation();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.PersistenceRelationImpl <em>Persistence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.PersistenceRelationImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getPersistenceRelation()
		 * @generated
		 */
		EClass PERSISTENCE_RELATION = eINSTANCE.getPersistenceRelation();

		/**
		 * The meta object literal for the '<em><b>Interface Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENCE_RELATION__INTERFACE_VARIABLE = eINSTANCE.getPersistenceRelation_InterfaceVariable();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl <em>Time Slice Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TimeSliceRelationImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTimeSliceRelation()
		 * @generated
		 */
		EClass TIME_SLICE_RELATION = eINSTANCE.getTimeSliceRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLICE_RELATION__SOURCE = eINSTANCE.getTimeSliceRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLICE_RELATION__TARGET = eINSTANCE.getTimeSliceRelation_Target();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableGroupImpl <em>Template Variable Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplateVariableGroupImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getTemplateVariableGroup()
		 * @generated
		 */
		EClass TEMPLATE_VARIABLE_GROUP = eINSTANCE.getTemplateVariableGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Templates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES = eINSTANCE.getTemplateVariableGroup_GroupedTemplates();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.impl.LogicalVariableImpl <em>Logical Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.LogicalVariableImpl
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getLogicalVariable()
		 * @generated
		 */
		EClass LOGICAL_VARIABLE = eINSTANCE.getLogicalVariable();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_VARIABLE__ARGUMENT = eINSTANCE.getLogicalVariable_Argument();

		/**
		 * The meta object literal for the '{@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceType <em>Dependence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.DependenceType
		 * @see org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl#getDependenceType()
		 * @generated
		 */
		EEnum DEPENDENCE_TYPE = eINSTANCE.getDependenceType();

	}

} //TemplatevariablePackage
