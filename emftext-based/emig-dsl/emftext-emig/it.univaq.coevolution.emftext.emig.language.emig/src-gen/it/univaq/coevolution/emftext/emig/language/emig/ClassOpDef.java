/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Op Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getFeatureOp <em>Feature Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getClassPar <em>Class Par</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getClassOpDef()
 * @model
 * @generated
 */
public interface ClassOpDef extends OpDef {
	/**
	 * Returns the value of the '<em><b>Feature Op</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Op</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Op</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getClassOpDef_FeatureOp()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureOpDef> getFeatureOp();

	/**
	 * Returns the value of the '<em><b>Class Par</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Par</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Par</em>' containment reference.
	 * @see #setClassPar(it.univaq.coevolution.emftext.emig.language.emig.Class)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getClassOpDef_ClassPar()
	 * @model containment="true" required="true"
	 * @generated
	 */
	it.univaq.coevolution.emftext.emig.language.emig.Class getClassPar();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef#getClassPar <em>Class Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Par</em>' containment reference.
	 * @see #getClassPar()
	 * @generated
	 */
	void setClassPar(it.univaq.coevolution.emftext.emig.language.emig.Class value);

} // ClassOpDef
