/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigReferenceResolverSwitch implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolverSwitch {
	
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclInstanceModelMetamodelReferenceResolver oclInstanceModelMetamodelReferenceResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclInstanceModelMetamodelReferenceResolver();
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementExpModelReferenceResolver();
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.VariableExpReferredVariableReferenceResolver();
	protected it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementModelReferenceResolver();
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclInstanceModelMetamodelReferenceResolver getOclInstanceModelMetamodelReferenceResolver() {
		return oclInstanceModelMetamodelReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementExpModelReferenceResolver getOclModelElementExpModelReferenceResolver() {
		return oclModelElementExpModelReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.VariableExpReferredVariableReferenceResolver getVariableExpReferredVariableReferenceResolver() {
		return variableExpReferredVariableReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.analysis.OclModelElementModelReferenceResolver getOclModelElementModelReferenceResolver() {
		return oclModelElementModelReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		oclInstanceModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel().isInstance(container)) {
			EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel> frr = new EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclMetamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclInstanceModelMetamodelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclInstanceModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			EmigFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration> frr = new EmigFuzzyResolveResult<be.ac.vub.simpleocl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclModel> frr = new EmigFuzzyResolveResult<be.ac.vub.simpleocl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (be.ac.vub.simpleocl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclInstanceModel_Metamodel()) {
			return oclInstanceModelMetamodelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return oclModelElementExpModelReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return variableExpReferredVariableReferenceResolver;
		}
		if (reference == be.ac.vub.simpleocl.SimpleoclPackage.eINSTANCE.getOclModelElement_Model()) {
			return oclModelElementModelReferenceResolver;
		}
		return null;
	}
	
}
