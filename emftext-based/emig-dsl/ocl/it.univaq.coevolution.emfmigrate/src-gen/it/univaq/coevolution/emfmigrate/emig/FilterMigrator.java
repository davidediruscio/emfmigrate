/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import OCLinEmig.OclExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator()
 * @model
 * @generated
 */
public interface FilterMigrator extends EObject
{
  /**
   * Returns the value of the '<em><b>Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specification</em>' containment reference.
   * @see #setSpecification(OclExpression)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator_Specification()
   * @model containment="true"
   * @generated
   */
  OclExpression getSpecification();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getSpecification <em>Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specification</em>' containment reference.
   * @see #getSpecification()
   * @generated
   */
  void setSpecification(OclExpression value);

} // FilterMigrator
