/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorCall;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;

import it.univaq.coevolution.emftext.edelta.language.edelta.Type;
import it.univaq.coevolution.emftext.edelta.language.edelta.NamedElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassImpl#getClassOp <em>Class Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends NamedElementImpl implements it.univaq.coevolution.emftext.edelta.language.edelta.Class {
	/**
	 * The cached value of the '{@link #getClassOp() <em>Class Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassOp()
	 * @generated
	 * @ordered
	 */
	protected ClassOperation classOp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperation getClassOp() {
		return classOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassOp(ClassOperation newClassOp, NotificationChain msgs) {
		ClassOperation oldClassOp = classOp;
		classOp = newClassOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdeltaPackage.CLASS__CLASS_OP, oldClassOp, newClassOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassOp(ClassOperation newClassOp) {
		if (newClassOp != classOp) {
			NotificationChain msgs = null;
			if (classOp != null)
				msgs = ((InternalEObject)classOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.CLASS__CLASS_OP, null, msgs);
			if (newClassOp != null)
				msgs = ((InternalEObject)newClassOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.CLASS__CLASS_OP, null, msgs);
			msgs = basicSetClassOp(newClassOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.CLASS__CLASS_OP, newClassOp, newClassOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.CLASS__CLASS_OP:
				return basicSetClassOp(null, msgs);
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
			case EdeltaPackage.CLASS__CLASS_OP:
				return getClassOp();
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
			case EdeltaPackage.CLASS__CLASS_OP:
				setClassOp((ClassOperation)newValue);
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
			case EdeltaPackage.CLASS__CLASS_OP:
				setClassOp((ClassOperation)null);
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
			case EdeltaPackage.CLASS__CLASS_OP:
				return classOp != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassImpl
