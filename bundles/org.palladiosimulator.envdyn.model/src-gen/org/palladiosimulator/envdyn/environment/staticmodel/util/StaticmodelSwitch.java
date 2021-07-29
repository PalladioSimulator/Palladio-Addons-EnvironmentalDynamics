/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.envdyn.environment.staticmodel.*;

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
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage
 * @generated
 */
public class StaticmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaticmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = StaticmodelPackage.eINSTANCE;
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
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE: {
				GroundRandomVariable groundRandomVariable = (GroundRandomVariable)theEObject;
				T result = caseGroundRandomVariable(groundRandomVariable);
				if (result == null) result = caseEntity(groundRandomVariable);
				if (result == null) result = caseIdentifier(groundRandomVariable);
				if (result == null) result = caseNamedElement(groundRandomVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaticmodelPackage.LOCAL_PROBABILISTIC_MODEL: {
				LocalProbabilisticModel localProbabilisticModel = (LocalProbabilisticModel)theEObject;
				T result = caseLocalProbabilisticModel(localProbabilisticModel);
				if (result == null) result = caseEntity(localProbabilisticModel);
				if (result == null) result = caseIdentifier(localProbabilisticModel);
				if (result == null) result = caseNamedElement(localProbabilisticModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaticmodelPackage.PROBABILISTIC_MODEL_REPOSITORY: {
				ProbabilisticModelRepository probabilisticModelRepository = (ProbabilisticModelRepository)theEObject;
				T result = caseProbabilisticModelRepository(probabilisticModelRepository);
				if (result == null) result = caseEntity(probabilisticModelRepository);
				if (result == null) result = caseIdentifier(probabilisticModelRepository);
				if (result == null) result = caseNamedElement(probabilisticModelRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaticmodelPackage.GROUND_PROBABILISTIC_NETWORK: {
				GroundProbabilisticNetwork groundProbabilisticNetwork = (GroundProbabilisticNetwork)theEObject;
				T result = caseGroundProbabilisticNetwork(groundProbabilisticNetwork);
				if (result == null) result = caseEntity(groundProbabilisticNetwork);
				if (result == null) result = caseIdentifier(groundProbabilisticNetwork);
				if (result == null) result = caseNamedElement(groundProbabilisticNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaticmodelPackage.LOCAL_PROBABILISTIC_NETWORK: {
				LocalProbabilisticNetwork localProbabilisticNetwork = (LocalProbabilisticNetwork)theEObject;
				T result = caseLocalProbabilisticNetwork(localProbabilisticNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Random Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Random Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundRandomVariable(GroundRandomVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Probabilistic Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Probabilistic Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalProbabilisticModel(LocalProbabilisticModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probabilistic Model Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probabilistic Model Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbabilisticModelRepository(ProbabilisticModelRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Probabilistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Probabilistic Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundProbabilisticNetwork(GroundProbabilisticNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Probabilistic Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Probabilistic Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalProbabilisticNetwork(LocalProbabilisticNetwork object) {
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

} //StaticmodelSwitch
