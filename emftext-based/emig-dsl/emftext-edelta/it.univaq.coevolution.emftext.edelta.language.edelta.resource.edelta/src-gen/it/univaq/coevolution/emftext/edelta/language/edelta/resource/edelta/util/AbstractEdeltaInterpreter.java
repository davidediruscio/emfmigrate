/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util;

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
public class AbstractEdeltaInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInterpreterListener> listeners = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInterpreterListener>();
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
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Parameter) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter((it.univaq.coevolution.emftext.edelta.language.edelta.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue((it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Setter) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Setter((it.univaq.coevolution.emftext.edelta.language.edelta.Setter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeReference) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference((it.univaq.coevolution.emftext.edelta.language.edelta.changeReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference((it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addReference) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addReference((it.univaq.coevolution.emftext.edelta.language.edelta.addReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Reference) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Reference((it.univaq.coevolution.emftext.edelta.language.edelta.Reference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute((it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Feature) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Feature((it.univaq.coevolution.emftext.edelta.language.edelta.Feature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addClass) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addClass((it.univaq.coevolution.emftext.edelta.language.edelta.addClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass((it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeClass) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass((it.univaq.coevolution.emftext.edelta.language.edelta.changeClass) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation((it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Module) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Module((it.univaq.coevolution.emftext.edelta.language.edelta.Module) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Model) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Model((it.univaq.coevolution.emftext.edelta.language.edelta.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Package) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Package((it.univaq.coevolution.emftext.edelta.language.edelta.Package) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changePackage) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage((it.univaq.coevolution.emftext.edelta.language.edelta.changePackage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage((it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addPackage) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage((it.univaq.coevolution.emftext.edelta.language.edelta.addPackage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_AtomicOperator((it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation((it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation((it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_FeatureOperation((it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation((it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Class) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Class((it.univaq.coevolution.emftext.edelta.language.edelta.Class) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.DataType) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_DataType((it.univaq.coevolution.emftext.edelta.language.edelta.DataType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Type) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Type((it.univaq.coevolution.emftext.edelta.language.edelta.Type) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement) {
			result = interprete_it_univaq_coevolution_emftext_edelta_language_edelta_NamedElement((it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_NamedElement(it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Type(it.univaq.coevolution.emftext.edelta.language.edelta.Type object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_DataType(it.univaq.coevolution.emftext.edelta.language.edelta.DataType object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Class(it.univaq.coevolution.emftext.edelta.language.edelta.Class object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_PackageOperation(it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_FeatureOperation(it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_AttributeOperation(it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_ReferenceOperation(it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_AtomicOperator(it.univaq.coevolution.emftext.edelta.language.edelta.AtomicOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage(it.univaq.coevolution.emftext.edelta.language.edelta.addPackage object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage(it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage(it.univaq.coevolution.emftext.edelta.language.edelta.changePackage object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Package(it.univaq.coevolution.emftext.edelta.language.edelta.Package object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Model(it.univaq.coevolution.emftext.edelta.language.edelta.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Module(it.univaq.coevolution.emftext.edelta.language.edelta.Module object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_ClassOperation(it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass(it.univaq.coevolution.emftext.edelta.language.edelta.changeClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass(it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addClass(it.univaq.coevolution.emftext.edelta.language.edelta.addClass object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Feature(it.univaq.coevolution.emftext.edelta.language.edelta.Feature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute(it.univaq.coevolution.emftext.edelta.language.edelta.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Reference(it.univaq.coevolution.emftext.edelta.language.edelta.Reference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_addReference(it.univaq.coevolution.emftext.edelta.language.edelta.addReference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference(it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference(it.univaq.coevolution.emftext.edelta.language.edelta.changeReference object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Setter(it.univaq.coevolution.emftext.edelta.language.edelta.Setter object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue(it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter(it.univaq.coevolution.emftext.edelta.language.edelta.Parameter object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInterpreterListener listener : listeners) {
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
	
	public void addListener(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaInterpreterListener listener) {
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
