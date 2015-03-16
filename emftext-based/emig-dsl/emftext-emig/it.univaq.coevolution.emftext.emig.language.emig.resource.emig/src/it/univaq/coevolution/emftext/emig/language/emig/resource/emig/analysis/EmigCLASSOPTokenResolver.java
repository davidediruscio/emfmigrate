/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis;

public class EmigCLASSOPTokenResolver implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultTokenResolver defaultTokenResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
