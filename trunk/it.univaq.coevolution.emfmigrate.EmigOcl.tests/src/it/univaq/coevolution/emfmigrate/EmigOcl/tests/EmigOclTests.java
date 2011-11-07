/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>EmigOcl</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmigOclTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EmigOclTests("EmigOcl Tests");
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(VariableExpTest.class);
		suite.addTestSuite(SuperExpTest.class);
		suite.addTestSuite(SelfExpTest.class);
		suite.addTestSuite(StringExpTest.class);
		suite.addTestSuite(BooleanExpTest.class);
		suite.addTestSuite(RealExpTest.class);
		suite.addTestSuite(IntegerExpTest.class);
		suite.addTestSuite(BagExpTest.class);
		suite.addTestSuite(OrderedSetExpTest.class);
		suite.addTestSuite(SequenceExpTest.class);
		suite.addTestSuite(SetExpTest.class);
		suite.addTestSuite(TupleExpTest.class);
		suite.addTestSuite(TuplePartTest.class);
		suite.addTestSuite(MapExpTest.class);
		suite.addTestSuite(MapElementTest.class);
		suite.addTestSuite(EnumLiteralExpTest.class);
		suite.addTestSuite(OclUndefinedExpTest.class);
		suite.addTestSuite(NavigationOrAttributeCallExpTest.class);
		suite.addTestSuite(OperationCallExpTest.class);
		suite.addTestSuite(OperatorCallExpTest.class);
		suite.addTestSuite(NotOpCallExpTest.class);
		suite.addTestSuite(RelOpCallExpTest.class);
		suite.addTestSuite(AddOpCallExpTest.class);
		suite.addTestSuite(IntOpCallExpTest.class);
		suite.addTestSuite(MulOpCallExpTest.class);
		suite.addTestSuite(BraceExpTest.class);
		suite.addTestSuite(CollectionOperationCallExpTest.class);
		suite.addTestSuite(IterateExpTest.class);
		suite.addTestSuite(IteratorExpTest.class);
		suite.addTestSuite(LetExpTest.class);
		suite.addTestSuite(IfExpTest.class);
		suite.addTestSuite(VariableDeclarationTest.class);
		suite.addTestSuite(IteratorTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(CollectionTypeTest.class);
		suite.addTestSuite(OclModelElementExpTest.class);
		suite.addTestSuite(StringTypeTest.class);
		suite.addTestSuite(BooleanTypeTest.class);
		suite.addTestSuite(IntegerTypeTest.class);
		suite.addTestSuite(RealTypeTest.class);
		suite.addTestSuite(BagTypeTest.class);
		suite.addTestSuite(OrderedSetTypeTest.class);
		suite.addTestSuite(SequenceTypeTest.class);
		suite.addTestSuite(SetTypeTest.class);
		suite.addTestSuite(OclAnyTypeTest.class);
		suite.addTestSuite(TupleTypeTest.class);
		suite.addTestSuite(TupleTypeAttributeTest.class);
		suite.addTestSuite(OclModelElementTest.class);
		suite.addTestSuite(MapTypeTest.class);
		suite.addTestSuite(OclFeatureDefinitionTest.class);
		suite.addTestSuite(OclContextDefinitionTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(OperationTest.class);
		suite.addTestSuite(OclModelTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmigOclTests(String name) {
		super(name);
	}

} //EmigOclTests
