/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import OCLinEmig.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Or Attribute Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp#getSrc <em>Src</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getNavigationOrAttributeCallExp()
 * @model
 * @generated
 */
public interface NavigationOrAttributeCallExp extends OclExpression
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' containment reference.
   * @see #setSrc(OclExpression)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getNavigationOrAttributeCallExp_Src()
   * @model containment="true"
   * @generated
   */
  OclExpression getSrc();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.NavigationOrAttributeCallExp#getSrc <em>Src</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' containment reference.
   * @see #getSrc()
   * @generated
   */
  void setSrc(OclExpression value);

} // NavigationOrAttributeCallExp
