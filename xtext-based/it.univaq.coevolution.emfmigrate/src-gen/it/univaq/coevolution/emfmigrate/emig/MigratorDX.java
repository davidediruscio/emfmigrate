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
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getFilterDX <em>Filter DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getRewritingRule <em>Rewriting Rule</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Rewriting Rule</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorDX <em>Migrator DX</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rewriting Rule</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rewriting Rule</em>' container reference.
   * @see #setRewritingRule(RewritingRule)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getMigratorDX_RewritingRule()
   * @see it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorDX
   * @model opposite="migratorDX" transient="false"
   * @generated
   */
  RewritingRule getRewritingRule();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getRewritingRule <em>Rewriting Rule</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rewriting Rule</em>' container reference.
   * @see #getRewritingRule()
   * @generated
   */
  void setRewritingRule(RewritingRule value);

} // MigratorDX
