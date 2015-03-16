/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationLib <em>Migration Lib</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationProgr <em>Migration Progr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMyModel()
 * @model
 * @generated
 */
public interface MyModel extends EObject
{
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMyModel_MigrationLib()
   * @model containment="true"
   * @generated
   */
  MigrationLibrary getMigrationLib();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationLib <em>Migration Lib</em>}' containment reference.
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMyModel_MigrationProgr()
   * @model containment="true"
   * @generated
   */
  MigrationProgram getMigrationProgr();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MyModel#getMigrationProgr <em>Migration Progr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Migration Progr</em>' containment reference.
   * @see #getMigrationProgr()
   * @generated
   */
  void setMigrationProgr(MigrationProgram value);

} // MyModel
