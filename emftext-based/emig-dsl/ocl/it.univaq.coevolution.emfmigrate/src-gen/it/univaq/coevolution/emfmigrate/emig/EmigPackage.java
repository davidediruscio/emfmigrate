/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import OCLinEmig.OCLinEmigPackage;

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
 * @see it.univaq.coevolution.emfmigrate.emig.EmigFactory
 * @model kind="package"
 * @generated
 */
public interface EmigPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "emig";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univaq.it/coevolution/emfmigrate/Emig";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "emig";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmigPackage eINSTANCE = it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl.init();

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl <em>My Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMyModel()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MigrationLibraryImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrationLibrary()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrationProgram()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.ArtifactImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getArtifact()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.RuleImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getRule()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OpDefImpl <em>Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.OpDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOpDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EPackageOpDefImpl <em>EPackage Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EPackageOpDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEPackageOpDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EClassOpDefImpl <em>EClass Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EClassOpDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEClassOpDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EAttributeOpDefImpl <em>EAttribute Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EAttributeOpDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEAttributeOpDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EReferenceOpDefImpl <em>EReference Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EReferenceOpDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEReferenceOpDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl <em>setter Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getsetterDef()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.RewritingRuleImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getRewritingRule()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorImpl <em>Migrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrator()
   * @generated
   */
  int MIGRATOR = 12;

  /**
   * The number of structural features of the '<em>Migrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigratorSX()
   * @generated
   */
  int MIGRATOR_SX = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__NAME = MIGRATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element SX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__ELEMENT_SX = MIGRATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter SX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__FILTER_SX = MIGRATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Migrator SX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX_FEATURE_COUNT = MIGRATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigratorDX()
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
  int MIGRATOR_DX__NAME = MIGRATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element DX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__ELEMENT_DX = MIGRATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Filter DX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__FILTER_DX = MIGRATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Migrator DX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX_FEATURE_COUNT = MIGRATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getFilterMigrator()
   * @generated
   */
  int FILTER_MIGRATOR = 15;

  /**
   * The feature id for the '<em><b>Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__SPECIFICATION = 0;

  /**
   * The number of structural features of the '<em>Filter Migrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjSXImpl <em>Dot Navigation Obj SX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjSXImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getDotNavigationObjSX()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjDXImpl <em>Dot Navigation Obj DX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjDXImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getDotNavigationObjDX()
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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.ParameterImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 18;

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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.PackageImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 19;

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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.ClassImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 20;

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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.AttributeImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 21;

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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.ReferenceImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 22;

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
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.NavigationOrAttributeCallExpImpl <em>Navigation Or Attribute Call Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.NavigationOrAttributeCallExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getNavigationOrAttributeCallExp()
   * @generated
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP = 23;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__LOCATION = OCLinEmigPackage.OCL_EXPRESSION__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__COMMENTS_BEFORE = OCLinEmigPackage.OCL_EXPRESSION__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__COMMENTS_AFTER = OCLinEmigPackage.OCL_EXPRESSION__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__TYPE = OCLinEmigPackage.OCL_EXPRESSION__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__IF_EXP3 = OCLinEmigPackage.OCL_EXPRESSION__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__APPLIED_PROPERTY = OCLinEmigPackage.OCL_EXPRESSION__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__COLLECTION = OCLinEmigPackage.OCL_EXPRESSION__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__LET_EXP = OCLinEmigPackage.OCL_EXPRESSION__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__LOOP_EXP = OCLinEmigPackage.OCL_EXPRESSION__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__PARENT_OPERATION = OCLinEmigPackage.OCL_EXPRESSION__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.OCL_EXPRESSION__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__IF_EXP2 = OCLinEmigPackage.OCL_EXPRESSION__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__OWNING_OPERATION = OCLinEmigPackage.OCL_EXPRESSION__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__IF_EXP1 = OCLinEmigPackage.OCL_EXPRESSION__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.OCL_EXPRESSION__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP__SRC = OCLinEmigPackage.OCL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Navigation Or Attribute Call Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAVIGATION_OR_ATTRIBUTE_CALL_EXP_FEATURE_COUNT = OCLinEmigPackage.OCL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.VariableExpImpl <em>Variable Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.VariableExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getVariableExp()
   * @generated
   */
  int VARIABLE_EXP = 24;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__LOCATION = OCLinEmigPackage.VARIABLE_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__COMMENTS_BEFORE = OCLinEmigPackage.VARIABLE_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__COMMENTS_AFTER = OCLinEmigPackage.VARIABLE_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__TYPE = OCLinEmigPackage.VARIABLE_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__IF_EXP3 = OCLinEmigPackage.VARIABLE_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__APPLIED_PROPERTY = OCLinEmigPackage.VARIABLE_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__COLLECTION = OCLinEmigPackage.VARIABLE_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__LET_EXP = OCLinEmigPackage.VARIABLE_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__LOOP_EXP = OCLinEmigPackage.VARIABLE_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__PARENT_OPERATION = OCLinEmigPackage.VARIABLE_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.VARIABLE_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__IF_EXP2 = OCLinEmigPackage.VARIABLE_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__OWNING_OPERATION = OCLinEmigPackage.VARIABLE_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__IF_EXP1 = OCLinEmigPackage.VARIABLE_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.VARIABLE_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Referred Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP__REFERRED_VARIABLE = OCLinEmigPackage.VARIABLE_EXP__REFERRED_VARIABLE;

  /**
   * The number of structural features of the '<em>Variable Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_EXP_FEATURE_COUNT = OCLinEmigPackage.VARIABLE_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SuperExpImpl <em>Super Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.SuperExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSuperExp()
   * @generated
   */
  int SUPER_EXP = 25;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__LOCATION = OCLinEmigPackage.SUPER_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__COMMENTS_BEFORE = OCLinEmigPackage.SUPER_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__COMMENTS_AFTER = OCLinEmigPackage.SUPER_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__TYPE = OCLinEmigPackage.SUPER_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__IF_EXP3 = OCLinEmigPackage.SUPER_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__APPLIED_PROPERTY = OCLinEmigPackage.SUPER_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__COLLECTION = OCLinEmigPackage.SUPER_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__LET_EXP = OCLinEmigPackage.SUPER_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__LOOP_EXP = OCLinEmigPackage.SUPER_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__PARENT_OPERATION = OCLinEmigPackage.SUPER_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.SUPER_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__IF_EXP2 = OCLinEmigPackage.SUPER_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__OWNING_OPERATION = OCLinEmigPackage.SUPER_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__IF_EXP1 = OCLinEmigPackage.SUPER_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.SUPER_EXP__OWNING_ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Super Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPER_EXP_FEATURE_COUNT = OCLinEmigPackage.SUPER_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.BagExpImpl <em>Bag Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.BagExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getBagExp()
   * @generated
   */
  int BAG_EXP = 26;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__LOCATION = OCLinEmigPackage.BAG_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__COMMENTS_BEFORE = OCLinEmigPackage.BAG_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__COMMENTS_AFTER = OCLinEmigPackage.BAG_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__TYPE = OCLinEmigPackage.BAG_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__IF_EXP3 = OCLinEmigPackage.BAG_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__APPLIED_PROPERTY = OCLinEmigPackage.BAG_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__COLLECTION = OCLinEmigPackage.BAG_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__LET_EXP = OCLinEmigPackage.BAG_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__LOOP_EXP = OCLinEmigPackage.BAG_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__PARENT_OPERATION = OCLinEmigPackage.BAG_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.BAG_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__IF_EXP2 = OCLinEmigPackage.BAG_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__OWNING_OPERATION = OCLinEmigPackage.BAG_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__IF_EXP1 = OCLinEmigPackage.BAG_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.BAG_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP__ELEMENTS = OCLinEmigPackage.BAG_EXP__ELEMENTS;

  /**
   * The number of structural features of the '<em>Bag Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BAG_EXP_FEATURE_COUNT = OCLinEmigPackage.BAG_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.OrderedSetExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOrderedSetExp()
   * @generated
   */
  int ORDERED_SET_EXP = 27;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__LOCATION = OCLinEmigPackage.ORDERED_SET_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__COMMENTS_BEFORE = OCLinEmigPackage.ORDERED_SET_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__COMMENTS_AFTER = OCLinEmigPackage.ORDERED_SET_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__TYPE = OCLinEmigPackage.ORDERED_SET_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__IF_EXP3 = OCLinEmigPackage.ORDERED_SET_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__APPLIED_PROPERTY = OCLinEmigPackage.ORDERED_SET_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__COLLECTION = OCLinEmigPackage.ORDERED_SET_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__LET_EXP = OCLinEmigPackage.ORDERED_SET_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__LOOP_EXP = OCLinEmigPackage.ORDERED_SET_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__PARENT_OPERATION = OCLinEmigPackage.ORDERED_SET_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.ORDERED_SET_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__IF_EXP2 = OCLinEmigPackage.ORDERED_SET_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__OWNING_OPERATION = OCLinEmigPackage.ORDERED_SET_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__IF_EXP1 = OCLinEmigPackage.ORDERED_SET_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.ORDERED_SET_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP__ELEMENTS = OCLinEmigPackage.ORDERED_SET_EXP__ELEMENTS;

  /**
   * The number of structural features of the '<em>Ordered Set Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDERED_SET_EXP_FEATURE_COUNT = OCLinEmigPackage.ORDERED_SET_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.SequenceExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSequenceExp()
   * @generated
   */
  int SEQUENCE_EXP = 28;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__LOCATION = OCLinEmigPackage.SEQUENCE_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__COMMENTS_BEFORE = OCLinEmigPackage.SEQUENCE_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__COMMENTS_AFTER = OCLinEmigPackage.SEQUENCE_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__TYPE = OCLinEmigPackage.SEQUENCE_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__IF_EXP3 = OCLinEmigPackage.SEQUENCE_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__APPLIED_PROPERTY = OCLinEmigPackage.SEQUENCE_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__COLLECTION = OCLinEmigPackage.SEQUENCE_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__LET_EXP = OCLinEmigPackage.SEQUENCE_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__LOOP_EXP = OCLinEmigPackage.SEQUENCE_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__PARENT_OPERATION = OCLinEmigPackage.SEQUENCE_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.SEQUENCE_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__IF_EXP2 = OCLinEmigPackage.SEQUENCE_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__OWNING_OPERATION = OCLinEmigPackage.SEQUENCE_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__IF_EXP1 = OCLinEmigPackage.SEQUENCE_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.SEQUENCE_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP__ELEMENTS = OCLinEmigPackage.SEQUENCE_EXP__ELEMENTS;

  /**
   * The number of structural features of the '<em>Sequence Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_EXP_FEATURE_COUNT = OCLinEmigPackage.SEQUENCE_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SetExpImpl <em>Set Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.SetExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSetExp()
   * @generated
   */
  int SET_EXP = 29;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__LOCATION = OCLinEmigPackage.SET_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__COMMENTS_BEFORE = OCLinEmigPackage.SET_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__COMMENTS_AFTER = OCLinEmigPackage.SET_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__TYPE = OCLinEmigPackage.SET_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__IF_EXP3 = OCLinEmigPackage.SET_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__APPLIED_PROPERTY = OCLinEmigPackage.SET_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__COLLECTION = OCLinEmigPackage.SET_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__LET_EXP = OCLinEmigPackage.SET_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__LOOP_EXP = OCLinEmigPackage.SET_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__PARENT_OPERATION = OCLinEmigPackage.SET_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.SET_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__IF_EXP2 = OCLinEmigPackage.SET_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__OWNING_OPERATION = OCLinEmigPackage.SET_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__IF_EXP1 = OCLinEmigPackage.SET_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.SET_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP__ELEMENTS = OCLinEmigPackage.SET_EXP__ELEMENTS;

  /**
   * The number of structural features of the '<em>Set Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_EXP_FEATURE_COUNT = OCLinEmigPackage.SET_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.TupleExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getTupleExp()
   * @generated
   */
  int TUPLE_EXP = 30;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__LOCATION = OCLinEmigPackage.TUPLE_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__COMMENTS_BEFORE = OCLinEmigPackage.TUPLE_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__COMMENTS_AFTER = OCLinEmigPackage.TUPLE_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__TYPE = OCLinEmigPackage.TUPLE_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__IF_EXP3 = OCLinEmigPackage.TUPLE_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__APPLIED_PROPERTY = OCLinEmigPackage.TUPLE_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__COLLECTION = OCLinEmigPackage.TUPLE_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__LET_EXP = OCLinEmigPackage.TUPLE_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__LOOP_EXP = OCLinEmigPackage.TUPLE_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__PARENT_OPERATION = OCLinEmigPackage.TUPLE_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.TUPLE_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__IF_EXP2 = OCLinEmigPackage.TUPLE_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__OWNING_OPERATION = OCLinEmigPackage.TUPLE_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__IF_EXP1 = OCLinEmigPackage.TUPLE_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.TUPLE_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Tuple Part</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP__TUPLE_PART = OCLinEmigPackage.TUPLE_EXP__TUPLE_PART;

  /**
   * The number of structural features of the '<em>Tuple Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_EXP_FEATURE_COUNT = OCLinEmigPackage.TUPLE_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MapExpImpl <em>Map Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.MapExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMapExp()
   * @generated
   */
  int MAP_EXP = 31;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__LOCATION = OCLinEmigPackage.MAP_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__COMMENTS_BEFORE = OCLinEmigPackage.MAP_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__COMMENTS_AFTER = OCLinEmigPackage.MAP_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__TYPE = OCLinEmigPackage.MAP_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__IF_EXP3 = OCLinEmigPackage.MAP_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__APPLIED_PROPERTY = OCLinEmigPackage.MAP_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__COLLECTION = OCLinEmigPackage.MAP_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__LET_EXP = OCLinEmigPackage.MAP_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__LOOP_EXP = OCLinEmigPackage.MAP_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__PARENT_OPERATION = OCLinEmigPackage.MAP_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.MAP_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__IF_EXP2 = OCLinEmigPackage.MAP_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__OWNING_OPERATION = OCLinEmigPackage.MAP_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__IF_EXP1 = OCLinEmigPackage.MAP_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.MAP_EXP__OWNING_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP__ELEMENTS = OCLinEmigPackage.MAP_EXP__ELEMENTS;

  /**
   * The number of structural features of the '<em>Map Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_EXP_FEATURE_COUNT = OCLinEmigPackage.MAP_EXP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.emfmigrate.emig.impl.OclUndefinedExpImpl
   * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOclUndefinedExp()
   * @generated
   */
  int OCL_UNDEFINED_EXP = 32;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__LOCATION = OCLinEmigPackage.OCL_UNDEFINED_EXP__LOCATION;

  /**
   * The feature id for the '<em><b>Comments Before</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__COMMENTS_BEFORE = OCLinEmigPackage.OCL_UNDEFINED_EXP__COMMENTS_BEFORE;

  /**
   * The feature id for the '<em><b>Comments After</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__COMMENTS_AFTER = OCLinEmigPackage.OCL_UNDEFINED_EXP__COMMENTS_AFTER;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__TYPE = OCLinEmigPackage.OCL_UNDEFINED_EXP__TYPE;

  /**
   * The feature id for the '<em><b>If Exp3</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__IF_EXP3 = OCLinEmigPackage.OCL_UNDEFINED_EXP__IF_EXP3;

  /**
   * The feature id for the '<em><b>Applied Property</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__APPLIED_PROPERTY = OCLinEmigPackage.OCL_UNDEFINED_EXP__APPLIED_PROPERTY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__COLLECTION = OCLinEmigPackage.OCL_UNDEFINED_EXP__COLLECTION;

  /**
   * The feature id for the '<em><b>Let Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__LET_EXP = OCLinEmigPackage.OCL_UNDEFINED_EXP__LET_EXP;

  /**
   * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__LOOP_EXP = OCLinEmigPackage.OCL_UNDEFINED_EXP__LOOP_EXP;

  /**
   * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__PARENT_OPERATION = OCLinEmigPackage.OCL_UNDEFINED_EXP__PARENT_OPERATION;

  /**
   * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE = OCLinEmigPackage.OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE;

  /**
   * The feature id for the '<em><b>If Exp2</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__IF_EXP2 = OCLinEmigPackage.OCL_UNDEFINED_EXP__IF_EXP2;

  /**
   * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__OWNING_OPERATION = OCLinEmigPackage.OCL_UNDEFINED_EXP__OWNING_OPERATION;

  /**
   * The feature id for the '<em><b>If Exp1</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__IF_EXP1 = OCLinEmigPackage.OCL_UNDEFINED_EXP__IF_EXP1;

  /**
   * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE = OCLinEmigPackage.OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE;

  /**
   * The number of structural features of the '<em>Ocl Undefined Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_UNDEFINED_EXP_FEATURE_COUNT = OCLinEmigPackage.OCL_UNDEFINED_EXP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MyModel <em>My Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>My Model</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MyModel
   * @generated
   */
  EClass getMyModel();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationLib <em>Migration Lib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Migration Lib</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationLib()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_MigrationLib();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationProgr <em>Migration Progr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Migration Progr</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationProgr()
   * @see #getMyModel()
   * @generated
   */
  EReference getMyModel_MigrationProgr();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MigrationLibrary <em>Migration Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Library</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationLibrary
   * @generated
   */
  EClass getMigrationLibrary();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.MigrationLibrary#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationLibrary#getTitle()
   * @see #getMigrationLibrary()
   * @generated
   */
  EAttribute getMigrationLibrary_Title();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.MigrationLibrary#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationLibrary#getRules()
   * @see #getMigrationLibrary()
   * @generated
   */
  EReference getMigrationLibrary_Rules();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram <em>Migration Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migration Program</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram
   * @generated
   */
  EClass getMigrationProgram();

  /**
   * Returns the meta object for the attribute list '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getLibs <em>Libs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Libs</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getLibs()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Libs();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getMigr <em>Migr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Migr</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getMigr()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Migr();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getTypeArt <em>Type Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Art</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getTypeArt()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_TypeArt();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getName()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Name();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getTransformationPackage <em>Transformation Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Transformation Package</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getTransformationPackage()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_TransformationPackage();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getDelta()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Delta();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram#getRules()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_Rules();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.Artifact#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Artifact#getType()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Type();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.Rule#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Rule#getFilter()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.Rule#getRewritingRules <em>Rewriting Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rewriting Rules</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Rule#getRewritingRules()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RewritingRules();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.OpDef <em>Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.OpDef
   * @generated
   */
  EClass getOpDef();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.OpDef#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.OpDef#getOp()
   * @see #getOpDef()
   * @generated
   */
  EAttribute getOpDef_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.OpDef#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.OpDef#getSetters()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Setters();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef <em>EPackage Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage Op Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EPackageOpDef
   * @generated
   */
  EClass getEPackageOpDef();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getVar()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getRef()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getClasses()
   * @see #getEPackageOpDef()
   * @generated
   */
  EReference getEPackageOpDef_Classes();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef <em>EClass Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Op Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef
   * @generated
   */
  EClass getEClassOpDef();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getVar()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getRef()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getAttributes()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getReferences()
   * @see #getEClassOpDef()
   * @generated
   */
  EReference getEClassOpDef_References();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef <em>EAttribute Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute Op Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef
   * @generated
   */
  EClass getEAttributeOpDef();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getVar()
   * @see #getEAttributeOpDef()
   * @generated
   */
  EReference getEAttributeOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getRef()
   * @see #getEAttributeOpDef()
   * @generated
   */
  EReference getEAttributeOpDef_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef <em>EReference Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference Op Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef
   * @generated
   */
  EClass getEReferenceOpDef();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef#getVar()
   * @see #getEReferenceOpDef()
   * @generated
   */
  EReference getEReferenceOpDef_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef#getRef()
   * @see #getEReferenceOpDef()
   * @generated
   */
  EReference getEReferenceOpDef_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.setterDef <em>setter Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>setter Def</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.setterDef
   * @generated
   */
  EClass getsetterDef();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.setterDef#getMetafeature()
   * @see #getsetterDef()
   * @generated
   */
  EReference getsetterDef_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.setterDef#getOperator()
   * @see #getsetterDef()
   * @generated
   */
  EAttribute getsetterDef_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Par</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.setterDef#getPar()
   * @see #getsetterDef()
   * @generated
   */
  EReference getsetterDef_Par();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rewriting Rule</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule
   * @generated
   */
  EClass getRewritingRule();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorsSX <em>Migrators SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrators SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorsSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorsSX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator DX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorDX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorDX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorSX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Migrator <em>Migrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Migrator
   * @generated
   */
  EClass getMigrator();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX
   * @generated
   */
  EClass getMigratorSX();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX#getName()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_Name();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getElementSX <em>Element SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX#getElementSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_ElementSX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getFilterSX <em>Filter SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX#getFilterSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_FilterSX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator DX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX
   * @generated
   */
  EClass getMigratorDX();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX#getName()
   * @see #getMigratorDX()
   * @generated
   */
  EAttribute getMigratorDX_Name();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getElementDX <em>Element DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element DX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX#getElementDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_ElementDX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getFilterDX <em>Filter DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter DX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX#getFilterDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_FilterDX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator <em>Filter Migrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Migrator</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.FilterMigrator
   * @generated
   */
  EClass getFilterMigrator();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getSpecification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specification</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getSpecification()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Specification();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX <em>Dot Navigation Obj SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Navigation Obj SX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX
   * @generated
   */
  EClass getDotNavigationObjSX();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX#getObj()
   * @see #getDotNavigationObjSX()
   * @generated
   */
  EReference getDotNavigationObjSX_Obj();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX#getRef()
   * @see #getDotNavigationObjSX()
   * @generated
   */
  EReference getDotNavigationObjSX_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX <em>Dot Navigation Obj DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Navigation Obj DX</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX
   * @generated
   */
  EClass getDotNavigationObjDX();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getObj()
   * @see #getDotNavigationObjDX()
   * @generated
   */
  EReference getDotNavigationObjDX_Obj();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getRef()
   * @see #getDotNavigationObjDX()
   * @generated
   */
  EReference getDotNavigationObjDX_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.emig.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp <em>Navigation Or Attribute Call Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Navigation Or Attribute Call Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp
   * @generated
   */
  EClass getNavigationOrAttributeCallExp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp#getSrc <em>Src</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Src</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp#getSrc()
   * @see #getNavigationOrAttributeCallExp()
   * @generated
   */
  EReference getNavigationOrAttributeCallExp_Src();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.VariableExp <em>Variable Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.VariableExp
   * @generated
   */
  EClass getVariableExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.SuperExp <em>Super Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Super Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.SuperExp
   * @generated
   */
  EClass getSuperExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.BagExp <em>Bag Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bag Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.BagExp
   * @generated
   */
  EClass getBagExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.OrderedSetExp <em>Ordered Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ordered Set Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.OrderedSetExp
   * @generated
   */
  EClass getOrderedSetExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.SequenceExp <em>Sequence Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.SequenceExp
   * @generated
   */
  EClass getSequenceExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.SetExp <em>Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.SetExp
   * @generated
   */
  EClass getSetExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.TupleExp <em>Tuple Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.TupleExp
   * @generated
   */
  EClass getTupleExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.MapExp <em>Map Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.MapExp
   * @generated
   */
  EClass getMapExp();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.emig.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ocl Undefined Exp</em>'.
   * @see it.univaq.coevolution.emfmigrate.emig.OclUndefinedExp
   * @generated
   */
  EClass getOclUndefinedExp();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EmigFactory getEmigFactory();

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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl <em>My Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMyModel()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MigrationLibraryImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrationLibrary()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrationProgram()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.ArtifactImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getArtifact()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.RuleImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getRule()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OpDefImpl <em>Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.OpDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOpDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EPackageOpDefImpl <em>EPackage Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EPackageOpDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEPackageOpDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EClassOpDefImpl <em>EClass Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EClassOpDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEClassOpDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EAttributeOpDefImpl <em>EAttribute Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EAttributeOpDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEAttributeOpDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.EReferenceOpDefImpl <em>EReference Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EReferenceOpDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getEReferenceOpDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl <em>setter Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getsetterDef()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.RewritingRuleImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getRewritingRule()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorImpl <em>Migrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigrator()
     * @generated
     */
    EClass MIGRATOR = eINSTANCE.getMigrator();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigratorSX()
     * @generated
     */
    EClass MIGRATOR_SX = eINSTANCE.getMigratorSX();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_SX__NAME = eINSTANCE.getMigratorSX_Name();

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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MigratorDXImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMigratorDX()
     * @generated
     */
    EClass MIGRATOR_DX = eINSTANCE.getMigratorDX();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATOR_DX__NAME = eINSTANCE.getMigratorDX_Name();

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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getFilterMigrator()
     * @generated
     */
    EClass FILTER_MIGRATOR = eINSTANCE.getFilterMigrator();

    /**
     * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__SPECIFICATION = eINSTANCE.getFilterMigrator_Specification();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjSXImpl <em>Dot Navigation Obj SX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjSXImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getDotNavigationObjSX()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjDXImpl <em>Dot Navigation Obj DX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.DotNavigationObjDXImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getDotNavigationObjDX()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.ParameterImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getParameter()
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
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.PackageImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.ClassImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.AttributeImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.ReferenceImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.NavigationOrAttributeCallExpImpl <em>Navigation Or Attribute Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.NavigationOrAttributeCallExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getNavigationOrAttributeCallExp()
     * @generated
     */
    EClass NAVIGATION_OR_ATTRIBUTE_CALL_EXP = eINSTANCE.getNavigationOrAttributeCallExp();

    /**
     * The meta object literal for the '<em><b>Src</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAVIGATION_OR_ATTRIBUTE_CALL_EXP__SRC = eINSTANCE.getNavigationOrAttributeCallExp_Src();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.VariableExpImpl <em>Variable Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.VariableExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getVariableExp()
     * @generated
     */
    EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SuperExpImpl <em>Super Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.SuperExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSuperExp()
     * @generated
     */
    EClass SUPER_EXP = eINSTANCE.getSuperExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.BagExpImpl <em>Bag Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.BagExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getBagExp()
     * @generated
     */
    EClass BAG_EXP = eINSTANCE.getBagExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.OrderedSetExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOrderedSetExp()
     * @generated
     */
    EClass ORDERED_SET_EXP = eINSTANCE.getOrderedSetExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.SequenceExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSequenceExp()
     * @generated
     */
    EClass SEQUENCE_EXP = eINSTANCE.getSequenceExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.SetExpImpl <em>Set Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.SetExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getSetExp()
     * @generated
     */
    EClass SET_EXP = eINSTANCE.getSetExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.TupleExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getTupleExp()
     * @generated
     */
    EClass TUPLE_EXP = eINSTANCE.getTupleExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.MapExpImpl <em>Map Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.MapExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getMapExp()
     * @generated
     */
    EClass MAP_EXP = eINSTANCE.getMapExp();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.emig.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.emfmigrate.emig.impl.OclUndefinedExpImpl
     * @see it.univaq.coevolution.emfmigrate.emig.impl.EmigPackageImpl#getOclUndefinedExp()
     * @generated
     */
    EClass OCL_UNDEFINED_EXP = eINSTANCE.getOclUndefinedExp();

  }

} //EmigPackage
