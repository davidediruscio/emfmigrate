/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class EdeltaKeyword extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement {
	
	private final String value;
	
	public EdeltaKeyword(String value, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality) {
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
