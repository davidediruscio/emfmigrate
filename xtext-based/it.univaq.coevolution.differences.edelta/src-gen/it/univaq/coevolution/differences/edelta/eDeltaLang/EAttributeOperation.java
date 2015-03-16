/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEAttributeOperation()
 * @model
 * @generated
 */
public interface EAttributeOperation extends EObject
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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEAttributeOperation_Var()
   * @model containment="true"
   * @generated
   */
  EAttribute getVar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EAttribute value);

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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEAttributeOperation_Op()
   * @model containment="true"
   * @generated
   */
  EObject getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation#getOp <em>Op</em>}' containment reference.
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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEAttributeOperation_Setters()
   * @model containment="true"
   * @generated
   */
  EList<setter> getSetters();

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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getEAttributeOperation_Complex()
   * @model containment="true"
   * @generated
   */
  EList<ComplexOperator> getComplex();

} // EAttributeOperation
