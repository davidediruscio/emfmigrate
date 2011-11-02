/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation()
 * @model
 * @generated
 */
public interface EPackageOperation extends EObject
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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation_Var()
   * @model containment="true"
   * @generated
   */
  EPackage getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EPackage value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(EObject)
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(EObject value);

  /**
   * Returns the value of the '<em><b>Setters</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.setter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Setters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Setters</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation_Setters()
   * @model containment="true"
   * @generated
   */
  EList<setter> getSetters();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation_Classes()
   * @model containment="true"
   * @generated
   */
  EList<EClassOperation> getClasses();

  /**
   * Returns the value of the '<em><b>Complex</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEPackageOperation_Complex()
   * @model containment="true"
   * @generated
   */
  EList<ComplexOperator> getComplex();

} // EPackageOperation
