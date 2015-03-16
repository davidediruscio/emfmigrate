/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

public class EmigWhiteSpace extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigFormattingElement {
	
	private final int amount;
	
	public EmigWhiteSpace(int amount, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality) {
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
