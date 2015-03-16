/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getLetExp <em>Let Exp</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getEq <em>Eq</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocalVariable()
 * @model
 * @generated
 */
public interface LocalVariable extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Let Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Let Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Let Exp</em>' container reference.
	 * @see #setLetExp(LetExp)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocalVariable_LetExp()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.LetExp#getVariable
	 * @model opposite="variable" transient="false" ordered="false"
	 * @generated
	 */
	LetExp getLetExp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getLetExp <em>Let Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Let Exp</em>' container reference.
	 * @see #getLetExp()
	 * @generated
	 */
	void setLetExp(LetExp value);

	/**
	 * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getInitializedVariable <em>Initialized Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Expression</em>' containment reference.
	 * @see #setInitExpression(OclExpression)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocalVariable_InitExpression()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclExpression#getInitializedVariable
	 * @model opposite="initializedVariable" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclExpression getInitExpression();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getInitExpression <em>Init Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Expression</em>' containment reference.
	 * @see #getInitExpression()
	 * @generated
	 */
	void setInitExpression(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Base Exp</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Exp</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Exp</em>' container reference.
	 * @see #setBaseExp(IterateExp)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocalVariable_BaseExp()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.IterateExp#getResult
	 * @model opposite="result" transient="false" ordered="false"
	 * @generated
	 */
	IterateExp getBaseExp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getBaseExp <em>Base Exp</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Exp</em>' container reference.
	 * @see #getBaseExp()
	 * @generated
	 */
	void setBaseExp(IterateExp value);

	/**
	 * Returns the value of the '<em><b>Eq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eq</em>' attribute.
	 * @see #setEq(String)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocalVariable_Eq()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.String" required="true"
	 * @generated
	 */
	String getEq();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocalVariable#getEq <em>Eq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eq</em>' attribute.
	 * @see #getEq()
	 * @generated
	 */
	void setEq(String value);

} // LocalVariable
