/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.PackageOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.Setter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl#getClassesoperations <em>Classesoperations</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.PackageOperationImpl#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageOperationImpl extends EObjectImpl implements PackageOperation {
	/**
	 * The cached value of the '{@link #getClassesoperations() <em>Classesoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<it.univaq.coevolution.emftext.edelta.language.edelta.Class> classesoperations;

	/**
	 * The cached value of the '{@link #getSetter() <em>Setter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetter()
	 * @generated
	 * @ordered
	 */
	protected EList<Setter> setter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.PACKAGE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<it.univaq.coevolution.emftext.edelta.language.edelta.Class> getClassesoperations() {
		if (classesoperations == null) {
			classesoperations = new EObjectContainmentEList<it.univaq.coevolution.emftext.edelta.language.edelta.Class>(it.univaq.coevolution.emftext.edelta.language.edelta.Class.class, this, EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS);
		}
		return classesoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setter> getSetter() {
		if (setter == null) {
			setter = new EObjectContainmentEList<Setter>(Setter.class, this, EdeltaPackage.PACKAGE_OPERATION__SETTER);
		}
		return setter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS:
				return ((InternalEList<?>)getClassesoperations()).basicRemove(otherEnd, msgs);
			case EdeltaPackage.PACKAGE_OPERATION__SETTER:
				return ((InternalEList<?>)getSetter()).basicRemove(otherEnd, msgs);
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
			case EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS:
				return getClassesoperations();
			case EdeltaPackage.PACKAGE_OPERATION__SETTER:
				return getSetter();
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
			case EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS:
				getClassesoperations().clear();
				getClassesoperations().addAll((Collection<? extends it.univaq.coevolution.emftext.edelta.language.edelta.Class>)newValue);
				return;
			case EdeltaPackage.PACKAGE_OPERATION__SETTER:
				getSetter().clear();
				getSetter().addAll((Collection<? extends Setter>)newValue);
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
			case EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS:
				getClassesoperations().clear();
				return;
			case EdeltaPackage.PACKAGE_OPERATION__SETTER:
				getSetter().clear();
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
			case EdeltaPackage.PACKAGE_OPERATION__CLASSESOPERATIONS:
				return classesoperations != null && !classesoperations.isEmpty();
			case EdeltaPackage.PACKAGE_OPERATION__SETTER:
				return setter != null && !setter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageOperationImpl
