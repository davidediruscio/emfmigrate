/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.util;

import it.univaq.coevolution.migration.ADDATTRIBUTE;
import it.univaq.coevolution.migration.ADDCLASS;
import it.univaq.coevolution.migration.ADDPACKAGE;
import it.univaq.coevolution.migration.ADDREFERENCE;
import it.univaq.coevolution.migration.Argument;
import it.univaq.coevolution.migration.Attribute;
import it.univaq.coevolution.migration.AttributeOp;
import it.univaq.coevolution.migration.CHANGEATTRIBUTE;
import it.univaq.coevolution.migration.CHANGECLASS;
import it.univaq.coevolution.migration.CHANGEPACKAGE;
import it.univaq.coevolution.migration.CHANGEREFERENCE;
import it.univaq.coevolution.migration.CallOperator;
import it.univaq.coevolution.migration.ClassOp;
import it.univaq.coevolution.migration.Classifier;
import it.univaq.coevolution.migration.ComplexOperator;
import it.univaq.coevolution.migration.DELETEATTRIBUTE;
import it.univaq.coevolution.migration.DELETECLASS;
import it.univaq.coevolution.migration.DELETEPACKAGE;
import it.univaq.coevolution.migration.DELETEREFERENCE;
import it.univaq.coevolution.migration.EAttributePar;
import it.univaq.coevolution.migration.EBoolPar;
import it.univaq.coevolution.migration.EClassPar;
import it.univaq.coevolution.migration.EPackagePar;
import it.univaq.coevolution.migration.EReferencePar;
import it.univaq.coevolution.migration.FeatureSetters;
import it.univaq.coevolution.migration.FilterMigrator;
import it.univaq.coevolution.migration.INT;
import it.univaq.coevolution.migration.MOVEATTRIBUTE;
import it.univaq.coevolution.migration.MOVEREFERENCE;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigrationProgram;
import it.univaq.coevolution.migration.MigratorDX;
import it.univaq.coevolution.migration.MigratorSX;
import it.univaq.coevolution.migration.Model;
import it.univaq.coevolution.migration.OpDef;
import it.univaq.coevolution.migration.PackageOp;
import it.univaq.coevolution.migration.RENAMEATTRIBUTE;
import it.univaq.coevolution.migration.Reference;
import it.univaq.coevolution.migration.ReferenceOp;
import it.univaq.coevolution.migration.RewritingRule;
import it.univaq.coevolution.migration.Rule;
import it.univaq.coevolution.migration.STRING;
import it.univaq.coevolution.migration.classSetter;
import it.univaq.coevolution.migration.classSetters_def;
import it.univaq.coevolution.migration.eStructuralFeatureOp;
import it.univaq.coevolution.migration.featureSetters_def;
import it.univaq.coevolution.migration.packageSetters;
import it.univaq.coevolution.migration.packageSetters_def;
import it.univaq.coevolution.migration.setNsPrefix;
import it.univaq.coevolution.migration.setNsPrefix_def;
import it.univaq.coevolution.migration.setNsUri;
import it.univaq.coevolution.migration.setNsUri_def;

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
 * @see it.univaq.coevolution.migration.MigrationPackage
 * @generated
 */
