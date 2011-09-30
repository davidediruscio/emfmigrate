/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DELETEATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.DELETEATTRIBUTE#getRefAttr <em>Ref Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getDELETEATTRIBUTE()
 * @model
 * @generated
 */
public interface DELETEATTRIBUTE extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Attr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Attr</em>' reference.
   * @see #setRefAttr(EAttribute)
   * @see it.univaq.coevolution.migration.MigrationPackage#getDELETEATTRIBUTE_RefAttr()
   * @model
   * @generated
   */
  EAttribute getRefAttr();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.DELETEATTRIBUTE#getRefAttr <em>Ref Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Attr</em>' reference.
   * @see #getRefAttr()
   * @generated
   */
  void setRefAttr(EAttribute value);

} // DELETEATTRIBUTE
