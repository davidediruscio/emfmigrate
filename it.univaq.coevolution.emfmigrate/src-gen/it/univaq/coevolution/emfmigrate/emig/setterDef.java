/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>setter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getOperator <em>Operator</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getPar <em>Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getsetterDef()
 * @model
 * @generated
 */
public interface setterDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Metafeature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metafeature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metafeature</em>' reference.
   * @see #setMetafeature(EStructuralFeature)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getsetterDef_Metafeature()
   * @model
   * @generated
   */
  EStructuralFeature getMetafeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getMetafeature <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metafeature</em>' reference.
   * @see #getMetafeature()
   * @generated
   */
  void setMetafeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getsetterDef_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.setterDef#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Par</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.emfmigrate.emig.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' containment reference list.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getsetterDef_Par()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getPar();

} // setterDef
