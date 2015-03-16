/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private EmigSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public EmigSyntaxElementDecorator(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement decoratedElement, EmigSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public EmigSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
