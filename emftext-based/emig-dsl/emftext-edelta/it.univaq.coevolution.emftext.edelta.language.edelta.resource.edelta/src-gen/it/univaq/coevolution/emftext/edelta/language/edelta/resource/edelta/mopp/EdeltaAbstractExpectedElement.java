/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class EdeltaAbstractExpectedElement implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public EdeltaAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaPair<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
