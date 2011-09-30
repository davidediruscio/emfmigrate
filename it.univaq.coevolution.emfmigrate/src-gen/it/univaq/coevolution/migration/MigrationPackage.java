/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

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
 * @see it.univaq.coevolution.migration.MigrationFactory
 * @model kind="package"
 * @generated
 */
public interface MigrationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "migration";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univaq.it/coevolution/Migration";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "migration";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MigrationPackage eINSTANCE = it.univaq.coevolution.migration.impl.MigrationPackageImpl.init();

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ModelImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TITLE = 1;

  /**
   * The feature id for the '<em><b>Operators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OPERATORS = 2;

  /**
   * The feature id for the '<em><b>Migration Progr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MIGRATION_PROGR = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.packageSettersImpl <em>package Setters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.packageSettersImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getpackageSetters()
   * @generated
   */
  int PACKAGE_SETTERS = 1;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS__VALUE = 1;

  /**
   * The feature id for the '<em><b>Value Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS__VALUE_REF = 2;

  /**
   * The number of structural features of the '<em>package Setters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.packageSetters_defImpl <em>package Setters def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.packageSetters_defImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getpackageSetters_def()
   * @generated
   */
  int PACKAGE_SETTERS_DEF = 2;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS_DEF__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Par</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS_DEF__PAR = 1;

  /**
   * The number of structural features of the '<em>package Setters def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_SETTERS_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.setNsUriImpl <em>set Ns Uri</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.setNsUriImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsUri()
   * @generated
   */
  int SET_NS_URI = 3;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI__OP = 0;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI__NS_URI = 1;

  /**
   * The number of structural features of the '<em>set Ns Uri</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.setNsUri_defImpl <em>set Ns Uri def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.setNsUri_defImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsUri_def()
   * @generated
   */
  int SET_NS_URI_DEF = 4;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI_DEF__OP = 0;

  /**
   * The feature id for the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI_DEF__NS_URI = 1;

  /**
   * The number of structural features of the '<em>set Ns Uri def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_URI_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.setNsPrefixImpl <em>set Ns Prefix</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.setNsPrefixImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsPrefix()
   * @generated
   */
  int SET_NS_PREFIX = 5;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX__OP = 0;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX__NS_PREFIX = 1;

  /**
   * The number of structural features of the '<em>set Ns Prefix</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.setNsPrefix_defImpl <em>set Ns Prefix def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.setNsPrefix_defImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsPrefix_def()
   * @generated
   */
  int SET_NS_PREFIX_DEF = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX_DEF__OP = 0;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX_DEF__NS_PREFIX = 1;

  /**
   * The number of structural features of the '<em>set Ns Prefix def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_NS_PREFIX_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.CHANGEPACKAGEImpl <em>CHANGEPACKAGE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.CHANGEPACKAGEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEPACKAGE()
   * @generated
   */
  int CHANGEPACKAGE = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEPACKAGE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEPACKAGE__REF = 1;

  /**
   * The number of structural features of the '<em>CHANGEPACKAGE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEPACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ADDPACKAGEImpl <em>ADDPACKAGE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ADDPACKAGEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDPACKAGE()
   * @generated
   */
  int ADDPACKAGE = 8;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDPACKAGE__OP = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDPACKAGE__NEW = 1;

  /**
   * The number of structural features of the '<em>ADDPACKAGE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDPACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.DELETEPACKAGEImpl <em>DELETEPACKAGE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.DELETEPACKAGEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEPACKAGE()
   * @generated
   */
  int DELETEPACKAGE = 9;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEPACKAGE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEPACKAGE__REF = 1;

  /**
   * The number of structural features of the '<em>DELETEPACKAGE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEPACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.PackageOpImpl <em>Package Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.PackageOpImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getPackageOp()
   * @generated
   */
  int PACKAGE_OP = 10;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP__CLASSES = 3;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP__COMPLEX = 4;

  /**
   * The number of structural features of the '<em>Package Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.OpDefImpl <em>Op Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.OpDefImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getOpDef()
   * @generated
   */
  int OP_DEF = 11;

  /**
   * The feature id for the '<em><b>Opdef</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__OPDEF = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__REF = 1;

  /**
   * The feature id for the '<em><b>Settersdef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__SETTERSDEF = 2;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__COMPLEX = 3;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__STRING = 4;

  /**
   * The feature id for the '<em><b>Dst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__DST = 5;

  /**
   * The feature id for the '<em><b>Feature Settersdef</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF__FEATURE_SETTERSDEF = 6;

  /**
   * The number of structural features of the '<em>Op Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_DEF_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.CHANGECLASSImpl <em>CHANGECLASS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.CHANGECLASSImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGECLASS()
   * @generated
   */
  int CHANGECLASS = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGECLASS__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGECLASS__REF = 1;

  /**
   * The number of structural features of the '<em>CHANGECLASS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGECLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ADDCLASSImpl <em>ADDCLASS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ADDCLASSImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDCLASS()
   * @generated
   */
  int ADDCLASS = 13;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDCLASS__OP = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDCLASS__NEW = 1;

  /**
   * The number of structural features of the '<em>ADDCLASS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDCLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.DELETECLASSImpl <em>DELETECLASS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.DELETECLASSImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETECLASS()
   * @generated
   */
  int DELETECLASS = 14;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETECLASS__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETECLASS__REF = 1;

  /**
   * The number of structural features of the '<em>DELETECLASS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETECLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.classSetterImpl <em>class Setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.classSetterImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getclassSetter()
   * @generated
   */
  int CLASS_SETTER = 15;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTER__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTER__VALUE = 1;

  /**
   * The feature id for the '<em><b>Value Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTER__VALUE_REF = 2;

  /**
   * The number of structural features of the '<em>class Setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.classSetters_defImpl <em>class Setters def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.classSetters_defImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getclassSetters_def()
   * @generated
   */
  int CLASS_SETTERS_DEF = 16;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTERS_DEF__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Par</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTERS_DEF__PAR = 1;

  /**
   * The number of structural features of the '<em>class Setters def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_SETTERS_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ClassOpImpl <em>Class Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ClassOpImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClassOp()
   * @generated
   */
  int CLASS_OP = 17;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__REFERENCES = 4;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP__COMPLEX = 5;

  /**
   * The number of structural features of the '<em>Class Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OP_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.eStructuralFeatureOpImpl <em>eStructural Feature Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.eStructuralFeatureOpImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#geteStructuralFeatureOp()
   * @generated
   */
  int ESTRUCTURAL_FEATURE_OP = 18;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE_OP__OP = 0;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE_OP__SETTERS = 1;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE_OP__COMPLEX = 2;

  /**
   * The number of structural features of the '<em>eStructural Feature Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.CHANGEATTRIBUTEImpl <em>CHANGEATTRIBUTE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.CHANGEATTRIBUTEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEATTRIBUTE()
   * @generated
   */
  int CHANGEATTRIBUTE = 19;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEATTRIBUTE__REF_ATTR = 0;

  /**
   * The number of structural features of the '<em>CHANGEATTRIBUTE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ADDATTRIBUTEImpl <em>ADDATTRIBUTE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ADDATTRIBUTEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDATTRIBUTE()
   * @generated
   */
  int ADDATTRIBUTE = 20;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDATTRIBUTE__NEW = 0;

  /**
   * The number of structural features of the '<em>ADDATTRIBUTE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.DELETEATTRIBUTEImpl <em>DELETEATTRIBUTE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.DELETEATTRIBUTEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEATTRIBUTE()
   * @generated
   */
  int DELETEATTRIBUTE = 21;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEATTRIBUTE__REF_ATTR = 0;

  /**
   * The number of structural features of the '<em>DELETEATTRIBUTE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl <em>RENAMEATTRIBUTE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRENAMEATTRIBUTE()
   * @generated
   */
  int RENAMEATTRIBUTE = 22;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMEATTRIBUTE__REF_ATTR = 0;

  /**
   * The feature id for the '<em><b>New Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMEATTRIBUTE__NEW_NAME = 1;

  /**
   * The number of structural features of the '<em>RENAMEATTRIBUTE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RENAMEATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl <em>MOVEATTRIBUTE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMOVEATTRIBUTE()
   * @generated
   */
  int MOVEATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEATTRIBUTE__REF_ATTR = 0;

  /**
   * The feature id for the '<em><b>Dst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEATTRIBUTE__DST = 1;

  /**
   * The number of structural features of the '<em>MOVEATTRIBUTE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl <em>Feature Setters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.FeatureSettersImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getFeatureSetters()
   * @generated
   */
  int FEATURE_SETTERS = 24;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Value EString</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__VALUE_ESTRING = 1;

  /**
   * The feature id for the '<em><b>Value EInt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__VALUE_EINT = 2;

  /**
   * The feature id for the '<em><b>Value EBool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__VALUE_EBOOL = 3;

  /**
   * The feature id for the '<em><b>Value Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__VALUE_REF = 4;

  /**
   * The feature id for the '<em><b>Value Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS__VALUE_FEATURE = 5;

  /**
   * The number of structural features of the '<em>Feature Setters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.AttributeOpImpl <em>Attribute Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.AttributeOpImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getAttributeOp()
   * @generated
   */
  int ATTRIBUTE_OP = 25;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OP__OP = ESTRUCTURAL_FEATURE_OP__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OP__SETTERS = ESTRUCTURAL_FEATURE_OP__SETTERS;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OP__COMPLEX = ESTRUCTURAL_FEATURE_OP__COMPLEX;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OP__VAR = ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OP_FEATURE_COUNT = ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.CHANGEREFERENCEImpl <em>CHANGEREFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.CHANGEREFERENCEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEREFERENCE()
   * @generated
   */
  int CHANGEREFERENCE = 26;

  /**
   * The feature id for the '<em><b>Ref Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEREFERENCE__REF_REF = 0;

  /**
   * The number of structural features of the '<em>CHANGEREFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGEREFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ADDREFERENCEImpl <em>ADDREFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ADDREFERENCEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDREFERENCE()
   * @generated
   */
  int ADDREFERENCE = 27;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDREFERENCE__NEW = 0;

  /**
   * The number of structural features of the '<em>ADDREFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDREFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.DELETEREFERENCEImpl <em>DELETEREFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.DELETEREFERENCEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEREFERENCE()
   * @generated
   */
  int DELETEREFERENCE = 28;

  /**
   * The feature id for the '<em><b>Ref Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEREFERENCE__REF_REF = 0;

  /**
   * The number of structural features of the '<em>DELETEREFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETEREFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl <em>MOVEREFERENCE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMOVEREFERENCE()
   * @generated
   */
  int MOVEREFERENCE = 29;

  /**
   * The feature id for the '<em><b>Ref Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEREFERENCE__REF_REF = 0;

  /**
   * The feature id for the '<em><b>Dst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEREFERENCE__DST = 1;

  /**
   * The number of structural features of the '<em>MOVEREFERENCE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVEREFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl <em>feature Setters def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.featureSetters_defImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getfeatureSetters_def()
   * @generated
   */
  int FEATURE_SETTERS_DEF = 30;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_DEF__LOWER_BOUND = 0;

  /**
   * The feature id for the '<em><b>EType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_DEF__ETYPE = 1;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_DEF__OPPOSITE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_DEF__NAME = 3;

  /**
   * The number of structural features of the '<em>feature Setters def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SETTERS_DEF_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ReferenceOpImpl <em>Reference Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ReferenceOpImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getReferenceOp()
   * @generated
   */
  int REFERENCE_OP = 31;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP__OP = ESTRUCTURAL_FEATURE_OP__OP;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP__SETTERS = ESTRUCTURAL_FEATURE_OP__SETTERS;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP__COMPLEX = ESTRUCTURAL_FEATURE_OP__COMPLEX;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP__VAR = ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>CHANGE op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP__CHANGE_OP = ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_OP_FEATURE_COUNT = ESTRUCTURAL_FEATURE_OP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl <em>Complex Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ComplexOperatorImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getComplexOperator()
   * @generated
   */
  int COMPLEX_OPERATOR = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Class Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__CLASS_OPERATIONS = 2;

  /**
   * The feature id for the '<em><b>Attribute Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS = 3;

  /**
   * The feature id for the '<em><b>Reference Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__REFERENCE_OPERATIONS = 4;

  /**
   * The number of structural features of the '<em>Complex Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.INTImpl <em>INT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.INTImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getINT()
   * @generated
   */
  int INT = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT__NAME = 0;

  /**
   * The number of structural features of the '<em>INT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.STRINGImpl <em>STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.STRINGImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getSTRING()
   * @generated
   */
  int STRING = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__NAME = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__OPERATOR = 1;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.EBoolParImpl <em>EBool Par</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.EBoolParImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEBoolPar()
   * @generated
   */
  int EBOOL_PAR = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBOOL_PAR__NAME = 0;

  /**
   * The number of structural features of the '<em>EBool Par</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EBOOL_PAR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.CallOperatorImpl <em>Call Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.CallOperatorImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCallOperator()
   * @generated
   */
  int CALL_OPERATOR = 36;

  /**
   * The feature id for the '<em><b>Fun</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_OPERATOR__FUN = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_OPERATOR__ARGS = 1;

  /**
   * The number of structural features of the '<em>Call Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_OPERATOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ArgumentImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 37;

  /**
   * The feature id for the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__ARG = 0;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.MigrationProgramImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigrationProgram()
   * @generated
   */
  int MIGRATION_PROGRAM = 38;

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
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__PATH = 2;

  /**
   * The feature id for the '<em><b>Transformation Package</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__DELTA = 4;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM__RULES = 5;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATION_PROGRAM_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.RuleImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRule()
   * @generated
   */
  int RULE = 39;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.RewritingRuleImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRewritingRule()
   * @generated
   */
  int REWRITING_RULE = 40;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.MigratorSXImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigratorSX()
   * @generated
   */
  int MIGRATOR_SX = 41;

  /**
   * The feature id for the '<em><b>Element SX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__ELEMENT_SX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__NAME = 1;

  /**
   * The feature id for the '<em><b>Filter SX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX__FILTER_SX = 2;

  /**
   * The number of structural features of the '<em>Migrator SX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_SX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.MigratorDXImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigratorDX()
   * @generated
   */
  int MIGRATOR_DX = 42;

  /**
   * The feature id for the '<em><b>Element DX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__ELEMENT_DX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__NAME = 1;

  /**
   * The feature id for the '<em><b>Filter DX</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX__FILTER_DX = 2;

  /**
   * The number of structural features of the '<em>Migrator DX</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIGRATOR_DX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.FilterMigratorImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getFilterMigrator()
   * @generated
   */
  int FILTER_MIGRATOR = 43;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Internal Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__INTERNAL_FEATURE = 1;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__OP = 2;

  /**
   * The feature id for the '<em><b>Dxobj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__DXOBJ = 3;

  /**
   * The feature id for the '<em><b>Dxgetters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR__DXGETTERS = 4;

  /**
   * The number of structural features of the '<em>Filter Migrator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_MIGRATOR_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.PackageImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 44;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ClassImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 45;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ClassifierImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 46;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__EANNOTATIONS = EcorePackage.ECLASSIFIER__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = EcorePackage.ECLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INSTANCE_CLASS_NAME = EcorePackage.ECLASSIFIER__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INSTANCE_CLASS = EcorePackage.ECLASSIFIER__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__DEFAULT_VALUE = EcorePackage.ECLASSIFIER__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INSTANCE_TYPE_NAME = EcorePackage.ECLASSIFIER__INSTANCE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__EPACKAGE = EcorePackage.ECLASSIFIER__EPACKAGE;

  /**
   * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ETYPE_PARAMETERS = EcorePackage.ECLASSIFIER__ETYPE_PARAMETERS;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = EcorePackage.ECLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.AttributeImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 47;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.ReferenceImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 48;

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
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.EReferenceParImpl <em>EReference Par</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.EReferenceParImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEReferencePar()
   * @generated
   */
  int EREFERENCE_PAR = 49;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__EANNOTATIONS = EcorePackage.EREFERENCE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__NAME = EcorePackage.EREFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__ORDERED = EcorePackage.EREFERENCE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__UNIQUE = EcorePackage.EREFERENCE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__LOWER_BOUND = EcorePackage.EREFERENCE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__UPPER_BOUND = EcorePackage.EREFERENCE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__MANY = EcorePackage.EREFERENCE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__REQUIRED = EcorePackage.EREFERENCE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__ETYPE = EcorePackage.EREFERENCE__ETYPE;

  /**
   * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__EGENERIC_TYPE = EcorePackage.EREFERENCE__EGENERIC_TYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__CHANGEABLE = EcorePackage.EREFERENCE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__VOLATILE = EcorePackage.EREFERENCE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__TRANSIENT = EcorePackage.EREFERENCE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__DEFAULT_VALUE_LITERAL = EcorePackage.EREFERENCE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__DEFAULT_VALUE = EcorePackage.EREFERENCE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__UNSETTABLE = EcorePackage.EREFERENCE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__DERIVED = EcorePackage.EREFERENCE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__ECONTAINING_CLASS = EcorePackage.EREFERENCE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>Containment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__CONTAINMENT = EcorePackage.EREFERENCE__CONTAINMENT;

  /**
   * The feature id for the '<em><b>Container</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__CONTAINER = EcorePackage.EREFERENCE__CONTAINER;

  /**
   * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__RESOLVE_PROXIES = EcorePackage.EREFERENCE__RESOLVE_PROXIES;

  /**
   * The feature id for the '<em><b>EOpposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__EOPPOSITE = EcorePackage.EREFERENCE__EOPPOSITE;

  /**
   * The feature id for the '<em><b>EReference Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__EREFERENCE_TYPE = EcorePackage.EREFERENCE__EREFERENCE_TYPE;

  /**
   * The feature id for the '<em><b>EKeys</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR__EKEYS = EcorePackage.EREFERENCE__EKEYS;

  /**
   * The number of structural features of the '<em>EReference Par</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_PAR_FEATURE_COUNT = EcorePackage.EREFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.EAttributeParImpl <em>EAttribute Par</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.EAttributeParImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEAttributePar()
   * @generated
   */
  int EATTRIBUTE_PAR = 50;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__EANNOTATIONS = EcorePackage.EATTRIBUTE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__NAME = EcorePackage.EATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__ORDERED = EcorePackage.EATTRIBUTE__ORDERED;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__UNIQUE = EcorePackage.EATTRIBUTE__UNIQUE;

  /**
   * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__LOWER_BOUND = EcorePackage.EATTRIBUTE__LOWER_BOUND;

  /**
   * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__UPPER_BOUND = EcorePackage.EATTRIBUTE__UPPER_BOUND;

  /**
   * The feature id for the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__MANY = EcorePackage.EATTRIBUTE__MANY;

  /**
   * The feature id for the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__REQUIRED = EcorePackage.EATTRIBUTE__REQUIRED;

  /**
   * The feature id for the '<em><b>EType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__ETYPE = EcorePackage.EATTRIBUTE__ETYPE;

  /**
   * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__EGENERIC_TYPE = EcorePackage.EATTRIBUTE__EGENERIC_TYPE;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__CHANGEABLE = EcorePackage.EATTRIBUTE__CHANGEABLE;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__VOLATILE = EcorePackage.EATTRIBUTE__VOLATILE;

  /**
   * The feature id for the '<em><b>Transient</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__TRANSIENT = EcorePackage.EATTRIBUTE__TRANSIENT;

  /**
   * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__DEFAULT_VALUE_LITERAL = EcorePackage.EATTRIBUTE__DEFAULT_VALUE_LITERAL;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__DEFAULT_VALUE = EcorePackage.EATTRIBUTE__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Unsettable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__UNSETTABLE = EcorePackage.EATTRIBUTE__UNSETTABLE;

  /**
   * The feature id for the '<em><b>Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__DERIVED = EcorePackage.EATTRIBUTE__DERIVED;

  /**
   * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__ECONTAINING_CLASS = EcorePackage.EATTRIBUTE__ECONTAINING_CLASS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__ID = EcorePackage.EATTRIBUTE__ID;

  /**
   * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR__EATTRIBUTE_TYPE = EcorePackage.EATTRIBUTE__EATTRIBUTE_TYPE;

  /**
   * The number of structural features of the '<em>EAttribute Par</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_PAR_FEATURE_COUNT = EcorePackage.EATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.EClassParImpl <em>EClass Par</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.EClassParImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEClassPar()
   * @generated
   */
  int ECLASS_PAR = 51;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EANNOTATIONS = EcorePackage.ECLASS__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__NAME = EcorePackage.ECLASS__NAME;

  /**
   * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__INSTANCE_CLASS_NAME = EcorePackage.ECLASS__INSTANCE_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Instance Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__INSTANCE_CLASS = EcorePackage.ECLASS__INSTANCE_CLASS;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__DEFAULT_VALUE = EcorePackage.ECLASS__DEFAULT_VALUE;

  /**
   * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__INSTANCE_TYPE_NAME = EcorePackage.ECLASS__INSTANCE_TYPE_NAME;

  /**
   * The feature id for the '<em><b>EPackage</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EPACKAGE = EcorePackage.ECLASS__EPACKAGE;

  /**
   * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__ETYPE_PARAMETERS = EcorePackage.ECLASS__ETYPE_PARAMETERS;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__ABSTRACT = EcorePackage.ECLASS__ABSTRACT;

  /**
   * The feature id for the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__INTERFACE = EcorePackage.ECLASS__INTERFACE;

  /**
   * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__ESUPER_TYPES = EcorePackage.ECLASS__ESUPER_TYPES;

  /**
   * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EOPERATIONS = EcorePackage.ECLASS__EOPERATIONS;

  /**
   * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_ATTRIBUTES = EcorePackage.ECLASS__EALL_ATTRIBUTES;

  /**
   * The feature id for the '<em><b>EAll References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_REFERENCES = EcorePackage.ECLASS__EALL_REFERENCES;

  /**
   * The feature id for the '<em><b>EReferences</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EREFERENCES = EcorePackage.ECLASS__EREFERENCES;

  /**
   * The feature id for the '<em><b>EAttributes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EATTRIBUTES = EcorePackage.ECLASS__EATTRIBUTES;

  /**
   * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_CONTAINMENTS = EcorePackage.ECLASS__EALL_CONTAINMENTS;

  /**
   * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_OPERATIONS = EcorePackage.ECLASS__EALL_OPERATIONS;

  /**
   * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_STRUCTURAL_FEATURES = EcorePackage.ECLASS__EALL_STRUCTURAL_FEATURES;

  /**
   * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_SUPER_TYPES = EcorePackage.ECLASS__EALL_SUPER_TYPES;

  /**
   * The feature id for the '<em><b>EID Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EID_ATTRIBUTE = EcorePackage.ECLASS__EID_ATTRIBUTE;

  /**
   * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__ESTRUCTURAL_FEATURES = EcorePackage.ECLASS__ESTRUCTURAL_FEATURES;

  /**
   * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EGENERIC_SUPER_TYPES = EcorePackage.ECLASS__EGENERIC_SUPER_TYPES;

  /**
   * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR__EALL_GENERIC_SUPER_TYPES = EcorePackage.ECLASS__EALL_GENERIC_SUPER_TYPES;

  /**
   * The number of structural features of the '<em>EClass Par</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_PAR_FEATURE_COUNT = EcorePackage.ECLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.migration.impl.EPackageParImpl <em>EPackage Par</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.migration.impl.EPackageParImpl
   * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEPackagePar()
   * @generated
   */
  int EPACKAGE_PAR = 52;

  /**
   * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__EANNOTATIONS = EcorePackage.EPACKAGE__EANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__NAME = EcorePackage.EPACKAGE__NAME;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__NS_URI = EcorePackage.EPACKAGE__NS_URI;

  /**
   * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__NS_PREFIX = EcorePackage.EPACKAGE__NS_PREFIX;

  /**
   * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__EFACTORY_INSTANCE = EcorePackage.EPACKAGE__EFACTORY_INSTANCE;

  /**
   * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__ECLASSIFIERS = EcorePackage.EPACKAGE__ECLASSIFIERS;

  /**
   * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__ESUBPACKAGES = EcorePackage.EPACKAGE__ESUBPACKAGES;

  /**
   * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR__ESUPER_PACKAGE = EcorePackage.EPACKAGE__ESUPER_PACKAGE;

  /**
   * The number of structural features of the '<em>EPackage Par</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_PAR_FEATURE_COUNT = EcorePackage.EPACKAGE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see it.univaq.coevolution.migration.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see it.univaq.coevolution.migration.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.Model#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see it.univaq.coevolution.migration.Model#getTitle()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Title();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.Model#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operators</em>'.
   * @see it.univaq.coevolution.migration.Model#getOperators()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Operators();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.Model#getMigrationProgr <em>Migration Progr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Migration Progr</em>'.
   * @see it.univaq.coevolution.migration.Model#getMigrationProgr()
   * @see #getModel()
   * @generated
   */
  EReference getModel_MigrationProgr();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.packageSetters <em>package Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>package Setters</em>'.
   * @see it.univaq.coevolution.migration.packageSetters
   * @generated
   */
  EClass getpackageSetters();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.packageSetters#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.migration.packageSetters#getMetafeature()
   * @see #getpackageSetters()
   * @generated
   */
  EReference getpackageSetters_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.packageSetters#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see it.univaq.coevolution.migration.packageSetters#getValue()
   * @see #getpackageSetters()
   * @generated
   */
  EAttribute getpackageSetters_Value();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.migration.packageSetters#getValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value Ref</em>'.
   * @see it.univaq.coevolution.migration.packageSetters#getValueRef()
   * @see #getpackageSetters()
   * @generated
   */
  EReference getpackageSetters_ValueRef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.packageSetters_def <em>package Setters def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>package Setters def</em>'.
   * @see it.univaq.coevolution.migration.packageSetters_def
   * @generated
   */
  EClass getpackageSetters_def();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.packageSetters_def#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.migration.packageSetters_def#getMetafeature()
   * @see #getpackageSetters_def()
   * @generated
   */
  EReference getpackageSetters_def_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.packageSetters_def#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Par</em>'.
   * @see it.univaq.coevolution.migration.packageSetters_def#getPar()
   * @see #getpackageSetters_def()
   * @generated
   */
  EAttribute getpackageSetters_def_Par();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.setNsUri <em>set Ns Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set Ns Uri</em>'.
   * @see it.univaq.coevolution.migration.setNsUri
   * @generated
   */
  EClass getsetNsUri();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsUri#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.setNsUri#getOp()
   * @see #getsetNsUri()
   * @generated
   */
  EAttribute getsetNsUri_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsUri#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns URI</em>'.
   * @see it.univaq.coevolution.migration.setNsUri#getNsURI()
   * @see #getsetNsUri()
   * @generated
   */
  EAttribute getsetNsUri_NsURI();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.setNsUri_def <em>set Ns Uri def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set Ns Uri def</em>'.
   * @see it.univaq.coevolution.migration.setNsUri_def
   * @generated
   */
  EClass getsetNsUri_def();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsUri_def#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.setNsUri_def#getOp()
   * @see #getsetNsUri_def()
   * @generated
   */
  EAttribute getsetNsUri_def_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsUri_def#getNsUri <em>Ns Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Uri</em>'.
   * @see it.univaq.coevolution.migration.setNsUri_def#getNsUri()
   * @see #getsetNsUri_def()
   * @generated
   */
  EAttribute getsetNsUri_def_NsUri();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.setNsPrefix <em>set Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set Ns Prefix</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix
   * @generated
   */
  EClass getsetNsPrefix();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsPrefix#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix#getOp()
   * @see #getsetNsPrefix()
   * @generated
   */
  EAttribute getsetNsPrefix_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsPrefix#getNsPrefix <em>Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Prefix</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix#getNsPrefix()
   * @see #getsetNsPrefix()
   * @generated
   */
  EAttribute getsetNsPrefix_NsPrefix();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.setNsPrefix_def <em>set Ns Prefix def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>set Ns Prefix def</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix_def
   * @generated
   */
  EClass getsetNsPrefix_def();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsPrefix_def#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix_def#getOp()
   * @see #getsetNsPrefix_def()
   * @generated
   */
  EAttribute getsetNsPrefix_def_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.setNsPrefix_def#getNsPrefix <em>Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns Prefix</em>'.
   * @see it.univaq.coevolution.migration.setNsPrefix_def#getNsPrefix()
   * @see #getsetNsPrefix_def()
   * @generated
   */
  EAttribute getsetNsPrefix_def_NsPrefix();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.CHANGEPACKAGE <em>CHANGEPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CHANGEPACKAGE</em>'.
   * @see it.univaq.coevolution.migration.CHANGEPACKAGE
   * @generated
   */
  EClass getCHANGEPACKAGE();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.CHANGEPACKAGE#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.CHANGEPACKAGE#getOp()
   * @see #getCHANGEPACKAGE()
   * @generated
   */
  EAttribute getCHANGEPACKAGE_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.CHANGEPACKAGE#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.migration.CHANGEPACKAGE#getRef()
   * @see #getCHANGEPACKAGE()
   * @generated
   */
  EReference getCHANGEPACKAGE_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ADDPACKAGE <em>ADDPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADDPACKAGE</em>'.
   * @see it.univaq.coevolution.migration.ADDPACKAGE
   * @generated
   */
  EClass getADDPACKAGE();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDPACKAGE#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.ADDPACKAGE#getOp()
   * @see #getADDPACKAGE()
   * @generated
   */
  EAttribute getADDPACKAGE_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDPACKAGE#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.migration.ADDPACKAGE#getNew()
   * @see #getADDPACKAGE()
   * @generated
   */
  EAttribute getADDPACKAGE_New();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.DELETEPACKAGE <em>DELETEPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DELETEPACKAGE</em>'.
   * @see it.univaq.coevolution.migration.DELETEPACKAGE
   * @generated
   */
  EClass getDELETEPACKAGE();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.DELETEPACKAGE#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.DELETEPACKAGE#getOp()
   * @see #getDELETEPACKAGE()
   * @generated
   */
  EAttribute getDELETEPACKAGE_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.DELETEPACKAGE#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.migration.DELETEPACKAGE#getRef()
   * @see #getDELETEPACKAGE()
   * @generated
   */
  EReference getDELETEPACKAGE_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.PackageOp <em>Package Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Op</em>'.
   * @see it.univaq.coevolution.migration.PackageOp
   * @generated
   */
  EClass getPackageOp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.PackageOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.migration.PackageOp#getVar()
   * @see #getPackageOp()
   * @generated
   */
  EReference getPackageOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.PackageOp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.PackageOp#getOp()
   * @see #getPackageOp()
   * @generated
   */
  EReference getPackageOp_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.PackageOp#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.migration.PackageOp#getSetters()
   * @see #getPackageOp()
   * @generated
   */
  EReference getPackageOp_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.PackageOp#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see it.univaq.coevolution.migration.PackageOp#getClasses()
   * @see #getPackageOp()
   * @generated
   */
  EReference getPackageOp_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.PackageOp#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.migration.PackageOp#getComplex()
   * @see #getPackageOp()
   * @generated
   */
  EReference getPackageOp_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.OpDef <em>Op Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Op Def</em>'.
   * @see it.univaq.coevolution.migration.OpDef
   * @generated
   */
  EClass getOpDef();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.OpDef#getOpdef <em>Opdef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opdef</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getOpdef()
   * @see #getOpDef()
   * @generated
   */
  EAttribute getOpDef_Opdef();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.OpDef#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getRef()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.OpDef#getSettersdef <em>Settersdef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Settersdef</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getSettersdef()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Settersdef();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.OpDef#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getComplex()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Complex();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.OpDef#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getString()
   * @see #getOpDef()
   * @generated
   */
  EAttribute getOpDef_String();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.OpDef#getDst <em>Dst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dst</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getDst()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_Dst();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.OpDef#getFeatureSettersdef <em>Feature Settersdef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature Settersdef</em>'.
   * @see it.univaq.coevolution.migration.OpDef#getFeatureSettersdef()
   * @see #getOpDef()
   * @generated
   */
  EReference getOpDef_FeatureSettersdef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.CHANGECLASS <em>CHANGECLASS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CHANGECLASS</em>'.
   * @see it.univaq.coevolution.migration.CHANGECLASS
   * @generated
   */
  EClass getCHANGECLASS();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.CHANGECLASS#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.CHANGECLASS#getOp()
   * @see #getCHANGECLASS()
   * @generated
   */
  EAttribute getCHANGECLASS_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.CHANGECLASS#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.migration.CHANGECLASS#getRef()
   * @see #getCHANGECLASS()
   * @generated
   */
  EReference getCHANGECLASS_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ADDCLASS <em>ADDCLASS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADDCLASS</em>'.
   * @see it.univaq.coevolution.migration.ADDCLASS
   * @generated
   */
  EClass getADDCLASS();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDCLASS#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.ADDCLASS#getOp()
   * @see #getADDCLASS()
   * @generated
   */
  EAttribute getADDCLASS_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDCLASS#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.migration.ADDCLASS#getNew()
   * @see #getADDCLASS()
   * @generated
   */
  EAttribute getADDCLASS_New();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.DELETECLASS <em>DELETECLASS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DELETECLASS</em>'.
   * @see it.univaq.coevolution.migration.DELETECLASS
   * @generated
   */
  EClass getDELETECLASS();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.DELETECLASS#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.DELETECLASS#getOp()
   * @see #getDELETECLASS()
   * @generated
   */
  EAttribute getDELETECLASS_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.DELETECLASS#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.migration.DELETECLASS#getRef()
   * @see #getDELETECLASS()
   * @generated
   */
  EReference getDELETECLASS_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.classSetter <em>class Setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Setter</em>'.
   * @see it.univaq.coevolution.migration.classSetter
   * @generated
   */
  EClass getclassSetter();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.classSetter#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.migration.classSetter#getMetafeature()
   * @see #getclassSetter()
   * @generated
   */
  EReference getclassSetter_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.classSetter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see it.univaq.coevolution.migration.classSetter#getValue()
   * @see #getclassSetter()
   * @generated
   */
  EAttribute getclassSetter_Value();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.migration.classSetter#getValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value Ref</em>'.
   * @see it.univaq.coevolution.migration.classSetter#getValueRef()
   * @see #getclassSetter()
   * @generated
   */
  EReference getclassSetter_ValueRef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.classSetters_def <em>class Setters def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>class Setters def</em>'.
   * @see it.univaq.coevolution.migration.classSetters_def
   * @generated
   */
  EClass getclassSetters_def();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.classSetters_def#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.migration.classSetters_def#getMetafeature()
   * @see #getclassSetters_def()
   * @generated
   */
  EReference getclassSetters_def_Metafeature();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.classSetters_def#getPar <em>Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Par</em>'.
   * @see it.univaq.coevolution.migration.classSetters_def#getPar()
   * @see #getclassSetters_def()
   * @generated
   */
  EReference getclassSetters_def_Par();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ClassOp <em>Class Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Op</em>'.
   * @see it.univaq.coevolution.migration.ClassOp
   * @generated
   */
  EClass getClassOp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.ClassOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getVar()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.ClassOp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getOp()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ClassOp#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getSetters()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ClassOp#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getAttributes()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ClassOp#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getReferences()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_References();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ClassOp#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.migration.ClassOp#getComplex()
   * @see #getClassOp()
   * @generated
   */
  EReference getClassOp_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.eStructuralFeatureOp <em>eStructural Feature Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>eStructural Feature Op</em>'.
   * @see it.univaq.coevolution.migration.eStructuralFeatureOp
   * @generated
   */
  EClass geteStructuralFeatureOp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.eStructuralFeatureOp#getOp()
   * @see #geteStructuralFeatureOp()
   * @generated
   */
  EReference geteStructuralFeatureOp_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.migration.eStructuralFeatureOp#getSetters()
   * @see #geteStructuralFeatureOp()
   * @generated
   */
  EReference geteStructuralFeatureOp_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.migration.eStructuralFeatureOp#getComplex()
   * @see #geteStructuralFeatureOp()
   * @generated
   */
  EReference geteStructuralFeatureOp_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.CHANGEATTRIBUTE <em>CHANGEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CHANGEATTRIBUTE</em>'.
   * @see it.univaq.coevolution.migration.CHANGEATTRIBUTE
   * @generated
   */
  EClass getCHANGEATTRIBUTE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.CHANGEATTRIBUTE#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attr</em>'.
   * @see it.univaq.coevolution.migration.CHANGEATTRIBUTE#getRefAttr()
   * @see #getCHANGEATTRIBUTE()
   * @generated
   */
  EReference getCHANGEATTRIBUTE_RefAttr();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ADDATTRIBUTE <em>ADDATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADDATTRIBUTE</em>'.
   * @see it.univaq.coevolution.migration.ADDATTRIBUTE
   * @generated
   */
  EClass getADDATTRIBUTE();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDATTRIBUTE#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.migration.ADDATTRIBUTE#getNew()
   * @see #getADDATTRIBUTE()
   * @generated
   */
  EAttribute getADDATTRIBUTE_New();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.DELETEATTRIBUTE <em>DELETEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DELETEATTRIBUTE</em>'.
   * @see it.univaq.coevolution.migration.DELETEATTRIBUTE
   * @generated
   */
  EClass getDELETEATTRIBUTE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.DELETEATTRIBUTE#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attr</em>'.
   * @see it.univaq.coevolution.migration.DELETEATTRIBUTE#getRefAttr()
   * @see #getDELETEATTRIBUTE()
   * @generated
   */
  EReference getDELETEATTRIBUTE_RefAttr();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.RENAMEATTRIBUTE <em>RENAMEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RENAMEATTRIBUTE</em>'.
   * @see it.univaq.coevolution.migration.RENAMEATTRIBUTE
   * @generated
   */
  EClass getRENAMEATTRIBUTE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.RENAMEATTRIBUTE#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attr</em>'.
   * @see it.univaq.coevolution.migration.RENAMEATTRIBUTE#getRefAttr()
   * @see #getRENAMEATTRIBUTE()
   * @generated
   */
  EReference getRENAMEATTRIBUTE_RefAttr();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.RENAMEATTRIBUTE#getNewName <em>New Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New Name</em>'.
   * @see it.univaq.coevolution.migration.RENAMEATTRIBUTE#getNewName()
   * @see #getRENAMEATTRIBUTE()
   * @generated
   */
  EAttribute getRENAMEATTRIBUTE_NewName();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.MOVEATTRIBUTE <em>MOVEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOVEATTRIBUTE</em>'.
   * @see it.univaq.coevolution.migration.MOVEATTRIBUTE
   * @generated
   */
  EClass getMOVEATTRIBUTE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MOVEATTRIBUTE#getRefAttr <em>Ref Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Attr</em>'.
   * @see it.univaq.coevolution.migration.MOVEATTRIBUTE#getRefAttr()
   * @see #getMOVEATTRIBUTE()
   * @generated
   */
  EReference getMOVEATTRIBUTE_RefAttr();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MOVEATTRIBUTE#getDst <em>Dst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dst</em>'.
   * @see it.univaq.coevolution.migration.MOVEATTRIBUTE#getDst()
   * @see #getMOVEATTRIBUTE()
   * @generated
   */
  EReference getMOVEATTRIBUTE_Dst();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.FeatureSetters <em>Feature Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Setters</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters
   * @generated
   */
  EClass getFeatureSetters();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FeatureSetters#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#getMetafeature()
   * @see #getFeatureSetters()
   * @generated
   */
  EReference getFeatureSetters_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.FeatureSetters#getValueEString <em>Value EString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value EString</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#getValueEString()
   * @see #getFeatureSetters()
   * @generated
   */
  EAttribute getFeatureSetters_ValueEString();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.FeatureSetters#getValueEInt <em>Value EInt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value EInt</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#getValueEInt()
   * @see #getFeatureSetters()
   * @generated
   */
  EAttribute getFeatureSetters_ValueEInt();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.FeatureSetters#isValueEBool <em>Value EBool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value EBool</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#isValueEBool()
   * @see #getFeatureSetters()
   * @generated
   */
  EAttribute getFeatureSetters_ValueEBool();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.migration.FeatureSetters#getValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value Ref</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#getValueRef()
   * @see #getFeatureSetters()
   * @generated
   */
  EReference getFeatureSetters_ValueRef();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FeatureSetters#getValueFeature <em>Value Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value Feature</em>'.
   * @see it.univaq.coevolution.migration.FeatureSetters#getValueFeature()
   * @see #getFeatureSetters()
   * @generated
   */
  EReference getFeatureSetters_ValueFeature();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.AttributeOp <em>Attribute Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Op</em>'.
   * @see it.univaq.coevolution.migration.AttributeOp
   * @generated
   */
  EClass getAttributeOp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.AttributeOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.migration.AttributeOp#getVar()
   * @see #getAttributeOp()
   * @generated
   */
  EReference getAttributeOp_Var();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.CHANGEREFERENCE <em>CHANGEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CHANGEREFERENCE</em>'.
   * @see it.univaq.coevolution.migration.CHANGEREFERENCE
   * @generated
   */
  EClass getCHANGEREFERENCE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.CHANGEREFERENCE#getRefRef <em>Ref Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Ref</em>'.
   * @see it.univaq.coevolution.migration.CHANGEREFERENCE#getRefRef()
   * @see #getCHANGEREFERENCE()
   * @generated
   */
  EReference getCHANGEREFERENCE_RefRef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ADDREFERENCE <em>ADDREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADDREFERENCE</em>'.
   * @see it.univaq.coevolution.migration.ADDREFERENCE
   * @generated
   */
  EClass getADDREFERENCE();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ADDREFERENCE#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.migration.ADDREFERENCE#getNew()
   * @see #getADDREFERENCE()
   * @generated
   */
  EAttribute getADDREFERENCE_New();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.DELETEREFERENCE <em>DELETEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DELETEREFERENCE</em>'.
   * @see it.univaq.coevolution.migration.DELETEREFERENCE
   * @generated
   */
  EClass getDELETEREFERENCE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.DELETEREFERENCE#getRefRef <em>Ref Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Ref</em>'.
   * @see it.univaq.coevolution.migration.DELETEREFERENCE#getRefRef()
   * @see #getDELETEREFERENCE()
   * @generated
   */
  EReference getDELETEREFERENCE_RefRef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.MOVEREFERENCE <em>MOVEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MOVEREFERENCE</em>'.
   * @see it.univaq.coevolution.migration.MOVEREFERENCE
   * @generated
   */
  EClass getMOVEREFERENCE();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MOVEREFERENCE#getRefRef <em>Ref Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Ref</em>'.
   * @see it.univaq.coevolution.migration.MOVEREFERENCE#getRefRef()
   * @see #getMOVEREFERENCE()
   * @generated
   */
  EReference getMOVEREFERENCE_RefRef();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MOVEREFERENCE#getDst <em>Dst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dst</em>'.
   * @see it.univaq.coevolution.migration.MOVEREFERENCE#getDst()
   * @see #getMOVEREFERENCE()
   * @generated
   */
  EReference getMOVEREFERENCE_Dst();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.featureSetters_def <em>feature Setters def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>feature Setters def</em>'.
   * @see it.univaq.coevolution.migration.featureSetters_def
   * @generated
   */
  EClass getfeatureSetters_def();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.featureSetters_def#getLowerBound <em>Lower Bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower Bound</em>'.
   * @see it.univaq.coevolution.migration.featureSetters_def#getLowerBound()
   * @see #getfeatureSetters_def()
   * @generated
   */
  EAttribute getfeatureSetters_def_LowerBound();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.featureSetters_def#getEType <em>EType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>EType</em>'.
   * @see it.univaq.coevolution.migration.featureSetters_def#getEType()
   * @see #getfeatureSetters_def()
   * @generated
   */
  EReference getfeatureSetters_def_EType();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.featureSetters_def#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opposite</em>'.
   * @see it.univaq.coevolution.migration.featureSetters_def#getOpposite()
   * @see #getfeatureSetters_def()
   * @generated
   */
  EReference getfeatureSetters_def_Opposite();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.featureSetters_def#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.featureSetters_def#getName()
   * @see #getfeatureSetters_def()
   * @generated
   */
  EAttribute getfeatureSetters_def_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ReferenceOp <em>Reference Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Op</em>'.
   * @see it.univaq.coevolution.migration.ReferenceOp
   * @generated
   */
  EClass getReferenceOp();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.ReferenceOp#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.migration.ReferenceOp#getVar()
   * @see #getReferenceOp()
   * @generated
   */
  EReference getReferenceOp_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.ReferenceOp#getCHANGE_op <em>CHANGE op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>CHANGE op</em>'.
   * @see it.univaq.coevolution.migration.ReferenceOp#getCHANGE_op()
   * @see #getReferenceOp()
   * @generated
   */
  EReference getReferenceOp_CHANGE_op();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.ComplexOperator <em>Complex Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Operator</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator
   * @generated
   */
  EClass getComplexOperator();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.ComplexOperator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator#getName()
   * @see #getComplexOperator()
   * @generated
   */
  EAttribute getComplexOperator_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ComplexOperator#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator#getParams()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_Params();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ComplexOperator#getClassOperations <em>Class Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Operations</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator#getClassOperations()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_ClassOperations();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ComplexOperator#getAttributeOperations <em>Attribute Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Operations</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator#getAttributeOperations()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_AttributeOperations();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.ComplexOperator#getReferenceOperations <em>Reference Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Operations</em>'.
   * @see it.univaq.coevolution.migration.ComplexOperator#getReferenceOperations()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_ReferenceOperations();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INT</em>'.
   * @see it.univaq.coevolution.migration.INT
   * @generated
   */
  EClass getINT();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.INT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.INT#getName()
   * @see #getINT()
   * @generated
   */
  EAttribute getINT_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING</em>'.
   * @see it.univaq.coevolution.migration.STRING
   * @generated
   */
  EClass getSTRING();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.STRING#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.STRING#getName()
   * @see #getSTRING()
   * @generated
   */
  EAttribute getSTRING_Name();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.STRING#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see it.univaq.coevolution.migration.STRING#getOperator()
   * @see #getSTRING()
   * @generated
   */
  EAttribute getSTRING_Operator();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.EBoolPar <em>EBool Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EBool Par</em>'.
   * @see it.univaq.coevolution.migration.EBoolPar
   * @generated
   */
  EClass getEBoolPar();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.EBoolPar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.EBoolPar#getName()
   * @see #getEBoolPar()
   * @generated
   */
  EAttribute getEBoolPar_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.CallOperator <em>Call Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Operator</em>'.
   * @see it.univaq.coevolution.migration.CallOperator
   * @generated
   */
  EClass getCallOperator();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.CallOperator#getFun <em>Fun</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Fun</em>'.
   * @see it.univaq.coevolution.migration.CallOperator#getFun()
   * @see #getCallOperator()
   * @generated
   */
  EReference getCallOperator_Fun();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.CallOperator#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see it.univaq.coevolution.migration.CallOperator#getArgs()
   * @see #getCallOperator()
   * @generated
   */
  EReference getCallOperator_Args();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see it.univaq.coevolution.migration.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.Argument#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arg</em>'.
   * @see it.univaq.coevolution.migration.Argument#getArg()
   * @see #getArgument()
   * @generated
   */
  EReference getArgument_Arg();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.MigrationProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram
   * @generated
   */
  EClass getMigrationProgram();

  /**
   * Returns the meta object for the attribute list '{@link it.univaq.coevolution.migration.MigrationProgram#getLibs <em>Libs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Libs</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getLibs()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Libs();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.MigrationProgram#getMigr <em>Migr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Migr</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getMigr()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Migr();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.MigrationProgram#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getPath()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Path();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.migration.MigrationProgram#getTransformationPackage <em>Transformation Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Transformation Package</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getTransformationPackage()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_TransformationPackage();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.MigrationProgram#getDelta <em>Delta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delta</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getDelta()
   * @see #getMigrationProgram()
   * @generated
   */
  EAttribute getMigrationProgram_Delta();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.MigrationProgram#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see it.univaq.coevolution.migration.MigrationProgram#getRules()
   * @see #getMigrationProgram()
   * @generated
   */
  EReference getMigrationProgram_Rules();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see it.univaq.coevolution.migration.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.Rule#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see it.univaq.coevolution.migration.Rule#getFilter()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Filter();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.Rule#getRewritingRules <em>Rewriting Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rewriting Rules</em>'.
   * @see it.univaq.coevolution.migration.Rule#getRewritingRules()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RewritingRules();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.RewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rewriting Rule</em>'.
   * @see it.univaq.coevolution.migration.RewritingRule
   * @generated
   */
  EClass getRewritingRule();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.RewritingRule#getMigratorsSX <em>Migrators SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrators SX</em>'.
   * @see it.univaq.coevolution.migration.RewritingRule#getMigratorsSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorsSX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.RewritingRule#getMigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator DX</em>'.
   * @see it.univaq.coevolution.migration.RewritingRule#getMigratorDX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorDX();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.RewritingRule#getMigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Migrator SX</em>'.
   * @see it.univaq.coevolution.migration.RewritingRule#getMigratorSX()
   * @see #getRewritingRule()
   * @generated
   */
  EReference getRewritingRule_MigratorSX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.MigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator SX</em>'.
   * @see it.univaq.coevolution.migration.MigratorSX
   * @generated
   */
  EClass getMigratorSX();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MigratorSX#getElementSX <em>Element SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element SX</em>'.
   * @see it.univaq.coevolution.migration.MigratorSX#getElementSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_ElementSX();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.MigratorSX#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.MigratorSX#getName()
   * @see #getMigratorSX()
   * @generated
   */
  EAttribute getMigratorSX_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.MigratorSX#getFilterSX <em>Filter SX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter SX</em>'.
   * @see it.univaq.coevolution.migration.MigratorSX#getFilterSX()
   * @see #getMigratorSX()
   * @generated
   */
  EReference getMigratorSX_FilterSX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.MigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Migrator DX</em>'.
   * @see it.univaq.coevolution.migration.MigratorDX
   * @generated
   */
  EClass getMigratorDX();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.MigratorDX#getElementDX <em>Element DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element DX</em>'.
   * @see it.univaq.coevolution.migration.MigratorDX#getElementDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_ElementDX();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.migration.MigratorDX#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.migration.MigratorDX#getName()
   * @see #getMigratorDX()
   * @generated
   */
  EAttribute getMigratorDX_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.migration.MigratorDX#getFilterDX <em>Filter DX</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter DX</em>'.
   * @see it.univaq.coevolution.migration.MigratorDX#getFilterDX()
   * @see #getMigratorDX()
   * @generated
   */
  EReference getMigratorDX_FilterDX();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.FilterMigrator <em>Filter Migrator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Migrator</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator
   * @generated
   */
  EClass getFilterMigrator();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FilterMigrator#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator#getFeature()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Feature();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FilterMigrator#getInternalFeature <em>Internal Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Internal Feature</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator#getInternalFeature()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_InternalFeature();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.migration.FilterMigrator#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator#getOp()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FilterMigrator#getDxobj <em>Dxobj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dxobj</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator#getDxobj()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Dxobj();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.migration.FilterMigrator#getDxgetters <em>Dxgetters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dxgetters</em>'.
   * @see it.univaq.coevolution.migration.FilterMigrator#getDxgetters()
   * @see #getFilterMigrator()
   * @generated
   */
  EReference getFilterMigrator_Dxgetters();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see it.univaq.coevolution.migration.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see it.univaq.coevolution.migration.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see it.univaq.coevolution.migration.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see it.univaq.coevolution.migration.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see it.univaq.coevolution.migration.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.EReferencePar <em>EReference Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference Par</em>'.
   * @see it.univaq.coevolution.migration.EReferencePar
   * @generated
   */
  EClass getEReferencePar();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.EAttributePar <em>EAttribute Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute Par</em>'.
   * @see it.univaq.coevolution.migration.EAttributePar
   * @generated
   */
  EClass getEAttributePar();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.EClassPar <em>EClass Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Par</em>'.
   * @see it.univaq.coevolution.migration.EClassPar
   * @generated
   */
  EClass getEClassPar();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.migration.EPackagePar <em>EPackage Par</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage Par</em>'.
   * @see it.univaq.coevolution.migration.EPackagePar
   * @generated
   */
  EClass getEPackagePar();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MigrationFactory getMigrationFactory();

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
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ModelImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__TITLE = eINSTANCE.getModel_Title();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__OPERATORS = eINSTANCE.getModel_Operators();

    /**
     * The meta object literal for the '<em><b>Migration Progr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MIGRATION_PROGR = eINSTANCE.getModel_MigrationProgr();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.packageSettersImpl <em>package Setters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.packageSettersImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getpackageSetters()
     * @generated
     */
    EClass PACKAGE_SETTERS = eINSTANCE.getpackageSetters();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SETTERS__METAFEATURE = eINSTANCE.getpackageSetters_Metafeature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_SETTERS__VALUE = eINSTANCE.getpackageSetters_Value();

    /**
     * The meta object literal for the '<em><b>Value Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SETTERS__VALUE_REF = eINSTANCE.getpackageSetters_ValueRef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.packageSetters_defImpl <em>package Setters def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.packageSetters_defImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getpackageSetters_def()
     * @generated
     */
    EClass PACKAGE_SETTERS_DEF = eINSTANCE.getpackageSetters_def();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_SETTERS_DEF__METAFEATURE = eINSTANCE.getpackageSetters_def_Metafeature();

    /**
     * The meta object literal for the '<em><b>Par</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_SETTERS_DEF__PAR = eINSTANCE.getpackageSetters_def_Par();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.setNsUriImpl <em>set Ns Uri</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.setNsUriImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsUri()
     * @generated
     */
    EClass SET_NS_URI = eINSTANCE.getsetNsUri();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_URI__OP = eINSTANCE.getsetNsUri_Op();

    /**
     * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_URI__NS_URI = eINSTANCE.getsetNsUri_NsURI();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.setNsUri_defImpl <em>set Ns Uri def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.setNsUri_defImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsUri_def()
     * @generated
     */
    EClass SET_NS_URI_DEF = eINSTANCE.getsetNsUri_def();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_URI_DEF__OP = eINSTANCE.getsetNsUri_def_Op();

    /**
     * The meta object literal for the '<em><b>Ns Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_URI_DEF__NS_URI = eINSTANCE.getsetNsUri_def_NsUri();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.setNsPrefixImpl <em>set Ns Prefix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.setNsPrefixImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsPrefix()
     * @generated
     */
    EClass SET_NS_PREFIX = eINSTANCE.getsetNsPrefix();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_PREFIX__OP = eINSTANCE.getsetNsPrefix_Op();

    /**
     * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_PREFIX__NS_PREFIX = eINSTANCE.getsetNsPrefix_NsPrefix();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.setNsPrefix_defImpl <em>set Ns Prefix def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.setNsPrefix_defImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getsetNsPrefix_def()
     * @generated
     */
    EClass SET_NS_PREFIX_DEF = eINSTANCE.getsetNsPrefix_def();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_PREFIX_DEF__OP = eINSTANCE.getsetNsPrefix_def_Op();

    /**
     * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SET_NS_PREFIX_DEF__NS_PREFIX = eINSTANCE.getsetNsPrefix_def_NsPrefix();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.CHANGEPACKAGEImpl <em>CHANGEPACKAGE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.CHANGEPACKAGEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEPACKAGE()
     * @generated
     */
    EClass CHANGEPACKAGE = eINSTANCE.getCHANGEPACKAGE();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGEPACKAGE__OP = eINSTANCE.getCHANGEPACKAGE_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGEPACKAGE__REF = eINSTANCE.getCHANGEPACKAGE_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ADDPACKAGEImpl <em>ADDPACKAGE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ADDPACKAGEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDPACKAGE()
     * @generated
     */
    EClass ADDPACKAGE = eINSTANCE.getADDPACKAGE();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDPACKAGE__OP = eINSTANCE.getADDPACKAGE_Op();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDPACKAGE__NEW = eINSTANCE.getADDPACKAGE_New();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.DELETEPACKAGEImpl <em>DELETEPACKAGE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.DELETEPACKAGEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEPACKAGE()
     * @generated
     */
    EClass DELETEPACKAGE = eINSTANCE.getDELETEPACKAGE();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETEPACKAGE__OP = eINSTANCE.getDELETEPACKAGE_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETEPACKAGE__REF = eINSTANCE.getDELETEPACKAGE_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.PackageOpImpl <em>Package Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.PackageOpImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getPackageOp()
     * @generated
     */
    EClass PACKAGE_OP = eINSTANCE.getPackageOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_OP__VAR = eINSTANCE.getPackageOp_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_OP__OP = eINSTANCE.getPackageOp_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_OP__SETTERS = eINSTANCE.getPackageOp_Setters();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_OP__CLASSES = eINSTANCE.getPackageOp_Classes();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_OP__COMPLEX = eINSTANCE.getPackageOp_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.OpDefImpl <em>Op Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.OpDefImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getOpDef()
     * @generated
     */
    EClass OP_DEF = eINSTANCE.getOpDef();

    /**
     * The meta object literal for the '<em><b>Opdef</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_DEF__OPDEF = eINSTANCE.getOpDef_Opdef();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__REF = eINSTANCE.getOpDef_Ref();

    /**
     * The meta object literal for the '<em><b>Settersdef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__SETTERSDEF = eINSTANCE.getOpDef_Settersdef();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__COMPLEX = eINSTANCE.getOpDef_Complex();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OP_DEF__STRING = eINSTANCE.getOpDef_String();

    /**
     * The meta object literal for the '<em><b>Dst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__DST = eINSTANCE.getOpDef_Dst();

    /**
     * The meta object literal for the '<em><b>Feature Settersdef</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP_DEF__FEATURE_SETTERSDEF = eINSTANCE.getOpDef_FeatureSettersdef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.CHANGECLASSImpl <em>CHANGECLASS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.CHANGECLASSImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGECLASS()
     * @generated
     */
    EClass CHANGECLASS = eINSTANCE.getCHANGECLASS();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGECLASS__OP = eINSTANCE.getCHANGECLASS_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGECLASS__REF = eINSTANCE.getCHANGECLASS_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ADDCLASSImpl <em>ADDCLASS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ADDCLASSImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDCLASS()
     * @generated
     */
    EClass ADDCLASS = eINSTANCE.getADDCLASS();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDCLASS__OP = eINSTANCE.getADDCLASS_Op();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDCLASS__NEW = eINSTANCE.getADDCLASS_New();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.DELETECLASSImpl <em>DELETECLASS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.DELETECLASSImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETECLASS()
     * @generated
     */
    EClass DELETECLASS = eINSTANCE.getDELETECLASS();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETECLASS__OP = eINSTANCE.getDELETECLASS_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETECLASS__REF = eINSTANCE.getDELETECLASS_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.classSetterImpl <em>class Setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.classSetterImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getclassSetter()
     * @generated
     */
    EClass CLASS_SETTER = eINSTANCE.getclassSetter();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SETTER__METAFEATURE = eINSTANCE.getclassSetter_Metafeature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_SETTER__VALUE = eINSTANCE.getclassSetter_Value();

    /**
     * The meta object literal for the '<em><b>Value Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SETTER__VALUE_REF = eINSTANCE.getclassSetter_ValueRef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.classSetters_defImpl <em>class Setters def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.classSetters_defImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getclassSetters_def()
     * @generated
     */
    EClass CLASS_SETTERS_DEF = eINSTANCE.getclassSetters_def();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SETTERS_DEF__METAFEATURE = eINSTANCE.getclassSetters_def_Metafeature();

    /**
     * The meta object literal for the '<em><b>Par</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_SETTERS_DEF__PAR = eINSTANCE.getclassSetters_def_Par();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ClassOpImpl <em>Class Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ClassOpImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClassOp()
     * @generated
     */
    EClass CLASS_OP = eINSTANCE.getClassOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__VAR = eINSTANCE.getClassOp_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__OP = eINSTANCE.getClassOp_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__SETTERS = eINSTANCE.getClassOp_Setters();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__ATTRIBUTES = eINSTANCE.getClassOp_Attributes();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__REFERENCES = eINSTANCE.getClassOp_References();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_OP__COMPLEX = eINSTANCE.getClassOp_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.eStructuralFeatureOpImpl <em>eStructural Feature Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.eStructuralFeatureOpImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#geteStructuralFeatureOp()
     * @generated
     */
    EClass ESTRUCTURAL_FEATURE_OP = eINSTANCE.geteStructuralFeatureOp();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTRUCTURAL_FEATURE_OP__OP = eINSTANCE.geteStructuralFeatureOp_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTRUCTURAL_FEATURE_OP__SETTERS = eINSTANCE.geteStructuralFeatureOp_Setters();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ESTRUCTURAL_FEATURE_OP__COMPLEX = eINSTANCE.geteStructuralFeatureOp_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.CHANGEATTRIBUTEImpl <em>CHANGEATTRIBUTE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.CHANGEATTRIBUTEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEATTRIBUTE()
     * @generated
     */
    EClass CHANGEATTRIBUTE = eINSTANCE.getCHANGEATTRIBUTE();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGEATTRIBUTE__REF_ATTR = eINSTANCE.getCHANGEATTRIBUTE_RefAttr();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ADDATTRIBUTEImpl <em>ADDATTRIBUTE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ADDATTRIBUTEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDATTRIBUTE()
     * @generated
     */
    EClass ADDATTRIBUTE = eINSTANCE.getADDATTRIBUTE();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDATTRIBUTE__NEW = eINSTANCE.getADDATTRIBUTE_New();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.DELETEATTRIBUTEImpl <em>DELETEATTRIBUTE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.DELETEATTRIBUTEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEATTRIBUTE()
     * @generated
     */
    EClass DELETEATTRIBUTE = eINSTANCE.getDELETEATTRIBUTE();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETEATTRIBUTE__REF_ATTR = eINSTANCE.getDELETEATTRIBUTE_RefAttr();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl <em>RENAMEATTRIBUTE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRENAMEATTRIBUTE()
     * @generated
     */
    EClass RENAMEATTRIBUTE = eINSTANCE.getRENAMEATTRIBUTE();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RENAMEATTRIBUTE__REF_ATTR = eINSTANCE.getRENAMEATTRIBUTE_RefAttr();

    /**
     * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RENAMEATTRIBUTE__NEW_NAME = eINSTANCE.getRENAMEATTRIBUTE_NewName();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl <em>MOVEATTRIBUTE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMOVEATTRIBUTE()
     * @generated
     */
    EClass MOVEATTRIBUTE = eINSTANCE.getMOVEATTRIBUTE();

    /**
     * The meta object literal for the '<em><b>Ref Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVEATTRIBUTE__REF_ATTR = eINSTANCE.getMOVEATTRIBUTE_RefAttr();

    /**
     * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVEATTRIBUTE__DST = eINSTANCE.getMOVEATTRIBUTE_Dst();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl <em>Feature Setters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.FeatureSettersImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getFeatureSetters()
     * @generated
     */
    EClass FEATURE_SETTERS = eINSTANCE.getFeatureSetters();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SETTERS__METAFEATURE = eINSTANCE.getFeatureSetters_Metafeature();

    /**
     * The meta object literal for the '<em><b>Value EString</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_SETTERS__VALUE_ESTRING = eINSTANCE.getFeatureSetters_ValueEString();

    /**
     * The meta object literal for the '<em><b>Value EInt</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_SETTERS__VALUE_EINT = eINSTANCE.getFeatureSetters_ValueEInt();

    /**
     * The meta object literal for the '<em><b>Value EBool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_SETTERS__VALUE_EBOOL = eINSTANCE.getFeatureSetters_ValueEBool();

    /**
     * The meta object literal for the '<em><b>Value Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SETTERS__VALUE_REF = eINSTANCE.getFeatureSetters_ValueRef();

    /**
     * The meta object literal for the '<em><b>Value Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SETTERS__VALUE_FEATURE = eINSTANCE.getFeatureSetters_ValueFeature();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.AttributeOpImpl <em>Attribute Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.AttributeOpImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getAttributeOp()
     * @generated
     */
    EClass ATTRIBUTE_OP = eINSTANCE.getAttributeOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_OP__VAR = eINSTANCE.getAttributeOp_Var();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.CHANGEREFERENCEImpl <em>CHANGEREFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.CHANGEREFERENCEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCHANGEREFERENCE()
     * @generated
     */
    EClass CHANGEREFERENCE = eINSTANCE.getCHANGEREFERENCE();

    /**
     * The meta object literal for the '<em><b>Ref Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGEREFERENCE__REF_REF = eINSTANCE.getCHANGEREFERENCE_RefRef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ADDREFERENCEImpl <em>ADDREFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ADDREFERENCEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getADDREFERENCE()
     * @generated
     */
    EClass ADDREFERENCE = eINSTANCE.getADDREFERENCE();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDREFERENCE__NEW = eINSTANCE.getADDREFERENCE_New();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.DELETEREFERENCEImpl <em>DELETEREFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.DELETEREFERENCEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getDELETEREFERENCE()
     * @generated
     */
    EClass DELETEREFERENCE = eINSTANCE.getDELETEREFERENCE();

    /**
     * The meta object literal for the '<em><b>Ref Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETEREFERENCE__REF_REF = eINSTANCE.getDELETEREFERENCE_RefRef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl <em>MOVEREFERENCE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMOVEREFERENCE()
     * @generated
     */
    EClass MOVEREFERENCE = eINSTANCE.getMOVEREFERENCE();

    /**
     * The meta object literal for the '<em><b>Ref Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVEREFERENCE__REF_REF = eINSTANCE.getMOVEREFERENCE_RefRef();

    /**
     * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOVEREFERENCE__DST = eINSTANCE.getMOVEREFERENCE_Dst();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl <em>feature Setters def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.featureSetters_defImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getfeatureSetters_def()
     * @generated
     */
    EClass FEATURE_SETTERS_DEF = eINSTANCE.getfeatureSetters_def();

    /**
     * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_SETTERS_DEF__LOWER_BOUND = eINSTANCE.getfeatureSetters_def_LowerBound();

    /**
     * The meta object literal for the '<em><b>EType</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SETTERS_DEF__ETYPE = eINSTANCE.getfeatureSetters_def_EType();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_SETTERS_DEF__OPPOSITE = eINSTANCE.getfeatureSetters_def_Opposite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE_SETTERS_DEF__NAME = eINSTANCE.getfeatureSetters_def_Name();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ReferenceOpImpl <em>Reference Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ReferenceOpImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getReferenceOp()
     * @generated
     */
    EClass REFERENCE_OP = eINSTANCE.getReferenceOp();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_OP__VAR = eINSTANCE.getReferenceOp_Var();

    /**
     * The meta object literal for the '<em><b>CHANGE op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE_OP__CHANGE_OP = eINSTANCE.getReferenceOp_CHANGE_op();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl <em>Complex Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ComplexOperatorImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getComplexOperator()
     * @generated
     */
    EClass COMPLEX_OPERATOR = eINSTANCE.getComplexOperator();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_OPERATOR__NAME = eINSTANCE.getComplexOperator_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__PARAMS = eINSTANCE.getComplexOperator_Params();

    /**
     * The meta object literal for the '<em><b>Class Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__CLASS_OPERATIONS = eINSTANCE.getComplexOperator_ClassOperations();

    /**
     * The meta object literal for the '<em><b>Attribute Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS = eINSTANCE.getComplexOperator_AttributeOperations();

    /**
     * The meta object literal for the '<em><b>Reference Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__REFERENCE_OPERATIONS = eINSTANCE.getComplexOperator_ReferenceOperations();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.INTImpl <em>INT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.INTImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getINT()
     * @generated
     */
    EClass INT = eINSTANCE.getINT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT__NAME = eINSTANCE.getINT_Name();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.STRINGImpl <em>STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.STRINGImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getSTRING()
     * @generated
     */
    EClass STRING = eINSTANCE.getSTRING();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING__NAME = eINSTANCE.getSTRING_Name();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING__OPERATOR = eINSTANCE.getSTRING_Operator();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.EBoolParImpl <em>EBool Par</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.EBoolParImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEBoolPar()
     * @generated
     */
    EClass EBOOL_PAR = eINSTANCE.getEBoolPar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EBOOL_PAR__NAME = eINSTANCE.getEBoolPar_Name();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.CallOperatorImpl <em>Call Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.CallOperatorImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getCallOperator()
     * @generated
     */
    EClass CALL_OPERATOR = eINSTANCE.getCallOperator();

    /**
     * The meta object literal for the '<em><b>Fun</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_OPERATOR__FUN = eINSTANCE.getCallOperator_Fun();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL_OPERATOR__ARGS = eINSTANCE.getCallOperator_Args();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ArgumentImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT__ARG = eINSTANCE.getArgument_Arg();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.MigrationProgramImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigrationProgram()
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
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATION_PROGRAM__PATH = eINSTANCE.getMigrationProgram_Path();

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
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.RuleImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRule()
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
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.RewritingRuleImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getRewritingRule()
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
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.MigratorSXImpl <em>Migrator SX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.MigratorSXImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigratorSX()
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATOR_SX__NAME = eINSTANCE.getMigratorSX_Name();

    /**
     * The meta object literal for the '<em><b>Filter SX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_SX__FILTER_SX = eINSTANCE.getMigratorSX_FilterSX();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.MigratorDXImpl <em>Migrator DX</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.MigratorDXImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getMigratorDX()
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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MIGRATOR_DX__NAME = eINSTANCE.getMigratorDX_Name();

    /**
     * The meta object literal for the '<em><b>Filter DX</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MIGRATOR_DX__FILTER_DX = eINSTANCE.getMigratorDX_FilterDX();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl <em>Filter Migrator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.FilterMigratorImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getFilterMigrator()
     * @generated
     */
    EClass FILTER_MIGRATOR = eINSTANCE.getFilterMigrator();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__FEATURE = eINSTANCE.getFilterMigrator_Feature();

    /**
     * The meta object literal for the '<em><b>Internal Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__INTERNAL_FEATURE = eINSTANCE.getFilterMigrator_InternalFeature();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__OP = eINSTANCE.getFilterMigrator_Op();

    /**
     * The meta object literal for the '<em><b>Dxobj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__DXOBJ = eINSTANCE.getFilterMigrator_Dxobj();

    /**
     * The meta object literal for the '<em><b>Dxgetters</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_MIGRATOR__DXGETTERS = eINSTANCE.getFilterMigrator_Dxgetters();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.PackageImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ClassImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ClassifierImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.AttributeImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.ReferenceImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.EReferenceParImpl <em>EReference Par</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.EReferenceParImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEReferencePar()
     * @generated
     */
    EClass EREFERENCE_PAR = eINSTANCE.getEReferencePar();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.EAttributeParImpl <em>EAttribute Par</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.EAttributeParImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEAttributePar()
     * @generated
     */
    EClass EATTRIBUTE_PAR = eINSTANCE.getEAttributePar();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.EClassParImpl <em>EClass Par</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.EClassParImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEClassPar()
     * @generated
     */
    EClass ECLASS_PAR = eINSTANCE.getEClassPar();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.migration.impl.EPackageParImpl <em>EPackage Par</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.migration.impl.EPackageParImpl
     * @see it.univaq.coevolution.migration.impl.MigrationPackageImpl#getEPackagePar()
     * @generated
     */
    EClass EPACKAGE_PAR = eINSTANCE.getEPackagePar();

  }

} //MigrationPackage
