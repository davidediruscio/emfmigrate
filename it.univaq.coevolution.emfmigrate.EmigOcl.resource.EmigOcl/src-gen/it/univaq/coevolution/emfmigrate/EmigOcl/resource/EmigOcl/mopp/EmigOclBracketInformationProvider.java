/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclBracketInformationProvider {
	
	public class BracketPair implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair {
		
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
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair> getBracketPairs() {
		java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair> result = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("{", "}", true));
		return result;
	}
	
}
