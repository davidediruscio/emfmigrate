/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.ReferenceOp#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ReferenceOp#getCHANGE_op <em>CHANGE op</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getReferenceOp()
 * @model
 * @generated
 */
public interface ReferenceOp extends eStructuralFeatureOp
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(EReference)
   * @see it.univaq.coevolution.migration.MigrationPackage#getReferenceOp_Var()
   * @model containment="true"
   * @generated
   */
  EReference getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ReferenceOp#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EReference value);

  /**
   * Returns the value of the '<em><b>CHANGE op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>CHANGE op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>CHANGE op</em>' containment reference.
   * @see #setCHANGE_op(CHANGEREFERENCE)
   * @see it.univaq.coevolution.migration.MigrationPackage#getReferenceOp_CHANGE_op()
   * @model containment="true"
   * @generated
   */
  CHANGEREFERENCE getCHANGE_op();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ReferenceOp#getCHANGE_op <em>CHANGE op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>CHANGE op</em>' containment reference.
   * @see #getCHANGE_op()
   * @generated
   */
  void setCHANGE_op(CHANGEREFERENCE value);

} // ReferenceOp
