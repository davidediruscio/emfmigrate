/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.FeatureOpDefImpl#getFeatureOpDef <em>Feature Op Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureOpDefImpl extends OpDefImpl implements FeatureOpDef {
	/**
	 * The cached value of the '{@link #getFeatureOpDef() <em>Feature Op Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOpDef()
	 * @generated
	 * @ordered
	 */
	protected FeatureOpDef featureOpDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureOpDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.FEATURE_OP_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOpDef getFeatureOpDef() {
		if (featureOpDef != null && featureOpDef.eIsProxy()) {
			InternalEObject oldFeatureOpDef = (InternalEObject)featureOpDef;
			featureOpDef = (FeatureOpDef)eResolveProxy(oldFeatureOpDef);
			if (featureOpDef != oldFeatureOpDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF, oldFeatureOpDef, featureOpDef));
			}
		}
		return featureOpDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOpDef basicGetFeatureOpDef() {
		return featureOpDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOpDef(FeatureOpDef newFeatureOpDef) {
		FeatureOpDef oldFeatureOpDef = featureOpDef;
		featureOpDef = newFeatureOpDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF, oldFeatureOpDef, featureOpDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF:
				if (resolve) return getFeatureOpDef();
				return basicGetFeatureOpDef();
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
			case EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF:
				setFeatureOpDef((FeatureOpDef)newValue);
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
			case EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF:
				setFeatureOpDef((FeatureOpDef)null);
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
			case EmigPackage.FEATURE_OP_DEF__FEATURE_OP_DEF:
				return featureOpDef != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureOpDefImpl
