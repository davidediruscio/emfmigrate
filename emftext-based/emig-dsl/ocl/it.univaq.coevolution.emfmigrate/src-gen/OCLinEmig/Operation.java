/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.Operation#getName <em>Name</em>}</li>
 *   <li>{@link OCLinEmig.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link OCLinEmig.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link OCLinEmig.Operation#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends OclFeature {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see OCLinEmig.OCLinEmigPackage#getOperation_Name()
	 * @model unique="false" dataType="OCLinEmig.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OCLinEmig.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link OCLinEmig.Parameter}.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.Parameter#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see OCLinEmig.OCLinEmigPackage#getOperation_Parameters()
	 * @see OCLinEmig.Parameter#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(OclType)
	 * @see OCLinEmig.OCLinEmigPackage#getOperation_ReturnType()
	 * @see OCLinEmig.OclType#getOperation
	 * @model opposite="operation" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getReturnType();

	/**
	 * Sets the value of the '{@link OCLinEmig.Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(OclType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclExpression#getOwningOperation <em>Owning Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see OCLinEmig.OCLinEmigPackage#getOperation_Body()
	 * @see OCLinEmig.OclExpression#getOwningOperation
	 * @model opposite="owningOperation" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link OCLinEmig.Operation#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

} // Operation
