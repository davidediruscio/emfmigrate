/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaBracketInformationProvider {
	
	public class BracketPair implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBracketPair> getBracketPairs() {
		java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBracketPair> result = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		return result;
	}
	
}
