/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Reference#getFeaturesOp <em>Features Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature {
	/**
	 * Returns the value of the '<em><b>Features Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Op</em>' containment reference.
	 * @see #setFeaturesOp(ReferenceOperation)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getReference_FeaturesOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReferenceOperation getFeaturesOp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Reference#getFeaturesOp <em>Features Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features Op</em>' containment reference.
	 * @see #getFeaturesOp()
	 * @generated
	 */
	void setFeaturesOp(ReferenceOperation value);

} // Reference
