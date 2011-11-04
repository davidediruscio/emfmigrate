/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A basic implementation of the
 * it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResol
 * veResult interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class EmigOclReferenceResolveResult<ReferenceType> implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> quickFixes;
	
	public EmigOclReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp.EmigOclURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
