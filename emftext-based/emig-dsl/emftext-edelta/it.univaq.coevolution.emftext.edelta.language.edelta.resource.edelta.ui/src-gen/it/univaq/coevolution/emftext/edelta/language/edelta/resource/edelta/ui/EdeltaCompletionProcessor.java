/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui;

public class EdeltaCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourceProvider resourceProvider;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaBracketHandlerProvider bracketHandlerProvider;
	
	public EdeltaCompletionProcessor(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourceProvider resourceProvider, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource textResource = resourceProvider.getResource();
		String content = viewer.getDocument().get();
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCodeCompletionHelper helper = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCodeCompletionHelper();
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaProposalPostProcessor proposalPostProcessor = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaProposalPostProcessor();
		java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal> finalProposalList = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal>();
		for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCompletionProposal proposal : finalProposalList) {
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
			it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.IEdeltaBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
