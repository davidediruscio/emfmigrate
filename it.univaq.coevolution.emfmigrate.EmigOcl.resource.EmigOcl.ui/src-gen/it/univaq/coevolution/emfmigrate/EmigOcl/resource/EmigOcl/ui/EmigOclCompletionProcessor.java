/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

public class EmigOclCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclResourceProvider resourceProvider;
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.IEmigOclBracketHandlerProvider bracketHandlerProvider;
	
	public EmigOclCompletionProcessor(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclResourceProvider resourceProvider, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.IEmigOclBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCodeCompletionHelper helper = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCodeCompletionHelper();
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclProposalPostProcessor proposalPostProcessor = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclProposalPostProcessor();
		java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal> finalProposalList = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal>();
		for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.IEmigOclBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
