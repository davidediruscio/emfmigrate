/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation;

import it.univaq.coevolution.emftext.edelta.language.edelta.Type;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageImpl#getPackageOp <em>Package Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements it.univaq.coevolution.emftext.edelta.language.edelta.Package {
	/**
	 * The cached value of the '{@link #getPackageOp() <em>Package Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageOp()
	 * @generated
	 * @ordered
	 */
	protected PackageOperation packageOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageOperation getPackageOp() {
		return packageOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageOp(PackageOperation newPackageOp, NotificationChain msgs) {
		PackageOperation oldPackageOp = packageOp;
		packageOp = newPackageOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdeltaPackage.PACKAGE__PACKAGE_OP, oldPackageOp, newPackageOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageOp(PackageOperation newPackageOp) {
		if (newPackageOp != packageOp) {
			NotificationChain msgs = null;
			if (packageOp != null)
				msgs = ((InternalEObject)packageOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.PACKAGE__PACKAGE_OP, null, msgs);
			if (newPackageOp != null)
				msgs = ((InternalEObject)newPackageOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.PACKAGE__PACKAGE_OP, null, msgs);
			msgs = basicSetPackageOp(newPackageOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.PACKAGE__PACKAGE_OP, newPackageOp, newPackageOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.PACKAGE__PACKAGE_OP:
				return basicSetPackageOp(null, msgs);
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
			case EdeltaPackage.PACKAGE__PACKAGE_OP:
				return getPackageOp();
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
			case EdeltaPackage.PACKAGE__PACKAGE_OP:
				setPackageOp((PackageOperation)newValue);
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
			case EdeltaPackage.PACKAGE__PACKAGE_OP:
				setPackageOp((PackageOperation)null);
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
			case EdeltaPackage.PACKAGE__PACKAGE_OP:
				return packageOp != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
