/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IEmigOclCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
