/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emfmigrate.EmigOcl.impl;

import it.univaq.coevolution.emfmigrate.EmigOcl.EmigOclPackage;
import it.univaq.coevolution.emfmigrate.EmigOcl.LambdaType;
import it.univaq.coevolution.emfmigrate.EmigOcl.OclType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lambda Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.EmigOcl.impl.LambdaTypeImpl#getArgumentTypes <em>Argument Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LambdaTypeImpl extends OclTypeImpl implements LambdaType {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected OclType returnType;

	/**
	 * The cached value of the '{@link #getArgumentTypes() <em>Argument Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<OclType> argumentTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LambdaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigOclPackage.Literals.LAMBDA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OclType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(OclType newReturnType, NotificationChain msgs) {
		OclType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(OclType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OclType> getArgumentTypes() {
		if (argumentTypes == null) {
			argumentTypes = new EObjectContainmentEList<OclType>(OclType.class, this, EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES);
		}
		return argumentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES:
				return ((InternalEList<?>)getArgumentTypes()).basicRemove(otherEnd, msgs);
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
			case EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE:
				return getReturnType();
			case EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES:
				return getArgumentTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE:
				setReturnType((OclType)newValue);
				return;
			case EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES:
				getArgumentTypes().clear();
				getArgumentTypes().addAll((Collection<? extends OclType>)newValue);
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
			case EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE:
				setReturnType((OclType)null);
				return;
			case EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES:
				getArgumentTypes().clear();
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
			case EmigOclPackage.LAMBDA_TYPE__RETURN_TYPE:
				return returnType != null;
			case EmigOclPackage.LAMBDA_TYPE__ARGUMENT_TYPES:
				return argumentTypes != null && !argumentTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LambdaTypeImpl
