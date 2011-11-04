/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

public class EmigOclDebugProcess extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugElement implements org.eclipse.debug.core.model.IProcess, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener {
	
	private org.eclipse.debug.core.ILaunch launch;
	
	private boolean terminated = false;
	
	public EmigOclDebugProcess(org.eclipse.debug.core.ILaunch launch) {
		super(launch.getDebugTarget());
		this.launch = launch;
	}
	
	public boolean canTerminate() {
		return !terminated;
	}
	
	public boolean isTerminated() {
		return terminated;
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		terminated = true;
	}
	
	public String getLabel() {
		return null;
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public org.eclipse.debug.core.model.IStreamsProxy getStreamsProxy() {
		return null;
	}
	
	public void setAttribute(String key, String value) {
	}
	
	public String getAttribute(String key) {
		return null;
	}
	
	public int getExitValue() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public void handleMessage(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message) {
		if (message.hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.TERMINATED)) {
			terminated = true;
		} else {
			// ignore other events
		}
	}
	
}
