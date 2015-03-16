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
 * A representation of the model object '<em><b>Migrator DX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigratorDX#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigratorDX#getFilterDX <em>Filter DX</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorDX()
 * @model
 * @generated
 */
public interface MigratorDX extends Migrator
{
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorDX_ElementDX()
   * @model
   * @generated
   */
  EClass getElementDX();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigratorDX#getElementDX <em>Element DX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element DX</em>' reference.
   * @see #getElementDX()
   * @generated
   */
  void setElementDX(EClass value);

  /**
   * Returns the value of the '<em><b>Filter DX</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.FilterMigrator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter DX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter DX</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigratorDX_FilterDX()
   * @model containment="true"
   * @generated
   */
  EList<FilterMigrator> getFilterDX();

} // MigratorDX
