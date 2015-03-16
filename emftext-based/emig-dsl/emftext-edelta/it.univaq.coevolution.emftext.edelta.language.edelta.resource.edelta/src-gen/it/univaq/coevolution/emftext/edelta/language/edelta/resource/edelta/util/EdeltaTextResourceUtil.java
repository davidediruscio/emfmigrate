/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util;

/**
 * Class EdeltaTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.Edelta
 * ResourceUtil.
 */
public class EdeltaTextResourceUtil {
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource getResource(org.eclipse.core.resources.IFile file) {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaResourceUtil.getResource(file);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaResourceUtil.getResource(file, options);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource getResource(org.eclipse.emf.common.util.URI uri) {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaResourceUtil.getResource(uri);
	}
	
	@Deprecated	
	public static it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.util.EdeltaResourceUtil.getResource(uri, options);
	}
	
}
