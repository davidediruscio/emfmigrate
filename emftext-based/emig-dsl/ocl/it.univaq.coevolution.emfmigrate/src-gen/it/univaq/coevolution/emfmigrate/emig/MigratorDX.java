/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator DX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getFilterDX <em>Filter DX</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorDX()
 * @model
 * @generated
 */
public interface MigratorDX extends Migrator
{
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorDX_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element DX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element DX</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element DX</em>' reference.
   * @see #setElementDX(EClass)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorDX_ElementDX()
   * @model
   * @generated
   */
  EClass getElementDX();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getElementDX <em>Element DX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element DX</em>' reference.
   * @see #getElementDX()
   * @generated
   */
  void setElementDX(EClass value);

  /**
   * Returns the value of the '<em><b>Filter DX</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter DX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter DX</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorDX_FilterDX()
   * @model containment="true"
   * @generated
   */
  EList<FilterMigrator> getFilterDX();

} // MigratorDX
