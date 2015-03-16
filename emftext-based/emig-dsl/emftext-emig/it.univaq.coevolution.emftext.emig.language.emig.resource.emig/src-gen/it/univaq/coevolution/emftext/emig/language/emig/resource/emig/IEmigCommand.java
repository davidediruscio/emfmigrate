/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IEmigCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
