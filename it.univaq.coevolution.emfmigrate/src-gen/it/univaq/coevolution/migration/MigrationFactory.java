/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.migration.MigrationPackage
 * @generated
 */
public interface MigrationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MigrationFactory eINSTANCE = it.univaq.coevolution.migration.impl.MigrationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>package Setters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>package Setters</em>'.
   * @generated
   */
  packageSetters createpackageSetters();

  /**
   * Returns a new object of class '<em>package Setters def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>package Setters def</em>'.
   * @generated
   */
  packageSetters_def createpackageSetters_def();

  /**
   * Returns a new object of class '<em>set Ns Uri</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set Ns Uri</em>'.
   * @generated
   */
  setNsUri createsetNsUri();

  /**
   * Returns a new object of class '<em>set Ns Uri def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set Ns Uri def</em>'.
   * @generated
   */
  setNsUri_def createsetNsUri_def();

  /**
   * Returns a new object of class '<em>set Ns Prefix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set Ns Prefix</em>'.
   * @generated
   */
  setNsPrefix createsetNsPrefix();

  /**
   * Returns a new object of class '<em>set Ns Prefix def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>set Ns Prefix def</em>'.
   * @generated
   */
  setNsPrefix_def createsetNsPrefix_def();

  /**
   * Returns a new object of class '<em>CHANGEPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CHANGEPACKAGE</em>'.
   * @generated
   */
  CHANGEPACKAGE createCHANGEPACKAGE();

  /**
   * Returns a new object of class '<em>ADDPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADDPACKAGE</em>'.
   * @generated
   */
  ADDPACKAGE createADDPACKAGE();

  /**
   * Returns a new object of class '<em>DELETEPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DELETEPACKAGE</em>'.
   * @generated
   */
  DELETEPACKAGE createDELETEPACKAGE();

  /**
   * Returns a new object of class '<em>Package Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package Op</em>'.
   * @generated
   */
  PackageOp createPackageOp();

  /**
   * Returns a new object of class '<em>Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Def</em>'.
   * @generated
   */
  OpDef createOpDef();

  /**
   * Returns a new object of class '<em>CHANGECLASS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CHANGECLASS</em>'.
   * @generated
   */
  CHANGECLASS createCHANGECLASS();

  /**
   * Returns a new object of class '<em>ADDCLASS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADDCLASS</em>'.
   * @generated
   */
  ADDCLASS createADDCLASS();

  /**
   * Returns a new object of class '<em>DELETECLASS</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DELETECLASS</em>'.
   * @generated
   */
  DELETECLASS createDELETECLASS();

  /**
   * Returns a new object of class '<em>class Setter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>class Setter</em>'.
   * @generated
   */
  classSetter createclassSetter();

  /**
   * Returns a new object of class '<em>class Setters def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>class Setters def</em>'.
   * @generated
   */
  classSetters_def createclassSetters_def();

  /**
   * Returns a new object of class '<em>Class Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Op</em>'.
   * @generated
   */
  ClassOp createClassOp();

  /**
   * Returns a new object of class '<em>eStructural Feature Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>eStructural Feature Op</em>'.
   * @generated
   */
  eStructuralFeatureOp createeStructuralFeatureOp();

  /**
   * Returns a new object of class '<em>CHANGEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CHANGEATTRIBUTE</em>'.
   * @generated
   */
  CHANGEATTRIBUTE createCHANGEATTRIBUTE();

  /**
   * Returns a new object of class '<em>ADDATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADDATTRIBUTE</em>'.
   * @generated
   */
  ADDATTRIBUTE createADDATTRIBUTE();

  /**
   * Returns a new object of class '<em>DELETEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DELETEATTRIBUTE</em>'.
   * @generated
   */
  DELETEATTRIBUTE createDELETEATTRIBUTE();

  /**
   * Returns a new object of class '<em>RENAMEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RENAMEATTRIBUTE</em>'.
   * @generated
   */
  RENAMEATTRIBUTE createRENAMEATTRIBUTE();

  /**
   * Returns a new object of class '<em>MOVEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MOVEATTRIBUTE</em>'.
   * @generated
   */
  MOVEATTRIBUTE createMOVEATTRIBUTE();

  /**
   * Returns a new object of class '<em>Feature Setters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Setters</em>'.
   * @generated
   */
  FeatureSetters createFeatureSetters();

  /**
   * Returns a new object of class '<em>Attribute Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Op</em>'.
   * @generated
   */
  AttributeOp createAttributeOp();

  /**
   * Returns a new object of class '<em>CHANGEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CHANGEREFERENCE</em>'.
   * @generated
   */
  CHANGEREFERENCE createCHANGEREFERENCE();

  /**
   * Returns a new object of class '<em>ADDREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ADDREFERENCE</em>'.
   * @generated
   */
  ADDREFERENCE createADDREFERENCE();

  /**
   * Returns a new object of class '<em>DELETEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DELETEREFERENCE</em>'.
   * @generated
   */
  DELETEREFERENCE createDELETEREFERENCE();

  /**
   * Returns a new object of class '<em>MOVEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MOVEREFERENCE</em>'.
   * @generated
   */
  MOVEREFERENCE createMOVEREFERENCE();

  /**
   * Returns a new object of class '<em>feature Setters def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>feature Setters def</em>'.
   * @generated
   */
  featureSetters_def createfeatureSetters_def();

  /**
   * Returns a new object of class '<em>Reference Op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Op</em>'.
   * @generated
   */
  ReferenceOp createReferenceOp();

  /**
   * Returns a new object of class '<em>Complex Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Operator</em>'.
   * @generated
   */
  ComplexOperator createComplexOperator();

  /**
   * Returns a new object of class '<em>INT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>INT</em>'.
   * @generated
   */
  INT createINT();

  /**
   * Returns a new object of class '<em>STRING</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STRING</em>'.
   * @generated
   */
  STRING createSTRING();

  /**
   * Returns a new object of class '<em>EBool Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EBool Par</em>'.
   * @generated
   */
  EBoolPar createEBoolPar();

  /**
   * Returns a new object of class '<em>Call Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Operator</em>'.
   * @generated
   */
  CallOperator createCallOperator();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
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
   * Returns a new object of class '<em>Migrator SX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migrator SX</em>'.
   * @generated
   */
  MigratorSX createMigratorSX();

  /**
   * Returns a new object of class '<em>Migrator DX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migrator DX</em>'.
   * @generated
   */
  MigratorDX createMigratorDX();

  /**
   * Returns a new object of class '<em>Filter Migrator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Migrator</em>'.
   * @generated
   */
  FilterMigrator createFilterMigrator();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
  Class createClass();

  /**
   * Returns a new object of class '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Classifier</em>'.
   * @generated
   */
  Classifier createClassifier();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>EReference Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EReference Par</em>'.
   * @generated
   */
  EReferencePar createEReferencePar();

  /**
   * Returns a new object of class '<em>EAttribute Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EAttribute Par</em>'.
   * @generated
   */
  EAttributePar createEAttributePar();

  /**
   * Returns a new object of class '<em>EClass Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClass Par</em>'.
   * @generated
   */
  EClassPar createEClassPar();

  /**
   * Returns a new object of class '<em>EPackage Par</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPackage Par</em>'.
   * @generated
   */
  EPackagePar createEPackagePar();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MigrationPackage getMigrationPackage();

} //MigrationFactory
