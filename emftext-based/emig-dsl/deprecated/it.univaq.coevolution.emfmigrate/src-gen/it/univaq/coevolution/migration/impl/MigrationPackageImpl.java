/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.Argument;
import it.univaq.coevolution.migration.Attribute;
import it.univaq.coevolution.migration.AttributeOp;
import it.univaq.coevolution.migration.CallOperator;
import it.univaq.coevolution.migration.ClassOp;
import it.univaq.coevolution.migration.Classifier;
import it.univaq.coevolution.migration.ComplexOperator;
import it.univaq.coevolution.migration.EAttributePar;
import it.univaq.coevolution.migration.EBoolPar;
import it.univaq.coevolution.migration.EClassPar;
import it.univaq.coevolution.migration.EPackagePar;
import it.univaq.coevolution.migration.EReferencePar;
import it.univaq.coevolution.migration.FeatureSetters;
import it.univaq.coevolution.migration.FilterMigrator;
import it.univaq.coevolution.migration.MigrationFactory;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigrationProgram;
import it.univaq.coevolution.migration.MigratorDX;
import it.univaq.coevolution.migration.MigratorSX;
import it.univaq.coevolution.migration.Model;
import it.univaq.coevolution.migration.OpDef;
import it.univaq.coevolution.migration.PackageOp;
import it.univaq.coevolution.migration.Reference;
import it.univaq.coevolution.migration.ReferenceOp;
import it.univaq.coevolution.migration.RewritingRule;
import it.univaq.coevolution.migration.Rule;
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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationPackageImpl extends EPackageImpl implements MigrationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageSettersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageSetters_defEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setNsUriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setNsUri_defEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setNsPrefixEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setNsPrefix_defEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changepackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addpackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deletepackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageOpEClass = null;

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
  private EClass changeclassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addclassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteclassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classSetterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classSetters_defEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eStructuralFeatureOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changeattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass renameattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moveattributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureSettersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass changereferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addreferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deletereferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass movereferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureSetters_defEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eBoolParEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callOperatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

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
  private EClass ruleEClass = null;

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
  private EClass classifierEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eReferenceParEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eAttributeParEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eClassParEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ePackageParEClass = null;

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
   * @see it.univaq.coevolution.migration.MigrationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MigrationPackageImpl()
  {
    super(eNS_URI, MigrationFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link MigrationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MigrationPackage init()
  {
    if (isInited) return (MigrationPackage)EPackage.Registry.INSTANCE.getEPackage(MigrationPackage.eNS_URI);

    // Obtain or create and register package
    MigrationPackageImpl theMigrationPackage = (MigrationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MigrationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MigrationPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMigrationPackage.createPackageContents();

    // Initialize created meta-data
    theMigrationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMigrationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MigrationPackage.eNS_URI, theMigrationPackage);
    return theMigrationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Packages()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Title()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Operators()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_MigrationProgr()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpackageSetters()
  {
    return packageSettersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpackageSetters_Metafeature()
  {
    return (EReference)packageSettersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpackageSetters_Value()
  {
    return (EAttribute)packageSettersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpackageSetters_ValueRef()
  {
    return (EReference)packageSettersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpackageSetters_def()
  {
    return packageSetters_defEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getpackageSetters_def_Metafeature()
  {
    return (EReference)packageSetters_defEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpackageSetters_def_Par()
  {
    return (EAttribute)packageSetters_defEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetNsUri()
  {
    return setNsUriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsUri_Op()
  {
    return (EAttribute)setNsUriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsUri_NsURI()
  {
    return (EAttribute)setNsUriEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetNsUri_def()
  {
    return setNsUri_defEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsUri_def_Op()
  {
    return (EAttribute)setNsUri_defEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsUri_def_NsUri()
  {
    return (EAttribute)setNsUri_defEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetNsPrefix()
  {
    return setNsPrefixEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsPrefix_Op()
  {
    return (EAttribute)setNsPrefixEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsPrefix_NsPrefix()
  {
    return (EAttribute)setNsPrefixEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsetNsPrefix_def()
  {
    return setNsPrefix_defEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsPrefix_def_Op()
  {
    return (EAttribute)setNsPrefix_defEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getsetNsPrefix_def_NsPrefix()
  {
    return (EAttribute)setNsPrefix_defEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHANGEPACKAGE()
  {
    return changepackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCHANGEPACKAGE_Op()
  {
    return (EAttribute)changepackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHANGEPACKAGE_Ref()
  {
    return (EReference)changepackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADDPACKAGE()
  {
    return addpackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDPACKAGE_Op()
  {
    return (EAttribute)addpackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDPACKAGE_New()
  {
    return (EAttribute)addpackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDELETEPACKAGE()
  {
    return deletepackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDELETEPACKAGE_Op()
  {
    return (EAttribute)deletepackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDELETEPACKAGE_Ref()
  {
    return (EReference)deletepackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageOp()
  {
    return packageOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageOp_Var()
  {
    return (EReference)packageOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageOp_Op()
  {
    return (EReference)packageOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageOp_Setters()
  {
    return (EReference)packageOpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageOp_Classes()
  {
    return (EReference)packageOpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageOp_Complex()
  {
    return (EReference)packageOpEClass.getEStructuralFeatures().get(4);
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
  public EAttribute getOpDef_Opdef()
  {
    return (EAttribute)opDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_Ref()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_Settersdef()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_Complex()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOpDef_String()
  {
    return (EAttribute)opDefEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_Dst()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOpDef_FeatureSettersdef()
  {
    return (EReference)opDefEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHANGECLASS()
  {
    return changeclassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCHANGECLASS_Op()
  {
    return (EAttribute)changeclassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHANGECLASS_Ref()
  {
    return (EReference)changeclassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADDCLASS()
  {
    return addclassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDCLASS_Op()
  {
    return (EAttribute)addclassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDCLASS_New()
  {
    return (EAttribute)addclassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDELETECLASS()
  {
    return deleteclassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDELETECLASS_Op()
  {
    return (EAttribute)deleteclassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDELETECLASS_Ref()
  {
    return (EReference)deleteclassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclassSetter()
  {
    return classSetterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassSetter_Metafeature()
  {
    return (EReference)classSetterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getclassSetter_Value()
  {
    return (EAttribute)classSetterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassSetter_ValueRef()
  {
    return (EReference)classSetterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getclassSetters_def()
  {
    return classSetters_defEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassSetters_def_Metafeature()
  {
    return (EReference)classSetters_defEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getclassSetters_def_Par()
  {
    return (EReference)classSetters_defEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassOp()
  {
    return classOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_Var()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_Op()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_Setters()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_Attributes()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_References()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassOp_Complex()
  {
    return (EReference)classOpEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass geteStructuralFeatureOp()
  {
    return eStructuralFeatureOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference geteStructuralFeatureOp_Op()
  {
    return (EReference)eStructuralFeatureOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference geteStructuralFeatureOp_Setters()
  {
    return (EReference)eStructuralFeatureOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference geteStructuralFeatureOp_Complex()
  {
    return (EReference)eStructuralFeatureOpEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHANGEATTRIBUTE()
  {
    return changeattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHANGEATTRIBUTE_RefAttr()
  {
    return (EReference)changeattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADDATTRIBUTE()
  {
    return addattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDATTRIBUTE_New()
  {
    return (EAttribute)addattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDELETEATTRIBUTE()
  {
    return deleteattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDELETEATTRIBUTE_RefAttr()
  {
    return (EReference)deleteattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRENAMEATTRIBUTE()
  {
    return renameattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRENAMEATTRIBUTE_RefAttr()
  {
    return (EReference)renameattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRENAMEATTRIBUTE_NewName()
  {
    return (EAttribute)renameattributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOVEATTRIBUTE()
  {
    return moveattributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMOVEATTRIBUTE_RefAttr()
  {
    return (EReference)moveattributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMOVEATTRIBUTE_Dst()
  {
    return (EReference)moveattributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureSetters()
  {
    return featureSettersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureSetters_Metafeature()
  {
    return (EReference)featureSettersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureSetters_ValueEString()
  {
    return (EAttribute)featureSettersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureSetters_ValueEInt()
  {
    return (EAttribute)featureSettersEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureSetters_ValueEBool()
  {
    return (EAttribute)featureSettersEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureSetters_ValueRef()
  {
    return (EReference)featureSettersEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureSetters_ValueFeature()
  {
    return (EReference)featureSettersEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeOp()
  {
    return attributeOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeOp_Var()
  {
    return (EReference)attributeOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCHANGEREFERENCE()
  {
    return changereferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCHANGEREFERENCE_RefRef()
  {
    return (EReference)changereferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getADDREFERENCE()
  {
    return addreferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getADDREFERENCE_New()
  {
    return (EAttribute)addreferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDELETEREFERENCE()
  {
    return deletereferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDELETEREFERENCE_RefRef()
  {
    return (EReference)deletereferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMOVEREFERENCE()
  {
    return movereferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMOVEREFERENCE_RefRef()
  {
    return (EReference)movereferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMOVEREFERENCE_Dst()
  {
    return (EReference)movereferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfeatureSetters_def()
  {
    return featureSetters_defEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfeatureSetters_def_LowerBound()
  {
    return (EAttribute)featureSetters_defEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfeatureSetters_def_EType()
  {
    return (EReference)featureSetters_defEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfeatureSetters_def_Opposite()
  {
    return (EReference)featureSetters_defEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getfeatureSetters_def_Name()
  {
    return (EAttribute)featureSetters_defEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceOp()
  {
    return referenceOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceOp_Var()
  {
    return (EReference)referenceOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceOp_CHANGE_op()
  {
    return (EReference)referenceOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexOperator()
  {
    return complexOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComplexOperator_Name()
  {
    return (EAttribute)complexOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_Params()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_ClassOperations()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_AttributeOperations()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexOperator_ReferenceOperations()
  {
    return (EReference)complexOperatorEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getINT()
  {
    return intEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getINT_Name()
  {
    return (EAttribute)intEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTRING()
  {
    return stringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTRING_Name()
  {
    return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTRING_Operator()
  {
    return (EAttribute)stringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEBoolPar()
  {
    return eBoolParEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEBoolPar_Name()
  {
    return (EAttribute)eBoolParEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallOperator()
  {
    return callOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallOperator_Fun()
  {
    return (EReference)callOperatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCallOperator_Args()
  {
    return (EReference)callOperatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgument_Arg()
  {
    return (EReference)argumentEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getMigrationProgram_Path()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationProgram_TransformationPackage()
  {
    return (EReference)migrationProgramEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMigrationProgram_Delta()
  {
    return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigrationProgram_Rules()
  {
    return (EReference)migrationProgramEClass.getEStructuralFeatures().get(5);
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
  public EAttribute getMigratorSX_Name()
  {
    return (EAttribute)migratorSXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorSX_FilterSX()
  {
    return (EReference)migratorSXEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getMigratorDX_Name()
  {
    return (EAttribute)migratorDXEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMigratorDX_FilterDX()
  {
    return (EReference)migratorDXEClass.getEStructuralFeatures().get(2);
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
  public EReference getFilterMigrator_Feature()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_InternalFeature()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_Op()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_Dxobj()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterMigrator_Dxgetters()
  {
    return (EReference)filterMigratorEClass.getEStructuralFeatures().get(4);
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
  public EClass getClassifier()
  {
    return classifierEClass;
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
  public EClass getEReferencePar()
  {
    return eReferenceParEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEAttributePar()
  {
    return eAttributeParEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEClassPar()
  {
    return eClassParEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEPackagePar()
  {
    return ePackageParEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationFactory getMigrationFactory()
  {
    return (MigrationFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGES);
    createEAttribute(modelEClass, MODEL__TITLE);
    createEReference(modelEClass, MODEL__OPERATORS);
    createEReference(modelEClass, MODEL__MIGRATION_PROGR);

    packageSettersEClass = createEClass(PACKAGE_SETTERS);
    createEReference(packageSettersEClass, PACKAGE_SETTERS__METAFEATURE);
    createEAttribute(packageSettersEClass, PACKAGE_SETTERS__VALUE);
    createEReference(packageSettersEClass, PACKAGE_SETTERS__VALUE_REF);

    packageSetters_defEClass = createEClass(PACKAGE_SETTERS_DEF);
    createEReference(packageSetters_defEClass, PACKAGE_SETTERS_DEF__METAFEATURE);
    createEAttribute(packageSetters_defEClass, PACKAGE_SETTERS_DEF__PAR);

    setNsUriEClass = createEClass(SET_NS_URI);
    createEAttribute(setNsUriEClass, SET_NS_URI__OP);
    createEAttribute(setNsUriEClass, SET_NS_URI__NS_URI);

    setNsUri_defEClass = createEClass(SET_NS_URI_DEF);
    createEAttribute(setNsUri_defEClass, SET_NS_URI_DEF__OP);
    createEAttribute(setNsUri_defEClass, SET_NS_URI_DEF__NS_URI);

    setNsPrefixEClass = createEClass(SET_NS_PREFIX);
    createEAttribute(setNsPrefixEClass, SET_NS_PREFIX__OP);
    createEAttribute(setNsPrefixEClass, SET_NS_PREFIX__NS_PREFIX);

    setNsPrefix_defEClass = createEClass(SET_NS_PREFIX_DEF);
    createEAttribute(setNsPrefix_defEClass, SET_NS_PREFIX_DEF__OP);
    createEAttribute(setNsPrefix_defEClass, SET_NS_PREFIX_DEF__NS_PREFIX);

    changepackageEClass = createEClass(CHANGEPACKAGE);
    createEAttribute(changepackageEClass, CHANGEPACKAGE__OP);
    createEReference(changepackageEClass, CHANGEPACKAGE__REF);

    addpackageEClass = createEClass(ADDPACKAGE);
    createEAttribute(addpackageEClass, ADDPACKAGE__OP);
    createEAttribute(addpackageEClass, ADDPACKAGE__NEW);

    deletepackageEClass = createEClass(DELETEPACKAGE);
    createEAttribute(deletepackageEClass, DELETEPACKAGE__OP);
    createEReference(deletepackageEClass, DELETEPACKAGE__REF);

    packageOpEClass = createEClass(PACKAGE_OP);
    createEReference(packageOpEClass, PACKAGE_OP__VAR);
    createEReference(packageOpEClass, PACKAGE_OP__OP);
    createEReference(packageOpEClass, PACKAGE_OP__SETTERS);
    createEReference(packageOpEClass, PACKAGE_OP__CLASSES);
    createEReference(packageOpEClass, PACKAGE_OP__COMPLEX);

    opDefEClass = createEClass(OP_DEF);
    createEAttribute(opDefEClass, OP_DEF__OPDEF);
    createEReference(opDefEClass, OP_DEF__REF);
    createEReference(opDefEClass, OP_DEF__SETTERSDEF);
    createEReference(opDefEClass, OP_DEF__COMPLEX);
    createEAttribute(opDefEClass, OP_DEF__STRING);
    createEReference(opDefEClass, OP_DEF__DST);
    createEReference(opDefEClass, OP_DEF__FEATURE_SETTERSDEF);

    changeclassEClass = createEClass(CHANGECLASS);
    createEAttribute(changeclassEClass, CHANGECLASS__OP);
    createEReference(changeclassEClass, CHANGECLASS__REF);

    addclassEClass = createEClass(ADDCLASS);
    createEAttribute(addclassEClass, ADDCLASS__OP);
    createEAttribute(addclassEClass, ADDCLASS__NEW);

    deleteclassEClass = createEClass(DELETECLASS);
    createEAttribute(deleteclassEClass, DELETECLASS__OP);
    createEReference(deleteclassEClass, DELETECLASS__REF);

    classSetterEClass = createEClass(CLASS_SETTER);
    createEReference(classSetterEClass, CLASS_SETTER__METAFEATURE);
    createEAttribute(classSetterEClass, CLASS_SETTER__VALUE);
    createEReference(classSetterEClass, CLASS_SETTER__VALUE_REF);

    classSetters_defEClass = createEClass(CLASS_SETTERS_DEF);
    createEReference(classSetters_defEClass, CLASS_SETTERS_DEF__METAFEATURE);
    createEReference(classSetters_defEClass, CLASS_SETTERS_DEF__PAR);

    classOpEClass = createEClass(CLASS_OP);
    createEReference(classOpEClass, CLASS_OP__VAR);
    createEReference(classOpEClass, CLASS_OP__OP);
    createEReference(classOpEClass, CLASS_OP__SETTERS);
    createEReference(classOpEClass, CLASS_OP__ATTRIBUTES);
    createEReference(classOpEClass, CLASS_OP__REFERENCES);
    createEReference(classOpEClass, CLASS_OP__COMPLEX);

    eStructuralFeatureOpEClass = createEClass(ESTRUCTURAL_FEATURE_OP);
    createEReference(eStructuralFeatureOpEClass, ESTRUCTURAL_FEATURE_OP__OP);
    createEReference(eStructuralFeatureOpEClass, ESTRUCTURAL_FEATURE_OP__SETTERS);
    createEReference(eStructuralFeatureOpEClass, ESTRUCTURAL_FEATURE_OP__COMPLEX);

    changeattributeEClass = createEClass(CHANGEATTRIBUTE);
    createEReference(changeattributeEClass, CHANGEATTRIBUTE__REF_ATTR);

    addattributeEClass = createEClass(ADDATTRIBUTE);
    createEAttribute(addattributeEClass, ADDATTRIBUTE__NEW);

    deleteattributeEClass = createEClass(DELETEATTRIBUTE);
    createEReference(deleteattributeEClass, DELETEATTRIBUTE__REF_ATTR);

    renameattributeEClass = createEClass(RENAMEATTRIBUTE);
    createEReference(renameattributeEClass, RENAMEATTRIBUTE__REF_ATTR);
    createEAttribute(renameattributeEClass, RENAMEATTRIBUTE__NEW_NAME);

    moveattributeEClass = createEClass(MOVEATTRIBUTE);
    createEReference(moveattributeEClass, MOVEATTRIBUTE__REF_ATTR);
    createEReference(moveattributeEClass, MOVEATTRIBUTE__DST);

    featureSettersEClass = createEClass(FEATURE_SETTERS);
    createEReference(featureSettersEClass, FEATURE_SETTERS__METAFEATURE);
    createEAttribute(featureSettersEClass, FEATURE_SETTERS__VALUE_ESTRING);
    createEAttribute(featureSettersEClass, FEATURE_SETTERS__VALUE_EINT);
    createEAttribute(featureSettersEClass, FEATURE_SETTERS__VALUE_EBOOL);
    createEReference(featureSettersEClass, FEATURE_SETTERS__VALUE_REF);
    createEReference(featureSettersEClass, FEATURE_SETTERS__VALUE_FEATURE);

    attributeOpEClass = createEClass(ATTRIBUTE_OP);
    createEReference(attributeOpEClass, ATTRIBUTE_OP__VAR);

    changereferenceEClass = createEClass(CHANGEREFERENCE);
    createEReference(changereferenceEClass, CHANGEREFERENCE__REF_REF);

    addreferenceEClass = createEClass(ADDREFERENCE);
    createEAttribute(addreferenceEClass, ADDREFERENCE__NEW);

    deletereferenceEClass = createEClass(DELETEREFERENCE);
    createEReference(deletereferenceEClass, DELETEREFERENCE__REF_REF);

    movereferenceEClass = createEClass(MOVEREFERENCE);
    createEReference(movereferenceEClass, MOVEREFERENCE__REF_REF);
    createEReference(movereferenceEClass, MOVEREFERENCE__DST);

    featureSetters_defEClass = createEClass(FEATURE_SETTERS_DEF);
    createEAttribute(featureSetters_defEClass, FEATURE_SETTERS_DEF__LOWER_BOUND);
    createEReference(featureSetters_defEClass, FEATURE_SETTERS_DEF__ETYPE);
    createEReference(featureSetters_defEClass, FEATURE_SETTERS_DEF__OPPOSITE);
    createEAttribute(featureSetters_defEClass, FEATURE_SETTERS_DEF__NAME);

    referenceOpEClass = createEClass(REFERENCE_OP);
    createEReference(referenceOpEClass, REFERENCE_OP__VAR);
    createEReference(referenceOpEClass, REFERENCE_OP__CHANGE_OP);

    complexOperatorEClass = createEClass(COMPLEX_OPERATOR);
    createEAttribute(complexOperatorEClass, COMPLEX_OPERATOR__NAME);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__PARAMS);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__CLASS_OPERATIONS);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS);
    createEReference(complexOperatorEClass, COMPLEX_OPERATOR__REFERENCE_OPERATIONS);

    intEClass = createEClass(INT);
    createEAttribute(intEClass, INT__NAME);

    stringEClass = createEClass(STRING);
    createEAttribute(stringEClass, STRING__NAME);
    createEAttribute(stringEClass, STRING__OPERATOR);

    eBoolParEClass = createEClass(EBOOL_PAR);
    createEAttribute(eBoolParEClass, EBOOL_PAR__NAME);

    callOperatorEClass = createEClass(CALL_OPERATOR);
    createEReference(callOperatorEClass, CALL_OPERATOR__FUN);
    createEReference(callOperatorEClass, CALL_OPERATOR__ARGS);

    argumentEClass = createEClass(ARGUMENT);
    createEReference(argumentEClass, ARGUMENT__ARG);

    migrationProgramEClass = createEClass(MIGRATION_PROGRAM);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__LIBS);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__MIGR);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__PATH);
    createEReference(migrationProgramEClass, MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE);
    createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__DELTA);
    createEReference(migrationProgramEClass, MIGRATION_PROGRAM__RULES);

    ruleEClass = createEClass(RULE);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__FILTER);
    createEReference(ruleEClass, RULE__REWRITING_RULES);

    rewritingRuleEClass = createEClass(REWRITING_RULE);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATORS_SX);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATOR_DX);
    createEReference(rewritingRuleEClass, REWRITING_RULE__MIGRATOR_SX);

    migratorSXEClass = createEClass(MIGRATOR_SX);
    createEReference(migratorSXEClass, MIGRATOR_SX__ELEMENT_SX);
    createEAttribute(migratorSXEClass, MIGRATOR_SX__NAME);
    createEReference(migratorSXEClass, MIGRATOR_SX__FILTER_SX);

    migratorDXEClass = createEClass(MIGRATOR_DX);
    createEReference(migratorDXEClass, MIGRATOR_DX__ELEMENT_DX);
    createEAttribute(migratorDXEClass, MIGRATOR_DX__NAME);
    createEReference(migratorDXEClass, MIGRATOR_DX__FILTER_DX);

    filterMigratorEClass = createEClass(FILTER_MIGRATOR);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__FEATURE);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__INTERNAL_FEATURE);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__OP);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__DXOBJ);
    createEReference(filterMigratorEClass, FILTER_MIGRATOR__DXGETTERS);

    packageEClass = createEClass(PACKAGE);

    classEClass = createEClass(CLASS);

    classifierEClass = createEClass(CLASSIFIER);

    attributeEClass = createEClass(ATTRIBUTE);

    referenceEClass = createEClass(REFERENCE);

    eReferenceParEClass = createEClass(EREFERENCE_PAR);

    eAttributeParEClass = createEClass(EATTRIBUTE_PAR);

    eClassParEClass = createEClass(ECLASS_PAR);

    ePackageParEClass = createEClass(EPACKAGE_PAR);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    attributeOpEClass.getESuperTypes().add(this.geteStructuralFeatureOp());
    referenceOpEClass.getESuperTypes().add(this.geteStructuralFeatureOp());
    packageEClass.getESuperTypes().add(ecorePackage.getEPackage());
    classEClass.getESuperTypes().add(ecorePackage.getEClass());
    classifierEClass.getESuperTypes().add(ecorePackage.getEClassifier());
    attributeEClass.getESuperTypes().add(ecorePackage.getEAttribute());
    referenceEClass.getESuperTypes().add(ecorePackage.getEReference());
    eReferenceParEClass.getESuperTypes().add(ecorePackage.getEReference());
    eAttributeParEClass.getESuperTypes().add(ecorePackage.getEAttribute());
    eClassParEClass.getESuperTypes().add(ecorePackage.getEClass());
    ePackageParEClass.getESuperTypes().add(ecorePackage.getEPackage());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Packages(), this.getPackageOp(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Title(), ecorePackage.getEString(), "title", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Operators(), this.getComplexOperator(), null, "operators", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_MigrationProgr(), this.getMigrationProgram(), null, "MigrationProgr", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageSettersEClass, packageSetters.class, "packageSetters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpackageSetters_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, packageSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpackageSetters_Value(), ecorePackage.getEString(), "value", null, 0, 1, packageSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getpackageSetters_ValueRef(), ecorePackage.getEObject(), null, "valueRef", null, 0, -1, packageSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageSetters_defEClass, packageSetters_def.class, "packageSetters_def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getpackageSetters_def_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, packageSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpackageSetters_def_Par(), ecorePackage.getEString(), "par", null, 0, 1, packageSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setNsUriEClass, setNsUri.class, "setNsUri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsetNsUri_Op(), ecorePackage.getEString(), "op", null, 0, 1, setNsUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetNsUri_NsURI(), ecorePackage.getEString(), "nsURI", null, 0, 1, setNsUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setNsUri_defEClass, setNsUri_def.class, "setNsUri_def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsetNsUri_def_Op(), ecorePackage.getEString(), "op", null, 0, 1, setNsUri_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetNsUri_def_NsUri(), ecorePackage.getEString(), "nsUri", null, 0, 1, setNsUri_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setNsPrefixEClass, setNsPrefix.class, "setNsPrefix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsetNsPrefix_Op(), ecorePackage.getEString(), "op", null, 0, 1, setNsPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetNsPrefix_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, setNsPrefix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setNsPrefix_defEClass, setNsPrefix_def.class, "setNsPrefix_def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getsetNsPrefix_def_Op(), ecorePackage.getEString(), "op", null, 0, 1, setNsPrefix_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getsetNsPrefix_def_NsPrefix(), ecorePackage.getEString(), "nsPrefix", null, 0, 1, setNsPrefix_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changepackageEClass, it.univaq.coevolution.migration.CHANGEPACKAGE.class, "CHANGEPACKAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCHANGEPACKAGE_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.CHANGEPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCHANGEPACKAGE_Ref(), ecorePackage.getEPackage(), null, "ref", null, 0, 1, it.univaq.coevolution.migration.CHANGEPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addpackageEClass, it.univaq.coevolution.migration.ADDPACKAGE.class, "ADDPACKAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getADDPACKAGE_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.ADDPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getADDPACKAGE_New(), ecorePackage.getEString(), "new", null, 0, 1, it.univaq.coevolution.migration.ADDPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deletepackageEClass, it.univaq.coevolution.migration.DELETEPACKAGE.class, "DELETEPACKAGE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDELETEPACKAGE_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.DELETEPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDELETEPACKAGE_Ref(), ecorePackage.getEPackage(), null, "ref", null, 0, 1, it.univaq.coevolution.migration.DELETEPACKAGE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageOpEClass, PackageOp.class, "PackageOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageOp_Var(), ecorePackage.getEPackage(), null, "var", null, 0, 1, PackageOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageOp_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, PackageOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageOp_Setters(), this.getpackageSetters(), null, "setters", null, 0, -1, PackageOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageOp_Classes(), this.getClassOp(), null, "classes", null, 0, -1, PackageOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPackageOp_Complex(), this.getCallOperator(), null, "complex", null, 0, -1, PackageOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(opDefEClass, OpDef.class, "OpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOpDef_Opdef(), ecorePackage.getEString(), "opdef", null, 0, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_Ref(), ecorePackage.getENamedElement(), null, "ref", null, 0, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_Settersdef(), ecorePackage.getEObject(), null, "settersdef", null, 0, -1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_Complex(), this.getComplexOperator(), null, "complex", null, 0, -1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOpDef_String(), ecorePackage.getEString(), "string", null, 0, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_Dst(), ecorePackage.getEClass(), null, "dst", null, 0, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOpDef_FeatureSettersdef(), this.getfeatureSetters_def(), null, "FeatureSettersdef", null, 0, -1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeclassEClass, it.univaq.coevolution.migration.CHANGECLASS.class, "CHANGECLASS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCHANGECLASS_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.CHANGECLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCHANGECLASS_Ref(), ecorePackage.getEClass(), null, "ref", null, 0, 1, it.univaq.coevolution.migration.CHANGECLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addclassEClass, it.univaq.coevolution.migration.ADDCLASS.class, "ADDCLASS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getADDCLASS_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.ADDCLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getADDCLASS_New(), ecorePackage.getEString(), "new", null, 0, 1, it.univaq.coevolution.migration.ADDCLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteclassEClass, it.univaq.coevolution.migration.DELETECLASS.class, "DELETECLASS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDELETECLASS_Op(), ecorePackage.getEString(), "op", null, 0, 1, it.univaq.coevolution.migration.DELETECLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDELETECLASS_Ref(), ecorePackage.getEClass(), null, "ref", null, 0, 1, it.univaq.coevolution.migration.DELETECLASS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classSetterEClass, classSetter.class, "classSetter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getclassSetter_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, classSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getclassSetter_Value(), ecorePackage.getEString(), "value", null, 0, 1, classSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclassSetter_ValueRef(), ecorePackage.getEObject(), null, "valueRef", null, 0, -1, classSetter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classSetters_defEClass, classSetters_def.class, "classSetters_def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getclassSetters_def_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, classSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getclassSetters_def_Par(), ecorePackage.getEObject(), null, "par", null, 0, -1, classSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classOpEClass, ClassOp.class, "ClassOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassOp_Var(), ecorePackage.getEClass(), null, "var", null, 0, 1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassOp_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassOp_Setters(), this.getclassSetter(), null, "setters", null, 0, -1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassOp_Attributes(), this.getAttributeOp(), null, "attributes", null, 0, -1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassOp_References(), this.getReferenceOp(), null, "references", null, 0, -1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassOp_Complex(), this.getCallOperator(), null, "complex", null, 0, -1, ClassOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eStructuralFeatureOpEClass, eStructuralFeatureOp.class, "eStructuralFeatureOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(geteStructuralFeatureOp_Op(), ecorePackage.getEObject(), null, "op", null, 0, 1, eStructuralFeatureOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(geteStructuralFeatureOp_Setters(), this.getFeatureSetters(), null, "setters", null, 0, -1, eStructuralFeatureOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(geteStructuralFeatureOp_Complex(), this.getCallOperator(), null, "complex", null, 0, -1, eStructuralFeatureOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changeattributeEClass, it.univaq.coevolution.migration.CHANGEATTRIBUTE.class, "CHANGEATTRIBUTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCHANGEATTRIBUTE_RefAttr(), ecorePackage.getEAttribute(), null, "refAttr", null, 0, 1, it.univaq.coevolution.migration.CHANGEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addattributeEClass, it.univaq.coevolution.migration.ADDATTRIBUTE.class, "ADDATTRIBUTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getADDATTRIBUTE_New(), ecorePackage.getEString(), "new", null, 0, 1, it.univaq.coevolution.migration.ADDATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deleteattributeEClass, it.univaq.coevolution.migration.DELETEATTRIBUTE.class, "DELETEATTRIBUTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDELETEATTRIBUTE_RefAttr(), ecorePackage.getEAttribute(), null, "refAttr", null, 0, 1, it.univaq.coevolution.migration.DELETEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(renameattributeEClass, it.univaq.coevolution.migration.RENAMEATTRIBUTE.class, "RENAMEATTRIBUTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRENAMEATTRIBUTE_RefAttr(), ecorePackage.getEAttribute(), null, "refAttr", null, 0, 1, it.univaq.coevolution.migration.RENAMEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRENAMEATTRIBUTE_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, it.univaq.coevolution.migration.RENAMEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moveattributeEClass, it.univaq.coevolution.migration.MOVEATTRIBUTE.class, "MOVEATTRIBUTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMOVEATTRIBUTE_RefAttr(), ecorePackage.getEAttribute(), null, "refAttr", null, 0, 1, it.univaq.coevolution.migration.MOVEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMOVEATTRIBUTE_Dst(), ecorePackage.getEClass(), null, "dst", null, 0, 1, it.univaq.coevolution.migration.MOVEATTRIBUTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureSettersEClass, FeatureSetters.class, "FeatureSetters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureSetters_Metafeature(), ecorePackage.getEStructuralFeature(), null, "metafeature", null, 0, 1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureSetters_ValueEString(), ecorePackage.getEString(), "valueEString", null, 0, 1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureSetters_ValueEInt(), ecorePackage.getEInt(), "valueEInt", null, 0, 1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFeatureSetters_ValueEBool(), ecorePackage.getEBoolean(), "valueEBool", null, 0, 1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureSetters_ValueRef(), ecorePackage.getEObject(), null, "valueRef", null, 0, -1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureSetters_ValueFeature(), ecorePackage.getEStructuralFeature(), null, "valueFeature", null, 0, 1, FeatureSetters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeOpEClass, AttributeOp.class, "AttributeOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeOp_Var(), ecorePackage.getEAttribute(), null, "var", null, 0, 1, AttributeOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(changereferenceEClass, it.univaq.coevolution.migration.CHANGEREFERENCE.class, "CHANGEREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCHANGEREFERENCE_RefRef(), ecorePackage.getEReference(), null, "refRef", null, 0, 1, it.univaq.coevolution.migration.CHANGEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addreferenceEClass, it.univaq.coevolution.migration.ADDREFERENCE.class, "ADDREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getADDREFERENCE_New(), ecorePackage.getEString(), "new", null, 0, 1, it.univaq.coevolution.migration.ADDREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deletereferenceEClass, it.univaq.coevolution.migration.DELETEREFERENCE.class, "DELETEREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDELETEREFERENCE_RefRef(), ecorePackage.getEReference(), null, "refRef", null, 0, 1, it.univaq.coevolution.migration.DELETEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(movereferenceEClass, it.univaq.coevolution.migration.MOVEREFERENCE.class, "MOVEREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMOVEREFERENCE_RefRef(), ecorePackage.getEReference(), null, "refRef", null, 0, 1, it.univaq.coevolution.migration.MOVEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMOVEREFERENCE_Dst(), ecorePackage.getEClass(), null, "dst", null, 0, 1, it.univaq.coevolution.migration.MOVEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureSetters_defEClass, featureSetters_def.class, "featureSetters_def", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getfeatureSetters_def_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, featureSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfeatureSetters_def_EType(), ecorePackage.getEClassifier(), null, "eType", null, 0, 1, featureSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getfeatureSetters_def_Opposite(), ecorePackage.getENamedElement(), null, "opposite", null, 0, 1, featureSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getfeatureSetters_def_Name(), ecorePackage.getEString(), "name", null, 0, 1, featureSetters_def.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceOpEClass, ReferenceOp.class, "ReferenceOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferenceOp_Var(), ecorePackage.getEReference(), null, "var", null, 0, 1, ReferenceOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReferenceOp_CHANGE_op(), this.getCHANGEREFERENCE(), null, "CHANGE_op", null, 0, 1, ReferenceOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexOperatorEClass, ComplexOperator.class, "ComplexOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComplexOperator_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperator_Params(), ecorePackage.getEObject(), null, "params", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperator_ClassOperations(), this.getClassOp(), null, "classOperations", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperator_AttributeOperations(), this.getAttributeOp(), null, "attributeOperations", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComplexOperator_ReferenceOperations(), this.getReferenceOp(), null, "referenceOperations", null, 0, -1, ComplexOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intEClass, it.univaq.coevolution.migration.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getINT_Name(), ecorePackage.getEString(), "name", null, 0, 1, it.univaq.coevolution.migration.INT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringEClass, it.univaq.coevolution.migration.STRING.class, "STRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSTRING_Name(), ecorePackage.getEString(), "name", null, 0, 1, it.univaq.coevolution.migration.STRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSTRING_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, it.univaq.coevolution.migration.STRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eBoolParEClass, EBoolPar.class, "EBoolPar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEBoolPar_Name(), ecorePackage.getEString(), "name", null, 0, 1, EBoolPar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callOperatorEClass, CallOperator.class, "CallOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCallOperator_Fun(), this.getComplexOperator(), null, "fun", null, 0, 1, CallOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCallOperator_Args(), this.getArgument(), null, "args", null, 0, -1, CallOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArgument_Arg(), ecorePackage.getEObject(), null, "arg", null, 0, 1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migrationProgramEClass, MigrationProgram.class, "MigrationProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMigrationProgram_Libs(), ecorePackage.getEString(), "libs", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Migr(), ecorePackage.getEString(), "migr", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Path(), ecorePackage.getEString(), "path", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationProgram_TransformationPackage(), ecorePackage.getEPackage(), null, "transformationPackage", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigrationProgram_Delta(), ecorePackage.getEString(), "delta", null, 0, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigrationProgram_Rules(), this.getRule(), null, "rules", null, 0, -1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Filter(), this.getOpDef(), null, "filter", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_RewritingRules(), this.getRewritingRule(), null, "rewritingRules", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewritingRuleEClass, RewritingRule.class, "RewritingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRewritingRule_MigratorsSX(), this.getMigratorSX(), null, "migratorsSX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewritingRule_MigratorDX(), this.getMigratorDX(), null, "migratorDX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewritingRule_MigratorSX(), this.getMigratorSX(), null, "migratorSX", null, 0, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migratorSXEClass, MigratorSX.class, "MigratorSX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigratorSX_ElementSX(), ecorePackage.getEClass(), null, "elementSX", null, 0, 1, MigratorSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigratorSX_Name(), ecorePackage.getEString(), "name", null, 0, 1, MigratorSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigratorSX_FilterSX(), this.getFilterMigrator(), null, "filterSX", null, 0, -1, MigratorSX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(migratorDXEClass, MigratorDX.class, "MigratorDX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMigratorDX_ElementDX(), ecorePackage.getEClass(), null, "elementDX", null, 0, 1, MigratorDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMigratorDX_Name(), ecorePackage.getEString(), "name", null, 0, 1, MigratorDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMigratorDX_FilterDX(), this.getFilterMigrator(), null, "filterDX", null, 0, -1, MigratorDX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterMigratorEClass, FilterMigrator.class, "FilterMigrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilterMigrator_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMigrator_InternalFeature(), ecorePackage.getEStructuralFeature(), null, "internalFeature", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMigrator_Op(), this.getSTRING(), null, "op", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMigrator_Dxobj(), ecorePackage.getEObject(), null, "dxobj", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterMigrator_Dxgetters(), ecorePackage.getEStructuralFeature(), null, "dxgetters", null, 0, 1, FilterMigrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, it.univaq.coevolution.migration.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, it.univaq.coevolution.migration.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eReferenceParEClass, EReferencePar.class, "EReferencePar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eAttributeParEClass, EAttributePar.class, "EAttributePar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eClassParEClass, EClassPar.class, "EClassPar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ePackageParEClass, EPackagePar.class, "EPackagePar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //MigrationPackageImpl
