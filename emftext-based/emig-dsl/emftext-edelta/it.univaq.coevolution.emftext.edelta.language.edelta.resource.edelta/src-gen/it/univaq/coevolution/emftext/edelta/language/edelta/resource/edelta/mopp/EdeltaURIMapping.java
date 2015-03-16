/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaURIM
 * apping interface that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaURIM
 * apping.
 */
public class EdeltaURIMapping<ReferenceType> implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public EdeltaURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
