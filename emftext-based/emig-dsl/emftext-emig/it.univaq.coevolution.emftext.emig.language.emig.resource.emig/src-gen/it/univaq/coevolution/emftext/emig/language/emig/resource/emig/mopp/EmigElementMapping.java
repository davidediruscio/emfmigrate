/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigElementMappi
 * ng interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class EmigElementMapping<ReferenceType> implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public EmigElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
