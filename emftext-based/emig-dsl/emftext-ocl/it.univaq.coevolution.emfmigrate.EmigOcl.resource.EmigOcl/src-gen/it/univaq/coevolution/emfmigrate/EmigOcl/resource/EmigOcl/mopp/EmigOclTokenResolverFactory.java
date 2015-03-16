/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * The EmigOclTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class EmigOclTokenResolverFactory implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolverFactory {
	
	private java.util.Map<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver> featureName2CollectInTokenResolver;
	private static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver defaultResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclDefaultTokenResolver();
	
	public EmigOclTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver>();
		registerTokenResolver("NOTOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclNOTOPTokenResolver());
		registerTokenResolver("BOOLOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclBOOLOPTokenResolver());
		registerTokenResolver("INTOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclINTOPTokenResolver());
		registerTokenResolver("RELOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclRELOPTokenResolver());
		registerTokenResolver("EQ", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclEQTokenResolver());
		registerTokenResolver("NEQ", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclNEQTokenResolver());
		registerTokenResolver("ADDOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclADDOPTokenResolver());
		registerTokenResolver("MULOP", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclMULOPTokenResolver());
		registerTokenResolver("FLOAT", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclFLOATTokenResolver());
		registerTokenResolver("INTEGER", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclINTEGERTokenResolver());
		registerTokenResolver("STRINGTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclSTRINGTYPETokenResolver());
		registerTokenResolver("BOOLEANTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclBOOLEANTYPETokenResolver());
		registerTokenResolver("INTEGERTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclINTEGERTYPETokenResolver());
		registerTokenResolver("REALTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclREALTYPETokenResolver());
		registerTokenResolver("COLLECTIONTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclCOLLECTIONTYPETokenResolver());
		registerTokenResolver("BAGTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclBAGTYPETokenResolver());
		registerTokenResolver("ORDEREDSETTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclORDEREDSETTYPETokenResolver());
		registerTokenResolver("SEQUENCETYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclSEQUENCETYPETokenResolver());
		registerTokenResolver("SETTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclSETTYPETokenResolver());
		registerTokenResolver("OCLANYTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclOCLANYTYPETokenResolver());
		registerTokenResolver("TUPLETYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclTUPLETYPETokenResolver());
		registerTokenResolver("MAPTYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclMAPTYPETokenResolver());
		registerTokenResolver("LAMBDATYPE", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclLAMBDATYPETokenResolver());
		registerTokenResolver("TEXT", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34_92", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclQUOTED_34_34_92TokenResolver());
		registerTokenResolver("QUOTED_39_39_92", new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.EmigOclQUOTED_39_39_92TokenResolver());
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver internalCreateResolver(java.util.Map<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver> resolverMap, String key, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
