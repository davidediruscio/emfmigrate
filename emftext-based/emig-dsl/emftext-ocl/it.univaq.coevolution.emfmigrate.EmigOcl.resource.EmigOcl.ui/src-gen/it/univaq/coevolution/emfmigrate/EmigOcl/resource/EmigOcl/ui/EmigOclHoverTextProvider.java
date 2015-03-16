/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui;

public class EmigOclHoverTextProvider implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclHoverTextProvider {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclDefaultHoverTextProvider defaultProvider = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.ui.EmigOclDefaultHoverTextProvider();
	
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
