/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EdeltaProposalPostProcessor {
	
	public java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal> process(java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
