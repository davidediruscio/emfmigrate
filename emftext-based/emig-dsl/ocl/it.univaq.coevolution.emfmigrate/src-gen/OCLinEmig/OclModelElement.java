/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.OclModelElement#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getOclModelElement()
 * @model
 * @generated
 */
public interface OclModelElement extends OclType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(OclModel)
	 * @see OCLinEmig.OCLinEmigPackage#getOclModelElement_Model()
	 * @see OCLinEmig.OclModel#getElements
	 * @model opposite="elements" required="true" ordered="false"
	 * @generated
	 */
	OclModel getModel();

	/**
	 * Sets the value of the '{@link OCLinEmig.OclModelElement#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(OclModel value);

} // OclModelElement
