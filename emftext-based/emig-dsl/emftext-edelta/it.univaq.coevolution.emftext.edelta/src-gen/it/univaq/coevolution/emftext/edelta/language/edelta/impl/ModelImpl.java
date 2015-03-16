/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.edelta.language.edelta.impl;

import it.univaq.coevolution.emftext.edelta.language.edelta.ComplexOperatorDef;
import it.univaq.coevolution.emftext.edelta.language.edelta.DataType;
import it.univaq.coevolution.emftext.edelta.language.edelta.EdeltaPackage;
import it.univaq.coevolution.emftext.edelta.language.edelta.Model;
import it.univaq.coevolution.emftext.edelta.language.edelta.Module;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl#getPackageoperations <em>Packageoperations</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl#getModule <em>Module</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.edelta.language.edelta.impl.ModelImpl#getDatatypes <em>Datatypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getPackageoperations() <em>Packageoperations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageoperations()
	 * @generated
	 * @ordered
	 */
	protected EList<it.univaq.coevolution.emftext.edelta.language.edelta.Package> packageoperations;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected Module module;

	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdeltaPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<it.univaq.coevolution.emftext.edelta.language.edelta.Package> getPackageoperations() {
		if (packageoperations == null) {
			packageoperations = new EObjectContainmentEList<it.univaq.coevolution.emftext.edelta.language.edelta.Package>(it.univaq.coevolution.emftext.edelta.language.edelta.Package.class, this, EdeltaPackage.MODEL__PACKAGEOPERATIONS);
		}
		return packageoperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		Module oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdeltaPackage.MODEL__MODULE, oldModule, newModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject)module).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.MODEL__MODULE, null, msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdeltaPackage.MODEL__MODULE, null, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdeltaPackage.MODEL__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DataType>(DataType.class, this, EdeltaPackage.MODEL__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdeltaPackage.MODEL__PACKAGEOPERATIONS:
				return ((InternalEList<?>)getPackageoperations()).basicRemove(otherEnd, msgs);
			case EdeltaPackage.MODEL__MODULE:
				return basicSetModule(null, msgs);
			case EdeltaPackage.MODEL__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
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
			case EdeltaPackage.MODEL__PACKAGEOPERATIONS:
				return getPackageoperations();
			case EdeltaPackage.MODEL__MODULE:
				return getModule();
			case EdeltaPackage.MODEL__DATATYPES:
				return getDatatypes();
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
			case EdeltaPackage.MODEL__PACKAGEOPERATIONS:
				getPackageoperations().clear();
				getPackageoperations().addAll((Collection<? extends it.univaq.coevolution.emftext.edelta.language.edelta.Package>)newValue);
				return;
			case EdeltaPackage.MODEL__MODULE:
				setModule((Module)newValue);
				return;
			case EdeltaPackage.MODEL__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DataType>)newValue);
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
			case EdeltaPackage.MODEL__PACKAGEOPERATIONS:
				getPackageoperations().clear();
				return;
			case EdeltaPackage.MODEL__MODULE:
				setModule((Module)null);
				return;
			case EdeltaPackage.MODEL__DATATYPES:
				getDatatypes().clear();
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
			case EdeltaPackage.MODEL__PACKAGEOPERATIONS:
				return packageoperations != null && !packageoperations.isEmpty();
			case EdeltaPackage.MODEL__MODULE:
				return module != null;
			case EdeltaPackage.MODEL__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
