/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

public class EmigCompound extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement {
	
	public EmigCompound(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice choice, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality) {
		super(cardinality, new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
