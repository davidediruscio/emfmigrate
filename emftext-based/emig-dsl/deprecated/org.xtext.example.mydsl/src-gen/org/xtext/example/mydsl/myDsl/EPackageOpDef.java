/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEPackageOpDef()
 * @model
 * @generated
 */
public interface EPackageOpDef extends OpDef
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(EPackage)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEPackageOpDef_Var()
   * @model containment="true"
   * @generated
   */
  EPackage getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EPackage value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(EPackage)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEPackageOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  EPackage getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EPackageOpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EPackage value);

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.EClassOpDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEPackageOpDef_Classes()
   * @model containment="true"
   * @generated
   */
  EList<EClassOpDef> getClasses();

} // EPackageOpDef
