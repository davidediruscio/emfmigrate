/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclMetaInformation implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclMetaInformation {
	
	public String getSyntaxName() {
		return "EmigOcl";
	}
	
	public String getURI() {
		return "http://www.univaq.it/coevolution/emfmigrate/EmigOcl";
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextScanner createLexer() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclAntlrScanner(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclLexer());
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclParser().createInstance(inputStream, encoding);
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextPrinter createPrinter(java.io.OutputStream outputStream, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource) {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolverSwitch getReferenceResolverSwitch() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclReferenceResolverSwitch();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolverFactory getTokenResolverFactory() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "it.univaq.coevolution.emfmigrate.EmigOcl/metamodel/EmigOcl.cs";
	}
	
	public String[] getTokenNames() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclParser(null).getTokenNames();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenStyle getDefaultTokenStyle(String tokenName) {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclBracketPair> getBracketPairs() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResourceFactory();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclNewFileContentProvider getNewFileContentProvider() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResourceFactory());
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
		return "it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.launchConfigurationType";
	}
	
}
