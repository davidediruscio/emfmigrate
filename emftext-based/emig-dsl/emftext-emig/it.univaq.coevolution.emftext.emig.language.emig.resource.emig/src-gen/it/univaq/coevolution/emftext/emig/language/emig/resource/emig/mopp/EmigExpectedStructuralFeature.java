/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class EmigExpectedStructuralFeature extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder;
	
	public EmigExpectedStructuralFeature(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof EmigExpectedStructuralFeature) {
			return getFeature().equals(((EmigExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
