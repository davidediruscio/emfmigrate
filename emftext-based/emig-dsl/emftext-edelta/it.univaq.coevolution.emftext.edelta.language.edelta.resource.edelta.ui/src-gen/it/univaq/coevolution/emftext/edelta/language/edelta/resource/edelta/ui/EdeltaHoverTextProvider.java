/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui;

public class EdeltaHoverTextProvider implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaHoverTextProvider {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaDefaultHoverTextProvider defaultProvider = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.ui.EdeltaDefaultHoverTextProvider();
	
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
