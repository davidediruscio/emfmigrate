/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADDREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.ADDREFERENCE#getNew <em>New</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getADDREFERENCE()
 * @model
 * @generated
 */
public interface ADDREFERENCE extends EObject
{
  /**
   * Returns the value of the '<em><b>New</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New</em>' attribute.
   * @see #setNew(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getADDREFERENCE_New()
   * @model
   * @generated
   */
  String getNew();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.ADDREFERENCE#getNew <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' attribute.
   * @see #getNew()
   * @generated
   */
  void setNew(String value);

} // ADDREFERENCE
