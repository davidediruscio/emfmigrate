/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

public class EmigOclLineBreak extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclFormattingElement {
	
	private final int tabs;
	
	public EmigOclLineBreak(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality, int tabs) {
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
