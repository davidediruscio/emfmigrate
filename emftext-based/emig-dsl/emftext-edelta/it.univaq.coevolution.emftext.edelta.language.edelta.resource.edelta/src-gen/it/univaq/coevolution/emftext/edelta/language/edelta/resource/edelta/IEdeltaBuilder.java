/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta;

public interface IEdeltaBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
