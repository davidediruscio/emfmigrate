/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.Model#getPackages <em>Packages</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.Model#getTitle <em>Title</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.Model#getOperators <em>Operators</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.Model#getMigrationProgr <em>Migration Progr</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.PackageOp}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<PackageOp> getPackages();

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getModel_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.Model#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Operators</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.ComplexOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getModel_Operators()
   * @model containment="true"
   * @generated
   */
  EList<ComplexOperator> getOperators();

  /**
   * Returns the value of the '<em><b>Migration Progr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Migration Progr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Migration Progr</em>' containment reference.
   * @see #setMigrationProgr(MigrationProgram)
   * @see it.univaq.coevolution.migration.MigrationPackage#getModel_MigrationProgr()
   * @model containment="true"
   * @generated
   */
  MigrationProgram getMigrationProgr();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.Model#getMigrationProgr <em>Migration Progr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Migration Progr</em>' containment reference.
   * @see #getMigrationProgr()
   * @generated
   */
  void setMigrationProgr(MigrationProgram value);

} // Model
