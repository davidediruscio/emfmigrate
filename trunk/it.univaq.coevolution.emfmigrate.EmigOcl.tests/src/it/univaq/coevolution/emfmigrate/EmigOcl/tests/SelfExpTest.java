/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory;
import it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Self Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfExpTest extends OclExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfExpTest.class);
	}

	/**
	 * Constructs a new Self Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Self Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelfExp getFixture() {
		return (SelfExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmigOclFactory.eINSTANCE.createSelfExp());
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

} //SelfExpTest
