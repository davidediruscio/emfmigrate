/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug;

public class EmigSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigStackFrame) {
			it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigStackFrame frame = (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.debug.EmigStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
