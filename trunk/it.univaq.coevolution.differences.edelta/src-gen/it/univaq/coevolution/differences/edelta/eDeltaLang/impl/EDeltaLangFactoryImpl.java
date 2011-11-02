/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute;
import it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass;
import it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Attribute;
import it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL;
import it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute;
import it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass;
import it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangFactory;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.INT;
import it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Model;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Reference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.STRING;
import it.univaq.coevolution.differences.edelta.eDeltaLang.setter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDeltaLangFactoryImpl extends EFactoryImpl implements EDeltaLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EDeltaLangFactory init()
  {
    try
    {
      EDeltaLangFactory theEDeltaLangFactory = (EDeltaLangFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univaq.it/coevolution/differences/edelta/EDeltaLang"); 
      if (theEDeltaLangFactory != null)
      {
        return theEDeltaLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EDeltaLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeltaLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EDeltaLangPackage.MODEL: return createModel();
      case EDeltaLangPackage.EPACKAGE_OPERATION: return createEPackageOperation();
      case EDeltaLangPackage.DELETE_PACKAGE: return createDeletePackage();
      case EDeltaLangPackage.ADD_PACKAGE: return createAddPackage();
      case EDeltaLangPackage.CHANGE_PACKAGE: return createChangePackage();
      case EDeltaLangPackage.ECLASS_OPERATION: return createEClassOperation();
      case EDeltaLangPackage.CHANGE_CLASS: return createChangeClass();
      case EDeltaLangPackage.ADD_CLASS: return createAddClass();
      case EDeltaLangPackage.DELETE_CLASS: return createDeleteClass();
      case EDeltaLangPackage.SETTER: return createsetter();
      case EDeltaLangPackage.EATTRIBUTE_OPERATION: return createEAttributeOperation();
      case EDeltaLangPackage.CHANGE_ATTRIBUTE: return createChangeAttribute();
      case EDeltaLangPackage.ADD_ATTRIBUTE: return createAddAttribute();
      case EDeltaLangPackage.DELETE_ATTRIBUTE: return createDeleteAttribute();
      case EDeltaLangPackage.EREFERENCE_OPERATION: return createEReferenceOperation();
      case EDeltaLangPackage.CHANGE_REFERENCE: return createChangeReference();
      case EDeltaLangPackage.ADD_REFERENCE: return createAddReference();
      case EDeltaLangPackage.DELETE_REFERENCE: return createDeleteReference();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF: return createComplexOperatorDef();
      case EDeltaLangPackage.COMPLEX_OPERATOR: return createComplexOperator();
      case EDeltaLangPackage.BOOL: return createBOOL();
      case EDeltaLangPackage.STRING: return createSTRING();
      case EDeltaLangPackage.INT: return createINT();
      case EDeltaLangPackage.PACKAGE: return createPackage();
      case EDeltaLangPackage.CLASS: return createClass();
      case EDeltaLangPackage.ATTRIBUTE: return createAttribute();
      case EDeltaLangPackage.REFERENCE: return createReference();
      case EDeltaLangPackage.BOOLEAN_DEF: return createBooleanDef();
      case EDeltaLangPackage.INT_DEF: return createIntDef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackageOperation createEPackageOperation()
  {
    EPackageOperationImpl ePackageOperation = new EPackageOperationImpl();
    return ePackageOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeletePackage createDeletePackage()
  {
    DeletePackageImpl deletePackage = new DeletePackageImpl();
    return deletePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddPackage createAddPackage()
  {
    AddPackageImpl addPackage = new AddPackageImpl();
    return addPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangePackage createChangePackage()
  {
    ChangePackageImpl changePackage = new ChangePackageImpl();
    return changePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassOperation createEClassOperation()
  {
    EClassOperationImpl eClassOperation = new EClassOperationImpl();
    return eClassOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeClass createChangeClass()
  {
    ChangeClassImpl changeClass = new ChangeClassImpl();
    return changeClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddClass createAddClass()
  {
    AddClassImpl addClass = new AddClassImpl();
    return addClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteClass createDeleteClass()
  {
    DeleteClassImpl deleteClass = new DeleteClassImpl();
    return deleteClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setter createsetter()
  {
    setterImpl setter = new setterImpl();
    return setter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributeOperation createEAttributeOperation()
  {
    EAttributeOperationImpl eAttributeOperation = new EAttributeOperationImpl();
    return eAttributeOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeAttribute createChangeAttribute()
  {
    ChangeAttributeImpl changeAttribute = new ChangeAttributeImpl();
    return changeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddAttribute createAddAttribute()
  {
    AddAttributeImpl addAttribute = new AddAttributeImpl();
    return addAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteAttribute createDeleteAttribute()
  {
    DeleteAttributeImpl deleteAttribute = new DeleteAttributeImpl();
    return deleteAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReferenceOperation createEReferenceOperation()
  {
    EReferenceOperationImpl eReferenceOperation = new EReferenceOperationImpl();
    return eReferenceOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeReference createChangeReference()
  {
    ChangeReferenceImpl changeReference = new ChangeReferenceImpl();
    return changeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddReference createAddReference()
  {
    AddReferenceImpl addReference = new AddReferenceImpl();
    return addReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeleteReference createDeleteReference()
  {
    DeleteReferenceImpl deleteReference = new DeleteReferenceImpl();
    return deleteReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperatorDef createComplexOperatorDef()
  {
    ComplexOperatorDefImpl complexOperatorDef = new ComplexOperatorDefImpl();
    return complexOperatorDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperator createComplexOperator()
  {
    ComplexOperatorImpl complexOperator = new ComplexOperatorImpl();
    return complexOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOL createBOOL()
  {
    BOOLImpl bool = new BOOLImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INT createINT()
  {
    INTImpl int_ = new INTImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.univaq.coevolution.differences.edelta.eDeltaLang.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.univaq.coevolution.differences.edelta.eDeltaLang.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanDef createBooleanDef()
  {
    BooleanDefImpl booleanDef = new BooleanDefImpl();
    return booleanDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntDef createIntDef()
  {
    IntDefImpl intDef = new IntDefImpl();
    return intDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeltaLangPackage getEDeltaLangPackage()
  {
    return (EDeltaLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EDeltaLangPackage getPackage()
  {
    return EDeltaLangPackage.eINSTANCE;
  }

} //EDeltaLangFactoryImpl
