/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigBracketInformationProvider {
	
	public class BracketPair implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair {
		
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
	
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair> getBracketPairs() {
		java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair> result = new java.util.ArrayList<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("[", "]", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", false));
		result.add(new BracketPair("'", "'", false));
		return result;
	}
	
}
