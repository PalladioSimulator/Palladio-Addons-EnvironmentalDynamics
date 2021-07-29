/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;

import org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl;

import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.Argument;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.DependenceType;
import org.palladiosimulator.envdyn.environment.templatevariable.LogicalVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.Relation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableDefinitions;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariableGroup;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;
import org.palladiosimulator.envdyn.environment.templatevariable.TemporalRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

import tools.mdsd.probdist.distributionfunction.DistributionfunctionPackage;

import tools.mdsd.probdist.distributiontype.DistributiontypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatevariablePackageImpl extends EPackageImpl implements TemplatevariablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateVariableDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticTemplateFactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSliceRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateVariableGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemplatevariablePackageImpl() {
		super(eNS_URI, TemplatevariableFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TemplatevariablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TemplatevariablePackage init() {
		if (isInited) return (TemplatevariablePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatevariablePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTemplatevariablePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TemplatevariablePackageImpl theTemplatevariablePackage = registeredTemplatevariablePackage instanceof TemplatevariablePackageImpl ? (TemplatevariablePackageImpl)registeredTemplatevariablePackage : new TemplatevariablePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		DistributiontypePackage.eINSTANCE.eClass();
		DistributionfunctionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StaticmodelPackage.eNS_URI);
		StaticmodelPackageImpl theStaticmodelPackage = (StaticmodelPackageImpl)(registeredPackage instanceof StaticmodelPackageImpl ? registeredPackage : StaticmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamicmodelPackage.eNS_URI);
		DynamicmodelPackageImpl theDynamicmodelPackage = (DynamicmodelPackageImpl)(registeredPackage instanceof DynamicmodelPackageImpl ? registeredPackage : DynamicmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theTemplatevariablePackage.createPackageContents();
		theStaticmodelPackage.createPackageContents();
		theDynamicmodelPackage.createPackageContents();

		// Initialize created meta-data
		theTemplatevariablePackage.initializePackageContents();
		theStaticmodelPackage.initializePackageContents();
		theDynamicmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTemplatevariablePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TemplatevariablePackage.eNS_URI, theTemplatevariablePackage);
		return theTemplatevariablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateVariableDefinitions() {
		return templateVariableDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableDefinitions_Variables() {
		return (EReference)templateVariableDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableDefinitions_Factors() {
		return (EReference)templateVariableDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableDefinitions_Arguments() {
		return (EReference)templateVariableDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableDefinitions_Relation() {
		return (EReference)templateVariableDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableDefinitions_TemplateGroups() {
		return (EReference)templateVariableDefinitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateVariable() {
		return templateVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariable_Signature() {
		return (EReference)templateVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariable_Refines() {
		return (EReference)templateVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateFactor() {
		return templateFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateFactor_Scope() {
		return (EReference)templateFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemplateFactor_Temporal() {
		return (EAttribute)templateFactorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilisticTemplateFactor() {
		return probabilisticTemplateFactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbabilisticTemplateFactor_DistributionFamily() {
		return (EReference)probabilisticTemplateFactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependenceRelation() {
		return dependenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependenceRelation_Type() {
		return (EAttribute)dependenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependenceRelation_Target() {
		return (EReference)dependenceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependenceRelation_Source() {
		return (EReference)dependenceRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependenceRelation_Contingent() {
		return (EAttribute)dependenceRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalRelation() {
		return temporalRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersistenceRelation() {
		return persistenceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPersistenceRelation_InterfaceVariable() {
		return (EReference)persistenceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSliceRelation() {
		return timeSliceRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeSliceRelation_Source() {
		return (EReference)timeSliceRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeSliceRelation_Target() {
		return (EReference)timeSliceRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemplateVariableGroup() {
		return templateVariableGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemplateVariableGroup_GroupedTemplates() {
		return (EReference)templateVariableGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalVariable() {
		return logicalVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLogicalVariable_Argument() {
		return (EReference)logicalVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDependenceType() {
		return dependenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatevariableFactory getTemplatevariableFactory() {
		return (TemplatevariableFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		templateVariableDefinitionsEClass = createEClass(TEMPLATE_VARIABLE_DEFINITIONS);
		createEReference(templateVariableDefinitionsEClass, TEMPLATE_VARIABLE_DEFINITIONS__VARIABLES);
		createEReference(templateVariableDefinitionsEClass, TEMPLATE_VARIABLE_DEFINITIONS__FACTORS);
		createEReference(templateVariableDefinitionsEClass, TEMPLATE_VARIABLE_DEFINITIONS__ARGUMENTS);
		createEReference(templateVariableDefinitionsEClass, TEMPLATE_VARIABLE_DEFINITIONS__RELATION);
		createEReference(templateVariableDefinitionsEClass, TEMPLATE_VARIABLE_DEFINITIONS__TEMPLATE_GROUPS);

		templateVariableEClass = createEClass(TEMPLATE_VARIABLE);
		createEReference(templateVariableEClass, TEMPLATE_VARIABLE__SIGNATURE);
		createEReference(templateVariableEClass, TEMPLATE_VARIABLE__REFINES);

		templateFactorEClass = createEClass(TEMPLATE_FACTOR);
		createEReference(templateFactorEClass, TEMPLATE_FACTOR__SCOPE);
		createEAttribute(templateFactorEClass, TEMPLATE_FACTOR__TEMPORAL);

		argumentEClass = createEClass(ARGUMENT);

		relationEClass = createEClass(RELATION);

		probabilisticTemplateFactorEClass = createEClass(PROBABILISTIC_TEMPLATE_FACTOR);
		createEReference(probabilisticTemplateFactorEClass, PROBABILISTIC_TEMPLATE_FACTOR__DISTRIBUTION_FAMILY);

		dependenceRelationEClass = createEClass(DEPENDENCE_RELATION);
		createEAttribute(dependenceRelationEClass, DEPENDENCE_RELATION__TYPE);
		createEReference(dependenceRelationEClass, DEPENDENCE_RELATION__TARGET);
		createEReference(dependenceRelationEClass, DEPENDENCE_RELATION__SOURCE);
		createEAttribute(dependenceRelationEClass, DEPENDENCE_RELATION__CONTINGENT);

		temporalRelationEClass = createEClass(TEMPORAL_RELATION);

		persistenceRelationEClass = createEClass(PERSISTENCE_RELATION);
		createEReference(persistenceRelationEClass, PERSISTENCE_RELATION__INTERFACE_VARIABLE);

		timeSliceRelationEClass = createEClass(TIME_SLICE_RELATION);
		createEReference(timeSliceRelationEClass, TIME_SLICE_RELATION__SOURCE);
		createEReference(timeSliceRelationEClass, TIME_SLICE_RELATION__TARGET);

		templateVariableGroupEClass = createEClass(TEMPLATE_VARIABLE_GROUP);
		createEReference(templateVariableGroupEClass, TEMPLATE_VARIABLE_GROUP__GROUPED_TEMPLATES);

		logicalVariableEClass = createEClass(LOGICAL_VARIABLE);
		createEReference(logicalVariableEClass, LOGICAL_VARIABLE__ARGUMENT);

		// Create enums
		dependenceTypeEEnum = createEEnum(DEPENDENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		DistributiontypePackage theDistributiontypePackage = (DistributiontypePackage)EPackage.Registry.INSTANCE.getEPackage(DistributiontypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		templateVariableDefinitionsEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		templateVariableEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		templateFactorEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		argumentEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		probabilisticTemplateFactorEClass.getESuperTypes().add(this.getTemplateFactor());
		dependenceRelationEClass.getESuperTypes().add(this.getRelation());
		temporalRelationEClass.getESuperTypes().add(this.getRelation());
		temporalRelationEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		persistenceRelationEClass.getESuperTypes().add(this.getTemporalRelation());
		timeSliceRelationEClass.getESuperTypes().add(this.getTemporalRelation());
		templateVariableGroupEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(templateVariableDefinitionsEClass, TemplateVariableDefinitions.class, "TemplateVariableDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateVariableDefinitions_Variables(), this.getTemplateVariable(), null, "variables", null, 0, -1, TemplateVariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateVariableDefinitions_Factors(), this.getTemplateFactor(), null, "factors", null, 0, -1, TemplateVariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateVariableDefinitions_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, TemplateVariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateVariableDefinitions_Relation(), this.getRelation(), null, "relation", null, 0, -1, TemplateVariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateVariableDefinitions_TemplateGroups(), this.getTemplateVariableGroup(), null, "templateGroups", null, 0, -1, TemplateVariableDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateVariableEClass, TemplateVariable.class, "TemplateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateVariable_Signature(), this.getLogicalVariable(), null, "signature", null, 1, -1, TemplateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateVariable_Refines(), this.getTemplateVariable(), null, "refines", null, 0, 1, TemplateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateFactorEClass, TemplateFactor.class, "TemplateFactor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateFactor_Scope(), this.getTemplateVariable(), null, "scope", null, 1, -1, TemplateFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateFactor_Temporal(), theEcorePackage.getEBoolean(), "temporal", "false", 0, 1, TemplateFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(probabilisticTemplateFactorEClass, ProbabilisticTemplateFactor.class, "ProbabilisticTemplateFactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilisticTemplateFactor_DistributionFamily(), theDistributiontypePackage.getProbabilityDistributionSkeleton(), null, "distributionFamily", null, 1, 1, ProbabilisticTemplateFactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependenceRelationEClass, DependenceRelation.class, "DependenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependenceRelation_Type(), this.getDependenceType(), "type", null, 1, 1, DependenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependenceRelation_Target(), this.getTemplateVariable(), null, "target", null, 1, 1, DependenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependenceRelation_Source(), this.getTemplateVariable(), null, "source", null, 1, 1, DependenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependenceRelation_Contingent(), theEcorePackage.getEBoolean(), "contingent", null, 1, 1, DependenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalRelationEClass, TemporalRelation.class, "TemporalRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(persistenceRelationEClass, PersistenceRelation.class, "PersistenceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceRelation_InterfaceVariable(), this.getTemplateVariable(), null, "interfaceVariable", null, 1, 1, PersistenceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSliceRelationEClass, TimeSliceRelation.class, "TimeSliceRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSliceRelation_Source(), this.getTemplateVariable(), null, "source", null, 1, 1, TimeSliceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSliceRelation_Target(), this.getTemplateVariable(), null, "target", null, 1, 1, TimeSliceRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateVariableGroupEClass, TemplateVariableGroup.class, "TemplateVariableGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateVariableGroup_GroupedTemplates(), this.getTemplateVariable(), null, "groupedTemplates", null, 1, -1, TemplateVariableGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalVariableEClass, LogicalVariable.class, "LogicalVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicalVariable_Argument(), this.getArgument(), null, "argument", null, 1, 1, LogicalVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dependenceTypeEEnum, DependenceType.class, "DependenceType");
		addEEnumLiteral(dependenceTypeEEnum, DependenceType.DIRECTED);
		addEEnumLiteral(dependenceTypeEEnum, DependenceType.UNDIRECTED);

		// Create resource
		createResource(eNS_URI);
	}

} //TemplatevariablePackageImpl
