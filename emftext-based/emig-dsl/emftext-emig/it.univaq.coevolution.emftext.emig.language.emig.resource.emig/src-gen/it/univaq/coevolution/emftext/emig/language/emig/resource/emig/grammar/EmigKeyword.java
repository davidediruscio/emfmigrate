/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class EmigKeyword extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement {
	
	private final String value;
	
	public EmigKeyword(String value, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
