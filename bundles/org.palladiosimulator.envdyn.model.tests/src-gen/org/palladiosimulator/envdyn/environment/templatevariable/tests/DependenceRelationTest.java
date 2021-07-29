/**
 */
package org.palladiosimulator.envdyn.environment.templatevariable.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.templatevariable.DependenceRelation;
import org.palladiosimulator.envdyn.environment.templatevariable.TemplatevariableFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependence Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependenceRelationTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DependenceRelationTest.class);
	}

	/**
	 * Constructs a new Dependence Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependenceRelationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependence Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DependenceRelation getFixture() {
		return (DependenceRelation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TemplatevariableFactory.eINSTANCE.createDependenceRelation());
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

} //DependenceRelationTest
