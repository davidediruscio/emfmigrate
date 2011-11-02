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

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage
 * @generated
 */
public class EDeltaLangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EDeltaLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDeltaLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EDeltaLangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EDeltaLangPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.EPACKAGE_OPERATION:
      {
        EPackageOperation ePackageOperation = (EPackageOperation)theEObject;
        T result = caseEPackageOperation(ePackageOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.DELETE_PACKAGE:
      {
        DeletePackage deletePackage = (DeletePackage)theEObject;
        T result = caseDeletePackage(deletePackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ADD_PACKAGE:
      {
        AddPackage addPackage = (AddPackage)theEObject;
        T result = caseAddPackage(addPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.CHANGE_PACKAGE:
      {
        ChangePackage changePackage = (ChangePackage)theEObject;
        T result = caseChangePackage(changePackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ECLASS_OPERATION:
      {
        EClassOperation eClassOperation = (EClassOperation)theEObject;
        T result = caseEClassOperation(eClassOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.CHANGE_CLASS:
      {
        ChangeClass changeClass = (ChangeClass)theEObject;
        T result = caseChangeClass(changeClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ADD_CLASS:
      {
        AddClass addClass = (AddClass)theEObject;
        T result = caseAddClass(addClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.DELETE_CLASS:
      {
        DeleteClass deleteClass = (DeleteClass)theEObject;
        T result = caseDeleteClass(deleteClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.SETTER:
      {
        setter setter = (setter)theEObject;
        T result = casesetter(setter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.EATTRIBUTE_OPERATION:
      {
        EAttributeOperation eAttributeOperation = (EAttributeOperation)theEObject;
        T result = caseEAttributeOperation(eAttributeOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.CHANGE_ATTRIBUTE:
      {
        ChangeAttribute changeAttribute = (ChangeAttribute)theEObject;
        T result = caseChangeAttribute(changeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ADD_ATTRIBUTE:
      {
        AddAttribute addAttribute = (AddAttribute)theEObject;
        T result = caseAddAttribute(addAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.DELETE_ATTRIBUTE:
      {
        DeleteAttribute deleteAttribute = (DeleteAttribute)theEObject;
        T result = caseDeleteAttribute(deleteAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.EREFERENCE_OPERATION:
      {
        EReferenceOperation eReferenceOperation = (EReferenceOperation)theEObject;
        T result = caseEReferenceOperation(eReferenceOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.CHANGE_REFERENCE:
      {
        ChangeReference changeReference = (ChangeReference)theEObject;
        T result = caseChangeReference(changeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ADD_REFERENCE:
      {
        AddReference addReference = (AddReference)theEObject;
        T result = caseAddReference(addReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.DELETE_REFERENCE:
      {
        DeleteReference deleteReference = (DeleteReference)theEObject;
        T result = caseDeleteReference(deleteReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF:
      {
        ComplexOperatorDef complexOperatorDef = (ComplexOperatorDef)theEObject;
        T result = caseComplexOperatorDef(complexOperatorDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.COMPLEX_OPERATOR:
      {
        ComplexOperator complexOperator = (ComplexOperator)theEObject;
        T result = caseComplexOperator(complexOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.BOOL:
      {
        BOOL bool = (BOOL)theEObject;
        T result = caseBOOL(bool);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.STRING:
      {
        STRING string = (STRING)theEObject;
        T result = caseSTRING(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.INT:
      {
        INT int_ = (INT)theEObject;
        T result = caseINT(int_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.PACKAGE:
      {
        it.univaq.coevolution.differences.edelta.eDeltaLang.Package package_ = (it.univaq.coevolution.differences.edelta.eDeltaLang.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseEPackage(package_);
        if (result == null) result = caseENamedElement(package_);
        if (result == null) result = caseEModelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.CLASS:
      {
        it.univaq.coevolution.differences.edelta.eDeltaLang.Class class_ = (it.univaq.coevolution.differences.edelta.eDeltaLang.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEClass(class_);
        if (result == null) result = caseEClassifier(class_);
        if (result == null) result = caseENamedElement(class_);
        if (result == null) result = caseEModelElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseEAttribute(attribute);
        if (result == null) result = caseEStructuralFeature(attribute);
        if (result == null) result = caseETypedElement(attribute);
        if (result == null) result = caseENamedElement(attribute);
        if (result == null) result = caseEModelElement(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseEReference(reference);
        if (result == null) result = caseEStructuralFeature(reference);
        if (result == null) result = caseETypedElement(reference);
        if (result == null) result = caseENamedElement(reference);
        if (result == null) result = caseEModelElement(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.BOOLEAN_DEF:
      {
        BooleanDef booleanDef = (BooleanDef)theEObject;
        T result = caseBooleanDef(booleanDef);
        if (result == null) result = caseBOOL(booleanDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EDeltaLangPackage.INT_DEF:
      {
        IntDef intDef = (IntDef)theEObject;
        T result = caseIntDef(intDef);
        if (result == null) result = caseINT(intDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackageOperation(EPackageOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeletePackage(DeletePackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddPackage(AddPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangePackage(ChangePackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassOperation(EClassOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeClass(ChangeClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddClass(AddClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteClass(DeleteClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>setter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>setter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetter(setter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeOperation(EAttributeOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeAttribute(ChangeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddAttribute(AddAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteAttribute(DeleteAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceOperation(EReferenceOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Change Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Change Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChangeReference(ChangeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddReference(AddReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteReference(DeleteReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Operator Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Operator Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexOperatorDef(ComplexOperatorDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexOperator(ComplexOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBOOL(BOOL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STRING</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STRING</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSTRING(STRING object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>INT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseINT(INT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(it.univaq.coevolution.differences.edelta.eDeltaLang.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(it.univaq.coevolution.differences.edelta.eDeltaLang.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanDef(BooleanDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntDef(IntDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEModelElement(EModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseENamedElement(ENamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackage(EPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClassifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClassifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassifier(EClassifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClass(EClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseETypedElement(ETypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EStructural Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEStructuralFeature(EStructuralFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttribute(EAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReference(EReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EDeltaLangSwitch
