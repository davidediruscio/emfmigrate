/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class EmigOclAbstractExpectedElement implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public EmigOclAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclPair<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
