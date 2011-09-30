/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class Setter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.classSetter#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.classSetter#getValue <em>Value</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.classSetter#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getclassSetter()
 * @model
 * @generated
 */
public interface classSetter extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getclassSetter_Metafeature()
   * @model
   * @generated
   */
  EStructuralFeature getMetafeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.classSetter#getMetafeature <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metafeature</em>' reference.
   * @see #getMetafeature()
   * @generated
   */
  void setMetafeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getclassSetter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.classSetter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Value Ref</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Ref</em>' reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getclassSetter_ValueRef()
   * @model
   * @generated
   */
  EList<EObject> getValueRef();

} // classSetter
