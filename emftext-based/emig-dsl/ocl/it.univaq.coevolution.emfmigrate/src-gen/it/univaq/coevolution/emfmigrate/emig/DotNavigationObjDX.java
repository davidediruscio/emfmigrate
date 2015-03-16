/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Navigation Obj DX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getObj <em>Obj</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getDotNavigationObjDX()
 * @model
 * @generated
 */
public interface DotNavigationObjDX extends EObject
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getDotNavigationObjDX_Obj()
   * @model
   * @generated
   */
  EObject getObj();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getObj <em>Obj</em>}' reference.
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getDotNavigationObjDX_Ref()
   * @model
   * @generated
   */
  EStructuralFeature getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EStructuralFeature value);

} // DotNavigationObjDX
