/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import be.ac.vub.simpleocl.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule <em>Rewriting Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getLeftRuleElement()
 * @model
 * @generated
 */
public interface LeftRuleElement extends VariableDeclaration {
	/**
	 * Returns the value of the '<em><b>Rewriting Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewriting Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewriting Rule</em>' container reference.
	 * @see #setRewritingRule(RewritingRule)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getLeftRuleElement_RewritingRule()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getLeft
	 * @model opposite="left" required="true" transient="false"
	 * @generated
	 */
	RewritingRule getRewritingRule();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement#getRewritingRule <em>Rewriting Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rewriting Rule</em>' container reference.
	 * @see #getRewritingRule()
	 * @generated
	 */
	void setRewritingRule(RewritingRule value);

} // LeftRuleElement
