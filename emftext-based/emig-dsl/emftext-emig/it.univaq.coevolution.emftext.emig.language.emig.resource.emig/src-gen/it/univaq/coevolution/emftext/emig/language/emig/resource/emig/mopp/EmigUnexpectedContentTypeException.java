/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package it.univaq.coevolution.emftext.emig.language.emig.resource.emig.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * it.univaq.coevolution.emftext.emig.language.emig.resource.emig.IEmigOptions.RESO
 * URCE_CONTENT_TYPE
 */
public class EmigUnexpectedContentTypeException extends org.antlr.runtime3_3_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  EmigUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
