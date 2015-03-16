/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class EdeltaExpectedBooleanTerminal extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaBooleanTerminal booleanTerminal;
	
	public EdeltaExpectedBooleanTerminal(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof EdeltaExpectedBooleanTerminal) {
			return getFeature().equals(((EdeltaExpectedBooleanTerminal) o).getFeature());
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
