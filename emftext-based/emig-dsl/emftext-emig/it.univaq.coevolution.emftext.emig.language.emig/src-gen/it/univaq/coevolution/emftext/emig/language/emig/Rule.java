/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig;

import org.eclipse.emf.common.util.EList;

import be.ac.vub.simpleocl.ModuleElement;
import be.ac.vub.simpleocl.NamedElement;
import be.ac.vub.simpleocl.OclExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getFilter <em>Filter</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getRewritingRules <em>Rewriting Rules</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement, ModuleElement {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(OpDef)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRule_Filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OpDef getFilter();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(OpDef value);

	/**
	 * Returns the value of the '<em><b>Rewriting Rules</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule}.
	 * It is bidirectional and its opposite is '{@link it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rewriting Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewriting Rules</em>' containment reference list.
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRule_RewritingRules()
	 * @see it.univaq.coevolution.emftext.emig.language.emig.RewritingRule#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<RewritingRule> getRewritingRules();

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(OclExpression)
	 * @see it.univaq.coevolution.emftext.emig.language.emig.EmigPackage#getRule_Where()
	 * @model containment="true"
	 * @generated
	 */
	OclExpression getWhere();

	/**
	 * Sets the value of the '{@link it.univaq.coevolution.emftext.emig.language.emig.Rule#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(OclExpression value);

} // Rule
