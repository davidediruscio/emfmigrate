/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IEdeltaResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor getResourcePostProcessor();
	
}
