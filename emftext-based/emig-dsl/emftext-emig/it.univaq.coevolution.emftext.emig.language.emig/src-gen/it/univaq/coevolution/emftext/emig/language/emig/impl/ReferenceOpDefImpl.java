/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.Reference;
import it.univaq.coevolution.emftext.emig.language.emig.ReferenceOpDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ReferenceOpDefImpl#getReferencePar <em>Reference Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceOpDefImpl extends FeatureOpDefImpl implements ReferenceOpDef {
	/**
	 * The cached value of the '{@link #getReferencePar() <em>Reference Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencePar()
	 * @generated
	 * @ordered
	 */
	protected Reference referencePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceOpDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.REFERENCE_OP_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getReferencePar() {
		return referencePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencePar(Reference newReferencePar, NotificationChain msgs) {
		Reference oldReferencePar = referencePar;
		referencePar = newReferencePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR, oldReferencePar, newReferencePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencePar(Reference newReferencePar) {
		if (newReferencePar != referencePar) {
			NotificationChain msgs = null;
			if (referencePar != null)
				msgs = ((InternalEObject)referencePar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR, null, msgs);
			if (newReferencePar != null)
				msgs = ((InternalEObject)newReferencePar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR, null, msgs);
			msgs = basicSetReferencePar(newReferencePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR, newReferencePar, newReferencePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR:
				return basicSetReferencePar(null, msgs);
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
			case EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR:
				return getReferencePar();
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
			case EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR:
				setReferencePar((Reference)newValue);
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
			case EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR:
				setReferencePar((Reference)null);
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
			case EmigPackage.REFERENCE_OP_DEF__REFERENCE_PAR:
				return referencePar != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceOpDefImpl
