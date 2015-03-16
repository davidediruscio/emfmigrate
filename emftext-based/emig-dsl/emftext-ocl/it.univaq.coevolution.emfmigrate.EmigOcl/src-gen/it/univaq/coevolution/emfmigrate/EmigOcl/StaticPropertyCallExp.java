/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getSource <em>Source</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getStaticPropertyCallExp()
 * @model
 * @generated
 */
public interface StaticPropertyCallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclType)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getStaticPropertyCallExp_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclType getSource();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclType value);

	/**
	 * Returns the value of the '<em><b>Static Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Call</em>' containment reference.
	 * @see #setStaticCall(StaticPropertyCall)
	 * @see it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage#getStaticPropertyCallExp_StaticCall()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StaticPropertyCall getStaticCall();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emfmigrate.EmigOcl.StaticPropertyCallExp#getStaticCall <em>Static Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Call</em>' containment reference.
	 * @see #getStaticCall()
	 * @generated
	 */
	void setStaticCall(StaticPropertyCall value);

} // StaticPropertyCallExp
