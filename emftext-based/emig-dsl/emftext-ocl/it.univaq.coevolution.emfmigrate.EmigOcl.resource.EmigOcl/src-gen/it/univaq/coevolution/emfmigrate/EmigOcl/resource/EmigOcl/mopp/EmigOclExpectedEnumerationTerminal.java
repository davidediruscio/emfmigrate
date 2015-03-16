/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A representation for a range in a document where an enumeration literal (i.e.,
 * a set of static strings) is expected.
 */
public class EmigOclExpectedEnumerationTerminal extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclAbstractExpectedElement {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclEnumerationTerminal enumerationTerminal;
	
	public EmigOclExpectedEnumerationTerminal(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclEnumerationTerminal enumerationTerminal) {
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
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclEnumerationTerminal getEnumerationTerminal() {
		return this.enumerationTerminal;
	}
}
