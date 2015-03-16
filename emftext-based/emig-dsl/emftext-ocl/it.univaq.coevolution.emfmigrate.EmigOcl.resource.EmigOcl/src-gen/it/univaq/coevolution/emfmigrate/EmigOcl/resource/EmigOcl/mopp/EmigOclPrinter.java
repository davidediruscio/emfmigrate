/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclPrinter implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextPrinter {
	
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolverFactory tokenResolverFactory = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public EmigOclPrinter(java.io.OutputStream outputStream, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Module) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Module((it.univaq.coevolution.emfmigrate.EmigOcl.Module) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition((it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition((it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel((it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Attribute) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute((it.univaq.coevolution.emfmigrate.EmigOcl.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Operation) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation((it.univaq.coevolution.emfmigrate.EmigOcl.Operation) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Parameter) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter((it.univaq.coevolution.emfmigrate.EmigOcl.Parameter) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp((it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp((it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp((it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp((it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StringExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp((it.univaq.coevolution.emfmigrate.EmigOcl.StringExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp((it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RealExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp((it.univaq.coevolution.emfmigrate.EmigOcl.RealExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp((it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BagExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp((it.univaq.coevolution.emfmigrate.EmigOcl.BagExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp((it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp((it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SetExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp((it.univaq.coevolution.emfmigrate.EmigOcl.SetExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp((it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart((it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp((it.univaq.coevolution.emfmigrate.EmigOcl.MapExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapElement) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement((it.univaq.coevolution.emfmigrate.EmigOcl.MapElement) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp((it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp((it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LetExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp((it.univaq.coevolution.emfmigrate.EmigOcl.LetExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IfExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp((it.univaq.coevolution.emfmigrate.EmigOcl.IfExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp((it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_RelOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_AddOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IntOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_MulOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_NotOpCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall((it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall((it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp((it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp((it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.Iterator) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator((it.univaq.coevolution.emfmigrate.EmigOcl.Iterator) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.StringType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StringType((it.univaq.coevolution.emfmigrate.EmigOcl.StringType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType((it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType((it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.RealType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_RealType((it.univaq.coevolution.emfmigrate.EmigOcl.RealType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.BagType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BagType((it.univaq.coevolution.emfmigrate.EmigOcl.BagType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType((it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType((it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.SetType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SetType((it.univaq.coevolution.emfmigrate.EmigOcl.SetType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType((it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType((it.univaq.coevolution.emfmigrate.EmigOcl.TupleType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute((it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement((it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.MapType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_MapType((it.univaq.coevolution.emfmigrate.EmigOcl.MapType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType((it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable((it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCallExp((it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall((it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType) {
			print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType((it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclReferenceResolverSwitch getReferenceResolverSwitch() {
		return (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclReferenceResolverSwitch) new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclProblem(errorMessage, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType.PRINT_PROBLEM, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Module(it.univaq.coevolution.emfmigrate.EmigOcl.Module element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS));
		printCountingMap.put("models", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__FEATURES));
		printCountingMap.put("features", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_0(it.univaq.coevolution.emfmigrate.EmigOcl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_1(it.univaq.coevolution.emfmigrate.EmigOcl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("models");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("models", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_1_0(it.univaq.coevolution.emfmigrate.EmigOcl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("models");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__MODELS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("models", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Module_2(it.univaq.coevolution.emfmigrate.EmigOcl.Module element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("features");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MODULE__FEATURES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("features", 0);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclFeatureDefinition(it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__STATIC));
		printCountingMap.put("static", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("static");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__STATIC));
			if (o != null) {
			}
			printCountingMap.put("static", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("def");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_FEATURE_DEFINITION__FEATURE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclContextDefinition(it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
		printCountingMap.put("context_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("context");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("context_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("context_", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel(it.univaq.coevolution.emfmigrate.EmigOcl.OclModel element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL));
		printCountingMap.put("metamodel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__MODEL));
		printCountingMap.put("model", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metamodel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelMetamodelReferenceResolver().deResolve((it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__METAMODEL), element));
				out.print(" ");
			}
			printCountingMap.put("metamodel", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModel_0(it.univaq.coevolution.emfmigrate.EmigOcl.OclModel element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable(it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__VAR_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__EQ));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LocalVariable_0(it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LOCAL_VARIABLE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute(it.univaq.coevolution.emfmigrate.EmigOcl.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__EQ));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Attribute_0(it.univaq.coevolution.emfmigrate.EmigOcl.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation(it.univaq.coevolution.emfmigrate.EmigOcl.Operation element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__DEFINITION));
		printCountingMap.put("definition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__EQ));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "	";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_0(it.univaq.coevolution.emfmigrate.EmigOcl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_1(it.univaq.coevolution.emfmigrate.EmigOcl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Operation_1_0(it.univaq.coevolution.emfmigrate.EmigOcl.Operation element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Parameter(it.univaq.coevolution.emfmigrate.EmigOcl.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VAR_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PARAMETER__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementExpModelReferenceResolver().deResolve((it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElementExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaCallExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_CALL_EXP__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_VariableExp(it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
		printCountingMap.put("referredVariable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("referredVariable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getVariableExpReferredVariableReferenceResolver().deResolve((it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.VARIABLE_EXP__REFERRED_VARIABLE), element));
				out.print(" ");
			}
			printCountingMap.put("referredVariable", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SuperExp(it.univaq.coevolution.emfmigrate.EmigOcl.SuperExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SUPER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("super");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SelfExp(it.univaq.coevolution.emfmigrate.EmigOcl.SelfExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SELF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("self");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StringExp(it.univaq.coevolution.emfmigrate.EmigOcl.StringExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__STRING_SYMBOL));
		printCountingMap.put("stringSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("stringSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__STRING_SYMBOL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_39_39_92");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_EXP__STRING_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("stringSymbol", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanExp(it.univaq.coevolution.emfmigrate.EmigOcl.BooleanExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
		printCountingMap.put("booleanSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("booleanSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_EXP__BOOLEAN_SYMBOL));
			if (o != null) {
			}
			printCountingMap.put("booleanSymbol", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_RealExp(it.univaq.coevolution.emfmigrate.EmigOcl.RealExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__REAL_SYMBOL));
		printCountingMap.put("realSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("realSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__REAL_SYMBOL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("FLOAT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_EXP__REAL_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("realSymbol", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerExp(it.univaq.coevolution.emfmigrate.EmigOcl.IntegerExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INTEGER_SYMBOL));
		printCountingMap.put("integerSymbol", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("integerSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INTEGER_SYMBOL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_EXP__INTEGER_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("integerSymbol", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp(it.univaq.coevolution.emfmigrate.EmigOcl.BagExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Bag");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BagExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.BagExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OrderedSet");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sequence");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp(it.univaq.coevolution.emfmigrate.EmigOcl.SetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Set");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SetExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.SetExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp(it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TUPLE_PART));
		printCountingMap.put("tuplePart", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Tuple");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.TupleExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tuplePart");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_EXP__TUPLE_PART));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("tuplePart", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart(it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(12);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__INIT_EXPRESSION));
		printCountingMap.put("initExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__BASE_EXP));
		printCountingMap.put("baseExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__EQ));
		printCountingMap.put("eq", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__TUPLE));
		printCountingMap.put("tuple", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VAR_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("eq");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__EQ));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__EQ), element));
				out.print(" ");
			}
			printCountingMap.put("eq", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("initExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__INIT_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("initExpression", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TuplePart_0(it.univaq.coevolution.emfmigrate.EmigOcl.TuplePart element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_PART__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp(it.univaq.coevolution.emfmigrate.EmigOcl.MapExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("Map");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MapExp_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.MapExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_EXP__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MapElement(it.univaq.coevolution.emfmigrate.EmigOcl.MapElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__MAP));
		printCountingMap.put("map", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__KEY));
		printCountingMap.put("key", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("key");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__KEY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("key", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_ELEMENT__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp(it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("#");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_EnumLiteralExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.EnumLiteralExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ENUM_LITERAL_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclUndefinedExp(it.univaq.coevolution.emfmigrate.EmigOcl.OclUndefinedExp element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_UNDEFINED_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("OclUndefined");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LetExp(it.univaq.coevolution.emfmigrate.EmigOcl.LetExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IN_));
		printCountingMap.put("in_", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("let");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__VARIABLE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("in");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("in_");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LET_EXP__IN_));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("in_", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IfExp(it.univaq.coevolution.emfmigrate.EmigOcl.IfExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(19);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__THEN_EXPRESSION));
		printCountingMap.put("thenExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__ELSE_EXPRESSION));
		printCountingMap.put("elseExpression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("if");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__CONDITION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("then");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("thenExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__THEN_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("thenExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("else");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseExpression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.IF_EXP__ELSE_EXPRESSION));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elseExpression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("endif");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BraceExp(it.univaq.coevolution.emfmigrate.EmigOcl.BraceExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(17);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__EXP));
		printCountingMap.put("exp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("exp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BRACE_EXP__EXP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("exp", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OperatorCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.OperatorCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATOR_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_EqOpCallExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.EqOpCallExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("NEQ");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OPERATION_NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("EQ");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.EQ_OP_CALL_EXP__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_RelOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.RelOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("RELOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_AddOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.AddOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("ADDOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ADD_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IntOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.IntOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INT_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MulOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.MulOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("MULOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argument");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MUL_OP_CALL_EXP__ARGUMENT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argument", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_NotOpCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.NotOpCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(20);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__ARGUMENT));
		printCountingMap.put("argument", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("operationName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OPERATION_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("NOTOP");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__OPERATION_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("operationName", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NOT_OP_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticPropertyCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
		printCountingMap.put("staticCall", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("staticCall");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_PROPERTY_CALL_EXP__STATIC_CALL));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("staticCall", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_0(it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_1(it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticOperationCall_1_0(it.univaq.coevolution.emfmigrate.EmigOcl.StaticOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall(it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("::");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StaticNavigationOrAttributeCall_0(it.univaq.coevolution.emfmigrate.EmigOcl.StaticNavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STATIC_NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_PropertyCallExp(it.univaq.coevolution.emfmigrate.EmigOcl.PropertyCallExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(18);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__IF_EXP3));
		printCountingMap.put("ifExp3", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__APPLIED_PROPERTY));
		printCountingMap.put("appliedProperty", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__COLLECTION));
		printCountingMap.put("collection", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__LET_EXP));
		printCountingMap.put("letExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__LOOP_EXP));
		printCountingMap.put("loopExp", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__PARENT_OPERATION));
		printCountingMap.put("parentOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__INITIALIZED_VARIABLE));
		printCountingMap.put("initializedVariable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__IF_EXP2));
		printCountingMap.put("ifExp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__OWNING_OPERATION));
		printCountingMap.put("owningOperation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__IF_EXP1));
		printCountingMap.put("ifExp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__OWNING_ATTRIBUTE));
		printCountingMap.put("owningAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__CALLS));
		printCountingMap.put("calls", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("calls");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.PROPERTY_CALL_EXP__CALLS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("calls", 0);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_0(it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_1(it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OperationCall_1_0(it.univaq.coevolution.emfmigrate.EmigOcl.OperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall(it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_NavigationOrAttributeCall_0(it.univaq.coevolution.emfmigrate.EmigOcl.NavigationOrAttributeCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.NAVIGATION_OR_ATTRIBUTE_CALL__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp(it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__RESULT));
		printCountingMap.put("result", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("iterate");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("result");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__RESULT));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("result", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IterateExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATE_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp(it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__BODY));
		printCountingMap.put("body", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__ITERATORS));
		printCountingMap.put("iterators", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("body");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__BODY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("body", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp_0(it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IteratorExp_1(it.univaq.coevolution.emfmigrate.EmigOcl.IteratorExp element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR_EXP__ITERATORS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("iterators", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator(it.univaq.coevolution.emfmigrate.EmigOcl.Iterator element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VAR_NAME));
		printCountingMap.put("varName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VARIABLE_EXP));
		printCountingMap.put("variableExp", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__LOOP_EXPR));
		printCountingMap.put("loopExpr", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("varName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VAR_NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__VAR_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("varName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_Iterator_0(it.univaq.coevolution.emfmigrate.EmigOcl.Iterator element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ITERATOR__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
		printCountingMap.put("operationName", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("->");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_0(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operationName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("operationName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
						out.print(" ");
					}
					printCountingMap.put("operationName", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("operationName");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__OPERATION_NAME), element));
					out.print(" ");
				}
				printCountingMap.put("operationName", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_1(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionOperationCall_1_0(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionOperationCall element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_OPERATION_CALL__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_CollectionType(it.univaq.coevolution.emfmigrate.EmigOcl.CollectionType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("COLLECTIONTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.COLLECTION_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_StringType(it.univaq.coevolution.emfmigrate.EmigOcl.StringType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("STRINGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.STRING_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BooleanType(it.univaq.coevolution.emfmigrate.EmigOcl.BooleanType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEANTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BOOLEAN_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_IntegerType(it.univaq.coevolution.emfmigrate.EmigOcl.IntegerType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGERTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.INTEGER_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_RealType(it.univaq.coevolution.emfmigrate.EmigOcl.RealType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("REALTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.REAL_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_BagType(it.univaq.coevolution.emfmigrate.EmigOcl.BagType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("BAGTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.BAG_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OrderedSetType(it.univaq.coevolution.emfmigrate.EmigOcl.OrderedSetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("ORDEREDSETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.ORDERED_SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SequenceType(it.univaq.coevolution.emfmigrate.EmigOcl.SequenceType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("SEQUENCETYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SEQUENCE_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_SetType(it.univaq.coevolution.emfmigrate.EmigOcl.SetType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__ELEMENT_TYPE));
		printCountingMap.put("elementType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("SETTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elementType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.SET_TYPE__ELEMENT_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elementType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclAnyType(it.univaq.coevolution.emfmigrate.EmigOcl.OclAnyType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(14);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("OCLANYTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_ANY_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType(it.univaq.coevolution.emfmigrate.EmigOcl.TupleType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TUPLETYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType_0(it.univaq.coevolution.emfmigrate.EmigOcl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleType_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.TupleType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute(it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__TUPLE_TYPE));
		printCountingMap.put("tupleType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_TupleTypeAttribute_0(it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.TUPLE_TYPE_ATTRIBUTE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(15);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL));
		printCountingMap.put("model", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("model");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getOclModelElementModelReferenceResolver().deResolve((it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__MODEL), element));
				out.print(" ");
			}
			printCountingMap.put("model", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_OclModelElement_0(it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"name"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("name");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME));
					if (o != null) {
						it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34_92");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME));
				if (o != null) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.OCL_MODEL_ELEMENT__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_MapType(it.univaq.coevolution.emfmigrate.EmigOcl.MapType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__VALUE_TYPE));
		printCountingMap.put("valueType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__KEY_TYPE));
		printCountingMap.put("keyType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("MAPTYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__KEY_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("keyType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("valueType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.MAP_TYPE__VALUE_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("valueType", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(16);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__DEFINITIONS));
		printCountingMap.put("definitions", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__OCL_EXPRESSION));
		printCountingMap.put("oclExpression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__OPERATION));
		printCountingMap.put("operation", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__MAP_TYPE2));
		printCountingMap.put("mapType2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__ATTRIBUTE));
		printCountingMap.put("attribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__MAP_TYPE));
		printCountingMap.put("mapType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__COLLECTION_TYPES));
		printCountingMap.put("collectionTypes", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__TUPLE_TYPE_ATTRIBUTE));
		printCountingMap.put("tupleTypeAttribute", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__VARIABLE_DECLARATION));
		printCountingMap.put("variableDeclaration", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
		printCountingMap.put("argumentTypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver = tokenResolverFactory.createTokenResolver("LAMBDATYPE");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType_0(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emfmigrate_EmigOcl_LambdaType_0_0(it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("argumentTypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("argumentTypes", count - 1);
		}
	}
	
	
}
