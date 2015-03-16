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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getPackageoperations <em>Packageoperations</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getModule <em>Module</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Packageoperations</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packageoperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packageoperations</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getModel_Packageoperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<it.univaq.coevolution.emftext.edelta.language.edelta.Package> getPackageoperations();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(Module)
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getModel_Module()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.edelta.language.edelta.Model#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getModel_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDatatypes();

} // Model
