/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.Attribute;
import it.univaq.coevolution.emftext.edelta.language.edelta.AttributeOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.AttributeImpl#getFeaturesOp <em>Features Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends FeatureImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getFeaturesOp() <em>Features Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesOp()
	 * @generated
	 * @ordered
	 */
	protected AttributeOperation featuresOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOperation getFeaturesOp() {
		return featuresOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeaturesOp(AttributeOperation newFeaturesOp, NotificationChain msgs) {
		AttributeOperation oldFeaturesOp = featuresOp;
		featuresOp = newFeaturesOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdeltaPackage.ATTRIBUTE__FEATURES_OP, oldFeaturesOp, newFeaturesOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturesOp(AttributeOperation newFeaturesOp) {
		if (newFeaturesOp != featuresOp) {
			NotificationChain msgs = null;
			if (featuresOp != null)
				msgs = ((InternalEObject)featuresOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.ATTRIBUTE__FEATURES_OP, null, msgs);
			if (newFeaturesOp != null)
				msgs = ((InternalEObject)newFeaturesOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.ATTRIBUTE__FEATURES_OP, null, msgs);
			msgs = basicSetFeaturesOp(newFeaturesOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.ATTRIBUTE__FEATURES_OP, newFeaturesOp, newFeaturesOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.ATTRIBUTE__FEATURES_OP:
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
			case EdeltaPackage.ATTRIBUTE__FEATURES_OP:
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
			case EdeltaPackage.ATTRIBUTE__FEATURES_OP:
				setFeaturesOp((AttributeOperation)newValue);
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
			case EdeltaPackage.ATTRIBUTE__FEATURES_OP:
				setFeaturesOp((AttributeOperation)null);
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
			case EdeltaPackage.ATTRIBUTE__FEATURES_OP:
				return featuresOp != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
