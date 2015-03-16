/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getLibs <em>Libs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getMigr <em>Migr</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getTypeArt <em>Type Art</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getTransformationPackage <em>Transformation Package</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getDelta <em>Delta</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_Libs()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_Migr()
   * @model
   * @generated
   */
  String getMigr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getMigr <em>Migr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Migr</em>' attribute.
   * @see #getMigr()
   * @generated
   */
  void setMigr(String value);

  /**
   * Returns the value of the '<em><b>Type Art</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Art</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Art</em>' containment reference.
   * @see #setTypeArt(Artifact)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_TypeArt()
   * @model containment="true"
   * @generated
   */
  Artifact getTypeArt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getTypeArt <em>Type Art</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Art</em>' containment reference.
   * @see #getTypeArt()
   * @generated
   */
  void setTypeArt(Artifact value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_TransformationPackage()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_Delta()
   * @model
   * @generated
   */
  String getDelta();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.MigrationProgram#getDelta <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delta</em>' attribute.
   * @see #getDelta()
   * @generated
   */
  void setDelta(String value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMigrationProgram_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

} // MigrationProgram
