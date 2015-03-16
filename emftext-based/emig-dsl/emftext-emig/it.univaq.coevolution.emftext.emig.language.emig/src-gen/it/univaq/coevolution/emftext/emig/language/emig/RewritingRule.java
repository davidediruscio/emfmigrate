/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.LocatedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewriting Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getLeft <em>Left</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRight <em>Right</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRewritingRule()
 * @model
 * @generated
 */
public interface RewritingRule extends LocatedElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRewritingRule_Left()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule
	 * @model opposite="rewritingRule" containment="true" required="true"
	 * @generated
	 */
	EList<LeftRuleElement> getLeft();

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule <em>Rewriting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRewritingRule_Right()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement#getRewritingRule
	 * @model opposite="rewritingRule" containment="true" required="true"
	 * @generated
	 */
	EList<RightRuleElement> getRight();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getRewritingRules <em>Rewriting Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRewritingRule_Rule()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.Rule#getRewritingRules
	 * @model opposite="rewritingRules" required="true" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // RewritingRule
