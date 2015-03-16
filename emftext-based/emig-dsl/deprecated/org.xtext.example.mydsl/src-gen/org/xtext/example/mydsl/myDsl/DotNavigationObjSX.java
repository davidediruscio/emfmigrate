/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Navigation Obj SX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getObj <em>Obj</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDotNavigationObjSX()
 * @model
 * @generated
 */
public interface DotNavigationObjSX extends EObject
{
  /**
   * Returns the value of the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' reference.
   * @see #setObj(EObject)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDotNavigationObjSX_Obj()
   * @model
   * @generated
   */
  EObject getObj();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getObj <em>Obj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' reference.
   * @see #getObj()
   * @generated
   */
  void setObj(EObject value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(EStructuralFeature)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDotNavigationObjSX_Ref()
   * @model
   * @generated
   */
  EStructuralFeature getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.DotNavigationObjSX#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EStructuralFeature value);

} // DotNavigationObjSX
