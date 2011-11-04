/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util;

/**
 * Class EmigOclTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclResourceUt
 * il.
 */
public class EmigOclTextResourceUtil {
	
	@Deprecated	
	public static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource getResource(org.eclipse.core.resources.IFile file) {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource getResource(org.eclipse.emf.common.util.URI uri) {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.util.EmigOclResourceUtil.getResource(uri, options);
	}
	
}
