/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEReferenceOpDef()
 * @model
 * @generated
 */
public interface EReferenceOpDef extends OpDef
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
   * @see #setVar(EReference)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEReferenceOpDef_Var()
   * @model containment="true"
   * @generated
   */
  EReference getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EReference value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(EReference)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getEReferenceOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  EReference getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.EReferenceOpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EReference value);

} // EReferenceOpDef
