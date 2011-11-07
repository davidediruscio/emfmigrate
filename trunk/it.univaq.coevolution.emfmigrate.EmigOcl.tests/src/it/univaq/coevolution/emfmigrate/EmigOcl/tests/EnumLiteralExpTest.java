/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory;
import it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumLiteralExpTest extends OclExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumLiteralExpTest.class);
	}

	/**
	 * Constructs a new Enum Literal Exp test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Literal Exp test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumLiteralExp getFixture() {
		return (EnumLiteralExp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmigOclFactory.eINSTANCE.createEnumLiteralExp());
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

} //EnumLiteralExpTest
