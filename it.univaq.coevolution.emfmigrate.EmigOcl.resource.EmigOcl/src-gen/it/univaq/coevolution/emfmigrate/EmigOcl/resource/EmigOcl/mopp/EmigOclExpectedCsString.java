/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class EmigOclExpectedCsString extends it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclAbstractExpectedElement {
	
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclKeyword keyword;
	
	public EmigOclExpectedCsString(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.grammar.EmigOclKeyword keyword) {
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
		if (o instanceof EmigOclExpectedCsString) {
			return getValue().equals(((EmigOclExpectedCsString) o).getValue());
		}
		return false;
	}
	
}
