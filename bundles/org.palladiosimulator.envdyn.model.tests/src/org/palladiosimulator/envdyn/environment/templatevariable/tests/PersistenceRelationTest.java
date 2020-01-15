/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.templatevariable.PersistenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Persistence Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceRelationTest extends TemporalRelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PersistenceRelationTest.class);
	}

	/**
	 * Constructs a new Persistence Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Persistence Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PersistenceRelation getFixture() {
		return (PersistenceRelation) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TemplatevariableFactory.eINSTANCE.createPersistenceRelation());
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

} //PersistenceRelationTest
