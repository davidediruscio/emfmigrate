/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef#getReferencePar <em>Reference Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getReferenceOpDef()
 * @model
 * @generated
 */
public interface ReferenceOpDef extends FeatureOpDef {

	/**
	 * Returns the value of the '<em><b>Reference Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Par</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Par</em>' containment reference.
	 * @see #setReferencePar(Reference)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getReferenceOpDef_ReferencePar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReferencePar();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef#getReferencePar <em>Reference Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Par</em>' containment reference.
	 * @see #getReferencePar()
	 * @generated
	 */
	void setReferencePar(Reference value);
} // ReferenceOpDef
