/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

public class EmigProblem implements it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigProblem {
	
	private String message;
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType type;
	private it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity severity;
	private java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix> quickFixes;
	
	public EmigProblem(String message, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType type, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix>emptySet());
	}
	
	public EmigProblem(String message, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType type, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity severity, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public EmigProblem(String message, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType type, it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity severity, java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType getType() {
		return type;
	}
	
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
