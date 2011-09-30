/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getOpdef <em>Opdef</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getSettersdef <em>Settersdef</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getComplex <em>Complex</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getString <em>String</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getDst <em>Dst</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.OpDef#getFeatureSettersdef <em>Feature Settersdef</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef()
 * @model
 * @generated
 */
public interface OpDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Opdef</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opdef</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opdef</em>' attribute.
   * @see #setOpdef(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_Opdef()
   * @model
   * @generated
   */
  String getOpdef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.OpDef#getOpdef <em>Opdef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opdef</em>' attribute.
   * @see #getOpdef()
   * @generated
   */
  void setOpdef(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(ENamedElement)
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_Ref()
   * @model containment="true"
   * @generated
   */
  ENamedElement getRef();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.OpDef#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ENamedElement value);

  /**
   * Returns the value of the '<em><b>Settersdef</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settersdef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settersdef</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_Settersdef()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSettersdef();

  /**
   * Returns the value of the '<em><b>Complex</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.ComplexOperator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complex</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_Complex()
   * @model containment="true"
   * @generated
   */
  EList<ComplexOperator> getComplex();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.OpDef#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Dst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dst</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dst</em>' containment reference.
   * @see #setDst(EClass)
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_Dst()
   * @model containment="true"
   * @generated
   */
  EClass getDst();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.migration.OpDef#getDst <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dst</em>' containment reference.
   * @see #getDst()
   * @generated
   */
  void setDst(EClass value);

  /**
   * Returns the value of the '<em><b>Feature Settersdef</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.migration.featureSetters_def}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Settersdef</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature Settersdef</em>' containment reference list.
   * @see it.univaq.coevolution.migration.MigrationPackage#getOpDef_FeatureSettersdef()
   * @model containment="true"
   * @generated
   */
  EList<featureSetters_def> getFeatureSettersdef();

} // OpDef
