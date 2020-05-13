/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.envdyn.environment.templatevariable.*;

import tools.mdsd.modelingfoundations.identifier.Entity;
import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariablePackage
 * @generated
 */
public class TemplatevariableSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemplatevariablePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplatevariableSwitch() {
		if (modelPackage == null) {
			modelPackage = TemplatevariablePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TemplatevariablePackage.TEMPLATE_VARIABLE_DEFINITIONS: {
				TemplateVariableDefinitions templateVariableDefinitions = (TemplateVariableDefinitions)theEObject;
				T result = caseTemplateVariableDefinitions(templateVariableDefinitions);
				if (result == null) result = caseEntity(templateVariableDefinitions);
				if (result == null) result = caseIdentifier(templateVariableDefinitions);
				if (result == null) result = caseNamedElement(templateVariableDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.TEMPLATE_VARIABLE: {
				TemplateVariable templateVariable = (TemplateVariable)theEObject;
				T result = caseTemplateVariable(templateVariable);
				if (result == null) result = caseEntity(templateVariable);
				if (result == null) result = caseIdentifier(templateVariable);
				if (result == null) result = caseNamedElement(templateVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.TEMPLATE_FACTOR: {
				TemplateFactor templateFactor = (TemplateFactor)theEObject;
				T result = caseTemplateFactor(templateFactor);
				if (result == null) result = caseEntity(templateFactor);
				if (result == null) result = caseIdentifier(templateFactor);
				if (result == null) result = caseNamedElement(templateFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseEntity(argument);
				if (result == null) result = caseIdentifier(argument);
				if (result == null) result = caseNamedElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.PROBABILISTIC_TEMPLATE_FACTOR: {
				ProbabilisticTemplateFactor probabilisticTemplateFactor = (ProbabilisticTemplateFactor)theEObject;
				T result = caseProbabilisticTemplateFactor(probabilisticTemplateFactor);
				if (result == null) result = caseTemplateFactor(probabilisticTemplateFactor);
				if (result == null) result = caseEntity(probabilisticTemplateFactor);
				if (result == null) result = caseIdentifier(probabilisticTemplateFactor);
				if (result == null) result = caseNamedElement(probabilisticTemplateFactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.DEPENDENCE_RELATION: {
				DependenceRelation dependenceRelation = (DependenceRelation)theEObject;
				T result = caseDependenceRelation(dependenceRelation);
				if (result == null) result = caseRelation(dependenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.TEMPORAL_RELATION: {
				TemporalRelation temporalRelation = (TemporalRelation)theEObject;
				T result = caseTemporalRelation(temporalRelation);
				if (result == null) result = caseRelation(temporalRelation);
				if (result == null) result = caseNamedElement(temporalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.PERSISTENCE_RELATION: {
				PersistenceRelation persistenceRelation = (PersistenceRelation)theEObject;
				T result = casePersistenceRelation(persistenceRelation);
				if (result == null) result = caseTemporalRelation(persistenceRelation);
				if (result == null) result = caseRelation(persistenceRelation);
				if (result == null) result = caseNamedElement(persistenceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.TIME_SLICE_RELATION: {
				TimeSliceRelation timeSliceRelation = (TimeSliceRelation)theEObject;
				T result = caseTimeSliceRelation(timeSliceRelation);
				if (result == null) result = caseTemporalRelation(timeSliceRelation);
				if (result == null) result = caseRelation(timeSliceRelation);
				if (result == null) result = caseNamedElement(timeSliceRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.TEMPLATE_VARIABLE_GROUP: {
				TemplateVariableGroup templateVariableGroup = (TemplateVariableGroup)theEObject;
				T result = caseTemplateVariableGroup(templateVariableGroup);
				if (result == null) result = caseNamedElement(templateVariableGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemplatevariablePackage.LOGICAL_VARIABLE: {
				LogicalVariable logicalVariable = (LogicalVariable)theEObject;
				T result = caseLogicalVariable(logicalVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Variable Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Variable Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateVariableDefinitions(TemplateVariableDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateVariable(TemplateVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateFactor(TemplateFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Template Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Template Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticTemplateFactor(ProbabilisticTemplateFactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenceRelation(DependenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalRelation(TemporalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceRelation(PersistenceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slice Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slice Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSliceRelation(TimeSliceRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Variable Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Variable Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateVariableGroup(TemplateVariableGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalVariable(LogicalVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TemplatevariableSwitch
