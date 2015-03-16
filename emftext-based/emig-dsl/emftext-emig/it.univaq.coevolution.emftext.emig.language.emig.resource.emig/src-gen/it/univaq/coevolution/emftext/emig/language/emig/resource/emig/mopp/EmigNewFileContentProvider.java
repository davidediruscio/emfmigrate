/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigNewFileContentProvider {
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigMetaInformation getMetaInformation() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation();
	}
	
	public String getNewFileContent(String newFileName) {
		return getExampleContent(new org.eclipse.emf.ecore.EClass[] {
			it.univaq.coevolution.emftext.emig.language.emig.EmigPackage.eINSTANCE.getMigrationLibrary(),
		}, getMetaInformation().getClassesWithSyntax(), newFileName);
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass[] startClasses, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		String content = "";
		for (org.eclipse.emf.ecore.EClass next : startClasses) {
			content = getExampleContent(next, allClassesWithSyntax, newFileName);
			if (content.trim().length() > 0) {
				break;
			}
		}
		return content;
	}
	
	protected String getExampleContent(org.eclipse.emf.ecore.EClass eClass, org.eclipse.emf.ecore.EClass[] allClassesWithSyntax, String newFileName) {
		// create a minimal model
		org.eclipse.emf.ecore.EObject root = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigMinimalModelHelper().getMinimalModel(eClass, allClassesWithSyntax, newFileName);
		if (root == null) {
			// could not create a minimal model. returning an empty document is the best we
			// can do.
			return "";
		}
		// use printer to get text for model
		java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextPrinter printer = getPrinter(buffer);
		try {
			printer.print(root);
		} catch (java.io.IOException e) {
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigPlugin.logError("Exception while generating example content.", e);
		}
		return buffer.toString();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextPrinter getPrinter(java.io.OutputStream outputStream) {
		return getMetaInformation().createPrinter(outputStream, new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource());
	}
	
}
