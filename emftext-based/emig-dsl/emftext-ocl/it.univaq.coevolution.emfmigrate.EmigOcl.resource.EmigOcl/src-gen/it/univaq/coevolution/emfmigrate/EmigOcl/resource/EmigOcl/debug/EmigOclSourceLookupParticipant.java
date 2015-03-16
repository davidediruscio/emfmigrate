/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug;

public class EmigOclSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclStackFrame) {
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclStackFrame frame = (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.debug.EmigOclStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
