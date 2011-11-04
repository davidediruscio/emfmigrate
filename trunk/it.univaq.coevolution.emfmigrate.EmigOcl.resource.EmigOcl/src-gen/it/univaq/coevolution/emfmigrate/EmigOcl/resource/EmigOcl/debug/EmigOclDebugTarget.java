/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

public class EmigOclDebugTarget extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugElement implements org.eclipse.debug.core.model.IDebugTarget, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener {
	
	/**
	 * associated system process
	 */
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugProcess process;
	
	private java.net.Socket eventSocket;
	
	private java.io.BufferedReader eventReader;
	
	/**
	 * containing launch object
	 */
	private org.eclipse.debug.core.ILaunch launch;
	
	private org.eclipse.debug.core.model.IThread[] threads;
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugThread thread;
	
	private boolean terminated = false;
	
	/**
	 * event dispatch job
	 */
	private DebugEventDispatcher eventDispatch;
	/**
	 * event listeners
	 */
	private java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener> eventListeners = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener>();
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugProxy debugProxy;
	
	private class DebugEventDispatcher extends org.eclipse.core.runtime.jobs.Job {
		
		private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugCommunicationHelper communicationHelper = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugCommunicationHelper();
		
		public DebugEventDispatcher() {
			super(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation().getSyntaxName() + " Event Dispatch");
			setSystem(true);
		}
		
		protected org.eclipse.core.runtime.IStatus run(org.eclipse.core.runtime.IProgressMonitor monitor) {
			while (!isTerminated()) {
				it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message = communicationHelper.receive(eventReader);
				if (message != null) {
					notifyListeners(message);
				} else {
					terminated();
					break;
				}
			}
			return org.eclipse.core.runtime.Status.OK_STATUS;
		}
		
		private void notifyListeners(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message) {
			Object[] listeners = eventListeners.toArray();
			for (int i = 0; i < listeners.length; i++) {
				((it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener) listeners[i]).handleMessage(message);
			}
		}
	}
	
