/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaResourcePostProcessor implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaResourcePostProcessor {
	
	public void process(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
