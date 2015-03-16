/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaParseResult implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>> commands = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>>();
	
	public EdeltaParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaCommand<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
