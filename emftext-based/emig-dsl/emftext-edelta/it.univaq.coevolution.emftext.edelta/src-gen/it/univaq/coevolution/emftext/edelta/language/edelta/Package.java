/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Package#getPackageOp <em>Package Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, Type {
	/**
	 * Returns the value of the '<em><b>Package Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Op</em>' containment reference.
	 * @see #setPackageOp(PackageOperation)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getPackage_PackageOp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PackageOperation getPackageOp();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Package#getPackageOp <em>Package Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Op</em>' containment reference.
	 * @see #getPackageOp()
	 * @generated
	 */
	void setPackageOp(PackageOperation value);

} // Package
