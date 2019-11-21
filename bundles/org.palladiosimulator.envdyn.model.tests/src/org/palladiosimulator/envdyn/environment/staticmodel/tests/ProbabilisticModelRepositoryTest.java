/**
 */
package org.palladiosimulator.envdyn.environment.staticmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.staticmodel.ProbabilisticModelRepository;
import org.palladiosimulator.envdyn.environment.staticmodel.StaticmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probabilistic Model Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilisticModelRepositoryTest extends TestCase {

	/**
	 * The fixture for this Probabilistic Model Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticModelRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilisticModelRepositoryTest.class);
	}

	/**
	 * Constructs a new Probabilistic Model Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticModelRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Probabilistic Model Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProbabilisticModelRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Probabilistic Model Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProbabilisticModelRepository getFixture() {
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
		setFixture(StaticmodelFactory.eINSTANCE.createProbabilisticModelRepository());
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

} //ProbabilisticModelRepositoryTest
