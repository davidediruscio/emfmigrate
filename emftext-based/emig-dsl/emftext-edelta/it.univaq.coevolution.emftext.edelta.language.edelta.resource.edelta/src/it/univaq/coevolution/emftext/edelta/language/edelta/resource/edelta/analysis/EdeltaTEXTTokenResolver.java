/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis;

public class EdeltaTEXTTokenResolver implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultTokenResolver defaultTokenResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
