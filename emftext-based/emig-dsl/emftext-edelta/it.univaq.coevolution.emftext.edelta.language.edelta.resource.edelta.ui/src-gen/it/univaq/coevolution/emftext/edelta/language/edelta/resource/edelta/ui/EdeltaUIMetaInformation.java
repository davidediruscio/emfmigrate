/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui;

public class EdeltaUIMetaInformation extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaMetaInformation {
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaHoverTextProvider getHoverTextProvider() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaHoverTextProvider();
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaImageProvider getImageProvider() {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaImageProvider.INSTANCE;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager createColorManager() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(it.univaq.coevolution.emftext.edelta.language.edelta.resource
	 * .edelta.IEdeltaTextResource,
	 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCo
	 * lorManager) instead.
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaTokenScanner createTokenScanner(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaTokenScanner createTokenScanner(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaColorManager colorManager) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaTokenScanner(resource, colorManager);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCodeCompletionHelper createCodeCompletionHelper() {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaCodeCompletionHelper();
	}
	
}
