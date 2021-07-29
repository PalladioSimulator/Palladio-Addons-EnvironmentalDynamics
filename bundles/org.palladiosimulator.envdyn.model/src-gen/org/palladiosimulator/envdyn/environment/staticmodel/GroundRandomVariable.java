/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Random Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getInstantiatedTemplate <em>Instantiated Template</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getDependenceStructure <em>Dependence Structure</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getLocalModel <em>Local Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getAppliedObjects <em>Applied Objects</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundRandomVariable()
 * @model
 * @generated
 */
public interface GroundRandomVariable extends Entity {
	/**
	 * Returns the value of the '<em><b>Instantiated Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiated Template</em>' reference.
	 * @see #setInstantiatedTemplate(TemplateVariable)
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundRandomVariable_InstantiatedTemplate()
	 * @model required="true"
	 * @generated
	 */
	TemplateVariable getInstantiatedTemplate();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getInstantiatedTemplate <em>Instantiated Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiated Template</em>' reference.
	 * @see #getInstantiatedTemplate()
	 * @generated
	 */
	void setInstantiatedTemplate(TemplateVariable value);

	/**
	 * Returns the value of the '<em><b>Dependence Structure</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence Structure</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundRandomVariable_DependenceStructure()
	 * @model
	 * @generated
	 */
	EList<DependenceRelation> getDependenceStructure();

	/**
	 * Returns the value of the '<em><b>Local Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Model</em>' reference.
	 * @see #setLocalModel(LocalProbabilisticModel)
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundRandomVariable_LocalModel()
	 * @model required="true"
	 * @generated
	 */
	LocalProbabilisticModel getLocalModel();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable#getLocalModel <em>Local Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Model</em>' reference.
	 * @see #getLocalModel()
	 * @generated
	 */
	void setLocalModel(LocalProbabilisticModel value);

	/**
	 * Returns the value of the '<em><b>Applied Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Objects</em>' reference list.
	 * @see org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage#getGroundRandomVariable_AppliedObjects()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getAppliedObjects();

} // GroundRandomVariable
