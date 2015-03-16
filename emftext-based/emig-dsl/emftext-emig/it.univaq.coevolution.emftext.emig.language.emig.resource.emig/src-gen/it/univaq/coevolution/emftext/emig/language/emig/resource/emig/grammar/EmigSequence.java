/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

public class EmigSequence extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement {
	
	public EmigSequence(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigStringUtil.explode(getChildren(), " ");
	}
	
}
