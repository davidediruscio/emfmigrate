/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class EmigOclSyntaxElement {
	
	private EmigOclSyntaxElement[] children;
	private EmigOclSyntaxElement parent;
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality;
	
	public EmigOclSyntaxElement(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality, EmigOclSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (EmigOclSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	public void setParent(EmigOclSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	public EmigOclSyntaxElement[] getChildren() {
		if (children == null) {
			return new EmigOclSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality getCardinality() {
		return cardinality;
	}
	
}
