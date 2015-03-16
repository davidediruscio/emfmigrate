/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEClassOpDef()
 * @model
 * @generated
 */
public interface EClassOpDef extends OpDef
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
   * @see #setVar(EClass)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEClassOpDef_Var()
   * @model containment="true"
   * @generated
   */
  EClass getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EClass value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(EClass)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEClassOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  EClass getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EClass value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.EAttributeOpDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEClassOpDef_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<EAttributeOpDef> getAttributes();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.EReferenceOpDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEClassOpDef_References()
   * @model containment="true"
   * @generated
   */
  EList<EReferenceOpDef> getReferences();

} // EClassOpDef
