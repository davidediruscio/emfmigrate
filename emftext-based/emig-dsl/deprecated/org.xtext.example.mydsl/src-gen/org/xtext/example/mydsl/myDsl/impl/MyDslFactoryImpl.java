/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/MyDsl"); 
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
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
      case MyDslPackage.MY_MODEL: return createMyModel();
      case MyDslPackage.MIGRATION_LIBRARY: return createMigrationLibrary();
      case MyDslPackage.MIGRATION_PROGRAM: return createMigrationProgram();
      case MyDslPackage.ARTIFACT: return createArtifact();
      case MyDslPackage.RULE: return createRule();
      case MyDslPackage.OP_DEF: return createOpDef();
      case MyDslPackage.EPACKAGE_OP_DEF: return createEPackageOpDef();
      case MyDslPackage.ECLASS_OP_DEF: return createEClassOpDef();
      case MyDslPackage.EATTRIBUTE_OP_DEF: return createEAttributeOpDef();
      case MyDslPackage.EREFERENCE_OP_DEF: return createEReferenceOpDef();
      case MyDslPackage.SETTER_DEF: return createsetterDef();
      case MyDslPackage.REWRITING_RULE: return createRewritingRule();
      case MyDslPackage.MIGRATOR: return createMigrator();
      case MyDslPackage.MIGRATOR_SX: return createMigratorSX();
      case MyDslPackage.MIGRATOR_DX: return createMigratorDX();
      case MyDslPackage.FILTER_MIGRATOR: return createFilterMigrator();
      case MyDslPackage.DOT_NAVIGATION_OBJ_SX: return createDotNavigationObjSX();
      case MyDslPackage.DOT_NAVIGATION_OBJ_DX: return createDotNavigationObjDX();
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS: return createOCLinEcoreSpecificationCS();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.PACKAGE: return createPackage();
      case MyDslPackage.CLASS: return createClass();
      case MyDslPackage.ATTRIBUTE: return createAttribute();
      case MyDslPackage.REFERENCE: return createReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyModel createMyModel()
  {
    MyModelImpl myModel = new MyModelImpl();
    return myModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationLibrary createMigrationLibrary()
  {
    MigrationLibraryImpl migrationLibrary = new MigrationLibraryImpl();
    return migrationLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationProgram createMigrationProgram()
  {
    MigrationProgramImpl migrationProgram = new MigrationProgramImpl();
    return migrationProgram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpDef createOpDef()
  {
    OpDefImpl opDef = new OpDefImpl();
    return opDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackageOpDef createEPackageOpDef()
  {
    EPackageOpDefImpl ePackageOpDef = new EPackageOpDefImpl();
    return ePackageOpDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassOpDef createEClassOpDef()
  {
    EClassOpDefImpl eClassOpDef = new EClassOpDefImpl();
    return eClassOpDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributeOpDef createEAttributeOpDef()
  {
    EAttributeOpDefImpl eAttributeOpDef = new EAttributeOpDefImpl();
    return eAttributeOpDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReferenceOpDef createEReferenceOpDef()
  {
    EReferenceOpDefImpl eReferenceOpDef = new EReferenceOpDefImpl();
    return eReferenceOpDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setterDef createsetterDef()
  {
    setterDefImpl setterDef = new setterDefImpl();
    return setterDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RewritingRule createRewritingRule()
  {
    RewritingRuleImpl rewritingRule = new RewritingRuleImpl();
    return rewritingRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Migrator createMigrator()
  {
    MigratorImpl migrator = new MigratorImpl();
    return migrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigratorSX createMigratorSX()
  {
    MigratorSXImpl migratorSX = new MigratorSXImpl();
    return migratorSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigratorDX createMigratorDX()
  {
    MigratorDXImpl migratorDX = new MigratorDXImpl();
    return migratorDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterMigrator createFilterMigrator()
  {
    FilterMigratorImpl filterMigrator = new FilterMigratorImpl();
    return filterMigrator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotNavigationObjSX createDotNavigationObjSX()
  {
    DotNavigationObjSXImpl dotNavigationObjSX = new DotNavigationObjSXImpl();
    return dotNavigationObjSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotNavigationObjDX createDotNavigationObjDX()
  {
    DotNavigationObjDXImpl dotNavigationObjDX = new DotNavigationObjDXImpl();
    return dotNavigationObjDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OCLinEcoreSpecificationCS createOCLinEcoreSpecificationCS()
  {
    OCLinEcoreSpecificationCSImpl ocLinEcoreSpecificationCS = new OCLinEcoreSpecificationCSImpl();
    return ocLinEcoreSpecificationCS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.mydsl.myDsl.Class createClass()
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
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
