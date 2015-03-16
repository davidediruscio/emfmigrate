/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig;

public interface IEmigProblem {
	public String getMessage();
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemSeverity getSeverity();
	public it.univaq.coevolution.emftext.emig.language.emig.resource.emig.EmigEProblemType getType();
	public java.util.Collection<it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigQuickFix> getQuickFixes();
}
