/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.Reference;
import it.univaq.coevolution.emftext.edelta.language.edelta.ReferenceOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ReferenceImpl#getFeaturesOp <em>Features Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends FeatureImpl implements Reference {
	/**
	 * The cached value of the '{@link #getFeaturesOp() <em>Features Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesOp()
	 * @generated
	 * @ordered
	 */
	protected ReferenceOperation featuresOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceOperation getFeaturesOp() {
		return featuresOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturesOp(ReferenceOperation newFeaturesOp, NotificationChain msgs) {
		ReferenceOperation oldFeaturesOp = featuresOp;
		featuresOp = newFeaturesOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdeltaPackage.REFERENCE__FEATURES_OP, oldFeaturesOp, newFeaturesOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesOp(ReferenceOperation newFeaturesOp) {
		if (newFeaturesOp != featuresOp) {
			NotificationChain msgs = null;
			if (featuresOp != null)
				msgs = ((InternalEObject)featuresOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.REFERENCE__FEATURES_OP, null, msgs);
			if (newFeaturesOp != null)
				msgs = ((InternalEObject)newFeaturesOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.REFERENCE__FEATURES_OP, null, msgs);
			msgs = basicSetFeaturesOp(newFeaturesOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.REFERENCE__FEATURES_OP, newFeaturesOp, newFeaturesOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.REFERENCE__FEATURES_OP:
				return basicSetFeaturesOp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdeltaPackage.REFERENCE__FEATURES_OP:
				return getFeaturesOp();
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
			case EdeltaPackage.REFERENCE__FEATURES_OP:
				setFeaturesOp((ReferenceOperation)newValue);
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
			case EdeltaPackage.REFERENCE__FEATURES_OP:
				setFeaturesOp((ReferenceOperation)null);
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
			case EdeltaPackage.REFERENCE__FEATURES_OP:
				return featuresOp != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
