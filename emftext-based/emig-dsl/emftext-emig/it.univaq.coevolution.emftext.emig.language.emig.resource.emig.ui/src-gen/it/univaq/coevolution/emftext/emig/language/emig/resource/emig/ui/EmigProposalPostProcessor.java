/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EmigProposalPostProcessor {
	
	public java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigCompletionProposal> process(java.util.List<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
