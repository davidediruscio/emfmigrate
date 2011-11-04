/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IEmigOclResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclResourcePostProcessor getResourcePostProcessor();
	
}
