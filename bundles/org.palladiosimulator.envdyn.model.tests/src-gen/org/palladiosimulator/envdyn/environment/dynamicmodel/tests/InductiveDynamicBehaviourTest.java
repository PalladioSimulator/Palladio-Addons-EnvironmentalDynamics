/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InductiveDynamicBehaviour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inductive Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InductiveDynamicBehaviourTest extends DynamicBehaviourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InductiveDynamicBehaviourTest.class);
	}

	/**
	 * Constructs a new Inductive Dynamic Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InductiveDynamicBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inductive Dynamic Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InductiveDynamicBehaviour getFixture() {
		return (InductiveDynamicBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicmodelFactory.eINSTANCE.createInductiveDynamicBehaviour());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //InductiveDynamicBehaviourTest
