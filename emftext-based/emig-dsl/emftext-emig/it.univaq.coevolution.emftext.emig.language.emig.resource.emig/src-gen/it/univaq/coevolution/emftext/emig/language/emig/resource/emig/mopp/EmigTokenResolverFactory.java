/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * The EmigTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class EmigTokenResolverFactory implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolverFactory {
	
	private java.util.Map<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver> featureName2CollectInTokenResolver;
	private static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver defaultResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigDefaultTokenResolver();
	
	public EmigTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver>();
		registerTokenResolver("PACKAGEOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigPACKAGEOPTokenResolver());
		registerTokenResolver("CLASSOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigCLASSOPTokenResolver());
		registerTokenResolver("ATTOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigATTOPTokenResolver());
		registerTokenResolver("REFOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.EmigREFOPTokenResolver());
		registerTokenResolver("NOTOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclINTOPTokenResolver());
		registerTokenResolver("RELOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclRELOPTokenResolver());
		registerTokenResolver("EQ", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclEQTokenResolver());
		registerTokenResolver("NEQ", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclNEQTokenResolver());
		registerTokenResolver("ADDOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclADDOPTokenResolver());
		registerTokenResolver("MULOP", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclMULOPTokenResolver());
		registerTokenResolver("FLOAT", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclFLOATTokenResolver());
		registerTokenResolver("INTEGER", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclOCLANYTYPETokenResolver());
		registerTokenResolver("OCLTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclOCLTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclTUPLETYPETokenResolver());
		registerTokenResolver("TUPLE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclTUPLETokenResolver());
		registerTokenResolver("MAPTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclLAMBDATYPETokenResolver());
		registerTokenResolver("ENVTYPE", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclENVTYPETokenResolver());
		registerTokenResolver("TEXT", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.SimpleoclQUOTED_39_39_92TokenResolver());
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver internalCreateResolver(java.util.Map<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver> resolverMap, String key, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
