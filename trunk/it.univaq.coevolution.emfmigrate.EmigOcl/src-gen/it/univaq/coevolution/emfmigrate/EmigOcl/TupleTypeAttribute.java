/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getTupleType <em>Tuple Type</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleTypeAttribute()
 * @model
 * @generated
 */
public interface TupleTypeAttribute extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute <em>Tuple Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(OclType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleTypeAttribute_Type()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.OclType#getTupleTypeAttribute
	 * @model opposite="tupleTypeAttribute" containment="true" required="true" ordered="false"
	 * @generated
	 */
	OclType getType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(OclType value);

	/**
	 * Returns the value of the '<em><b>Tuple Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple Type</em>' container reference.
	 * @see #setTupleType(TupleType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleTypeAttribute_TupleType()
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.TupleType#getAttributes
	 * @model opposite="attributes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TupleType getTupleType();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getTupleType <em>Tuple Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple Type</em>' container reference.
	 * @see #getTupleType()
	 * @generated
	 */
	void setTupleType(TupleType value);

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
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getTupleTypeAttribute_Name()
	 * @model unique="false" dataType="it.univaq.coevolution.emfmigrate.EmigOcl.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.TupleTypeAttribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TupleTypeAttribute
