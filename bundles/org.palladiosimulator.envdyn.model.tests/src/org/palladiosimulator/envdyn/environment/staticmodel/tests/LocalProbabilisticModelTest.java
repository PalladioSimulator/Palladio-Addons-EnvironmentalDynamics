/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticModel;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Probabilistic Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalProbabilisticModelTest extends TestCase {

	/**
	 * The fixture for this Local Probabilistic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProbabilisticModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalProbabilisticModelTest.class);
	}

	/**
	 * Constructs a new Local Probabilistic Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalProbabilisticModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Local Probabilistic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocalProbabilisticModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Local Probabilistic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProbabilisticModel getFixture() {
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
		setFixture(StaticmodelFactory.eINSTANCE.createLocalProbabilisticModel());
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

} //LocalProbabilisticModelTest
