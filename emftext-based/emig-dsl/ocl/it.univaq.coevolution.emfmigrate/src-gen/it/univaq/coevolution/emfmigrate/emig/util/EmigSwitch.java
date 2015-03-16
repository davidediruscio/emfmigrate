/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.util;

import OCLinEmig.CollectionExp;
import OCLinEmig.LocatedElement;
import OCLinEmig.OclExpression;

import it.univaq.coevolution.emfmigrate.emig.Artifact;
import it.univaq.coevolution.emfmigrate.emig.Attribute;
import it.univaq.coevolution.emfmigrate.emig.BagExp;
import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX;
import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX;
import it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef;
import it.univaq.coevolution.emfmigrate.emig.EClassOpDef;
import it.univaq.coevolution.emfmigrate.emig.EPackageOpDef;
import it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef;
import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.FilterMigrator;
import it.univaq.coevolution.emfmigrate.emig.MapExp;
import it.univaq.coevolution.emfmigrate.emig.MigrationLibrary;
import it.univaq.coevolution.emfmigrate.emig.MigrationProgram;
import it.univaq.coevolution.emfmigrate.emig.Migrator;
import it.univaq.coevolution.emfmigrate.emig.MigratorDX;
import it.univaq.coevolution.emfmigrate.emig.MigratorSX;
import it.univaq.coevolution.emfmigrate.emig.MyModel;
import it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp;
import it.univaq.coevolution.emfmigrate.emig.OclUndefinedExp;
import it.univaq.coevolution.emfmigrate.emig.OpDef;
import it.univaq.coevolution.emfmigrate.emig.OrderedSetExp;
import it.univaq.coevolution.emfmigrate.emig.Parameter;
import it.univaq.coevolution.emfmigrate.emig.Reference;
import it.univaq.coevolution.emfmigrate.emig.RewritingRule;
import it.univaq.coevolution.emfmigrate.emig.Rule;
import it.univaq.coevolution.emfmigrate.emig.SequenceExp;
import it.univaq.coevolution.emfmigrate.emig.SetExp;
import it.univaq.coevolution.emfmigrate.emig.SuperExp;
import it.univaq.coevolution.emfmigrate.emig.TupleExp;
import it.univaq.coevolution.emfmigrate.emig.VariableExp;
import it.univaq.coevolution.emfmigrate.emig.setterDef;

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
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage
 * @generated
 */
