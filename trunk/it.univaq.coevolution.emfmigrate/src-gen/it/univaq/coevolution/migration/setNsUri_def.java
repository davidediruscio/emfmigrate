/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>set Ns Uri def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.setNsUri_def#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.setNsUri_def#getNsUri <em>Ns Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsUri_def()
 * @model
 * @generated
 */
public interface setNsUri_def extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsUri_def_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.setNsUri_def#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Ns Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns Uri</em>' attribute.
   * @see #setNsUri(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getsetNsUri_def_NsUri()
   * @model
   * @generated
   */
  String getNsUri();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.setNsUri_def#getNsUri <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns Uri</em>' attribute.
   * @see #getNsUri()
   * @generated
   */
  void setNsUri(String value);

} // setNsUri_def
