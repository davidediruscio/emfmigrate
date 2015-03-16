/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class EmigSyntaxElement {
	
	private EmigSyntaxElement[] children;
	private EmigSyntaxElement parent;
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality;
	
	public EmigSyntaxElement(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality, EmigSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (EmigSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(EmigSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public EmigSyntaxElement[] getChildren() {
		if (children == null) {
			return new EmigSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality getCardinality() {
		return cardinality;
	}
	
}
