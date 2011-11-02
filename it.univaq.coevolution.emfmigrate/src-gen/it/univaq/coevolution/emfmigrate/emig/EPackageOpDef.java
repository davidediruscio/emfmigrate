/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

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
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEPackageOpDef()
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEPackageOpDef_Var()
   * @model containment="true"
   * @generated
   */
  EPackage getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getVar <em>Var</em>}' containment reference.
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
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEPackageOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  EPackage getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.EPackageOpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(EPackage value);

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.EClassOpDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getEPackageOpDef_Classes()
   * @model containment="true"
   * @generated
   */
  EList<EClassOpDef> getClasses();

} // EPackageOpDef
