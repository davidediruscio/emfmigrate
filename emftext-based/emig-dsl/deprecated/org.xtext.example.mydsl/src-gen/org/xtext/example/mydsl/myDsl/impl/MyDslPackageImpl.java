/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;

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
import org.xtext.example.mydsl.myDsl.MyDslFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migrationLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migrationProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass artifactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass opDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ePackageOpDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassOpDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeOpDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceOpDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setterDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewritingRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migratorSXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass migratorDXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterMigratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dotNavigationObjSXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dotNavigationObjDXEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ocLinEcoreSpecificationCSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    EssentialOCLCSTPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyModel()
  {
    return myModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyModel_MigrationLib()
  {
    return (EReference)myModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyModel_MigrationProgr()
  {
    return (EReference)myModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrationLibrary()
  {
    return migrationLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationLibrary_Title()
  {
    return (EAttribute)migrationLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationLibrary_Rules()
  {
    return (EReference)migrationLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrationProgram()
  {
    return migrationProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationProgram_Libs()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationProgram_Migr()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationProgram_TypeArt()
  {
    return (EReference)migrationProgramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationProgram_Name()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationProgram_TransformationPackage()
  {
    return (EReference)migrationProgramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationProgram_Delta()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationProgram_Rules()
  {
    return (EReference)migrationProgramEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArtifact()
  {
    return artifactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArtifact_Type()
  {
    return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Filter()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_RewritingRules()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpDef()
  {
    return opDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOpDef_Op()
  {
    return (EAttribute)opDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_Setters()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEPackageOpDef()
  {
    return ePackageOpDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOpDef_Var()
  {
    return (EReference)ePackageOpDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOpDef_Ref()
  {
    return (EReference)ePackageOpDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEPackageOpDef_Classes()
  {
    return (EReference)ePackageOpDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClassOpDef()
  {
    return eClassOpDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOpDef_Var()
  {
    return (EReference)eClassOpDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOpDef_Ref()
  {
    return (EReference)eClassOpDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOpDef_Attributes()
  {
    return (EReference)eClassOpDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEClassOpDef_References()
  {
    return (EReference)eClassOpDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEAttributeOpDef()
  {
    return eAttributeOpDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOpDef_Var()
  {
    return (EReference)eAttributeOpDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEAttributeOpDef_Ref()
  {
    return (EReference)eAttributeOpDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEReferenceOpDef()
  {
    return eReferenceOpDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOpDef_Var()
  {
    return (EReference)eReferenceOpDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEReferenceOpDef_Ref()
  {
    return (EReference)eReferenceOpDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetterDef()
  {
    return setterDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsetterDef_Metafeature()
  {
    return (EReference)setterDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetterDef_Operator()
  {
    return (EAttribute)setterDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getsetterDef_Par()
  {
    return (EReference)setterDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRewritingRule()
  {
    return rewritingRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewritingRule_MigratorsSX()
  {
    return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewritingRule_MigratorDX()
  {
    return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewritingRule_MigratorSX()
  {
    return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigrator()
  {
    return migratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrator_Name()
  {
    return (EAttribute)migratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigratorSX()
  {
    return migratorSXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorSX_ElementSX()
  {
    return (EReference)migratorSXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorSX_FilterSX()
  {
    return (EReference)migratorSXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMigratorDX()
  {
    return migratorDXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorDX_ElementDX()
  {
    return (EReference)migratorDXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorDX_FilterDX()
  {
    return (EReference)migratorDXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterMigrator()
  {
    return filterMigratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_FeatureSX()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterMigrator_Op()
  {
    return (EAttribute)filterMigratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_Value()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDotNavigationObjSX()
  {
    return dotNavigationObjSXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDotNavigationObjSX_Obj()
  {
    return (EReference)dotNavigationObjSXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDotNavigationObjSX_Ref()
  {
    return (EReference)dotNavigationObjSXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDotNavigationObjDX()
  {
    return dotNavigationObjDXEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDotNavigationObjDX_Obj()
  {
    return (EReference)dotNavigationObjDXEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDotNavigationObjDX_Ref()
  {
    return (EReference)dotNavigationObjDXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOCLinEcoreSpecificationCS()
  {
    return ocLinEcoreSpecificationCSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOCLinEcoreSpecificationCS_OwnedExpression()
  {
    return (EReference)ocLinEcoreSpecificationCSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOCLinEcoreSpecificationCS_ExprString()
  {
    return (EAttribute)ocLinEcoreSpecificationCSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
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
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
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
    myModelEClass = createEClass(MY_MODEL);
    createEReference(myModelEClass, MY_MODEL__MIGRATION_LIB);
    createEReference(myModelEClass, MY_MODEL__MIGRATION_PROGR);

    migrationLibraryEClass = createEClass(MIGRATION_LIBRARY);
    createEAttribute(migrationLibraryEClass, MIGRATION_LIBRARY__TITLE);
    createEReference(migrationLibraryEClass, MIGRATION_LIBRARY__RULES);

    migrationProgramEClass = createEClass(MIGRATION_PROGRAM);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__LIBS);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__MIGR);
    createEReference(migrationProgramEClass, MIGRATION_PROGRAM__TYPE_ART);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__NAME);
    createEReference(migrationProgramEClass, MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__DELTA);
    createEReference(migrationProgramEClass, MIGRATION_PROGRAM__RULES);

    artifactEClass = createEClass(ARTIFACT);
    createEAttribute(artifactEClass, ARTIFACT__TYPE);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__FILTER);
    createEReference(ruleEClass, RULE__REWRITING_RULES);

    opDefEClass = createEClass(OP_DEF);
    createEAttribute(opDefEClass, OP_DEF__OP);
    createEReference(opDefEClass, OP_DEF__SETTERS);

    ePackageOpDefEClass = createEClass(EPACKAGE_OP_DEF);
    createEReference(ePackageOpDefEClass, EPACKAGE_OP_DEF__VAR);
    createEReference(ePackageOpDefEClass, EPACKAGE_OP_DEF__REF);
    createEReference(ePackageOpDefEClass, EPACKAGE_OP_DEF__CLASSES);

    eClassOpDefEClass = createEClass(ECLASS_OP_DEF);
    createEReference(eClassOpDefEClass, ECLASS_OP_DEF__VAR);
    createEReference(eClassOpDefEClass, ECLASS_OP_DEF__REF);
    createEReference(eClassOpDefEClass, ECLASS_OP_DEF__ATTRIBUTES);
    createEReference(eClassOpDefEClass, ECLASS_OP_DEF__REFERENCES);

    eAttributeOpDefEClass = createEClass(EATTRIBUTE_OP_DEF);
    createEReference(eAttributeOpDefEClass, EATTRIBUTE_OP_DEF__VAR);
    createEReference(eAttributeOpDefEClass, EATTRIBUTE_OP_DEF__REF);

    eReferenceOpDefEClass = createEClass(EREFERENCE_OP_DEF);
    createEReference(eReferenceOpDefEClass, EREFERENCE_OP_DEF__VAR);
    createEReference(eReferenceOpDefEClass, EREFERENCE_OP_DEF__REF);

    setterDefEClass = createEClass(SETTER_DEF);
    createEReference(setterDefEClass, SETTER_DEF__METAFEATURE);
    createEAttribute(setterDefEClass, SETTER_DEF__OPERATOR);
    createEReference(setterDefEClass, SETTER_DEF__PAR);

    rewritingRuleEClass = createEClass(REWRITING_RULE);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATORS_SX);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATOR_DX);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATOR_SX);

    migratorEClass = createEClass(MIGRATOR);
    createEAttribute(migratorEClass, MIGRATOR__NAME);

    migratorSXEClass = createEClass(MIGRATOR_SX);
    createEReference(migratorSXEClass, MIGRATOR_SX__ELEMENT_SX);
    createEReference(migratorSXEClass, MIGRATOR_SX__FILTER_SX);

    migratorDXEClass = createEClass(MIGRATOR_DX);
    createEReference(migratorDXEClass, MIGRATOR_DX__ELEMENT_DX);
    createEReference(migratorDXEClass, MIGRATOR_DX__FILTER_DX);

    filterMigratorEClass = createEClass(FILTER_MIGRATOR);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__FEATURE_SX);
    createEAttribute(filterMigratorEClass, FILTER_MIGRATOR__OP);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__VALUE);

    dotNavigationObjSXEClass = createEClass(DOT_NAVIGATION_OBJ_SX);
    createEReference(dotNavigationObjSXEClass, DOT_NAVIGATION_OBJ_SX__OBJ);
    createEReference(dotNavigationObjSXEClass, DOT_NAVIGATION_OBJ_SX__REF);

    dotNavigationObjDXEClass = createEClass(DOT_NAVIGATION_OBJ_DX);
    createEReference(dotNavigationObjDXEClass, DOT_NAVIGATION_OBJ_DX__OBJ);
    createEReference(dotNavigationObjDXEClass, DOT_NAVIGATION_OBJ_DX__REF);

    ocLinEcoreSpecificationCSEClass = createEClass(OC_LIN_ECORE_SPECIFICATION_CS);
    createEReference(ocLinEcoreSpecificationCSEClass, OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION);
    createEAttribute(ocLinEcoreSpecificationCSEClass, OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    packageEClass = createEClass(PACKAGE);

    classEClass = createEClass(CLASS);

    attributeEClass = createEClass(ATTRIBUTE);

    referenceEClass = createEClass(REFERENCE);
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

    // Obtain other dependent packages
    EssentialOCLCSTPackage theEssentialOCLCSTPackage = (EssentialOCLCSTPackage)EPackage.Registry.INSTANCE.getEPackage(EssentialOCLCSTPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ePackageOpDefEClass.getESuperTypes().add(this.getOpDef());
    eClassOpDefEClass.getESuperTypes().add(this.getOpDef());
    eAttributeOpDefEClass.getESuperTypes().add(this.getOpDef());
    eReferenceOpDefEClass.getESuperTypes().add(this.getOpDef());
    migratorSXEClass.getESuperTypes().add(this.getMigrator());
    migratorDXEClass.getESuperTypes().add(this.getMigrator());
    packageEClass.getESuperTypes().add(ecorePackage.getEPackage());
    classEClass.getESuperTypes().add(ecorePackage.getEClass());
    attributeEClass.getESuperTypes().add(ecorePackage.getEAttribute());
    referenceEClass.getESuperTypes().add(ecorePackage.getEReference());

    // Initialize classes and features; add operations and parameters
    initEClass(myModelEClass, MyModel.class, "MyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMyModel_MigrationLib(), this.getMigrationLibrary(), null, "migrationLib", null, 0, 1, MyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyModel_MigrationProgr(), this.getMigrationProgram(), null, "MigrationProgr", null, 0, 1, MyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationLibraryEClass, MigrationLibrary.class, "MigrationLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMigrationLibrary_Title(), ecorePackage.getEString(), "title", null, 0, 1, MigrationLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationLibrary_Rules(), this.getRule(), null, "rules", null, 0, -1, MigrationLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationProgramEClass, MigrationProgram.class, "MigrationProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMigrationProgram_Libs(), ecorePackage.getEString(), "libs", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Migr(), ecorePackage.getEString(), "migr", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationProgram_TypeArt(), this.getArtifact(), null, "typeArt", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Name(), ecorePackage.getEString(), "name", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationProgram_TransformationPackage(), ecorePackage.getEPackage(), null, "transformationPackage", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Delta(), ecorePackage.getEString(), "delta", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationProgram_Rules(), this.getRule(), null, "rules", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArtifact_Type(), ecorePackage.getEString(), "type", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Filter(), this.getOpDef(), null, "filter", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_RewritingRules(), this.getRewritingRule(), null, "rewritingRules", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(opDefEClass, OpDef.class, "OpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOpDef_Op(), ecorePackage.getEString(), "op", null, 0, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_Setters(), this.getsetterDef(), null, "setters", null, 0, -1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ePackageOpDefEClass, EPackageOpDef.class, "EPackageOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEPackageOpDef_Var(), ecorePackage.getEPackage(), null, "var", null, 0, 1, EPackageOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOpDef_Ref(), ecorePackage.getEPackage(), null, "ref", null, 0, 1, EPackageOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEPackageOpDef_Classes(), this.getEClassOpDef(), null, "classes", null, 0, -1, EPackageOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eClassOpDefEClass, EClassOpDef.class, "EClassOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEClassOpDef_Var(), ecorePackage.getEClass(), null, "var", null, 0, 1, EClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOpDef_Ref(), ecorePackage.getEClass(), null, "ref", null, 0, 1, EClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOpDef_Attributes(), this.getEAttributeOpDef(), null, "attributes", null, 0, -1, EClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEClassOpDef_References(), this.getEReferenceOpDef(), null, "references", null, 0, -1, EClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eAttributeOpDefEClass, EAttributeOpDef.class, "EAttributeOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEAttributeOpDef_Var(), ecorePackage.getEAttribute(), null, "var", null, 0, 1, EAttributeOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEAttributeOpDef_Ref(), ecorePackage.getEAttribute(), null, "ref", null, 0, 1, EAttributeOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eReferenceOpDefEClass, EReferenceOpDef.class, "EReferenceOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEReferenceOpDef_Var(), ecorePackage.getEReference(), null, "var", null, 0, 1, EReferenceOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEReferenceOpDef_Ref(), ecorePackage.getEReference(), null, "ref", null, 0, 1, EReferenceOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setterDefEClass, setterDef.class, "setterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getsetterDef_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, setterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetterDef_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, setterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getsetterDef_Par(), this.getParameter(), null, "par", null, 0, -1, setterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewritingRuleEClass, RewritingRule.class, "RewritingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRewritingRule_MigratorsSX(), this.getMigratorSX(), null, "migratorsSX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewritingRule_MigratorDX(), this.getMigratorDX(), null, "migratorDX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewritingRule_MigratorSX(), this.getMigratorSX(), null, "migratorSX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migratorEClass, Migrator.class, "Migrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMigrator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Migrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migratorSXEClass, MigratorSX.class, "MigratorSX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigratorSX_ElementSX(), ecorePackage.getEClass(), null, "elementSX", null, 0, 1, MigratorSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigratorSX_FilterSX(), this.getFilterMigrator(), null, "filterSX", null, 0, -1, MigratorSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migratorDXEClass, MigratorDX.class, "MigratorDX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigratorDX_ElementDX(), ecorePackage.getEClass(), null, "elementDX", null, 0, 1, MigratorDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigratorDX_FilterDX(), this.getFilterMigrator(), null, "filterDX", null, 0, -1, MigratorDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterMigratorEClass, FilterMigrator.class, "FilterMigrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterMigrator_FeatureSX(), this.getDotNavigationObjSX(), null, "featureSX", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFilterMigrator_Op(), ecorePackage.getEString(), "op", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMigrator_Value(), this.getDotNavigationObjDX(), null, "value", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dotNavigationObjSXEClass, DotNavigationObjSX.class, "DotNavigationObjSX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDotNavigationObjSX_Obj(), ecorePackage.getEObject(), null, "obj", null, 0, 1, DotNavigationObjSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDotNavigationObjSX_Ref(), ecorePackage.getEStructuralFeature(), null, "ref", null, 0, 1, DotNavigationObjSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dotNavigationObjDXEClass, DotNavigationObjDX.class, "DotNavigationObjDX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDotNavigationObjDX_Obj(), ecorePackage.getEObject(), null, "obj", null, 0, 1, DotNavigationObjDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDotNavigationObjDX_Ref(), ecorePackage.getEStructuralFeature(), null, "ref", null, 0, 1, DotNavigationObjDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ocLinEcoreSpecificationCSEClass, OCLinEcoreSpecificationCS.class, "OCLinEcoreSpecificationCS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOCLinEcoreSpecificationCS_OwnedExpression(), theEssentialOCLCSTPackage.getExpCS(), null, "ownedExpression", null, 0, 1, OCLinEcoreSpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOCLinEcoreSpecificationCS_ExprString(), ecorePackage.getEString(), "exprString", null, 0, 1, OCLinEcoreSpecificationCS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, org.xtext.example.mydsl.myDsl.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, org.xtext.example.mydsl.myDsl.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
