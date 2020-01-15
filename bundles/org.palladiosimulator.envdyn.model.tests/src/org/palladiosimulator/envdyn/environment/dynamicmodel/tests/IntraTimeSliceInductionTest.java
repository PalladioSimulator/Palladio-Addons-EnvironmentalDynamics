/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.IntraTimeSliceInduction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intra Time Slice Induction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntraTimeSliceInductionTest extends TimeSliceInductionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntraTimeSliceInductionTest.class);
	}

	/**
	 * Constructs a new Intra Time Slice Induction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntraTimeSliceInductionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intra Time Slice Induction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntraTimeSliceInduction getFixture() {
		return (IntraTimeSliceInduction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DynamicmodelFactory.eINSTANCE.createIntraTimeSliceInduction());
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

} //IntraTimeSliceInductionTest
