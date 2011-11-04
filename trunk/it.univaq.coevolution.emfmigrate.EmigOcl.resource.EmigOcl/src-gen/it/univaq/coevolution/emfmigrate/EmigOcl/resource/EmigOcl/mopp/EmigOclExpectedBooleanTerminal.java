/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class EmigOclExpectedBooleanTerminal extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclAbstractExpectedElement {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclBooleanTerminal booleanTerminal;
	
	public EmigOclExpectedBooleanTerminal(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof EmigOclExpectedBooleanTerminal) {
			return getFeature().equals(((EmigOclExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
