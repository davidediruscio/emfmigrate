/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IEmigExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Adds an element that is a valid follower for this element
	 */
	public void addFollower(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	
	/**
	 * Returns all valid followers for this element
	 */
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigPair<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
	
}
