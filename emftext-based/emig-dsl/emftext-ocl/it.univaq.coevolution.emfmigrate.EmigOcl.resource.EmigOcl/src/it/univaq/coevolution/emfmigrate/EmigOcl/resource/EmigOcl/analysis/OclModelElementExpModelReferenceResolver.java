/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis;

public class OclModelElementExpModelReferenceResolver implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolver<it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultResolverDelegate<it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> delegate = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultResolverDelegate<it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp, it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>();
	
	public void resolve(String identifier, it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(it.univaq.coevolution.emfmigrate.EmigOcl.OclModel element, it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
