/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclResourcePostProcessor implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclResourcePostProcessor {
	
	public void process(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource resource) {
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
