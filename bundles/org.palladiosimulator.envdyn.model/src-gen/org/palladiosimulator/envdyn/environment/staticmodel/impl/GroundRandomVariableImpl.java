/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.envdyn.environment.staticmodel.GroundRandomVariable;
import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelPackage;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplateVariable;

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Random Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl#getInstantiatedTemplate <em>Instantiated Template</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl#getDependenceStructure <em>Dependence Structure</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl#getLocalModel <em>Local Model</em>}</li>
 *   <li>{@link org.palladiosimulator.envdyn.environment.staticmodel.impl.GroundRandomVariableImpl#getAppliedObjects <em>Applied Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundRandomVariableImpl extends EntityImpl implements GroundRandomVariable {
	/**
	 * The cached value of the '{@link #getInstantiatedTemplate() <em>Instantiated Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedTemplate()
	 * @generated
	 * @ordered
	 */
	protected TemplateVariable instantiatedTemplate;

	/**
	 * The cached value of the '{@link #getDependenceStructure() <em>Dependence Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependenceStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<DependenceRelation> dependenceStructure;

	/**
	 * The cached value of the '{@link #getLocalModel() <em>Local Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalModel()
	 * @generated
	 * @ordered
	 */
	protected LocalProbabilisticModel localModel;

	/**
	 * The cached value of the '{@link #getAppliedObjects() <em>Applied Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> appliedObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundRandomVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticmodelPackage.Literals.GROUND_RANDOM_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemplateVariable getInstantiatedTemplate() {
		if (instantiatedTemplate != null && instantiatedTemplate.eIsProxy()) {
			InternalEObject oldInstantiatedTemplate = (InternalEObject)instantiatedTemplate;
			instantiatedTemplate = (TemplateVariable)eResolveProxy(oldInstantiatedTemplate);
			if (instantiatedTemplate != oldInstantiatedTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE, oldInstantiatedTemplate, instantiatedTemplate));
			}
		}
		return instantiatedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateVariable basicGetInstantiatedTemplate() {
		return instantiatedTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiatedTemplate(TemplateVariable newInstantiatedTemplate) {
		TemplateVariable oldInstantiatedTemplate = instantiatedTemplate;
		instantiatedTemplate = newInstantiatedTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE, oldInstantiatedTemplate, instantiatedTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DependenceRelation> getDependenceStructure() {
		if (dependenceStructure == null) {
			dependenceStructure = new EObjectResolvingEList<DependenceRelation>(DependenceRelation.class, this, StaticmodelPackage.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE);
		}
		return dependenceStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalProbabilisticModel getLocalModel() {
		if (localModel != null && localModel.eIsProxy()) {
			InternalEObject oldLocalModel = (InternalEObject)localModel;
			localModel = (LocalProbabilisticModel)eResolveProxy(oldLocalModel);
			if (localModel != oldLocalModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL, oldLocalModel, localModel));
			}
		}
		return localModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalProbabilisticModel basicGetLocalModel() {
		return localModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalModel(LocalProbabilisticModel newLocalModel) {
		LocalProbabilisticModel oldLocalModel = localModel;
		localModel = newLocalModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL, oldLocalModel, localModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getAppliedObjects() {
		if (appliedObjects == null) {
			appliedObjects = new EObjectResolvingEList<EObject>(EObject.class, this, StaticmodelPackage.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS);
		}
		return appliedObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE:
				if (resolve) return getInstantiatedTemplate();
				return basicGetInstantiatedTemplate();
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE:
				return getDependenceStructure();
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL:
				if (resolve) return getLocalModel();
				return basicGetLocalModel();
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS:
				return getAppliedObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE:
				setInstantiatedTemplate((TemplateVariable)newValue);
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE:
				getDependenceStructure().clear();
				getDependenceStructure().addAll((Collection<? extends DependenceRelation>)newValue);
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL:
				setLocalModel((LocalProbabilisticModel)newValue);
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS:
				getAppliedObjects().clear();
				getAppliedObjects().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE:
				setInstantiatedTemplate((TemplateVariable)null);
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE:
				getDependenceStructure().clear();
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL:
				setLocalModel((LocalProbabilisticModel)null);
				return;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS:
				getAppliedObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__INSTANTIATED_TEMPLATE:
				return instantiatedTemplate != null;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__DEPENDENCE_STRUCTURE:
				return dependenceStructure != null && !dependenceStructure.isEmpty();
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__LOCAL_MODEL:
				return localModel != null;
			case StaticmodelPackage.GROUND_RANDOM_VARIABLE__APPLIED_OBJECTS:
				return appliedObjects != null && !appliedObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundRandomVariableImpl
