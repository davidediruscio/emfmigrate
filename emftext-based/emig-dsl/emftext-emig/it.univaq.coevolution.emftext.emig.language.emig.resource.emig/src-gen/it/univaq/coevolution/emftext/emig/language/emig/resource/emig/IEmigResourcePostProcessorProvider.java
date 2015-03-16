/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IEmigResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigResourcePostProcessor getResourcePostProcessor();
	
}
