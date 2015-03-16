/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis;

public class ComplexOperatorCallRefReferenceResolver implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolver<it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall, it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef> {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultResolverDelegate<it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall, it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef> delegate = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultResolverDelegate<it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall, it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef>();
	
	public void resolve(String identifier, it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef element, it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
