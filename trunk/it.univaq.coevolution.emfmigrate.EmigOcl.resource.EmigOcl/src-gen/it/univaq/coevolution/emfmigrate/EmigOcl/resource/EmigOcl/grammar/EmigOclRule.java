/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class EmigOclRule extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public EmigOclRule(org.eclipse.emf.ecore.EClass metaclass, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclChoice choice, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality) {
		super(cardinality, new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclChoice getDefinition() {
		return (it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclChoice) getChildren()[0];
	}
	
}

