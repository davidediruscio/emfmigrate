/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Operator Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef#getParameters <em>Parameters</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef#getAtomicOperators <em>Atomic Operators</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef#getReturnType <em>Return Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorDef()
 * @model
 * @generated
 */
public interface ComplexOperatorDef extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorDef_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Atomic Operators</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomic Operators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic Operators</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorDef_AtomicOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getAtomicOperators();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getComplexOperatorDef_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

} // ComplexOperatorDef
