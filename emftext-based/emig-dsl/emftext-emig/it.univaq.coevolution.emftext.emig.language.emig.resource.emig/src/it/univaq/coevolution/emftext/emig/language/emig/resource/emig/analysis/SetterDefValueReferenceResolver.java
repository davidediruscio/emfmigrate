/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis;

public class SetterDefValueReferenceResolver implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<it.univaq.coevolution.emftext.emig.language.emig.SetterDef, be.ac.vub.simpleocl.Primitive> {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultResolverDelegate<it.univaq.coevolution.emftext.emig.language.emig.SetterDef, be.ac.vub.simpleocl.Primitive> delegate = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultResolverDelegate<it.univaq.coevolution.emftext.emig.language.emig.SetterDef, be.ac.vub.simpleocl.Primitive>();
	
	public void resolve(String identifier, it.univaq.coevolution.emftext.emig.language.emig.SetterDef container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolveResult<be.ac.vub.simpleocl.Primitive> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(be.ac.vub.simpleocl.Primitive element, it.univaq.coevolution.emftext.emig.language.emig.SetterDef container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
