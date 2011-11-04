/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

public class EmigOclWhiteSpace extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFormattingElement {
	
	private final int amount;
	
	public EmigOclWhiteSpace(int amount, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality) {
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
