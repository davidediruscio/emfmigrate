/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

public class EmigOclProblem implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclProblem {
	
	private String message;
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType type;
	private it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity severity;
	private java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> quickFixes;
	
	public EmigOclProblem(String message, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType type, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix>emptySet());
	}
	
	public EmigOclProblem(String message, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType type, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity severity, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public EmigOclProblem(String message, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType type, it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity severity, java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemType getType() {
		return type;
	}
	
	public it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.EmigOclEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
