/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.InterTimeSliceInduction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inter Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterTimeSliceInductionTest extends TimeSliceInductionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterTimeSliceInductionTest.class);
	}

	/**
	 * Constructs a new Inter Time Slice Induction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterTimeSliceInductionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inter Time Slice Induction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterTimeSliceInduction getFixture() {
		return (InterTimeSliceInduction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicmodelFactory.eINSTANCE.createInterTimeSliceInduction());
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

} //InterTimeSliceInductionTest
