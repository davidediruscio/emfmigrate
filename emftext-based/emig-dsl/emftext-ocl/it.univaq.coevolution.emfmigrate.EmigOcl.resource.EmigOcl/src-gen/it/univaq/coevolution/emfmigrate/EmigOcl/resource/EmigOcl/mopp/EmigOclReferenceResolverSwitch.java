/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclReferenceResolverSwitch implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolverSwitch {
	
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelMetamodelReferenceResolver oclModelMetamodelReferenceResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelMetamodelReferenceResolver();
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementExpModelReferenceResolver oclModelElementExpModelReferenceResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementExpModelReferenceResolver();
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.VariableExpReferredVariableReferenceResolver variableExpReferredVariableReferenceResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.VariableExpReferredVariableReferenceResolver();
	protected it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementModelReferenceResolver oclModelElementModelReferenceResolver = new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementModelReferenceResolver();
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelMetamodelReferenceResolver getOclModelMetamodelReferenceResolver() {
		return oclModelMetamodelReferenceResolver;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementExpModelReferenceResolver getOclModelElementExpModelReferenceResolver() {
		return oclModelElementExpModelReferenceResolver;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.VariableExpReferredVariableReferenceResolver getVariableExpReferredVariableReferenceResolver() {
		return variableExpReferredVariableReferenceResolver;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.analysis.OclModelElementModelReferenceResolver getOclModelElementModelReferenceResolver() {
		return oclModelElementModelReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		oclModelMetamodelReferenceResolver.setOptions(options);
		oclModelElementExpModelReferenceResolver.setOptions(options);
		variableExpReferredVariableReferenceResolver.setOptions(options);
		oclModelElementModelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModel().isInstance(container)) {
			EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> frr = new EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				oclModelMetamodelReferenceResolver.resolve(identifier, (it.univaq.coevolution.emfmigrate.EmigOcl.OclModel) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModelElementExp().isInstance(container)) {
			EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> frr = new EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementExpModelReferenceResolver.resolve(identifier, (it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElementExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getVariableExp().isInstance(container)) {
			EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration> frr = new EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.VariableDeclaration>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("referredVariable")) {
				variableExpReferredVariableReferenceResolver.resolve(identifier, (it.univaq.coevolution.emfmigrate.EmigOcl.VariableExp) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModelElement().isInstance(container)) {
			EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel> frr = new EmigOclFuzzyResolveResult<it.univaq.coevolution.emfmigrate.EmigOcl.OclModel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				oclModelElementModelReferenceResolver.resolve(identifier, (it.univaq.coevolution.emfmigrate.EmigOcl.OclModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModel_Metamodel()) {
			return oclModelMetamodelReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModelElementExp_Model()) {
			return oclModelElementExpModelReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getVariableExp_ReferredVariable()) {
			return variableExpReferredVariableReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage.eINSTANCE.getOclModelElement_Model()) {
			return oclModelElementModelReferenceResolver;
		}
		return null;
	}
	
}
