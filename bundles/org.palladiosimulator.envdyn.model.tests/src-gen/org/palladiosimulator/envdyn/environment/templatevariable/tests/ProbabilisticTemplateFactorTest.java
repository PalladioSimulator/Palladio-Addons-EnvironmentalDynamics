/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.templatevariable.ProbabilisticTemplateFactor;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Probabilistic Template Factor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProbabilisticTemplateFactorTest extends TemplateFactorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProbabilisticTemplateFactorTest.class);
	}

	/**
	 * Constructs a new Probabilistic Template Factor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProbabilisticTemplateFactorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Probabilistic Template Factor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProbabilisticTemplateFactor getFixture() {
		return (ProbabilisticTemplateFactor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TemplatevariableFactory.eINSTANCE.createProbabilisticTemplateFactor());
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

} //ProbabilisticTemplateFactorTest
