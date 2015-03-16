/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class EmigExpectedEnumerationTerminal extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal enumerationTerminal;
	
	public EmigExpectedEnumerationTerminal(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal enumerationTerminal) {
		super(enumerationTerminal.getMetaclass());
		this.enumerationTerminal = enumerationTerminal;
	}
	
	public java.util.Set<String> getTokenNames() {
		// EnumerationTerminals are associated with multiple tokens, one for each literal
		// that was mapped to a string
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>();
		java.util.Map<String, String> mapping = enumerationTerminal.getLiteralMapping();
		for (String literalName : mapping.keySet()) {
			String text = mapping.get(literalName);
			if (text != null && !"".equals(text)) {
				tokenNames.add("'" + text + "'");
			}
		}
		return tokenNames;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
