/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.impl;

import it.univaq.coevolution.emfmigrate.EmigOcl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EmigOclFactoryImpl extends EFactoryImpl implements EmigOclFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EmigOclFactory init() {
		try {
			EmigOclFactory theEmigOclFactory = (EmigOclFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.univaq.it/coevolution/emfmigrate/EmigOcl"); 
			if (theEmigOclFactory != null) {
				return theEmigOclFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmigOclFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmigOclFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EmigOclPackage.MODULE: return createModule();
			case EmigOclPackage.VARIABLE_EXP: return createVariableExp();
			case EmigOclPackage.SUPER_EXP: return createSuperExp();
			case EmigOclPackage.SELF_EXP: return createSelfExp();
			case EmigOclPackage.STRING_EXP: return createStringExp();
			case EmigOclPackage.BOOLEAN_EXP: return createBooleanExp();
			case EmigOclPackage.REAL_EXP: return createRealExp();
			case EmigOclPackage.INTEGER_EXP: return createIntegerExp();
			case EmigOclPackage.BAG_EXP: return createBagExp();
			case EmigOclPackage.ORDERED_SET_EXP: return createOrderedSetExp();
			case EmigOclPackage.SEQUENCE_EXP: return createSequenceExp();
			case EmigOclPackage.SET_EXP: return createSetExp();
			case EmigOclPackage.TUPLE_EXP: return createTupleExp();
			case EmigOclPackage.TUPLE_PART: return createTuplePart();
			case EmigOclPackage.MAP_EXP: return createMapExp();
			case EmigOclPackage.MAP_ELEMENT: return createMapElement();
			case EmigOclPackage.ENUM_LITERAL_EXP: return createEnumLiteralExp();
			case EmigOclPackage.OCL_UNDEFINED_EXP: return createOclUndefinedExp();
			case EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL_EXP: return createNavigationOrAttributeCallExp();
			case EmigOclPackage.OPERATION_CALL_EXP: return createOperationCallExp();
			case EmigOclPackage.OPERATOR_CALL_EXP: return createOperatorCallExp();
			case EmigOclPackage.NOT_OP_CALL_EXP: return createNotOpCallExp();
			case EmigOclPackage.REL_OP_CALL_EXP: return createRelOpCallExp();
			case EmigOclPackage.ADD_OP_CALL_EXP: return createAddOpCallExp();
			case EmigOclPackage.INT_OP_CALL_EXP: return createIntOpCallExp();
			case EmigOclPackage.MUL_OP_CALL_EXP: return createMulOpCallExp();
			case EmigOclPackage.BRACE_EXP: return createBraceExp();
			case EmigOclPackage.COLLECTION_OPERATION_CALL_EXP: return createCollectionOperationCallExp();
			case EmigOclPackage.ITERATE_EXP: return createIterateExp();
			case EmigOclPackage.ITERATOR_EXP: return createIteratorExp();
			case EmigOclPackage.LET_EXP: return createLetExp();
			case EmigOclPackage.IF_EXP: return createIfExp();
			case EmigOclPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case EmigOclPackage.ITERATOR: return createIterator();
			case EmigOclPackage.PARAMETER: return createParameter();
			case EmigOclPackage.COLLECTION_TYPE: return createCollectionType();
			case EmigOclPackage.OCL_MODEL_ELEMENT_EXP: return createOclModelElementExp();
			case EmigOclPackage.STRING_TYPE: return createStringType();
			case EmigOclPackage.BOOLEAN_TYPE: return createBooleanType();
			case EmigOclPackage.INTEGER_TYPE: return createIntegerType();
			case EmigOclPackage.REAL_TYPE: return createRealType();
			case EmigOclPackage.BAG_TYPE: return createBagType();
			case EmigOclPackage.ORDERED_SET_TYPE: return createOrderedSetType();
			case EmigOclPackage.SEQUENCE_TYPE: return createSequenceType();
			case EmigOclPackage.SET_TYPE: return createSetType();
			case EmigOclPackage.OCL_ANY_TYPE: return createOclAnyType();
			case EmigOclPackage.TUPLE_TYPE: return createTupleType();
			case EmigOclPackage.TUPLE_TYPE_ATTRIBUTE: return createTupleTypeAttribute();
			case EmigOclPackage.OCL_MODEL_ELEMENT: return createOclModelElement();
			case EmigOclPackage.MAP_TYPE: return createMapType();
			case EmigOclPackage.OCL_FEATURE_DEFINITION: return createOclFeatureDefinition();
			case EmigOclPackage.OCL_CONTEXT_DEFINITION: return createOclContextDefinition();
			case EmigOclPackage.ATTRIBUTE: return createAttribute();
			case EmigOclPackage.OPERATION: return createOperation();
			case EmigOclPackage.OCL_MODEL: return createOclModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmigOclPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case EmigOclPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			case EmigOclPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case EmigOclPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmigOclPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case EmigOclPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			case EmigOclPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case EmigOclPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExp createVariableExp() {
		VariableExpImpl variableExp = new VariableExpImpl();
		return variableExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperExp createSuperExp() {
		SuperExpImpl superExp = new SuperExpImpl();
		return superExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfExp createSelfExp() {
		SelfExpImpl selfExp = new SelfExpImpl();
		return selfExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExp createStringExp() {
		StringExpImpl stringExp = new StringExpImpl();
		return stringExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExp createBooleanExp() {
		BooleanExpImpl booleanExp = new BooleanExpImpl();
		return booleanExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealExp createRealExp() {
		RealExpImpl realExp = new RealExpImpl();
		return realExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerExp createIntegerExp() {
		IntegerExpImpl integerExp = new IntegerExpImpl();
		return integerExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagExp createBagExp() {
		BagExpImpl bagExp = new BagExpImpl();
		return bagExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetExp createOrderedSetExp() {
		OrderedSetExpImpl orderedSetExp = new OrderedSetExpImpl();
		return orderedSetExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceExp createSequenceExp() {
		SequenceExpImpl sequenceExp = new SequenceExpImpl();
		return sequenceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExp createSetExp() {
		SetExpImpl setExp = new SetExpImpl();
		return setExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleExp createTupleExp() {
		TupleExpImpl tupleExp = new TupleExpImpl();
		return tupleExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuplePart createTuplePart() {
		TuplePartImpl tuplePart = new TuplePartImpl();
		return tuplePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapExp createMapExp() {
		MapExpImpl mapExp = new MapExpImpl();
		return mapExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapElement createMapElement() {
		MapElementImpl mapElement = new MapElementImpl();
		return mapElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralExp createEnumLiteralExp() {
		EnumLiteralExpImpl enumLiteralExp = new EnumLiteralExpImpl();
		return enumLiteralExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclUndefinedExp createOclUndefinedExp() {
		OclUndefinedExpImpl oclUndefinedExp = new OclUndefinedExpImpl();
		return oclUndefinedExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationOrAttributeCallExp createNavigationOrAttributeCallExp() {
		NavigationOrAttributeCallExpImpl navigationOrAttributeCallExp = new NavigationOrAttributeCallExpImpl();
		return navigationOrAttributeCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallExp createOperationCallExp() {
		OperationCallExpImpl operationCallExp = new OperationCallExpImpl();
		return operationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorCallExp createOperatorCallExp() {
		OperatorCallExpImpl operatorCallExp = new OperatorCallExpImpl();
		return operatorCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOpCallExp createNotOpCallExp() {
		NotOpCallExpImpl notOpCallExp = new NotOpCallExpImpl();
		return notOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelOpCallExp createRelOpCallExp() {
		RelOpCallExpImpl relOpCallExp = new RelOpCallExpImpl();
		return relOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOpCallExp createAddOpCallExp() {
		AddOpCallExpImpl addOpCallExp = new AddOpCallExpImpl();
		return addOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntOpCallExp createIntOpCallExp() {
		IntOpCallExpImpl intOpCallExp = new IntOpCallExpImpl();
		return intOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulOpCallExp createMulOpCallExp() {
		MulOpCallExpImpl mulOpCallExp = new MulOpCallExpImpl();
		return mulOpCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BraceExp createBraceExp() {
		BraceExpImpl braceExp = new BraceExpImpl();
		return braceExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionOperationCallExp createCollectionOperationCallExp() {
		CollectionOperationCallExpImpl collectionOperationCallExp = new CollectionOperationCallExpImpl();
		return collectionOperationCallExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IterateExp createIterateExp() {
		IterateExpImpl iterateExp = new IterateExpImpl();
		return iterateExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExp createIteratorExp() {
		IteratorExpImpl iteratorExp = new IteratorExpImpl();
		return iteratorExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExp createLetExp() {
		LetExpImpl letExp = new LetExpImpl();
		return letExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExp createIfExp() {
		IfExpImpl ifExp = new IfExpImpl();
		return ifExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator createIterator() {
		IteratorImpl iterator = new IteratorImpl();
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModelElementExp createOclModelElementExp() {
		OclModelElementExpImpl oclModelElementExp = new OclModelElementExpImpl();
		return oclModelElementExp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedSetType createOrderedSetType() {
		OrderedSetTypeImpl orderedSetType = new OrderedSetTypeImpl();
		return orderedSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetType createSetType() {
		SetTypeImpl setType = new SetTypeImpl();
		return setType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclAnyType createOclAnyType() {
		OclAnyTypeImpl oclAnyType = new OclAnyTypeImpl();
		return oclAnyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleType createTupleType() {
		TupleTypeImpl tupleType = new TupleTypeImpl();
		return tupleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TupleTypeAttribute createTupleTypeAttribute() {
		TupleTypeAttributeImpl tupleTypeAttribute = new TupleTypeAttributeImpl();
		return tupleTypeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModelElement createOclModelElement() {
		OclModelElementImpl oclModelElement = new OclModelElementImpl();
		return oclModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeatureDefinition createOclFeatureDefinition() {
		OclFeatureDefinitionImpl oclFeatureDefinition = new OclFeatureDefinitionImpl();
		return oclFeatureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclContextDefinition createOclContextDefinition() {
		OclContextDefinitionImpl oclContextDefinition = new OclContextDefinitionImpl();
		return oclContextDefinition;
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
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclModel createOclModel() {
		OclModelImpl oclModel = new OclModelImpl();
		return oclModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmigOclPackage getEmigOclPackage() {
		return (EmigOclPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmigOclPackage getPackage() {
		return EmigOclPackage.eINSTANCE;
	}

} //EmigOclFactoryImpl
