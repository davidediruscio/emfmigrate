/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.Binding;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.RewritingRule;
import it.univaq.coevolution.emftext.emig.language.emig.RightRuleElement;

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

import be.ac.vub.simpleocl.impl.VariableDeclarationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl#getRewritingRule <em>Rewriting Rule</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.RightRuleElementImpl#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightRuleElementImpl extends VariableDeclarationImpl implements RightRuleElement {
	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightRuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.RIGHT_RULE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewritingRule getRewritingRule() {
		if (eContainerFeatureID() != EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE) return null;
		return (RewritingRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRewritingRule(RewritingRule newRewritingRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRewritingRule, EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRewritingRule(RewritingRule newRewritingRule) {
		if (newRewritingRule != eInternalContainer() || (eContainerFeatureID() != EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE && newRewritingRule != null)) {
			if (EcoreUtil.isAncestor(this, newRewritingRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRewritingRule != null)
				msgs = ((InternalEObject)newRewritingRule).eInverseAdd(this, EmigPackage.REWRITING_RULE__RIGHT, RewritingRule.class, msgs);
			msgs = basicSetRewritingRule(newRewritingRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE, newRewritingRule, newRewritingRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this, EmigPackage.RIGHT_RULE_ELEMENT__BINDING, EmigPackage.BINDING__RULE_ELEMENT);
		}
		return binding;
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRewritingRule((RewritingRule)otherEnd, msgs);
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBinding()).basicAdd(otherEnd, msgs);
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				return basicSetRewritingRule(null, msgs);
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				return ((InternalEList<?>)getBinding()).basicRemove(otherEnd, msgs);
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				return eInternalContainer().eInverseRemove(this, EmigPackage.REWRITING_RULE__RIGHT, RewritingRule.class, msgs);
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				return getRewritingRule();
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				return getBinding();
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				setRewritingRule((RewritingRule)newValue);
				return;
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				getBinding().clear();
				getBinding().addAll((Collection<? extends Binding>)newValue);
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				setRewritingRule((RewritingRule)null);
				return;
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				getBinding().clear();
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
			case EmigPackage.RIGHT_RULE_ELEMENT__REWRITING_RULE:
				return getRewritingRule() != null;
			case EmigPackage.RIGHT_RULE_ELEMENT__BINDING:
				return binding != null && !binding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RightRuleElementImpl
