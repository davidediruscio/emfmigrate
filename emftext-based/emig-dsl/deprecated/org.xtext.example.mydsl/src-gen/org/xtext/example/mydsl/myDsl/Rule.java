/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Rule#getRewritingRules <em>Rewriting Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(OpDef)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_Filter()
   * @model containment="true"
   * @generated
   */
  OpDef getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Rule#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(OpDef value);

  /**
   * Returns the value of the '<em><b>Rewriting Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.RewritingRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rewriting Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rewriting Rules</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRule_RewritingRules()
   * @model containment="true"
   * @generated
   */
  EList<RewritingRule> getRewritingRules();

} // Rule
