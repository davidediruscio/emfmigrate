/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar;

public class EmigContainment extends it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigTerminal {
	
	public EmigContainment(org.eclipse.emf.ecore.EStructuralFeature feature, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.grammar.EmigCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
	}
	
	public String toString() {
		return getFeature().getName();
	}
	
}
