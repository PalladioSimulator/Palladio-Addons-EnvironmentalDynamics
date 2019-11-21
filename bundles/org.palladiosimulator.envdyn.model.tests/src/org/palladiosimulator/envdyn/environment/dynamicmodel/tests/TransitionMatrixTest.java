/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TransitionMatrix;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition Matrix</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionMatrixTest extends TestCase {

	/**
	 * The fixture for this Transition Matrix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionMatrix fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionMatrixTest.class);
	}

	/**
	 * Constructs a new Transition Matrix test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionMatrixTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transition Matrix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransitionMatrix fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transition Matrix test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionMatrix getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicmodelFactory.eINSTANCE.createTransitionMatrix());
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

} //TransitionMatrixTest
