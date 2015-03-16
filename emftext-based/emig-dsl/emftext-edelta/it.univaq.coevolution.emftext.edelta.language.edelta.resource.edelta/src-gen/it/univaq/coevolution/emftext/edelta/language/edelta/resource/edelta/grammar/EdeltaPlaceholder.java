/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class EdeltaPlaceholder extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaTerminal {
	
	private final String tokenName;
	
	public EdeltaPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
