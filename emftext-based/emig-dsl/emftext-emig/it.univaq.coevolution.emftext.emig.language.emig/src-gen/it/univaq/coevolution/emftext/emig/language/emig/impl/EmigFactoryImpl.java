/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.Attribute;
import it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Binding;
import it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.ComplexOperatorCallDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigFactory;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.FilterRule;
import it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.MParameter;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary;
import it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram;
import it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Reference;
import it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.RewritingRule;
import it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.Rule;
import it.univaq.coevolution.emftext.emig.language.emig.SetterDef;

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
		try {
			EmigFactory theEmigFactory = (EmigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/emig"); 
			if (theEmigFactory != null) {
				return theEmigFactory;
			}
		}
		catch (Exception exception) {
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
		switch (eClass.getClassifierID()) {
			case EmigPackage.MIGRATION_LIBRARY: return createMigrationLibrary();
			case EmigPackage.MIGRATION_PROGRAM: return createMigrationProgram();
			case EmigPackage.RULE: return createRule();
			case EmigPackage.REWRITING_RULE: return createRewritingRule();
			case EmigPackage.BINDING: return createBinding();
			case EmigPackage.LEFT_RULE_ELEMENT: return createLeftRuleElement();
			case EmigPackage.RIGHT_RULE_ELEMENT: return createRightRuleElement();
			case EmigPackage.PACKAGE_OP_DEF: return createPackageOpDef();
			case EmigPackage.PACKAGE: return createPackage();
			case EmigPackage.CLASS_OP_DEF: return createClassOpDef();
			case EmigPackage.CLASS: return createClass();
			case EmigPackage.ATTRIBUTE_OP_DEF: return createAttributeOpDef();
			case EmigPackage.ATTRIBUTE: return createAttribute();
			case EmigPackage.REFERENCE_OP_DEF: return createReferenceOpDef();
			case EmigPackage.REFERENCE: return createReference();
			case EmigPackage.SETTER_DEF: return createSetterDef();
			case EmigPackage.MPARAMETER: return createMParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationLibrary createMigrationLibrary() {
		MigrationLibraryImpl migrationLibrary = new MigrationLibraryImpl();
		return migrationLibrary;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationProgram createMigrationProgram() {
		MigrationProgramImpl migrationProgram = new MigrationProgramImpl();
		return migrationProgram;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewritingRule createRewritingRule() {
		RewritingRuleImpl rewritingRule = new RewritingRuleImpl();
		return rewritingRule;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftRuleElement createLeftRuleElement() {
		LeftRuleElementImpl leftRuleElement = new LeftRuleElementImpl();
		return leftRuleElement;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightRuleElement createRightRuleElement() {
		RightRuleElementImpl rightRuleElement = new RightRuleElementImpl();
		return rightRuleElement;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOpDef createPackageOpDef() {
		PackageOpDefImpl packageOpDef = new PackageOpDefImpl();
		return packageOpDef;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOpDef createClassOpDef() {
		ClassOpDefImpl classOpDef = new ClassOpDefImpl();
		return classOpDef;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOpDef createAttributeOpDef() {
		AttributeOpDefImpl attributeOpDef = new AttributeOpDefImpl();
		return attributeOpDef;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOpDef createReferenceOpDef() {
		ReferenceOpDefImpl referenceOpDef = new ReferenceOpDefImpl();
		return referenceOpDef;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetterDef createSetterDef() {
		SetterDefImpl setterDef = new SetterDefImpl();
		return setterDef;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParameter createMParameter() {
		MParameterImpl mParameter = new MParameterImpl();
		return mParameter;
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
