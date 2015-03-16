/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis;

public class MigrationProgramLibrariesReferenceResolver implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram, it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary> {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultResolverDelegate<it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram, it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary> delegate = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultResolverDelegate<it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram, it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary>();
	
	public void resolve(String identifier, it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolveResult<it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(it.univaq.coevolution.emftext.emig.language.emig.MigrationLibrary element, it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
