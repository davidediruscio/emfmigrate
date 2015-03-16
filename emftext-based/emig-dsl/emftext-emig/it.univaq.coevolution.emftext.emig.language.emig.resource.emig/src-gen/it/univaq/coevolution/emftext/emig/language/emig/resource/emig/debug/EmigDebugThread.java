/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

public class EmigDebugThread extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugElement implements org.eclipse.debug.core.model.IThread, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.IEmigDebugEventListener {
	
	private boolean suspended = false;
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugTarget debugTarget;
	
	public EmigDebugThread(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugTarget target) {
		super(target);
		this.debugTarget = target;
	}
	
	public org.eclipse.debug.core.model.IBreakpoint[] getBreakpoints() {
		return null;
	}
	
	public String getName() throws org.eclipse.debug.core.DebugException {
		return "Thread [main]";
	}
	
	public int getPriority() throws org.eclipse.debug.core.DebugException {
		return 0;
	}
	
	public org.eclipse.debug.core.model.IStackFrame[] getStackFrames() throws org.eclipse.debug.core.DebugException {
		if (isSuspended()) {
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage stack = this.debugTarget.getDebugProxy().getStack();
			String framesData = stack.getArgument(0);
			if (framesData != null && !"".equals(framesData)) {
				java.util.List<String> frames = it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.decode(framesData, '#');
				org.eclipse.debug.core.model.IStackFrame[] theFrames = new org.eclipse.debug.core.model.IStackFrame[frames.size()];
				for (int i = 0; i < frames.size(); i++) {
					String data = frames.get(i);
					theFrames[frames.size() - i - 1] = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigStackFrame(getTarget(), data);
				}
				return theFrames;
			}
		}
		return new org.eclipse.debug.core.model.IStackFrame[0];
	}
	
	public org.eclipse.debug.core.model.IStackFrame getTopStackFrame() throws org.eclipse.debug.core.DebugException {
		org.eclipse.debug.core.model.IStackFrame[] frames = getStackFrames();
		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}
	
	public boolean hasStackFrames() throws org.eclipse.debug.core.DebugException {
		return isSuspended();
	}
	
	public boolean canResume() {
		return isSuspended();
	}
	
	public boolean canSuspend() {
		return !isSuspended();
	}
	
	public boolean isSuspended() {
		return suspended && !isTerminated();
	}
	
	public void resume() throws org.eclipse.debug.core.DebugException {
		debugTarget.getDebugProxy().resume();
		suspended = false;
	}
	
	public void suspend() throws org.eclipse.debug.core.DebugException {
		suspended = true;
		fireSuspendEvent(org.eclipse.debug.core.DebugEvent.BREAKPOINT);
	}
	
	public boolean canStepInto() {
		return true;
	}
	
	public boolean canStepOver() {
		return true;
	}
	
	public boolean canStepReturn() {
		return true;
	}
	
	public boolean isStepping() {
		return false;
	}
	
	public void stepInto() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepInto();
	}
	
	public void stepOver() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepOver();
	}
	
	public void stepReturn() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().stepReturn();
	}
	
	public boolean canTerminate() {
		return !isTerminated();
	}
	
	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}
	
	public void terminate() throws org.eclipse.debug.core.DebugException {
		getTarget().getDebugProxy().terminate();
	}
	
	public void handleMessage(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugMessage message) {
		if (message.hasType(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.STARTED)) {
			fireCreationEvent();
		} else if (message.hasType(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.RESUMED)) {
			suspended = false;
			fireResumeEvent(0);
		} else if (message.hasType(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.SUSPENDED)) {
			suspended = true;
			fireSuspendEvent(org.eclipse.debug.core.DebugEvent.BREAKPOINT);
		} else if (message.hasType(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EEmigDebugMessageTypes.TERMINATED)) {
			// ignore this event
		} else {
			System.out.println("ERROR " + this.getClass().getName() + ".handleMessage(" + message + ") unknown event");
		}
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigDebugTarget getTarget() {
		return debugTarget;
	}
	
}
