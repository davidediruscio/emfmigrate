/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigMetaInformation implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigMetaInformation {
	
	public String getSyntaxName() {
		return "emig";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/emig";
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextScanner createLexer() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigAntlrScanner(new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigLexer());
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigParser().createInstance(inputStream, encoding);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextPrinter createPrinter(java.io.OutputStream outputStream, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource resource) {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolverSwitch getReferenceResolverSwitch() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigReferenceResolverSwitch();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenResolverFactory getTokenResolverFactory() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "it.univaq.coevolution.emftext.emig.language.emig/metamodel/emig.cs";
	}
	
	public String[] getTokenNames() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigParser(null).getTokenNames();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTokenStyle getDefaultTokenStyle(String tokenName) {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigBracketPair> getBracketPairs() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResourceFactory();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigNewFileContentProvider getNewFileContentProvider() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.launchConfigurationType";
	}
	
}
