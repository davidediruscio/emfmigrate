/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis;

public class changeReferenceRefReferenceResolver implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolver<it.univaq.coevolution.emftext.edelta.language.edelta.changeReference, it.univaq.coevolution.emftext.edelta.language.edelta.Reference> {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultResolverDelegate<it.univaq.coevolution.emftext.edelta.language.edelta.changeReference, it.univaq.coevolution.emftext.edelta.language.edelta.Reference> delegate = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultResolverDelegate<it.univaq.coevolution.emftext.edelta.language.edelta.changeReference, it.univaq.coevolution.emftext.edelta.language.edelta.Reference>();
	
	public void resolve(String identifier, it.univaq.coevolution.emftext.edelta.language.edelta.changeReference container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Reference> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(it.univaq.coevolution.emftext.edelta.language.edelta.Reference element, it.univaq.coevolution.emftext.edelta.language.edelta.changeReference container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
