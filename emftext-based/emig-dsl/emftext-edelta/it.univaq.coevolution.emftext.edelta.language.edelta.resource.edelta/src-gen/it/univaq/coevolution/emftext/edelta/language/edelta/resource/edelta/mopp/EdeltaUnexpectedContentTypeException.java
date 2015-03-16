/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * it.univaq.coevolution.emftext.edelta.language.edelta.resource.edelta.IEdeltaOpti
 * ons.RESOURCE_CONTENT_TYPE
 */
public class EdeltaUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  EdeltaUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
