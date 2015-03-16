/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getDeletePackage()
 * @model
 * @generated
 */
public interface DeletePackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(EPackage)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getDeletePackage_Ref()
   * @model
   * @generated
   */
  EPackage getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.DeletePackage#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EPackage value);

} // DeletePackage
