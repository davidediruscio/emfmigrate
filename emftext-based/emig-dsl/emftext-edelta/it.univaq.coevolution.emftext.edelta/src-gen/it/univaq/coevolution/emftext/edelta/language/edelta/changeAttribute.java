/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>change Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getchangeAttribute()
 * @model
 * @generated
 */
public interface changeAttribute extends AttributeOperation {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Attribute)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getchangeAttribute_Ref()
	 * @model
	 * @generated
	 */
	Attribute getRef();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Attribute value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getchangeAttribute_Ext()
	 * @model required="true"
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.changeAttribute#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

} // changeAttribute
