/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenStyle getDynamicTokenStyle(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextResource resource, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTextToken token, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
