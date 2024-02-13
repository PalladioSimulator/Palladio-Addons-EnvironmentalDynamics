/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage;

import org.palladiosimulator.envdyn.environment.dynamicmodel.impl.DynamicmodelPackageImpl;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

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
public class StaticmodelPackageImpl extends EPackageImpl implements StaticmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundRandomVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundProbabilisticModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probabilisticModelRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundProbabilisticNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localProbabilisticNetworkEClass = null;

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
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaticmodelPackageImpl() {
		super(eNS_URI, StaticmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaticmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaticmodelPackage init() {
		if (isInited) return (StaticmodelPackage)EPackage.Registry.INSTANCE.getEPackage(StaticmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStaticmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StaticmodelPackageImpl theStaticmodelPackage = registeredStaticmodelPackage instanceof StaticmodelPackageImpl ? (StaticmodelPackageImpl)registeredStaticmodelPackage : new StaticmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		DistributiontypePackage.eINSTANCE.eClass();
		DistributionfunctionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TemplatevariablePackage.eNS_URI);
		TemplatevariablePackageImpl theTemplatevariablePackage = (TemplatevariablePackageImpl)(registeredPackage instanceof TemplatevariablePackageImpl ? registeredPackage : TemplatevariablePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DynamicmodelPackage.eNS_URI);
		DynamicmodelPackageImpl theDynamicmodelPackage = (DynamicmodelPackageImpl)(registeredPackage instanceof DynamicmodelPackageImpl ? registeredPackage : DynamicmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theStaticmodelPackage.createPackageContents();
		theTemplatevariablePackage.createPackageContents();
		theDynamicmodelPackage.createPackageContents();

		// Initialize created meta-data
		theStaticmodelPackage.initializePackageContents();
		theTemplatevariablePackage.initializePackageContents();
		theDynamicmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStaticmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaticmodelPackage.eNS_URI, theStaticmodelPackage);
		return theStaticmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroundRandomVariable() {
		return groundRandomVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundRandomVariable_InstantiatedTemplate() {
		return (EReference)groundRandomVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundRandomVariable_DependenceStructure() {
		return (EReference)groundRandomVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundRandomVariable_DescriptiveModel() {
		return (EReference)groundRandomVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundRandomVariable_AppliedObjects() {
		return (EReference)groundRandomVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroundProbabilisticModel() {
		return groundProbabilisticModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundProbabilisticModel_InstantiatedFactor() {
		return (EReference)groundProbabilisticModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundProbabilisticModel_Distribution() {
		return (EReference)groundProbabilisticModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProbabilisticModelRepository() {
		return probabilisticModelRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProbabilisticModelRepository_Models() {
		return (EReference)probabilisticModelRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroundProbabilisticNetwork() {
		return groundProbabilisticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundProbabilisticNetwork_LocalModels() {
		return (EReference)groundProbabilisticNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroundProbabilisticNetwork_LocalProbabilisticModels() {
		return (EReference)groundProbabilisticNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalProbabilisticNetwork() {
		return localProbabilisticNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLocalProbabilisticNetwork_GroundRandomVariables() {
		return (EReference)localProbabilisticNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticmodelFactory getStaticmodelFactory() {
		return (StaticmodelFactory)getEFactoryInstance();
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
		groundRandomVariableEClass = createEClass(GROUND_RANDOM_VARIABLE);
		createEReference(groundRandomVariableEClass, GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE);
		createEReference(groundRandomVariableEClass, GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE);
		createEReference(groundRandomVariableEClass, GROUND_RANDOM_VARIABLE__DESCRIPTIVE_MODEL);
		createEReference(groundRandomVariableEClass, GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS);

		groundProbabilisticModelEClass = createEClass(GROUND_PROBABILISTIC_MODEL);
		createEReference(groundProbabilisticModelEClass, GROUND_PROBABILISTIC_MODEL__INSTANTIATED_FACTOR);
		createEReference(groundProbabilisticModelEClass, GROUND_PROBABILISTIC_MODEL__DISTRIBUTION);

		probabilisticModelRepositoryEClass = createEClass(PROBABILISTIC_MODEL_REPOSITORY);
		createEReference(probabilisticModelRepositoryEClass, PROBABILISTIC_MODEL_REPOSITORY__MODELS);

		groundProbabilisticNetworkEClass = createEClass(GROUND_PROBABILISTIC_NETWORK);
		createEReference(groundProbabilisticNetworkEClass, GROUND_PROBABILISTIC_NETWORK__LOCAL_MODELS);
		createEReference(groundProbabilisticNetworkEClass, GROUND_PROBABILISTIC_NETWORK__LOCAL_PROBABILISTIC_MODELS);

		localProbabilisticNetworkEClass = createEClass(LOCAL_PROBABILISTIC_NETWORK);
		createEReference(localProbabilisticNetworkEClass, LOCAL_PROBABILISTIC_NETWORK__GROUND_RANDOM_VARIABLES);
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
		TemplatevariablePackage theTemplatevariablePackage = (TemplatevariablePackage)EPackage.Registry.INSTANCE.getEPackage(TemplatevariablePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		DistributionfunctionPackage theDistributionfunctionPackage = (DistributionfunctionPackage)EPackage.Registry.INSTANCE.getEPackage(DistributionfunctionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groundRandomVariableEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		groundProbabilisticModelEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		probabilisticModelRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		groundProbabilisticNetworkEClass.getESuperTypes().add(theIdentifierPackage.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(groundRandomVariableEClass, GroundRandomVariable.class, "GroundRandomVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundRandomVariable_InstantiatedTemplate(), theTemplatevariablePackage.getTemplateVariable(), null, "instantiatedTemplate", null, 1, 1, GroundRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundRandomVariable_DependenceStructure(), theTemplatevariablePackage.getDependenceRelation(), null, "dependenceStructure", null, 0, -1, GroundRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundRandomVariable_DescriptiveModel(), this.getGroundProbabilisticModel(), null, "descriptiveModel", null, 1, 1, GroundRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundRandomVariable_AppliedObjects(), theEcorePackage.getEObject(), null, "appliedObjects", null, 1, -1, GroundRandomVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundProbabilisticModelEClass, GroundProbabilisticModel.class, "GroundProbabilisticModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundProbabilisticModel_InstantiatedFactor(), theTemplatevariablePackage.getTemplateFactor(), null, "instantiatedFactor", null, 1, 1, GroundProbabilisticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundProbabilisticModel_Distribution(), theDistributionfunctionPackage.getProbabilityDistribution(), null, "distribution", null, 1, 1, GroundProbabilisticModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(probabilisticModelRepositoryEClass, ProbabilisticModelRepository.class, "ProbabilisticModelRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProbabilisticModelRepository_Models(), this.getGroundProbabilisticNetwork(), null, "models", null, 0, -1, ProbabilisticModelRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundProbabilisticNetworkEClass, GroundProbabilisticNetwork.class, "GroundProbabilisticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundProbabilisticNetwork_LocalModels(), this.getGroundProbabilisticModel(), null, "localModels", null, 1, -1, GroundProbabilisticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundProbabilisticNetwork_LocalProbabilisticModels(), this.getLocalProbabilisticNetwork(), null, "localProbabilisticModels", null, 1, -1, GroundProbabilisticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localProbabilisticNetworkEClass, LocalProbabilisticNetwork.class, "LocalProbabilisticNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLocalProbabilisticNetwork_GroundRandomVariables(), this.getGroundRandomVariable(), null, "groundRandomVariables", null, 1, -1, LocalProbabilisticNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StaticmodelPackageImpl
