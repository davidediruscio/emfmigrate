/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

public class EdeltaWhiteSpace extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaFormattingElement {
	
	private final int amount;
	
	public EdeltaWhiteSpace(int amount, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
