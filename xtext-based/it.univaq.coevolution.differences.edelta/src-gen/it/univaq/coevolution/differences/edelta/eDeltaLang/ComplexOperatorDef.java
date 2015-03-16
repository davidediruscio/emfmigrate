/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Operator Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getParams <em>Params</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getPackageOperations <em>Package Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getAttributeOperations <em>Attribute Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getReferenceOperations <em>Reference Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef()
 * @model
 * @generated
 */
public interface ComplexOperatorDef extends EObject
{
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
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_Params()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getParams();

  /**
   * Returns the value of the '<em><b>Package Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Operations</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_PackageOperations()
   * @model containment="true"
   * @generated
   */
  EList<EPackageOperation> getPackageOperations();

  /**
   * Returns the value of the '<em><b>Class Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Operations</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_ClassOperations()
   * @model containment="true"
   * @generated
   */
  EList<EClassOperation> getClassOperations();

  /**
   * Returns the value of the '<em><b>Attribute Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Operations</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_AttributeOperations()
   * @model containment="true"
   * @generated
   */
  EList<EAttributeOperation> getAttributeOperations();

  /**
   * Returns the value of the '<em><b>Reference Operations</b></em>' containment reference list.
   * The list contents are of type {@link it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Operations</em>' containment reference list.
   * @see it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage#getComplexOperatorDef_ReferenceOperations()
   * @model containment="true"
   * @generated
   */
  EList<EReferenceOperation> getReferenceOperations();

} // ComplexOperatorDef
