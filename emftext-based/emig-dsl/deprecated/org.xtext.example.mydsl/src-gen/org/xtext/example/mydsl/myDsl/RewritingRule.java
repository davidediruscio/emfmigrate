/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewriting Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorsSX <em>Migrators SX</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorDX <em>Migrator DX</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RewritingRule#getMigratorSX <em>Migrator SX</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRewritingRule()
 * @model
 * @generated
 */
public interface RewritingRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Migrators SX</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MigratorSX}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrators SX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrators SX</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRewritingRule_MigratorsSX()
   * @model containment="true"
   * @generated
   */
  EList<MigratorSX> getMigratorsSX();

  /**
   * Returns the value of the '<em><b>Migrator DX</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MigratorDX}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrator DX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrator DX</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRewritingRule_MigratorDX()
   * @model containment="true"
   * @generated
   */
  EList<MigratorDX> getMigratorDX();

  /**
   * Returns the value of the '<em><b>Migrator SX</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.MigratorSX}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrator SX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrator SX</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRewritingRule_MigratorSX()
   * @model containment="true"
   * @generated
   */
  EList<MigratorSX> getMigratorSX();

} // RewritingRule
