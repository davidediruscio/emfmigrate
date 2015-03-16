/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory
 * @model kind="package"
 * @generated
 */
public interface EdeltaPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "edelta";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.emfmigrate.org/edelta";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "edelta";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EdeltaPackage eINSTANCE = it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl.init();

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.NamedElementImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getNamedElement()
	 * @generated
	 */
  int NAMED_ELEMENT = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT__NAME = 0;

  /**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.TypeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getType()
	 * @generated
	 */
  int TYPE = 1;

  /**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TYPE_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.DataTypeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getDataType()
	 * @generated
	 */
  int DATA_TYPE = 2;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 3;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Class Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_OP = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AtomicOperatorImpl <em>Atomic Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AtomicOperatorImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAtomicOperator()
	 * @generated
	 */
	int ATOMIC_OPERATOR = 8;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl <em>Package Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getPackageOperation()
	 * @generated
	 */
	int PACKAGE_OPERATION = 4;

		/**
	 * The feature id for the '<em><b>Classesoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION__CLASSESOPERATIONS = 0;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION__SETTER = 1;

		/**
	 * The number of structural features of the '<em>Package Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_FEATURE_COUNT = 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureOperationImpl <em>Feature Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureOperationImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeatureOperation()
	 * @generated
	 */
	int FEATURE_OPERATION = 5;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION__SETTER = 0;

		/**
	 * The number of structural features of the '<em>Feature Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_FEATURE_COUNT = 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeOperationImpl <em>Attribute Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeOperationImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAttributeOperation()
	 * @generated
	 */
	int ATTRIBUTE_OPERATION = 6;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION__SETTER = FEATURE_OPERATION__SETTER;

		/**
	 * The number of structural features of the '<em>Attribute Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_FEATURE_COUNT = FEATURE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceOperationImpl <em>Reference Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceOperationImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getReferenceOperation()
	 * @generated
	 */
	int REFERENCE_OPERATION = 7;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION__SETTER = FEATURE_OPERATION__SETTER;

		/**
	 * The number of structural features of the '<em>Reference Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_FEATURE_COUNT = FEATURE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Atomic Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_OPERATOR_FEATURE_COUNT = 0;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addPackageImpl <em>add Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addPackageImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddPackage()
	 * @generated
	 */
	int ADD_PACKAGE = 9;

		/**
	 * The feature id for the '<em><b>Classesoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PACKAGE__CLASSESOPERATIONS = PACKAGE_OPERATION__CLASSESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PACKAGE__SETTER = PACKAGE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PACKAGE__NAME = PACKAGE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>add Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PACKAGE_FEATURE_COUNT = PACKAGE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deletePackageImpl <em>delete Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deletePackageImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeletePackage()
	 * @generated
	 */
	int DELETE_PACKAGE = 10;

		/**
	 * The feature id for the '<em><b>Classesoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PACKAGE__CLASSESOPERATIONS = PACKAGE_OPERATION__CLASSESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PACKAGE__SETTER = PACKAGE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PACKAGE__REF = PACKAGE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PACKAGE__EXT = PACKAGE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>delete Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_PACKAGE_FEATURE_COUNT = PACKAGE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl <em>change Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangePackage()
	 * @generated
	 */
	int CHANGE_PACKAGE = 11;

		/**
	 * The feature id for the '<em><b>Classesoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PACKAGE__CLASSESOPERATIONS = PACKAGE_OPERATION__CLASSESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PACKAGE__SETTER = PACKAGE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PACKAGE__REF = PACKAGE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PACKAGE__EXT = PACKAGE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>change Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PACKAGE_FEATURE_COUNT = PACKAGE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 12;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Package Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE_OP = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

		/**
	 * The feature id for the '<em><b>Packageoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGEOPERATIONS = 0;

		/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODULE = 1;

		/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATATYPES = 2;

		/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 3;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModuleImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 14;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl <em>Class Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getClassOperation()
	 * @generated
	 */
	int CLASS_OPERATION = 15;

		/**
	 * The feature id for the '<em><b>Featuresoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION__FEATURESOPERATIONS = 0;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION__SETTER = 1;

		/**
	 * The number of structural features of the '<em>Class Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_FEATURE_COUNT = 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeClassImpl <em>change Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeClassImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeClass()
	 * @generated
	 */
	int CHANGE_CLASS = 16;

		/**
	 * The feature id for the '<em><b>Featuresoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CLASS__FEATURESOPERATIONS = CLASS_OPERATION__FEATURESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CLASS__SETTER = CLASS_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CLASS__REF = CLASS_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CLASS__EXT = CLASS_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>change Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CLASS_FEATURE_COUNT = CLASS_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl <em>delete Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteClass()
	 * @generated
	 */
	int DELETE_CLASS = 17;

		/**
	 * The feature id for the '<em><b>Featuresoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLASS__FEATURESOPERATIONS = CLASS_OPERATION__FEATURESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLASS__SETTER = CLASS_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLASS__REF = CLASS_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLASS__EXT = CLASS_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>delete Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_CLASS_FEATURE_COUNT = CLASS_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addClassImpl <em>add Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addClassImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddClass()
	 * @generated
	 */
	int ADD_CLASS = 18;

		/**
	 * The feature id for the '<em><b>Featuresoperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__FEATURESOPERATIONS = CLASS_OPERATION__FEATURESOPERATIONS;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__SETTER = CLASS_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS__NAME = CLASS_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>add Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CLASS_FEATURE_COUNT = CLASS_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeature()
	 * @generated
	 */
  int FEATURE = 19;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 20;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

		/**
	 * The feature id for the '<em><b>Features Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FEATURES_OP = FEATURE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 21;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = FEATURE__NAME;

		/**
	 * The feature id for the '<em><b>Features Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__FEATURES_OP = FEATURE_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addAttributeImpl <em>add Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addAttributeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddAttribute()
	 * @generated
	 */
	int ADD_ATTRIBUTE = 22;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__SETTER = ATTRIBUTE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE__NAME = ATTRIBUTE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>add Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteAttributeImpl <em>delete Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteAttributeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteAttribute()
	 * @generated
	 */
	int DELETE_ATTRIBUTE = 23;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__SETTER = ATTRIBUTE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__REF = ATTRIBUTE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE__EXT = ATTRIBUTE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>delete Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeAttributeImpl <em>change Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeAttributeImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeAttribute()
	 * @generated
	 */
	int CHANGE_ATTRIBUTE = 24;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE__SETTER = ATTRIBUTE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE__REF = ATTRIBUTE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE__EXT = ATTRIBUTE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>change Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addReferenceImpl <em>add Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addReferenceImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddReference()
	 * @generated
	 */
	int ADD_REFERENCE = 25;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE__SETTER = REFERENCE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE__NAME = REFERENCE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>add Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_FEATURE_COUNT = REFERENCE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteReferenceImpl <em>delete Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteReferenceImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteReference()
	 * @generated
	 */
	int DELETE_REFERENCE = 26;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__SETTER = REFERENCE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__REF = REFERENCE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE__EXT = REFERENCE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>delete Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_REFERENCE_FEATURE_COUNT = REFERENCE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeReferenceImpl <em>change Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeReferenceImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeReference()
	 * @generated
	 */
	int CHANGE_REFERENCE = 27;

		/**
	 * The feature id for the '<em><b>Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REFERENCE__SETTER = REFERENCE_OPERATION__SETTER;

		/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REFERENCE__REF = REFERENCE_OPERATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REFERENCE__EXT = REFERENCE_OPERATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>change Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_REFERENCE_FEATURE_COUNT = REFERENCE_OPERATION_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterImpl <em>Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getSetter()
	 * @generated
	 */
	int SETTER = 28;

		/**
	 * The feature id for the '<em><b>Metafeature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__METAFEATURE = 0;

		/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__VALUE = 1;

		/**
	 * The number of structural features of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FEATURE_COUNT = 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterValueImpl <em>Setter Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterValueImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getSetterValue()
	 * @generated
	 */
	int SETTER_VALUE = 29;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_VALUE__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_VALUE__FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Setter Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_VALUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ParameterImpl
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 30;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REF_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind <em>Feature Kind</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeatureKind()
	 * @generated
	 */
  int FEATURE_KIND = 31;


  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement
	 * @generated
	 */
  EClass getNamedElement();

  /**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
  EAttribute getNamedElement_Name();

  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Type
	 * @generated
	 */
  EClass getType();

  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.DataType
	 * @generated
	 */
  EClass getDataType();

  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Class
	 * @generated
	 */
	EClass getClass_();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Class#getClassOp <em>Class Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Op</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Class#getClassOp()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassOp();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation <em>Package Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Operation</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation
	 * @generated
	 */
	EClass getPackageOperation();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getClassesoperations <em>Classesoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classesoperations</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getClassesoperations()
	 * @see #getPackageOperation()
	 * @generated
	 */
	EReference getPackageOperation_Classesoperations();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setter</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getSetter()
	 * @see #getPackageOperation()
	 * @generated
	 */
	EReference getPackageOperation_Setter();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation <em>Feature Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Operation</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation
	 * @generated
	 */
	EClass getFeatureOperation();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setter</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation#getSetter()
	 * @see #getFeatureOperation()
	 * @generated
	 */
	EReference getFeatureOperation_Setter();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation <em>Attribute Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Operation</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation
	 * @generated
	 */
	EClass getAttributeOperation();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation <em>Reference Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Operation</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation
	 * @generated
	 */
	EClass getReferenceOperation();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator <em>Atomic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Operator</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator
	 * @generated
	 */
	EClass getAtomicOperator();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addPackage <em>add Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>add Package</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addPackage
	 * @generated
	 */
	EClass getaddPackage();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage <em>delete Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>delete Package</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage
	 * @generated
	 */
	EClass getdeletePackage();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage#getRef()
	 * @see #getdeletePackage()
	 * @generated
	 */
	EReference getdeletePackage_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage#getExt()
	 * @see #getdeletePackage()
	 * @generated
	 */
	EAttribute getdeletePackage_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changePackage <em>change Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>change Package</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changePackage
	 * @generated
	 */
	EClass getchangePackage();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changePackage#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changePackage#getRef()
	 * @see #getchangePackage()
	 * @generated
	 */
	EReference getchangePackage_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changePackage#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changePackage#getExt()
	 * @see #getchangePackage()
	 * @generated
	 */
	EAttribute getchangePackage_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Package
	 * @generated
	 */
	EClass getPackage();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Package#getPackageOp <em>Package Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Op</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Package#getPackageOp()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackageOp();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Model
	 * @generated
	 */
	EClass getModel();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getPackageoperations <em>Packageoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packageoperations</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Model#getPackageoperations()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packageoperations();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Module</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Model#getModule()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Module();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Model#getDatatypes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Datatypes();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Module
	 * @generated
	 */
	EClass getModule();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation <em>Class Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operation</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation
	 * @generated
	 */
	EClass getClassOperation();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation#getFeaturesoperations <em>Featuresoperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Featuresoperations</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation#getFeaturesoperations()
	 * @see #getClassOperation()
	 * @generated
	 */
	EReference getClassOperation_Featuresoperations();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation#getSetter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setter</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation#getSetter()
	 * @see #getClassOperation()
	 * @generated
	 */
	EReference getClassOperation_Setter();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeClass <em>change Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>change Class</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeClass
	 * @generated
	 */
	EClass getchangeClass();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeClass#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeClass#getRef()
	 * @see #getchangeClass()
	 * @generated
	 */
	EReference getchangeClass_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeClass#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeClass#getExt()
	 * @see #getchangeClass()
	 * @generated
	 */
	EAttribute getchangeClass_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass <em>delete Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>delete Class</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass
	 * @generated
	 */
	EClass getdeleteClass();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass#getRef()
	 * @see #getdeleteClass()
	 * @generated
	 */
	EReference getdeleteClass_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass#getExt()
	 * @see #getdeleteClass()
	 * @generated
	 */
	EAttribute getdeleteClass_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addClass <em>add Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>add Class</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addClass
	 * @generated
	 */
	EClass getaddClass();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Feature
	 * @generated
	 */
  EClass getFeature();

  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Attribute
	 * @generated
	 */
	EClass getAttribute();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Attribute#getFeaturesOp <em>Features Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Op</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Attribute#getFeaturesOp()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_FeaturesOp();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Reference
	 * @generated
	 */
	EClass getReference();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Reference#getFeaturesOp <em>Features Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Op</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Reference#getFeaturesOp()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_FeaturesOp();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute <em>add Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>add Attribute</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute
	 * @generated
	 */
	EClass getaddAttribute();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute <em>delete Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>delete Attribute</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute
	 * @generated
	 */
	EClass getdeleteAttribute();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute#getRef()
	 * @see #getdeleteAttribute()
	 * @generated
	 */
	EReference getdeleteAttribute_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute#getExt()
	 * @see #getdeleteAttribute()
	 * @generated
	 */
	EAttribute getdeleteAttribute_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute <em>change Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>change Attribute</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute
	 * @generated
	 */
	EClass getchangeAttribute();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getRef()
	 * @see #getchangeAttribute()
	 * @generated
	 */
	EReference getchangeAttribute_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getExt()
	 * @see #getchangeAttribute()
	 * @generated
	 */
	EAttribute getchangeAttribute_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.addReference <em>add Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>add Reference</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.addReference
	 * @generated
	 */
	EClass getaddReference();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference <em>delete Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>delete Reference</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference
	 * @generated
	 */
	EClass getdeleteReference();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference#getRef()
	 * @see #getdeleteReference()
	 * @generated
	 */
	EReference getdeleteReference_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference#getExt()
	 * @see #getdeleteReference()
	 * @generated
	 */
	EAttribute getdeleteReference_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeReference <em>change Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>change Reference</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeReference
	 * @generated
	 */
	EClass getchangeReference();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeReference#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeReference#getRef()
	 * @see #getchangeReference()
	 * @generated
	 */
	EReference getchangeReference_Ref();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeReference#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.changeReference#getExt()
	 * @see #getchangeReference()
	 * @generated
	 */
	EAttribute getchangeReference_Ext();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Setter
	 * @generated
	 */
	EClass getSetter();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getMetafeature <em>Metafeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metafeature</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getMetafeature()
	 * @see #getSetter()
	 * @generated
	 */
	EAttribute getSetter_Metafeature();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getValue()
	 * @see #getSetter()
	 * @generated
	 */
	EReference getSetter_Value();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue <em>Setter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Value</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue
	 * @generated
	 */
	EClass getSetterValue();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue#getFeature()
	 * @see #getSetterValue()
	 * @generated
	 */
	EAttribute getSetterValue_Feature();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Parameter
	 * @generated
	 */
	EClass getParameter();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref Type</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getRefType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_RefType();

		/**
	 * Returns the meta object for enum '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind <em>Feature Kind</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Kind</em>'.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind
	 * @generated
	 */
  EEnum getFeatureKind();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EdeltaFactory getEdeltaFactory();

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
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.NamedElementImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getNamedElement()
		 * @generated
		 */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.TypeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getType()
		 * @generated
		 */
    EClass TYPE = eINSTANCE.getType();

    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.DataTypeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getDataType()
		 * @generated
		 */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

				/**
		 * The meta object literal for the '<em><b>Class Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_OP = eINSTANCE.getClass_ClassOp();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl <em>Package Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getPackageOperation()
		 * @generated
		 */
		EClass PACKAGE_OPERATION = eINSTANCE.getPackageOperation();

				/**
		 * The meta object literal for the '<em><b>Classesoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OPERATION__CLASSESOPERATIONS = eINSTANCE.getPackageOperation_Classesoperations();

				/**
		 * The meta object literal for the '<em><b>Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OPERATION__SETTER = eINSTANCE.getPackageOperation_Setter();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureOperationImpl <em>Feature Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureOperationImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeatureOperation()
		 * @generated
		 */
		EClass FEATURE_OPERATION = eINSTANCE.getFeatureOperation();

				/**
		 * The meta object literal for the '<em><b>Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OPERATION__SETTER = eINSTANCE.getFeatureOperation_Setter();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeOperationImpl <em>Attribute Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeOperationImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAttributeOperation()
		 * @generated
		 */
		EClass ATTRIBUTE_OPERATION = eINSTANCE.getAttributeOperation();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceOperationImpl <em>Reference Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceOperationImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getReferenceOperation()
		 * @generated
		 */
		EClass REFERENCE_OPERATION = eINSTANCE.getReferenceOperation();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AtomicOperatorImpl <em>Atomic Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AtomicOperatorImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAtomicOperator()
		 * @generated
		 */
		EClass ATOMIC_OPERATOR = eINSTANCE.getAtomicOperator();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addPackageImpl <em>add Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addPackageImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddPackage()
		 * @generated
		 */
		EClass ADD_PACKAGE = eINSTANCE.getaddPackage();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deletePackageImpl <em>delete Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deletePackageImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeletePackage()
		 * @generated
		 */
		EClass DELETE_PACKAGE = eINSTANCE.getdeletePackage();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_PACKAGE__REF = eINSTANCE.getdeletePackage_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_PACKAGE__EXT = eINSTANCE.getdeletePackage_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl <em>change Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangePackage()
		 * @generated
		 */
		EClass CHANGE_PACKAGE = eINSTANCE.getchangePackage();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PACKAGE__REF = eINSTANCE.getchangePackage_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PACKAGE__EXT = eINSTANCE.getchangePackage_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

				/**
		 * The meta object literal for the '<em><b>Package Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE_OP = eINSTANCE.getPackage_PackageOp();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

				/**
		 * The meta object literal for the '<em><b>Packageoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGEOPERATIONS = eINSTANCE.getModel_Packageoperations();

				/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODULE = eINSTANCE.getModel_Module();

				/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATATYPES = eINSTANCE.getModel_Datatypes();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModuleImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl <em>Class Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getClassOperation()
		 * @generated
		 */
		EClass CLASS_OPERATION = eINSTANCE.getClassOperation();

				/**
		 * The meta object literal for the '<em><b>Featuresoperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION__FEATURESOPERATIONS = eINSTANCE.getClassOperation_Featuresoperations();

				/**
		 * The meta object literal for the '<em><b>Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OPERATION__SETTER = eINSTANCE.getClassOperation_Setter();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeClassImpl <em>change Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeClassImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeClass()
		 * @generated
		 */
		EClass CHANGE_CLASS = eINSTANCE.getchangeClass();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_CLASS__REF = eINSTANCE.getchangeClass_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CLASS__EXT = eINSTANCE.getchangeClass_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl <em>delete Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteClass()
		 * @generated
		 */
		EClass DELETE_CLASS = eINSTANCE.getdeleteClass();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_CLASS__REF = eINSTANCE.getdeleteClass_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_CLASS__EXT = eINSTANCE.getdeleteClass_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addClassImpl <em>add Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addClassImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddClass()
		 * @generated
		 */
		EClass ADD_CLASS = eINSTANCE.getaddClass();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.FeatureImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeature()
		 * @generated
		 */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

				/**
		 * The meta object literal for the '<em><b>Features Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__FEATURES_OP = eINSTANCE.getAttribute_FeaturesOp();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

				/**
		 * The meta object literal for the '<em><b>Features Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__FEATURES_OP = eINSTANCE.getReference_FeaturesOp();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addAttributeImpl <em>add Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addAttributeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddAttribute()
		 * @generated
		 */
		EClass ADD_ATTRIBUTE = eINSTANCE.getaddAttribute();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteAttributeImpl <em>delete Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteAttributeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteAttribute()
		 * @generated
		 */
		EClass DELETE_ATTRIBUTE = eINSTANCE.getdeleteAttribute();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ATTRIBUTE__REF = eINSTANCE.getdeleteAttribute_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ATTRIBUTE__EXT = eINSTANCE.getdeleteAttribute_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeAttributeImpl <em>change Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeAttributeImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeAttribute()
		 * @generated
		 */
		EClass CHANGE_ATTRIBUTE = eINSTANCE.getchangeAttribute();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_ATTRIBUTE__REF = eINSTANCE.getchangeAttribute_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATTRIBUTE__EXT = eINSTANCE.getchangeAttribute_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.addReferenceImpl <em>add Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.addReferenceImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getaddReference()
		 * @generated
		 */
		EClass ADD_REFERENCE = eINSTANCE.getaddReference();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteReferenceImpl <em>delete Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteReferenceImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getdeleteReference()
		 * @generated
		 */
		EClass DELETE_REFERENCE = eINSTANCE.getdeleteReference();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_REFERENCE__REF = eINSTANCE.getdeleteReference_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_REFERENCE__EXT = eINSTANCE.getdeleteReference_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeReferenceImpl <em>change Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.changeReferenceImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getchangeReference()
		 * @generated
		 */
		EClass CHANGE_REFERENCE = eINSTANCE.getchangeReference();

				/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_REFERENCE__REF = eINSTANCE.getchangeReference_Ref();

				/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_REFERENCE__EXT = eINSTANCE.getchangeReference_Ext();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterImpl <em>Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getSetter()
		 * @generated
		 */
		EClass SETTER = eINSTANCE.getSetter();

				/**
		 * The meta object literal for the '<em><b>Metafeature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER__METAFEATURE = eINSTANCE.getSetter_Metafeature();

				/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER__VALUE = eINSTANCE.getSetter_Value();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterValueImpl <em>Setter Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.SetterValueImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getSetterValue()
		 * @generated
		 */
		EClass SETTER_VALUE = eINSTANCE.getSetterValue();

				/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER_VALUE__FEATURE = eINSTANCE.getSetterValue_Feature();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.ParameterImpl
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

				/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

				/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__REF_TYPE = eINSTANCE.getParameter_RefType();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind <em>Feature Kind</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind
		 * @see it.univaq.coevolution.emftext.edelta.language.edelta.impl.EdeltaPackageImpl#getFeatureKind()
		 * @generated
		 */
    EEnum FEATURE_KIND = eINSTANCE.getFeatureKind();

  }

} //EdeltaPackage
