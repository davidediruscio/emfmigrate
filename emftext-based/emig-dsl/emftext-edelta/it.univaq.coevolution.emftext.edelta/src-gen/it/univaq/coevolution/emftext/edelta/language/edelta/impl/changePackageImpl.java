/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.changePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>change Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.changePackageImpl#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class changePackageImpl extends PackageOperationImpl implements changePackage {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected it.univaq.coevolution.emftext.edelta.language.edelta.Package ref;

	/**
	 * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected String ext = EXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected changePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.CHANGE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Package getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (it.univaq.coevolution.emftext.edelta.language.edelta.Package)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdeltaPackage.CHANGE_PACKAGE__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Package basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(it.univaq.coevolution.emftext.edelta.language.edelta.Package newRef) {
		it.univaq.coevolution.emftext.edelta.language.edelta.Package oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.CHANGE_PACKAGE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExt(String newExt) {
		String oldExt = ext;
		ext = newExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.CHANGE_PACKAGE__EXT, oldExt, ext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdeltaPackage.CHANGE_PACKAGE__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case EdeltaPackage.CHANGE_PACKAGE__EXT:
				return getExt();
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
			case EdeltaPackage.CHANGE_PACKAGE__REF:
				setRef((it.univaq.coevolution.emftext.edelta.language.edelta.Package)newValue);
				return;
			case EdeltaPackage.CHANGE_PACKAGE__EXT:
				setExt((String)newValue);
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
			case EdeltaPackage.CHANGE_PACKAGE__REF:
				setRef((it.univaq.coevolution.emftext.edelta.language.edelta.Package)null);
				return;
			case EdeltaPackage.CHANGE_PACKAGE__EXT:
				setExt(EXT_EDEFAULT);
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
			case EdeltaPackage.CHANGE_PACKAGE__REF:
				return ref != null;
			case EdeltaPackage.CHANGE_PACKAGE__EXT:
				return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ext: ");
		result.append(ext);
		result.append(')');
		return result.toString();
	}

} //changePackageImpl
