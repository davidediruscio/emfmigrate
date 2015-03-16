/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

public interface IEmigBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
