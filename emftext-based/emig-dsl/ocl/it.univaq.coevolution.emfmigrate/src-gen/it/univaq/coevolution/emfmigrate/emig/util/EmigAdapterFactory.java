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
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage
 * @generated
 */
public class EmigAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EmigPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmigAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EmigPackage.eINSTANCE;
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
  protected EmigSwitch<Adapter> modelSwitch =
    new EmigSwitch<Adapter>()
    {
      @Override
      public Adapter caseMyModel(MyModel object)
      {
        return createMyModelAdapter();
      }
      @Override
      public Adapter caseMigrationLibrary(MigrationLibrary object)
      {
        return createMigrationLibraryAdapter();
      }
      @Override
      public Adapter caseMigrationProgram(MigrationProgram object)
      {
        return createMigrationProgramAdapter();
      }
      @Override
      public Adapter caseArtifact(Artifact object)
      {
        return createArtifactAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseOpDef(OpDef object)
      {
        return createOpDefAdapter();
      }
      @Override
      public Adapter caseEPackageOpDef(EPackageOpDef object)
      {
        return createEPackageOpDefAdapter();
      }
      @Override
      public Adapter caseEClassOpDef(EClassOpDef object)
      {
        return createEClassOpDefAdapter();
      }
      @Override
      public Adapter caseEAttributeOpDef(EAttributeOpDef object)
      {
        return createEAttributeOpDefAdapter();
      }
      @Override
      public Adapter caseEReferenceOpDef(EReferenceOpDef object)
      {
        return createEReferenceOpDefAdapter();
      }
      @Override
      public Adapter casesetterDef(setterDef object)
      {
        return createsetterDefAdapter();
      }
      @Override
      public Adapter caseRewritingRule(RewritingRule object)
      {
        return createRewritingRuleAdapter();
      }
      @Override
      public Adapter caseMigrator(Migrator object)
      {
        return createMigratorAdapter();
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
      public Adapter caseDotNavigationObjSX(DotNavigationObjSX object)
      {
        return createDotNavigationObjSXAdapter();
      }
      @Override
      public Adapter caseDotNavigationObjDX(DotNavigationObjDX object)
      {
        return createDotNavigationObjDXAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter casePackage(it.univaq.coevolution.emfmigrate.emig.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseClass(it.univaq.coevolution.emfmigrate.emig.Class object)
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
      public Adapter caseNavigationOrAttributeCallExp(NavigationOrAttributeCallExp object)
      {
        return createNavigationOrAttributeCallExpAdapter();
      }
      @Override
      public Adapter caseVariableExp(VariableExp object)
      {
        return createVariableExpAdapter();
      }
      @Override
      public Adapter caseSuperExp(SuperExp object)
      {
        return createSuperExpAdapter();
      }
      @Override
      public Adapter caseBagExp(BagExp object)
      {
        return createBagExpAdapter();
      }
      @Override
      public Adapter caseOrderedSetExp(OrderedSetExp object)
      {
        return createOrderedSetExpAdapter();
      }
      @Override
      public Adapter caseSequenceExp(SequenceExp object)
      {
        return createSequenceExpAdapter();
      }
      @Override
      public Adapter caseSetExp(SetExp object)
      {
        return createSetExpAdapter();
      }
      @Override
      public Adapter caseTupleExp(TupleExp object)
      {
        return createTupleExpAdapter();
      }
      @Override
      public Adapter caseMapExp(MapExp object)
      {
        return createMapExpAdapter();
      }
      @Override
      public Adapter caseOclUndefinedExp(OclUndefinedExp object)
      {
        return createOclUndefinedExpAdapter();
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
      public Adapter caseLocatedElement(LocatedElement object)
      {
        return createLocatedElementAdapter();
      }
      @Override
      public Adapter caseOclExpression(OclExpression object)
      {
        return createOclExpressionAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_VariableExp(OCLinEmig.VariableExp object)
      {
        return createOCLinEmig_VariableExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_SuperExp(OCLinEmig.SuperExp object)
      {
        return createOCLinEmig_SuperExpAdapter();
      }
      @Override
      public Adapter caseCollectionExp(CollectionExp object)
      {
        return createCollectionExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_BagExp(OCLinEmig.BagExp object)
      {
        return createOCLinEmig_BagExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_OrderedSetExp(OCLinEmig.OrderedSetExp object)
      {
        return createOCLinEmig_OrderedSetExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_SequenceExp(OCLinEmig.SequenceExp object)
      {
        return createOCLinEmig_SequenceExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_SetExp(OCLinEmig.SetExp object)
      {
        return createOCLinEmig_SetExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_TupleExp(OCLinEmig.TupleExp object)
      {
        return createOCLinEmig_TupleExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_MapExp(OCLinEmig.MapExp object)
      {
        return createOCLinEmig_MapExpAdapter();
      }
      @Override
      public Adapter caseOCLinEmig_OclUndefinedExp(OCLinEmig.OclUndefinedExp object)
      {
        return createOCLinEmig_OclUndefinedExpAdapter();
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
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MyModel <em>My Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MyModel
   * @generated
   */
  public Adapter createMyModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MigrationLibrary <em>Migration Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationLibrary
   * @generated
   */
  public Adapter createMigrationLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MigrationProgram <em>Migration Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MigrationProgram
   * @generated
   */
  public Adapter createMigrationProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Artifact
   * @generated
   */
  public Adapter createArtifactAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.OpDef <em>Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.OpDef
   * @generated
   */
  public Adapter createOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef <em>EPackage Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.EPackageOpDef
   * @generated
   */
  public Adapter createEPackageOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef <em>EClass Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.EClassOpDef
   * @generated
   */
  public Adapter createEClassOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef <em>EAttribute Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef
   * @generated
   */
  public Adapter createEAttributeOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef <em>EReference Op Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef
   * @generated
   */
  public Adapter createEReferenceOpDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.setterDef <em>setter Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.setterDef
   * @generated
   */
  public Adapter createsetterDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule
   * @generated
   */
  public Adapter createRewritingRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Migrator <em>Migrator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Migrator
   * @generated
   */
  public Adapter createMigratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX <em>Migrator SX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX
   * @generated
   */
  public Adapter createMigratorSXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX
   * @generated
   */
  public Adapter createMigratorDXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator <em>Filter Migrator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.FilterMigrator
   * @generated
   */
  public Adapter createFilterMigratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX <em>Dot Navigation Obj SX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX
   * @generated
   */
  public Adapter createDotNavigationObjSXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX <em>Dot Navigation Obj DX</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX
   * @generated
   */
  public Adapter createDotNavigationObjDXAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp <em>Navigation Or Attribute Call Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp
   * @generated
   */
  public Adapter createNavigationOrAttributeCallExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.VariableExp <em>Variable Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.VariableExp
   * @generated
   */
  public Adapter createVariableExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.SuperExp <em>Super Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.SuperExp
   * @generated
   */
  public Adapter createSuperExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.BagExp <em>Bag Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.BagExp
   * @generated
   */
  public Adapter createBagExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.OrderedSetExp <em>Ordered Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.OrderedSetExp
   * @generated
   */
  public Adapter createOrderedSetExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.SequenceExp <em>Sequence Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.SequenceExp
   * @generated
   */
  public Adapter createSequenceExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.SetExp <em>Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.SetExp
   * @generated
   */
  public Adapter createSetExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.TupleExp <em>Tuple Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.TupleExp
   * @generated
   */
  public Adapter createTupleExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.MapExp <em>Map Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.MapExp
   * @generated
   */
  public Adapter createMapExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.emig.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see it.univaq.coevolution.emfmigrate.emig.OclUndefinedExp
   * @generated
   */
  public Adapter createOclUndefinedExpAdapter()
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
   * Creates a new adapter for an object of class '{@link OCLinEmig.LocatedElement <em>Located Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.LocatedElement
   * @generated
   */
  public Adapter createLocatedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.OclExpression <em>Ocl Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.OclExpression
   * @generated
   */
  public Adapter createOclExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.VariableExp <em>Variable Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.VariableExp
   * @generated
   */
  public Adapter createOCLinEmig_VariableExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.SuperExp <em>Super Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.SuperExp
   * @generated
   */
  public Adapter createOCLinEmig_SuperExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.CollectionExp <em>Collection Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.CollectionExp
   * @generated
   */
  public Adapter createCollectionExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.BagExp <em>Bag Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.BagExp
   * @generated
   */
  public Adapter createOCLinEmig_BagExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.OrderedSetExp <em>Ordered Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.OrderedSetExp
   * @generated
   */
  public Adapter createOCLinEmig_OrderedSetExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.SequenceExp <em>Sequence Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.SequenceExp
   * @generated
   */
  public Adapter createOCLinEmig_SequenceExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.SetExp <em>Set Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.SetExp
   * @generated
   */
  public Adapter createOCLinEmig_SetExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.TupleExp <em>Tuple Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.TupleExp
   * @generated
   */
  public Adapter createOCLinEmig_TupleExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.MapExp <em>Map Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.MapExp
   * @generated
   */
  public Adapter createOCLinEmig_MapExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link OCLinEmig.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see OCLinEmig.OclUndefinedExp
   * @generated
   */
  public Adapter createOCLinEmig_OclUndefinedExpAdapter()
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

} //EmigAdapterFactory
