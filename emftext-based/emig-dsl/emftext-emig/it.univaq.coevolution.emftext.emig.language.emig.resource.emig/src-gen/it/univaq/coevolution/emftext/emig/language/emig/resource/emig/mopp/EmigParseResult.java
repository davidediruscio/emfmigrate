/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigParseResult implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigCommand<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource>> commands = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigCommand<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource>>();
	
	public EmigParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigCommand<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
