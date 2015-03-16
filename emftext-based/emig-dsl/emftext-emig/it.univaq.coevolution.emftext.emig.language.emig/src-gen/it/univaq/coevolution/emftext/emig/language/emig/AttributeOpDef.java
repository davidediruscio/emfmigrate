/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef#getAttributePar <em>Attribute Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getAttributeOpDef()
 * @model
 * @generated
 */
public interface AttributeOpDef extends FeatureOpDef {

	/**
	 * Returns the value of the '<em><b>Attribute Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Par</em>' containment reference.
	 * @see #setAttributePar(Attribute)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getAttributeOpDef_AttributePar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getAttributePar();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef#getAttributePar <em>Attribute Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Par</em>' containment reference.
	 * @see #getAttributePar()
	 * @generated
	 */
	void setAttributePar(Attribute value);
} // AttributeOpDef
