/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaMetaInformation implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaMetaInformation {
	
	public String getSyntaxName() {
		return "edelta";
	}
	
	public String getURI() {
		return "http://www.emfmigrate.org/edelta";
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextScanner createLexer() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaAntlrScanner(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaLexer());
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaParser().createInstance(inputStream, encoding);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextPrinter createPrinter(java.io.OutputStream outputStream, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch getReferenceResolverSwitch() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaReferenceResolverSwitch();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenResolverFactory getTokenResolverFactory() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "it.univaq.coevolution.emftext.edelta/metamodel/edelta.cs";
	}
	
	public String[] getTokenNames() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaParser(null).getTokenNames();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenStyle getDefaultTokenStyle(String tokenName) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaBracketPair> getBracketPairs() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResourceFactory();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaNewFileContentProvider getNewFileContentProvider() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResourceFactory());
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
		return "it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.launchConfigurationType";
	}
	
}
