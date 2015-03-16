/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

public interface IEmigDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message);
}
