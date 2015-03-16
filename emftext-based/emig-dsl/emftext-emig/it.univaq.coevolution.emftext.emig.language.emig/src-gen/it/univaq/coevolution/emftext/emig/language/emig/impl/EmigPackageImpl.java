/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import static it.univaq.coevolution.emftext.emig.language.emig.EmigPackage.CLASS;
import it.univaq.coevolution.emftext.emig.language.emig.Attribute;
import it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Binding;
import it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.ComplexOperatorCallDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigFactory;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.Feature;
import it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.FilterRuleDef;
import it.univaq.coevolution.emftext.emig.language.emig.FilterRule;
import it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.MParameter;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram;
import it.univaq.coevolution.emftext.emig.language.emig.OpDef;
import it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Reference;
import it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.RewritingRule;
import it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.Rule;
import it.univaq.coevolution.emftext.emig.language.emig.SetterDef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import be.ac.vub.simpleocl.SimpleoclPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmigPackageImpl extends EPackageImpl implements EmigPackage
{
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
	private EClass bindingEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftRuleElementEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightRuleElementEClass = null;

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
	private EClass packageOpDefEClass = null;

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
	private EClass classOpDefEClass = null;

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
	private EClass featureOpDefEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOpDefEClass = null;

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
	private EClass referenceOpDefEClass = null;

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
	private EClass setterDefEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mParameterEClass = null;

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
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EmigPackageImpl()
  {
		super(eNS_URI, EmigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EmigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EmigPackage init()
  {
		if (isInited) return (EmigPackage)EPackage.Registry.INSTANCE.getEPackage(EmigPackage.eNS_URI);

		// Obtain or create and register package
		EmigPackageImpl theEmigPackage = (EmigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EmigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EmigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SimpleoclPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEmigPackage.createPackageContents();

		// Initialize created meta-data
		theEmigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEmigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EmigPackage.eNS_URI, theEmigPackage);
		return theEmigPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationLibrary() {
		return migrationLibraryEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrationProgram() {
		return migrationProgramEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMigrationProgram_Delta() {
		return (EAttribute)migrationProgramEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrationProgram_Model() {
		return (EReference)migrationProgramEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Filter() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RewritingRules() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Where() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRewritingRule() {
		return rewritingRuleEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRewritingRule_Left() {
		return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRewritingRule_Right() {
		return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRewritingRule_Rule() {
		return (EReference)rewritingRuleEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_Expr() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Property() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_RuleElement() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftRuleElement() {
		return leftRuleElementEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeftRuleElement_RewritingRule() {
		return (EReference)leftRuleElementEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightRuleElement() {
		return rightRuleElementEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightRuleElement_RewritingRule() {
		return (EReference)rightRuleElementEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightRuleElement_Binding() {
		return (EReference)rightRuleElementEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpDef() {
		return opDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpDef_Setters() {
		return (EReference)opDefEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpDef_Op() {
		return (EAttribute)opDefEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageOpDef() {
		return packageOpDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageOpDef_ClassesOp() {
		return (EReference)packageOpDefEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageOpDef_PackagePar() {
		return (EReference)packageOpDefEClass.getEStructuralFeatures().get(1);
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
	public EClass getClassOpDef() {
		return classOpDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOpDef_FeatureOp() {
		return (EReference)classOpDefEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassOpDef_ClassPar() {
		return (EReference)classOpDefEClass.getEStructuralFeatures().get(1);
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
	public EClass getFeatureOpDef() {
		return featureOpDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureOpDef_FeatureOpDef() {
		return (EReference)featureOpDefEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOpDef() {
		return attributeOpDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeOpDef_AttributePar() {
		return (EReference)attributeOpDefEClass.getEStructuralFeatures().get(0);
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
	public EClass getReferenceOpDef() {
		return referenceOpDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceOpDef_ReferencePar() {
		return (EReference)referenceOpDefEClass.getEStructuralFeatures().get(0);
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
	public EClass getSetterDef() {
		return setterDefEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetterDef_Metafeature() {
		return (EAttribute)setterDefEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetterDef_ParametersDef() {
		return (EReference)setterDefEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMParameter() {
		return mParameterEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EmigFactory getEmigFactory()
  {
		return (EmigFactory)getEFactoryInstance();
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
		migrationLibraryEClass = createEClass(MIGRATION_LIBRARY);

		migrationProgramEClass = createEClass(MIGRATION_PROGRAM);
		createEReference(migrationProgramEClass, MIGRATION_PROGRAM__MODEL);
		createEAttribute(migrationProgramEClass, MIGRATION_PROGRAM__DELTA);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__FILTER);
		createEReference(ruleEClass, RULE__REWRITING_RULES);
		createEReference(ruleEClass, RULE__WHERE);

		rewritingRuleEClass = createEClass(REWRITING_RULE);
		createEReference(rewritingRuleEClass, REWRITING_RULE__LEFT);
		createEReference(rewritingRuleEClass, REWRITING_RULE__RIGHT);
		createEReference(rewritingRuleEClass, REWRITING_RULE__RULE);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__EXPR);
		createEAttribute(bindingEClass, BINDING__PROPERTY);
		createEReference(bindingEClass, BINDING__RULE_ELEMENT);

		leftRuleElementEClass = createEClass(LEFT_RULE_ELEMENT);
		createEReference(leftRuleElementEClass, LEFT_RULE_ELEMENT__REWRITING_RULE);

		rightRuleElementEClass = createEClass(RIGHT_RULE_ELEMENT);
		createEReference(rightRuleElementEClass, RIGHT_RULE_ELEMENT__REWRITING_RULE);
		createEReference(rightRuleElementEClass, RIGHT_RULE_ELEMENT__BINDING);

		opDefEClass = createEClass(OP_DEF);
		createEReference(opDefEClass, OP_DEF__SETTERS);
		createEAttribute(opDefEClass, OP_DEF__OP);

		packageOpDefEClass = createEClass(PACKAGE_OP_DEF);
		createEReference(packageOpDefEClass, PACKAGE_OP_DEF__CLASSES_OP);
		createEReference(packageOpDefEClass, PACKAGE_OP_DEF__PACKAGE_PAR);

		packageEClass = createEClass(PACKAGE);

		classOpDefEClass = createEClass(CLASS_OP_DEF);
		createEReference(classOpDefEClass, CLASS_OP_DEF__FEATURE_OP);
		createEReference(classOpDefEClass, CLASS_OP_DEF__CLASS_PAR);

		classEClass = createEClass(CLASS);

		featureOpDefEClass = createEClass(FEATURE_OP_DEF);
		createEReference(featureOpDefEClass, FEATURE_OP_DEF__FEATURE_OP_DEF);

		attributeOpDefEClass = createEClass(ATTRIBUTE_OP_DEF);
		createEReference(attributeOpDefEClass, ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR);

		featureEClass = createEClass(FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);

		referenceOpDefEClass = createEClass(REFERENCE_OP_DEF);
		createEReference(referenceOpDefEClass, REFERENCE_OP_DEF__REFERENCE_PAR);

		referenceEClass = createEClass(REFERENCE);

		setterDefEClass = createEClass(SETTER_DEF);
		createEAttribute(setterDefEClass, SETTER_DEF__METAFEATURE);
		createEReference(setterDefEClass, SETTER_DEF__PARAMETERS_DEF);

		mParameterEClass = createEClass(MPARAMETER);
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
		SimpleoclPackage theSimpleoclPackage = (SimpleoclPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleoclPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		migrationLibraryEClass.getESuperTypes().add(theSimpleoclPackage.getModule());
		migrationProgramEClass.getESuperTypes().add(this.getMigrationLibrary());
		ruleEClass.getESuperTypes().add(theSimpleoclPackage.getNamedElement());
		ruleEClass.getESuperTypes().add(theSimpleoclPackage.getModuleElement());
		rewritingRuleEClass.getESuperTypes().add(theSimpleoclPackage.getLocatedElement());
		bindingEClass.getESuperTypes().add(theSimpleoclPackage.getLocatedElement());
		leftRuleElementEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		rightRuleElementEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		opDefEClass.getESuperTypes().add(theSimpleoclPackage.getLocatedElement());
		packageOpDefEClass.getESuperTypes().add(this.getOpDef());
		packageEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		classOpDefEClass.getESuperTypes().add(this.getOpDef());
		classEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		featureOpDefEClass.getESuperTypes().add(this.getOpDef());
		attributeOpDefEClass.getESuperTypes().add(this.getFeatureOpDef());
		featureEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());
		attributeEClass.getESuperTypes().add(this.getFeature());
		referenceOpDefEClass.getESuperTypes().add(this.getFeatureOpDef());
		referenceEClass.getESuperTypes().add(this.getFeature());
		setterDefEClass.getESuperTypes().add(theSimpleoclPackage.getLocatedElement());
		mParameterEClass.getESuperTypes().add(theSimpleoclPackage.getVariableDeclaration());

		// Initialize classes and features; add operations and parameters
		initEClass(migrationLibraryEClass, MigrationLibrary.class, "MigrationLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(migrationProgramEClass, MigrationProgram.class, "MigrationProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigrationProgram_Model(), theSimpleoclPackage.getOclInstanceModel(), null, "model", null, 1, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigrationProgram_Delta(), ecorePackage.getEString(), "delta", null, 1, 1, MigrationProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Filter(), this.getOpDef(), null, "filter", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_RewritingRules(), this.getRewritingRule(), this.getRewritingRule_Rule(), "rewritingRules", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Where(), theSimpleoclPackage.getOclExpression(), null, "where", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rewritingRuleEClass, RewritingRule.class, "RewritingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRewritingRule_Left(), this.getLeftRuleElement(), this.getLeftRuleElement_RewritingRule(), "left", null, 1, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewritingRule_Right(), this.getRightRuleElement(), this.getRightRuleElement_RewritingRule(), "right", null, 1, -1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRewritingRule_Rule(), this.getRule(), this.getRule_RewritingRules(), "rule", null, 1, 1, RewritingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_Expr(), theSimpleoclPackage.getOclExpression(), null, "expr", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Property(), ecorePackage.getEString(), "property", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_RuleElement(), this.getRightRuleElement(), this.getRightRuleElement_Binding(), "ruleElement", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftRuleElementEClass, LeftRuleElement.class, "LeftRuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeftRuleElement_RewritingRule(), this.getRewritingRule(), this.getRewritingRule_Left(), "rewritingRule", null, 1, 1, LeftRuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rightRuleElementEClass, RightRuleElement.class, "RightRuleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRightRuleElement_RewritingRule(), this.getRewritingRule(), this.getRewritingRule_Right(), "rewritingRule", null, 1, 1, RightRuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRightRuleElement_Binding(), this.getBinding(), this.getBinding_RuleElement(), "binding", null, 1, -1, RightRuleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opDefEClass, OpDef.class, "OpDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpDef_Setters(), this.getSetterDef(), null, "setters", null, 0, -1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpDef_Op(), ecorePackage.getEString(), "op", null, 1, 1, OpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageOpDefEClass, PackageOpDef.class, "PackageOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageOpDef_ClassesOp(), this.getClassOpDef(), null, "classesOp", null, 0, -1, PackageOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackageOpDef_PackagePar(), this.getPackage(), null, "packagePar", null, 1, 1, PackageOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, it.univaq.coevolution.emftext.emig.language.emig.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classOpDefEClass, ClassOpDef.class, "ClassOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassOpDef_FeatureOp(), this.getFeatureOpDef(), null, "featureOp", null, 0, -1, ClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassOpDef_ClassPar(), this.getClass_(), null, "classPar", null, 1, 1, ClassOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, it.univaq.coevolution.emftext.emig.language.emig.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureOpDefEClass, FeatureOpDef.class, "FeatureOpDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureOpDef_FeatureOpDef(), this.getFeatureOpDef(), null, "featureOpDef", null, 1, 1, FeatureOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeOpDefEClass, AttributeOpDef.class, "AttributeOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeOpDef_AttributePar(), this.getAttribute(), null, "attributePar", null, 1, 1, AttributeOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceOpDefEClass, ReferenceOpDef.class, "ReferenceOpDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceOpDef_ReferencePar(), this.getReference(), null, "referencePar", null, 1, 1, ReferenceOpDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setterDefEClass, SetterDef.class, "SetterDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetterDef_Metafeature(), ecorePackage.getEString(), "metafeature", null, 1, 1, SetterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetterDef_ParametersDef(), this.getMParameter(), null, "parametersDef", null, 0, -1, SetterDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mParameterEClass, MParameter.class, "MParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EmigPackageImpl
