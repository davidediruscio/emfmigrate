/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IEdeltaCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
