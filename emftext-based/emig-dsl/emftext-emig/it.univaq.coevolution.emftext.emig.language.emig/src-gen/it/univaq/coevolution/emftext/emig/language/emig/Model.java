/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Model#getMigrationLib <em>Migration Lib</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Model#getMigrationProgr <em>Migration Progr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Migration Lib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Lib</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Lib</em>' containment reference.
	 * @see #setMigrationLib(MigrationLibrary)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getModel_MigrationLib()
	 * @model containment="true"
	 * @generated
	 */
	MigrationLibrary getMigrationLib();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Model#getMigrationLib <em>Migration Lib</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Lib</em>' containment reference.
	 * @see #getMigrationLib()
	 * @generated
	 */
	void setMigrationLib(MigrationLibrary value);

	/**
	 * Returns the value of the '<em><b>Migration Progr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Progr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Progr</em>' containment reference.
	 * @see #setMigrationProgr(MigrationProgram)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getModel_MigrationProgr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MigrationProgram getMigrationProgr();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Model#getMigrationProgr <em>Migration Progr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Progr</em>' containment reference.
	 * @see #getMigrationProgr()
	 * @generated
	 */
	void setMigrationProgr(MigrationProgram value);

} // Model
