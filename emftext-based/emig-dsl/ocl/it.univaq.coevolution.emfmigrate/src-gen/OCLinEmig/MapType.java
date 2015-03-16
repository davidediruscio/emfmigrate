/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.MapType#getValueType <em>Value Type</em>}</li>
 *   <li>{@link OCLinEmig.MapType#getKeyType <em>Key Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends OclType {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclType#getMapType2 <em>Map Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(OclType)
	 * @see OCLinEmig.OCLinEmigPackage#getMapType_ValueType()
	 * @see OCLinEmig.OclType#getMapType2
	 * @model opposite="mapType2" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getValueType();

	/**
	 * Sets the value of the '{@link OCLinEmig.MapType#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(OclType value);

	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclType#getMapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' containment reference.
	 * @see #setKeyType(OclType)
	 * @see OCLinEmig.OCLinEmigPackage#getMapType_KeyType()
	 * @see OCLinEmig.OclType#getMapType
	 * @model opposite="mapType" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getKeyType();

	/**
	 * Sets the value of the '{@link OCLinEmig.MapType#getKeyType <em>Key Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' containment reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(OclType value);

} // MapType
