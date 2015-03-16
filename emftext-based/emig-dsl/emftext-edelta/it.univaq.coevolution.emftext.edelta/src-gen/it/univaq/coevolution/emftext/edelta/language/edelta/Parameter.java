/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.ecore.EDataType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getRefType <em>Ref Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Ref Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Type</em>' containment reference.
	 * @see #setRefType(Type)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getParameter_RefType()
	 * @model containment="true"
	 * @generated
	 */
	Type getRefType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter#getRefType <em>Ref Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Type</em>' containment reference.
	 * @see #getRefType()
	 * @generated
	 */
	void setRefType(Type value);

} // Parameter
