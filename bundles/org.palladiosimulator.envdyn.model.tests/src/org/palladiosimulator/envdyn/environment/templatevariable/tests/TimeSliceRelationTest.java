/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;
import org.palladiosimulator.envdyn.environment.templatevariable.TimeSliceRelation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Slice Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeSliceRelationTest extends TemporalRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeSliceRelationTest.class);
	}

	/**
	 * Constructs a new Time Slice Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSliceRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Slice Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeSliceRelation getFixture() {
		return (TimeSliceRelation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TemplatevariableFactory.eINSTANCE.createTimeSliceRelation());
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

} //TimeSliceRelationTest
