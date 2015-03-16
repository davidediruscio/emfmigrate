/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.PackageOpDef;

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
 * An implementation of the model object '<em><b>Package Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl#getClassesOp <em>Classes Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.PackageOpDefImpl#getPackagePar <em>Package Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageOpDefImpl extends OpDefImpl implements PackageOpDef {
	/**
	 * The cached value of the '{@link #getClassesOp() <em>Classes Op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassesOp()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassOpDef> classesOp;

	/**
	 * The cached value of the '{@link #getPackagePar() <em>Package Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePar()
	 * @generated
	 * @ordered
	 */
	protected it.univaq.coevolution.emftext.emig.language.emig.Package packagePar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageOpDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.PACKAGE_OP_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassOpDef> getClassesOp() {
		if (classesOp == null) {
			classesOp = new EObjectContainmentEList<ClassOpDef>(ClassOpDef.class, this, EmigPackage.PACKAGE_OP_DEF__CLASSES_OP);
		}
		return classesOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.Package getPackagePar() {
		return packagePar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackagePar(it.univaq.coevolution.emftext.emig.language.emig.Package newPackagePar, NotificationChain msgs) {
		it.univaq.coevolution.emftext.emig.language.emig.Package oldPackagePar = packagePar;
		packagePar = newPackagePar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR, oldPackagePar, newPackagePar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePar(it.univaq.coevolution.emftext.emig.language.emig.Package newPackagePar) {
		if (newPackagePar != packagePar) {
			NotificationChain msgs = null;
			if (packagePar != null)
				msgs = ((InternalEObject)packagePar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR, null, msgs);
			if (newPackagePar != null)
				msgs = ((InternalEObject)newPackagePar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR, null, msgs);
			msgs = basicSetPackagePar(newPackagePar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR, newPackagePar, newPackagePar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.PACKAGE_OP_DEF__CLASSES_OP:
				return ((InternalEList<?>)getClassesOp()).basicRemove(otherEnd, msgs);
			case EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR:
				return basicSetPackagePar(null, msgs);
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
			case EmigPackage.PACKAGE_OP_DEF__CLASSES_OP:
				return getClassesOp();
			case EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR:
				return getPackagePar();
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
			case EmigPackage.PACKAGE_OP_DEF__CLASSES_OP:
				getClassesOp().clear();
				getClassesOp().addAll((Collection<? extends ClassOpDef>)newValue);
				return;
			case EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR:
				setPackagePar((it.univaq.coevolution.emftext.emig.language.emig.Package)newValue);
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
			case EmigPackage.PACKAGE_OP_DEF__CLASSES_OP:
				getClassesOp().clear();
				return;
			case EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR:
				setPackagePar((it.univaq.coevolution.emftext.emig.language.emig.Package)null);
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
			case EmigPackage.PACKAGE_OP_DEF__CLASSES_OP:
				return classesOp != null && !classesOp.isEmpty();
			case EmigPackage.PACKAGE_OP_DEF__PACKAGE_PAR:
				return packagePar != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageOpDefImpl
