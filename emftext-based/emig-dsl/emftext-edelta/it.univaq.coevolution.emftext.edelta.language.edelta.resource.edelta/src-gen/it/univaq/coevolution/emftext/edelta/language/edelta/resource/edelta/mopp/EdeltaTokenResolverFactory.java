/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * The EdeltaTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class EdeltaTokenResolverFactory implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolverFactory {
	
	private java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver> featureName2CollectInTokenResolver;
	private static it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver defaultResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaDefaultTokenResolver();
	
	public EdeltaTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver>();
		registerTokenResolver("TEXT", new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.EdeltaQUOTED_34_34TokenResolver());
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver internalCreateResolver(java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver> resolverMap, String key, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
