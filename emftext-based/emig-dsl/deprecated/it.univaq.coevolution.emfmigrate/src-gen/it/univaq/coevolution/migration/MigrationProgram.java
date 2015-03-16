/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getLibs <em>Libs</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getMigr <em>Migr</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getPath <em>Path</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getTransformationPackage <em>Transformation Package</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getDelta <em>Delta</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.MigrationProgram#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram()
 * @model
 * @generated
 */
public interface MigrationProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Libs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Libs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Libs</em>' attribute list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_Libs()
   * @model unique="false"
   * @generated
   */
  EList<String> getLibs();

  /**
   * Returns the value of the '<em><b>Migr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migr</em>' attribute.
   * @see #setMigr(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_Migr()
   * @model
   * @generated
   */
  String getMigr();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.MigrationProgram#getMigr <em>Migr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Migr</em>' attribute.
   * @see #getMigr()
   * @generated
   */
  void setMigr(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.MigrationProgram#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Transformation Package</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Package</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Package</em>' reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_TransformationPackage()
   * @model
   * @generated
   */
  EList<EPackage> getTransformationPackage();

  /**
   * Returns the value of the '<em><b>Delta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delta</em>' attribute.
   * @see #setDelta(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_Delta()
   * @model
   * @generated
   */
  String getDelta();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.MigrationProgram#getDelta <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' attribute.
   * @see #getDelta()
   * @generated
   */
  void setDelta(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getMigrationProgram_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // MigrationProgram
