/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta;

public interface IEdeltaProblem {
	public String getMessage();
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemSeverity getSeverity();
	public it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.EdeltaEProblemType getType();
	public java.util.Collection<it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaQuickFix> getQuickFixes();
}
