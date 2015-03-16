/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import be.ac.vub.simpleocl.LocatedElement;
import be.ac.vub.simpleocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getExpr <em>Expr</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getProperty <em>Property</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement <em>Rule Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(OclExpression)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getBinding_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getExpr();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getBinding_Property()
	 * @model required="true"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Rule Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Element</em>' container reference.
	 * @see #setRuleElement(RightRuleElement)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getBinding_RuleElement()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getBinding
	 * @model opposite="binding" required="true" transient="false"
	 * @generated
	 */
	RightRuleElement getRuleElement();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement <em>Rule Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Element</em>' container reference.
	 * @see #getRuleElement()
	 * @generated
	 */
	void setRuleElement(RightRuleElement value);

} // Binding
