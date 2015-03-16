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
 * A representation of the model object '<em><b>CHANGEATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.CHANGEATTRIBUTE#getRefAttr <em>Ref Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getCHANGEATTRIBUTE()
 * @model
 * @generated
 */
public interface CHANGEATTRIBUTE extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getCHANGEATTRIBUTE_RefAttr()
   * @model
   * @generated
   */
  EAttribute getRefAttr();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.CHANGEATTRIBUTE#getRefAttr <em>Ref Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Attr</em>' reference.
   * @see #getRefAttr()
   * @generated
   */
  void setRefAttr(EAttribute value);

} // CHANGEATTRIBUTE
