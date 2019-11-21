/**
 */
package org.palladiosimulator.envdyn.environment.dynamicmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.envdyn.environment.dynamicmodel.DynamicmodelFactory;
import org.palladiosimulator.envdyn.environment.dynamicmodel.LocalDynamicModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Local Dynamic Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LocalDynamicModelTest extends TestCase {

	/**
	 * The fixture for this Local Dynamic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDynamicModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LocalDynamicModelTest.class);
	}

	/**
	 * Constructs a new Local Dynamic Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDynamicModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Local Dynamic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LocalDynamicModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Local Dynamic Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalDynamicModel getFixture() {
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
		setFixture(DynamicmodelFactory.eINSTANCE.createLocalDynamicModel());
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

} //LocalDynamicModelTest