public class MigrationSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MigrationPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MigrationPackage.eINSTANCE;
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
      case MigrationPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.PACKAGE_SETTERS:
      {
        packageSetters packageSetters = (packageSetters)theEObject;
        T result = casepackageSetters(packageSetters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.PACKAGE_SETTERS_DEF:
      {
        packageSetters_def packageSetters_def = (packageSetters_def)theEObject;
        T result = casepackageSetters_def(packageSetters_def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.SET_NS_URI:
      {
        setNsUri setNsUri = (setNsUri)theEObject;
        T result = casesetNsUri(setNsUri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.SET_NS_URI_DEF:
      {
        setNsUri_def setNsUri_def = (setNsUri_def)theEObject;
        T result = casesetNsUri_def(setNsUri_def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.SET_NS_PREFIX:
      {
        setNsPrefix setNsPrefix = (setNsPrefix)theEObject;
        T result = casesetNsPrefix(setNsPrefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.SET_NS_PREFIX_DEF:
      {
        setNsPrefix_def setNsPrefix_def = (setNsPrefix_def)theEObject;
        T result = casesetNsPrefix_def(setNsPrefix_def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CHANGEPACKAGE:
      {
        CHANGEPACKAGE changepackage = (CHANGEPACKAGE)theEObject;
        T result = caseCHANGEPACKAGE(changepackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ADDPACKAGE:
      {
        ADDPACKAGE addpackage = (ADDPACKAGE)theEObject;
        T result = caseADDPACKAGE(addpackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.DELETEPACKAGE:
      {
        DELETEPACKAGE deletepackage = (DELETEPACKAGE)theEObject;
        T result = caseDELETEPACKAGE(deletepackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.PACKAGE_OP:
      {
        PackageOp packageOp = (PackageOp)theEObject;
        T result = casePackageOp(packageOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.OP_DEF:
      {
        OpDef opDef = (OpDef)theEObject;
        T result = caseOpDef(opDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CHANGECLASS:
      {
        CHANGECLASS changeclass = (CHANGECLASS)theEObject;
        T result = caseCHANGECLASS(changeclass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ADDCLASS:
      {
        ADDCLASS addclass = (ADDCLASS)theEObject;
        T result = caseADDCLASS(addclass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.DELETECLASS:
      {
        DELETECLASS deleteclass = (DELETECLASS)theEObject;
        T result = caseDELETECLASS(deleteclass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CLASS_SETTER:
      {
        classSetter classSetter = (classSetter)theEObject;
        T result = caseclassSetter(classSetter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CLASS_SETTERS_DEF:
      {
        classSetters_def classSetters_def = (classSetters_def)theEObject;
        T result = caseclassSetters_def(classSetters_def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CLASS_OP:
      {
        ClassOp classOp = (ClassOp)theEObject;
        T result = caseClassOp(classOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ESTRUCTURAL_FEATURE_OP:
      {
        eStructuralFeatureOp eStructuralFeatureOp = (eStructuralFeatureOp)theEObject;
        T result = caseeStructuralFeatureOp(eStructuralFeatureOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CHANGEATTRIBUTE:
      {
        CHANGEATTRIBUTE changeattribute = (CHANGEATTRIBUTE)theEObject;
        T result = caseCHANGEATTRIBUTE(changeattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ADDATTRIBUTE:
      {
        ADDATTRIBUTE addattribute = (ADDATTRIBUTE)theEObject;
        T result = caseADDATTRIBUTE(addattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.DELETEATTRIBUTE:
      {
        DELETEATTRIBUTE deleteattribute = (DELETEATTRIBUTE)theEObject;
        T result = caseDELETEATTRIBUTE(deleteattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.RENAMEATTRIBUTE:
      {
        RENAMEATTRIBUTE renameattribute = (RENAMEATTRIBUTE)theEObject;
        T result = caseRENAMEATTRIBUTE(renameattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.MOVEATTRIBUTE:
      {
        MOVEATTRIBUTE moveattribute = (MOVEATTRIBUTE)theEObject;
        T result = caseMOVEATTRIBUTE(moveattribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.FEATURE_SETTERS:
      {
        FeatureSetters featureSetters = (FeatureSetters)theEObject;
        T result = caseFeatureSetters(featureSetters);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ATTRIBUTE_OP:
      {
        AttributeOp attributeOp = (AttributeOp)theEObject;
        T result = caseAttributeOp(attributeOp);
        if (result == null) result = caseeStructuralFeatureOp(attributeOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CHANGEREFERENCE:
      {
        CHANGEREFERENCE changereference = (CHANGEREFERENCE)theEObject;
        T result = caseCHANGEREFERENCE(changereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ADDREFERENCE:
      {
        ADDREFERENCE addreference = (ADDREFERENCE)theEObject;
        T result = caseADDREFERENCE(addreference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.DELETEREFERENCE:
      {
        DELETEREFERENCE deletereference = (DELETEREFERENCE)theEObject;
        T result = caseDELETEREFERENCE(deletereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.MOVEREFERENCE:
      {
        MOVEREFERENCE movereference = (MOVEREFERENCE)theEObject;
        T result = caseMOVEREFERENCE(movereference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.FEATURE_SETTERS_DEF:
      {
        featureSetters_def featureSetters_def = (featureSetters_def)theEObject;
        T result = casefeatureSetters_def(featureSetters_def);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.REFERENCE_OP:
      {
        ReferenceOp referenceOp = (ReferenceOp)theEObject;
        T result = caseReferenceOp(referenceOp);
        if (result == null) result = caseeStructuralFeatureOp(referenceOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.COMPLEX_OPERATOR:
      {
        ComplexOperator complexOperator = (ComplexOperator)theEObject;
        T result = caseComplexOperator(complexOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.INT:
      {
        INT int_ = (INT)theEObject;
        T result = caseINT(int_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.STRING:
      {
        STRING string = (STRING)theEObject;
        T result = caseSTRING(string);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.EBOOL_PAR:
      {
        EBoolPar eBoolPar = (EBoolPar)theEObject;
        T result = caseEBoolPar(eBoolPar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CALL_OPERATOR:
      {
        CallOperator callOperator = (CallOperator)theEObject;
        T result = caseCallOperator(callOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.MIGRATION_PROGRAM:
      {
        MigrationProgram migrationProgram = (MigrationProgram)theEObject;
        T result = caseMigrationProgram(migrationProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.REWRITING_RULE:
      {
        RewritingRule rewritingRule = (RewritingRule)theEObject;
        T result = caseRewritingRule(rewritingRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.MIGRATOR_SX:
      {
        MigratorSX migratorSX = (MigratorSX)theEObject;
        T result = caseMigratorSX(migratorSX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.MIGRATOR_DX:
      {
        MigratorDX migratorDX = (MigratorDX)theEObject;
        T result = caseMigratorDX(migratorDX);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.FILTER_MIGRATOR:
      {
        FilterMigrator filterMigrator = (FilterMigrator)theEObject;
        T result = caseFilterMigrator(filterMigrator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.PACKAGE:
      {
        it.univaq.coevolution.migration.Package package_ = (it.univaq.coevolution.migration.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseEPackage(package_);
        if (result == null) result = caseENamedElement(package_);
        if (result == null) result = caseEModelElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CLASS:
      {
        it.univaq.coevolution.migration.Class class_ = (it.univaq.coevolution.migration.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseEClass(class_);
        if (result == null) result = caseEClassifier(class_);
        if (result == null) result = caseENamedElement(class_);
        if (result == null) result = caseEModelElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.CLASSIFIER:
      {
        Classifier classifier = (Classifier)theEObject;
        T result = caseClassifier(classifier);
        if (result == null) result = caseEClassifier(classifier);
        if (result == null) result = caseENamedElement(classifier);
        if (result == null) result = caseEModelElement(classifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ATTRIBUTE:
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
      case MigrationPackage.REFERENCE:
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
      case MigrationPackage.EREFERENCE_PAR:
      {
        EReferencePar eReferencePar = (EReferencePar)theEObject;
        T result = caseEReferencePar(eReferencePar);
        if (result == null) result = caseEReference(eReferencePar);
        if (result == null) result = caseEStructuralFeature(eReferencePar);
        if (result == null) result = caseETypedElement(eReferencePar);
        if (result == null) result = caseENamedElement(eReferencePar);
        if (result == null) result = caseEModelElement(eReferencePar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.EATTRIBUTE_PAR:
      {
        EAttributePar eAttributePar = (EAttributePar)theEObject;
        T result = caseEAttributePar(eAttributePar);
        if (result == null) result = caseEAttribute(eAttributePar);
        if (result == null) result = caseEStructuralFeature(eAttributePar);
        if (result == null) result = caseETypedElement(eAttributePar);
        if (result == null) result = caseENamedElement(eAttributePar);
        if (result == null) result = caseEModelElement(eAttributePar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.ECLASS_PAR:
      {
        EClassPar eClassPar = (EClassPar)theEObject;
        T result = caseEClassPar(eClassPar);
        if (result == null) result = caseEClass(eClassPar);
        if (result == null) result = caseEClassifier(eClassPar);
        if (result == null) result = caseENamedElement(eClassPar);
        if (result == null) result = caseEModelElement(eClassPar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MigrationPackage.EPACKAGE_PAR:
      {
        EPackagePar ePackagePar = (EPackagePar)theEObject;
        T result = caseEPackagePar(ePackagePar);
        if (result == null) result = caseEPackage(ePackagePar);
        if (result == null) result = caseENamedElement(ePackagePar);
        if (result == null) result = caseEModelElement(ePackagePar);
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
   * Returns the result of interpreting the object as an instance of '<em>package Setters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>package Setters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepackageSetters(packageSetters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>package Setters def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>package Setters def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepackageSetters_def(packageSetters_def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set Ns Uri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set Ns Uri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetNsUri(setNsUri object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set Ns Uri def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set Ns Uri def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetNsUri_def(setNsUri_def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set Ns Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set Ns Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetNsPrefix(setNsPrefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>set Ns Prefix def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>set Ns Prefix def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesetNsPrefix_def(setNsPrefix_def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CHANGEPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CHANGEPACKAGE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCHANGEPACKAGE(CHANGEPACKAGE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADDPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADDPACKAGE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADDPACKAGE(ADDPACKAGE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DELETEPACKAGE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DELETEPACKAGE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDELETEPACKAGE(DELETEPACKAGE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageOp(PackageOp object)
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
   * Returns the result of interpreting the object as an instance of '<em>CHANGECLASS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CHANGECLASS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCHANGECLASS(CHANGECLASS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADDCLASS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADDCLASS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADDCLASS(ADDCLASS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DELETECLASS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DELETECLASS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDELETECLASS(DELETECLASS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>class Setter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>class Setter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclassSetter(classSetter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>class Setters def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>class Setters def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclassSetters_def(classSetters_def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassOp(ClassOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>eStructural Feature Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>eStructural Feature Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseeStructuralFeatureOp(eStructuralFeatureOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CHANGEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CHANGEATTRIBUTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCHANGEATTRIBUTE(CHANGEATTRIBUTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADDATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADDATTRIBUTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADDATTRIBUTE(ADDATTRIBUTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DELETEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DELETEATTRIBUTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDELETEATTRIBUTE(DELETEATTRIBUTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RENAMEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RENAMEATTRIBUTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRENAMEATTRIBUTE(RENAMEATTRIBUTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOVEATTRIBUTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOVEATTRIBUTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOVEATTRIBUTE(MOVEATTRIBUTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Setters</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Setters</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureSetters(FeatureSetters object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeOp(AttributeOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CHANGEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CHANGEREFERENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCHANGEREFERENCE(CHANGEREFERENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ADDREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ADDREFERENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseADDREFERENCE(ADDREFERENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DELETEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DELETEREFERENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDELETEREFERENCE(DELETEREFERENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MOVEREFERENCE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MOVEREFERENCE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMOVEREFERENCE(MOVEREFERENCE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>feature Setters def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>feature Setters def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefeatureSetters_def(featureSetters_def object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceOp(ReferenceOp object)
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
   * Returns the result of interpreting the object as an instance of '<em>EBool Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EBool Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEBoolPar(EBoolPar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallOperator(CallOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgument(Argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMigrationProgram(MigrationProgram object)
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
  public T casePackage(it.univaq.coevolution.migration.Package object)
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
  public T caseClass(it.univaq.coevolution.migration.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
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
   * Returns the result of interpreting the object as an instance of '<em>EReference Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EReference Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEReferencePar(EReferencePar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EAttribute Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EAttribute Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEAttributePar(EAttributePar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EClass Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EClass Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEClassPar(EClassPar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EPackage Par</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EPackage Par</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEPackagePar(EPackagePar object)
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

} //MigrationSwitch
