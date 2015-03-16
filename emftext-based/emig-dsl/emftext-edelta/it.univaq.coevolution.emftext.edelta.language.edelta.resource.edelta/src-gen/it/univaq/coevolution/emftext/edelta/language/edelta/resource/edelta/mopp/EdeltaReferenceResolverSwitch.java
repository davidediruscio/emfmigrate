/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaReferenceResolverSwitch implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolverSwitch {
	
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changePackageRefReferenceResolver changePackageRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changePackageRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deletePackageRefReferenceResolver deletePackageRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deletePackageRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeClassRefReferenceResolver changeClassRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeClassRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteClassRefReferenceResolver deleteClassRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteClassRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteAttributeRefReferenceResolver deleteAttributeRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteAttributeRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeAttributeRefReferenceResolver changeAttributeRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeAttributeRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteReferenceRefReferenceResolver deleteReferenceRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteReferenceRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeReferenceRefReferenceResolver changeReferenceRefReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeReferenceRefReferenceResolver();
	protected it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.ParameterTypeReferenceResolver parameterTypeReferenceResolver = new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.ParameterTypeReferenceResolver();
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changePackageRefReferenceResolver getchangePackageRefReferenceResolver() {
		return changePackageRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deletePackageRefReferenceResolver getdeletePackageRefReferenceResolver() {
		return deletePackageRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeClassRefReferenceResolver getchangeClassRefReferenceResolver() {
		return changeClassRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteClassRefReferenceResolver getdeleteClassRefReferenceResolver() {
		return deleteClassRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteAttributeRefReferenceResolver getdeleteAttributeRefReferenceResolver() {
		return deleteAttributeRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeAttributeRefReferenceResolver getchangeAttributeRefReferenceResolver() {
		return changeAttributeRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.deleteReferenceRefReferenceResolver getdeleteReferenceRefReferenceResolver() {
		return deleteReferenceRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.changeReferenceRefReferenceResolver getchangeReferenceRefReferenceResolver() {
		return changeReferenceRefReferenceResolver;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.analysis.ParameterTypeReferenceResolver getParameterTypeReferenceResolver() {
		return parameterTypeReferenceResolver;
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		changePackageRefReferenceResolver.setOptions(options);
		deletePackageRefReferenceResolver.setOptions(options);
		changeClassRefReferenceResolver.setOptions(options);
		deleteClassRefReferenceResolver.setOptions(options);
		deleteAttributeRefReferenceResolver.setOptions(options);
		changeAttributeRefReferenceResolver.setOptions(options);
		deleteReferenceRefReferenceResolver.setOptions(options);
		changeReferenceRefReferenceResolver.setOptions(options);
		parameterTypeReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangePackage().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Package> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Package>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				changePackageRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.changePackage) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeletePackage().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Package> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Package>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				deletePackageRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.deletePackage) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeClass().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Class> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Class>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				changeClassRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.changeClass) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteClass().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Class> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Class>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				deleteClassRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteAttribute().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Attribute> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				deleteAttributeRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.deleteAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeAttribute().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Attribute> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Attribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				changeAttributeRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteReference().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Reference> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Reference>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				deleteReferenceRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.deleteReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeReference().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Reference> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Reference>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("ref")) {
				changeReferenceRefReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.changeReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getParameter().isInstance(container)) {
			EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Type> frr = new EdeltaFuzzyResolveResult<it.univaq.coevolution.emftext.edelta.language.edelta.Type>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("type")) {
				parameterTypeReferenceResolver.resolve(identifier, (it.univaq.coevolution.emftext.edelta.language.edelta.Parameter) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangePackage_Ref()) {
			return changePackageRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeletePackage_Ref()) {
			return deletePackageRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeClass_Ref()) {
			return changeClassRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteClass_Ref()) {
			return deleteClassRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteAttribute_Ref()) {
			return deleteAttributeRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeAttribute_Ref()) {
			return changeAttributeRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getdeleteReference_Ref()) {
			return deleteReferenceRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getchangeReference_Ref()) {
			return changeReferenceRefReferenceResolver;
		}
		if (reference == it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage.eINSTANCE.getParameter_Type()) {
			return parameterTypeReferenceResolver;
		}
		return null;
	}
	
}
