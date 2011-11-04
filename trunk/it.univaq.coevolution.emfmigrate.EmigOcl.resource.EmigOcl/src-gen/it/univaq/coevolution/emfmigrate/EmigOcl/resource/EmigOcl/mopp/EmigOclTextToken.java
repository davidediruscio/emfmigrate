/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclTextToken implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextToken {
	
	private final it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclMetaInformation metaInformation = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation();
	private final org.antlr.runtime3_3_0.Token antlrToken;
	
	public EmigOclTextToken(org.antlr.runtime3_3_0.Token antlrToken) {
		super();
		this.antlrToken = antlrToken;
	}
	
	public String getName() {
		return getTokenName(metaInformation.getTokenNames(), antlrToken.getType());
	}
	
	public int getOffset() {
		return ((org.antlr.runtime3_3_0.CommonToken) antlrToken).getStartIndex();
	}
	
	public int getLength() {
		return ((org.antlr.runtime3_3_0.CommonToken) antlrToken).getStopIndex() - ((org.antlr.runtime3_3_0.CommonToken) antlrToken).getStartIndex() + 1;
	}
	
	public int getLine() {
		return antlrToken.getLine();
	}
	
	public int getColumn() {
		return antlrToken.getCharPositionInLine();
	}
	
	public boolean canBeUsedForSyntaxHighlighting() {
		return canBeUsedForSyntaxHighlighting(antlrToken.getType());
	}
	
	public boolean canBeUsedForSyntaxHighlighting(int tokenType) {
		if (tokenType < 0 || tokenType == org.antlr.runtime3_3_0.Token.EOF) {
			return false;
		}
		if (tokenType == org.antlr.runtime3_3_0.Token.UP) {
			return false;
		}
		if (tokenType == org.antlr.runtime3_3_0.Token.DOWN) {
			return false;
		}
		if (tokenType == org.antlr.runtime3_3_0.Token.EOR_TOKEN_TYPE) {
			return false;
		}
		if (tokenType == org.antlr.runtime3_3_0.Token.INVALID_TOKEN_TYPE) {
			return false;
		}
		return true;
	}
	
	public String getText() {
		return antlrToken.getText();
	}
	
	public String getTokenName(String[] tokenNames, int index) {
		if (tokenNames == null) {
			return null;
		}
		String tokenName = tokenNames[index];
		if (tokenName != null && tokenName.startsWith("'")) {
			tokenName = tokenName.substring(1, tokenName.length() - 1).trim();
		}
		return tokenName;
	}
	
}
