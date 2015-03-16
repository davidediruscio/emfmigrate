/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util;

/**
 * Class EmigTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigResource
 * Util.
 */
public class EmigTextResourceUtil {
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource getResource(org.eclipse.core.resources.IFile file) {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource getResource(org.eclipse.emf.common.util.URI uri) {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emftext.emig.language.emig.resource.emig.util.EmigResourceUtil.getResource(uri, options);
	}
	
}
