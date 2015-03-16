/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getSetter()
 * @model
 * @generated
 */
public interface Setter extends EObject {
	/**
	 * Returns the value of the '<em><b>Metafeature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metafeature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metafeature</em>' attribute.
	 * @see #setMetafeature(String)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getSetter_Metafeature()
	 * @model required="true"
	 * @generated
	 */
	String getMetafeature();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getMetafeature <em>Metafeature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metafeature</em>' attribute.
	 * @see #getMetafeature()
	 * @generated
	 */
	void setMetafeature(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(SetterValue)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getSetter_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SetterValue getValue();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SetterValue value);

} // Setter
