/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.util;

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

import org.xtext.example.mydsl.myDsl.Artifact;
import org.xtext.example.mydsl.myDsl.Attribute;
import org.xtext.example.mydsl.myDsl.DotNavigationObjDX;
import org.xtext.example.mydsl.myDsl.DotNavigationObjSX;
import org.xtext.example.mydsl.myDsl.EAttributeOpDef;
import org.xtext.example.mydsl.myDsl.EClassOpDef;
import org.xtext.example.mydsl.myDsl.EPackageOpDef;
import org.xtext.example.mydsl.myDsl.EReferenceOpDef;
import org.xtext.example.mydsl.myDsl.FilterMigrator;
import org.xtext.example.mydsl.myDsl.MigrationLibrary;
import org.xtext.example.mydsl.myDsl.MigrationProgram;
import org.xtext.example.mydsl.myDsl.Migrator;
import org.xtext.example.mydsl.myDsl.MigratorDX;
import org.xtext.example.mydsl.myDsl.MigratorSX;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.MyModel;
import org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS;
import org.xtext.example.mydsl.myDsl.OpDef;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Reference;
import org.xtext.example.mydsl.myDsl.RewritingRule;
import org.xtext.example.mydsl.myDsl.Rule;
import org.xtext.example.mydsl.myDsl.setterDef;

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
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
      case MyDslPackage.MY_MODEL:
      {
        MyModel myModel = (MyModel)theEObject;
        T result = caseMyModel(myModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MIGRATION_LIBRARY:
      {
        MigrationLibrary migrationLibrary = (MigrationLibrary)theEObject;
        T result = caseMigrationLibrary(migrationLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MIGRATION_PROGRAM:
      {
        MigrationProgram migrationProgram = (MigrationProgram)theEObject;
        T result = caseMigrationProgram(migrationProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARTIFACT:
      {
        Artifact artifact = (Artifact)theEObject;
        T result = caseArtifact(artifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OP_DEF:
      {
        OpDef opDef = (OpDef)theEObject;
        T result = caseOpDef(opDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EPACKAGE_OP_DEF:
      {
        EPackageOpDef ePackageOpDef = (EPackageOpDef)theEObject;
        T result = caseEPackageOpDef(ePackageOpDef);
        if (result == null) result = caseOpDef(ePackageOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ECLASS_OP_DEF:
      {
        EClassOpDef eClassOpDef = (EClassOpDef)theEObject;
        T result = caseEClassOpDef(eClassOpDef);
        if (result == null) result = caseOpDef(eClassOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EATTRIBUTE_OP_DEF:
      {
        EAttributeOpDef eAttributeOpDef = (EAttributeOpDef)theEObject;
        T result = caseEAttributeOpDef(eAttributeOpDef);
        if (result == null) result = caseOpDef(eAttributeOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EREFERENCE_OP_DEF:
      {
        EReferenceOpDef eReferenceOpDef = (EReferenceOpDef)theEObject;
        T result = caseEReferenceOpDef(eReferenceOpDef);
        if (result == null) result = caseOpDef(eReferenceOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SETTER_DEF:
      {
        setterDef setterDef = (setterDef)theEObject;
        T result = casesetterDef(setterDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REWRITING_RULE:
      {
        RewritingRule rewritingRule = (RewritingRule)theEObject;
        T result = caseRewritingRule(rewritingRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MIGRATOR:
      {
        Migrator migrator = (Migrator)theEObject;
        T result = caseMigrator(migrator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MIGRATOR_SX:
      {
        MigratorSX migratorSX = (MigratorSX)theEObject;
        T result = caseMigratorSX(migratorSX);
        if (result == null) result = caseMigrator(migratorSX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MIGRATOR_DX:
      {
        MigratorDX migratorDX = (MigratorDX)theEObject;
        T result = caseMigratorDX(migratorDX);
        if (result == null) result = caseMigrator(migratorDX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FILTER_MIGRATOR:
      {
        FilterMigrator filterMigrator = (FilterMigrator)theEObject;
        T result = caseFilterMigrator(filterMigrator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DOT_NAVIGATION_OBJ_SX:
      {
        DotNavigationObjSX dotNavigationObjSX = (DotNavigationObjSX)theEObject;
        T result = caseDotNavigationObjSX(dotNavigationObjSX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DOT_NAVIGATION_OBJ_DX:
      {
        DotNavigationObjDX dotNavigationObjDX = (DotNavigationObjDX)theEObject;
        T result = caseDotNavigationObjDX(dotNavigationObjDX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS:
      {
        OCLinEcoreSpecificationCS ocLinEcoreSpecificationCS = (OCLinEcoreSpecificationCS)theEObject;
        T result = caseOCLinEcoreSpecificationCS(ocLinEcoreSpecificationCS);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PACKAGE:
      {
        org.xtext.example.mydsl.myDsl.Package package_ = (org.xtext.example.mydsl.myDsl.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseEPackage(package_);
        if (result == null) result = caseENamedElement(package_);
        if (result == null) result = caseEModelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLASS:
      {
        org.xtext.example.mydsl.myDsl.Class class_ = (org.xtext.example.mydsl.myDsl.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEClass(class_);
        if (result == null) result = caseEClassifier(class_);
        if (result == null) result = caseENamedElement(class_);
        if (result == null) result = caseEModelElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATTRIBUTE:
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
      case MyDslPackage.REFERENCE:
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
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>My Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>My Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMyModel(MyModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migration Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migration Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrationLibrary(MigrationLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migration Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migration Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrationProgram(MigrationProgram object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtifact(Artifact object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Op Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Op Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpDef(OpDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage Op Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage Op Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackageOpDef(EPackageOpDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass Op Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass Op Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassOpDef(EClassOpDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Op Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Op Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributeOpDef(EAttributeOpDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EReference Op Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Op Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferenceOpDef(EReferenceOpDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>setter Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>setter Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetterDef(setterDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rewriting Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rewriting Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRewritingRule(RewritingRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migrator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migrator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrator(Migrator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migrator SX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migrator SX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigratorSX(MigratorSX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Migrator DX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Migrator DX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigratorDX(MigratorDX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Migrator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Migrator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterMigrator(FilterMigrator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dot Navigation Obj SX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dot Navigation Obj SX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDotNavigationObjSX(DotNavigationObjSX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dot Navigation Obj DX</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dot Navigation Obj DX</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDotNavigationObjDX(DotNavigationObjDX object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OC Lin Ecore Specification CS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OC Lin Ecore Specification CS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEcoreSpecificationCS(OCLinEcoreSpecificationCS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
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
  public T casePackage(org.xtext.example.mydsl.myDsl.Package object)
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
  public T caseClass(org.xtext.example.mydsl.myDsl.Class object)
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

} //MyDslSwitch
