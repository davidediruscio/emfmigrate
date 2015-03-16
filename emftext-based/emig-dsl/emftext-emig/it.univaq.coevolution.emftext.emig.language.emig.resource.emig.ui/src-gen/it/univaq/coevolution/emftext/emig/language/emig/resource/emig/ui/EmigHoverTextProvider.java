/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui;

public class EmigHoverTextProvider implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigHoverTextProvider {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigDefaultHoverTextProvider defaultProvider = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.ui.EmigDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
