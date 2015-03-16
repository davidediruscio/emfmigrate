/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

public class EmigOclSequence extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement {
	
	public EmigOclSequence(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclStringUtil.explode(getChildren(), " ");
	}
	
}
