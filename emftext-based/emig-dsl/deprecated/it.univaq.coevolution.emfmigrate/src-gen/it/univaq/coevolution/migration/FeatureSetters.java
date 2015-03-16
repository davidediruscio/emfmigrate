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
 * A representation of the model object '<em><b>Feature Setters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#getValueEString <em>Value EString</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#getValueEInt <em>Value EInt</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#isValueEBool <em>Value EBool</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FeatureSetters#getValueFeature <em>Value Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters()
 * @model
 * @generated
 */
public interface FeatureSetters extends EObject
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
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_Metafeature()
   * @model
   * @generated
   */
  EStructuralFeature getMetafeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FeatureSetters#getMetafeature <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Metafeature</em>' reference.
   * @see #getMetafeature()
   * @generated
   */
  void setMetafeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Value EString</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value EString</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value EString</em>' attribute.
   * @see #setValueEString(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_ValueEString()
   * @model
   * @generated
   */
  String getValueEString();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FeatureSetters#getValueEString <em>Value EString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value EString</em>' attribute.
   * @see #getValueEString()
   * @generated
   */
  void setValueEString(String value);

  /**
   * Returns the value of the '<em><b>Value EInt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value EInt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value EInt</em>' attribute.
   * @see #setValueEInt(int)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_ValueEInt()
   * @model
   * @generated
   */
  int getValueEInt();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FeatureSetters#getValueEInt <em>Value EInt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value EInt</em>' attribute.
   * @see #getValueEInt()
   * @generated
   */
  void setValueEInt(int value);

  /**
   * Returns the value of the '<em><b>Value EBool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value EBool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value EBool</em>' attribute.
   * @see #setValueEBool(boolean)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_ValueEBool()
   * @model
   * @generated
   */
  boolean isValueEBool();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FeatureSetters#isValueEBool <em>Value EBool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value EBool</em>' attribute.
   * @see #isValueEBool()
   * @generated
   */
  void setValueEBool(boolean value);

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
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_ValueRef()
   * @model
   * @generated
   */
  EList<EObject> getValueRef();

  /**
   * Returns the value of the '<em><b>Value Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Feature</em>' reference.
   * @see #setValueFeature(EStructuralFeature)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFeatureSetters_ValueFeature()
   * @model
   * @generated
   */
  EStructuralFeature getValueFeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FeatureSetters#getValueFeature <em>Value Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Feature</em>' reference.
   * @see #getValueFeature()
   * @generated
   */
  void setValueFeature(EStructuralFeature value);

} // FeatureSetters
