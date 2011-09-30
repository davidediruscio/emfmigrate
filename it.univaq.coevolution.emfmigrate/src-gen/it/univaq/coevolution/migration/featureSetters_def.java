/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>feature Setters def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.featureSetters_def#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.featureSetters_def#getEType <em>EType</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.featureSetters_def#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.featureSetters_def#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getfeatureSetters_def()
 * @model
 * @generated
 */
public interface featureSetters_def extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower Bound</em>' attribute.
   * @see #setLowerBound(int)
   * @see it.univaq.coevolution.migration.MigrationPackage#getfeatureSetters_def_LowerBound()
   * @model
   * @generated
   */
  int getLowerBound();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.featureSetters_def#getLowerBound <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower Bound</em>' attribute.
   * @see #getLowerBound()
   * @generated
   */
  void setLowerBound(int value);

  /**
   * Returns the value of the '<em><b>EType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EType</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EType</em>' containment reference.
   * @see #setEType(EClassifier)
   * @see it.univaq.coevolution.migration.MigrationPackage#getfeatureSetters_def_EType()
   * @model containment="true"
   * @generated
   */
  EClassifier getEType();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.featureSetters_def#getEType <em>EType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EType</em>' containment reference.
   * @see #getEType()
   * @generated
   */
  void setEType(EClassifier value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' containment reference.
   * @see #setOpposite(ENamedElement)
   * @see it.univaq.coevolution.migration.MigrationPackage#getfeatureSetters_def_Opposite()
   * @model containment="true"
   * @generated
   */
  ENamedElement getOpposite();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.featureSetters_def#getOpposite <em>Opposite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' containment reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(ENamedElement value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getfeatureSetters_def_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.featureSetters_def#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // featureSetters_def
