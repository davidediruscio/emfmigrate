/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OC Lin Ecore Specification CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getExprString <em>Expr String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOCLinEcoreSpecificationCS()
 * @model
 * @generated
 */
public interface OCLinEcoreSpecificationCS extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Expression</em>' containment reference.
   * @see #setOwnedExpression(ExpCS)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOCLinEcoreSpecificationCS_OwnedExpression()
   * @model containment="true"
   * @generated
   */
  ExpCS getOwnedExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getOwnedExpression <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Expression</em>' containment reference.
   * @see #getOwnedExpression()
   * @generated
   */
  void setOwnedExpression(ExpCS value);

  /**
   * Returns the value of the '<em><b>Expr String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr String</em>' attribute.
   * @see #setExprString(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOCLinEcoreSpecificationCS_ExprString()
   * @model
   * @generated
   */
  String getExprString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS#getExprString <em>Expr String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr String</em>' attribute.
   * @see #getExprString()
   * @generated
   */
  void setExprString(String value);

} // OCLinEcoreSpecificationCS
