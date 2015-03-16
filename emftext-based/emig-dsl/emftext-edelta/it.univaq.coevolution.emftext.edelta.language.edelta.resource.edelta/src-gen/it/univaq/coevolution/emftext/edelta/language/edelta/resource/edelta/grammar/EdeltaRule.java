/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class EdeltaRule extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public EdeltaRule(org.eclipse.emf.ecore.EClass metaclass, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaChoice choice, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality) {
		super(cardinality, new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaChoice getDefinition() {
		return (it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaChoice) getChildren()[0];
	}
	
}

