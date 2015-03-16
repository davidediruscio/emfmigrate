/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.Attribute;
import it.univaq.coevolution.emftext.emig.language.emig.AttributeOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.AttributeOpDefImpl#getAttributePar <em>Attribute Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeOpDefImpl extends FeatureOpDefImpl implements AttributeOpDef {
	/**
	 * The cached value of the '{@link #getAttributePar() <em>Attribute Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributePar()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeOpDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.ATTRIBUTE_OP_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributePar() {
		return attributePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributePar(Attribute newAttributePar, NotificationChain msgs) {
		Attribute oldAttributePar = attributePar;
		attributePar = newAttributePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR, oldAttributePar, newAttributePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributePar(Attribute newAttributePar) {
		if (newAttributePar != attributePar) {
			NotificationChain msgs = null;
			if (attributePar != null)
				msgs = ((InternalEObject)attributePar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR, null, msgs);
			if (newAttributePar != null)
				msgs = ((InternalEObject)newAttributePar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR, null, msgs);
			msgs = basicSetAttributePar(newAttributePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR, newAttributePar, newAttributePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR:
				return basicSetAttributePar(null, msgs);
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
			case EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR:
				return getAttributePar();
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
			case EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR:
				setAttributePar((Attribute)newValue);
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
			case EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR:
				setAttributePar((Attribute)null);
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
			case EmigPackage.ATTRIBUTE_OP_DEF__ATTRIBUTE_PAR:
				return attributePar != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeOpDefImpl
