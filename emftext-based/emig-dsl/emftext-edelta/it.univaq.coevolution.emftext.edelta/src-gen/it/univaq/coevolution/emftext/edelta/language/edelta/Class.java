/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Class#getClassOp <em>Class Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends NamedElement, Type {
	/**
	 * Returns the value of the '<em><b>Class Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Op</em>' containment reference.
	 * @see #setClassOp(ClassOperation)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getClass_ClassOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ClassOperation getClassOp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Class#getClassOp <em>Class Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Op</em>' containment reference.
	 * @see #getClassOp()
	 * @generated
	 */
	void setClassOp(ClassOperation value);

} // Class
