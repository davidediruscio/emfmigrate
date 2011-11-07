/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclTokenStyleInformationProvider {
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("NOTOP".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("BOOLOP".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("INTOP".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x40}, null, true, false, false, false);
		}
		if ("COMMENT".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x53, 0x87, 0x6D}, null, false, false, false, false);
		}
		if ("FLOAT".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("INTEGER".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("STRING".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("STRINGTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("BOOLEANTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("INTEGERTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("REALTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("BAGTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("ORDEREDSETTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("SEQUENCETYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("SETTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("OCLANYTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("TUPLETYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("MAPTYPE".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xC0, 0x00}, null, false, false, false, false);
		}
		if ("true".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
		}
		if ("false".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x00, 0xD0, 0xFF}, null, false, false, false, false);
		}
		if ("module".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("models".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("def".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("context".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("super".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("self".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Bag".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OrderedSet".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Sequence".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Set".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Tuple".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Map".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("OclUndefined".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("iterate".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("let".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("in".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("if".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("then".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("else".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("endif".equals(tokenName)) {
			return new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		return null;
	}
	
}
