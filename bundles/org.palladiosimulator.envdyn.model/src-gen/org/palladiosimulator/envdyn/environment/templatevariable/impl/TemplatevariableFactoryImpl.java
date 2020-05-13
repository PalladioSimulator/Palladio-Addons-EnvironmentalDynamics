/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.envdyn.environment.templatevariable.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplatevariableFactoryImpl extends EFactoryImpl implements TemplatevariableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemplatevariableFactory init() {
		try {
			TemplatevariableFactory theTemplatevariableFactory = (TemplatevariableFactory)EPackage.Registry.INSTANCE.getEFactory(TemplatevariablePackage.eNS_URI);
			if (theTemplatevariableFactory != null) {
				return theTemplatevariableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemplatevariableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatevariableFactoryImpl() {
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
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS: return createTemplateVariableDefinitions();
			case TemplatevariablePackage.TEMPLATE_VARIABLE: return createTemplateVariable();
			case TemplatevariablePackage.ARGUMENT: return createArgument();
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR: return createProbabilisticTemplateFactor();
			case TemplatevariablePackage.DEPENDENCE_RELATION: return createDependenceRelation();
			case TemplatevariablePackage.PERSISTENCE_RELATION: return createPersistenceRelation();
			case TemplatevariablePackage.TIME_SLICE_RELATION: return createTimeSliceRelation();
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP: return createTemplateVariableGroup();
			case TemplatevariablePackage.LOGICAL_VARIABLE: return createLogicalVariable();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TemplatevariablePackage.DEPENDENCE_TYPE:
				return createDependenceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TemplatevariablePackage.DEPENDENCE_TYPE:
				return convertDependenceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariableDefinitions createTemplateVariableDefinitions() {
		TemplateVariableDefinitionsImpl templateVariableDefinitions = new TemplateVariableDefinitionsImpl();
		return templateVariableDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable createTemplateVariable() {
		TemplateVariableImpl templateVariable = new TemplateVariableImpl();
		return templateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProbabilisticTemplateFactor createProbabilisticTemplateFactor() {
		ProbabilisticTemplateFactorImpl probabilisticTemplateFactor = new ProbabilisticTemplateFactorImpl();
		return probabilisticTemplateFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenceRelation createDependenceRelation() {
		DependenceRelationImpl dependenceRelation = new DependenceRelationImpl();
		return dependenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistenceRelation createPersistenceRelation() {
		PersistenceRelationImpl persistenceRelation = new PersistenceRelationImpl();
		return persistenceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeSliceRelation createTimeSliceRelation() {
		TimeSliceRelationImpl timeSliceRelation = new TimeSliceRelationImpl();
		return timeSliceRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariableGroup createTemplateVariableGroup() {
		TemplateVariableGroupImpl templateVariableGroup = new TemplateVariableGroupImpl();
		return templateVariableGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalVariable createLogicalVariable() {
		LogicalVariableImpl logicalVariable = new LogicalVariableImpl();
		return logicalVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenceType createDependenceTypeFromString(EDataType eDataType, String initialValue) {
		DependenceType result = DependenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplatevariablePackage getTemplatevariablePackage() {
		return (TemplatevariablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemplatevariablePackage getPackage() {
		return TemplatevariablePackage.eINSTANCE;
	}

} //TemplatevariableFactoryImpl
