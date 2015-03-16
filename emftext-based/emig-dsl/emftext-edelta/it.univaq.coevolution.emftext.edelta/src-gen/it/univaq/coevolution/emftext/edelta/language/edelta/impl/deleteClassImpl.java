/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.deleteClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>delete Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.deleteClassImpl#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class deleteClassImpl extends ClassOperationImpl implements deleteClass {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected it.univaq.coevolution.emftext.edelta.language.edelta.Class ref;

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
	protected deleteClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.DELETE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Class getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (it.univaq.coevolution.emftext.edelta.language.edelta.Class)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdeltaPackage.DELETE_CLASS__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.edelta.language.edelta.Class basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(it.univaq.coevolution.emftext.edelta.language.edelta.Class newRef) {
		it.univaq.coevolution.emftext.edelta.language.edelta.Class oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.DELETE_CLASS__REF, oldRef, ref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.DELETE_CLASS__EXT, oldExt, ext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdeltaPackage.DELETE_CLASS__REF:
				if (resolve) return getRef();
				return basicGetRef();
			case EdeltaPackage.DELETE_CLASS__EXT:
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
			case EdeltaPackage.DELETE_CLASS__REF:
				setRef((it.univaq.coevolution.emftext.edelta.language.edelta.Class)newValue);
				return;
			case EdeltaPackage.DELETE_CLASS__EXT:
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
			case EdeltaPackage.DELETE_CLASS__REF:
				setRef((it.univaq.coevolution.emftext.edelta.language.edelta.Class)null);
				return;
			case EdeltaPackage.DELETE_CLASS__EXT:
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
			case EdeltaPackage.DELETE_CLASS__REF:
				return ref != null;
			case EdeltaPackage.DELETE_CLASS__EXT:
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

} //deleteClassImpl
