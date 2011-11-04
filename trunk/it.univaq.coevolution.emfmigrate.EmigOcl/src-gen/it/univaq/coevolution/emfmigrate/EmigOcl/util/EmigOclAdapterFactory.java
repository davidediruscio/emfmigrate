/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.util;

import it.univaq.coevolution.emfmigrate.EmigOcl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage
 * @generated
 */
public class EmigOclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EmigOclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmigOclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EmigOclPackage.eINSTANCE;
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
	protected EmigOclSwitch<Adapter> modelSwitch =
		new EmigOclSwitch<Adapter>() {
			@Override
			public Adapter caseLocatedElement(LocatedElement object) {
				return createLocatedElementAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement <em>Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement
	 * @generated
	 */
	public Adapter createLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression
	 * @generated
	 */
	public Adapter createOclExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp
	 * @generated
	 */
	public Adapter createVariableExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp <em>Super Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp
	 * @generated
	 */
	public Adapter createSuperExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp <em>Primitive Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp
	 * @generated
	 */
	public Adapter createPrimitiveExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StringExp <em>String Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StringExp
	 * @generated
	 */
	public Adapter createStringExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp <em>Boolean Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp
	 * @generated
	 */
	public Adapter createBooleanExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp <em>Numeric Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp
	 * @generated
	 */
	public Adapter createNumericExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RealExp <em>Real Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RealExp
	 * @generated
	 */
	public Adapter createRealExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp <em>Integer Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp
	 * @generated
	 */
	public Adapter createIntegerExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp <em>Collection Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp
	 * @generated
	 */
	public Adapter createCollectionExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BagExp <em>Bag Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BagExp
	 * @generated
	 */
	public Adapter createBagExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp <em>Ordered Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp
	 * @generated
	 */
	public Adapter createOrderedSetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp <em>Sequence Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp
	 * @generated
	 */
	public Adapter createSequenceExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SetExp <em>Set Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SetExp
	 * @generated
	 */
	public Adapter createSetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp <em>Tuple Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp
	 * @generated
	 */
	public Adapter createTupleExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart <em>Tuple Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart
	 * @generated
	 */
	public Adapter createTuplePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapExp <em>Map Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapExp
	 * @generated
	 */
	public Adapter createMapExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapElement <em>Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapElement
	 * @generated
	 */
	public Adapter createMapElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp <em>Enum Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp
	 * @generated
	 */
	public Adapter createEnumLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp <em>Ocl Undefined Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp
	 * @generated
	 */
	public Adapter createOclUndefinedExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp
	 * @generated
	 */
	public Adapter createPropertyCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCallExp <em>Navigation Or Attribute Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCallExp
	 * @generated
	 */
	public Adapter createNavigationOrAttributeCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp <em>Operator Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp
	 * @generated
	 */
	public Adapter createOperatorCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCallExp <em>Collection Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCallExp
	 * @generated
	 */
	public Adapter createCollectionOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp <em>Iterate Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp
	 * @generated
	 */
	public Adapter createIterateExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp
	 * @generated
	 */
	public Adapter createIteratorExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LetExp <em>Let Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LetExp
	 * @generated
	 */
	public Adapter createLetExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IfExp <em>If Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IfExp
	 * @generated
	 */
	public Adapter createIfExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Iterator
	 * @generated
	 */
	public Adapter createIteratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType
	 * @generated
	 */
	public Adapter createOclTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Primitive
	 * @generated
	 */
	public Adapter createPrimitiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NumericType
	 * @generated
	 */
	public Adapter createNumericTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType <em>Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType
	 * @generated
	 */
	public Adapter createIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType
	 * @generated
	 */
	public Adapter createOrderedSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SetType
	 * @generated
	 */
	public Adapter createSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType <em>Ocl Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType
	 * @generated
	 */
	public Adapter createOclAnyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleType
	 * @generated
	 */
	public Adapter createTupleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute
	 * @generated
	 */
	public Adapter createTupleTypeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement <em>Ocl Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement
	 * @generated
	 */
	public Adapter createOclModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition <em>Ocl Feature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition
	 * @generated
	 */
	public Adapter createOclFeatureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition <em>Ocl Context Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition
	 * @generated
	 */
	public Adapter createOclContextDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature <em>Ocl Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature
	 * @generated
	 */
	public Adapter createOclFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel <em>Ocl Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModel
	 * @generated
	 */
	public Adapter createOclModelAdapter() {
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

} //EmigOclAdapterFactory
