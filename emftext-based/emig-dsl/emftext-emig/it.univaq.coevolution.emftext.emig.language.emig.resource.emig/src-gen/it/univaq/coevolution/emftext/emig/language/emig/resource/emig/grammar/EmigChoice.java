/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

public class EmigChoice extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement {
	
	public EmigChoice(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.explode(getChildren(), "|");
	}
	
}
