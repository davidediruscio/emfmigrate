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
 * @see it.univaq.coevolution.migration.MigrationPackage
 * @generated
 */
public class MigrationAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MigrationPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MigrationPackage.eINSTANCE;
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
  protected MigrationSwitch<Adapter> modelSwitch =
    new MigrationSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casepackageSetters(packageSetters object)
      {
        return createpackageSettersAdapter();
      }
      @Override
      public Adapter casepackageSetters_def(packageSetters_def object)
      {
        return createpackageSetters_defAdapter();
      }
      @Override
      public Adapter casesetNsUri(setNsUri object)
      {
        return createsetNsUriAdapter();
      }
      @Override
      public Adapter casesetNsUri_def(setNsUri_def object)
      {
        return createsetNsUri_defAdapter();
      }
      @Override
      public Adapter casesetNsPrefix(setNsPrefix object)
      {
        return createsetNsPrefixAdapter();
      }
      @Override
      public Adapter casesetNsPrefix_def(setNsPrefix_def object)
      {
        return createsetNsPrefix_defAdapter();
      }
      @Override
      public Adapter caseCHANGEPACKAGE(CHANGEPACKAGE object)
      {
        return createCHANGEPACKAGEAdapter();
      }
      @Override
      public Adapter caseADDPACKAGE(ADDPACKAGE object)
      {
        return createADDPACKAGEAdapter();
      }
      @Override
      public Adapter caseDELETEPACKAGE(DELETEPACKAGE object)
      {
        return createDELETEPACKAGEAdapter();
      }
      @Override
      public Adapter casePackageOp(PackageOp object)
      {
        return createPackageOpAdapter();
      }
      @Override
      public Adapter caseOpDef(OpDef object)
      {
        return createOpDefAdapter();
      }
      @Override
      public Adapter caseCHANGECLASS(CHANGECLASS object)
      {
        return createCHANGECLASSAdapter();
      }
      @Override
      public Adapter caseADDCLASS(ADDCLASS object)
      {
        return createADDCLASSAdapter();
      }
      @Override
      public Adapter caseDELETECLASS(DELETECLASS object)
      {
        return createDELETECLASSAdapter();
      }
      @Override
      public Adapter caseclassSetter(classSetter object)
      {
        return createclassSetterAdapter();
      }
      @Override
      public Adapter caseclassSetters_def(classSetters_def object)
      {
        return createclassSetters_defAdapter();
      }
      @Override
      public Adapter caseClassOp(ClassOp object)
      {
        return createClassOpAdapter();
      }
      @Override
      public Adapter caseeStructuralFeatureOp(eStructuralFeatureOp object)
      {
        return createeStructuralFeatureOpAdapter();
      }
      @Override
      public Adapter caseCHANGEATTRIBUTE(CHANGEATTRIBUTE object)
      {
        return createCHANGEATTRIBUTEAdapter();
      }
      @Override
      public Adapter caseADDATTRIBUTE(ADDATTRIBUTE object)
      {
        return createADDATTRIBUTEAdapter();
      }
      @Override
      public Adapter caseDELETEATTRIBUTE(DELETEATTRIBUTE object)
      {
        return createDELETEATTRIBUTEAdapter();
      }
      @Override
      public Adapter caseRENAMEATTRIBUTE(RENAMEATTRIBUTE object)
      {
        return createRENAMEATTRIBUTEAdapter();
      }
      @Override
      public Adapter caseMOVEATTRIBUTE(MOVEATTRIBUTE object)
      {
        return createMOVEATTRIBUTEAdapter();
      }
      @Override
      public Adapter caseFeatureSetters(FeatureSetters object)
      {
        return createFeatureSettersAdapter();
      }
      @Override
      public Adapter caseAttributeOp(AttributeOp object)
      {
        return createAttributeOpAdapter();
      }
      @Override
      public Adapter caseCHANGEREFERENCE(CHANGEREFERENCE object)
      {
        return createCHANGEREFERENCEAdapter();
      }
      @Override
      public Adapter caseADDREFERENCE(ADDREFERENCE object)
      {
        return createADDREFERENCEAdapter();
      }
      @Override
      public Adapter caseDELETEREFERENCE(DELETEREFERENCE object)
      {
        return createDELETEREFERENCEAdapter();
      }
      @Override
      public Adapter caseMOVEREFERENCE(MOVEREFERENCE object)
      {
        return createMOVEREFERENCEAdapter();
      }
      @Override
      public Adapter casefeatureSetters_def(featureSetters_def object)
      {
        return createfeatureSetters_defAdapter();
      }
      @Override
      public Adapter caseReferenceOp(ReferenceOp object)
      {
        return createReferenceOpAdapter();
      }
      @Override
      public Adapter caseComplexOperator(ComplexOperator object)
      {
        return createComplexOperatorAdapter();
      }
      @Override
      public Adapter caseINT(INT object)
      {
        return createINTAdapter();
      }
      @Override
      public Adapter caseSTRING(STRING object)
      {
        return createSTRINGAdapter();
      }
      @Override
      public Adapter caseEBoolPar(EBoolPar object)
      {
        return createEBoolParAdapter();
      }
      @Override
      public Adapter caseCallOperator(CallOperator object)
      {
        return createCallOperatorAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseMigrationProgram(MigrationProgram object)
      {
        return createMigrationProgramAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseRewritingRule(RewritingRule object)
      {
        return createRewritingRuleAdapter();
      }
      @Override
      public Adapter caseMigratorSX(MigratorSX object)
      {
        return createMigratorSXAdapter();
      }
      @Override
      public Adapter caseMigratorDX(MigratorDX object)
      {
        return createMigratorDXAdapter();
      }
      @Override
      public Adapter caseFilterMigrator(FilterMigrator object)
      {
        return createFilterMigratorAdapter();
      }
      @Override
      public Adapter casePackage(it.univaq.coevolution.migration.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseClass(it.univaq.coevolution.migration.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseClassifier(Classifier object)
      {
        return createClassifierAdapter();
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
      public Adapter caseEReferencePar(EReferencePar object)
      {
        return createEReferenceParAdapter();
      }
      @Override
      public Adapter caseEAttributePar(EAttributePar object)
      {
        return createEAttributeParAdapter();
      }
      @Override
      public Adapter caseEClassPar(EClassPar object)
      {
        return createEClassParAdapter();
      }
      @Override
      public Adapter caseEPackagePar(EPackagePar object)
      {
        return createEPackageParAdapter();
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
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.packageSetters <em>package Setters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.packageSetters
   * @generated
   */
  public Adapter createpackageSettersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.packageSetters_def <em>package Setters def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.packageSetters_def
   * @generated
   */
  public Adapter createpackageSetters_defAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.setNsUri <em>set Ns Uri</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.setNsUri
   * @generated
   */
  public Adapter createsetNsUriAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.setNsUri_def <em>set Ns Uri def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.setNsUri_def
   * @generated
   */
  public Adapter createsetNsUri_defAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.setNsPrefix <em>set Ns Prefix</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.setNsPrefix
   * @generated
   */
  public Adapter createsetNsPrefixAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.setNsPrefix_def <em>set Ns Prefix def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.setNsPrefix_def
   * @generated
   */
  public Adapter createsetNsPrefix_defAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.CHANGEPACKAGE <em>CHANGEPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.CHANGEPACKAGE
   * @generated
   */
  public Adapter createCHANGEPACKAGEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ADDPACKAGE <em>ADDPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ADDPACKAGE
   * @generated
   */
  public Adapter createADDPACKAGEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.DELETEPACKAGE <em>DELETEPACKAGE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.DELETEPACKAGE
   * @generated
   */
  public Adapter createDELETEPACKAGEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.PackageOp <em>Package Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.PackageOp
   * @generated
   */
  public Adapter createPackageOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.OpDef <em>Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.OpDef
   * @generated
   */
  public Adapter createOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.CHANGECLASS <em>CHANGECLASS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.CHANGECLASS
   * @generated
   */
  public Adapter createCHANGECLASSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ADDCLASS <em>ADDCLASS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ADDCLASS
   * @generated
   */
  public Adapter createADDCLASSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.DELETECLASS <em>DELETECLASS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.DELETECLASS
   * @generated
   */
  public Adapter createDELETECLASSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.classSetter <em>class Setter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.classSetter
   * @generated
   */
  public Adapter createclassSetterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.classSetters_def <em>class Setters def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.classSetters_def
   * @generated
   */
  public Adapter createclassSetters_defAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ClassOp <em>Class Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ClassOp
   * @generated
   */
  public Adapter createClassOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.eStructuralFeatureOp <em>eStructural Feature Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.eStructuralFeatureOp
   * @generated
   */
  public Adapter createeStructuralFeatureOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.CHANGEATTRIBUTE <em>CHANGEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.CHANGEATTRIBUTE
   * @generated
   */
  public Adapter createCHANGEATTRIBUTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ADDATTRIBUTE <em>ADDATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ADDATTRIBUTE
   * @generated
   */
  public Adapter createADDATTRIBUTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.DELETEATTRIBUTE <em>DELETEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.DELETEATTRIBUTE
   * @generated
   */
  public Adapter createDELETEATTRIBUTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.RENAMEATTRIBUTE <em>RENAMEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.RENAMEATTRIBUTE
   * @generated
   */
  public Adapter createRENAMEATTRIBUTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.MOVEATTRIBUTE <em>MOVEATTRIBUTE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.MOVEATTRIBUTE
   * @generated
   */
  public Adapter createMOVEATTRIBUTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.FeatureSetters <em>Feature Setters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.FeatureSetters
   * @generated
   */
  public Adapter createFeatureSettersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.AttributeOp <em>Attribute Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.AttributeOp
   * @generated
   */
  public Adapter createAttributeOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.CHANGEREFERENCE <em>CHANGEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.CHANGEREFERENCE
   * @generated
   */
  public Adapter createCHANGEREFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ADDREFERENCE <em>ADDREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ADDREFERENCE
   * @generated
   */
  public Adapter createADDREFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.DELETEREFERENCE <em>DELETEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.DELETEREFERENCE
   * @generated
   */
  public Adapter createDELETEREFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.MOVEREFERENCE <em>MOVEREFERENCE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.MOVEREFERENCE
   * @generated
   */
  public Adapter createMOVEREFERENCEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.featureSetters_def <em>feature Setters def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.featureSetters_def
   * @generated
   */
  public Adapter createfeatureSetters_defAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ReferenceOp <em>Reference Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ReferenceOp
   * @generated
   */
  public Adapter createReferenceOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.ComplexOperator <em>Complex Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.ComplexOperator
   * @generated
   */
  public Adapter createComplexOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.INT <em>INT</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.INT
   * @generated
   */
  public Adapter createINTAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.STRING <em>STRING</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.STRING
   * @generated
   */
  public Adapter createSTRINGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.EBoolPar <em>EBool Par</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.EBoolPar
   * @generated
   */
  public Adapter createEBoolParAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.CallOperator <em>Call Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.CallOperator
   * @generated
   */
  public Adapter createCallOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.MigrationProgram <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.MigrationProgram
   * @generated
   */
  public Adapter createMigrationProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.RewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.RewritingRule
   * @generated
   */
  public Adapter createRewritingRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.MigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.MigratorSX
   * @generated
   */
  public Adapter createMigratorSXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.MigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.MigratorDX
   * @generated
   */
  public Adapter createMigratorDXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.FilterMigrator <em>Filter Migrator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.FilterMigrator
   * @generated
   */
  public Adapter createFilterMigratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Classifier
   * @generated
   */
  public Adapter createClassifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.EReferencePar <em>EReference Par</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.EReferencePar
   * @generated
   */
  public Adapter createEReferenceParAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.EAttributePar <em>EAttribute Par</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.EAttributePar
   * @generated
   */
  public Adapter createEAttributeParAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.EClassPar <em>EClass Par</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.EClassPar
   * @generated
   */
  public Adapter createEClassParAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.migration.EPackagePar <em>EPackage Par</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.migration.EPackagePar
   * @generated
   */
  public Adapter createEPackageParAdapter()
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

} //MigrationAdapterFactory
