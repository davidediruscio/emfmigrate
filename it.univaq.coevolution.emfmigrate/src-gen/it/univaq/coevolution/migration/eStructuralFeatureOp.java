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
 * A representation of the model object '<em><b>eStructural Feature Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#geteStructuralFeatureOp()
 * @model
 * @generated
 */
public interface eStructuralFeatureOp extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(EObject)
   * @see it.univaq.coevolution.migration.MigrationPackage#geteStructuralFeatureOp_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.eStructuralFeatureOp#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(EObject value);

  /**
   * Returns the value of the '<em><b>Setters</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.FeatureSetters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setters</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#geteStructuralFeatureOp_Setters()
   * @model containment="true"
   * @generated
   */
  EList<FeatureSetters> getSetters();

  /**
   * Returns the value of the '<em><b>Complex</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.CallOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#geteStructuralFeatureOp_Complex()
   * @model containment="true"
   * @generated
   */
  EList<CallOperator> getComplex();

} // eStructuralFeatureOp
