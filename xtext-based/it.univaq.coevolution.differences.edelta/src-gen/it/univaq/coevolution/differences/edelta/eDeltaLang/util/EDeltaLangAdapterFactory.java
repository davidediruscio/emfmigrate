/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.util;

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
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.INT;
import it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Model;
import it.univaq.coevolution.differences.edelta.eDeltaLang.Reference;
import it.univaq.coevolution.differences.edelta.eDeltaLang.STRING;
import it.univaq.coevolution.differences.edelta.eDeltaLang.setter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage
 * @generated
 */
public class EDeltaLangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EDeltaLangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeltaLangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EDeltaLangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EDeltaLangSwitch<Adapter> modelSwitch =
    new EDeltaLangSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEPackageOperation(EPackageOperation object)
      {
        return createEPackageOperationAdapter();
      }
      @Override
      public Adapter caseDeletePackage(DeletePackage object)
      {
        return createDeletePackageAdapter();
      }
      @Override
      public Adapter caseAddPackage(AddPackage object)
      {
        return createAddPackageAdapter();
      }
      @Override
      public Adapter caseChangePackage(ChangePackage object)
      {
        return createChangePackageAdapter();
      }
      @Override
      public Adapter caseEClassOperation(EClassOperation object)
      {
        return createEClassOperationAdapter();
      }
      @Override
      public Adapter caseChangeClass(ChangeClass object)
      {
        return createChangeClassAdapter();
      }
      @Override
      public Adapter caseAddClass(AddClass object)
      {
        return createAddClassAdapter();
      }
      @Override
      public Adapter caseDeleteClass(DeleteClass object)
      {
        return createDeleteClassAdapter();
      }
      @Override
      public Adapter casesetter(setter object)
      {
        return createsetterAdapter();
      }
      @Override
      public Adapter caseEAttributeOperation(EAttributeOperation object)
      {
        return createEAttributeOperationAdapter();
      }
      @Override
      public Adapter caseChangeAttribute(ChangeAttribute object)
      {
        return createChangeAttributeAdapter();
      }
      @Override
      public Adapter caseAddAttribute(AddAttribute object)
      {
        return createAddAttributeAdapter();
      }
      @Override
      public Adapter caseDeleteAttribute(DeleteAttribute object)
      {
        return createDeleteAttributeAdapter();
      }
      @Override
      public Adapter caseEReferenceOperation(EReferenceOperation object)
      {
        return createEReferenceOperationAdapter();
      }
      @Override
      public Adapter caseChangeReference(ChangeReference object)
      {
        return createChangeReferenceAdapter();
      }
      @Override
      public Adapter caseAddReference(AddReference object)
      {
        return createAddReferenceAdapter();
      }
      @Override
      public Adapter caseDeleteReference(DeleteReference object)
      {
        return createDeleteReferenceAdapter();
      }
      @Override
      public Adapter caseComplexOperatorDef(ComplexOperatorDef object)
      {
        return createComplexOperatorDefAdapter();
      }
      @Override
      public Adapter caseComplexOperator(ComplexOperator object)
      {
        return createComplexOperatorAdapter();
      }
      @Override
      public Adapter caseBOOL(BOOL object)
      {
        return createBOOLAdapter();
      }
      @Override
      public Adapter caseSTRING(STRING object)
      {
        return createSTRINGAdapter();
      }
      @Override
      public Adapter caseINT(INT object)
      {
        return createINTAdapter();
      }
      @Override
      public Adapter casePackage(it.univaq.coevolution.differences.edelta.eDeltaLang.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseClass(it.univaq.coevolution.differences.edelta.eDeltaLang.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseBooleanDef(BooleanDef object)
      {
        return createBooleanDefAdapter();
      }
      @Override
      public Adapter caseIntDef(IntDef object)
      {
        return createIntDefAdapter();
      }
      @Override
      public Adapter caseEModelElement(EModelElement object)
      {
        return createEModelElementAdapter();
      }
      @Override
      public Adapter caseENamedElement(ENamedElement object)
      {
        return createENamedElementAdapter();
      }
      @Override
      public Adapter caseEPackage(EPackage object)
      {
        return createEPackageAdapter();
      }
      @Override
      public Adapter caseEClassifier(EClassifier object)
      {
        return createEClassifierAdapter();
      }
      @Override
      public Adapter caseEClass(EClass object)
      {
        return createEClassAdapter();
      }
      @Override
      public Adapter caseETypedElement(ETypedElement object)
      {
        return createETypedElementAdapter();
      }
      @Override
      public Adapter caseEStructuralFeature(EStructuralFeature object)
      {
        return createEStructuralFeatureAdapter();
      }
      @Override
      public Adapter caseEAttribute(EAttribute object)
      {
        return createEAttributeAdapter();
      }
      @Override
      public Adapter caseEReference(EReference object)
      {
        return createEReferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation <em>EPackage Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation
   * @generated
   */
  public Adapter createEPackageOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage <em>Delete Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage
   * @generated
   */
  public Adapter createDeletePackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage <em>Add Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage
   * @generated
   */
  public Adapter createAddPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage <em>Change Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangePackage
   * @generated
   */
  public Adapter createChangePackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation <em>EClass Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation
   * @generated
   */
  public Adapter createEClassOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass <em>Change Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeClass
   * @generated
   */
  public Adapter createChangeClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass <em>Add Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddClass
   * @generated
   */
  public Adapter createAddClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass <em>Delete Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteClass
   * @generated
   */
  public Adapter createDeleteClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter <em>setter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.setter
   * @generated
   */
  public Adapter createsetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation <em>EAttribute Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation
   * @generated
   */
  public Adapter createEAttributeOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute <em>Change Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeAttribute
   * @generated
   */
  public Adapter createChangeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute <em>Add Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddAttribute
   * @generated
   */
  public Adapter createAddAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute <em>Delete Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteAttribute
   * @generated
   */
  public Adapter createDeleteAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation <em>EReference Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation
   * @generated
   */
  public Adapter createEReferenceOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference <em>Change Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ChangeReference
   * @generated
   */
  public Adapter createChangeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference <em>Add Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.AddReference
   * @generated
   */
  public Adapter createAddReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference <em>Delete Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.DeleteReference
   * @generated
   */
  public Adapter createDeleteReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef <em>Complex Operator Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef
   * @generated
   */
  public Adapter createComplexOperatorDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator <em>Complex Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator
   * @generated
   */
  public Adapter createComplexOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL <em>BOOL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.BOOL
   * @generated
   */
  public Adapter createBOOLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.STRING
   * @generated
   */
  public Adapter createSTRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.INT
   * @generated
   */
  public Adapter createINTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef <em>Boolean Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.BooleanDef
   * @generated
   */
  public Adapter createBooleanDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef <em>Int Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.IntDef
   * @generated
   */
  public Adapter createIntDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EModelElement
   * @generated
   */
  public Adapter createEModelElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.ENamedElement
   * @generated
   */
  public Adapter createENamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EPackage <em>EPackage</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EPackage
   * @generated
   */
  public Adapter createEPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClassifier <em>EClassifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EClassifier
   * @generated
   */
  public Adapter createEClassifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EClass <em>EClass</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EClass
   * @generated
   */
  public Adapter createEClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.ETypedElement
   * @generated
   */
  public Adapter createETypedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EStructuralFeature <em>EStructural Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EStructuralFeature
   * @generated
   */
  public Adapter createEStructuralFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EAttribute <em>EAttribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EAttribute
   * @generated
   */
  public Adapter createEAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EReference <em>EReference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.emf.ecore.EReference
   * @generated
   */
  public Adapter createEReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EDeltaLangAdapterFactory