public class EmigSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmigPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmigSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EmigPackage.eINSTANCE;
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
      case EmigPackage.MY_MODEL:
      {
        MyModel myModel = (MyModel)theEObject;
        T result = caseMyModel(myModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MIGRATION_LIBRARY:
      {
        MigrationLibrary migrationLibrary = (MigrationLibrary)theEObject;
        T result = caseMigrationLibrary(migrationLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MIGRATION_PROGRAM:
      {
        MigrationProgram migrationProgram = (MigrationProgram)theEObject;
        T result = caseMigrationProgram(migrationProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.ARTIFACT:
      {
        Artifact artifact = (Artifact)theEObject;
        T result = caseArtifact(artifact);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.OP_DEF:
      {
        OpDef opDef = (OpDef)theEObject;
        T result = caseOpDef(opDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.EPACKAGE_OP_DEF:
      {
        EPackageOpDef ePackageOpDef = (EPackageOpDef)theEObject;
        T result = caseEPackageOpDef(ePackageOpDef);
        if (result == null) result = caseOpDef(ePackageOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.ECLASS_OP_DEF:
      {
        EClassOpDef eClassOpDef = (EClassOpDef)theEObject;
        T result = caseEClassOpDef(eClassOpDef);
        if (result == null) result = caseOpDef(eClassOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.EATTRIBUTE_OP_DEF:
      {
        EAttributeOpDef eAttributeOpDef = (EAttributeOpDef)theEObject;
        T result = caseEAttributeOpDef(eAttributeOpDef);
        if (result == null) result = caseOpDef(eAttributeOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.EREFERENCE_OP_DEF:
      {
        EReferenceOpDef eReferenceOpDef = (EReferenceOpDef)theEObject;
        T result = caseEReferenceOpDef(eReferenceOpDef);
        if (result == null) result = caseOpDef(eReferenceOpDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.SETTER_DEF:
      {
        setterDef setterDef = (setterDef)theEObject;
        T result = casesetterDef(setterDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.REWRITING_RULE:
      {
        RewritingRule rewritingRule = (RewritingRule)theEObject;
        T result = caseRewritingRule(rewritingRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MIGRATOR:
      {
        Migrator migrator = (Migrator)theEObject;
        T result = caseMigrator(migrator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MIGRATOR_SX:
      {
        MigratorSX migratorSX = (MigratorSX)theEObject;
        T result = caseMigratorSX(migratorSX);
        if (result == null) result = caseMigrator(migratorSX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MIGRATOR_DX:
      {
        MigratorDX migratorDX = (MigratorDX)theEObject;
        T result = caseMigratorDX(migratorDX);
        if (result == null) result = caseMigrator(migratorDX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.FILTER_MIGRATOR:
      {
        FilterMigrator filterMigrator = (FilterMigrator)theEObject;
        T result = caseFilterMigrator(filterMigrator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.DOT_NAVIGATION_OBJ_SX:
      {
        DotNavigationObjSX dotNavigationObjSX = (DotNavigationObjSX)theEObject;
        T result = caseDotNavigationObjSX(dotNavigationObjSX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.DOT_NAVIGATION_OBJ_DX:
      {
        DotNavigationObjDX dotNavigationObjDX = (DotNavigationObjDX)theEObject;
        T result = caseDotNavigationObjDX(dotNavigationObjDX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.PACKAGE:
      {
        it.univaq.coevolution.emfmigrate.emig.Package package_ = (it.univaq.coevolution.emfmigrate.emig.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseEPackage(package_);
        if (result == null) result = caseENamedElement(package_);
        if (result == null) result = caseEModelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.CLASS:
      {
        it.univaq.coevolution.emfmigrate.emig.Class class_ = (it.univaq.coevolution.emfmigrate.emig.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEClass(class_);
        if (result == null) result = caseEClassifier(class_);
        if (result == null) result = caseENamedElement(class_);
        if (result == null) result = caseEModelElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.ATTRIBUTE:
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
      case EmigPackage.REFERENCE:
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
      case EmigPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP:
      {
        NavigationOrAttributeCallExp navigationOrAttributeCallExp = (NavigationOrAttributeCallExp)theEObject;
        T result = caseNavigationOrAttributeCallExp(navigationOrAttributeCallExp);
        if (result == null) result = caseOclExpression(navigationOrAttributeCallExp);
        if (result == null) result = caseLocatedElement(navigationOrAttributeCallExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.VARIABLE_EXP:
      {
        VariableExp variableExp = (VariableExp)theEObject;
        T result = caseVariableExp(variableExp);
        if (result == null) result = caseOCLinEmig_VariableExp(variableExp);
        if (result == null) result = caseOclExpression(variableExp);
        if (result == null) result = caseLocatedElement(variableExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.SUPER_EXP:
      {
        SuperExp superExp = (SuperExp)theEObject;
        T result = caseSuperExp(superExp);
        if (result == null) result = caseOCLinEmig_SuperExp(superExp);
        if (result == null) result = caseOclExpression(superExp);
        if (result == null) result = caseLocatedElement(superExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.BAG_EXP:
      {
        BagExp bagExp = (BagExp)theEObject;
        T result = caseBagExp(bagExp);
        if (result == null) result = caseOCLinEmig_BagExp(bagExp);
        if (result == null) result = caseCollectionExp(bagExp);
        if (result == null) result = caseOclExpression(bagExp);
        if (result == null) result = caseLocatedElement(bagExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.ORDERED_SET_EXP:
      {
        OrderedSetExp orderedSetExp = (OrderedSetExp)theEObject;
        T result = caseOrderedSetExp(orderedSetExp);
        if (result == null) result = caseOCLinEmig_OrderedSetExp(orderedSetExp);
        if (result == null) result = caseCollectionExp(orderedSetExp);
        if (result == null) result = caseOclExpression(orderedSetExp);
        if (result == null) result = caseLocatedElement(orderedSetExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.SEQUENCE_EXP:
      {
        SequenceExp sequenceExp = (SequenceExp)theEObject;
        T result = caseSequenceExp(sequenceExp);
        if (result == null) result = caseOCLinEmig_SequenceExp(sequenceExp);
        if (result == null) result = caseCollectionExp(sequenceExp);
        if (result == null) result = caseOclExpression(sequenceExp);
        if (result == null) result = caseLocatedElement(sequenceExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.SET_EXP:
      {
        SetExp setExp = (SetExp)theEObject;
        T result = caseSetExp(setExp);
        if (result == null) result = caseOCLinEmig_SetExp(setExp);
        if (result == null) result = caseCollectionExp(setExp);
        if (result == null) result = caseOclExpression(setExp);
        if (result == null) result = caseLocatedElement(setExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.TUPLE_EXP:
      {
        TupleExp tupleExp = (TupleExp)theEObject;
        T result = caseTupleExp(tupleExp);
        if (result == null) result = caseOCLinEmig_TupleExp(tupleExp);
        if (result == null) result = caseOclExpression(tupleExp);
        if (result == null) result = caseLocatedElement(tupleExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.MAP_EXP:
      {
        MapExp mapExp = (MapExp)theEObject;
        T result = caseMapExp(mapExp);
        if (result == null) result = caseOCLinEmig_MapExp(mapExp);
        if (result == null) result = caseOclExpression(mapExp);
        if (result == null) result = caseLocatedElement(mapExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EmigPackage.OCL_UNDEFINED_EXP:
      {
        OclUndefinedExp oclUndefinedExp = (OclUndefinedExp)theEObject;
        T result = caseOclUndefinedExp(oclUndefinedExp);
        if (result == null) result = caseOCLinEmig_OclUndefinedExp(oclUndefinedExp);
        if (result == null) result = caseOclExpression(oclUndefinedExp);
        if (result == null) result = caseLocatedElement(oclUndefinedExp);
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
  public T casePackage(it.univaq.coevolution.emfmigrate.emig.Package object)
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
  public T caseClass(it.univaq.coevolution.emfmigrate.emig.Class object)
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
   * Returns the result of interpreting the object as an instance of '<em>Navigation Or Attribute Call Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Navigation Or Attribute Call Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNavigationOrAttributeCallExp(NavigationOrAttributeCallExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableExp(VariableExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperExp(SuperExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBagExp(BagExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderedSetExp(OrderedSetExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceExp(SequenceExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetExp(SetExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTupleExp(TupleExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapExp(MapExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclUndefinedExp(OclUndefinedExp object)
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
   * Returns the result of interpreting the object as an instance of '<em>Located Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Located Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocatedElement(LocatedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOclExpression(OclExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_VariableExp(OCLinEmig.VariableExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_SuperExp(OCLinEmig.SuperExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Collection Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionExp(CollectionExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bag Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_BagExp(OCLinEmig.BagExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ordered Set Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_OrderedSetExp(OCLinEmig.OrderedSetExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_SequenceExp(OCLinEmig.SequenceExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_SetExp(OCLinEmig.SetExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_TupleExp(OCLinEmig.TupleExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_MapExp(OCLinEmig.MapExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ocl Undefined Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOCLinEmig_OclUndefinedExp(OCLinEmig.OclUndefinedExp object)
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

} //EmigSwitch
