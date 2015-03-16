/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug;

public class EdeltaSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.debug.EdeltaSourceLookupParticipant()});
	}
	
}
