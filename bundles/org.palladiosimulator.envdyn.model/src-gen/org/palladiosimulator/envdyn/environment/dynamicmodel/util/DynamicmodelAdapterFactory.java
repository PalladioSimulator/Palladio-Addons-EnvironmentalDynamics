/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.envdyn.environment.dynamicmodel.*;

import tools.mdsd.modelingfoundations.identifier.Entity;
import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelPackage
 * @generated
 */
public class DynamicmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DynamicmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DynamicmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicmodelSwitch<Adapter> modelSwitch =
		new DynamicmodelSwitch<Adapter>() {
			@Override
			public Adapter caseDynamicBehaviourRepository(DynamicBehaviourRepository object) {
				return createDynamicBehaviourRepositoryAdapter();
			}
			@Override
			public Adapter caseDynamicBehaviourExtension(DynamicBehaviourExtension object) {
				return createDynamicBehaviourExtensionAdapter();
			}
			@Override
			public Adapter caseDynamicBehaviour(DynamicBehaviour object) {
				return createDynamicBehaviourAdapter();
			}
			@Override
			public Adapter caseInductiveDynamicBehaviour(InductiveDynamicBehaviour object) {
				return createInductiveDynamicBehaviourAdapter();
			}
			@Override
			public Adapter caseInterTimeSliceInduction(InterTimeSliceInduction object) {
				return createInterTimeSliceInductionAdapter();
			}
			@Override
			public Adapter caseIntraTimeSliceInduction(IntraTimeSliceInduction object) {
				return createIntraTimeSliceInductionAdapter();
			}
			@Override
			public Adapter caseTemporalDynamic(TemporalDynamic object) {
				return createTemporalDynamicAdapter();
			}
			@Override
			public Adapter caseTimeSliceInduction(TimeSliceInduction object) {
				return createTimeSliceInductionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository <em>Dynamic Behaviour Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourRepository
	 * @generated
	 */
	public Adapter createDynamicBehaviourRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension <em>Dynamic Behaviour Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviourExtension
	 * @generated
	 */
	public Adapter createDynamicBehaviourExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour <em>Dynamic Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicBehaviour
	 * @generated
	 */
	public Adapter createDynamicBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour <em>Inductive Dynamic Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour
	 * @generated
	 */
	public Adapter createInductiveDynamicBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction <em>Inter Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction
	 * @generated
	 */
	public Adapter createInterTimeSliceInductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction <em>Intra Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction
	 * @generated
	 */
	public Adapter createIntraTimeSliceInductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic <em>Temporal Dynamic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic
	 * @generated
	 */
	public Adapter createTemporalDynamicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction <em>Time Slice Induction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.envdyn.environment.dynamicmodel.TimeSliceInduction
	 * @generated
	 */
	public Adapter createTimeSliceInductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tools.mdsd.modelingfoundations.identifier.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tools.mdsd.modelingfoundations.identifier.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DynamicmodelAdapterFactory
