/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getReferences <em>References</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ClassOp#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp()
 * @model
 * @generated
 */
public interface ClassOp extends EObject
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
   * @see #setVar(EClass)
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_Var()
   * @model containment="true"
   * @generated
   */
  EClass getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ClassOp#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EClass value);

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
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ClassOp#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(EObject value);

  /**
   * Returns the value of the '<em><b>Setters</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.classSetter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setters</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_Setters()
   * @model containment="true"
   * @generated
   */
  EList<classSetter> getSetters();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.AttributeOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<AttributeOp> getAttributes();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.ReferenceOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_References()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceOp> getReferences();

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
   * @see it.univaq.coevolution.migration.MigrationPackage#getClassOp_Complex()
   * @model containment="true"
   * @generated
   */
  EList<CallOperator> getComplex();

} // ClassOp
