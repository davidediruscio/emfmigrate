/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

public class EdeltaProblem implements it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaProblem {
	
	private String message;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type;
	private it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity severity;
	private java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> quickFixes;
	
	public EdeltaProblem(String message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix>emptySet());
	}
	
	public EdeltaProblem(String message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity severity, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public EdeltaProblem(String message, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType type, it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity severity, java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType getType() {
		return type;
	}
	
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
