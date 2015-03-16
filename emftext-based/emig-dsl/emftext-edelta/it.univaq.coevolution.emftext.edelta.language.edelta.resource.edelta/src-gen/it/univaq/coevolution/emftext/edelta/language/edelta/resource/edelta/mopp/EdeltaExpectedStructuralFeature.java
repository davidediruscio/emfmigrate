/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class EdeltaExpectedStructuralFeature extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaPlaceholder placeholder;
	
	public EdeltaExpectedStructuralFeature(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaPlaceholder placeholder) {
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
		if (o instanceof EdeltaExpectedStructuralFeature) {
			return getFeature().equals(((EdeltaExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
