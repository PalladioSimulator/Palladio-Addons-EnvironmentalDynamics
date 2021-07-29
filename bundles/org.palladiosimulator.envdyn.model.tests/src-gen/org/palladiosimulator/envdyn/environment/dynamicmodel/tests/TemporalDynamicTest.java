/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.TemporalDynamic;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Temporal Dynamic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemporalDynamicTest extends TestCase {

	/**
	 * The fixture for this Temporal Dynamic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDynamic fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemporalDynamicTest.class);
	}

	/**
	 * Constructs a new Temporal Dynamic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalDynamicTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Temporal Dynamic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TemporalDynamic fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Temporal Dynamic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemporalDynamic getFixture() {
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
		setFixture(DynamicmodelFactory.eINSTANCE.createTemporalDynamic());
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

} //TemporalDynamicTest
