/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class EdeltaSyntaxElement {
	
	private EdeltaSyntaxElement[] children;
	private EdeltaSyntaxElement parent;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality;
	
	public EdeltaSyntaxElement(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, EdeltaSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (EdeltaSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(EdeltaSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public EdeltaSyntaxElement[] getChildren() {
		if (children == null) {
			return new EdeltaSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality getCardinality() {
		return cardinality;
	}
	
}
