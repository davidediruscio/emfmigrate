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
 * A representation of the model object '<em><b>Filter Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.FilterMigrator#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FilterMigrator#getInternalFeature <em>Internal Feature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FilterMigrator#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FilterMigrator#getDxobj <em>Dxobj</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.FilterMigrator#getDxgetters <em>Dxgetters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator()
 * @model
 * @generated
 */
public interface FilterMigrator extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EStructuralFeature)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator_Feature()
   * @model
   * @generated
   */
  EStructuralFeature getFeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FilterMigrator#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Internal Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal Feature</em>' reference.
   * @see #setInternalFeature(EStructuralFeature)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator_InternalFeature()
   * @model
   * @generated
   */
  EStructuralFeature getInternalFeature();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FilterMigrator#getInternalFeature <em>Internal Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internal Feature</em>' reference.
   * @see #getInternalFeature()
   * @generated
   */
  void setInternalFeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(STRING)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator_Op()
   * @model containment="true"
   * @generated
   */
  STRING getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FilterMigrator#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(STRING value);

  /**
   * Returns the value of the '<em><b>Dxobj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dxobj</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dxobj</em>' reference.
   * @see #setDxobj(EObject)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator_Dxobj()
   * @model
   * @generated
   */
  EObject getDxobj();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FilterMigrator#getDxobj <em>Dxobj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dxobj</em>' reference.
   * @see #getDxobj()
   * @generated
   */
  void setDxobj(EObject value);

  /**
   * Returns the value of the '<em><b>Dxgetters</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dxgetters</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dxgetters</em>' reference.
   * @see #setDxgetters(EStructuralFeature)
   * @see it.univaq.coevolution.migration.MigrationPackage#getFilterMigrator_Dxgetters()
   * @model
   * @generated
   */
  EStructuralFeature getDxgetters();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.FilterMigrator#getDxgetters <em>Dxgetters</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dxgetters</em>' reference.
   * @see #getDxgetters()
   * @generated
   */
  void setDxgetters(EStructuralFeature value);

} // FilterMigrator
