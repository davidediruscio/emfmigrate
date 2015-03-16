/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.LocatedElement;
import be.ac.vub.simpleocl.OclExpression;
import be.ac.vub.simpleocl.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setter Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getParametersDef <em>Parameters Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getSetterDef()
 * @model
 * @generated
 */
public interface SetterDef extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Metafeature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metafeature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metafeature</em>' attribute.
	 * @see #setMetafeature(String)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getSetterDef_Metafeature()
	 * @model required="true"
	 * @generated
	 */
	String getMetafeature();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.SetterDef#getMetafeature <em>Metafeature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metafeature</em>' attribute.
	 * @see #getMetafeature()
	 * @generated
	 */
	void setMetafeature(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Def</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.MParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Def</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getSetterDef_ParametersDef()
	 * @model containment="true"
	 * @generated
	 */
	EList<MParameter> getParametersDef();

} // SetterDef
