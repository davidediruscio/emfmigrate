/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl;

public interface IEmigOclBuilder {
	
	public boolean isBuildingNeeded(org.eclipse.emf.common.util.URI uri);
	
	public org.eclipse.core.runtime.IStatus build(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource resource, org.eclipse.core.runtime.IProgressMonitor monitor);
}
