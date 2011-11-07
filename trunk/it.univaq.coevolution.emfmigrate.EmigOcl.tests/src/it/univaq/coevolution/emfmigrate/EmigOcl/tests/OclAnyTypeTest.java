/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ocl Any Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OclAnyTypeTest extends OclTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OclAnyTypeTest.class);
	}

	/**
	 * Constructs a new Ocl Any Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAnyTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ocl Any Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OclAnyType getFixture() {
		return (OclAnyType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmigOclFactory.eINSTANCE.createOclAnyType());
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

} //OclAnyTypeTest
