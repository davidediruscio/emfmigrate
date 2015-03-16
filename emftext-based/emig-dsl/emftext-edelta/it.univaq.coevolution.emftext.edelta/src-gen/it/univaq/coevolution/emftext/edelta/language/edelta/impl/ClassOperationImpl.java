/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.ClassOperation;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.Feature;
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
 * An implementation of the model object '<em><b>Class Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl#getFeaturesoperations <em>Featuresoperations</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ClassOperationImpl#getSetter <em>Setter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassOperationImpl extends EObjectImpl implements ClassOperation {
	/**
	 * The cached value of the '{@link #getFeaturesoperations() <em>Featuresoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturesoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> featuresoperations;

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
	protected ClassOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.CLASS_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeaturesoperations() {
		if (featuresoperations == null) {
			featuresoperations = new EObjectContainmentEList<Feature>(Feature.class, this, EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS);
		}
		return featuresoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Setter> getSetter() {
		if (setter == null) {
			setter = new EObjectContainmentEList<Setter>(Setter.class, this, EdeltaPackage.CLASS_OPERATION__SETTER);
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
			case EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS:
				return ((InternalEList<?>)getFeaturesoperations()).basicRemove(otherEnd, msgs);
			case EdeltaPackage.CLASS_OPERATION__SETTER:
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
			case EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS:
				return getFeaturesoperations();
			case EdeltaPackage.CLASS_OPERATION__SETTER:
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
			case EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS:
				getFeaturesoperations().clear();
				getFeaturesoperations().addAll((Collection<? extends Feature>)newValue);
				return;
			case EdeltaPackage.CLASS_OPERATION__SETTER:
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
			case EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS:
				getFeaturesoperations().clear();
				return;
			case EdeltaPackage.CLASS_OPERATION__SETTER:
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
			case EdeltaPackage.CLASS_OPERATION__FEATURESOPERATIONS:
				return featuresoperations != null && !featuresoperations.isEmpty();
			case EdeltaPackage.CLASS_OPERATION__SETTER:
				return setter != null && !setter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassOperationImpl
