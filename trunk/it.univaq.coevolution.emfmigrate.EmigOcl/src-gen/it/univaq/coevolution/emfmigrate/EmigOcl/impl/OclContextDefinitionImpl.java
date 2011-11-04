/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.impl;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclContextDefinition;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclFeatureDefinition;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ocl Context Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.OclContextDefinitionImpl#getContext_ <em>Context </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OclContextDefinitionImpl extends LocatedElementImpl implements OclContextDefinition {
	/**
	 * The cached value of the '{@link #getContext_() <em>Context </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext_()
	 * @generated
	 * @ordered
	 */
	protected OclType context_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OclContextDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigOclPackage.Literals.OCL_CONTEXT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclFeatureDefinition getDefinition() {
		if (eContainerFeatureID() != EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION) return null;
		return (OclFeatureDefinition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(OclFeatureDefinition newDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDefinition, EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(OclFeatureDefinition newDefinition) {
		if (newDefinition != eInternalContainer() || (eContainerFeatureID() != EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION && newDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EmigOclPackage.OCL_FEATURE_DEFINITION__CONTEXT_, OclFeatureDefinition.class, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getContext_() {
		return context_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext_(OclType newContext_, NotificationChain msgs) {
		OclType oldContext_ = context_;
		context_ = newContext_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, oldContext_, newContext_);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext_(OclType newContext_) {
		if (newContext_ != context_) {
			NotificationChain msgs = null;
			if (context_ != null)
				msgs = ((InternalEObject)context_).eInverseRemove(this, EmigOclPackage.OCL_TYPE__DEFINITIONS, OclType.class, msgs);
			if (newContext_ != null)
				msgs = ((InternalEObject)newContext_).eInverseAdd(this, EmigOclPackage.OCL_TYPE__DEFINITIONS, OclType.class, msgs);
			msgs = basicSetContext_(newContext_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, newContext_, newContext_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDefinition((OclFeatureDefinition)otherEnd, msgs);
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				if (context_ != null)
					msgs = ((InternalEObject)context_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_, null, msgs);
				return basicSetContext_((OclType)otherEnd, msgs);
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				return basicSetContext_(null, msgs);
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				return eInternalContainer().eInverseRemove(this, EmigOclPackage.OCL_FEATURE_DEFINITION__CONTEXT_, OclFeatureDefinition.class, msgs);
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				return getDefinition();
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				return getContext_();
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				setDefinition((OclFeatureDefinition)newValue);
				return;
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				setContext_((OclType)newValue);
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				setDefinition((OclFeatureDefinition)null);
				return;
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				setContext_((OclType)null);
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
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__DEFINITION:
				return getDefinition() != null;
			case EmigOclPackage.OCL_CONTEXT_DEFINITION__CONTEXT_:
				return context_ != null;
		}
		return super.eIsSet(featureID);
	}

} //OclContextDefinitionImpl
