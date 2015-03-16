/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

public class EmigOclUIMetaInformation extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclMetaInformation {
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclHoverTextProvider getHoverTextProvider() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclHoverTextProvider();
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclImageProvider getImageProvider() {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclImageProvider.INSTANCE;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclColorManager createColorManager() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEm
	 * igOclTextResource,
	 * it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclColorManager
	 * ) instead.
	 */
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclTokenScanner createTokenScanner(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclTokenScanner createTokenScanner(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTextResource resource, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclColorManager colorManager) {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclTokenScanner(resource, colorManager);
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCodeCompletionHelper createCodeCompletionHelper() {
		return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclCodeCompletionHelper();
	}
	
}
