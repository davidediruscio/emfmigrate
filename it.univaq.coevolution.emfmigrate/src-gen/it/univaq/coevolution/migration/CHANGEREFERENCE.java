/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CHANGEREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.CHANGEREFERENCE#getRefRef <em>Ref Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getCHANGEREFERENCE()
 * @model
 * @generated
 */
public interface CHANGEREFERENCE extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Ref</em>' reference.
   * @see #setRefRef(EReference)
   * @see it.univaq.coevolution.migration.MigrationPackage#getCHANGEREFERENCE_RefRef()
   * @model
   * @generated
   */
  EReference getRefRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.CHANGEREFERENCE#getRefRef <em>Ref Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Ref</em>' reference.
   * @see #getRefRef()
   * @generated
   */
  void setRefRef(EReference value);

} // CHANGEREFERENCE
