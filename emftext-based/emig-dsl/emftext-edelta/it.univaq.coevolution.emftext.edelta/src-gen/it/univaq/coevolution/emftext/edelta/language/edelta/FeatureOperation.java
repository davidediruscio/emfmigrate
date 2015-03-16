/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.FeatureOperation#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getFeatureOperation()
 * @model abstract="true"
 * @generated
 */
public interface FeatureOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Setter</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.edelta.language.edelta.Setter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage#getFeatureOperation_Setter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Setter> getSetter();

} // FeatureOperation
