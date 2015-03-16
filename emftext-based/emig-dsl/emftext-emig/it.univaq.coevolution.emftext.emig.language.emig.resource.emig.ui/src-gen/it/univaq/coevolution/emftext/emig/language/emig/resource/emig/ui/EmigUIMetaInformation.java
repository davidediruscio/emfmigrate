/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui;

public class EmigUIMetaInformation extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigMetaInformation {
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigHoverTextProvider getHoverTextProvider() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigHoverTextProvider();
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigImageProvider getImageProvider() {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigImageProvider.INSTANCE;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigColorManager createColorManager() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(it.univaq.coevolution.emftext.emig.language.emig.resource.emi
	 * g.IEmigTextResource,
	 * it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigColorManag
	 * er) instead.
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigTokenScanner createTokenScanner(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigTokenScanner createTokenScanner(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigTextResource resource, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigColorManager colorManager) {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigTokenScanner(resource, colorManager);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigCodeCompletionHelper createCodeCompletionHelper() {
		return new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigCodeCompletionHelper();
	}
	
}