	public EmigOclDebugTarget(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugProcess process, org.eclipse.debug.core.ILaunch launch, int requestPort, int eventPort) {
		super(launch.getDebugTarget());
		this.process = process;
		this.launch = launch;
		this.thread = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugThread(this);
		this.threads = new org.eclipse.debug.core.model.IThread[] {this.thread};
		
		// initialize debug proxy
		try {
			this.debugProxy = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugProxy(this, requestPort);
		} catch (java.net.UnknownHostException e) {
			e.printStackTrace();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		
		// initialize asynchronous event dispatcher
		try {
			// creating event client socket (trying to connect)...
			this.eventSocket = new java.net.Socket("localhost", eventPort);
			// creating event client socket - done (connected).
			this.eventReader = new java.io.BufferedReader(new java.io.InputStreamReader(this.eventSocket.getInputStream()));
		} catch (java.net.ConnectException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		} catch (java.net.UnknownHostException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		} catch (java.io.IOException e) {
			throw new RuntimeException("Can't create socket: " + e.getMessage());
		}
		
		this.eventDispatch = new DebugEventDispatcher();
		this.eventDispatch.schedule();
		
		addEventListener(this);
		addEventListener(this.thread);
		addEventListener(this.process);
		
		org.eclipse.debug.core.DebugPlugin.getDefault().getBreakpointManager().addBreakpointListener(this);
	}
	
	/**
	 * Registers the given event listener. The listener will be notified of events in
	 * the program being interpreted. Has no effect if the listener is already
	 * registered.
	 * 
	 * @param listener event listener
	 */
	public void addEventListener(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener listener) {
		if (!eventListeners.contains(listener)) {
			eventListeners.add(listener);
		}
	}
	
	/**
	 * Deregisters the given event listener. Has no effect if the listener is not
	 * currently registered.
	 * 
	 * @param listener event listener
	 */
	public void removeEventListener(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.IEmigOclDebugEventListener listener) {
		eventListeners.remove(listener);
	}
	
	public String getName() throws org.eclipse.debug.core.DebugException {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation().getSyntaxName() + " model";
	}
	
	public org.eclipse.debug.core.model.IDebugTarget getDebugTarget() {
		return this;
	}
	
	public org.eclipse.debug.core.model.IProcess getProcess() {
		return process;
	}
	
	public org.eclipse.debug.core.model.IThread[] getThreads() throws org.eclipse.debug.core.DebugException {
		return threads;
	}
	
	public boolean hasThreads() throws org.eclipse.debug.core.DebugException {
		return true;
	}
	
	public boolean supportsBreakpoint(org.eclipse.debug.core.model.IBreakpoint breakpoint) {
		return breakpoint.getModelIdentifier().equals(getModelIdentifier());
	}
	
	public org.eclipse.debug.core.ILaunch getLaunch() {
		return launch;
	}
	
	public boolean canTerminate() {
		return getProcess().canTerminate();
	}
	
	public boolean isTerminated() {
		return terminated || getProcess().isTerminated();
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		getThread().terminate();
	}
	
	private synchronized void terminated() {
		terminated = true;
		threads = new org.eclipse.debug.core.model.IThread[0];
		fireTerminateEvent();
		removeEventListener(this);
		removeEventListener(this.thread);
		removeEventListener(this.process);
		org.eclipse.debug.core.DebugPlugin debugPlugin = org.eclipse.debug.core.DebugPlugin.getDefault();
		try {
			debugPlugin.getBreakpointManager().removeBreakpointListener(this);
		} catch (NullPointerException npe) {
			// this is a workaround for Eclipse bug 352315 (see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=352315)
		}
		getDebugProxy().terminate();
	}
	
	public boolean canResume() {
		return getThread().canResume();
	}
	
	public boolean canSuspend() {
		return getThread().canSuspend() && !isTerminated();
	}
	
	public boolean isSuspended() {
		return getThread().isSuspended();
	}
	
	public void resume() throws org.eclipse.debug.core.DebugException {
		getThread().resume();
	}
	
	public org.eclipse.debug.core.model.IThread getThread() {
		return thread;
	}
	
	public void suspend() throws org.eclipse.debug.core.DebugException {
		getThread().suspend();
	}
	
	public void breakpointAdded(org.eclipse.debug.core.model.IBreakpoint breakpoint) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if ((breakpoint.isEnabled() && getBreakpointManager().isEnabled()) || !breakpoint.isRegistered()) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclLineBreakpoint lineBreakpoint = (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclLineBreakpoint) breakpoint;
					lineBreakpoint.install(this);
				}
			} catch (org.eclipse.core.runtime.CoreException e) {
			}
		}
	}
	
	public void breakpointRemoved(org.eclipse.debug.core.model.IBreakpoint breakpoint, org.eclipse.core.resources.IMarkerDelta delta) {
		if (supportsBreakpoint(breakpoint)) {
			try {
				if ((breakpoint.isEnabled() && getBreakpointManager().isEnabled()) || !breakpoint.isRegistered()) {
					it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclLineBreakpoint lineBreakpoint = (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclLineBreakpoint) breakpoint;
					lineBreakpoint.remove(this);
				}
			} catch (org.eclipse.core.runtime.CoreException e) {
			}
		}
	}
	
	public void breakpointChanged(org.eclipse.debug.core.model.IBreakpoint breakpoint, org.eclipse.core.resources.IMarkerDelta delta) {
	}
	
	public boolean canDisconnect() {
		// not supported
		return false;
	}
	
	public void disconnect() throws org.eclipse.debug.core.DebugException {
	}
	
	public boolean isDisconnected() {
		return false;
	}
	
	public org.eclipse.debug.core.model.IMemoryBlock getMemoryBlock(long startAddress, long length) throws org.eclipse.debug.core.DebugException {
		return null;
	}
	
	public boolean supportsStorageRetrieval() {
		return false;
	}
	
	/**
	 * Notification we have connected to the VM and it has started. Resume the VM.
	 */
	private void started() {
		fireCreationEvent();
		installDeferredBreakpoints();
		try {
			resume();
		} catch (org.eclipse.debug.core.DebugException e) {
		}
	}
	
	/**
	 * Install breakpoints that are already registered with the breakpoint manager.
	 */
	private void installDeferredBreakpoints() {
		org.eclipse.debug.core.model.IBreakpoint[] breakpoints = getBreakpointManager().getBreakpoints(getModelIdentifier());
		for (int i = 0; i < breakpoints.length; i++) {
			breakpointAdded(breakpoints[i]);
		}
	}
	
	public void handleMessage(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugMessage message) {
		try {
			if (message.hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.STARTED)) {
				started();
			} else if (message.hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.SUSPENDED)) {
				suspend();
			} else if (message.hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.TERMINATED)) {
				terminated();
			} else if (message.hasType(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EEmigOclDebugMessageTypes.RESUMED)) {
				// ignore, this event is handled by the debug thread
			} else {
				System.out.println("ERROR in " + this.getClass().getName() + ".handleMessage(): unknown event " + message);
			}
		} catch (org.eclipse.debug.core.DebugException e) {
			e.printStackTrace();
		}
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclDebugProxy getDebugProxy() {
		return this.debugProxy;
	}
	
}
