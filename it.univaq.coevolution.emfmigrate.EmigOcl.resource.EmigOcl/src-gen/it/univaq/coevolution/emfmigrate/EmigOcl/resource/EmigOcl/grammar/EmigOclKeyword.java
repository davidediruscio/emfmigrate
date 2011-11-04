/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class EmigOclKeyword extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement {
	
	private final String value;
	
	public EmigOclKeyword(String value, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality) {
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
