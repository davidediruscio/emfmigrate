/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Operator Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorCall()
 * @model
 * @generated
 */
public interface ComplexOperatorCall extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(ComplexOperatorDef)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorCall_Ref()
	 * @model required="true"
	 * @generated
	 */
	ComplexOperatorDef getRef();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(ComplexOperatorDef value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorCall_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArguments();

} // ComplexOperatorCall
