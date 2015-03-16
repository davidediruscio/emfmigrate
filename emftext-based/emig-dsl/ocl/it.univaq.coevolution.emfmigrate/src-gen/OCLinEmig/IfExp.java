/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.IfExp#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link OCLinEmig.IfExp#getCondition <em>Condition</em>}</li>
 *   <li>{@link OCLinEmig.IfExp#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getIfExp()
 * @model
 * @generated
 */
public interface IfExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclExpression#getIfExp2 <em>If Exp2</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(OclExpression)
	 * @see OCLinEmig.OCLinEmigPackage#getIfExp_ThenExpression()
	 * @see OCLinEmig.OclExpression#getIfExp2
	 * @model opposite="ifExp2" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getThenExpression();

	/**
	 * Sets the value of the '{@link OCLinEmig.IfExp#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclExpression#getIfExp1 <em>If Exp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OclExpression)
	 * @see OCLinEmig.OCLinEmigPackage#getIfExp_Condition()
	 * @see OCLinEmig.OclExpression#getIfExp1
	 * @model opposite="ifExp1" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getCondition();

	/**
	 * Sets the value of the '{@link OCLinEmig.IfExp#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclExpression#getIfExp3 <em>If Exp3</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(OclExpression)
	 * @see OCLinEmig.OCLinEmigPackage#getIfExp_ElseExpression()
	 * @see OCLinEmig.OclExpression#getIfExp3
	 * @model opposite="ifExp3" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getElseExpression();

	/**
	 * Sets the value of the '{@link OCLinEmig.IfExp#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(OclExpression value);

} // IfExp
