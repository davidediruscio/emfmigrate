/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.CallOperator#getFun <em>Fun</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.CallOperator#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getCallOperator()
 * @model
 * @generated
 */
public interface CallOperator extends EObject
{
  /**
   * Returns the value of the '<em><b>Fun</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fun</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fun</em>' reference.
   * @see #setFun(ComplexOperator)
   * @see it.univaq.coevolution.migration.MigrationPackage#getCallOperator_Fun()
   * @model
   * @generated
   */
  ComplexOperator getFun();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.CallOperator#getFun <em>Fun</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fun</em>' reference.
   * @see #getFun()
   * @generated
   */
  void setFun(ComplexOperator value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getCallOperator_Args()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArgs();

} // CallOperator
