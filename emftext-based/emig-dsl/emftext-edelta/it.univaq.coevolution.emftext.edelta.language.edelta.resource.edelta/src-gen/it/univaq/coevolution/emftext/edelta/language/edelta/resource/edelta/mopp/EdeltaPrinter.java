/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaPrinter implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextPrinter {
	
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolverFactory tokenResolverFactory = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public EdeltaPrinter(java.io.OutputStream outputStream, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
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
		
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Model) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Model((it.univaq.coevolution.emftext.edelta.language.edelta.Model) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.DataType) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_DataType((it.univaq.coevolution.emftext.edelta.language.edelta.DataType) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Module) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Module((it.univaq.coevolution.emftext.edelta.language.edelta.Module) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addPackage) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage((it.univaq.coevolution.emftext.edelta.language.edelta.addPackage) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changePackage) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage((it.univaq.coevolution.emftext.edelta.language.edelta.changePackage) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage((it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Package) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Package((it.univaq.coevolution.emftext.edelta.language.edelta.Package) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Class) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Class((it.univaq.coevolution.emftext.edelta.language.edelta.Class) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addClass) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass((it.univaq.coevolution.emftext.edelta.language.edelta.addClass) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeClass) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass((it.univaq.coevolution.emftext.edelta.language.edelta.changeClass) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass((it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute((it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.addReference) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference((it.univaq.coevolution.emftext.edelta.language.edelta.addReference) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference((it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.changeReference) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference((it.univaq.coevolution.emftext.edelta.language.edelta.changeReference) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute((it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Reference) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference((it.univaq.coevolution.emftext.edelta.language.edelta.Reference) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Setter) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Setter((it.univaq.coevolution.emftext.edelta.language.edelta.Setter) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue((it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue) element, globaltab, out);
			return;
		}
		if (element instanceof it.univaq.coevolution.emftext.edelta.language.edelta.Parameter) {
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter((it.univaq.coevolution.emftext.edelta.language.edelta.Parameter) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaReferenceResolverSwitch getReferenceResolverSwitch() {
		return (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaReferenceResolverSwitch) new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaProblem(errorMessage, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType.PRINT_PROBLEM, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource getResource() {
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
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Model(it.univaq.coevolution.emftext.edelta.language.edelta.Model element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__PACKAGEOPERATIONS));
		printCountingMap.put("packageoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__MODULE));
		printCountingMap.put("module", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__DATATYPES));
		printCountingMap.put("datatypes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("module");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__MODULE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("module", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("datatypes");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print("  ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Model_0(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Model_1(element, localtab, out1, printCountingMap1);
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
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Model_0(it.univaq.coevolution.emftext.edelta.language.edelta.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("datatypes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__DATATYPES));
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
			printCountingMap.put("datatypes", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Model_1(it.univaq.coevolution.emftext.edelta.language.edelta.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("packageoperations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODEL__PACKAGEOPERATIONS));
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
			printCountingMap.put("packageoperations", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_DataType(it.univaq.coevolution.emftext.edelta.language.edelta.DataType element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DATA_TYPE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("datatype");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DATA_TYPE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DATA_TYPE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Module(it.univaq.coevolution.emftext.edelta.language.edelta.Module element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODULE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("module");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODULE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.MODULE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage(it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__CLASSESOPERATIONS));
		printCountingMap.put("classesoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("addPackage");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_0(it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addPackage_1(it.univaq.coevolution.emftext.edelta.language.edelta.addPackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"classesoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("classesoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__CLASSESOPERATIONS));
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
					printCountingMap.put("classesoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_PACKAGE__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage(it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__CLASSESOPERATIONS));
		printCountingMap.put("classesoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("changePackage");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_0(it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangePackageRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Package) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changePackage_1(it.univaq.coevolution.emftext.edelta.language.edelta.changePackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"classesoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("classesoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__CLASSESOPERATIONS));
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
					printCountingMap.put("classesoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_PACKAGE__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage(it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__CLASSESOPERATIONS));
		printCountingMap.put("classesoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("deletePackage");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_0(it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeletePackageRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Package) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deletePackage_1(it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"classesoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("classesoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__CLASSESOPERATIONS));
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
					printCountingMap.put("classesoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_PACKAGE__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Package(it.univaq.coevolution.emftext.edelta.language.edelta.Package element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__PACKAGE_OP));
		printCountingMap.put("packageOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("package");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Package_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Package_0(it.univaq.coevolution.emftext.edelta.language.edelta.Package element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Package_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Package_0_0(it.univaq.coevolution.emftext.edelta.language.edelta.Package element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("packageOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PACKAGE__PACKAGE_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("packageOp", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Class(it.univaq.coevolution.emftext.edelta.language.edelta.Class element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__CLASS_OP));
		printCountingMap.put("classOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("class");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Class_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Class_0(it.univaq.coevolution.emftext.edelta.language.edelta.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Class_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Class_0_0(it.univaq.coevolution.emftext.edelta.language.edelta.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CLASS__CLASS_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("classOp", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass(it.univaq.coevolution.emftext.edelta.language.edelta.addClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__FEATURESOPERATIONS));
		printCountingMap.put("featuresoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("addClass");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_0(it.univaq.coevolution.emftext.edelta.language.edelta.addClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addClass_1(it.univaq.coevolution.emftext.edelta.language.edelta.addClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"featuresoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("featuresoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__FEATURESOPERATIONS));
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
					printCountingMap.put("featuresoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_CLASS__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass(it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__FEATURESOPERATIONS));
		printCountingMap.put("featuresoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("changeClass");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_0(it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeClassRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Class) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeClass_1(it.univaq.coevolution.emftext.edelta.language.edelta.changeClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"featuresoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("featuresoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__FEATURESOPERATIONS));
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
					printCountingMap.put("featuresoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_CLASS__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass(it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__FEATURESOPERATIONS));
		printCountingMap.put("featuresoperations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("deleteClass");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_0(it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderInQuotes)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteClassRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Class) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteClass_1(it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"setter"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"featuresoperations"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (LineBreak)
				localtab += "		";
				out.println();
				out.print(localtab);
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("featuresoperations");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__FEATURESOPERATIONS));
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
					printCountingMap.put("featuresoperations", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (LineBreak)
			localtab += "		";
			out.println();
			out.print(localtab);
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("setter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_CLASS__SETTER));
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
				printCountingMap.put("setter", count - 1);
			}
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("addAttribute");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_0(it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addAttribute_1(it.univaq.coevolution.emftext.edelta.language.edelta.addAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_ATTRIBUTE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("deleteAttribute");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_0(it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteAttributeRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteAttribute_1(it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_ATTRIBUTE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute(it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("changeAttribute");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_0(it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeAttributeRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Attribute) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeAttribute_1(it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_ATTRIBUTE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference(it.univaq.coevolution.emftext.edelta.language.edelta.addReference element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("addReference");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_0(it.univaq.coevolution.emftext.edelta.language.edelta.addReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_addReference_1(it.univaq.coevolution.emftext.edelta.language.edelta.addReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ADD_REFERENCE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference(it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("deleteReference");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_0(it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getdeleteReferenceRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Reference) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_deleteReference_1(it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.DELETE_REFERENCE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference(it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__SETTER));
		printCountingMap.put("setter", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF));
		printCountingMap.put("ref", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__EXT));
		printCountingMap.put("ext", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("changeReference");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_1(element, localtab, out1, printCountingMap1);
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
		out.print("}");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_0(it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ext"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"ref"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("ref");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getchangeReferenceRefReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Reference) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__REF), element));
						out.print(" ");
					}
					printCountingMap.put("ref", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderInQuotes)
			count = printCountingMap.get("ext");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__EXT));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__EXT), element));
					out.print(" ");
				}
				printCountingMap.put("ext", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_changeReference_1(it.univaq.coevolution.emftext.edelta.language.edelta.changeReference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		localtab += "		";
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("setter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.CHANGE_REFERENCE__SETTER));
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
			printCountingMap.put("setter", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute(it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__FEATURES_OP));
		printCountingMap.put("featuresOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("attribute");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_0(it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Attribute_0_0(it.univaq.coevolution.emftext.edelta.language.edelta.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("featuresOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.ATTRIBUTE__FEATURES_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("featuresOp", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference(it.univaq.coevolution.emftext.edelta.language.edelta.Reference element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__FEATURES_OP));
		printCountingMap.put("featuresOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("reference");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_0(it.univaq.coevolution.emftext.edelta.language.edelta.Reference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_0_0(element, localtab, out, printCountingMap);
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Reference_0_0(it.univaq.coevolution.emftext.edelta.language.edelta.Reference element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("featuresOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.REFERENCE__FEATURES_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("featuresOp", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Setter(it.univaq.coevolution.emftext.edelta.language.edelta.Setter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__METAFEATURE));
		printCountingMap.put("metafeature", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("set");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("metafeature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__METAFEATURE));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__METAFEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("metafeature", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<-");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Setter_0(it.univaq.coevolution.emftext.edelta.language.edelta.Setter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER__VALUE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue(it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__FEATURE));
		printCountingMap.put("feature", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_0(it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME));
					if (o != null) {
						it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), element));
						out.print(" ");
					}
					printCountingMap.put("name", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME));
				if (o != null) {
					it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_SetterValue_1(it.univaq.coevolution.emftext.edelta.language.edelta.SetterValue element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("feature");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__FEATURE));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.SETTER_VALUE__FEATURE), element));
				out.print(" ");
			}
			printCountingMap.put("feature", count - 1);
		}
	}
	
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter(it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__REF_TYPE));
		printCountingMap.put("refType", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"type"		,
		"name"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"refType"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_1(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_0(it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getParameterTypeReferenceResolver().deResolve((it.univaq.coevolution.emftext.edelta.language.edelta.Type) o, element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE)), element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__TYPE), element));
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__NAME));
			if (o != null) {
				it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_it_univaq_coevolution_emftext_edelta_language_edelta_Parameter_1(it.univaq.coevolution.emftext.edelta.language.edelta.Parameter element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("refType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.PARAMETER__REF_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("refType", count - 1);
		}
	}
	
	
}
