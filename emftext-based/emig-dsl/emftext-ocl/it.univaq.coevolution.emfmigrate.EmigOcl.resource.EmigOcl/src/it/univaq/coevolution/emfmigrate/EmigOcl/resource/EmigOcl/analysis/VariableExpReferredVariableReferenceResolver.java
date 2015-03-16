/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis;

public class VariableExpReferredVariableReferenceResolver implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolver<it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp, it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration> {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultResolverDelegate<it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp, it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration> delegate = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultResolverDelegate<it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp, it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration>();
	
	public void resolve(String identifier, it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration element, it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
