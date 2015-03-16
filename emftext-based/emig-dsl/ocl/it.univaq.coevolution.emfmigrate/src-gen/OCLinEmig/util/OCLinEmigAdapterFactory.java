/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig.util;

import OCLinEmig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see OCLinEmig.OCLinEmigPackage
 * @generated
 */
public class OCLinEmigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCLinEmigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLinEmigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OCLinEmigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCLinEmigSwitch<Adapter> modelSwitch =
		new OCLinEmigSwitch<Adapter>() {
			@Override
			public Adapter caseOclExpression(OclExpression object) {
				return createOclExpressionAdapter();
			}
			@Override
			public Adapter caseVariableExp(VariableExp object) {
				return createVariableExpAdapter();
			}
			@Override
			public Adapter caseSuperExp(SuperExp object) {
				return createSuperExpAdapter();
			}
			@Override
			public Adapter casePrimitiveExp(PrimitiveExp object) {
				return createPrimitiveExpAdapter();
			}
			@Override
			public Adapter caseStringExp(StringExp object) {
				return createStringExpAdapter();
			}
			@Override
			public Adapter caseBooleanExp(BooleanExp object) {
				return createBooleanExpAdapter();
			}
			@Override
			public Adapter caseNumericExp(NumericExp object) {
				return createNumericExpAdapter();
			}
			@Override
			public Adapter caseRealExp(RealExp object) {
				return createRealExpAdapter();
			}
			@Override
			public Adapter caseIntegerExp(IntegerExp object) {
				return createIntegerExpAdapter();
			}
			@Override
			public Adapter caseCollectionExp(CollectionExp object) {
				return createCollectionExpAdapter();
			}
			@Override
			public Adapter caseBagExp(BagExp object) {
				return createBagExpAdapter();
			}
			@Override
			public Adapter caseOrderedSetExp(OrderedSetExp object) {
				return createOrderedSetExpAdapter();
			}
			@Override
			public Adapter caseSequenceExp(SequenceExp object) {
				return createSequenceExpAdapter();
			}
			@Override
			public Adapter caseSetExp(SetExp object) {
				return createSetExpAdapter();
			}
			@Override
			public Adapter caseTupleExp(TupleExp object) {
				return createTupleExpAdapter();
			}
			@Override
			public Adapter caseTuplePart(TuplePart object) {
				return createTuplePartAdapter();
			}
			@Override
			public Adapter caseMapExp(MapExp object) {
				return createMapExpAdapter();
			}
			@Override
			public Adapter caseMapElement(MapElement object) {
				return createMapElementAdapter();
			}
			@Override
			public Adapter caseEnumLiteralExp(EnumLiteralExp object) {
				return createEnumLiteralExpAdapter();
			}
			@Override
			public Adapter caseOclUndefinedExp(OclUndefinedExp object) {
				return createOclUndefinedExpAdapter();
			}
			@Override
			public Adapter casePropertyCallExp(PropertyCallExp object) {
				return createPropertyCallExpAdapter();
			}
			@Override
			public Adapter caseNavigationOrAttributeCallExp(NavigationOrAttributeCallExp object) {
				return createNavigationOrAttributeCallExpAdapter();
			}
			@Override
			public Adapter caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			@Override
			public Adapter caseOperatorCallExp(OperatorCallExp object) {
				return createOperatorCallExpAdapter();
			}
			@Override
			public Adapter caseCollectionOperationCallExp(CollectionOperationCallExp object) {
				return createCollectionOperationCallExpAdapter();
			}
			@Override
			public Adapter caseLoopExp(LoopExp object) {
				return createLoopExpAdapter();
			}
			@Override
			public Adapter caseIterateExp(IterateExp object) {
				return createIterateExpAdapter();
			}
			@Override
			public Adapter caseIteratorExp(IteratorExp object) {
				return createIteratorExpAdapter();
			}
			@Override
			public Adapter caseLetExp(LetExp object) {
				return createLetExpAdapter();
			}
			@Override
			public Adapter caseIfExp(IfExp object) {
				return createIfExpAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseIterator(Iterator object) {
				return createIteratorAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseOclType(OclType object) {
				return createOclTypeAdapter();
			}
			@Override
			public Adapter casePrimitive(Primitive object) {
				return createPrimitiveAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseNumericType(NumericType object) {
				return createNumericTypeAdapter();
			}
			@Override
			public Adapter caseIntegerType(IntegerType object) {
				return createIntegerTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseOrderedSetType(OrderedSetType object) {
				return createOrderedSetTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseSetType(SetType object) {
				return createSetTypeAdapter();
			}
			@Override
			public Adapter caseOclAnyType(OclAnyType object) {
				return createOclAnyTypeAdapter();
			}
			@Override
			public Adapter caseTupleType(TupleType object) {
				return createTupleTypeAdapter();
			}
			@Override
			public Adapter caseTupleTypeAttribute(TupleTypeAttribute object) {
				return createTupleTypeAttributeAdapter();
			}
			@Override
			public Adapter caseOclModelElement(OclModelElement object) {
				return createOclModelElementAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseOclFeatureDefinition(OclFeatureDefinition object) {
				return createOclFeatureDefinitionAdapter();
			}
			@Override
			public Adapter caseOclContextDefinition(OclContextDefinition object) {
				return createOclContextDefinitionAdapter();
			}
			@Override
			public Adapter caseOclFeature(OclFeature object) {
				return createOclFeatureAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseOclModel(OclModel object) {
				return createOclModelAdapter();
			}
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclExpression
	 * @generated
	 */
	public Adapter createOclExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.VariableExp
	 * @generated
	 */
	public Adapter createVariableExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.SuperExp <em>Super Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.SuperExp
	 * @generated
	 */
	public Adapter createSuperExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.PrimitiveExp <em>Primitive Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.PrimitiveExp
	 * @generated
	 */
	public Adapter createPrimitiveExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.StringExp <em>String Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.StringExp
	 * @generated
	 */
	public Adapter createStringExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.BooleanExp
	 * @generated
	 */
	public Adapter createBooleanExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.NumericExp <em>Numeric Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.NumericExp
	 * @generated
	 */
	public Adapter createNumericExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.RealExp <em>Real Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.RealExp
	 * @generated
	 */
	public Adapter createRealExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.IntegerExp <em>Integer Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.IntegerExp
	 * @generated
	 */
	public Adapter createIntegerExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.CollectionExp <em>Collection Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.CollectionExp
	 * @generated
	 */
	public Adapter createCollectionExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.BagExp <em>Bag Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.BagExp
	 * @generated
	 */
	public Adapter createBagExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OrderedSetExp <em>Ordered Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OrderedSetExp
	 * @generated
	 */
	public Adapter createOrderedSetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.SequenceExp <em>Sequence Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.SequenceExp
	 * @generated
	 */
	public Adapter createSequenceExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.SetExp <em>Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.SetExp
	 * @generated
	 */
	public Adapter createSetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.TupleExp <em>Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.TupleExp
	 * @generated
	 */
	public Adapter createTupleExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.TuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.TuplePart
	 * @generated
	 */
	public Adapter createTuplePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.MapExp <em>Map Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.MapExp
	 * @generated
	 */
	public Adapter createMapExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.MapElement
	 * @generated
	 */
	public Adapter createMapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.EnumLiteralExp
	 * @generated
	 */
	public Adapter createEnumLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclUndefinedExp
	 * @generated
	 */
	public Adapter createOclUndefinedExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.PropertyCallExp
	 * @generated
	 */
	public Adapter createPropertyCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.NavigationOrAttributeCallExp <em>Navigation Or Attribute Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.NavigationOrAttributeCallExp
	 * @generated
	 */
	public Adapter createNavigationOrAttributeCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OperatorCallExp <em>Operator Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OperatorCallExp
	 * @generated
	 */
	public Adapter createOperatorCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.CollectionOperationCallExp <em>Collection Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.CollectionOperationCallExp
	 * @generated
	 */
	public Adapter createCollectionOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.IterateExp
	 * @generated
	 */
	public Adapter createIterateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.IteratorExp
	 * @generated
	 */
	public Adapter createIteratorExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.LetExp
	 * @generated
	 */
	public Adapter createLetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.IfExp
	 * @generated
	 */
	public Adapter createIfExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Iterator
	 * @generated
	 */
	public Adapter createIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclType <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclType
	 * @generated
	 */
	public Adapter createOclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OrderedSetType
	 * @generated
	 */
	public Adapter createOrderedSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclAnyType <em>Ocl Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclAnyType
	 * @generated
	 */
	public Adapter createOclAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.TupleType
	 * @generated
	 */
	public Adapter createTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.TupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.TupleTypeAttribute
	 * @generated
	 */
	public Adapter createTupleTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclModelElement <em>Ocl Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclModelElement
	 * @generated
	 */
	public Adapter createOclModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclFeatureDefinition <em>Ocl Feature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclFeatureDefinition
	 * @generated
	 */
	public Adapter createOclFeatureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclContextDefinition <em>Ocl Context Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclContextDefinition
	 * @generated
	 */
	public Adapter createOclContextDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclFeature <em>Ocl Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclFeature
	 * @generated
	 */
	public Adapter createOclFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.OclModel <em>Ocl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.OclModel
	 * @generated
	 */
	public Adapter createOclModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link OCLinEmig.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see OCLinEmig.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OCLinEmigAdapterFactory
