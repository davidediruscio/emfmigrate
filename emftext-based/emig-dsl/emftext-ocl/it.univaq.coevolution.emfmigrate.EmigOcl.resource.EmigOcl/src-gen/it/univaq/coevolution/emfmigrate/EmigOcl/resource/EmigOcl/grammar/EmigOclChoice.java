/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

public class EmigOclChoice extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement {
	
	public EmigOclChoice(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclStringUtil.explode(getChildren(), "|");
	}
	
}
