/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.staticmodel.LocalProbabilisticNetwork;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Probabilistic Network</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalProbabilisticNetworkTest extends TestCase {

	/**
	 * The fixture for this Local Probabilistic Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProbabilisticNetwork fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalProbabilisticNetworkTest.class);
	}

	/**
	 * Constructs a new Local Probabilistic Network test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalProbabilisticNetworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Local Probabilistic Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocalProbabilisticNetwork fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Local Probabilistic Network test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalProbabilisticNetwork getFixture() {
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
		setFixture(StaticmodelFactory.eINSTANCE.createLocalProbabilisticNetwork());
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

} //LocalProbabilisticNetworkTest
