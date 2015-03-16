/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getClassesOp <em>Classes Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getPackagePar <em>Package Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getPackageOpDef()
 * @model
 * @generated
 */
public interface PackageOpDef extends OpDef {
	/**
	 * Returns the value of the '<em><b>Classes Op</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes Op</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getPackageOpDef_ClassesOp()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassOpDef> getClassesOp();

	/**
	 * Returns the value of the '<em><b>Package Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Par</em>' containment reference.
	 * @see #setPackagePar(it.univaq.coevolution.emftext.emig.language.emig.Package)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getPackageOpDef_PackagePar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	it.univaq.coevolution.emftext.emig.language.emig.Package getPackagePar();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef#getPackagePar <em>Package Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Par</em>' containment reference.
	 * @see #getPackagePar()
	 * @generated
	 */
	void setPackagePar(it.univaq.coevolution.emftext.emig.language.emig.Package value);

} // PackageOpDef
