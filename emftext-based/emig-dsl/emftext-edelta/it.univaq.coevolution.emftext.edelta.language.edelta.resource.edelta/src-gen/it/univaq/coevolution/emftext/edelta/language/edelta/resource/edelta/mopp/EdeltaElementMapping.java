/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaElem
 * entMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class EdeltaElementMapping<ReferenceType> implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public EdeltaElementMapping(String identifier, ReferenceType target, String warning) {
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
