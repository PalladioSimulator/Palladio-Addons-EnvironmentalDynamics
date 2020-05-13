/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.envdyn.environment.dynamicmodel.*;

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
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage
 * @generated
 */
public class DynamicmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamicmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = DynamicmodelPackage.eINSTANCE;
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
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_REPOSITORY: {
				DynamicBehaviourRepository dynamicBehaviourRepository = (DynamicBehaviourRepository)theEObject;
				T result = caseDynamicBehaviourRepository(dynamicBehaviourRepository);
				if (result == null) result = caseEntity(dynamicBehaviourRepository);
				if (result == null) result = caseIdentifier(dynamicBehaviourRepository);
				if (result == null) result = caseNamedElement(dynamicBehaviourRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR_EXTENSION: {
				DynamicBehaviourExtension dynamicBehaviourExtension = (DynamicBehaviourExtension)theEObject;
				T result = caseDynamicBehaviourExtension(dynamicBehaviourExtension);
				if (result == null) result = caseEntity(dynamicBehaviourExtension);
				if (result == null) result = caseIdentifier(dynamicBehaviourExtension);
				if (result == null) result = caseNamedElement(dynamicBehaviourExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.DYNAMIC_BEHAVIOUR: {
				DynamicBehaviour dynamicBehaviour = (DynamicBehaviour)theEObject;
				T result = caseDynamicBehaviour(dynamicBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.INDUCTIVE_DYNAMIC_BEHAVIOUR: {
				InductiveDynamicBehaviour inductiveDynamicBehaviour = (InductiveDynamicBehaviour)theEObject;
				T result = caseInductiveDynamicBehaviour(inductiveDynamicBehaviour);
				if (result == null) result = caseDynamicBehaviour(inductiveDynamicBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.INTER_TIME_SLICE_INDUCTION: {
				InterTimeSliceInduction interTimeSliceInduction = (InterTimeSliceInduction)theEObject;
				T result = caseInterTimeSliceInduction(interTimeSliceInduction);
				if (result == null) result = caseTimeSliceInduction(interTimeSliceInduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.INTRA_TIME_SLICE_INDUCTION: {
				IntraTimeSliceInduction intraTimeSliceInduction = (IntraTimeSliceInduction)theEObject;
				T result = caseIntraTimeSliceInduction(intraTimeSliceInduction);
				if (result == null) result = caseTimeSliceInduction(intraTimeSliceInduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.TEMPORAL_DYNAMIC: {
				TemporalDynamic temporalDynamic = (TemporalDynamic)theEObject;
				T result = caseTemporalDynamic(temporalDynamic);
				if (result == null) result = caseEntity(temporalDynamic);
				if (result == null) result = caseIdentifier(temporalDynamic);
				if (result == null) result = caseNamedElement(temporalDynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DynamicmodelPackage.TIME_SLICE_INDUCTION: {
				TimeSliceInduction timeSliceInduction = (TimeSliceInduction)theEObject;
				T result = caseTimeSliceInduction(timeSliceInduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Behaviour Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Behaviour Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicBehaviourRepository(DynamicBehaviourRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Behaviour Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Behaviour Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicBehaviourExtension(DynamicBehaviourExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicBehaviour(DynamicBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inductive Dynamic Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inductive Dynamic Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInductiveDynamicBehaviour(InductiveDynamicBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Time Slice Induction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Time Slice Induction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterTimeSliceInduction(InterTimeSliceInduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intra Time Slice Induction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intra Time Slice Induction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraTimeSliceInduction(IntraTimeSliceInduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Dynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDynamic(TemporalDynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slice Induction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slice Induction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSliceInduction(TimeSliceInduction object) {
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

} //DynamicmodelSwitch
