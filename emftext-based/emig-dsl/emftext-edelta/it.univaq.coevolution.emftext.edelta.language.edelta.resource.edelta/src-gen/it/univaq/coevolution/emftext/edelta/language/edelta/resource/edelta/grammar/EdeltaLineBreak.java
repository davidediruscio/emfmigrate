/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

public class EdeltaLineBreak extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFormattingElement {
	
	private final int tabs;
	
	public EdeltaLineBreak(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
