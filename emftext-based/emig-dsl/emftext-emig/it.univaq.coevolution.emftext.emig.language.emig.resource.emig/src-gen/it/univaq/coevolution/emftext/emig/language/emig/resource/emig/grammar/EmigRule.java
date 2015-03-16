/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class EmigRule extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public EmigRule(org.eclipse.emf.ecore.EClass metaclass, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice choice, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality) {
		super(cardinality, new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice getDefinition() {
		return (it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigChoice) getChildren()[0];
	}
	
}

