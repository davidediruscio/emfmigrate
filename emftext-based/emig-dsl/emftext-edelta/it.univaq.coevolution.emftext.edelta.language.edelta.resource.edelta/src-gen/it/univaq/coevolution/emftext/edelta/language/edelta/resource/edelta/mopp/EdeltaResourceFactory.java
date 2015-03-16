/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public EdeltaResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource(uri);
	}
	
}
