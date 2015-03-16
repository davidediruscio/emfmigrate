/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.LeftRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.RewritingRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import be.ac.vub.simpleocl.impl.VariableDeclarationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Left Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.LeftRuleElementImpl#getRewritingRule <em>Rewriting Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeftRuleElementImpl extends VariableDeclarationImpl implements LeftRuleElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeftRuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.LEFT_RULE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewritingRule getRewritingRule() {
		if (eContainerFeatureID() != EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE) return null;
		return (RewritingRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRewritingRule(RewritingRule newRewritingRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRewritingRule, EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewritingRule(RewritingRule newRewritingRule) {
		if (newRewritingRule != eInternalContainer() || (eContainerFeatureID() != EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE && newRewritingRule != null)) {
			if (EcoreUtil.isAncestor(this, newRewritingRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRewritingRule != null)
				msgs = ((InternalEObject)newRewritingRule).eInverseAdd(this, EmigPackage.REWRITING_RULE__LEFT, RewritingRule.class, msgs);
			msgs = basicSetRewritingRule(newRewritingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE, newRewritingRule, newRewritingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRewritingRule((RewritingRule)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				return basicSetRewritingRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				return eInternalContainer().eInverseRemove(this, EmigPackage.REWRITING_RULE__LEFT, RewritingRule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				return getRewritingRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				setRewritingRule((RewritingRule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				setRewritingRule((RewritingRule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE:
				return getRewritingRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //LeftRuleElementImpl
