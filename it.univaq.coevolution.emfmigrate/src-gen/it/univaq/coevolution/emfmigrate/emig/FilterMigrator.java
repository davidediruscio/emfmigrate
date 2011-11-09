/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Migrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getFeatureSX <em>Feature SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator()
 * @model
 * @generated
 */
public interface FilterMigrator extends LocatedElement
{
  /**
   * Returns the value of the '<em><b>Feature SX</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature SX</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature SX</em>' containment reference.
   * @see #setFeatureSX(DotNavigationObjSX)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator_FeatureSX()
   * @model containment="true"
   * @generated
   */
  DotNavigationObjSX getFeatureSX();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getFeatureSX <em>Feature SX</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature SX</em>' containment reference.
   * @see #getFeatureSX()
   * @generated
   */
  void setFeatureSX(DotNavigationObjSX value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DotNavigationObjDX)
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getFilterMigrator_Value()
   * @model containment="true"
   * @generated
   */
  DotNavigationObjDX getValue();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.emig.FilterMigrator#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DotNavigationObjDX value);

} // FilterMigrator
