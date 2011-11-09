/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

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
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangFactory
 * @model kind="package"
 * @generated
 */
public interface EDeltaLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "eDeltaLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.univaq.it/coevolution/differences/edelta/EDeltaLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "eDeltaLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EDeltaLangPackage eINSTANCE = it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl.init();

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ModelImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getModel()
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
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl <em>EPackage Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEPackageOperation()
   * @generated
   */
  int EPACKAGE_OPERATION = 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION__CLASSES = 3;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION__COMPLEX = 4;

  /**
   * The number of structural features of the '<em>EPackage Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EPACKAGE_OPERATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeletePackageImpl <em>Delete Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeletePackageImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeletePackage()
   * @generated
   */
  int DELETE_PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_PACKAGE__REF = 0;

  /**
   * The number of structural features of the '<em>Delete Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddPackageImpl <em>Add Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddPackageImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddPackage()
   * @generated
   */
  int ADD_PACKAGE = 3;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PACKAGE__NEW = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PACKAGE__REF = 1;

  /**
   * The number of structural features of the '<em>Add Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_PACKAGE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangePackageImpl <em>Change Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangePackageImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangePackage()
   * @generated
   */
  int CHANGE_PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_PACKAGE__REF = 0;

  /**
   * The number of structural features of the '<em>Change Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EClassOperationImpl <em>EClass Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EClassOperationImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEClassOperation()
   * @generated
   */
  int ECLASS_OPERATION = 5;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__REFERENCES = 4;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION__COMPLEX = 5;

  /**
   * The number of structural features of the '<em>EClass Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLASS_OPERATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeClassImpl <em>Change Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeClassImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeClass()
   * @generated
   */
  int CHANGE_CLASS = 6;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CLASS__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CLASS__REF = 1;

  /**
   * The number of structural features of the '<em>Change Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddClassImpl <em>Add Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddClassImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddClass()
   * @generated
   */
  int ADD_CLASS = 7;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CLASS__OP = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CLASS__NEW = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CLASS__REF = 2;

  /**
   * The number of structural features of the '<em>Add Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteClassImpl <em>Delete Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteClassImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteClass()
   * @generated
   */
  int DELETE_CLASS = 8;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLASS__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLASS__REF = 1;

  /**
   * The number of structural features of the '<em>Delete Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.setterImpl <em>setter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.setterImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getsetter()
   * @generated
   */
  int SETTER = 9;

  /**
   * The feature id for the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__METAFEATURE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__VALUE = 2;

  /**
   * The feature id for the '<em><b>Card</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__CARD = 3;

  /**
   * The feature id for the '<em><b>Value Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER__VALUE_REF = 4;

  /**
   * The number of structural features of the '<em>setter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EAttributeOperationImpl <em>EAttribute Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EAttributeOperationImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEAttributeOperation()
   * @generated
   */
  int EATTRIBUTE_OPERATION = 10;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OPERATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OPERATION__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OPERATION__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OPERATION__COMPLEX = 3;

  /**
   * The number of structural features of the '<em>EAttribute Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EATTRIBUTE_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeAttributeImpl <em>Change Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeAttributeImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeAttribute()
   * @generated
   */
  int CHANGE_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ATTRIBUTE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ATTRIBUTE__REF = 1;

  /**
   * The number of structural features of the '<em>Change Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl <em>Add Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddAttribute()
   * @generated
   */
  int ADD_ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ATTRIBUTE__OP = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ATTRIBUTE__NEW = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ATTRIBUTE__REF = 2;

  /**
   * The number of structural features of the '<em>Add Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteAttributeImpl <em>Delete Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteAttributeImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteAttribute()
   * @generated
   */
  int DELETE_ATTRIBUTE = 13;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ATTRIBUTE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ATTRIBUTE__REF = 1;

  /**
   * The number of structural features of the '<em>Delete Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EReferenceOperationImpl <em>EReference Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EReferenceOperationImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEReferenceOperation()
   * @generated
   */
  int EREFERENCE_OPERATION = 14;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OPERATION__VAR = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OPERATION__OP = 1;

  /**
   * The feature id for the '<em><b>Setters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OPERATION__SETTERS = 2;

  /**
   * The feature id for the '<em><b>Complex</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OPERATION__COMPLEX = 3;

  /**
   * The number of structural features of the '<em>EReference Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EREFERENCE_OPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeReferenceImpl <em>Change Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeReferenceImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeReference()
   * @generated
   */
  int CHANGE_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_REFERENCE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_REFERENCE__REF = 1;

  /**
   * The number of structural features of the '<em>Change Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddReferenceImpl <em>Add Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddReferenceImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddReference()
   * @generated
   */
  int ADD_REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_REFERENCE__OP = 0;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_REFERENCE__NEW = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_REFERENCE__REF = 2;

  /**
   * The number of structural features of the '<em>Add Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteReferenceImpl <em>Delete Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteReferenceImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteReference()
   * @generated
   */
  int DELETE_REFERENCE = 17;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_REFERENCE__OP = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_REFERENCE__REF = 1;

  /**
   * The number of structural features of the '<em>Delete Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELETE_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl <em>Complex Operator Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getComplexOperatorDef()
   * @generated
   */
  int COMPLEX_OPERATOR_DEF = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__PARAMS = 1;

  /**
   * The feature id for the '<em><b>Package Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS = 2;

  /**
   * The feature id for the '<em><b>Class Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS = 3;

  /**
   * The feature id for the '<em><b>Attribute Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS = 4;

  /**
   * The feature id for the '<em><b>Reference Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS = 5;

  /**
   * The number of structural features of the '<em>Complex Operator Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_DEF_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl <em>Complex Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getComplexOperator()
   * @generated
   */
  int COMPLEX_OPERATOR = 19;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__REF = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__ARGS = 1;

  /**
   * The feature id for the '<em><b>New</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR__NEW = 2;

  /**
   * The number of structural features of the '<em>Complex Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_OPERATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BOOLImpl <em>BOOL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BOOLImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getBOOL()
   * @generated
   */
  int BOOL = 20;

  /**
   * The number of structural features of the '<em>BOOL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.STRINGImpl <em>STRING</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.STRINGImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getSTRING()
   * @generated
   */
  int STRING = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING__NAME = 0;

  /**
   * The number of structural features of the '<em>STRING</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.INTImpl <em>INT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.INTImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getINT()
   * @generated
   */
  int INT = 22;

  /**
   * The number of structural features of the '<em>INT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.PackageImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 23;

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
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ClassImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 24;

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
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AttributeImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 25;

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
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ReferenceImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 26;

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
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BooleanDefImpl <em>Boolean Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BooleanDefImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getBooleanDef()
   * @generated
   */
  int BOOLEAN_DEF = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DEF__NAME = BOOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_DEF_FEATURE_COUNT = BOOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.IntDefImpl <em>Int Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.IntDefImpl
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getIntDef()
   * @generated
   */
  int INT_DEF = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DEF__NAME = INT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_DEF_FEATURE_COUNT = INT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation <em>EPackage Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EPackage Operation</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation
   * @generated
   */
  EClass getEPackageOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getVar()
   * @see #getEPackageOperation()
   * @generated
   */
  EReference getEPackageOperation_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getOp()
   * @see #getEPackageOperation()
   * @generated
   */
  EReference getEPackageOperation_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getSetters()
   * @see #getEPackageOperation()
   * @generated
   */
  EReference getEPackageOperation_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getClasses()
   * @see #getEPackageOperation()
   * @generated
   */
  EReference getEPackageOperation_Classes();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getComplex()
   * @see #getEPackageOperation()
   * @generated
   */
  EReference getEPackageOperation_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage <em>Delete Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Package</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage
   * @generated
   */
  EClass getDeletePackage();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage#getRef()
   * @see #getDeletePackage()
   * @generated
   */
  EReference getDeletePackage_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage <em>Add Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Package</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage
   * @generated
   */
  EClass getAddPackage();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getNew()
   * @see #getAddPackage()
   * @generated
   */
  EAttribute getAddPackage_New();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getRef()
   * @see #getAddPackage()
   * @generated
   */
  EReference getAddPackage_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage <em>Change Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Package</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage
   * @generated
   */
  EClass getChangePackage();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage#getRef()
   * @see #getChangePackage()
   * @generated
   */
  EReference getChangePackage_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation <em>EClass Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EClass Operation</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation
   * @generated
   */
  EClass getEClassOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getVar()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getOp()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getSetters()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getAttributes()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getReferences()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_References();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation#getComplex()
   * @see #getEClassOperation()
   * @generated
   */
  EReference getEClassOperation_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass <em>Change Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Class</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass
   * @generated
   */
  EClass getChangeClass();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass#getOp()
   * @see #getChangeClass()
   * @generated
   */
  EAttribute getChangeClass_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass#getRef()
   * @see #getChangeClass()
   * @generated
   */
  EReference getChangeClass_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass <em>Add Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Class</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass
   * @generated
   */
  EClass getAddClass();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getOp()
   * @see #getAddClass()
   * @generated
   */
  EAttribute getAddClass_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getNew()
   * @see #getAddClass()
   * @generated
   */
  EAttribute getAddClass_New();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass#getRef()
   * @see #getAddClass()
   * @generated
   */
  EReference getAddClass_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass <em>Delete Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Class</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass
   * @generated
   */
  EClass getDeleteClass();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass#getOp()
   * @see #getDeleteClass()
   * @generated
   */
  EAttribute getDeleteClass_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass#getRef()
   * @see #getDeleteClass()
   * @generated
   */
  EReference getDeleteClass_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter <em>setter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>setter</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter
   * @generated
   */
  EClass getsetter();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getMetafeature <em>Metafeature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metafeature</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getMetafeature()
   * @see #getsetter()
   * @generated
   */
  EReference getsetter_Metafeature();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getOperator()
   * @see #getsetter()
   * @generated
   */
  EAttribute getsetter_Operator();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValue()
   * @see #getsetter()
   * @generated
   */
  EAttribute getsetter_Value();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getCard <em>Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Card</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getCard()
   * @see #getsetter()
   * @generated
   */
  EAttribute getsetter_Card();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValueRef <em>Value Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Value Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter#getValueRef()
   * @see #getsetter()
   * @generated
   */
  EReference getsetter_ValueRef();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation <em>EAttribute Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EAttribute Operation</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation
   * @generated
   */
  EClass getEAttributeOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getVar()
   * @see #getEAttributeOperation()
   * @generated
   */
  EReference getEAttributeOperation_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getOp()
   * @see #getEAttributeOperation()
   * @generated
   */
  EReference getEAttributeOperation_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getSetters()
   * @see #getEAttributeOperation()
   * @generated
   */
  EReference getEAttributeOperation_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getComplex()
   * @see #getEAttributeOperation()
   * @generated
   */
  EReference getEAttributeOperation_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute <em>Change Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Attribute</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute
   * @generated
   */
  EClass getChangeAttribute();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute#getOp()
   * @see #getChangeAttribute()
   * @generated
   */
  EAttribute getChangeAttribute_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute#getRef()
   * @see #getChangeAttribute()
   * @generated
   */
  EReference getChangeAttribute_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute <em>Add Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Attribute</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute
   * @generated
   */
  EClass getAddAttribute();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getOp()
   * @see #getAddAttribute()
   * @generated
   */
  EAttribute getAddAttribute_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getNew()
   * @see #getAddAttribute()
   * @generated
   */
  EAttribute getAddAttribute_New();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute#getRef()
   * @see #getAddAttribute()
   * @generated
   */
  EReference getAddAttribute_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute <em>Delete Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Attribute</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute
   * @generated
   */
  EClass getDeleteAttribute();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute#getOp()
   * @see #getDeleteAttribute()
   * @generated
   */
  EAttribute getDeleteAttribute_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute#getRef()
   * @see #getDeleteAttribute()
   * @generated
   */
  EReference getDeleteAttribute_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation <em>EReference Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EReference Operation</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation
   * @generated
   */
  EClass getEReferenceOperation();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getVar()
   * @see #getEReferenceOperation()
   * @generated
   */
  EReference getEReferenceOperation_Var();

  /**
   * Returns the meta object for the containment reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getOp()
   * @see #getEReferenceOperation()
   * @generated
   */
  EReference getEReferenceOperation_Op();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getSetters <em>Setters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Setters</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getSetters()
   * @see #getEReferenceOperation()
   * @generated
   */
  EReference getEReferenceOperation_Setters();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getComplex <em>Complex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Complex</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation#getComplex()
   * @see #getEReferenceOperation()
   * @generated
   */
  EReference getEReferenceOperation_Complex();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference <em>Change Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Reference</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference
   * @generated
   */
  EClass getChangeReference();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference#getOp()
   * @see #getChangeReference()
   * @generated
   */
  EAttribute getChangeReference_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference#getRef()
   * @see #getChangeReference()
   * @generated
   */
  EReference getChangeReference_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference <em>Add Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Reference</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference
   * @generated
   */
  EClass getAddReference();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getOp()
   * @see #getAddReference()
   * @generated
   */
  EAttribute getAddReference_Op();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>New</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getNew()
   * @see #getAddReference()
   * @generated
   */
  EAttribute getAddReference_New();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference#getRef()
   * @see #getAddReference()
   * @generated
   */
  EReference getAddReference_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference <em>Delete Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delete Reference</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference
   * @generated
   */
  EClass getDeleteReference();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference#getOp()
   * @see #getDeleteReference()
   * @generated
   */
  EAttribute getDeleteReference_Op();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference#getRef()
   * @see #getDeleteReference()
   * @generated
   */
  EReference getDeleteReference_Ref();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef <em>Complex Operator Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Operator Def</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef
   * @generated
   */
  EClass getComplexOperatorDef();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getName()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EAttribute getComplexOperatorDef_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getParams()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EReference getComplexOperatorDef_Params();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getPackageOperations <em>Package Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Operations</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getPackageOperations()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EReference getComplexOperatorDef_PackageOperations();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getClassOperations <em>Class Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Operations</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getClassOperations()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EReference getComplexOperatorDef_ClassOperations();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getAttributeOperations <em>Attribute Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Operations</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getAttributeOperations()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EReference getComplexOperatorDef_AttributeOperations();

  /**
   * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getReferenceOperations <em>Reference Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reference Operations</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getReferenceOperations()
   * @see #getComplexOperatorDef()
   * @generated
   */
  EReference getComplexOperatorDef_ReferenceOperations();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator <em>Complex Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Operator</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator
   * @generated
   */
  EClass getComplexOperator();

  /**
   * Returns the meta object for the reference '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getRef()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_Ref();

  /**
   * Returns the meta object for the reference list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Args</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getArgs()
   * @see #getComplexOperator()
   * @generated
   */
  EReference getComplexOperator_Args();

  /**
   * Returns the meta object for the attribute list '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getNew <em>New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>New</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator#getNew()
   * @see #getComplexOperator()
   * @generated
   */
  EAttribute getComplexOperator_New();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL <em>BOOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BOOL</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL
   * @generated
   */
  EClass getBOOL();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STRING</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.STRING
   * @generated
   */
  EClass getSTRING();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.STRING#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.STRING#getName()
   * @see #getSTRING()
   * @generated
   */
  EAttribute getSTRING_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INT</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.INT
   * @generated
   */
  EClass getINT();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef <em>Boolean Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Def</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef
   * @generated
   */
  EClass getBooleanDef();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef#getName()
   * @see #getBooleanDef()
   * @generated
   */
  EAttribute getBooleanDef_Name();

  /**
   * Returns the meta object for class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef <em>Int Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Def</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef
   * @generated
   */
  EClass getIntDef();

  /**
   * Returns the meta object for the attribute '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef#getName()
   * @see #getIntDef()
   * @generated
   */
  EAttribute getIntDef_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EDeltaLangFactory getEDeltaLangFactory();

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
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ModelImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getModel()
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
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl <em>EPackage Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEPackageOperation()
     * @generated
     */
    EClass EPACKAGE_OPERATION = eINSTANCE.getEPackageOperation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OPERATION__VAR = eINSTANCE.getEPackageOperation_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OPERATION__OP = eINSTANCE.getEPackageOperation_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OPERATION__SETTERS = eINSTANCE.getEPackageOperation_Setters();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OPERATION__CLASSES = eINSTANCE.getEPackageOperation_Classes();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EPACKAGE_OPERATION__COMPLEX = eINSTANCE.getEPackageOperation_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeletePackageImpl <em>Delete Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeletePackageImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeletePackage()
     * @generated
     */
    EClass DELETE_PACKAGE = eINSTANCE.getDeletePackage();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_PACKAGE__REF = eINSTANCE.getDeletePackage_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddPackageImpl <em>Add Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddPackageImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddPackage()
     * @generated
     */
    EClass ADD_PACKAGE = eINSTANCE.getAddPackage();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_PACKAGE__NEW = eINSTANCE.getAddPackage_New();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_PACKAGE__REF = eINSTANCE.getAddPackage_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangePackageImpl <em>Change Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangePackageImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangePackage()
     * @generated
     */
    EClass CHANGE_PACKAGE = eINSTANCE.getChangePackage();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_PACKAGE__REF = eINSTANCE.getChangePackage_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EClassOperationImpl <em>EClass Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EClassOperationImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEClassOperation()
     * @generated
     */
    EClass ECLASS_OPERATION = eINSTANCE.getEClassOperation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__VAR = eINSTANCE.getEClassOperation_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__OP = eINSTANCE.getEClassOperation_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__SETTERS = eINSTANCE.getEClassOperation_Setters();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__ATTRIBUTES = eINSTANCE.getEClassOperation_Attributes();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__REFERENCES = eINSTANCE.getEClassOperation_References();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECLASS_OPERATION__COMPLEX = eINSTANCE.getEClassOperation_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeClassImpl <em>Change Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeClassImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeClass()
     * @generated
     */
    EClass CHANGE_CLASS = eINSTANCE.getChangeClass();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGE_CLASS__OP = eINSTANCE.getChangeClass_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_CLASS__REF = eINSTANCE.getChangeClass_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddClassImpl <em>Add Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddClassImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddClass()
     * @generated
     */
    EClass ADD_CLASS = eINSTANCE.getAddClass();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_CLASS__OP = eINSTANCE.getAddClass_Op();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_CLASS__NEW = eINSTANCE.getAddClass_New();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_CLASS__REF = eINSTANCE.getAddClass_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteClassImpl <em>Delete Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteClassImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteClass()
     * @generated
     */
    EClass DELETE_CLASS = eINSTANCE.getDeleteClass();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_CLASS__OP = eINSTANCE.getDeleteClass_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_CLASS__REF = eINSTANCE.getDeleteClass_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.setterImpl <em>setter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.setterImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getsetter()
     * @generated
     */
    EClass SETTER = eINSTANCE.getsetter();

    /**
     * The meta object literal for the '<em><b>Metafeature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER__METAFEATURE = eINSTANCE.getsetter_Metafeature();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTER__OPERATOR = eINSTANCE.getsetter_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTER__VALUE = eINSTANCE.getsetter_Value();

    /**
     * The meta object literal for the '<em><b>Card</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTER__CARD = eINSTANCE.getsetter_Card();

    /**
     * The meta object literal for the '<em><b>Value Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTER__VALUE_REF = eINSTANCE.getsetter_ValueRef();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EAttributeOperationImpl <em>EAttribute Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EAttributeOperationImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEAttributeOperation()
     * @generated
     */
    EClass EATTRIBUTE_OPERATION = eINSTANCE.getEAttributeOperation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OPERATION__VAR = eINSTANCE.getEAttributeOperation_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OPERATION__OP = eINSTANCE.getEAttributeOperation_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OPERATION__SETTERS = eINSTANCE.getEAttributeOperation_Setters();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EATTRIBUTE_OPERATION__COMPLEX = eINSTANCE.getEAttributeOperation_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeAttributeImpl <em>Change Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeAttributeImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeAttribute()
     * @generated
     */
    EClass CHANGE_ATTRIBUTE = eINSTANCE.getChangeAttribute();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGE_ATTRIBUTE__OP = eINSTANCE.getChangeAttribute_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_ATTRIBUTE__REF = eINSTANCE.getChangeAttribute_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl <em>Add Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddAttributeImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddAttribute()
     * @generated
     */
    EClass ADD_ATTRIBUTE = eINSTANCE.getAddAttribute();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_ATTRIBUTE__OP = eINSTANCE.getAddAttribute_Op();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_ATTRIBUTE__NEW = eINSTANCE.getAddAttribute_New();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_ATTRIBUTE__REF = eINSTANCE.getAddAttribute_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteAttributeImpl <em>Delete Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteAttributeImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteAttribute()
     * @generated
     */
    EClass DELETE_ATTRIBUTE = eINSTANCE.getDeleteAttribute();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_ATTRIBUTE__OP = eINSTANCE.getDeleteAttribute_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_ATTRIBUTE__REF = eINSTANCE.getDeleteAttribute_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EReferenceOperationImpl <em>EReference Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EReferenceOperationImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getEReferenceOperation()
     * @generated
     */
    EClass EREFERENCE_OPERATION = eINSTANCE.getEReferenceOperation();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OPERATION__VAR = eINSTANCE.getEReferenceOperation_Var();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OPERATION__OP = eINSTANCE.getEReferenceOperation_Op();

    /**
     * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OPERATION__SETTERS = eINSTANCE.getEReferenceOperation_Setters();

    /**
     * The meta object literal for the '<em><b>Complex</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EREFERENCE_OPERATION__COMPLEX = eINSTANCE.getEReferenceOperation_Complex();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeReferenceImpl <em>Change Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ChangeReferenceImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getChangeReference()
     * @generated
     */
    EClass CHANGE_REFERENCE = eINSTANCE.getChangeReference();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHANGE_REFERENCE__OP = eINSTANCE.getChangeReference_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHANGE_REFERENCE__REF = eINSTANCE.getChangeReference_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddReferenceImpl <em>Add Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AddReferenceImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAddReference()
     * @generated
     */
    EClass ADD_REFERENCE = eINSTANCE.getAddReference();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_REFERENCE__OP = eINSTANCE.getAddReference_Op();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD_REFERENCE__NEW = eINSTANCE.getAddReference_New();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_REFERENCE__REF = eINSTANCE.getAddReference_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteReferenceImpl <em>Delete Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.DeleteReferenceImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getDeleteReference()
     * @generated
     */
    EClass DELETE_REFERENCE = eINSTANCE.getDeleteReference();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DELETE_REFERENCE__OP = eINSTANCE.getDeleteReference_Op();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELETE_REFERENCE__REF = eINSTANCE.getDeleteReference_Ref();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl <em>Complex Operator Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getComplexOperatorDef()
     * @generated
     */
    EClass COMPLEX_OPERATOR_DEF = eINSTANCE.getComplexOperatorDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_OPERATOR_DEF__NAME = eINSTANCE.getComplexOperatorDef_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR_DEF__PARAMS = eINSTANCE.getComplexOperatorDef_Params();

    /**
     * The meta object literal for the '<em><b>Package Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS = eINSTANCE.getComplexOperatorDef_PackageOperations();

    /**
     * The meta object literal for the '<em><b>Class Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS = eINSTANCE.getComplexOperatorDef_ClassOperations();

    /**
     * The meta object literal for the '<em><b>Attribute Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS = eINSTANCE.getComplexOperatorDef_AttributeOperations();

    /**
     * The meta object literal for the '<em><b>Reference Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS = eINSTANCE.getComplexOperatorDef_ReferenceOperations();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl <em>Complex Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getComplexOperator()
     * @generated
     */
    EClass COMPLEX_OPERATOR = eINSTANCE.getComplexOperator();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__REF = eINSTANCE.getComplexOperator_Ref();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_OPERATOR__ARGS = eINSTANCE.getComplexOperator_Args();

    /**
     * The meta object literal for the '<em><b>New</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_OPERATOR__NEW = eINSTANCE.getComplexOperator_New();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BOOLImpl <em>BOOL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BOOLImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getBOOL()
     * @generated
     */
    EClass BOOL = eINSTANCE.getBOOL();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.STRINGImpl <em>STRING</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.STRINGImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getSTRING()
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
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.INTImpl <em>INT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.INTImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getINT()
     * @generated
     */
    EClass INT = eINSTANCE.getINT();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.PackageImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ClassImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.AttributeImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ReferenceImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BooleanDefImpl <em>Boolean Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.BooleanDefImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getBooleanDef()
     * @generated
     */
    EClass BOOLEAN_DEF = eINSTANCE.getBooleanDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_DEF__NAME = eINSTANCE.getBooleanDef_Name();

    /**
     * The meta object literal for the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.IntDefImpl <em>Int Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.IntDefImpl
     * @see it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EDeltaLangPackageImpl#getIntDef()
     * @generated
     */
    EClass INT_DEF = eINSTANCE.getIntDef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_DEF__NAME = eINSTANCE.getIntDef_Name();

  }

} //EDeltaLangPackage
