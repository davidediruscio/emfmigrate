/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

public class EdeltaChoice extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement {
	
	public EdeltaChoice(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaStringUtil.explode(getChildren(), "|");
	}
	
}
