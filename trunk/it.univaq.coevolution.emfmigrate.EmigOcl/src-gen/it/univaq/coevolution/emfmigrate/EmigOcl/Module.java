/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getModels <em>Models</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getModule_Name()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emfmigrate.EmigOcl.OclModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getModule_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclModel> getModels();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getModule_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclFeatureDefinition> getFeatures();

} // Module
