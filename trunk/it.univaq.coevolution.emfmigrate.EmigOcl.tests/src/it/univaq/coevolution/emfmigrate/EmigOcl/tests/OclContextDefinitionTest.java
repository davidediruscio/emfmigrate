/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ocl Context Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OclContextDefinitionTest extends LocatedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OclContextDefinitionTest.class);
	}

	/**
	 * Constructs a new Ocl Context Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ocl Context Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OclContextDefinition getFixture() {
		return (OclContextDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EmigOclFactory.eINSTANCE.createOclContextDefinition());
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

} //OclContextDefinitionTest
