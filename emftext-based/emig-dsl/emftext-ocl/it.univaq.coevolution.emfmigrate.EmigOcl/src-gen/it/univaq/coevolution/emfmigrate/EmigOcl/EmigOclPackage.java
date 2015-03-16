/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclFactory
 * @model kind="package"
 * @generated
 */
public interface EmigOclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EmigOcl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univaq.it/coevolution/emfmigrate/EmigOcl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EmigOcl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmigOclPackage eINSTANCE = it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocatedElementImpl <em>Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocatedElementImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLocatedElement()
	 * @generated
	 */
	int LOCATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_START = 2;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT__CHAR_END = 3;

	/**
	 * The number of structural features of the '<em>Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.ModuleImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODELS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__FEATURES = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclExpressionImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP3 = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__APPLIED_PROPERTY = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__COLLECTION = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LET_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LOOP_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__PARENT_OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__INITIALIZED_VARIABLE = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP2 = LOCATED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__OWNING_OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__IF_EXP1 = LOCATED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__OWNING_ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getVariableExp()
	 * @generated
	 */
	int VARIABLE_EXP = 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__REFERRED_VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SuperExpImpl <em>Super Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SuperExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSuperExp()
	 * @generated
	 */
	int SUPER_EXP = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Super Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPER_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SelfExpImpl <em>Self Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SelfExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSelfExp()
	 * @generated
	 */
	int SELF_EXP = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Self Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveExpImpl <em>Primitive Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPrimitiveExp()
	 * @generated
	 */
	int PRIMITIVE_EXP = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Primitive Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringExpImpl <em>String Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStringExp()
	 * @generated
	 */
	int STRING_EXP = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__COLLECTION = PRIMITIVE_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>String Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP__STRING_SYMBOL = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBooleanExp()
	 * @generated
	 */
	int BOOLEAN_EXP = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__COLLECTION = PRIMITIVE_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Boolean Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP__BOOLEAN_SYMBOL = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericExpImpl <em>Numeric Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNumericExp()
	 * @generated
	 */
	int NUMERIC_EXP = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LINE = PRIMITIVE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__COLUMN = PRIMITIVE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__CHAR_START = PRIMITIVE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__CHAR_END = PRIMITIVE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__TYPE = PRIMITIVE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP3 = PRIMITIVE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__APPLIED_PROPERTY = PRIMITIVE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__COLLECTION = PRIMITIVE_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LET_EXP = PRIMITIVE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__LOOP_EXP = PRIMITIVE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__PARENT_OPERATION = PRIMITIVE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__INITIALIZED_VARIABLE = PRIMITIVE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP2 = PRIMITIVE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__OWNING_OPERATION = PRIMITIVE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__IF_EXP1 = PRIMITIVE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP__OWNING_ATTRIBUTE = PRIMITIVE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Numeric Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXP_FEATURE_COUNT = PRIMITIVE_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealExpImpl <em>Real Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRealExp()
	 * @generated
	 */
	int REAL_EXP = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LINE = NUMERIC_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__COLUMN = NUMERIC_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__CHAR_START = NUMERIC_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__CHAR_END = NUMERIC_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__TYPE = NUMERIC_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP3 = NUMERIC_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__APPLIED_PROPERTY = NUMERIC_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__COLLECTION = NUMERIC_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LET_EXP = NUMERIC_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__LOOP_EXP = NUMERIC_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__PARENT_OPERATION = NUMERIC_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__INITIALIZED_VARIABLE = NUMERIC_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP2 = NUMERIC_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__OWNING_OPERATION = NUMERIC_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__IF_EXP1 = NUMERIC_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__OWNING_ATTRIBUTE = NUMERIC_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Real Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP__REAL_SYMBOL = NUMERIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_EXP_FEATURE_COUNT = NUMERIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerExpImpl <em>Integer Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntegerExp()
	 * @generated
	 */
	int INTEGER_EXP = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LINE = NUMERIC_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__COLUMN = NUMERIC_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__CHAR_START = NUMERIC_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__CHAR_END = NUMERIC_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__TYPE = NUMERIC_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP3 = NUMERIC_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__APPLIED_PROPERTY = NUMERIC_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__COLLECTION = NUMERIC_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LET_EXP = NUMERIC_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__LOOP_EXP = NUMERIC_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__PARENT_OPERATION = NUMERIC_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__INITIALIZED_VARIABLE = NUMERIC_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP2 = NUMERIC_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__OWNING_OPERATION = NUMERIC_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__IF_EXP1 = NUMERIC_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__OWNING_ATTRIBUTE = NUMERIC_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Integer Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP__INTEGER_SYMBOL = NUMERIC_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXP_FEATURE_COUNT = NUMERIC_EXP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionExpImpl <em>Collection Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionExp()
	 * @generated
	 */
	int COLLECTION_EXP = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP__ELEMENTS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagExpImpl <em>Bag Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBagExp()
	 * @generated
	 */
	int BAG_EXP = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__COLLECTION = COLLECTION_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP__ELEMENTS = COLLECTION_EXP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Bag Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOrderedSetExp()
	 * @generated
	 */
	int ORDERED_SET_EXP = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__COLLECTION = COLLECTION_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP__ELEMENTS = COLLECTION_EXP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Ordered Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSequenceExp()
	 * @generated
	 */
	int SEQUENCE_EXP = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__COLLECTION = COLLECTION_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP__ELEMENTS = COLLECTION_EXP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Sequence Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetExpImpl <em>Set Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSetExp()
	 * @generated
	 */
	int SET_EXP = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LINE = COLLECTION_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__COLUMN = COLLECTION_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__CHAR_START = COLLECTION_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__CHAR_END = COLLECTION_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__TYPE = COLLECTION_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP3 = COLLECTION_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__APPLIED_PROPERTY = COLLECTION_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__COLLECTION = COLLECTION_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LET_EXP = COLLECTION_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__LOOP_EXP = COLLECTION_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__PARENT_OPERATION = COLLECTION_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__INITIALIZED_VARIABLE = COLLECTION_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP2 = COLLECTION_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__OWNING_OPERATION = COLLECTION_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__IF_EXP1 = COLLECTION_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__OWNING_ATTRIBUTE = COLLECTION_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP__ELEMENTS = COLLECTION_EXP__ELEMENTS;

	/**
	 * The number of structural features of the '<em>Set Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXP_FEATURE_COUNT = COLLECTION_EXP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleExp()
	 * @generated
	 */
	int TUPLE_EXP = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tuple Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP__TUPLE_PART = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableDeclarationImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 46;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VAR_NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__VARIABLE_EXP = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TuplePartImpl <em>Tuple Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TuplePartImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTuplePart()
	 * @generated
	 */
	int TUPLE_PART = 18;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapExpImpl <em>Map Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapExp()
	 * @generated
	 */
	int MAP_EXP = 19;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapElementImpl <em>Map Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapElementImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapElement()
	 * @generated
	 */
	int MAP_ELEMENT = 20;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EnumLiteralExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getEnumLiteralExp()
	 * @generated
	 */
	int ENUM_LITERAL_EXP = 21;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclUndefinedExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclUndefinedExp()
	 * @generated
	 */
	int OCL_UNDEFINED_EXP = 22;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallExpImpl <em>Static Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticPropertyCallExp()
	 * @generated
	 */
	int STATIC_PROPERTY_CALL_EXP = 23;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallImpl <em>Static Property Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticPropertyCall()
	 * @generated
	 */
	int STATIC_PROPERTY_CALL = 24;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticNavigationOrAttributeCallImpl <em>Static Navigation Or Attribute Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticNavigationOrAttributeCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticNavigationOrAttributeCall()
	 * @generated
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL = 25;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticOperationCallImpl <em>Static Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticOperationCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticOperationCall()
	 * @generated
	 */
	int STATIC_OPERATION_CALL = 26;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPropertyCallExp()
	 * @generated
	 */
	int PROPERTY_CALL_EXP = 27;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallImpl <em>Property Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPropertyCall()
	 * @generated
	 */
	int PROPERTY_CALL = 28;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NavigationOrAttributeCallImpl <em>Navigation Or Attribute Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NavigationOrAttributeCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNavigationOrAttributeCall()
	 * @generated
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL = 29;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationCallImpl <em>Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperationCall()
	 * @generated
	 */
	int OPERATION_CALL = 30;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperatorCallExpImpl <em>Operator Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperatorCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperatorCallExp()
	 * @generated
	 */
	int OPERATOR_CALL_EXP = 31;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NotOpCallExpImpl <em>Not Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NotOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNotOpCallExp()
	 * @generated
	 */
	int NOT_OP_CALL_EXP = 32;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RelOpCallExpImpl <em>Rel Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RelOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRelOpCallExp()
	 * @generated
	 */
	int REL_OP_CALL_EXP = 33;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.EqOpCallExpImpl <em>Eq Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EqOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getEqOpCallExp()
	 * @generated
	 */
	int EQ_OP_CALL_EXP = 34;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.AddOpCallExpImpl <em>Add Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.AddOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getAddOpCallExp()
	 * @generated
	 */
	int ADD_OP_CALL_EXP = 35;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntOpCallExpImpl <em>Int Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntOpCallExp()
	 * @generated
	 */
	int INT_OP_CALL_EXP = 36;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MulOpCallExpImpl <em>Mul Op Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MulOpCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMulOpCallExp()
	 * @generated
	 */
	int MUL_OP_CALL_EXP = 37;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaCallExpImpl <em>Lambda Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaCallExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLambdaCallExp()
	 * @generated
	 */
	int LAMBDA_CALL_EXP = 38;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BraceExpImpl <em>Brace Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BraceExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBraceExp()
	 * @generated
	 */
	int BRACE_EXP = 39;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionOperationCallImpl <em>Collection Operation Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionOperationCallImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionOperationCall()
	 * @generated
	 */
	int COLLECTION_OPERATION_CALL = 40;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LoopExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 41;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IterateExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIterateExp()
	 * @generated
	 */
	int ITERATE_EXP = 42;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIteratorExp()
	 * @generated
	 */
	int ITERATOR_EXP = 43;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LetExpImpl <em>Let Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LetExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLetExp()
	 * @generated
	 */
	int LET_EXP = 44;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IfExpImpl <em>If Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IfExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIfExp()
	 * @generated
	 */
	int IF_EXP = 45;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocalVariableImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 47;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__LET_EXP = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__INIT_EXPRESSION = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__BASE_EXP = VARIABLE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__EQ = VARIABLE_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__LINE = LOCAL_VARIABLE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__COLUMN = LOCAL_VARIABLE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__CHAR_START = LOCAL_VARIABLE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__CHAR_END = LOCAL_VARIABLE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__VAR_NAME = LOCAL_VARIABLE__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__TYPE = LOCAL_VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__VARIABLE_EXP = LOCAL_VARIABLE__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__LET_EXP = LOCAL_VARIABLE__LET_EXP;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__INIT_EXPRESSION = LOCAL_VARIABLE__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Base Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__BASE_EXP = LOCAL_VARIABLE__BASE_EXP;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__EQ = LOCAL_VARIABLE__EQ;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART__TUPLE = LOCAL_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_PART_FEATURE_COUNT = LOCAL_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP__ELEMENTS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Map Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__MAP = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__KEY = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT__VALUE = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ELEMENT_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP__NAME = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Ocl Undefined Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_UNDEFINED_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Static Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP__STATIC_CALL = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Static Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_PROPERTY_CALL_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME = STATIC_PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Static Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OR_ATTRIBUTE_CALL_FEATURE_COUNT = STATIC_PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__ARGUMENTS = STATIC_PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL__OPERATION_NAME = STATIC_PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_OPERATION_CALL_FEATURE_COUNT = STATIC_PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__CALLS = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL__NAME = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Or Attribute Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OR_ATTRIBUTE_CALL_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__ARGUMENTS = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL__OPERATION_NAME = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LINE = PROPERTY_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__COLUMN = PROPERTY_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__CHAR_START = PROPERTY_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__CHAR_END = PROPERTY_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__TYPE = PROPERTY_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP3 = PROPERTY_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__APPLIED_PROPERTY = PROPERTY_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__COLLECTION = PROPERTY_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LET_EXP = PROPERTY_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__LOOP_EXP = PROPERTY_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__PARENT_OPERATION = PROPERTY_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__INITIALIZED_VARIABLE = PROPERTY_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP2 = PROPERTY_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OWNING_OPERATION = PROPERTY_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__IF_EXP1 = PROPERTY_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OWNING_ATTRIBUTE = PROPERTY_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__CALLS = PROPERTY_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__SOURCE = PROPERTY_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__ARGUMENT = PROPERTY_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP__OPERATION_NAME = PROPERTY_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_CALL_EXP_FEATURE_COUNT = PROPERTY_CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Not Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Rel Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REL_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Eq Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQ_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Add Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Int Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LINE = OPERATOR_CALL_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__COLUMN = OPERATOR_CALL_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__CHAR_START = OPERATOR_CALL_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__CHAR_END = OPERATOR_CALL_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__TYPE = OPERATOR_CALL_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP3 = OPERATOR_CALL_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__APPLIED_PROPERTY = OPERATOR_CALL_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__COLLECTION = OPERATOR_CALL_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LET_EXP = OPERATOR_CALL_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__LOOP_EXP = OPERATOR_CALL_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__PARENT_OPERATION = OPERATOR_CALL_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__INITIALIZED_VARIABLE = OPERATOR_CALL_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP2 = OPERATOR_CALL_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OWNING_OPERATION = OPERATOR_CALL_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__IF_EXP1 = OPERATOR_CALL_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OWNING_ATTRIBUTE = OPERATOR_CALL_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__CALLS = OPERATOR_CALL_EXP__CALLS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__SOURCE = OPERATOR_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__ARGUMENT = OPERATOR_CALL_EXP__ARGUMENT;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP__OPERATION_NAME = OPERATOR_CALL_EXP__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Mul Op Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUL_OP_CALL_EXP_FEATURE_COUNT = OPERATOR_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LINE = VARIABLE_EXP__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__COLUMN = VARIABLE_EXP__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__CHAR_START = VARIABLE_EXP__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__CHAR_END = VARIABLE_EXP__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__TYPE = VARIABLE_EXP__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP3 = VARIABLE_EXP__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__APPLIED_PROPERTY = VARIABLE_EXP__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__COLLECTION = VARIABLE_EXP__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LET_EXP = VARIABLE_EXP__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__LOOP_EXP = VARIABLE_EXP__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__PARENT_OPERATION = VARIABLE_EXP__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__INITIALIZED_VARIABLE = VARIABLE_EXP__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP2 = VARIABLE_EXP__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__OWNING_OPERATION = VARIABLE_EXP__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__IF_EXP1 = VARIABLE_EXP__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__OWNING_ATTRIBUTE = VARIABLE_EXP__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__REFERRED_VARIABLE = VARIABLE_EXP__REFERRED_VARIABLE;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP__ARGUMENTS = VARIABLE_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lambda Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_CALL_EXP_FEATURE_COUNT = VARIABLE_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP__EXP = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brace Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__ARGUMENTS = OPERATION_CALL__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL__OPERATION_NAME = OPERATION_CALL__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Collection Operation Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_CALL_FEATURE_COUNT = OPERATION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__BODY = PROPERTY_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__ITERATORS = PROPERTY_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = PROPERTY_CALL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__ITERATORS = LOOP_EXP__ITERATORS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP__RESULT = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterate Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATE_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__ITERATORS = LOOP_EXP__ITERATORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__NAME = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP__IN_ = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Let Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__THEN_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__CONDITION = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP__ELSE_EXPRESSION = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 48;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Loop Expr</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LOOP_EXPR = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.ParameterImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 49;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LINE = VARIABLE_DECLARATION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__COLUMN = VARIABLE_DECLARATION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHAR_START = VARIABLE_DECLARATION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CHAR_END = VARIABLE_DECLARATION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VAR_NAME = VARIABLE_DECLARATION__VAR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = VARIABLE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Variable Exp</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VARIABLE_EXP = VARIABLE_DECLARATION__VARIABLE_EXP;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__OPERATION = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclTypeImpl <em>Ocl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclType()
	 * @generated
	 */
	int OCL_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__DEFINITIONS = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OCL_EXPRESSION = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OPERATION = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__MAP_TYPE2 = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__MAP_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__COLLECTION_TYPES = LOCATED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__TUPLE_TYPE_ATTRIBUTE = LOCATED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__VARIABLE_DECLARATION = LOCATED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ELEMENT_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementExpImpl <em>Ocl Model Element Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementExpImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModelElementExp()
	 * @generated
	 */
	int OCL_MODEL_ELEMENT_EXP = 52;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LINE = OCL_EXPRESSION__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__COLUMN = OCL_EXPRESSION__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__CHAR_START = OCL_EXPRESSION__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__CHAR_END = OCL_EXPRESSION__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__TYPE = OCL_EXPRESSION__TYPE;

	/**
	 * The feature id for the '<em><b>If Exp3</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP3 = OCL_EXPRESSION__IF_EXP3;

	/**
	 * The feature id for the '<em><b>Applied Property</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY = OCL_EXPRESSION__APPLIED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__COLLECTION = OCL_EXPRESSION__COLLECTION;

	/**
	 * The feature id for the '<em><b>Let Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LET_EXP = OCL_EXPRESSION__LET_EXP;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__LOOP_EXP = OCL_EXPRESSION__LOOP_EXP;

	/**
	 * The feature id for the '<em><b>Parent Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION = OCL_EXPRESSION__PARENT_OPERATION;

	/**
	 * The feature id for the '<em><b>Initialized Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE = OCL_EXPRESSION__INITIALIZED_VARIABLE;

	/**
	 * The feature id for the '<em><b>If Exp2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP2 = OCL_EXPRESSION__IF_EXP2;

	/**
	 * The feature id for the '<em><b>Owning Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION = OCL_EXPRESSION__OWNING_OPERATION;

	/**
	 * The feature id for the '<em><b>If Exp1</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__IF_EXP1 = OCL_EXPRESSION__IF_EXP1;

	/**
	 * The feature id for the '<em><b>Owning Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE = OCL_EXPRESSION__OWNING_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__MODEL = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP__NAME = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Model Element Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 53;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__LINE = PRIMITIVE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__COLUMN = PRIMITIVE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CHAR_START = PRIMITIVE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__CHAR_END = PRIMITIVE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__DEFINITIONS = PRIMITIVE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__OCL_EXPRESSION = PRIMITIVE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__OPERATION = PRIMITIVE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAP_TYPE2 = PRIMITIVE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__ATTRIBUTE = PRIMITIVE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__MAP_TYPE = PRIMITIVE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__COLLECTION_TYPES = PRIMITIVE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE = PRIMITIVE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__VARIABLE_DECLARATION = PRIMITIVE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntegerType()
	 * @generated
	 */
	int INTEGER_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__LINE = NUMERIC_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__COLUMN = NUMERIC_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CHAR_START = NUMERIC_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__CHAR_END = NUMERIC_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__DEFINITIONS = NUMERIC_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OCL_EXPRESSION = NUMERIC_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__OPERATION = NUMERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MAP_TYPE2 = NUMERIC_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__ATTRIBUTE = NUMERIC_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__MAP_TYPE = NUMERIC_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__COLLECTION_TYPES = NUMERIC_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE = NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE__VARIABLE_DECLARATION = NUMERIC_TYPE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__LINE = NUMERIC_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__COLUMN = NUMERIC_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CHAR_START = NUMERIC_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__CHAR_END = NUMERIC_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__NAME = NUMERIC_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__DEFINITIONS = NUMERIC_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__OCL_EXPRESSION = NUMERIC_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__OPERATION = NUMERIC_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MAP_TYPE2 = NUMERIC_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__ATTRIBUTE = NUMERIC_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__MAP_TYPE = NUMERIC_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__COLLECTION_TYPES = NUMERIC_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__TUPLE_TYPE_ATTRIBUTE = NUMERIC_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__VARIABLE_DECLARATION = NUMERIC_TYPE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOrderedSetType()
	 * @generated
	 */
	int ORDERED_SET_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__LINE = COLLECTION_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__COLUMN = COLLECTION_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CHAR_START = COLLECTION_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__CHAR_END = COLLECTION_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__NAME = COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__DEFINITIONS = COLLECTION_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OCL_EXPRESSION = COLLECTION_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__OPERATION = COLLECTION_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MAP_TYPE2 = COLLECTION_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ATTRIBUTE = COLLECTION_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__MAP_TYPE = COLLECTION_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__COLLECTION_TYPES = COLLECTION_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__TUPLE_TYPE_ATTRIBUTE = COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__VARIABLE_DECLARATION = COLLECTION_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclAnyTypeImpl <em>Ocl Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclAnyTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclAnyType()
	 * @generated
	 */
	int OCL_ANY_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The number of structural features of the '<em>Ocl Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__ATTRIBUTES = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeAttributeImpl <em>Tuple Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeAttributeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleTypeAttribute()
	 * @generated
	 */
	int TUPLE_TYPE_ATTRIBUTE = 65;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tuple Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuple Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_ATTRIBUTE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementImpl <em>Ocl Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModelElement()
	 * @generated
	 */
	int OCL_MODEL_ELEMENT = 66;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT__MODEL = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_ELEMENT_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapTypeImpl <em>Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapType()
	 * @generated
	 */
	int MAP_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__VALUE_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE__KEY_TYPE = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl <em>Lambda Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLambdaType()
	 * @generated
	 */
	int LAMBDA_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__LINE = OCL_TYPE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__COLUMN = OCL_TYPE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__CHAR_START = OCL_TYPE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__CHAR_END = OCL_TYPE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__NAME = OCL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__DEFINITIONS = OCL_TYPE__DEFINITIONS;

	/**
	 * The feature id for the '<em><b>Ocl Expression</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__OCL_EXPRESSION = OCL_TYPE__OCL_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__OPERATION = OCL_TYPE__OPERATION;

	/**
	 * The feature id for the '<em><b>Map Type2</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__MAP_TYPE2 = OCL_TYPE__MAP_TYPE2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__ATTRIBUTE = OCL_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Map Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__MAP_TYPE = OCL_TYPE__MAP_TYPE;

	/**
	 * The feature id for the '<em><b>Collection Types</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__COLLECTION_TYPES = OCL_TYPE__COLLECTION_TYPES;

	/**
	 * The feature id for the '<em><b>Tuple Type Attribute</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE = OCL_TYPE__TUPLE_TYPE_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable Declaration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__VARIABLE_DECLARATION = OCL_TYPE__VARIABLE_DECLARATION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__RETURN_TYPE = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE__ARGUMENT_TYPES = OCL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lambda Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_TYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureDefinitionImpl <em>Ocl Feature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureDefinitionImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclFeatureDefinition()
	 * @generated
	 */
	int OCL_FEATURE_DEFINITION = 69;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__FEATURE = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__CONTEXT_ = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION__STATIC = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ocl Feature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_DEFINITION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl <em>Ocl Context Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclContextDefinition()
	 * @generated
	 */
	int OCL_CONTEXT_DEFINITION = 70;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__DEFINITION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION__CONTEXT_ = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Context Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_CONTEXT_DEFINITION_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureImpl <em>Ocl Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclFeature()
	 * @generated
	 */
	int OCL_FEATURE = 71;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__DEFINITION = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE__EQ = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_FEATURE_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.AttributeImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 72;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LINE = OCL_FEATURE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COLUMN = OCL_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_START = OCL_FEATURE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHAR_END = OCL_FEATURE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFINITION = OCL_FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__EQ = OCL_FEATURE__EQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = OCL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__INIT_EXPRESSION = OCL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = OCL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = OCL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 73;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__LINE = OCL_FEATURE__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__COLUMN = OCL_FEATURE__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CHAR_START = OCL_FEATURE__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CHAR_END = OCL_FEATURE__CHAR_END;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__DEFINITION = OCL_FEATURE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__EQ = OCL_FEATURE__EQ;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = OCL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = OCL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = OCL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = OCL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = OCL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelImpl <em>Ocl Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelImpl
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModel()
	 * @generated
	 */
	int OCL_MODEL = 74;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__LINE = LOCATED_ELEMENT__LINE;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__COLUMN = LOCATED_ELEMENT__COLUMN;

	/**
	 * The feature id for the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__CHAR_START = LOCATED_ELEMENT__CHAR_START;

	/**
	 * The feature id for the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__CHAR_END = LOCATED_ELEMENT__CHAR_END;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__NAME = LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__METAMODEL = LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__ELEMENTS = LOCATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL__MODEL = LOCATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ocl Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MODEL_FEATURE_COUNT = LOCATED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 75;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 76;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 77;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getString()
	 * @generated
	 */
	int STRING = 78;


	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Located Element</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement
	 * @generated
	 */
	EClass getLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getLine()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Line();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getColumn()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_Column();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharStart <em>Char Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Start</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharStart()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharStart();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharEnd <em>Char End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char End</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharEnd()
	 * @see #getLocatedElement()
	 * @generated
	 */
	EAttribute getLocatedElement_CharEnd();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Module#getModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Module#getFeatures()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Features();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression
	 * @generated
	 */
	EClass getOclExpression();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getType()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_Type();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp3 <em>If Exp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp3</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp3()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp3();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getAppliedProperty <em>Applied Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applied Property</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getAppliedProperty()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_AppliedProperty();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getCollection()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_Collection();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Let Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getLetExp()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_LetExp();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getLoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getLoopExp()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_LoopExp();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getParentOperation <em>Parent Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Operation</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getParentOperation()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_ParentOperation();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getInitializedVariable <em>Initialized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Initialized Variable</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getInitializedVariable()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_InitializedVariable();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp2 <em>If Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp2</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp2()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp2();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Operation</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getOwningOperation()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_OwningOperation();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp1 <em>If Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>If Exp1</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getIfExp1()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_IfExp1();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getOwningAttribute <em>Owning Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Attribute</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getOwningAttribute()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_OwningAttribute();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp
	 * @generated
	 */
	EClass getVariableExp();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Variable</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp#getReferredVariable()
	 * @see #getVariableExp()
	 * @generated
	 */
	EReference getVariableExp_ReferredVariable();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp <em>Super Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Super Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp
	 * @generated
	 */
	EClass getSuperExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp <em>Self Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp
	 * @generated
	 */
	EClass getSelfExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp <em>Primitive Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp
	 * @generated
	 */
	EClass getPrimitiveExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StringExp <em>String Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StringExp
	 * @generated
	 */
	EClass getStringExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StringExp#getStringSymbol <em>String Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Symbol</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StringExp#getStringSymbol()
	 * @see #getStringExp()
	 * @generated
	 */
	EAttribute getStringExp_StringSymbol();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp
	 * @generated
	 */
	EClass getBooleanExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp#isBooleanSymbol <em>Boolean Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Symbol</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp#isBooleanSymbol()
	 * @see #getBooleanExp()
	 * @generated
	 */
	EAttribute getBooleanExp_BooleanSymbol();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp <em>Numeric Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp
	 * @generated
	 */
	EClass getNumericExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RealExp <em>Real Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RealExp
	 * @generated
	 */
	EClass getRealExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RealExp#getRealSymbol <em>Real Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Symbol</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RealExp#getRealSymbol()
	 * @see #getRealExp()
	 * @generated
	 */
	EAttribute getRealExp_RealSymbol();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp <em>Integer Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp
	 * @generated
	 */
	EClass getIntegerExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp#getIntegerSymbol <em>Integer Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Symbol</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp#getIntegerSymbol()
	 * @see #getIntegerExp()
	 * @generated
	 */
	EAttribute getIntegerExp_IntegerSymbol();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp <em>Collection Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp
	 * @generated
	 */
	EClass getCollectionExp();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp#getElements()
	 * @see #getCollectionExp()
	 * @generated
	 */
	EReference getCollectionExp_Elements();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BagExp <em>Bag Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BagExp
	 * @generated
	 */
	EClass getBagExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp <em>Ordered Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp
	 * @generated
	 */
	EClass getOrderedSetExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp <em>Sequence Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp
	 * @generated
	 */
	EClass getSequenceExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SetExp <em>Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SetExp
	 * @generated
	 */
	EClass getSetExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp <em>Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp
	 * @generated
	 */
	EClass getTupleExp();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp#getTuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple Part</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp#getTuplePart()
	 * @see #getTupleExp()
	 * @generated
	 */
	EReference getTupleExp_TuplePart();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Part</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart
	 * @generated
	 */
	EClass getTuplePart();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart#getTuple()
	 * @see #getTuplePart()
	 * @generated
	 */
	EReference getTuplePart_Tuple();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapExp <em>Map Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapExp
	 * @generated
	 */
	EClass getMapExp();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapExp#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapExp#getElements()
	 * @see #getMapExp()
	 * @generated
	 */
	EReference getMapExp_Elements();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Element</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement
	 * @generated
	 */
	EClass getMapElement();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getMap()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Map();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getKey()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Key();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement#getValue()
	 * @see #getMapElement()
	 * @generated
	 */
	EReference getMapElement_Value();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp
	 * @generated
	 */
	EClass getEnumLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp#getName()
	 * @see #getEnumLiteralExp()
	 * @generated
	 */
	EAttribute getEnumLiteralExp_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Undefined Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp
	 * @generated
	 */
	EClass getOclUndefinedExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp <em>Static Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Property Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp
	 * @generated
	 */
	EClass getStaticPropertyCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getSource()
	 * @see #getStaticPropertyCallExp()
	 * @generated
	 */
	EReference getStaticPropertyCallExp_Source();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getStaticCall()
	 * @see #getStaticPropertyCallExp()
	 * @generated
	 */
	EReference getStaticPropertyCallExp_StaticCall();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall <em>Static Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Property Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall
	 * @generated
	 */
	EClass getStaticPropertyCall();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall <em>Static Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Navigation Or Attribute Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall
	 * @generated
	 */
	EClass getStaticNavigationOrAttributeCall();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall#getName()
	 * @see #getStaticNavigationOrAttributeCall()
	 * @generated
	 */
	EAttribute getStaticNavigationOrAttributeCall_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall <em>Static Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Operation Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall
	 * @generated
	 */
	EClass getStaticOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall#getArguments()
	 * @see #getStaticOperationCall()
	 * @generated
	 */
	EReference getStaticOperationCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall#getOperationName()
	 * @see #getStaticOperationCall()
	 * @generated
	 */
	EAttribute getStaticOperationCall_OperationName();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp
	 * @generated
	 */
	EClass getPropertyCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp#getSource()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	EReference getPropertyCallExp_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Calls</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp#getCalls()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	EReference getPropertyCallExp_Calls();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall <em>Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall
	 * @generated
	 */
	EClass getPropertyCall();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall <em>Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Or Attribute Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall
	 * @generated
	 */
	EClass getNavigationOrAttributeCall();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall#getName()
	 * @see #getNavigationOrAttributeCall()
	 * @generated
	 */
	EAttribute getNavigationOrAttributeCall_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall
	 * @generated
	 */
	EClass getOperationCall();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall#getArguments()
	 * @see #getOperationCall()
	 * @generated
	 */
	EReference getOperationCall_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall#getOperationName()
	 * @see #getOperationCall()
	 * @generated
	 */
	EAttribute getOperationCall_OperationName();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp <em>Operator Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp
	 * @generated
	 */
	EClass getOperatorCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp#getArgument()
	 * @see #getOperatorCallExp()
	 * @generated
	 */
	EReference getOperatorCallExp_Argument();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp#getOperationName()
	 * @see #getOperatorCallExp()
	 * @generated
	 */
	EAttribute getOperatorCallExp_OperationName();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp <em>Not Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp
	 * @generated
	 */
	EClass getNotOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp <em>Rel Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rel Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp
	 * @generated
	 */
	EClass getRelOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp <em>Eq Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eq Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp
	 * @generated
	 */
	EClass getEqOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp <em>Add Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp
	 * @generated
	 */
	EClass getAddOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp <em>Int Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp
	 * @generated
	 */
	EClass getIntOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp <em>Mul Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mul Op Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp
	 * @generated
	 */
	EClass getMulOpCallExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp <em>Lambda Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Call Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp
	 * @generated
	 */
	EClass getLambdaCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp#getArguments()
	 * @see #getLambdaCallExp()
	 * @generated
	 */
	EReference getLambdaCallExp_Arguments();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp <em>Brace Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brace Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp
	 * @generated
	 */
	EClass getBraceExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp#getExp()
	 * @see #getBraceExp()
	 * @generated
	 */
	EReference getBraceExp_Exp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall <em>Collection Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Operation Call</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall
	 * @generated
	 */
	EClass getCollectionOperationCall();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getBody()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getIterators <em>Iterators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterators</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp#getIterators()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Iterators();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterate Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp
	 * @generated
	 */
	EClass getIterateExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp#getResult()
	 * @see #getIterateExp()
	 * @generated
	 */
	EReference getIterateExp_Result();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp
	 * @generated
	 */
	EClass getIteratorExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp#getName()
	 * @see #getIteratorExp()
	 * @generated
	 */
	EAttribute getIteratorExp_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LetExp
	 * @generated
	 */
	EClass getLetExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getVariable()
	 * @see #getLetExp()
	 * @generated
	 */
	EReference getLetExp_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getIn_ <em>In </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In </em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getIn_()
	 * @see #getLetExp()
	 * @generated
	 */
	EReference getLetExp_In_();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IfExp
	 * @generated
	 */
	EClass getIfExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getThenExpression()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getCondition()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IfExp#getElseExpression()
	 * @see #getIfExp()
	 * @generated
	 */
	EReference getIfExp_ElseExpression();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getVarName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_VarName();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getVariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variable Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration#getVariableExp()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EReference getVariableDeclaration_VariableExp();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getLetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Let Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getLetExp()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_LetExp();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getInitExpression()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_InitExpression();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getBaseExp <em>Base Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Base Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getBaseExp()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EReference getLocalVariable_BaseExp();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getEq()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Eq();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Iterator#getLoopExpr <em>Loop Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Expr</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Iterator#getLoopExpr()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_LoopExpr();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Parameter#getOperation()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Operation();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType#getElementType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType
	 * @generated
	 */
	EClass getOclType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getName()
	 * @see #getOclType()
	 * @generated
	 */
	EAttribute getOclType_Name();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definitions</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getDefinitions()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Definitions();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ocl Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOclExpression()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_OclExpression();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Operation</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getOperation()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Operation();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType2 <em>Map Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map Type2</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType2()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_MapType2();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Attribute</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getAttribute()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_Attribute();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Map Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getMapType()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_MapType();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getCollectionTypes <em>Collection Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection Types</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getCollectionTypes()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_CollectionTypes();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple Type Attribute</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_TupleTypeAttribute();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getVariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Variable Declaration</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getVariableDeclaration()
	 * @see #getOclType()
	 * @generated
	 */
	EReference getOclType_VariableDeclaration();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp <em>Ocl Model Element Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model Element Exp</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp
	 * @generated
	 */
	EClass getOclModelElementExp();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp#getModel()
	 * @see #getOclModelElementExp()
	 * @generated
	 */
	EReference getOclModelElementExp_Model();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp#getName()
	 * @see #getOclModelElementExp()
	 * @generated
	 */
	EAttribute getOclModelElementExp_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType
	 * @generated
	 */
	EClass getIntegerType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType
	 * @generated
	 */
	EClass getOrderedSetType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType <em>Ocl Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Any Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType
	 * @generated
	 */
	EClass getOclAnyType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleType#getAttributes()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Attributes();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type Attribute</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute
	 * @generated
	 */
	EClass getTupleTypeAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EReference getTupleTypeAttribute_Type();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getTupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tuple Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getTupleType()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EReference getTupleTypeAttribute_TupleType();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getName()
	 * @see #getTupleTypeAttribute()
	 * @generated
	 */
	EAttribute getTupleTypeAttribute_Name();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement <em>Ocl Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model Element</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement
	 * @generated
	 */
	EClass getOclModelElement();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement#getModel()
	 * @see #getOclModelElement()
	 * @generated
	 */
	EReference getOclModelElement_Model();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType
	 * @generated
	 */
	EClass getMapType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getValueType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_ValueType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType#getKeyType()
	 * @see #getMapType()
	 * @generated
	 */
	EReference getMapType_KeyType();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType <em>Lambda Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType
	 * @generated
	 */
	EClass getLambdaType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType#getReturnType()
	 * @see #getLambdaType()
	 * @generated
	 */
	EReference getLambdaType_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType#getArgumentTypes <em>Argument Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Types</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType#getArgumentTypes()
	 * @see #getLambdaType()
	 * @generated
	 */
	EReference getLambdaType_ArgumentTypes();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition <em>Ocl Feature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature Definition</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition
	 * @generated
	 */
	EClass getOclFeatureDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#getFeature()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EReference getOclFeatureDefinition_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context </em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#getContext_()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EReference getOclFeatureDefinition_Context_();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition#isStatic()
	 * @see #getOclFeatureDefinition()
	 * @generated
	 */
	EAttribute getOclFeatureDefinition_Static();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition <em>Ocl Context Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Context Definition</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition
	 * @generated
	 */
	EClass getOclContextDefinition();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definition</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getDefinition()
	 * @see #getOclContextDefinition()
	 * @generated
	 */
	EReference getOclContextDefinition_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getContext_ <em>Context </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context </em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition#getContext_()
	 * @see #getOclContextDefinition()
	 * @generated
	 */
	EReference getOclContextDefinition_Context_();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature <em>Ocl Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Feature</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature
	 * @generated
	 */
	EClass getOclFeature();

	/**
	 * Returns the meta object for the container reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Definition</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature#getDefinition()
	 * @see #getOclFeature()
	 * @generated
	 */
	EReference getOclFeature_Definition();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eq</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature#getEq()
	 * @see #getOclFeature()
	 * @generated
	 */
	EAttribute getOclFeature_Eq();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getInitExpression()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_InitExpression();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Body();

	/**
	 * Returns the meta object for class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel <em>Ocl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Model</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel
	 * @generated
	 */
	EClass getOclModel();

	/**
	 * Returns the meta object for the attribute '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getName()
	 * @see #getOclModel()
	 * @generated
	 */
	EAttribute getOclModel_Name();

	/**
	 * Returns the meta object for the reference '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getMetamodel()
	 * @see #getOclModel()
	 * @generated
	 */
	EReference getOclModel_Metamodel();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getElements()
	 * @see #getOclModel()
	 * @generated
	 */
	EReference getOclModel_Elements();

	/**
	 * Returns the meta object for the reference list '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model</em>'.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel#getModel()
	 * @see #getOclModel()
	 * @generated
	 */
	EReference getOclModel_Model();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '<em>Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @model instanceClass="double"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '<em>Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmigOclFactory getEmigOclFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocatedElementImpl <em>Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocatedElementImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLocatedElement()
		 * @generated
		 */
		EClass LOCATED_ELEMENT = eINSTANCE.getLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__LINE = eINSTANCE.getLocatedElement_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__COLUMN = eINSTANCE.getLocatedElement_Column();

		/**
		 * The meta object literal for the '<em><b>Char Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_START = eINSTANCE.getLocatedElement_CharStart();

		/**
		 * The meta object literal for the '<em><b>Char End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATED_ELEMENT__CHAR_END = eINSTANCE.getLocatedElement_CharEnd();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.ModuleImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODELS = eINSTANCE.getModule_Models();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__FEATURES = eINSTANCE.getModule_Features();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclExpressionImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__TYPE = eINSTANCE.getOclExpression_Type();

		/**
		 * The meta object literal for the '<em><b>If Exp3</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP3 = eINSTANCE.getOclExpression_IfExp3();

		/**
		 * The meta object literal for the '<em><b>Applied Property</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__APPLIED_PROPERTY = eINSTANCE.getOclExpression_AppliedProperty();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__COLLECTION = eINSTANCE.getOclExpression_Collection();

		/**
		 * The meta object literal for the '<em><b>Let Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__LET_EXP = eINSTANCE.getOclExpression_LetExp();

		/**
		 * The meta object literal for the '<em><b>Loop Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__LOOP_EXP = eINSTANCE.getOclExpression_LoopExp();

		/**
		 * The meta object literal for the '<em><b>Parent Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__PARENT_OPERATION = eINSTANCE.getOclExpression_ParentOperation();

		/**
		 * The meta object literal for the '<em><b>Initialized Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__INITIALIZED_VARIABLE = eINSTANCE.getOclExpression_InitializedVariable();

		/**
		 * The meta object literal for the '<em><b>If Exp2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP2 = eINSTANCE.getOclExpression_IfExp2();

		/**
		 * The meta object literal for the '<em><b>Owning Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__OWNING_OPERATION = eINSTANCE.getOclExpression_OwningOperation();

		/**
		 * The meta object literal for the '<em><b>If Exp1</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__IF_EXP1 = eINSTANCE.getOclExpression_IfExp1();

		/**
		 * The meta object literal for the '<em><b>Owning Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__OWNING_ATTRIBUTE = eINSTANCE.getOclExpression_OwningAttribute();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableExpImpl <em>Variable Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getVariableExp()
		 * @generated
		 */
		EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

		/**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableExp_ReferredVariable();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SuperExpImpl <em>Super Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SuperExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSuperExp()
		 * @generated
		 */
		EClass SUPER_EXP = eINSTANCE.getSuperExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SelfExpImpl <em>Self Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SelfExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSelfExp()
		 * @generated
		 */
		EClass SELF_EXP = eINSTANCE.getSelfExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveExpImpl <em>Primitive Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPrimitiveExp()
		 * @generated
		 */
		EClass PRIMITIVE_EXP = eINSTANCE.getPrimitiveExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringExpImpl <em>String Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStringExp()
		 * @generated
		 */
		EClass STRING_EXP = eINSTANCE.getStringExp();

		/**
		 * The meta object literal for the '<em><b>String Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXP__STRING_SYMBOL = eINSTANCE.getStringExp_StringSymbol();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanExpImpl <em>Boolean Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBooleanExp()
		 * @generated
		 */
		EClass BOOLEAN_EXP = eINSTANCE.getBooleanExp();

		/**
		 * The meta object literal for the '<em><b>Boolean Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_EXP__BOOLEAN_SYMBOL = eINSTANCE.getBooleanExp_BooleanSymbol();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericExpImpl <em>Numeric Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNumericExp()
		 * @generated
		 */
		EClass NUMERIC_EXP = eINSTANCE.getNumericExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealExpImpl <em>Real Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRealExp()
		 * @generated
		 */
		EClass REAL_EXP = eINSTANCE.getRealExp();

		/**
		 * The meta object literal for the '<em><b>Real Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_EXP__REAL_SYMBOL = eINSTANCE.getRealExp_RealSymbol();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerExpImpl <em>Integer Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntegerExp()
		 * @generated
		 */
		EClass INTEGER_EXP = eINSTANCE.getIntegerExp();

		/**
		 * The meta object literal for the '<em><b>Integer Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_EXP__INTEGER_SYMBOL = eINSTANCE.getIntegerExp_IntegerSymbol();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionExpImpl <em>Collection Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionExp()
		 * @generated
		 */
		EClass COLLECTION_EXP = eINSTANCE.getCollectionExp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_EXP__ELEMENTS = eINSTANCE.getCollectionExp_Elements();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagExpImpl <em>Bag Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBagExp()
		 * @generated
		 */
		EClass BAG_EXP = eINSTANCE.getBagExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetExpImpl <em>Ordered Set Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOrderedSetExp()
		 * @generated
		 */
		EClass ORDERED_SET_EXP = eINSTANCE.getOrderedSetExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceExpImpl <em>Sequence Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSequenceExp()
		 * @generated
		 */
		EClass SEQUENCE_EXP = eINSTANCE.getSequenceExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetExpImpl <em>Set Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSetExp()
		 * @generated
		 */
		EClass SET_EXP = eINSTANCE.getSetExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleExpImpl <em>Tuple Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleExp()
		 * @generated
		 */
		EClass TUPLE_EXP = eINSTANCE.getTupleExp();

		/**
		 * The meta object literal for the '<em><b>Tuple Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_EXP__TUPLE_PART = eINSTANCE.getTupleExp_TuplePart();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TuplePartImpl <em>Tuple Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TuplePartImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTuplePart()
		 * @generated
		 */
		EClass TUPLE_PART = eINSTANCE.getTuplePart();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_PART__TUPLE = eINSTANCE.getTuplePart_Tuple();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapExpImpl <em>Map Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapExp()
		 * @generated
		 */
		EClass MAP_EXP = eINSTANCE.getMapExp();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_EXP__ELEMENTS = eINSTANCE.getMapExp_Elements();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapElementImpl <em>Map Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapElementImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapElement()
		 * @generated
		 */
		EClass MAP_ELEMENT = eINSTANCE.getMapElement();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__MAP = eINSTANCE.getMapElement_Map();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__KEY = eINSTANCE.getMapElement_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ELEMENT__VALUE = eINSTANCE.getMapElement_Value();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.EnumLiteralExpImpl <em>Enum Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EnumLiteralExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getEnumLiteralExp()
		 * @generated
		 */
		EClass ENUM_LITERAL_EXP = eINSTANCE.getEnumLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_EXP__NAME = eINSTANCE.getEnumLiteralExp_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclUndefinedExpImpl <em>Ocl Undefined Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclUndefinedExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclUndefinedExp()
		 * @generated
		 */
		EClass OCL_UNDEFINED_EXP = eINSTANCE.getOclUndefinedExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallExpImpl <em>Static Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticPropertyCallExp()
		 * @generated
		 */
		EClass STATIC_PROPERTY_CALL_EXP = eINSTANCE.getStaticPropertyCallExp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_PROPERTY_CALL_EXP__SOURCE = eINSTANCE.getStaticPropertyCallExp_Source();

		/**
		 * The meta object literal for the '<em><b>Static Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_PROPERTY_CALL_EXP__STATIC_CALL = eINSTANCE.getStaticPropertyCallExp_StaticCall();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallImpl <em>Static Property Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticPropertyCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticPropertyCall()
		 * @generated
		 */
		EClass STATIC_PROPERTY_CALL = eINSTANCE.getStaticPropertyCall();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticNavigationOrAttributeCallImpl <em>Static Navigation Or Attribute Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticNavigationOrAttributeCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticNavigationOrAttributeCall()
		 * @generated
		 */
		EClass STATIC_NAVIGATION_OR_ATTRIBUTE_CALL = eINSTANCE.getStaticNavigationOrAttributeCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME = eINSTANCE.getStaticNavigationOrAttributeCall_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticOperationCallImpl <em>Static Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StaticOperationCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStaticOperationCall()
		 * @generated
		 */
		EClass STATIC_OPERATION_CALL = eINSTANCE.getStaticOperationCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_OPERATION_CALL__ARGUMENTS = eINSTANCE.getStaticOperationCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_OPERATION_CALL__OPERATION_NAME = eINSTANCE.getStaticOperationCall_OperationName();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPropertyCallExp()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP__SOURCE = eINSTANCE.getPropertyCallExp_Source();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP__CALLS = eINSTANCE.getPropertyCallExp_Calls();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallImpl <em>Property Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PropertyCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPropertyCall()
		 * @generated
		 */
		EClass PROPERTY_CALL = eINSTANCE.getPropertyCall();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NavigationOrAttributeCallImpl <em>Navigation Or Attribute Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NavigationOrAttributeCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNavigationOrAttributeCall()
		 * @generated
		 */
		EClass NAVIGATION_OR_ATTRIBUTE_CALL = eINSTANCE.getNavigationOrAttributeCall();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_OR_ATTRIBUTE_CALL__NAME = eINSTANCE.getNavigationOrAttributeCall_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationCallImpl <em>Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperationCall()
		 * @generated
		 */
		EClass OPERATION_CALL = eINSTANCE.getOperationCall();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL__ARGUMENTS = eINSTANCE.getOperationCall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL__OPERATION_NAME = eINSTANCE.getOperationCall_OperationName();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperatorCallExpImpl <em>Operator Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperatorCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperatorCallExp()
		 * @generated
		 */
		EClass OPERATOR_CALL_EXP = eINSTANCE.getOperatorCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR_CALL_EXP__ARGUMENT = eINSTANCE.getOperatorCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR_CALL_EXP__OPERATION_NAME = eINSTANCE.getOperatorCallExp_OperationName();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NotOpCallExpImpl <em>Not Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NotOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNotOpCallExp()
		 * @generated
		 */
		EClass NOT_OP_CALL_EXP = eINSTANCE.getNotOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RelOpCallExpImpl <em>Rel Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RelOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRelOpCallExp()
		 * @generated
		 */
		EClass REL_OP_CALL_EXP = eINSTANCE.getRelOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.EqOpCallExpImpl <em>Eq Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EqOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getEqOpCallExp()
		 * @generated
		 */
		EClass EQ_OP_CALL_EXP = eINSTANCE.getEqOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.AddOpCallExpImpl <em>Add Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.AddOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getAddOpCallExp()
		 * @generated
		 */
		EClass ADD_OP_CALL_EXP = eINSTANCE.getAddOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntOpCallExpImpl <em>Int Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntOpCallExp()
		 * @generated
		 */
		EClass INT_OP_CALL_EXP = eINSTANCE.getIntOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MulOpCallExpImpl <em>Mul Op Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MulOpCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMulOpCallExp()
		 * @generated
		 */
		EClass MUL_OP_CALL_EXP = eINSTANCE.getMulOpCallExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaCallExpImpl <em>Lambda Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaCallExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLambdaCallExp()
		 * @generated
		 */
		EClass LAMBDA_CALL_EXP = eINSTANCE.getLambdaCallExp();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_CALL_EXP__ARGUMENTS = eINSTANCE.getLambdaCallExp_Arguments();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BraceExpImpl <em>Brace Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BraceExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBraceExp()
		 * @generated
		 */
		EClass BRACE_EXP = eINSTANCE.getBraceExp();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACE_EXP__EXP = eINSTANCE.getBraceExp_Exp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionOperationCallImpl <em>Collection Operation Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionOperationCallImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionOperationCall()
		 * @generated
		 */
		EClass COLLECTION_OPERATION_CALL = eINSTANCE.getCollectionOperationCall();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LoopExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__BODY = eINSTANCE.getLoopExp_Body();

		/**
		 * The meta object literal for the '<em><b>Iterators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__ITERATORS = eINSTANCE.getLoopExp_Iterators();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IterateExpImpl <em>Iterate Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IterateExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIterateExp()
		 * @generated
		 */
		EClass ITERATE_EXP = eINSTANCE.getIterateExp();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATE_EXP__RESULT = eINSTANCE.getIterateExp_Result();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIteratorExp()
		 * @generated
		 */
		EClass ITERATOR_EXP = eINSTANCE.getIteratorExp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_EXP__NAME = eINSTANCE.getIteratorExp_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LetExpImpl <em>Let Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LetExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLetExp()
		 * @generated
		 */
		EClass LET_EXP = eINSTANCE.getLetExp();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP__VARIABLE = eINSTANCE.getLetExp_Variable();

		/**
		 * The meta object literal for the '<em><b>In </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET_EXP__IN_ = eINSTANCE.getLetExp_In_();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IfExpImpl <em>If Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IfExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIfExp()
		 * @generated
		 */
		EClass IF_EXP = eINSTANCE.getIfExp();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__THEN_EXPRESSION = eINSTANCE.getIfExp_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__CONDITION = eINSTANCE.getIfExp_Condition();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXP__ELSE_EXPRESSION = eINSTANCE.getIfExp_ElseExpression();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.VariableDeclarationImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__VAR_NAME = eINSTANCE.getVariableDeclaration_VarName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Variable Exp</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECLARATION__VARIABLE_EXP = eINSTANCE.getVariableDeclaration_VariableExp();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LocalVariableImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Let Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__LET_EXP = eINSTANCE.getLocalVariable_LetExp();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__INIT_EXPRESSION = eINSTANCE.getLocalVariable_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Base Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLE__BASE_EXP = eINSTANCE.getLocalVariable_BaseExp();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__EQ = eINSTANCE.getLocalVariable_Eq();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IteratorImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIterator()
		 * @generated
		 */
		EClass ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em><b>Loop Expr</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__LOOP_EXPR = eINSTANCE.getIterator_LoopExpr();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.ParameterImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.CollectionTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclTypeImpl <em>Ocl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclType()
		 * @generated
		 */
		EClass OCL_TYPE = eINSTANCE.getOclType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_TYPE__NAME = eINSTANCE.getOclType_Name();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__DEFINITIONS = eINSTANCE.getOclType_Definitions();

		/**
		 * The meta object literal for the '<em><b>Ocl Expression</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OCL_EXPRESSION = eINSTANCE.getOclType_OclExpression();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__OPERATION = eINSTANCE.getOclType_Operation();

		/**
		 * The meta object literal for the '<em><b>Map Type2</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__MAP_TYPE2 = eINSTANCE.getOclType_MapType2();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__ATTRIBUTE = eINSTANCE.getOclType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Map Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__MAP_TYPE = eINSTANCE.getOclType_MapType();

		/**
		 * The meta object literal for the '<em><b>Collection Types</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__COLLECTION_TYPES = eINSTANCE.getOclType_CollectionTypes();

		/**
		 * The meta object literal for the '<em><b>Tuple Type Attribute</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__TUPLE_TYPE_ATTRIBUTE = eINSTANCE.getOclType_TupleTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Variable Declaration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_TYPE__VARIABLE_DECLARATION = eINSTANCE.getOclType_VariableDeclaration();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementExpImpl <em>Ocl Model Element Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementExpImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModelElementExp()
		 * @generated
		 */
		EClass OCL_MODEL_ELEMENT_EXP = eINSTANCE.getOclModelElementExp();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL_ELEMENT_EXP__MODEL = eINSTANCE.getOclModelElementExp_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_MODEL_ELEMENT_EXP__NAME = eINSTANCE.getOclModelElementExp_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.PrimitiveImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.StringTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BooleanTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.NumericTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.IntegerTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getIntegerType()
		 * @generated
		 */
		EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealTypeImpl <em>Real Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.RealTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getRealType()
		 * @generated
		 */
		EClass REAL_TYPE = eINSTANCE.getRealType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.BagTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OrderedSetTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOrderedSetType()
		 * @generated
		 */
		EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SequenceTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.SetTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclAnyTypeImpl <em>Ocl Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclAnyTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclAnyType()
		 * @generated
		 */
		EClass OCL_ANY_TYPE = eINSTANCE.getOclAnyType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__ATTRIBUTES = eINSTANCE.getTupleType_Attributes();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeAttributeImpl <em>Tuple Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.TupleTypeAttributeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getTupleTypeAttribute()
		 * @generated
		 */
		EClass TUPLE_TYPE_ATTRIBUTE = eINSTANCE.getTupleTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_ATTRIBUTE__TYPE = eINSTANCE.getTupleTypeAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Tuple Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE = eINSTANCE.getTupleTypeAttribute_TupleType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE_TYPE_ATTRIBUTE__NAME = eINSTANCE.getTupleTypeAttribute_Name();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementImpl <em>Ocl Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelElementImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModelElement()
		 * @generated
		 */
		EClass OCL_MODEL_ELEMENT = eINSTANCE.getOclModelElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL_ELEMENT__MODEL = eINSTANCE.getOclModelElement_Model();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapTypeImpl <em>Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.MapTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getMapType()
		 * @generated
		 */
		EClass MAP_TYPE = eINSTANCE.getMapType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__VALUE_TYPE = eINSTANCE.getMapType_ValueType();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_TYPE__KEY_TYPE = eINSTANCE.getMapType_KeyType();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl <em>Lambda Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getLambdaType()
		 * @generated
		 */
		EClass LAMBDA_TYPE = eINSTANCE.getLambdaType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_TYPE__RETURN_TYPE = eINSTANCE.getLambdaType_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Argument Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA_TYPE__ARGUMENT_TYPES = eINSTANCE.getLambdaType_ArgumentTypes();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureDefinitionImpl <em>Ocl Feature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureDefinitionImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclFeatureDefinition()
		 * @generated
		 */
		EClass OCL_FEATURE_DEFINITION = eINSTANCE.getOclFeatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE_DEFINITION__FEATURE = eINSTANCE.getOclFeatureDefinition_Feature();

		/**
		 * The meta object literal for the '<em><b>Context </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE_DEFINITION__CONTEXT_ = eINSTANCE.getOclFeatureDefinition_Context_();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FEATURE_DEFINITION__STATIC = eINSTANCE.getOclFeatureDefinition_Static();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl <em>Ocl Context Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclContextDefinition()
		 * @generated
		 */
		EClass OCL_CONTEXT_DEFINITION = eINSTANCE.getOclContextDefinition();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT_DEFINITION__DEFINITION = eINSTANCE.getOclContextDefinition_Definition();

		/**
		 * The meta object literal for the '<em><b>Context </b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_CONTEXT_DEFINITION__CONTEXT_ = eINSTANCE.getOclContextDefinition_Context_();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureImpl <em>Ocl Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclFeatureImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclFeature()
		 * @generated
		 */
		EClass OCL_FEATURE = eINSTANCE.getOclFeature();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_FEATURE__DEFINITION = eINSTANCE.getOclFeature_Definition();

		/**
		 * The meta object literal for the '<em><b>Eq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_FEATURE__EQ = eINSTANCE.getOclFeature_Eq();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.AttributeImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__INIT_EXPRESSION = eINSTANCE.getAttribute_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OperationImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelImpl <em>Ocl Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclModelImpl
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getOclModel()
		 * @generated
		 */
		EClass OCL_MODEL = eINSTANCE.getOclModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_MODEL__NAME = eINSTANCE.getOclModel_Name();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL__METAMODEL = eINSTANCE.getOclModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL__ELEMENTS = eINSTANCE.getOclModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_MODEL__MODEL = eINSTANCE.getOclModel_Model();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see it.univaq.coevolution.emfmigrate.EmigOcl.impl.EmigOclPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //EmigOclPackage
