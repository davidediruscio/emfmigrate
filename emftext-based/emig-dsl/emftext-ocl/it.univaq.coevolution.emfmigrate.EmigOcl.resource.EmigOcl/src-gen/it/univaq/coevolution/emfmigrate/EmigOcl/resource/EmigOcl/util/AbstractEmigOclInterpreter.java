/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractEmigOclInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclInterpreterListener> listeners = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel((it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Operation) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Operation((it.univaq.coevolution.emfmigrate.EmigOcl.Operation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Attribute) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute((it.univaq.coevolution.emfmigrate.EmigOcl.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeature((it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition((it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition((it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType((it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapType((it.univaq.coevolution.emfmigrate.EmigOcl.MapType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement((it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute((it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType((it.univaq.coevolution.emfmigrate.EmigOcl.TupleType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType((it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SetType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SetType((it.univaq.coevolution.emfmigrate.EmigOcl.SetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType((it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType((it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BagType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BagType((it.univaq.coevolution.emfmigrate.EmigOcl.BagType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RealType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RealType((it.univaq.coevolution.emfmigrate.EmigOcl.RealType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType((it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NumericType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NumericType((it.univaq.coevolution.emfmigrate.EmigOcl.NumericType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType((it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StringType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StringType((it.univaq.coevolution.emfmigrate.EmigOcl.StringType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Primitive) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Primitive((it.univaq.coevolution.emfmigrate.EmigOcl.Primitive) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp((it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType((it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclType) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclType((it.univaq.coevolution.emfmigrate.EmigOcl.OclType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Parameter) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter((it.univaq.coevolution.emfmigrate.EmigOcl.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Iterator) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator((it.univaq.coevolution.emfmigrate.EmigOcl.Iterator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable((it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration((it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IfExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp((it.univaq.coevolution.emfmigrate.EmigOcl.IfExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LetExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp((it.univaq.coevolution.emfmigrate.EmigOcl.LetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp((it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp((it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LoopExp((it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp((it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MulOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_AddOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RelOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NotOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall((it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCall((it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall((it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCall((it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp((it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp((it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapElement) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement((it.univaq.coevolution.emfmigrate.EmigOcl.MapElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp((it.univaq.coevolution.emfmigrate.EmigOcl.MapExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart((it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp((it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SetExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp((it.univaq.coevolution.emfmigrate.EmigOcl.SetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp((it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp((it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BagExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp((it.univaq.coevolution.emfmigrate.EmigOcl.BagExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionExp((it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp((it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RealExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp((it.univaq.coevolution.emfmigrate.EmigOcl.RealExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NumericExp((it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp((it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StringExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp((it.univaq.coevolution.emfmigrate.EmigOcl.StringExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PrimitiveExp((it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp((it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp((it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp((it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression((it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Module) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Module((it.univaq.coevolution.emfmigrate.EmigOcl.Module) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement) {
			result = interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LocatedElement((it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LocatedElement(it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Module(it.univaq.coevolution.emfmigrate.EmigOcl.Module object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclExpression(it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp(it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp(it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp(it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PrimitiveExp(it.univaq.coevolution.emfmigrate.EmigOcl.PrimitiveExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp(it.univaq.coevolution.emfmigrate.EmigOcl.StringExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp(it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NumericExp(it.univaq.coevolution.emfmigrate.EmigOcl.NumericExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp(it.univaq.coevolution.emfmigrate.EmigOcl.RealExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp(it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionExp(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp(it.univaq.coevolution.emfmigrate.EmigOcl.BagExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp(it.univaq.coevolution.emfmigrate.EmigOcl.SetExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp(it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart(it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp(it.univaq.coevolution.emfmigrate.EmigOcl.MapExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement(it.univaq.coevolution.emfmigrate.EmigOcl.MapElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp(it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp(it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCall(it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall(it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCall(it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall(it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NotOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RelOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_AddOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MulOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp(it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LoopExp(it.univaq.coevolution.emfmigrate.EmigOcl.LoopExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp(it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp(it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp(it.univaq.coevolution.emfmigrate.EmigOcl.LetExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp(it.univaq.coevolution.emfmigrate.EmigOcl.IfExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_VariableDeclaration(it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable(it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator(it.univaq.coevolution.emfmigrate.EmigOcl.Iterator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter(it.univaq.coevolution.emfmigrate.EmigOcl.Parameter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclType(it.univaq.coevolution.emfmigrate.EmigOcl.OclType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Primitive(it.univaq.coevolution.emfmigrate.EmigOcl.Primitive object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_StringType(it.univaq.coevolution.emfmigrate.EmigOcl.StringType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType(it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_NumericType(it.univaq.coevolution.emfmigrate.EmigOcl.NumericType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType(it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_RealType(it.univaq.coevolution.emfmigrate.EmigOcl.RealType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_BagType(it.univaq.coevolution.emfmigrate.EmigOcl.BagType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_SetType(it.univaq.coevolution.emfmigrate.EmigOcl.SetType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType(it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType(it.univaq.coevolution.emfmigrate.EmigOcl.TupleType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute(it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_MapType(it.univaq.coevolution.emfmigrate.EmigOcl.MapType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition(it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition(it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeature(it.univaq.coevolution.emfmigrate.EmigOcl.OclFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute(it.univaq.coevolution.emfmigrate.EmigOcl.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_Operation(it.univaq.coevolution.emfmigrate.EmigOcl.Operation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel(it.univaq.coevolution.emfmigrate.EmigOcl.OclModel object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
