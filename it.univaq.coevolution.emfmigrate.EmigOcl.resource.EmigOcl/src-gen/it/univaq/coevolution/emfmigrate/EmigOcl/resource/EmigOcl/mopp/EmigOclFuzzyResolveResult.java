/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A FuzzyResolveResult is an implementation of the IEmigOclReferenceResolveResult
 * interface that delegates all method calls to a given
 * IEmigOclReferenceResolveResult with ReferenceType EObject. It is used by
 * reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class EmigOclFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<ReferenceType> {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public EmigOclFuzzyResolveResult(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
