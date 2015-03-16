/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

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
import it.univaq.coevolution.migration.MigrationFactory;
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
public class MigrationFactoryImpl extends EFactoryImpl implements MigrationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MigrationFactory init()
  {
    try
    {
      MigrationFactory theMigrationFactory = (MigrationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univaq.it/coevolution/Migration"); 
      if (theMigrationFactory != null)
      {
        return theMigrationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MigrationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationFactoryImpl()
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
      case MigrationPackage.MODEL: return createModel();
      case MigrationPackage.PACKAGE_SETTERS: return createpackageSetters();
      case MigrationPackage.PACKAGE_SETTERS_DEF: return createpackageSetters_def();
      case MigrationPackage.SET_NS_URI: return createsetNsUri();
      case MigrationPackage.SET_NS_URI_DEF: return createsetNsUri_def();
      case MigrationPackage.SET_NS_PREFIX: return createsetNsPrefix();
      case MigrationPackage.SET_NS_PREFIX_DEF: return createsetNsPrefix_def();
      case MigrationPackage.CHANGEPACKAGE: return createCHANGEPACKAGE();
      case MigrationPackage.ADDPACKAGE: return createADDPACKAGE();
      case MigrationPackage.DELETEPACKAGE: return createDELETEPACKAGE();
      case MigrationPackage.PACKAGE_OP: return createPackageOp();
      case MigrationPackage.OP_DEF: return createOpDef();
      case MigrationPackage.CHANGECLASS: return createCHANGECLASS();
      case MigrationPackage.ADDCLASS: return createADDCLASS();
      case MigrationPackage.DELETECLASS: return createDELETECLASS();
      case MigrationPackage.CLASS_SETTER: return createclassSetter();
      case MigrationPackage.CLASS_SETTERS_DEF: return createclassSetters_def();
      case MigrationPackage.CLASS_OP: return createClassOp();
      case MigrationPackage.ESTRUCTURAL_FEATURE_OP: return createeStructuralFeatureOp();
      case MigrationPackage.CHANGEATTRIBUTE: return createCHANGEATTRIBUTE();
      case MigrationPackage.ADDATTRIBUTE: return createADDATTRIBUTE();
      case MigrationPackage.DELETEATTRIBUTE: return createDELETEATTRIBUTE();
      case MigrationPackage.RENAMEATTRIBUTE: return createRENAMEATTRIBUTE();
      case MigrationPackage.MOVEATTRIBUTE: return createMOVEATTRIBUTE();
      case MigrationPackage.FEATURE_SETTERS: return createFeatureSetters();
      case MigrationPackage.ATTRIBUTE_OP: return createAttributeOp();
      case MigrationPackage.CHANGEREFERENCE: return createCHANGEREFERENCE();
      case MigrationPackage.ADDREFERENCE: return createADDREFERENCE();
      case MigrationPackage.DELETEREFERENCE: return createDELETEREFERENCE();
      case MigrationPackage.MOVEREFERENCE: return createMOVEREFERENCE();
      case MigrationPackage.FEATURE_SETTERS_DEF: return createfeatureSetters_def();
      case MigrationPackage.REFERENCE_OP: return createReferenceOp();
      case MigrationPackage.COMPLEX_OPERATOR: return createComplexOperator();
      case MigrationPackage.INT: return createINT();
      case MigrationPackage.STRING: return createSTRING();
      case MigrationPackage.EBOOL_PAR: return createEBoolPar();
      case MigrationPackage.CALL_OPERATOR: return createCallOperator();
      case MigrationPackage.ARGUMENT: return createArgument();
      case MigrationPackage.MIGRATION_PROGRAM: return createMigrationProgram();
      case MigrationPackage.RULE: return createRule();
      case MigrationPackage.REWRITING_RULE: return createRewritingRule();
      case MigrationPackage.MIGRATOR_SX: return createMigratorSX();
      case MigrationPackage.MIGRATOR_DX: return createMigratorDX();
      case MigrationPackage.FILTER_MIGRATOR: return createFilterMigrator();
      case MigrationPackage.PACKAGE: return createPackage();
      case MigrationPackage.CLASS: return createClass();
      case MigrationPackage.CLASSIFIER: return createClassifier();
      case MigrationPackage.ATTRIBUTE: return createAttribute();
      case MigrationPackage.REFERENCE: return createReference();
      case MigrationPackage.EREFERENCE_PAR: return createEReferencePar();
      case MigrationPackage.EATTRIBUTE_PAR: return createEAttributePar();
      case MigrationPackage.ECLASS_PAR: return createEClassPar();
      case MigrationPackage.EPACKAGE_PAR: return createEPackagePar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packageSetters createpackageSetters()
  {
    packageSettersImpl packageSetters = new packageSettersImpl();
    return packageSetters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public packageSetters_def createpackageSetters_def()
  {
    packageSetters_defImpl packageSetters_def = new packageSetters_defImpl();
    return packageSetters_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setNsUri createsetNsUri()
  {
    setNsUriImpl setNsUri = new setNsUriImpl();
    return setNsUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setNsUri_def createsetNsUri_def()
  {
    setNsUri_defImpl setNsUri_def = new setNsUri_defImpl();
    return setNsUri_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setNsPrefix createsetNsPrefix()
  {
    setNsPrefixImpl setNsPrefix = new setNsPrefixImpl();
    return setNsPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public setNsPrefix_def createsetNsPrefix_def()
  {
    setNsPrefix_defImpl setNsPrefix_def = new setNsPrefix_defImpl();
    return setNsPrefix_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CHANGEPACKAGE createCHANGEPACKAGE()
  {
    CHANGEPACKAGEImpl changepackage = new CHANGEPACKAGEImpl();
    return changepackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADDPACKAGE createADDPACKAGE()
  {
    ADDPACKAGEImpl addpackage = new ADDPACKAGEImpl();
    return addpackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DELETEPACKAGE createDELETEPACKAGE()
  {
    DELETEPACKAGEImpl deletepackage = new DELETEPACKAGEImpl();
    return deletepackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageOp createPackageOp()
  {
    PackageOpImpl packageOp = new PackageOpImpl();
    return packageOp;
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
  public CHANGECLASS createCHANGECLASS()
  {
    CHANGECLASSImpl changeclass = new CHANGECLASSImpl();
    return changeclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADDCLASS createADDCLASS()
  {
    ADDCLASSImpl addclass = new ADDCLASSImpl();
    return addclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DELETECLASS createDELETECLASS()
  {
    DELETECLASSImpl deleteclass = new DELETECLASSImpl();
    return deleteclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classSetter createclassSetter()
  {
    classSetterImpl classSetter = new classSetterImpl();
    return classSetter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public classSetters_def createclassSetters_def()
  {
    classSetters_defImpl classSetters_def = new classSetters_defImpl();
    return classSetters_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassOp createClassOp()
  {
    ClassOpImpl classOp = new ClassOpImpl();
    return classOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eStructuralFeatureOp createeStructuralFeatureOp()
  {
    eStructuralFeatureOpImpl eStructuralFeatureOp = new eStructuralFeatureOpImpl();
    return eStructuralFeatureOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CHANGEATTRIBUTE createCHANGEATTRIBUTE()
  {
    CHANGEATTRIBUTEImpl changeattribute = new CHANGEATTRIBUTEImpl();
    return changeattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADDATTRIBUTE createADDATTRIBUTE()
  {
    ADDATTRIBUTEImpl addattribute = new ADDATTRIBUTEImpl();
    return addattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DELETEATTRIBUTE createDELETEATTRIBUTE()
  {
    DELETEATTRIBUTEImpl deleteattribute = new DELETEATTRIBUTEImpl();
    return deleteattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RENAMEATTRIBUTE createRENAMEATTRIBUTE()
  {
    RENAMEATTRIBUTEImpl renameattribute = new RENAMEATTRIBUTEImpl();
    return renameattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOVEATTRIBUTE createMOVEATTRIBUTE()
  {
    MOVEATTRIBUTEImpl moveattribute = new MOVEATTRIBUTEImpl();
    return moveattribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureSetters createFeatureSetters()
  {
    FeatureSettersImpl featureSetters = new FeatureSettersImpl();
    return featureSetters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeOp createAttributeOp()
  {
    AttributeOpImpl attributeOp = new AttributeOpImpl();
    return attributeOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CHANGEREFERENCE createCHANGEREFERENCE()
  {
    CHANGEREFERENCEImpl changereference = new CHANGEREFERENCEImpl();
    return changereference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ADDREFERENCE createADDREFERENCE()
  {
    ADDREFERENCEImpl addreference = new ADDREFERENCEImpl();
    return addreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DELETEREFERENCE createDELETEREFERENCE()
  {
    DELETEREFERENCEImpl deletereference = new DELETEREFERENCEImpl();
    return deletereference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MOVEREFERENCE createMOVEREFERENCE()
  {
    MOVEREFERENCEImpl movereference = new MOVEREFERENCEImpl();
    return movereference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public featureSetters_def createfeatureSetters_def()
  {
    featureSetters_defImpl featureSetters_def = new featureSetters_defImpl();
    return featureSetters_def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceOp createReferenceOp()
  {
    ReferenceOpImpl referenceOp = new ReferenceOpImpl();
    return referenceOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperator createComplexOperator()
  {
    ComplexOperatorImpl complexOperator = new ComplexOperatorImpl();
    return complexOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public INT createINT()
  {
    INTImpl int_ = new INTImpl();
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING createSTRING()
  {
    STRINGImpl string = new STRINGImpl();
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EBoolPar createEBoolPar()
  {
    EBoolParImpl eBoolPar = new EBoolParImpl();
    return eBoolPar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallOperator createCallOperator()
  {
    CallOperatorImpl callOperator = new CallOperatorImpl();
    return callOperator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
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
  public it.univaq.coevolution.migration.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public it.univaq.coevolution.migration.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier createClassifier()
  {
    ClassifierImpl classifier = new ClassifierImpl();
    return classifier;
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
  public EReferencePar createEReferencePar()
  {
    EReferenceParImpl eReferencePar = new EReferenceParImpl();
    return eReferencePar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributePar createEAttributePar()
  {
    EAttributeParImpl eAttributePar = new EAttributeParImpl();
    return eAttributePar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassPar createEClassPar()
  {
    EClassParImpl eClassPar = new EClassParImpl();
    return eClassPar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackagePar createEPackagePar()
  {
    EPackageParImpl ePackagePar = new EPackageParImpl();
    return ePackagePar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationPackage getMigrationPackage()
  {
    return (MigrationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MigrationPackage getPackage()
  {
    return MigrationPackage.eINSTANCE;
  }

} //MigrationFactoryImpl
