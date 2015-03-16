/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import be.ac.vub.simpleocl.SimpleoclPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigFactory
 * @model kind="package"
 * @generated
 */
public interface EmigPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "emig";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.emftext.org/language/emig";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "emig";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EmigPackage eINSTANCE = it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl.init();

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationLibraryImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMigrationLibrary()
	 * @generated
	 */
	int MIGRATION_LIBRARY = 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__LINE = SimpleoclPackage.MODULE__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__COLUMN = SimpleoclPackage.MODULE__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__CHAR_START = SimpleoclPackage.MODULE__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__CHAR_END = SimpleoclPackage.MODULE__CHAR_END;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__NAME = SimpleoclPackage.MODULE__NAME;

		/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__METAMODELS = SimpleoclPackage.MODULE__METAMODELS;

		/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__IMPORTS = SimpleoclPackage.MODULE__IMPORTS;

		/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY__ELEMENTS = SimpleoclPackage.MODULE__ELEMENTS;

		/**
	 * The number of structural features of the '<em>Migration Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_LIBRARY_FEATURE_COUNT = SimpleoclPackage.MODULE_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationProgramImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMigrationProgram()
	 * @generated
	 */
	int MIGRATION_PROGRAM = 1;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__LINE = MIGRATION_LIBRARY__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__COLUMN = MIGRATION_LIBRARY__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__CHAR_START = MIGRATION_LIBRARY__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__CHAR_END = MIGRATION_LIBRARY__CHAR_END;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__NAME = MIGRATION_LIBRARY__NAME;

		/**
	 * The feature id for the '<em><b>Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__METAMODELS = MIGRATION_LIBRARY__METAMODELS;

		/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__IMPORTS = MIGRATION_LIBRARY__IMPORTS;

		/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__ELEMENTS = MIGRATION_LIBRARY__ELEMENTS;

		/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__MODEL = MIGRATION_LIBRARY_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM__DELTA = MIGRATION_LIBRARY_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Migration Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIGRATION_PROGRAM_FEATURE_COUNT = MIGRATION_LIBRARY_FEATURE_COUNT + 2;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RuleImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LINE = SimpleoclPackage.NAMED_ELEMENT__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COLUMN = SimpleoclPackage.NAMED_ELEMENT__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CHAR_START = SimpleoclPackage.NAMED_ELEMENT__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CHAR_END = SimpleoclPackage.NAMED_ELEMENT__CHAR_END;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = SimpleoclPackage.NAMED_ELEMENT__NAME;

		/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODULE = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FILTER = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Rewriting Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REWRITING_RULES = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__WHERE = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = SimpleoclPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRewritingRule()
	 * @generated
	 */
	int REWRITING_RULE = 3;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.BindingImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 4;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.LeftRuleElementImpl <em>Left Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.LeftRuleElementImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getLeftRuleElement()
	 * @generated
	 */
	int LEFT_RULE_ELEMENT = 5;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl <em>Right Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRightRuleElement()
	 * @generated
	 */
	int RIGHT_RULE_ELEMENT = 6;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.OpDefImpl <em>Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.OpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getOpDef()
	 * @generated
	 */
	int OP_DEF = 7;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl <em>Package Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getPackageOpDef()
	 * @generated
	 */
	int PACKAGE_OP_DEF = 8;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.PackageImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 9;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl <em>Class Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getClassOpDef()
	 * @generated
	 */
	int CLASS_OP_DEF = 10;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MParameterImpl <em>MParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MParameterImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMParameter()
	 * @generated
	 */
	int MPARAMETER = 19;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ClassImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 11;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureOpDefImpl <em>Feature Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureOpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getFeatureOpDef()
	 * @generated
	 */
	int FEATURE_OP_DEF = 12;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeOpDefImpl <em>Attribute Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeOpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getAttributeOpDef()
	 * @generated
	 */
	int ATTRIBUTE_OP_DEF = 13;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getFeature()
	 * @generated
	 */
  int FEATURE = 14;

  /**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 15;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceOpDefImpl <em>Reference Op Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceOpDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getReferenceOpDef()
	 * @generated
	 */
	int REFERENCE_OP_DEF = 16;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 17;

		/**
	 * The meta object id for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl <em>Setter Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl
	 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getSetterDef()
	 * @generated
	 */
	int SETTER_DEF = 18;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

		/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__LEFT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__RIGHT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE__RULE = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Rewriting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITING_RULE_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

		/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EXPR = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Rule Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__RULE_ELEMENT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The feature id for the '<em><b>Rewriting Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT__REWRITING_RULE = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Left Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_RULE_ELEMENT_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The feature id for the '<em><b>Rewriting Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__REWRITING_RULE = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT__BINDING = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Right Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_RULE_ELEMENT_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__SETTERS = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF__OP = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_DEF_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__LINE = OP_DEF__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__COLUMN = OP_DEF__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__CHAR_START = OP_DEF__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__CHAR_END = OP_DEF__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__SETTERS = OP_DEF__SETTERS;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__OP = OP_DEF__OP;

		/**
	 * The feature id for the '<em><b>Classes Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__CLASSES_OP = OP_DEF_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Package Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF__PACKAGE_PAR = OP_DEF_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Package Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__LINE = OP_DEF__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__COLUMN = OP_DEF__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__CHAR_START = OP_DEF__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__CHAR_END = OP_DEF__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__SETTERS = OP_DEF__SETTERS;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__OP = OP_DEF__OP;

		/**
	 * The feature id for the '<em><b>Feature Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__FEATURE_OP = OP_DEF_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Class Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF__CLASS_PAR = OP_DEF_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Class Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__LINE = OP_DEF__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__COLUMN = OP_DEF__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__CHAR_START = OP_DEF__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__CHAR_END = OP_DEF__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__SETTERS = OP_DEF__SETTERS;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__OP = OP_DEF__OP;

		/**
	 * The feature id for the '<em><b>Feature Op Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF__FEATURE_OP_DEF = OP_DEF_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Feature Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OP_DEF_FEATURE_COUNT = OP_DEF_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__LINE = FEATURE_OP_DEF__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__COLUMN = FEATURE_OP_DEF__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__CHAR_START = FEATURE_OP_DEF__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__CHAR_END = FEATURE_OP_DEF__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__SETTERS = FEATURE_OP_DEF__SETTERS;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__OP = FEATURE_OP_DEF__OP;

		/**
	 * The feature id for the '<em><b>Feature Op Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__FEATURE_OP_DEF = FEATURE_OP_DEF__FEATURE_OP_DEF;

		/**
	 * The feature id for the '<em><b>Attribute Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR = FEATURE_OP_DEF_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Attribute Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OP_DEF_FEATURE_COUNT = FEATURE_OP_DEF_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FEATURE_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LINE = FEATURE__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLUMN = FEATURE__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_START = FEATURE__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_END = FEATURE__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VAR_NAME = FEATURE__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = FEATURE__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VARIABLE_EXP = FEATURE__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__LINE = FEATURE_OP_DEF__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__COLUMN = FEATURE_OP_DEF__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__CHAR_START = FEATURE_OP_DEF__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__CHAR_END = FEATURE_OP_DEF__CHAR_END;

		/**
	 * The feature id for the '<em><b>Setters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__SETTERS = FEATURE_OP_DEF__SETTERS;

		/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__OP = FEATURE_OP_DEF__OP;

		/**
	 * The feature id for the '<em><b>Feature Op Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__FEATURE_OP_DEF = FEATURE_OP_DEF__FEATURE_OP_DEF;

		/**
	 * The feature id for the '<em><b>Reference Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF__REFERENCE_PAR = FEATURE_OP_DEF_FEATURE_COUNT + 0;

		/**
	 * The number of structural features of the '<em>Reference Op Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OP_DEF_FEATURE_COUNT = FEATURE_OP_DEF_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LINE = FEATURE__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__COLUMN = FEATURE__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CHAR_START = FEATURE__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CHAR_END = FEATURE__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VAR_NAME = FEATURE__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TYPE = FEATURE__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__VARIABLE_EXP = FEATURE__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__LINE = SimpleoclPackage.LOCATED_ELEMENT__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__COLUMN = SimpleoclPackage.LOCATED_ELEMENT__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__CHAR_START = SimpleoclPackage.LOCATED_ELEMENT__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__CHAR_END = SimpleoclPackage.LOCATED_ELEMENT__CHAR_END;

		/**
	 * The feature id for the '<em><b>Metafeature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__METAFEATURE = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Parameters Def</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF__PARAMETERS_DEF = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 1;

		/**
	 * The number of structural features of the '<em>Setter Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_DEF_FEATURE_COUNT = SimpleoclPackage.LOCATED_ELEMENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__LINE = SimpleoclPackage.VARIABLE_DECLARATION__LINE;

		/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__COLUMN = SimpleoclPackage.VARIABLE_DECLARATION__COLUMN;

		/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__CHAR_START = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_START;

		/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__CHAR_END = SimpleoclPackage.VARIABLE_DECLARATION__CHAR_END;

		/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__VAR_NAME = SimpleoclPackage.VARIABLE_DECLARATION__VAR_NAME;

		/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__TYPE = SimpleoclPackage.VARIABLE_DECLARATION__TYPE;

		/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER__VARIABLE_EXP = SimpleoclPackage.VARIABLE_DECLARATION__VARIABLE_EXP;

		/**
	 * The number of structural features of the '<em>MParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPARAMETER_FEATURE_COUNT = SimpleoclPackage.VARIABLE_DECLARATION_FEATURE_COUNT + 0;

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary <em>Migration Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Library</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary
	 * @generated
	 */
	EClass getMigrationLibrary();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram <em>Migration Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Migration Program</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram
	 * @generated
	 */
	EClass getMigrationProgram();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getDelta()
	 * @see #getMigrationProgram()
	 * @generated
	 */
	EAttribute getMigrationProgram_Delta();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getModel()
	 * @see #getMigrationProgram()
	 * @generated
	 */
	EReference getMigrationProgram_Model();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule
	 * @generated
	 */
	EClass getRule();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule#getFilter()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Filter();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getRewritingRules <em>Rewriting Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rewriting Rules</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule#getRewritingRules()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RewritingRules();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getWhere <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule#getWhere()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Where();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewriting Rule</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule
	 * @generated
	 */
	EClass getRewritingRule();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getLeft()
	 * @see #getRewritingRule()
	 * @generated
	 */
	EReference getRewritingRule_Left();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRight()
	 * @see #getRewritingRule()
	 * @generated
	 */
	EReference getRewritingRule_Right();

		/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule()
	 * @see #getRewritingRule()
	 * @generated
	 */
	EReference getRewritingRule_Rule();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding
	 * @generated
	 */
	EClass getBinding();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding#getExpr()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Expr();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Property();

		/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule Element</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_RuleElement();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement <em>Left Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Rule Element</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement
	 * @generated
	 */
	EClass getLeftRuleElement();

		/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rewriting Rule</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule()
	 * @see #getLeftRuleElement()
	 * @generated
	 */
	EReference getLeftRuleElement_RewritingRule();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement <em>Right Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Rule Element</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement
	 * @generated
	 */
	EClass getRightRuleElement();

		/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rewriting Rule</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule()
	 * @see #getRightRuleElement()
	 * @generated
	 */
	EReference getRightRuleElement_RewritingRule();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getBinding()
	 * @see #getRightRuleElement()
	 * @generated
	 */
	EReference getRightRuleElement_Binding();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef <em>Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.OpDef
	 * @generated
	 */
	EClass getOpDef();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef#getSetters <em>Setters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setters</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.OpDef#getSetters()
	 * @see #getOpDef()
	 * @generated
	 */
	EReference getOpDef_Setters();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.OpDef#getOp()
	 * @see #getOpDef()
	 * @generated
	 */
	EAttribute getOpDef_Op();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef <em>Package Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef
	 * @generated
	 */
	EClass getPackageOpDef();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getClassesOp <em>Classes Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes Op</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getClassesOp()
	 * @see #getPackageOpDef()
	 * @generated
	 */
	EReference getPackageOpDef_ClassesOp();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getPackagePar <em>Package Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Par</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getPackagePar()
	 * @see #getPackageOpDef()
	 * @generated
	 */
	EReference getPackageOpDef_PackagePar();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Package
	 * @generated
	 */
	EClass getPackage();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef <em>Class Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef
	 * @generated
	 */
	EClass getClassOpDef();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getFeatureOp <em>Feature Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Op</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getFeatureOp()
	 * @see #getClassOpDef()
	 * @generated
	 */
	EReference getClassOpDef_FeatureOp();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getClassPar <em>Class Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Par</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getClassPar()
	 * @see #getClassOpDef()
	 * @generated
	 */
	EReference getClassOpDef_ClassPar();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Class
	 * @generated
	 */
	EClass getClass_();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef <em>Feature Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef
	 * @generated
	 */
	EClass getFeatureOpDef();

		/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef#getFeatureOpDef <em>Feature Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef#getFeatureOpDef()
	 * @see #getFeatureOpDef()
	 * @generated
	 */
	EReference getFeatureOpDef_FeatureOpDef();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef <em>Attribute Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef
	 * @generated
	 */
	EClass getAttributeOpDef();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef#getAttributePar <em>Attribute Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Par</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef#getAttributePar()
	 * @see #getAttributeOpDef()
	 * @generated
	 */
	EReference getAttributeOpDef_AttributePar();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Feature
	 * @generated
	 */
  EClass getFeature();

  /**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Attribute
	 * @generated
	 */
	EClass getAttribute();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef <em>Reference Op Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Op Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef
	 * @generated
	 */
	EClass getReferenceOpDef();

		/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef#getReferencePar <em>Reference Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Par</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef#getReferencePar()
	 * @see #getReferenceOpDef()
	 * @generated
	 */
	EReference getReferenceOpDef_ReferencePar();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Reference
	 * @generated
	 */
	EClass getReference();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef <em>Setter Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.SetterDef
	 * @generated
	 */
	EClass getSetterDef();

		/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getMetafeature <em>Metafeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metafeature</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getMetafeature()
	 * @see #getSetterDef()
	 * @generated
	 */
	EAttribute getSetterDef_Metafeature();

		/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getParametersDef <em>Parameters Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters Def</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getParametersDef()
	 * @see #getSetterDef()
	 * @generated
	 */
	EReference getSetterDef_ParametersDef();

		/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emftext.emig.language.emig.MParameter <em>MParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MParameter</em>'.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.MParameter
	 * @generated
	 */
	EClass getMParameter();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EmigFactory getEmigFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationLibraryImpl <em>Migration Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationLibraryImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMigrationLibrary()
		 * @generated
		 */
		EClass MIGRATION_LIBRARY = eINSTANCE.getMigrationLibrary();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationProgramImpl <em>Migration Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MigrationProgramImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMigrationProgram()
		 * @generated
		 */
		EClass MIGRATION_PROGRAM = eINSTANCE.getMigrationProgram();

				/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIGRATION_PROGRAM__DELTA = eINSTANCE.getMigrationProgram_Delta();

				/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIGRATION_PROGRAM__MODEL = eINSTANCE.getMigrationProgram_Model();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RuleImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

				/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FILTER = eINSTANCE.getRule_Filter();

				/**
		 * The meta object literal for the '<em><b>Rewriting Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__REWRITING_RULES = eINSTANCE.getRule_RewritingRules();

				/**
		 * The meta object literal for the '<em><b>Where</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__WHERE = eINSTANCE.getRule_Where();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl <em>Rewriting Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRewritingRule()
		 * @generated
		 */
		EClass REWRITING_RULE = eINSTANCE.getRewritingRule();

				/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITING_RULE__LEFT = eINSTANCE.getRewritingRule_Left();

				/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITING_RULE__RIGHT = eINSTANCE.getRewritingRule_Right();

				/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REWRITING_RULE__RULE = eINSTANCE.getRewritingRule_Rule();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.BindingImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

				/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EXPR = eINSTANCE.getBinding_Expr();

				/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__PROPERTY = eINSTANCE.getBinding_Property();

				/**
		 * The meta object literal for the '<em><b>Rule Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__RULE_ELEMENT = eINSTANCE.getBinding_RuleElement();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.LeftRuleElementImpl <em>Left Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.LeftRuleElementImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getLeftRuleElement()
		 * @generated
		 */
		EClass LEFT_RULE_ELEMENT = eINSTANCE.getLeftRuleElement();

				/**
		 * The meta object literal for the '<em><b>Rewriting Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_RULE_ELEMENT__REWRITING_RULE = eINSTANCE.getLeftRuleElement_RewritingRule();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl <em>Right Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getRightRuleElement()
		 * @generated
		 */
		EClass RIGHT_RULE_ELEMENT = eINSTANCE.getRightRuleElement();

				/**
		 * The meta object literal for the '<em><b>Rewriting Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_RULE_ELEMENT__REWRITING_RULE = eINSTANCE.getRightRuleElement_RewritingRule();

				/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_RULE_ELEMENT__BINDING = eINSTANCE.getRightRuleElement_Binding();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.OpDefImpl <em>Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.OpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getOpDef()
		 * @generated
		 */
		EClass OP_DEF = eINSTANCE.getOpDef();

				/**
		 * The meta object literal for the '<em><b>Setters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_DEF__SETTERS = eINSTANCE.getOpDef_Setters();

				/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP_DEF__OP = eINSTANCE.getOpDef_Op();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl <em>Package Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getPackageOpDef()
		 * @generated
		 */
		EClass PACKAGE_OP_DEF = eINSTANCE.getPackageOpDef();

				/**
		 * The meta object literal for the '<em><b>Classes Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OP_DEF__CLASSES_OP = eINSTANCE.getPackageOpDef_ClassesOp();

				/**
		 * The meta object literal for the '<em><b>Package Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_OP_DEF__PACKAGE_PAR = eINSTANCE.getPackageOpDef_PackagePar();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.PackageImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl <em>Class Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getClassOpDef()
		 * @generated
		 */
		EClass CLASS_OP_DEF = eINSTANCE.getClassOpDef();

				/**
		 * The meta object literal for the '<em><b>Feature Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OP_DEF__FEATURE_OP = eINSTANCE.getClassOpDef_FeatureOp();

				/**
		 * The meta object literal for the '<em><b>Class Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_OP_DEF__CLASS_PAR = eINSTANCE.getClassOpDef_ClassPar();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ClassImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureOpDefImpl <em>Feature Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureOpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getFeatureOpDef()
		 * @generated
		 */
		EClass FEATURE_OP_DEF = eINSTANCE.getFeatureOpDef();

				/**
		 * The meta object literal for the '<em><b>Feature Op Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_OP_DEF__FEATURE_OP_DEF = eINSTANCE.getFeatureOpDef_FeatureOpDef();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeOpDefImpl <em>Attribute Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeOpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getAttributeOpDef()
		 * @generated
		 */
		EClass ATTRIBUTE_OP_DEF = eINSTANCE.getAttributeOpDef();

				/**
		 * The meta object literal for the '<em><b>Attribute Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR = eINSTANCE.getAttributeOpDef_AttributePar();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getFeature()
		 * @generated
		 */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceOpDefImpl <em>Reference Op Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceOpDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getReferenceOpDef()
		 * @generated
		 */
		EClass REFERENCE_OP_DEF = eINSTANCE.getReferenceOpDef();

				/**
		 * The meta object literal for the '<em><b>Reference Par</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_OP_DEF__REFERENCE_PAR = eINSTANCE.getReferenceOpDef_ReferencePar();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl <em>Setter Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getSetterDef()
		 * @generated
		 */
		EClass SETTER_DEF = eINSTANCE.getSetterDef();

				/**
		 * The meta object literal for the '<em><b>Metafeature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTER_DEF__METAFEATURE = eINSTANCE.getSetterDef_Metafeature();

				/**
		 * The meta object literal for the '<em><b>Parameters Def</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER_DEF__PARAMETERS_DEF = eINSTANCE.getSetterDef_ParametersDef();

				/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emftext.emig.language.emig.impl.MParameterImpl <em>MParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.MParameterImpl
		 * @see it.univaq.coevolution.emftext.emig.language.emig.impl.EmigPackageImpl#getMParameter()
		 * @generated
		 */
		EClass MPARAMETER = eINSTANCE.getMParameter();

  }

} //EmigPackage
