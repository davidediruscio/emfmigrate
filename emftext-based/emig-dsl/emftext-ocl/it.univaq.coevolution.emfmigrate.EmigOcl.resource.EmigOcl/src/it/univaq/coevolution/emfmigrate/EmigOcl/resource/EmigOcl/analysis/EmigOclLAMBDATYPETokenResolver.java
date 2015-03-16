/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis;

public class EmigOclLAMBDATYPETokenResolver implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultTokenResolver defaultTokenResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
