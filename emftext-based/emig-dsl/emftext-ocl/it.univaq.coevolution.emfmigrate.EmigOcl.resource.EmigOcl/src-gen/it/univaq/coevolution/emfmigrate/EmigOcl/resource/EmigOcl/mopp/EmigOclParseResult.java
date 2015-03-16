/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclParseResult implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>> commands = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>>();
	
	public EmigOclParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclCommand<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
