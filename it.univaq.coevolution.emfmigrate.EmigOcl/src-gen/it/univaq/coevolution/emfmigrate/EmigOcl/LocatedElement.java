/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getLine <em>Line</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getColumn <em>Column</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.LocatedElement#getCharEnd <em>Char End</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface LocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocatedElement_Line()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocatedElement_Column()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Returns the value of the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Start</em>' attribute.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocatedElement_CharStart()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharStart();

	/**
	 * Returns the value of the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End</em>' attribute.
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getLocatedElement_CharEnd()
	 * @model dataType="it.univaq.coevolution.emfmigrate.EmigOcl.Integer" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getCharEnd();

} // LocatedElement
