/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class EmigAbstractExpectedElement implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigPair<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigPair<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public EmigAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigPair<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigPair<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
