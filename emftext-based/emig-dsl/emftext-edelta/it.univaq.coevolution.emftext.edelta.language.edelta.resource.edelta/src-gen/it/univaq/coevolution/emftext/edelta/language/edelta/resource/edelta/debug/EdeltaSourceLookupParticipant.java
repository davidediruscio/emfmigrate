/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug;

public class EdeltaSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaStackFrame) {
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaStackFrame frame = (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
