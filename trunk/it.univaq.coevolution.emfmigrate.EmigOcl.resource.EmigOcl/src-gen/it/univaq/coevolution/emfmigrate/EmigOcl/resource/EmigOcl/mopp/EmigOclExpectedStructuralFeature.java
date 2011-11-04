/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class EmigOclExpectedStructuralFeature extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclAbstractExpectedElement {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclPlaceholder placeholder;
	
	public EmigOclExpectedStructuralFeature(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclPlaceholder placeholder) {
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
		if (o instanceof EmigOclExpectedStructuralFeature) {
			return getFeature().equals(((EmigOclExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
}
