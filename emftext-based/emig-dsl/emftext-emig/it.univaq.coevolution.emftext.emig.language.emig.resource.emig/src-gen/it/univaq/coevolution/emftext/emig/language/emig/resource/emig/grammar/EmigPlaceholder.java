/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class EmigPlaceholder extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal {
	
	private final String tokenName;
	
	public EmigPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
