/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.Module#getOclFeatures <em>Ocl Features</em>}</li>
 *   <li>{@link OCLinEmig.Module#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Ocl Features</b></em>' containment reference list.
	 * The list contents are of type {@link OCLinEmig.OclFeatureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Features</em>' containment reference list.
	 * @see OCLinEmig.OCLinEmigPackage#getModule_OclFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclFeatureDefinition> getOclFeatures();

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
	 * @see OCLinEmig.OCLinEmigPackage#getModule_Name()
	 * @model dataType="OCLinEmig.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OCLinEmig.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Module
