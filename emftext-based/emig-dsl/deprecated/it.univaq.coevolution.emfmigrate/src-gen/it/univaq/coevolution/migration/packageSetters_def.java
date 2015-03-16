/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>package Setters def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.packageSetters_def#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.packageSetters_def#getPar <em>Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getpackageSetters_def()
 * @model
 * @generated
 */
public interface packageSetters_def extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getpackageSetters_def_Metafeature()
   * @model
   * @generated
   */
  EStructuralFeature getMetafeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.packageSetters_def#getMetafeature <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metafeature</em>' reference.
   * @see #getMetafeature()
   * @generated
   */
  void setMetafeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Par</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Par</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Par</em>' attribute.
   * @see #setPar(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getpackageSetters_def_Par()
   * @model
   * @generated
   */
  String getPar();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.packageSetters_def#getPar <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Par</em>' attribute.
   * @see #getPar()
   * @generated
   */
  void setPar(String value);

} // packageSetters_def
