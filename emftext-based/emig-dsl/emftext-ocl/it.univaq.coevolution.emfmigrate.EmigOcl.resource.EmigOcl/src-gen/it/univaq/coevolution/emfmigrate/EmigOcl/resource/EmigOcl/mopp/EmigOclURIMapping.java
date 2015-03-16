/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclURIMapping
 * interface that can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclURIMapping.
 */
public class EmigOclURIMapping<ReferenceType> implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public EmigOclURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
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
