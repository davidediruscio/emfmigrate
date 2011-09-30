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
 * A representation of the model object '<em><b>Complex Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.ComplexOperator#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ComplexOperator#getParams <em>Params</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ComplexOperator#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ComplexOperator#getAttributeOperations <em>Attribute Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.ComplexOperator#getReferenceOperations <em>Reference Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator()
 * @model
 * @generated
 */
public interface ComplexOperator extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ComplexOperator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator_Params()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getParams();

  /**
   * Returns the value of the '<em><b>Class Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.ClassOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Operations</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator_ClassOperations()
   * @model containment="true"
   * @generated
   */
  EList<ClassOp> getClassOperations();

  /**
   * Returns the value of the '<em><b>Attribute Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.AttributeOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Operations</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator_AttributeOperations()
   * @model containment="true"
   * @generated
   */
  EList<AttributeOp> getAttributeOperations();

  /**
   * Returns the value of the '<em><b>Reference Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.ReferenceOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Operations</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getComplexOperator_ReferenceOperations()
   * @model containment="true"
   * @generated
   */
  EList<ReferenceOp> getReferenceOperations();

} // ComplexOperator
