/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

public class EmigOclCompound extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement {
	
	public EmigOclCompound(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclChoice choice, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality) {
		super(cardinality, new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
