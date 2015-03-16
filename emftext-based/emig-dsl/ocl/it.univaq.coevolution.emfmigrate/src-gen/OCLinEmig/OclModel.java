/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OCLinEmig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ocl Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link OCLinEmig.OclModel#getName <em>Name</em>}</li>
 *   <li>{@link OCLinEmig.OclModel#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link OCLinEmig.OclModel#getElements <em>Elements</em>}</li>
 *   <li>{@link OCLinEmig.OclModel#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see OCLinEmig.OCLinEmigPackage#getOclModel()
 * @model
 * @generated
 */
public interface OclModel extends LocatedElement {
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
	 * @see OCLinEmig.OCLinEmigPackage#getOclModel_Name()
	 * @model unique="false" dataType="OCLinEmig.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link OCLinEmig.OclModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(OclModel)
	 * @see OCLinEmig.OCLinEmigPackage#getOclModel_Metamodel()
	 * @see OCLinEmig.OclModel#getModel
	 * @model opposite="model" required="true" ordered="false"
	 * @generated
	 */
	OclModel getMetamodel();

	/**
	 * Sets the value of the '{@link OCLinEmig.OclModel#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(OclModel value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link OCLinEmig.OclModelElement}.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see OCLinEmig.OCLinEmigPackage#getOclModel_Elements()
	 * @see OCLinEmig.OclModelElement#getModel
	 * @model opposite="model" ordered="false"
	 * @generated
	 */
	EList<OclModelElement> getElements();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference list.
	 * The list contents are of type {@link OCLinEmig.OclModel}.
	 * It is bidirectional and its opposite is '{@link OCLinEmig.OclModel#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference list.
	 * @see OCLinEmig.OCLinEmigPackage#getOclModel_Model()
	 * @see OCLinEmig.OclModel#getMetamodel
	 * @model opposite="metamodel" ordered="false"
	 * @generated
	 */
	EList<OclModel> getModel();

} // OclModel
