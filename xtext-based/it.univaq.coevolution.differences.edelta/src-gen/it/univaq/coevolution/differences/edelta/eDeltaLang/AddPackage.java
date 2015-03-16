/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getNew <em>New</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getAddPackage()
 * @model
 * @generated
 */
public interface AddPackage extends EObject
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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getAddPackage_New()
   * @model
   * @generated
   */
  String getNew();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getNew <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New</em>' attribute.
   * @see #getNew()
   * @generated
   */
  void setNew(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(STRING)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getAddPackage_Ref()
   * @model
   * @generated
   */
  STRING getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.AddPackage#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(STRING value);

} // AddPackage
