/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug;

public interface IEdeltaDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaDebugMessage message);
}
