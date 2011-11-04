/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

public interface IEmigOclDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message);
}
