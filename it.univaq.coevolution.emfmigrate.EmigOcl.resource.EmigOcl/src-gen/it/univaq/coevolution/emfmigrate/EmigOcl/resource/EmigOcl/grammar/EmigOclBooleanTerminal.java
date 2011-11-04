/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class EmigOclBooleanTerminal extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public EmigOclBooleanTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String trueLiteral, String falseLiteral, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
}
