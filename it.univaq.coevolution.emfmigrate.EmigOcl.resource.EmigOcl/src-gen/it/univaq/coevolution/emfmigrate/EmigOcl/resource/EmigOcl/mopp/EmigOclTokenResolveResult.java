/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.mopp;

/**
 * A basic implementation of the ITokenResolveResult interface.
 */
public class EmigOclTokenResolveResult implements it.univaq.coevolution.emfmigrate.EmigOcl.resource.EmigOcl.IEmigOclTokenResolveResult {
	
	private String errorMessage;
	private Object resolvedToken;
	
	public EmigOclTokenResolveResult() {
		super();
		clear();
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Object getResolvedToken() {
		return resolvedToken;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void setResolvedToken(Object resolvedToken) {
		this.resolvedToken = resolvedToken;
	}
	
	public void clear() {
		errorMessage = "Can't resolve token.";
		resolvedToken = null;
	}
	
}
