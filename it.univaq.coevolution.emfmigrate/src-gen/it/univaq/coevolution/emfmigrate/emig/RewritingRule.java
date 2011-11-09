/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewriting Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorSX <em>Migrator SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.RewritingRule#getMigratorDX <em>Migrator DX</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getRewritingRule()
 * @model
 * @generated
 */
public interface RewritingRule extends LocatedElement
{
  /**
   * Returns the value of the '<em><b>Migrator SX</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.MigratorSX}.
   * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.emig.MigratorSX#getRewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrator SX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrator SX</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getRewritingRule_MigratorSX()
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorSX#getRewritingRule
   * @model opposite="rewritingRule" containment="true"
   * @generated
   */
  EList<MigratorSX> getMigratorSX();

  /**
   * Returns the value of the '<em><b>Migrator DX</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.MigratorDX}.
   * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.emig.MigratorDX#getRewritingRule <em>Rewriting Rule</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migrator DX</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migrator DX</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getRewritingRule_MigratorDX()
   * @see it.univaq.coevolution.emfmigrate.emig.MigratorDX#getRewritingRule
   * @model opposite="rewritingRule" containment="true"
   * @generated
   */
  EList<MigratorDX> getMigratorDX();

} // RewritingRule
