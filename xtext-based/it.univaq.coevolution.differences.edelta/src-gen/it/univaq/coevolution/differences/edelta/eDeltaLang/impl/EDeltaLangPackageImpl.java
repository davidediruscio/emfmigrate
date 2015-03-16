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
import it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Model;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Reference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.setter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EDeltaLangPackageImpl extends EPackageImpl implements EDeltaLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ePackageOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deletePackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changePackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexOperatorDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intDefEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EDeltaLangPackageImpl()
  {
    super(eNS_URI, EDeltaLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link EDeltaLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EDeltaLangPackage init()
  {
    if (isInited) return (EDeltaLangPackage)EPackage.Registry.INSTANCE.getEPackage(EDeltaLangPackage.eNS_URI);

    // Obtain or create and register package
    EDeltaLangPackageImpl theEDeltaLangPackage = (EDeltaLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EDeltaLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EDeltaLangPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theEDeltaLangPackage.createPackageContents();

    // Initialize created meta-data
    theEDeltaLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEDeltaLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EDeltaLangPackage.eNS_URI, theEDeltaLangPackage);
    return theEDeltaLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Packages()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEPackageOperation()
  {
    return ePackageOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOperation_Var()
  {
    return (EReference)ePackageOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOperation_Op()
  {
    return (EReference)ePackageOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOperation_Setters()
  {
    return (EReference)ePackageOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOperation_Classes()
  {
    return (EReference)ePackageOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOperation_Complex()
  {
    return (EReference)ePackageOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeletePackage()
  {
    return deletePackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeletePackage_Ref()
  {
    return (EReference)deletePackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddPackage()
  {
    return addPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddPackage_New()
  {
    return (EAttribute)addPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddPackage_Ref()
  {
    return (EReference)addPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangePackage()
  {
    return changePackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangePackage_Ref()
  {
    return (EReference)changePackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClassOperation()
  {
    return eClassOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_Var()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_Op()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_Setters()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_Attributes()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_References()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOperation_Complex()
  {
    return (EReference)eClassOperationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeClass()
  {
    return changeClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChangeClass_Op()
  {
    return (EAttribute)changeClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeClass_Ref()
  {
    return (EReference)changeClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddClass()
  {
    return addClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddClass_Op()
  {
    return (EAttribute)addClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddClass_New()
  {
    return (EAttribute)addClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddClass_Ref()
  {
    return (EReference)addClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteClass()
  {
    return deleteClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeleteClass_Op()
  {
    return (EAttribute)deleteClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteClass_Ref()
  {
    return (EReference)deleteClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetter()
  {
    return setterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsetter_Metafeature()
  {
    return (EReference)setterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetter_Operator()
  {
    return (EAttribute)setterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetter_Value()
  {
    return (EAttribute)setterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetter_Card()
  {
    return (EAttribute)setterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsetter_ValueRef()
  {
    return (EReference)setterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEAttributeOperation()
  {
    return eAttributeOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOperation_Var()
  {
    return (EReference)eAttributeOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOperation_Op()
  {
    return (EReference)eAttributeOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOperation_Setters()
  {
    return (EReference)eAttributeOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOperation_Complex()
  {
    return (EReference)eAttributeOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeAttribute()
  {
    return changeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChangeAttribute_Op()
  {
    return (EAttribute)changeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeAttribute_Ref()
  {
    return (EReference)changeAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddAttribute()
  {
    return addAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddAttribute_Op()
  {
    return (EAttribute)addAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddAttribute_New()
  {
    return (EAttribute)addAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddAttribute_Ref()
  {
    return (EReference)addAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteAttribute()
  {
    return deleteAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeleteAttribute_Op()
  {
    return (EAttribute)deleteAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteAttribute_Ref()
  {
    return (EReference)deleteAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEReferenceOperation()
  {
    return eReferenceOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOperation_Var()
  {
    return (EReference)eReferenceOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOperation_Op()
  {
    return (EReference)eReferenceOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOperation_Setters()
  {
    return (EReference)eReferenceOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOperation_Complex()
  {
    return (EReference)eReferenceOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChangeReference()
  {
    return changeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChangeReference_Op()
  {
    return (EAttribute)changeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChangeReference_Ref()
  {
    return (EReference)changeReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddReference()
  {
    return addReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddReference_Op()
  {
    return (EAttribute)addReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddReference_New()
  {
    return (EAttribute)addReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAddReference_Ref()
  {
    return (EReference)addReferenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeleteReference()
  {
    return deleteReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeleteReference_Op()
  {
    return (EAttribute)deleteReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeleteReference_Ref()
  {
    return (EReference)deleteReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexOperatorDef()
  {
    return complexOperatorDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexOperatorDef_Name()
  {
    return (EAttribute)complexOperatorDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperatorDef_Params()
  {
    return (EReference)complexOperatorDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperatorDef_PackageOperations()
  {
    return (EReference)complexOperatorDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperatorDef_ClassOperations()
  {
    return (EReference)complexOperatorDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperatorDef_AttributeOperations()
  {
    return (EReference)complexOperatorDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperatorDef_ReferenceOperations()
  {
    return (EReference)complexOperatorDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexOperator()
  {
    return complexOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_Ref()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_Args()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexOperator_New()
  {
    return (EAttribute)complexOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBOOL()
  {
    return boolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTRING()
  {
    return stringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTRING_Name()
  {
    return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINT()
  {
    return intEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanDef()
  {
    return booleanDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanDef_Name()
  {
    return (EAttribute)booleanDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntDef()
  {
    return intDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntDef_Name()
  {
    return (EAttribute)intDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeltaLangFactory getEDeltaLangFactory()
  {
    return (EDeltaLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGES);

    ePackageOperationEClass = createEClass(EPACKAGE_OPERATION);
    createEReference(ePackageOperationEClass, EPACKAGE_OPERATION__VAR);
    createEReference(ePackageOperationEClass, EPACKAGE_OPERATION__OP);
    createEReference(ePackageOperationEClass, EPACKAGE_OPERATION__SETTERS);
    createEReference(ePackageOperationEClass, EPACKAGE_OPERATION__CLASSES);
    createEReference(ePackageOperationEClass, EPACKAGE_OPERATION__COMPLEX);

    deletePackageEClass = createEClass(DELETE_PACKAGE);
    createEReference(deletePackageEClass, DELETE_PACKAGE__REF);

    addPackageEClass = createEClass(ADD_PACKAGE);
    createEAttribute(addPackageEClass, ADD_PACKAGE__NEW);
    createEReference(addPackageEClass, ADD_PACKAGE__REF);

    changePackageEClass = createEClass(CHANGE_PACKAGE);
    createEReference(changePackageEClass, CHANGE_PACKAGE__REF);

    eClassOperationEClass = createEClass(ECLASS_OPERATION);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__VAR);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__OP);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__SETTERS);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__ATTRIBUTES);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__REFERENCES);
    createEReference(eClassOperationEClass, ECLASS_OPERATION__COMPLEX);

    changeClassEClass = createEClass(CHANGE_CLASS);
    createEAttribute(changeClassEClass, CHANGE_CLASS__OP);
    createEReference(changeClassEClass, CHANGE_CLASS__REF);

    addClassEClass = createEClass(ADD_CLASS);
    createEAttribute(addClassEClass, ADD_CLASS__OP);
    createEAttribute(addClassEClass, ADD_CLASS__NEW);
    createEReference(addClassEClass, ADD_CLASS__REF);

    deleteClassEClass = createEClass(DELETE_CLASS);
    createEAttribute(deleteClassEClass, DELETE_CLASS__OP);
    createEReference(deleteClassEClass, DELETE_CLASS__REF);

    setterEClass = createEClass(SETTER);
    createEReference(setterEClass, SETTER__METAFEATURE);
    createEAttribute(setterEClass, SETTER__OPERATOR);
    createEAttribute(setterEClass, SETTER__VALUE);
    createEAttribute(setterEClass, SETTER__CARD);
    createEReference(setterEClass, SETTER__VALUE_REF);

    eAttributeOperationEClass = createEClass(EATTRIBUTE_OPERATION);
    createEReference(eAttributeOperationEClass, EATTRIBUTE_OPERATION__VAR);
    createEReference(eAttributeOperationEClass, EATTRIBUTE_OPERATION__OP);
    createEReference(eAttributeOperationEClass, EATTRIBUTE_OPERATION__SETTERS);
    createEReference(eAttributeOperationEClass, EATTRIBUTE_OPERATION__COMPLEX);

    changeAttributeEClass = createEClass(CHANGE_ATTRIBUTE);
    createEAttribute(changeAttributeEClass, CHANGE_ATTRIBUTE__OP);
    createEReference(changeAttributeEClass, CHANGE_ATTRIBUTE__REF);

    addAttributeEClass = createEClass(ADD_ATTRIBUTE);
    createEAttribute(addAttributeEClass, ADD_ATTRIBUTE__OP);
    createEAttribute(addAttributeEClass, ADD_ATTRIBUTE__NEW);
    createEReference(addAttributeEClass, ADD_ATTRIBUTE__REF);

    deleteAttributeEClass = createEClass(DELETE_ATTRIBUTE);
    createEAttribute(deleteAttributeEClass, DELETE_ATTRIBUTE__OP);
    createEReference(deleteAttributeEClass, DELETE_ATTRIBUTE__REF);

    eReferenceOperationEClass = createEClass(EREFERENCE_OPERATION);
    createEReference(eReferenceOperationEClass, EREFERENCE_OPERATION__VAR);
    createEReference(eReferenceOperationEClass, EREFERENCE_OPERATION__OP);
    createEReference(eReferenceOperationEClass, EREFERENCE_OPERATION__SETTERS);
    createEReference(eReferenceOperationEClass, EREFERENCE_OPERATION__COMPLEX);

    changeReferenceEClass = createEClass(CHANGE_REFERENCE);
    createEAttribute(changeReferenceEClass, CHANGE_REFERENCE__OP);
    createEReference(changeReferenceEClass, CHANGE_REFERENCE__REF);

    addReferenceEClass = createEClass(ADD_REFERENCE);
    createEAttribute(addReferenceEClass, ADD_REFERENCE__OP);
    createEAttribute(addReferenceEClass, ADD_REFERENCE__NEW);
    createEReference(addReferenceEClass, ADD_REFERENCE__REF);

    deleteReferenceEClass = createEClass(DELETE_REFERENCE);
    createEAttribute(deleteReferenceEClass, DELETE_REFERENCE__OP);
    createEReference(deleteReferenceEClass, DELETE_REFERENCE__REF);

    complexOperatorDefEClass = createEClass(COMPLEX_OPERATOR_DEF);
    createEAttribute(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__NAME);
    createEReference(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__PARAMS);
    createEReference(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS);
    createEReference(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS);
    createEReference(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS);
    createEReference(complexOperatorDefEClass, COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS);

    complexOperatorEClass = createEClass(COMPLEX_OPERATOR);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__REF);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__ARGS);
    createEAttribute(complexOperatorEClass, COMPLEX_OPERATOR__NEW);

    boolEClass = createEClass(BOOL);

    stringEClass = createEClass(STRING);
    createEAttribute(stringEClass, STRING__NAME);

    intEClass = createEClass(INT);

    packageEClass = createEClass(PACKAGE);

    classEClass = createEClass(CLASS);

    attributeEClass = createEClass(ATTRIBUTE);

    referenceEClass = createEClass(REFERENCE);

    booleanDefEClass = createEClass(BOOLEAN_DEF);
    createEAttribute(booleanDefEClass, BOOLEAN_DEF__NAME);

    intDefEClass = createEClass(INT_DEF);
    createEAttribute(intDefEClass, INT_DEF__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    packageEClass.getESuperTypes().add(ecorePackage.getEPackage());
    classEClass.getESuperTypes().add(ecorePackage.getEClass());
    attributeEClass.getESuperTypes().add(ecorePackage.getEAttribute());
    referenceEClass.getESuperTypes().add(ecorePackage.getEReference());
    booleanDefEClass.getESuperTypes().add(this.getBOOL());
    intDefEClass.getESuperTypes().add(this.getINT());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Packages(), ecorePackage.getEObject(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ePackageOperationEClass, EPackageOperation.class, "EPackageOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEPackageOperation_Var(), ecorePackage.getEPackage(), null, "var", null, 0, 1, EPackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOperation_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, EPackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOperation_Setters(), this.getsetter(), null, "setters", null, 0, -1, EPackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOperation_Classes(), this.getEClassOperation(), null, "classes", null, 0, -1, EPackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOperation_Complex(), this.getComplexOperator(), null, "complex", null, 0, -1, EPackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deletePackageEClass, DeletePackage.class, "DeletePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeletePackage_Ref(), ecorePackage.getEPackage(), null, "ref", null, 0, 1, DeletePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addPackageEClass, AddPackage.class, "AddPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddPackage_New(), ecorePackage.getEString(), "new", null, 0, 1, AddPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddPackage_Ref(), this.getSTRING(), null, "ref", null, 0, 1, AddPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changePackageEClass, ChangePackage.class, "ChangePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChangePackage_Ref(), ecorePackage.getEPackage(), null, "ref", null, 0, 1, ChangePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eClassOperationEClass, EClassOperation.class, "EClassOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEClassOperation_Var(), ecorePackage.getEClass(), null, "var", null, 0, 1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOperation_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOperation_Setters(), this.getsetter(), null, "setters", null, 0, -1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOperation_Attributes(), this.getEAttributeOperation(), null, "attributes", null, 0, -1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOperation_References(), this.getEReferenceOperation(), null, "references", null, 0, -1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOperation_Complex(), this.getComplexOperator(), null, "complex", null, 0, -1, EClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeClassEClass, ChangeClass.class, "ChangeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChangeClass_Op(), ecorePackage.getEString(), "op", null, 0, 1, ChangeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeClass_Ref(), ecorePackage.getEClass(), null, "ref", null, 0, 1, ChangeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addClassEClass, AddClass.class, "AddClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddClass_Op(), ecorePackage.getEString(), "op", null, 0, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddClass_New(), ecorePackage.getEString(), "new", null, 0, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddClass_Ref(), this.getSTRING(), null, "ref", null, 0, 1, AddClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteClassEClass, DeleteClass.class, "DeleteClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteClass_Op(), ecorePackage.getEString(), "op", null, 0, 1, DeleteClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteClass_Ref(), ecorePackage.getEClass(), null, "ref", null, 0, 1, DeleteClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setterEClass, setter.class, "setter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsetter_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetter_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetter_Value(), ecorePackage.getEString(), "value", null, 0, 1, setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetter_Card(), ecorePackage.getEInt(), "card", null, 0, 1, setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsetter_ValueRef(), ecorePackage.getEObject(), null, "valueRef", null, 0, -1, setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eAttributeOperationEClass, EAttributeOperation.class, "EAttributeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEAttributeOperation_Var(), ecorePackage.getEAttribute(), null, "var", null, 0, 1, EAttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttributeOperation_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, EAttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttributeOperation_Setters(), this.getsetter(), null, "setters", null, 0, -1, EAttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttributeOperation_Complex(), this.getComplexOperator(), null, "complex", null, 0, -1, EAttributeOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeAttributeEClass, ChangeAttribute.class, "ChangeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChangeAttribute_Op(), ecorePackage.getEString(), "op", null, 0, 1, ChangeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeAttribute_Ref(), ecorePackage.getEAttribute(), null, "ref", null, 0, 1, ChangeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addAttributeEClass, AddAttribute.class, "AddAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddAttribute_Op(), ecorePackage.getEString(), "op", null, 0, 1, AddAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddAttribute_New(), ecorePackage.getEString(), "new", null, 0, 1, AddAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddAttribute_Ref(), this.getSTRING(), null, "ref", null, 0, 1, AddAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteAttributeEClass, DeleteAttribute.class, "DeleteAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteAttribute_Op(), ecorePackage.getEString(), "op", null, 0, 1, DeleteAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteAttribute_Ref(), ecorePackage.getEAttribute(), null, "ref", null, 0, 1, DeleteAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eReferenceOperationEClass, EReferenceOperation.class, "EReferenceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEReferenceOperation_Var(), ecorePackage.getEReference(), null, "var", null, 0, 1, EReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEReferenceOperation_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, EReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEReferenceOperation_Setters(), this.getsetter(), null, "setters", null, 0, -1, EReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEReferenceOperation_Complex(), this.getComplexOperator(), null, "complex", null, 0, -1, EReferenceOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeReferenceEClass, ChangeReference.class, "ChangeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChangeReference_Op(), ecorePackage.getEString(), "op", null, 0, 1, ChangeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getChangeReference_Ref(), ecorePackage.getEReference(), null, "ref", null, 0, 1, ChangeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addReferenceEClass, AddReference.class, "AddReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddReference_Op(), ecorePackage.getEString(), "op", null, 0, 1, AddReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAddReference_New(), ecorePackage.getEString(), "new", null, 0, 1, AddReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAddReference_Ref(), this.getSTRING(), null, "ref", null, 0, 1, AddReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteReferenceEClass, DeleteReference.class, "DeleteReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeleteReference_Op(), ecorePackage.getEString(), "op", null, 0, 1, DeleteReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeleteReference_Ref(), ecorePackage.getEReference(), null, "ref", null, 0, 1, DeleteReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexOperatorDefEClass, ComplexOperatorDef.class, "ComplexOperatorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexOperatorDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperatorDef_Params(), ecorePackage.getEObject(), null, "params", null, 0, -1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperatorDef_PackageOperations(), this.getEPackageOperation(), null, "packageOperations", null, 0, -1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperatorDef_ClassOperations(), this.getEClassOperation(), null, "classOperations", null, 0, -1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperatorDef_AttributeOperations(), this.getEAttributeOperation(), null, "attributeOperations", null, 0, -1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperatorDef_ReferenceOperations(), this.getEReferenceOperation(), null, "referenceOperations", null, 0, -1, ComplexOperatorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexOperatorEClass, ComplexOperator.class, "ComplexOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexOperator_Ref(), this.getComplexOperatorDef(), null, "ref", null, 0, 1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperator_Args(), ecorePackage.getEObject(), null, "args", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComplexOperator_New(), ecorePackage.getEString(), "new", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(boolEClass, it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL.class, "BOOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringEClass, it.univaq.coevolution.differences.edelta.eDeltaLang.STRING.class, "STRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSTRING_Name(), ecorePackage.getEString(), "name", null, 0, 1, it.univaq.coevolution.differences.edelta.eDeltaLang.STRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intEClass, it.univaq.coevolution.differences.edelta.eDeltaLang.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packageEClass, it.univaq.coevolution.differences.edelta.eDeltaLang.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, it.univaq.coevolution.differences.edelta.eDeltaLang.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanDefEClass, BooleanDef.class, "BooleanDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, BooleanDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intDefEClass, IntDef.class, "IntDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntDef_Name(), ecorePackage.getEString(), "name", null, 0, 1, IntDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EDeltaLangPackageImpl
