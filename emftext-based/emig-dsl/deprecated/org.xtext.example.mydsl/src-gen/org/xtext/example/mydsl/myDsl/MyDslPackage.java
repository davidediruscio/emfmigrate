/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MyModelImpl <em>My Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MyModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMyModel()
   * @generated
   */
  int MY_MODEL = 0;

  /**
   * The feature id for the '<em><b>Migration Lib</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL__MIGRATION_LIB = 0;

  /**
   * The feature id for the '<em><b>Migration Progr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL__MIGRATION_PROGR = 1;

  /**
   * The number of structural features of the '<em>My Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MY_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MigrationLibraryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrationLibrary()
   * @generated
   */
  int MIGRATION_LIBRARY = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_LIBRARY__TITLE = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_LIBRARY__RULES = 1;

  /**
   * The number of structural features of the '<em>Migration Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_LIBRARY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MigrationProgramImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrationProgram()
   * @generated
   */
  int MIGRATION_PROGRAM = 2;

  /**
   * The feature id for the '<em><b>Libs</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__LIBS = 0;

  /**
   * The feature id for the '<em><b>Migr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__MIGR = 1;

  /**
   * The feature id for the '<em><b>Type Art</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__TYPE_ART = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__NAME = 3;

  /**
   * The feature id for the '<em><b>Transformation Package</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__DELTA = 5;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__RULES = 6;

  /**
   * The number of structural features of the '<em>Migration Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ArtifactImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__TYPE = 0;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RuleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRule()
   * @generated
   */
  int RULE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__FILTER = 1;

  /**
   * The feature id for the '<em><b>Rewriting Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__REWRITING_RULES = 2;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OpDefImpl <em>Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OpDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOpDef()
   * @generated
   */
  int OP_DEF = 5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__OP = 0;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__SETTERS = 1;

  /**
   * The number of structural features of the '<em>Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EPackageOpDefImpl <em>EPackage Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EPackageOpDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEPackageOpDef()
   * @generated
   */
  int EPACKAGE_OP_DEF = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF__OP = OP_DEF__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF__SETTERS = OP_DEF__SETTERS;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF__VAR = OP_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF__REF = OP_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF__CLASSES = OP_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>EPackage Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl <em>EClass Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEClassOpDef()
   * @generated
   */
  int ECLASS_OP_DEF = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__OP = OP_DEF__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__SETTERS = OP_DEF__SETTERS;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__VAR = OP_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__REF = OP_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__ATTRIBUTES = OP_DEF_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF__REFERENCES = OP_DEF_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>EClass Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EAttributeOpDefImpl <em>EAttribute Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EAttributeOpDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEAttributeOpDef()
   * @generated
   */
  int EATTRIBUTE_OP_DEF = 8;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OP_DEF__OP = OP_DEF__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OP_DEF__SETTERS = OP_DEF__SETTERS;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OP_DEF__VAR = OP_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OP_DEF__REF = OP_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EAttribute Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.EReferenceOpDefImpl <em>EReference Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.EReferenceOpDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEReferenceOpDef()
   * @generated
   */
  int EREFERENCE_OP_DEF = 9;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OP_DEF__OP = OP_DEF__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OP_DEF__SETTERS = OP_DEF__SETTERS;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OP_DEF__VAR = OP_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OP_DEF__REF = OP_DEF_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>EReference Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.setterDefImpl <em>setter Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.setterDefImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsetterDef()
   * @generated
   */
  int SETTER_DEF = 10;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_DEF__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_DEF__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Par</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_DEF__PAR = 2;

  /**
   * The number of structural features of the '<em>setter Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_DEF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.RewritingRuleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRewritingRule()
   * @generated
   */
  int REWRITING_RULE = 11;

  /**
   * The feature id for the '<em><b>Migrators SX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING_RULE__MIGRATORS_SX = 0;

  /**
   * The feature id for the '<em><b>Migrator DX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING_RULE__MIGRATOR_DX = 1;

  /**
   * The feature id for the '<em><b>Migrator SX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING_RULE__MIGRATOR_SX = 2;

  /**
   * The number of structural features of the '<em>Rewriting Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING_RULE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorImpl <em>Migrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MigratorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrator()
   * @generated
   */
  int MIGRATOR = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR__NAME = 0;

  /**
   * The number of structural features of the '<em>Migrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MigratorSXImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigratorSX()
   * @generated
   */
  int MIGRATOR_SX = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__NAME = MIGRATOR__NAME;

  /**
   * The feature id for the '<em><b>Element SX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__ELEMENT_SX = MIGRATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter SX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__FILTER_SX = MIGRATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Migrator SX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX_FEATURE_COUNT = MIGRATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigratorDX()
   * @generated
   */
  int MIGRATOR_DX = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__NAME = MIGRATOR__NAME;

  /**
   * The feature id for the '<em><b>Element DX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__ELEMENT_DX = MIGRATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter DX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__FILTER_DX = MIGRATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Migrator DX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX_FEATURE_COUNT = MIGRATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.FilterMigratorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFilterMigrator()
   * @generated
   */
  int FILTER_MIGRATOR = 15;

  /**
   * The feature id for the '<em><b>Feature SX</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__FEATURE_SX = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__OP = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__VALUE = 2;

  /**
   * The number of structural features of the '<em>Filter Migrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DotNavigationObjSXImpl <em>Dot Navigation Obj SX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DotNavigationObjSXImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDotNavigationObjSX()
   * @generated
   */
  int DOT_NAVIGATION_OBJ_SX = 16;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_SX__OBJ = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_SX__REF = 1;

  /**
   * The number of structural features of the '<em>Dot Navigation Obj SX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_SX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.DotNavigationObjDXImpl <em>Dot Navigation Obj DX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.DotNavigationObjDXImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDotNavigationObjDX()
   * @generated
   */
  int DOT_NAVIGATION_OBJ_DX = 17;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_DX__OBJ = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_DX__REF = 1;

  /**
   * The number of structural features of the '<em>Dot Navigation Obj DX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_NAVIGATION_OBJ_DX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl <em>OC Lin Ecore Specification CS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOCLinEcoreSpecificationCS()
   * @generated
   */
  int OC_LIN_ECORE_SPECIFICATION_CS = 18;

  /**
   * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Expr String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING = 1;

  /**
   * The number of structural features of the '<em>OC Lin Ecore Specification CS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OC_LIN_ECORE_SPECIFICATION_CS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.PackageImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 20;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__EANNOTATIONS = EcorePackage.EPACKAGE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = EcorePackage.EPACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NS_URI = EcorePackage.EPACKAGE__NS_URI;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NS_PREFIX = EcorePackage.EPACKAGE__NS_PREFIX;

  /**
   * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__EFACTORY_INSTANCE = EcorePackage.EPACKAGE__EFACTORY_INSTANCE;

  /**
   * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ECLASSIFIERS = EcorePackage.EPACKAGE__ECLASSIFIERS;

  /**
   * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ESUBPACKAGES = EcorePackage.EPACKAGE__ESUBPACKAGES;

  /**
   * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ESUPER_PACKAGE = EcorePackage.EPACKAGE__ESUPER_PACKAGE;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = EcorePackage.EPACKAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ClassImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 21;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EANNOTATIONS = EcorePackage.ECLASS__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = EcorePackage.ECLASS__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INSTANCE_CLASS_NAME = EcorePackage.ECLASS__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INSTANCE_CLASS = EcorePackage.ECLASS__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__DEFAULT_VALUE = EcorePackage.ECLASS__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INSTANCE_TYPE_NAME = EcorePackage.ECLASS__INSTANCE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EPACKAGE = EcorePackage.ECLASS__EPACKAGE;

  /**
   * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ETYPE_PARAMETERS = EcorePackage.ECLASS__ETYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ABSTRACT = EcorePackage.ECLASS__ABSTRACT;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INTERFACE = EcorePackage.ECLASS__INTERFACE;

  /**
   * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ESUPER_TYPES = EcorePackage.ECLASS__ESUPER_TYPES;

  /**
   * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EOPERATIONS = EcorePackage.ECLASS__EOPERATIONS;

  /**
   * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_ATTRIBUTES = EcorePackage.ECLASS__EALL_ATTRIBUTES;

  /**
   * The feature id for the '<em><b>EAll References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_REFERENCES = EcorePackage.ECLASS__EALL_REFERENCES;

  /**
   * The feature id for the '<em><b>EReferences</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EREFERENCES = EcorePackage.ECLASS__EREFERENCES;

  /**
   * The feature id for the '<em><b>EAttributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EATTRIBUTES = EcorePackage.ECLASS__EATTRIBUTES;

  /**
   * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_CONTAINMENTS = EcorePackage.ECLASS__EALL_CONTAINMENTS;

  /**
   * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_OPERATIONS = EcorePackage.ECLASS__EALL_OPERATIONS;

  /**
   * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_STRUCTURAL_FEATURES = EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES;

  /**
   * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_SUPER_TYPES = EcorePackage.ECLASS__EALL_SUPER_TYPES;

  /**
   * The feature id for the '<em><b>EID Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EID_ATTRIBUTE = EcorePackage.ECLASS__EID_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ESTRUCTURAL_FEATURES = EcorePackage.ECLASS__ESTRUCTURAL_FEATURES;

  /**
   * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EGENERIC_SUPER_TYPES = EcorePackage.ECLASS__EGENERIC_SUPER_TYPES;

  /**
   * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__EALL_GENERIC_SUPER_TYPES = EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = EcorePackage.ECLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AttributeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 22;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__EANNOTATIONS = EcorePackage.EATTRIBUTE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = EcorePackage.EATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ORDERED = EcorePackage.EATTRIBUTE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNIQUE = EcorePackage.EATTRIBUTE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__LOWER_BOUND = EcorePackage.EATTRIBUTE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UPPER_BOUND = EcorePackage.EATTRIBUTE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MANY = EcorePackage.EATTRIBUTE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__REQUIRED = EcorePackage.EATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ETYPE = EcorePackage.EATTRIBUTE__ETYPE;

  /**
   * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__EGENERIC_TYPE = EcorePackage.EATTRIBUTE__EGENERIC_TYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__CHANGEABLE = EcorePackage.EATTRIBUTE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VOLATILE = EcorePackage.EATTRIBUTE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TRANSIENT = EcorePackage.EATTRIBUTE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT_VALUE_LITERAL = EcorePackage.EATTRIBUTE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DEFAULT_VALUE = EcorePackage.EATTRIBUTE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__UNSETTABLE = EcorePackage.EATTRIBUTE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DERIVED = EcorePackage.EATTRIBUTE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ECONTAINING_CLASS = EcorePackage.EATTRIBUTE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ID = EcorePackage.EATTRIBUTE__ID;

  /**
   * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__EATTRIBUTE_TYPE = EcorePackage.EATTRIBUTE__EATTRIBUTE_TYPE;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = EcorePackage.EATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ReferenceImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 23;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EANNOTATIONS = EcorePackage.EREFERENCE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = EcorePackage.EREFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ORDERED = EcorePackage.EREFERENCE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UNIQUE = EcorePackage.EREFERENCE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LOWER_BOUND = EcorePackage.EREFERENCE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UPPER_BOUND = EcorePackage.EREFERENCE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__MANY = EcorePackage.EREFERENCE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REQUIRED = EcorePackage.EREFERENCE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ETYPE = EcorePackage.EREFERENCE__ETYPE;

  /**
   * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EGENERIC_TYPE = EcorePackage.EREFERENCE__EGENERIC_TYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__CHANGEABLE = EcorePackage.EREFERENCE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__VOLATILE = EcorePackage.EREFERENCE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TRANSIENT = EcorePackage.EREFERENCE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DEFAULT_VALUE_LITERAL = EcorePackage.EREFERENCE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DEFAULT_VALUE = EcorePackage.EREFERENCE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__UNSETTABLE = EcorePackage.EREFERENCE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DERIVED = EcorePackage.EREFERENCE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ECONTAINING_CLASS = EcorePackage.EREFERENCE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__CONTAINMENT = EcorePackage.EREFERENCE__CONTAINMENT;

  /**
   * The feature id for the '<em><b>Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__CONTAINER = EcorePackage.EREFERENCE__CONTAINER;

  /**
   * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__RESOLVE_PROXIES = EcorePackage.EREFERENCE__RESOLVE_PROXIES;

  /**
   * The feature id for the '<em><b>EOpposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EOPPOSITE = EcorePackage.EREFERENCE__EOPPOSITE;

  /**
   * The feature id for the '<em><b>EReference Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EREFERENCE_TYPE = EcorePackage.EREFERENCE__EREFERENCE_TYPE;

  /**
   * The feature id for the '<em><b>EKeys</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EKEYS = EcorePackage.EREFERENCE__EKEYS;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = EcorePackage.EREFERENCE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MyModel <em>My Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.MyModel
   * @generated
   */
  EClass getMyModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.MyModel#getMigrationLib <em>Migration Lib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Migration Lib</em>'.
   * @see org.xtext.example.mydsl.myDsl.MyModel#getMigrationLib()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_MigrationLib();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.MyModel#getMigrationProgr <em>Migration Progr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Migration Progr</em>'.
   * @see org.xtext.example.mydsl.myDsl.MyModel#getMigrationProgr()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_MigrationProgr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MigrationLibrary <em>Migration Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Library</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationLibrary
   * @generated
   */
  EClass getMigrationLibrary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MigrationLibrary#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationLibrary#getTitle()
   * @see #getMigrationLibrary()
   * @generated
   */
  EAttribute getMigrationLibrary_Title();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.MigrationLibrary#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationLibrary#getRules()
   * @see #getMigrationLibrary()
   * @generated
   */
  EReference getMigrationLibrary_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MigrationProgram <em>Migration Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Program</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram
   * @generated
   */
  EClass getMigrationProgram();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getLibs <em>Libs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Libs</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getLibs()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Libs();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getMigr <em>Migr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Migr</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getMigr()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Migr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getTypeArt <em>Type Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Art</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getTypeArt()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_TypeArt();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getName()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Name();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getTransformationPackage <em>Transformation Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Transformation Package</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getTransformationPackage()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_TransformationPackage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getDelta()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Delta();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigrationProgram#getRules()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see org.xtext.example.mydsl.myDsl.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Artifact#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Artifact#getType()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Rule#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rule#getFilter()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Rule#getRewritingRules <em>Rewriting Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rewriting Rules</em>'.
   * @see org.xtext.example.mydsl.myDsl.Rule#getRewritingRules()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RewritingRules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OpDef <em>Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.OpDef
   * @generated
   */
  EClass getOpDef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.OpDef#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.OpDef#getOp()
   * @see #getOpDef()
   * @generated
   */
  EAttribute getOpDef_Op();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.OpDef#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see org.xtext.example.mydsl.myDsl.OpDef#getSetters()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Setters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef <em>EPackage Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage Op Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.EPackageOpDef
   * @generated
   */
  EClass getEPackageOpDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.EPackageOpDef#getVar()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.EPackageOpDef#getRef()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.xtext.example.mydsl.myDsl.EPackageOpDef#getClasses()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Classes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EClassOpDef <em>EClass Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Op Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.EClassOpDef
   * @generated
   */
  EClass getEClassOpDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EClassOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.EClassOpDef#getVar()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EClassOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.EClassOpDef#getRef()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EClassOpDef#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.mydsl.myDsl.EClassOpDef#getAttributes()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.EClassOpDef#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see org.xtext.example.mydsl.myDsl.EClassOpDef#getReferences()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_References();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EAttributeOpDef <em>EAttribute Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute Op Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.EAttributeOpDef
   * @generated
   */
  EClass getEAttributeOpDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EAttributeOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.EAttributeOpDef#getVar()
   * @see #getEAttributeOpDef()
   * @generated
   */
  EReference getEAttributeOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EAttributeOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.EAttributeOpDef#getRef()
   * @see #getEAttributeOpDef()
   * @generated
   */
  EReference getEAttributeOpDef_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef <em>EReference Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference Op Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.EReferenceOpDef
   * @generated
   */
  EClass getEReferenceOpDef();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mydsl.myDsl.EReferenceOpDef#getVar()
   * @see #getEReferenceOpDef()
   * @generated
   */
  EReference getEReferenceOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.EReferenceOpDef#getRef()
   * @see #getEReferenceOpDef()
   * @generated
   */
  EReference getEReferenceOpDef_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.setterDef <em>setter Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>setter Def</em>'.
   * @see org.xtext.example.mydsl.myDsl.setterDef
   * @generated
   */
  EClass getsetterDef();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.setterDef#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see org.xtext.example.mydsl.myDsl.setterDef#getMetafeature()
   * @see #getsetterDef()
   * @generated
   */
  EReference getsetterDef_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.setterDef#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.mydsl.myDsl.setterDef#getOperator()
   * @see #getsetterDef()
   * @generated
   */
  EAttribute getsetterDef_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.setterDef#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Par</em>'.
   * @see org.xtext.example.mydsl.myDsl.setterDef#getPar()
   * @see #getsetterDef()
   * @generated
   */
  EReference getsetterDef_Par();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.RewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rewriting Rule</em>'.
   * @see org.xtext.example.mydsl.myDsl.RewritingRule
   * @generated
   */
  EClass getRewritingRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorsSX <em>Migrators SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrators SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorsSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorsSX();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator DX</em>'.
   * @see org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorDX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorDX();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorSX();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Migrator <em>Migrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Migrator
   * @generated
   */
  EClass getMigrator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Migrator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Migrator#getName()
   * @see #getMigrator()
   * @generated
   */
  EAttribute getMigrator_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorSX
   * @generated
   */
  EClass getMigratorSX();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.MigratorSX#getElementSX <em>Element SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorSX#getElementSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_ElementSX();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.MigratorSX#getFilterSX <em>Filter SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorSX#getFilterSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_FilterSX();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.MigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator DX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorDX
   * @generated
   */
  EClass getMigratorDX();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.MigratorDX#getElementDX <em>Element DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element DX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorDX#getElementDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_ElementDX();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.MigratorDX#getFilterDX <em>Filter DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter DX</em>'.
   * @see org.xtext.example.mydsl.myDsl.MigratorDX#getFilterDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_FilterDX();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.FilterMigrator <em>Filter Migrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Migrator</em>'.
   * @see org.xtext.example.mydsl.myDsl.FilterMigrator
   * @generated
   */
  EClass getFilterMigrator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FilterMigrator#getFeatureSX <em>Feature SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Feature SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.FilterMigrator#getFeatureSX()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_FeatureSX();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.FilterMigrator#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.FilterMigrator#getOp()
   * @see #getFilterMigrator()
   * @generated
   */
  EAttribute getFilterMigrator_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.FilterMigrator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.xtext.example.mydsl.myDsl.FilterMigrator#getValue()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX <em>Dot Navigation Obj SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Navigation Obj SX</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjSX
   * @generated
   */
  EClass getDotNavigationObjSX();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getObj()
   * @see #getDotNavigationObjSX()
   * @generated
   */
  EReference getDotNavigationObjSX_Obj();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getRef()
   * @see #getDotNavigationObjSX()
   * @generated
   */
  EReference getDotNavigationObjSX_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjDX <em>Dot Navigation Obj DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Navigation Obj DX</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjDX
   * @generated
   */
  EClass getDotNavigationObjDX();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjDX#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjDX#getObj()
   * @see #getDotNavigationObjDX()
   * @generated
   */
  EReference getDotNavigationObjDX_Obj();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjDX#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.example.mydsl.myDsl.DotNavigationObjDX#getRef()
   * @see #getDotNavigationObjDX()
   * @generated
   */
  EReference getDotNavigationObjDX_Ref();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS <em>OC Lin Ecore Specification CS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OC Lin Ecore Specification CS</em>'.
   * @see org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS
   * @generated
   */
  EClass getOCLinEcoreSpecificationCS();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getOwnedExpression <em>Owned Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getOwnedExpression()
   * @see #getOCLinEcoreSpecificationCS()
   * @generated
   */
  EReference getOCLinEcoreSpecificationCS_OwnedExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getExprString <em>Expr String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr String</em>'.
   * @see org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getExprString()
   * @see #getOCLinEcoreSpecificationCS()
   * @generated
   */
  EAttribute getOCLinEcoreSpecificationCS_ExprString();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.xtext.example.mydsl.myDsl.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.xtext.example.mydsl.myDsl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MyModelImpl <em>My Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MyModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMyModel()
     * @generated
     */
    EClass MY_MODEL = eINSTANCE.getMyModel();

    /**
     * The meta object literal for the '<em><b>Migration Lib</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_MODEL__MIGRATION_LIB = eINSTANCE.getMyModel_MigrationLib();

    /**
     * The meta object literal for the '<em><b>Migration Progr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MY_MODEL__MIGRATION_PROGR = eINSTANCE.getMyModel_MigrationProgr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MigrationLibraryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrationLibrary()
     * @generated
     */
    EClass MIGRATION_LIBRARY = eINSTANCE.getMigrationLibrary();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_LIBRARY__TITLE = eINSTANCE.getMigrationLibrary_Title();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_LIBRARY__RULES = eINSTANCE.getMigrationLibrary_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MigrationProgramImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrationProgram()
     * @generated
     */
    EClass MIGRATION_PROGRAM = eINSTANCE.getMigrationProgram();

    /**
     * The meta object literal for the '<em><b>Libs</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_PROGRAM__LIBS = eINSTANCE.getMigrationProgram_Libs();

    /**
     * The meta object literal for the '<em><b>Migr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_PROGRAM__MIGR = eINSTANCE.getMigrationProgram_Migr();

    /**
     * The meta object literal for the '<em><b>Type Art</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_PROGRAM__TYPE_ART = eINSTANCE.getMigrationProgram_TypeArt();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_PROGRAM__NAME = eINSTANCE.getMigrationProgram_Name();

    /**
     * The meta object literal for the '<em><b>Transformation Package</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE = eINSTANCE.getMigrationProgram_TransformationPackage();

    /**
     * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_PROGRAM__DELTA = eINSTANCE.getMigrationProgram_Delta();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATION_PROGRAM__RULES = eINSTANCE.getMigrationProgram_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ArtifactImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__TYPE = eINSTANCE.getArtifact_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RuleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__FILTER = eINSTANCE.getRule_Filter();

    /**
     * The meta object literal for the '<em><b>Rewriting Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__REWRITING_RULES = eINSTANCE.getRule_RewritingRules();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OpDefImpl <em>Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OpDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOpDef()
     * @generated
     */
    EClass OP_DEF = eINSTANCE.getOpDef();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_DEF__OP = eINSTANCE.getOpDef_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__SETTERS = eINSTANCE.getOpDef_Setters();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EPackageOpDefImpl <em>EPackage Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EPackageOpDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEPackageOpDef()
     * @generated
     */
    EClass EPACKAGE_OP_DEF = eINSTANCE.getEPackageOpDef();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OP_DEF__VAR = eINSTANCE.getEPackageOpDef_Var();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OP_DEF__REF = eINSTANCE.getEPackageOpDef_Ref();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OP_DEF__CLASSES = eINSTANCE.getEPackageOpDef_Classes();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl <em>EClass Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEClassOpDef()
     * @generated
     */
    EClass ECLASS_OP_DEF = eINSTANCE.getEClassOpDef();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OP_DEF__VAR = eINSTANCE.getEClassOpDef_Var();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OP_DEF__REF = eINSTANCE.getEClassOpDef_Ref();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OP_DEF__ATTRIBUTES = eINSTANCE.getEClassOpDef_Attributes();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OP_DEF__REFERENCES = eINSTANCE.getEClassOpDef_References();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EAttributeOpDefImpl <em>EAttribute Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EAttributeOpDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEAttributeOpDef()
     * @generated
     */
    EClass EATTRIBUTE_OP_DEF = eINSTANCE.getEAttributeOpDef();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OP_DEF__VAR = eINSTANCE.getEAttributeOpDef_Var();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OP_DEF__REF = eINSTANCE.getEAttributeOpDef_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.EReferenceOpDefImpl <em>EReference Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.EReferenceOpDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getEReferenceOpDef()
     * @generated
     */
    EClass EREFERENCE_OP_DEF = eINSTANCE.getEReferenceOpDef();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OP_DEF__VAR = eINSTANCE.getEReferenceOpDef_Var();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OP_DEF__REF = eINSTANCE.getEReferenceOpDef_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.setterDefImpl <em>setter Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.setterDefImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getsetterDef()
     * @generated
     */
    EClass SETTER_DEF = eINSTANCE.getsetterDef();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER_DEF__METAFEATURE = eINSTANCE.getsetterDef_Metafeature();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTER_DEF__OPERATOR = eINSTANCE.getsetterDef_Operator();

    /**
     * The meta object literal for the '<em><b>Par</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER_DEF__PAR = eINSTANCE.getsetterDef_Par();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.RewritingRuleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getRewritingRule()
     * @generated
     */
    EClass REWRITING_RULE = eINSTANCE.getRewritingRule();

    /**
     * The meta object literal for the '<em><b>Migrators SX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWRITING_RULE__MIGRATORS_SX = eINSTANCE.getRewritingRule_MigratorsSX();

    /**
     * The meta object literal for the '<em><b>Migrator DX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWRITING_RULE__MIGRATOR_DX = eINSTANCE.getRewritingRule_MigratorDX();

    /**
     * The meta object literal for the '<em><b>Migrator SX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWRITING_RULE__MIGRATOR_SX = eINSTANCE.getRewritingRule_MigratorSX();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorImpl <em>Migrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MigratorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigrator()
     * @generated
     */
    EClass MIGRATOR = eINSTANCE.getMigrator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATOR__NAME = eINSTANCE.getMigrator_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MigratorSXImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigratorSX()
     * @generated
     */
    EClass MIGRATOR_SX = eINSTANCE.getMigratorSX();

    /**
     * The meta object literal for the '<em><b>Element SX</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_SX__ELEMENT_SX = eINSTANCE.getMigratorSX_ElementSX();

    /**
     * The meta object literal for the '<em><b>Filter SX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_SX__FILTER_SX = eINSTANCE.getMigratorSX_FilterSX();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMigratorDX()
     * @generated
     */
    EClass MIGRATOR_DX = eINSTANCE.getMigratorDX();

    /**
     * The meta object literal for the '<em><b>Element DX</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_DX__ELEMENT_DX = eINSTANCE.getMigratorDX_ElementDX();

    /**
     * The meta object literal for the '<em><b>Filter DX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_DX__FILTER_DX = eINSTANCE.getMigratorDX_FilterDX();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.FilterMigratorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFilterMigrator()
     * @generated
     */
    EClass FILTER_MIGRATOR = eINSTANCE.getFilterMigrator();

    /**
     * The meta object literal for the '<em><b>Feature SX</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__FEATURE_SX = eINSTANCE.getFilterMigrator_FeatureSX();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_MIGRATOR__OP = eINSTANCE.getFilterMigrator_Op();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__VALUE = eINSTANCE.getFilterMigrator_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DotNavigationObjSXImpl <em>Dot Navigation Obj SX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DotNavigationObjSXImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDotNavigationObjSX()
     * @generated
     */
    EClass DOT_NAVIGATION_OBJ_SX = eINSTANCE.getDotNavigationObjSX();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_NAVIGATION_OBJ_SX__OBJ = eINSTANCE.getDotNavigationObjSX_Obj();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_NAVIGATION_OBJ_SX__REF = eINSTANCE.getDotNavigationObjSX_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.DotNavigationObjDXImpl <em>Dot Navigation Obj DX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.DotNavigationObjDXImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDotNavigationObjDX()
     * @generated
     */
    EClass DOT_NAVIGATION_OBJ_DX = eINSTANCE.getDotNavigationObjDX();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_NAVIGATION_OBJ_DX__OBJ = eINSTANCE.getDotNavigationObjDX_Obj();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_NAVIGATION_OBJ_DX__REF = eINSTANCE.getDotNavigationObjDX_Ref();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl <em>OC Lin Ecore Specification CS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOCLinEcoreSpecificationCS()
     * @generated
     */
    EClass OC_LIN_ECORE_SPECIFICATION_CS = eINSTANCE.getOCLinEcoreSpecificationCS();

    /**
     * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION = eINSTANCE.getOCLinEcoreSpecificationCS_OwnedExpression();

    /**
     * The meta object literal for the '<em><b>Expr String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING = eINSTANCE.getOCLinEcoreSpecificationCS_ExprString();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.PackageImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ClassImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AttributeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ReferenceImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

  }

} //MyDslPackage
