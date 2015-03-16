/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import be.ac.vub.simpleocl.OclInstanceModel;
import be.ac.vub.simpleocl.OclModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getModel <em>Model</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getDelta <em>Delta</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getMigrationProgram()
 * @model
 * @generated
 */
public interface MigrationProgram extends MigrationLibrary {
	/**
	 * Returns the value of the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' attribute.
	 * @see #setDelta(String)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getMigrationProgram_Delta()
	 * @model required="true"
	 * @generated
	 */
	String getDelta();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getDelta <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta</em>' attribute.
	 * @see #getDelta()
	 * @generated
	 */
	void setDelta(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(OclInstanceModel)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getMigrationProgram_Model()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclInstanceModel getModel();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.MigrationProgram#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(OclInstanceModel value);

} // MigrationProgram
