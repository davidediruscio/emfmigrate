/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEAttributeOpDef()
 * @model
 * @generated
 */
public interface EAttributeOpDef extends OpDef
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
   * @see #setVar(EAttribute)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEAttributeOpDef_Var()
   * @model containment="true"
   * @generated
   */
  EAttribute getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EAttribute value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(EAttribute)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEAttributeOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  EAttribute getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EAttribute value);

} // EAttributeOpDef
