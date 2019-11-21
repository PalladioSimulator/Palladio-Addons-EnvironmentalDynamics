/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DeductiveDynamicBehaviour;
import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deductive Dynamic Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeductiveDynamicBehaviourTest extends DynamicBehaviourTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeductiveDynamicBehaviourTest.class);
	}

	/**
	 * Constructs a new Deductive Dynamic Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeductiveDynamicBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Deductive Dynamic Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeductiveDynamicBehaviour getFixture() {
		return (DeductiveDynamicBehaviour) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicmodelFactory.eINSTANCE.createDeductiveDynamicBehaviour());
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

} //DeductiveDynamicBehaviourTest
