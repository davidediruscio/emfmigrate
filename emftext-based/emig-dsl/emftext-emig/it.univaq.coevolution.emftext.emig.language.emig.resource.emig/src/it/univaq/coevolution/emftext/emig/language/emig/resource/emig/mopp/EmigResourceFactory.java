/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

import org.eclipse.emf.ecore.resource.Resource;

public class EmigResourceFactory implements Resource.Factory {

	/**
	 * Creates a new {@link EmigResourceFactory}.
	 */
	public EmigResourceFactory() {
		super();
	}

	/**
	 * {@inheritDoc}
	 */
	public Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new EmigLocationResource(uri);
	}
	
}
