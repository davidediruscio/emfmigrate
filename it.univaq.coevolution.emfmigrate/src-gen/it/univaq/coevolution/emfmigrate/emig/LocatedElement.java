/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.LocatedElement#getLine <em>Line</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.LocatedElement#getEndline <em>Endline</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.LocatedElement#getOffset <em>Offset</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.LocatedElement#getEndoffset <em>Endoffset</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getLocatedElement()
 * @model
 * @generated
 */
public interface LocatedElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' attribute.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getLocatedElement_Line()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  int getLine();

  /**
   * Returns the value of the '<em><b>Endline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endline</em>' attribute.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getLocatedElement_Endline()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  int getEndline();

  /**
   * Returns the value of the '<em><b>Offset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Offset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Offset</em>' attribute.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getLocatedElement_Offset()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  int getOffset();

  /**
   * Returns the value of the '<em><b>Endoffset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Endoffset</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Endoffset</em>' attribute.
   * @see it.univaq.coevolution.emfmigrate.emig.EmigPackage#getLocatedElement_Endoffset()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  int getEndoffset();

} // LocatedElement
