/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class EmigExpectedCsString extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp.EmigAbstractExpectedElement {
	
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword keyword;
	
	public EmigExpectedCsString(it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigKeyword keyword) {
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
		if (o instanceof EmigExpectedCsString) {
			return getValue().equals(((EmigExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
