/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Brace Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BraceExpTest extends PropertyCallExpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BraceExpTest.class);
	}

	/**
	 * Constructs a new Brace Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BraceExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Brace Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BraceExp getFixture() {
		return (BraceExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmigOclFactory.eINSTANCE.createBraceExp());
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

} //BraceExpTest
