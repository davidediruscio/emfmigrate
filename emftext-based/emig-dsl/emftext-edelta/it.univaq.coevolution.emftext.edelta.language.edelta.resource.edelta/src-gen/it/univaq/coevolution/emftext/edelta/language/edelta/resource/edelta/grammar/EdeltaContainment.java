/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar;

public class EdeltaContainment extends it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaTerminal {
	
	public EdeltaContainment(org.eclipse.emf.ecore.EStructuralFeature feature, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.grammar.EdeltaCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
