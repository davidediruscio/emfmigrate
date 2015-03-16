/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getOpDef()
 * @model abstract="true"
 * @generated
 */
public interface OpDef extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Setters</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setters</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getOpDef_Setters()
	 * @model containment="true"
	 * @generated
	 */
	EList<SetterDef> getSetters();

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see #setOp(String)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getOpDef_Op()
	 * @model required="true"
	 * @generated
	 */
	String getOp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.OpDef#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(String value);

} // OpDef
