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
 * A representation of the model object '<em><b>Package Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getClassesoperations <em>Classesoperations</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getPackageOperation()
 * @model abstract="true"
 * @generated
 */
public interface PackageOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Classesoperations</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classesoperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classesoperations</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getPackageOperation_Classesoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<it.univaq.coevolution.emftext.edelta.language.edelta.Class> getClassesoperations();

	/**
	 * Returns the value of the '<em><b>Setter</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getPackageOperation_Setter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setter> getSetter();

} // PackageOperation
