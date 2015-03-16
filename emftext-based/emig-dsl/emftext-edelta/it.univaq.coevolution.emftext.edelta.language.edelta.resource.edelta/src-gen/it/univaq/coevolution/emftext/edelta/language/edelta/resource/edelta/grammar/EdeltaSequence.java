/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

public class EdeltaSequence extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement {
	
	public EdeltaSequence(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaStringUtil.explode(getChildren(), " ");
	}
	
}
