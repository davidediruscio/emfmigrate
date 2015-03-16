/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaAntlrScanner implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public EdeltaAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextToken result = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
