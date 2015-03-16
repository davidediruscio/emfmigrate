/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaRefe
 * renceResolveResult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class EdeltaReferenceResolveResult<ReferenceType> implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> quickFixes;
	
	public EdeltaReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp.EdeltaURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
