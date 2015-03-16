/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.util;

import it.univaq.coevolution.emfmigrate.EmigOcl.*;
import it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.Attribute;
import it.univaq.coevolution.emfmigrate.EmigOcl.BagExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.BagType;
import it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType;
import it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType;
import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage;
import it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.IfExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType;
import it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.Iterator;
import it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType;
import it.univaq.coevolution.emfmigrate.EmigOcl.LetExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement;
import it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.MapElement;
import it.univaq.coevolution.emfmigrate.EmigOcl.MapExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.MapType;
import it.univaq.coevolution.emfmigrate.EmigOcl.Module;
import it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.NumericType;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclModel;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclType;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.Operation;
import it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType;
import it.univaq.coevolution.emfmigrate.EmigOcl.Parameter;
import it.univaq.coevolution.emfmigrate.EmigOcl.Primitive;
import it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.RealExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.RealType;
import it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType;
import it.univaq.coevolution.emfmigrate.EmigOcl.SetExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.SetType;
import it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall;
import it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.StringExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.StringType;
import it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp;
import it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart;
import it.univaq.coevolution.emfmigrate.EmigOcl.TupleType;
import it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute;
import it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration;
import it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp;

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
			public Adapter caseSelfExp(SelfExp object) {
				return createSelfExpAdapter();
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
			public Adapter caseStaticPropertyCallExp(StaticPropertyCallExp object) {
				return createStaticPropertyCallExpAdapter();
			}
			@Override
			public Adapter caseStaticPropertyCall(StaticPropertyCall object) {
				return createStaticPropertyCallAdapter();
			}
			@Override
			public Adapter caseStaticNavigationOrAttributeCall(StaticNavigationOrAttributeCall object) {
				return createStaticNavigationOrAttributeCallAdapter();
			}
			@Override
			public Adapter caseStaticOperationCall(StaticOperationCall object) {
				return createStaticOperationCallAdapter();
			}
			@Override
			public Adapter casePropertyCallExp(PropertyCallExp object) {
				return createPropertyCallExpAdapter();
			}
			@Override
			public Adapter casePropertyCall(PropertyCall object) {
				return createPropertyCallAdapter();
			}
			@Override
			public Adapter caseNavigationOrAttributeCall(NavigationOrAttributeCall object) {
				return createNavigationOrAttributeCallAdapter();
			}
			@Override
			public Adapter caseOperationCall(OperationCall object) {
				return createOperationCallAdapter();
			}
			@Override
			public Adapter caseOperatorCallExp(OperatorCallExp object) {
				return createOperatorCallExpAdapter();
			}
			@Override
			public Adapter caseNotOpCallExp(NotOpCallExp object) {
				return createNotOpCallExpAdapter();
			}
			@Override
			public Adapter caseRelOpCallExp(RelOpCallExp object) {
				return createRelOpCallExpAdapter();
			}
			@Override
			public Adapter caseEqOpCallExp(EqOpCallExp object) {
				return createEqOpCallExpAdapter();
			}
			@Override
			public Adapter caseAddOpCallExp(AddOpCallExp object) {
				return createAddOpCallExpAdapter();
			}
			@Override
			public Adapter caseIntOpCallExp(IntOpCallExp object) {
				return createIntOpCallExpAdapter();
			}
			@Override
			public Adapter caseMulOpCallExp(MulOpCallExp object) {
				return createMulOpCallExpAdapter();
			}
			@Override
			public Adapter caseLambdaCallExp(LambdaCallExp object) {
				return createLambdaCallExpAdapter();
			}
			@Override
			public Adapter caseBraceExp(BraceExp object) {
				return createBraceExpAdapter();
			}
			@Override
			public Adapter caseCollectionOperationCall(CollectionOperationCall object) {
				return createCollectionOperationCallAdapter();
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
			public Adapter caseLocalVariable(LocalVariable object) {
				return createLocalVariableAdapter();
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
			public Adapter caseOclModelElementExp(OclModelElementExp object) {
				return createOclModelElementExpAdapter();
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
			public Adapter caseLambdaType(LambdaType object) {
				return createLambdaTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp <em>Self Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp
	 * @generated
	 */
	public Adapter createSelfExpAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp <em>Static Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp
	 * @generated
	 */
	public Adapter createStaticPropertyCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall <em>Static Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall
	 * @generated
	 */
	public Adapter createStaticPropertyCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall <em>Static Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall
	 * @generated
	 */
	public Adapter createStaticNavigationOrAttributeCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall <em>Static Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall
	 * @generated
	 */
	public Adapter createStaticOperationCallAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall <em>Property Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall
	 * @generated
	 */
	public Adapter createPropertyCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall <em>Navigation Or Attribute Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall
	 * @generated
	 */
	public Adapter createNavigationOrAttributeCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall
	 * @generated
	 */
	public Adapter createOperationCallAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp <em>Not Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp
	 * @generated
	 */
	public Adapter createNotOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp <em>Rel Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp
	 * @generated
	 */
	public Adapter createRelOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp <em>Eq Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp
	 * @generated
	 */
	public Adapter createEqOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp <em>Add Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp
	 * @generated
	 */
	public Adapter createAddOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp <em>Int Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp
	 * @generated
	 */
	public Adapter createIntOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp <em>Mul Op Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp
	 * @generated
	 */
	public Adapter createMulOpCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp <em>Lambda Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp
	 * @generated
	 */
	public Adapter createLambdaCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp <em>Brace Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp
	 * @generated
	 */
	public Adapter createBraceExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall <em>Collection Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall
	 * @generated
	 */
	public Adapter createCollectionOperationCallAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable
	 * @generated
	 */
	public Adapter createLocalVariableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp <em>Ocl Model Element Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp
	 * @generated
	 */
	public Adapter createOclModelElementExpAdapter() {
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
	 * Creates a new adapter for an object of class '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType <em>Lambda Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType
	 * @generated
	 */
	public Adapter createLambdaTypeAdapter() {
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
