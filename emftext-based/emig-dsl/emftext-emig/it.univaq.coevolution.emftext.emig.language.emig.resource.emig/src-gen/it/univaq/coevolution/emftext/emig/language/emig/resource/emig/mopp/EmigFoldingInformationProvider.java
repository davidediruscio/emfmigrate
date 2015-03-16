/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigFoldingInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.eclipse.emf.ecore.EClass[] {
			it.univaq.coevolution.emftext.emig.language.emig.EmigPackage.eINSTANCE.getRule(),
			be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclFeatureDefinition(),
		};
	}
	
}
