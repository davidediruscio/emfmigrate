/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage
 * @generated
 */
public interface EmigFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EmigFactory eINSTANCE = it.univaq.coevolution.emftext.emig.language.emig.impl.EmigFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Migration Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration Library</em>'.
	 * @generated
	 */
	MigrationLibrary createMigrationLibrary();

		/**
	 * Returns a new object of class '<em>Migration Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration Program</em>'.
	 * @generated
	 */
	MigrationProgram createMigrationProgram();

		/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

		/**
	 * Returns a new object of class '<em>Rewriting Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rewriting Rule</em>'.
	 * @generated
	 */
	RewritingRule createRewritingRule();

		/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

		/**
	 * Returns a new object of class '<em>Left Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Rule Element</em>'.
	 * @generated
	 */
	LeftRuleElement createLeftRuleElement();

		/**
	 * Returns a new object of class '<em>Right Rule Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right Rule Element</em>'.
	 * @generated
	 */
	RightRuleElement createRightRuleElement();

		/**
	 * Returns a new object of class '<em>Package Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Op Def</em>'.
	 * @generated
	 */
	PackageOpDef createPackageOpDef();

		/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

		/**
	 * Returns a new object of class '<em>Class Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Op Def</em>'.
	 * @generated
	 */
	ClassOpDef createClassOpDef();

		/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

		/**
	 * Returns a new object of class '<em>Attribute Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Op Def</em>'.
	 * @generated
	 */
	AttributeOpDef createAttributeOpDef();

		/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

		/**
	 * Returns a new object of class '<em>Reference Op Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Op Def</em>'.
	 * @generated
	 */
	ReferenceOpDef createReferenceOpDef();

		/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

		/**
	 * Returns a new object of class '<em>Setter Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setter Def</em>'.
	 * @generated
	 */
	SetterDef createSetterDef();

		/**
	 * Returns a new object of class '<em>MParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MParameter</em>'.
	 * @generated
	 */
	MParameter createMParameter();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EmigPackage getEmigPackage();

} //EmigFactory
