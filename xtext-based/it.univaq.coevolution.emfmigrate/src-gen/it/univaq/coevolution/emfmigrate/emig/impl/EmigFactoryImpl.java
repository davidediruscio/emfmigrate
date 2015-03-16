/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.Artifact;
import it.univaq.coevolution.emfmigrate.emig.Attribute;
import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX;
import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX;
import it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef;
import it.univaq.coevolution.emfmigrate.emig.EClassOpDef;
import it.univaq.coevolution.emfmigrate.emig.EPackageOpDef;
import it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef;
import it.univaq.coevolution.emfmigrate.emig.EmigFactory;
import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.FilterMigrator;
import it.univaq.coevolution.emfmigrate.emig.LocatedElement;
import it.univaq.coevolution.emfmigrate.emig.MigrationLibrary;
import it.univaq.coevolution.emfmigrate.emig.MigrationProgram;
import it.univaq.coevolution.emfmigrate.emig.Migrator;
import it.univaq.coevolution.emfmigrate.emig.MigratorDX;
import it.univaq.coevolution.emfmigrate.emig.MigratorSX;
import it.univaq.coevolution.emfmigrate.emig.MyModel;
import it.univaq.coevolution.emfmigrate.emig.OpDef;
import it.univaq.coevolution.emfmigrate.emig.Parameter;
import it.univaq.coevolution.emfmigrate.emig.Reference;
import it.univaq.coevolution.emfmigrate.emig.RewritingRule;
import it.univaq.coevolution.emfmigrate.emig.Rule;
import it.univaq.coevolution.emfmigrate.emig.setterDef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmigFactoryImpl extends EFactoryImpl implements EmigFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EmigFactory init()
  {
    try
    {
      EmigFactory theEmigFactory = (EmigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univaq.it/coevolution/emfmigrate/Emig"); 
      if (theEmigFactory != null)
      {
        return theEmigFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EmigFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmigFactoryImpl()
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
      case EmigPackage.MY_MODEL: return createMyModel();
      case EmigPackage.MIGRATION_LIBRARY: return createMigrationLibrary();
      case EmigPackage.LOCATED_ELEMENT: return createLocatedElement();
      case EmigPackage.MIGRATION_PROGRAM: return createMigrationProgram();
      case EmigPackage.ARTIFACT: return createArtifact();
      case EmigPackage.RULE: return createRule();
      case EmigPackage.OP_DEF: return createOpDef();
      case EmigPackage.EPACKAGE_OP_DEF: return createEPackageOpDef();
      case EmigPackage.ECLASS_OP_DEF: return createEClassOpDef();
      case EmigPackage.EATTRIBUTE_OP_DEF: return createEAttributeOpDef();
      case EmigPackage.EREFERENCE_OP_DEF: return createEReferenceOpDef();
      case EmigPackage.SETTER_DEF: return createsetterDef();
      case EmigPackage.REWRITING_RULE: return createRewritingRule();
      case EmigPackage.MIGRATOR: return createMigrator();
      case EmigPackage.MIGRATOR_SX: return createMigratorSX();
      case EmigPackage.MIGRATOR_DX: return createMigratorDX();
      case EmigPackage.FILTER_MIGRATOR: return createFilterMigrator();
      case EmigPackage.DOT_NAVIGATION_OBJ_SX: return createDotNavigationObjSX();
      case EmigPackage.DOT_NAVIGATION_OBJ_DX: return createDotNavigationObjDX();
      case EmigPackage.PARAMETER: return createParameter();
      case EmigPackage.PACKAGE: return createPackage();
      case EmigPackage.CLASS: return createClass();
      case EmigPackage.ATTRIBUTE: return createAttribute();
      case EmigPackage.REFERENCE: return createReference();
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
  public LocatedElement createLocatedElement()
  {
    LocatedElementImpl locatedElement = new LocatedElementImpl();
    return locatedElement;
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
  public it.univaq.coevolution.emfmigrate.emig.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.univaq.coevolution.emfmigrate.emig.Class createClass()
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
  public EmigPackage getEmigPackage()
  {
    return (EmigPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EmigPackage getPackage()
  {
    return EmigPackage.eINSTANCE;
  }

} //EmigFactoryImpl
