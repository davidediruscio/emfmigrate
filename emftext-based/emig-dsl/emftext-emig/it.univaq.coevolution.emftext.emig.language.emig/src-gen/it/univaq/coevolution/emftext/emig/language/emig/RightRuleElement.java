/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule <em>Rewriting Rule</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRightRuleElement()
 * @model
 * @generated
 */
public interface RightRuleElement extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Rewriting Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewriting Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewriting Rule</em>' container reference.
	 * @see #setRewritingRule(RewritingRule)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRightRuleElement_RewritingRule()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRight
	 * @model opposite="right" required="true" transient="false"
	 * @generated
	 */
	RewritingRule getRewritingRule();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule <em>Rewriting Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewriting Rule</em>' container reference.
	 * @see #getRewritingRule()
	 * @generated
	 */
	void setRewritingRule(RewritingRule value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.Binding}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRightRuleElement_Binding()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Binding#getRuleElement
	 * @model opposite="ruleElement" containment="true" required="true"
	 * @generated
	 */
	EList<Binding> getBinding();

} // RightRuleElement
