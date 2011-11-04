/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class EmigOclProposalPostProcessor {
	
	public java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal> process(java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
