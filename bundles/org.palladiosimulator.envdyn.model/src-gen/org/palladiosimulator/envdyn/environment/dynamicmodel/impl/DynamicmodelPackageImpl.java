/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction;

import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import org.palladiosimulator.envdyn.environment.staticmodel.impl.StaticmodelPackageImpl;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage;

import org.palladiosimulator.envdyn.environment.templatevariable.impl.TemplatevariablePackageImpl;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

import tools.mdsd.probdist.distributionfunction.DistributionfunctionPackage;

import tools.mdsd.probdist.distributiontype.DistributiontypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DynamicmodelPackageImpl extends EPackageImpl implements DynamicmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicBehaviourRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicBehaviourExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inductiveDynamicBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interTimeSliceInductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraTimeSliceInductionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalDynamicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSliceInductionEClass = null;

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
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DynamicmodelPackageImpl() {
		super(eNS_URI, DynamicmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DynamicmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DynamicmodelPackage init() {
		if (isInited) return (DynamicmodelPackage)EPackage.Registry.INSTANCE.getEPackage(DynamicmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDynamicmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DynamicmodelPackageImpl theDynamicmodelPackage = registeredDynamicmodelPackage instanceof DynamicmodelPackageImpl ? (DynamicmodelPackageImpl)registeredDynamicmodelPackage : new DynamicmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		DistributiontypePackage.eINSTANCE.eClass();
		DistributionfunctionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TemplatevariablePackage.eNS_URI);
		TemplatevariablePackageImpl theTemplatevariablePackage = (TemplatevariablePackageImpl)(registeredPackage instanceof TemplatevariablePackageImpl ? registeredPackage : TemplatevariablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StaticmodelPackage.eNS_URI);
		StaticmodelPackageImpl theStaticmodelPackage = (StaticmodelPackageImpl)(registeredPackage instanceof StaticmodelPackageImpl ? registeredPackage : StaticmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theDynamicmodelPackage.createPackageContents();
		theTemplatevariablePackage.createPackageContents();
		theStaticmodelPackage.createPackageContents();

		// Initialize created meta-data
		theDynamicmodelPackage.initializePackageContents();
		theTemplatevariablePackage.initializePackageContents();
		theStaticmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDynamicmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DynamicmodelPackage.eNS_URI, theDynamicmodelPackage);
		return theDynamicmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicBehaviourRepository() {
		return dynamicBehaviourRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicBehaviourRepository_Extensions() {
		return (EReference)dynamicBehaviourRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicBehaviourExtension() {
		return dynamicBehaviourExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicBehaviourExtension_Model() {
		return (EReference)dynamicBehaviourExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicBehaviourExtension_Behaviour() {
		return (EReference)dynamicBehaviourExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicBehaviour() {
		return dynamicBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDynamicBehaviour_LocalModels() {
		return (EReference)dynamicBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInductiveDynamicBehaviour() {
		return inductiveDynamicBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInductiveDynamicBehaviour_TimeSliceInductions() {
		return (EReference)inductiveDynamicBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterTimeSliceInduction() {
		return interTimeSliceInductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterTimeSliceInduction_TemporalStructure() {
		return (EReference)interTimeSliceInductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntraTimeSliceInduction() {
		return intraTimeSliceInductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntraTimeSliceInduction_DependenceStructure() {
		return (EReference)intraTimeSliceInductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalDynamic() {
		return temporalDynamicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalDynamic_InstantiatedFactor() {
		return (EReference)temporalDynamicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTemporalDynamic_DistributionFunction() {
		return (EReference)temporalDynamicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeSliceInduction() {
		return timeSliceInductionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeSliceInduction_DescriptiveModel() {
		return (EReference)timeSliceInductionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimeSliceInduction_AppliedGroundVariable() {
		return (EReference)timeSliceInductionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicmodelFactory getDynamicmodelFactory() {
		return (DynamicmodelFactory)getEFactoryInstance();
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
		dynamicBehaviourRepositoryEClass = createEClass(DYNAMIC_BEHAVIOUR_REPOSITORY);
		createEReference(dynamicBehaviourRepositoryEClass, DYNAMIC_BEHAVIOUR_REPOSITORY__EXTENSIONS);

		dynamicBehaviourExtensionEClass = createEClass(DYNAMIC_BEHAVIOUR_EXTENSION);
		createEReference(dynamicBehaviourExtensionEClass, DYNAMIC_BEHAVIOUR_EXTENSION__MODEL);
		createEReference(dynamicBehaviourExtensionEClass, DYNAMIC_BEHAVIOUR_EXTENSION__BEHAVIOUR);

		dynamicBehaviourEClass = createEClass(DYNAMIC_BEHAVIOUR);
		createEReference(dynamicBehaviourEClass, DYNAMIC_BEHAVIOUR__LOCAL_MODELS);

		inductiveDynamicBehaviourEClass = createEClass(INDUCTIVE_DYNAMIC_BEHAVIOUR);
		createEReference(inductiveDynamicBehaviourEClass, INDUCTIVE_DYNAMIC_BEHAVIOUR__TIME_SLICE_INDUCTIONS);

		interTimeSliceInductionEClass = createEClass(INTER_TIME_SLICE_INDUCTION);
		createEReference(interTimeSliceInductionEClass, INTER_TIME_SLICE_INDUCTION__TEMPORAL_STRUCTURE);

		intraTimeSliceInductionEClass = createEClass(INTRA_TIME_SLICE_INDUCTION);
		createEReference(intraTimeSliceInductionEClass, INTRA_TIME_SLICE_INDUCTION__DEPENDENCE_STRUCTURE);

		temporalDynamicEClass = createEClass(TEMPORAL_DYNAMIC);
		createEReference(temporalDynamicEClass, TEMPORAL_DYNAMIC__INSTANTIATED_FACTOR);
		createEReference(temporalDynamicEClass, TEMPORAL_DYNAMIC__DISTRIBUTION_FUNCTION);

		timeSliceInductionEClass = createEClass(TIME_SLICE_INDUCTION);
		createEReference(timeSliceInductionEClass, TIME_SLICE_INDUCTION__DESCRIPTIVE_MODEL);
		createEReference(timeSliceInductionEClass, TIME_SLICE_INDUCTION__APPLIED_GROUND_VARIABLE);
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
		StaticmodelPackage theStaticmodelPackage = (StaticmodelPackage)EPackage.Registry.INSTANCE.getEPackage(StaticmodelPackage.eNS_URI);
		TemplatevariablePackage theTemplatevariablePackage = (TemplatevariablePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatevariablePackage.eNS_URI);
		DistributionfunctionPackage theDistributionfunctionPackage = (DistributionfunctionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionfunctionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dynamicBehaviourRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		dynamicBehaviourExtensionEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		inductiveDynamicBehaviourEClass.getESuperTypes().add(this.getDynamicBehaviour());
		interTimeSliceInductionEClass.getESuperTypes().add(this.getTimeSliceInduction());
		intraTimeSliceInductionEClass.getESuperTypes().add(this.getTimeSliceInduction());
		temporalDynamicEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dynamicBehaviourRepositoryEClass, DynamicBehaviourRepository.class, "DynamicBehaviourRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicBehaviourRepository_Extensions(), this.getDynamicBehaviourExtension(), null, "extensions", null, 0, -1, DynamicBehaviourRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicBehaviourExtensionEClass, DynamicBehaviourExtension.class, "DynamicBehaviourExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicBehaviourExtension_Model(), theStaticmodelPackage.getGroundProbabilisticNetwork(), null, "model", null, 1, 1, DynamicBehaviourExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDynamicBehaviourExtension_Behaviour(), this.getDynamicBehaviour(), null, "behaviour", null, 1, 1, DynamicBehaviourExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicBehaviourEClass, DynamicBehaviour.class, "DynamicBehaviour", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDynamicBehaviour_LocalModels(), this.getTemporalDynamic(), null, "localModels", null, 1, -1, DynamicBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inductiveDynamicBehaviourEClass, InductiveDynamicBehaviour.class, "InductiveDynamicBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInductiveDynamicBehaviour_TimeSliceInductions(), this.getTimeSliceInduction(), null, "timeSliceInductions", null, 1, -1, InductiveDynamicBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interTimeSliceInductionEClass, InterTimeSliceInduction.class, "InterTimeSliceInduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterTimeSliceInduction_TemporalStructure(), theTemplatevariablePackage.getTemporalRelation(), null, "temporalStructure", null, 1, -1, InterTimeSliceInduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intraTimeSliceInductionEClass, IntraTimeSliceInduction.class, "IntraTimeSliceInduction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntraTimeSliceInduction_DependenceStructure(), theTemplatevariablePackage.getDependenceRelation(), null, "dependenceStructure", null, 1, -1, IntraTimeSliceInduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalDynamicEClass, TemporalDynamic.class, "TemporalDynamic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemporalDynamic_InstantiatedFactor(), theTemplatevariablePackage.getTemplateFactor(), null, "instantiatedFactor", null, 1, 1, TemporalDynamic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemporalDynamic_DistributionFunction(), theDistributionfunctionPackage.getProbabilityDistribution(), null, "distributionFunction", null, 1, 1, TemporalDynamic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSliceInductionEClass, TimeSliceInduction.class, "TimeSliceInduction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSliceInduction_DescriptiveModel(), this.getTemporalDynamic(), null, "descriptiveModel", null, 1, 1, TimeSliceInduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeSliceInduction_AppliedGroundVariable(), theStaticmodelPackage.getGroundRandomVariable(), null, "appliedGroundVariable", null, 1, 1, TimeSliceInduction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DynamicmodelPackageImpl
