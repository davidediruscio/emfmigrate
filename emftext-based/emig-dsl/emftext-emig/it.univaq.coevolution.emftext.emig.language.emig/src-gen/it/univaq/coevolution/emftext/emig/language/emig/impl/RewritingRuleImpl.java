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
import it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement;
import it.univaq.coevolution.emftext.emig.language.emig.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import be.ac.vub.simpleocl.impl.LocatedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewriting Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl#getRight <em>Right</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RewritingRuleImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewritingRuleImpl extends LocatedElementImpl implements RewritingRule {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected EList<LeftRuleElement> left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected EList<RightRuleElement> right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RewritingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.REWRITING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeftRuleElement> getLeft() {
		if (left == null) {
			left = new EObjectContainmentWithInverseEList<LeftRuleElement>(LeftRuleElement.class, this, EmigPackage.REWRITING_RULE__LEFT, EmigPackage.LEFT_RULE_ELEMENT__REWRITING_RULE);
		}
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightRuleElement> getRight() {
		if (right == null) {
			right = new EObjectContainmentWithInverseEList<RightRuleElement>(RightRuleElement.class, this, EmigPackage.REWRITING_RULE__RIGHT, EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE);
		}
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != EmigPackage.REWRITING_RULE__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, EmigPackage.REWRITING_RULE__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != EmigPackage.REWRITING_RULE__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, EmigPackage.RULE__REWRITING_RULES, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.REWRITING_RULE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.REWRITING_RULE__LEFT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeft()).basicAdd(otherEnd, msgs);
			case EmigPackage.REWRITING_RULE__RIGHT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRight()).basicAdd(otherEnd, msgs);
			case EmigPackage.REWRITING_RULE__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
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
			case EmigPackage.REWRITING_RULE__LEFT:
				return ((InternalEList<?>)getLeft()).basicRemove(otherEnd, msgs);
			case EmigPackage.REWRITING_RULE__RIGHT:
				return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
			case EmigPackage.REWRITING_RULE__RULE:
				return basicSetRule(null, msgs);
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
			case EmigPackage.REWRITING_RULE__RULE:
				return eInternalContainer().eInverseRemove(this, EmigPackage.RULE__REWRITING_RULES, Rule.class, msgs);
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
			case EmigPackage.REWRITING_RULE__LEFT:
				return getLeft();
			case EmigPackage.REWRITING_RULE__RIGHT:
				return getRight();
			case EmigPackage.REWRITING_RULE__RULE:
				return getRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmigPackage.REWRITING_RULE__LEFT:
				getLeft().clear();
				getLeft().addAll((Collection<? extends LeftRuleElement>)newValue);
				return;
			case EmigPackage.REWRITING_RULE__RIGHT:
				getRight().clear();
				getRight().addAll((Collection<? extends RightRuleElement>)newValue);
				return;
			case EmigPackage.REWRITING_RULE__RULE:
				setRule((Rule)newValue);
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
			case EmigPackage.REWRITING_RULE__LEFT:
				getLeft().clear();
				return;
			case EmigPackage.REWRITING_RULE__RIGHT:
				getRight().clear();
				return;
			case EmigPackage.REWRITING_RULE__RULE:
				setRule((Rule)null);
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
			case EmigPackage.REWRITING_RULE__LEFT:
				return left != null && !left.isEmpty();
			case EmigPackage.REWRITING_RULE__RIGHT:
				return right != null && !right.isEmpty();
			case EmigPackage.REWRITING_RULE__RULE:
				return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //RewritingRuleImpl
