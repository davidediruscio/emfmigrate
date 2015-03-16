/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class EdeltaExpectedCsString extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaKeyword keyword;
	
	public EdeltaExpectedCsString(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof EdeltaExpectedCsString) {
			return getValue().equals(((EdeltaExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
