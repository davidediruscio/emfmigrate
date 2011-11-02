/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage
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
  EmigFactory eINSTANCE = it.univaq.coevolution.emfmigrate.emig.impl.EmigFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Model</em>'.
   * @generated
   */
  MyModel createMyModel();

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
   * Returns a new object of class '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Artifact</em>'.
   * @generated
   */
  Artifact createArtifact();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Op Def</em>'.
   * @generated
   */
  OpDef createOpDef();

  /**
   * Returns a new object of class '<em>EPackage Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EPackage Op Def</em>'.
   * @generated
   */
  EPackageOpDef createEPackageOpDef();

  /**
   * Returns a new object of class '<em>EClass Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EClass Op Def</em>'.
   * @generated
   */
  EClassOpDef createEClassOpDef();

  /**
   * Returns a new object of class '<em>EAttribute Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EAttribute Op Def</em>'.
   * @generated
   */
  EAttributeOpDef createEAttributeOpDef();

  /**
   * Returns a new object of class '<em>EReference Op Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EReference Op Def</em>'.
   * @generated
   */
  EReferenceOpDef createEReferenceOpDef();

  /**
   * Returns a new object of class '<em>setter Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>setter Def</em>'.
   * @generated
   */
  setterDef createsetterDef();

  /**
   * Returns a new object of class '<em>Rewriting Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rewriting Rule</em>'.
   * @generated
   */
  RewritingRule createRewritingRule();

  /**
   * Returns a new object of class '<em>Migrator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Migrator</em>'.
   * @generated
   */
  Migrator createMigrator();

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
   * Returns a new object of class '<em>Dot Navigation Obj SX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dot Navigation Obj SX</em>'.
   * @generated
   */
  DotNavigationObjSX createDotNavigationObjSX();

  /**
   * Returns a new object of class '<em>Dot Navigation Obj DX</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dot Navigation Obj DX</em>'.
   * @generated
   */
  DotNavigationObjDX createDotNavigationObjDX();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmigPackage getEmigPackage();

} //EmigFactory
