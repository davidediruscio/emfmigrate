/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IEmigParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigCommand<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource>> getPostParseCommands();
	
}
