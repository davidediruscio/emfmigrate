/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>set Ns Prefix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.setNsPrefix#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.setNsPrefix#getNsPrefix <em>Ns Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsPrefix()
 * @model
 * @generated
 */
public interface setNsPrefix extends EObject
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsPrefix_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.setNsPrefix#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns Prefix</em>' attribute.
   * @see #setNsPrefix(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsPrefix_NsPrefix()
   * @model
   * @generated
   */
  String getNsPrefix();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.setNsPrefix#getNsPrefix <em>Ns Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns Prefix</em>' attribute.
   * @see #getNsPrefix()
   * @generated
   */
  void setNsPrefix(String value);

} // setNsPrefix
