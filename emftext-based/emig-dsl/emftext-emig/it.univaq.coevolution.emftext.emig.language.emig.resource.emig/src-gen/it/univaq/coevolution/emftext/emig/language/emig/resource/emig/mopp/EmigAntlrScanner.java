/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigAntlrScanner implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextScanner {
	
	private org.antlr.runtime3_3_0.Lexer antlrLexer;
	
	public EmigAntlrScanner(org.antlr.runtime3_3_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_3_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextToken result = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_3_0.ANTLRStringStream(text));
	}
	
}
