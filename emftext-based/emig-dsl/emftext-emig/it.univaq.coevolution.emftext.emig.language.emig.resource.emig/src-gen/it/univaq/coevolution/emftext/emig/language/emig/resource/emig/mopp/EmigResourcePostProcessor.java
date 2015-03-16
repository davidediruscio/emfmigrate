/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigResourcePostProcessor implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigResourcePostProcessor {
	
	public void process(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource resource) {
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
