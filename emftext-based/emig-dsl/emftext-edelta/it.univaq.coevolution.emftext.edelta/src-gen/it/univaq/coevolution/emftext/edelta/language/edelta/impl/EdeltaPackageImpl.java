/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.Argument;
import it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator;
import it.univaq.coevolution.emftext.edelta.language.edelta.Attribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef;
import it.univaq.coevolution.emftext.edelta.language.edelta.DataType;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaFactory;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.Entity;
import it.univaq.coevolution.emftext.edelta.language.edelta.EntityModel;
import it.univaq.coevolution.emftext.edelta.language.edelta.Feature;
import it.univaq.coevolution.emftext.edelta.language.edelta.FeatureKind;
import it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Model;
import it.univaq.coevolution.emftext.edelta.language.edelta.Module;
import it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement;
import it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Parameter;
import it.univaq.coevolution.emftext.edelta.language.edelta.Reference;
import it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Setter;
import it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue;
import it.univaq.coevolution.emftext.edelta.language.edelta.Type;

import it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.addClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.addPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.addReference;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.changePackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.changeReference;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass;
import it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdeltaPackageImpl extends EPackageImpl implements EdeltaPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass typeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass dataTypeEClass = null;

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
	private EClass packageOperationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOperationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOperationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceOperationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicOperatorEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addPackageEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletePackageEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changePackageEClass = null;

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
	private EClass modelEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classOperationEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeClassEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteClassEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addClassEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass featureEClass = null;

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
	private EClass addAttributeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteAttributeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttributeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addReferenceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteReferenceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeReferenceEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setterValueEClass = null;

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
  private EEnum featureKindEEnum = null;

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
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EdeltaPackageImpl()
  {
		super(eNS_URI, EdeltaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EdeltaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EdeltaPackage init()
  {
		if (isInited) return (EdeltaPackage)EPackage.Registry.INSTANCE.getEPackage(EdeltaPackage.eNS_URI);

		// Obtain or create and register package
		EdeltaPackageImpl theEdeltaPackage = (EdeltaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EdeltaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EdeltaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEdeltaPackage.createPackageContents();

		// Initialize created meta-data
		theEdeltaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdeltaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdeltaPackage.eNS_URI, theEdeltaPackage);
		return theEdeltaPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamedElement()
  {
		return namedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedElement_Name()
  {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getType()
  {
		return typeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDataType()
  {
		return dataTypeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_ClassOp() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageOperation() {
		return packageOperationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageOperation_Classesoperations() {
		return (EReference)packageOperationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageOperation_Setter() {
		return (EReference)packageOperationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOperation() {
		return featureOperationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOperation_Setter() {
		return (EReference)featureOperationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOperation() {
		return attributeOperationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceOperation() {
		return referenceOperationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicOperator() {
		return atomicOperatorEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddPackage() {
		return addPackageEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeletePackage() {
		return deletePackageEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdeletePackage_Ref() {
		return (EReference)deletePackageEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdeletePackage_Ext() {
		return (EAttribute)deletePackageEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchangePackage() {
		return changePackageEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchangePackage_Ref() {
		return (EReference)changePackageEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchangePackage_Ext() {
		return (EAttribute)changePackageEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageOp() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Packageoperations() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Module() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Datatypes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassOperation() {
		return classOperationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperation_Featuresoperations() {
		return (EReference)classOperationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOperation_Setter() {
		return (EReference)classOperationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchangeClass() {
		return changeClassEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchangeClass_Ref() {
		return (EReference)changeClassEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchangeClass_Ext() {
		return (EAttribute)changeClassEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeleteClass() {
		return deleteClassEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdeleteClass_Ref() {
		return (EReference)deleteClassEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdeleteClass_Ext() {
		return (EAttribute)deleteClassEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddClass() {
		return addClassEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFeature()
  {
		return featureEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_FeaturesOp() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_FeaturesOp() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddAttribute() {
		return addAttributeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeleteAttribute() {
		return deleteAttributeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdeleteAttribute_Ref() {
		return (EReference)deleteAttributeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdeleteAttribute_Ext() {
		return (EAttribute)deleteAttributeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchangeAttribute() {
		return changeAttributeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchangeAttribute_Ref() {
		return (EReference)changeAttributeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchangeAttribute_Ext() {
		return (EAttribute)changeAttributeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddReference() {
		return addReferenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdeleteReference() {
		return deleteReferenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdeleteReference_Ref() {
		return (EReference)deleteReferenceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdeleteReference_Ext() {
		return (EAttribute)deleteReferenceEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getchangeReference() {
		return changeReferenceEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getchangeReference_Ref() {
		return (EReference)changeReferenceEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getchangeReference_Ext() {
		return (EAttribute)changeReferenceEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetter() {
		return setterEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetter_Metafeature() {
		return (EAttribute)setterEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetter_Value() {
		return (EReference)setterEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetterValue() {
		return setterValueEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetterValue_Feature() {
		return (EAttribute)setterValueEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Type() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_RefType() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFeatureKind()
  {
		return featureKindEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdeltaFactory getEdeltaFactory()
  {
		return (EdeltaFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		typeEClass = createEClass(TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__CLASS_OP);

		packageOperationEClass = createEClass(PACKAGE_OPERATION);
		createEReference(packageOperationEClass, PACKAGE_OPERATION__CLASSESOPERATIONS);
		createEReference(packageOperationEClass, PACKAGE_OPERATION__SETTER);

		featureOperationEClass = createEClass(FEATURE_OPERATION);
		createEReference(featureOperationEClass, FEATURE_OPERATION__SETTER);

		attributeOperationEClass = createEClass(ATTRIBUTE_OPERATION);

		referenceOperationEClass = createEClass(REFERENCE_OPERATION);

		atomicOperatorEClass = createEClass(ATOMIC_OPERATOR);

		addPackageEClass = createEClass(ADD_PACKAGE);

		deletePackageEClass = createEClass(DELETE_PACKAGE);
		createEReference(deletePackageEClass, DELETE_PACKAGE__REF);
		createEAttribute(deletePackageEClass, DELETE_PACKAGE__EXT);

		changePackageEClass = createEClass(CHANGE_PACKAGE);
		createEReference(changePackageEClass, CHANGE_PACKAGE__REF);
		createEAttribute(changePackageEClass, CHANGE_PACKAGE__EXT);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__PACKAGE_OP);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PACKAGEOPERATIONS);
		createEReference(modelEClass, MODEL__MODULE);
		createEReference(modelEClass, MODEL__DATATYPES);

		moduleEClass = createEClass(MODULE);

		classOperationEClass = createEClass(CLASS_OPERATION);
		createEReference(classOperationEClass, CLASS_OPERATION__FEATURESOPERATIONS);
		createEReference(classOperationEClass, CLASS_OPERATION__SETTER);

		changeClassEClass = createEClass(CHANGE_CLASS);
		createEReference(changeClassEClass, CHANGE_CLASS__REF);
		createEAttribute(changeClassEClass, CHANGE_CLASS__EXT);

		deleteClassEClass = createEClass(DELETE_CLASS);
		createEReference(deleteClassEClass, DELETE_CLASS__REF);
		createEAttribute(deleteClassEClass, DELETE_CLASS__EXT);

		addClassEClass = createEClass(ADD_CLASS);

		featureEClass = createEClass(FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__FEATURES_OP);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__FEATURES_OP);

		addAttributeEClass = createEClass(ADD_ATTRIBUTE);

		deleteAttributeEClass = createEClass(DELETE_ATTRIBUTE);
		createEReference(deleteAttributeEClass, DELETE_ATTRIBUTE__REF);
		createEAttribute(deleteAttributeEClass, DELETE_ATTRIBUTE__EXT);

		changeAttributeEClass = createEClass(CHANGE_ATTRIBUTE);
		createEReference(changeAttributeEClass, CHANGE_ATTRIBUTE__REF);
		createEAttribute(changeAttributeEClass, CHANGE_ATTRIBUTE__EXT);

		addReferenceEClass = createEClass(ADD_REFERENCE);

		deleteReferenceEClass = createEClass(DELETE_REFERENCE);
		createEReference(deleteReferenceEClass, DELETE_REFERENCE__REF);
		createEAttribute(deleteReferenceEClass, DELETE_REFERENCE__EXT);

		changeReferenceEClass = createEClass(CHANGE_REFERENCE);
		createEReference(changeReferenceEClass, CHANGE_REFERENCE__REF);
		createEAttribute(changeReferenceEClass, CHANGE_REFERENCE__EXT);

		setterEClass = createEClass(SETTER);
		createEAttribute(setterEClass, SETTER__METAFEATURE);
		createEReference(setterEClass, SETTER__VALUE);

		setterValueEClass = createEClass(SETTER_VALUE);
		createEAttribute(setterValueEClass, SETTER_VALUE__FEATURE);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEReference(parameterEClass, PARAMETER__REF_TYPE);

		// Create enums
		featureKindEEnum = createEEnum(FEATURE_KIND);
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
		dataTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getNamedElement());
		classEClass.getESuperTypes().add(this.getNamedElement());
		classEClass.getESuperTypes().add(this.getType());
		attributeOperationEClass.getESuperTypes().add(this.getFeatureOperation());
		referenceOperationEClass.getESuperTypes().add(this.getFeatureOperation());
		addPackageEClass.getESuperTypes().add(this.getPackageOperation());
		addPackageEClass.getESuperTypes().add(this.getNamedElement());
		deletePackageEClass.getESuperTypes().add(this.getPackageOperation());
		changePackageEClass.getESuperTypes().add(this.getPackageOperation());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getType());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		changeClassEClass.getESuperTypes().add(this.getClassOperation());
		deleteClassEClass.getESuperTypes().add(this.getClassOperation());
		addClassEClass.getESuperTypes().add(this.getClassOperation());
		addClassEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getType());
		attributeEClass.getESuperTypes().add(this.getFeature());
		referenceEClass.getESuperTypes().add(this.getFeature());
		addAttributeEClass.getESuperTypes().add(this.getAttributeOperation());
		addAttributeEClass.getESuperTypes().add(this.getNamedElement());
		deleteAttributeEClass.getESuperTypes().add(this.getAttributeOperation());
		changeAttributeEClass.getESuperTypes().add(this.getAttributeOperation());
		addReferenceEClass.getESuperTypes().add(this.getReferenceOperation());
		addReferenceEClass.getESuperTypes().add(this.getNamedElement());
		deleteReferenceEClass.getESuperTypes().add(this.getReferenceOperation());
		changeReferenceEClass.getESuperTypes().add(this.getReferenceOperation());
		setterValueEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, it.univaq.coevolution.emftext.edelta.language.edelta.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_ClassOp(), this.getClassOperation(), null, "classOp", null, 1, 1, it.univaq.coevolution.emftext.edelta.language.edelta.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageOperationEClass, PackageOperation.class, "PackageOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageOperation_Classesoperations(), this.getClass_(), null, "classesoperations", null, 0, -1, PackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageOperation_Setter(), this.getSetter(), null, "setter", null, 0, -1, PackageOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureOperationEClass, FeatureOperation.class, "FeatureOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOperation_Setter(), this.getSetter(), null, "setter", null, 0, -1, FeatureOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOperationEClass, AttributeOperation.class, "AttributeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceOperationEClass, ReferenceOperation.class, "ReferenceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicOperatorEClass, AtomicOperator.class, "AtomicOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addPackageEClass, addPackage.class, "addPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deletePackageEClass, deletePackage.class, "deletePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdeletePackage_Ref(), this.getPackage(), null, "ref", null, 1, 1, deletePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdeletePackage_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, deletePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changePackageEClass, changePackage.class, "changePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchangePackage_Ref(), this.getPackage(), null, "ref", null, 1, 1, changePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchangePackage_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, changePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, it.univaq.coevolution.emftext.edelta.language.edelta.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_PackageOp(), this.getPackageOperation(), null, "packageOp", null, 1, 1, it.univaq.coevolution.emftext.edelta.language.edelta.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Packageoperations(), this.getPackage(), null, "packageoperations", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Module(), this.getModule(), null, "module", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Datatypes(), this.getDataType(), null, "datatypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classOperationEClass, ClassOperation.class, "ClassOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOperation_Featuresoperations(), this.getFeature(), null, "featuresoperations", null, 0, -1, ClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOperation_Setter(), this.getSetter(), null, "setter", null, 0, -1, ClassOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeClassEClass, changeClass.class, "changeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchangeClass_Ref(), this.getClass_(), null, "ref", null, 1, 1, changeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchangeClass_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, changeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteClassEClass, deleteClass.class, "deleteClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdeleteClass_Ref(), this.getClass_(), null, "ref", null, 1, 1, deleteClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdeleteClass_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, deleteClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addClassEClass, addClass.class, "addClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_FeaturesOp(), this.getAttributeOperation(), null, "featuresOp", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_FeaturesOp(), this.getReferenceOperation(), null, "featuresOp", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAttributeEClass, addAttribute.class, "addAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteAttributeEClass, deleteAttribute.class, "deleteAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdeleteAttribute_Ref(), this.getAttribute(), null, "ref", null, 0, 1, deleteAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdeleteAttribute_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, deleteAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAttributeEClass, changeAttribute.class, "changeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchangeAttribute_Ref(), this.getAttribute(), null, "ref", null, 0, 1, changeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchangeAttribute_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, changeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addReferenceEClass, addReference.class, "addReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteReferenceEClass, deleteReference.class, "deleteReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdeleteReference_Ref(), this.getReference(), null, "ref", null, 0, 1, deleteReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdeleteReference_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, deleteReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeReferenceEClass, changeReference.class, "changeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getchangeReference_Ref(), this.getReference(), null, "ref", null, 0, 1, changeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getchangeReference_Ext(), ecorePackage.getEString(), "ext", null, 1, 1, changeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setterEClass, Setter.class, "Setter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetter_Metafeature(), ecorePackage.getEString(), "metafeature", null, 1, 1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetter_Value(), this.getSetterValue(), null, "value", null, 1, 1, Setter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setterValueEClass, SetterValue.class, "SetterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetterValue_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, SetterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_RefType(), this.getType(), null, "refType", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(featureKindEEnum, FeatureKind.class, "FeatureKind");
		addEEnumLiteral(featureKindEEnum, FeatureKind.ATTRIBUTE);
		addEEnumLiteral(featureKindEEnum, FeatureKind.REFERENCE);
		addEEnumLiteral(featureKindEEnum, FeatureKind.CONTAINMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //EdeltaPackageImpl
