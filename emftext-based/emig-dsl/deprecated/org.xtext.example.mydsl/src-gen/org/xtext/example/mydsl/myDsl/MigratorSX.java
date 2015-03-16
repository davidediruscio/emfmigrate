/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migrator SX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigratorSX#getElementSX <em>Element SX</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigratorSX#getFilterSX <em>Filter SX</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorSX()
 * @model
 * @generated
 */
public interface MigratorSX extends Migrator
{
  /**
   * Returns the value of the '<em><b>Element SX</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element SX</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element SX</em>' reference.
   * @see #setElementSX(EClass)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorSX_ElementSX()
   * @model
   * @generated
   */
  EClass getElementSX();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigratorSX#getElementSX <em>Element SX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element SX</em>' reference.
   * @see #getElementSX()
   * @generated
   */
  void setElementSX(EClass value);

  /**
   * Returns the value of the '<em><b>Filter SX</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.FilterMigrator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter SX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter SX</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorSX_FilterSX()
   * @model containment="true"
   * @generated
   */
  EList<FilterMigrator> getFilterSX();

} // MigratorSX
