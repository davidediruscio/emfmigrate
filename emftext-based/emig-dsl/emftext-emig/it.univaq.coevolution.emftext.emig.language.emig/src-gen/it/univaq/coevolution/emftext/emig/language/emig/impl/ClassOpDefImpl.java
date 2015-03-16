/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import it.univaq.coevolution.emftext.emig.language.emig.ClassOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.FeatureOpDef;
import it.univaq.coevolution.emftext.emig.language.emig.Feature;

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
 * An implementation of the model object '<em><b>Class Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl#getFeatureOp <em>Feature Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.ClassOpDefImpl#getClassPar <em>Class Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassOpDefImpl extends OpDefImpl implements ClassOpDef {
	/**
	 * The cached value of the '{@link #getFeatureOp() <em>Feature Op</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOp()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureOpDef> featureOp;

	/**
	 * The cached value of the '{@link #getClassPar() <em>Class Par</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassPar()
	 * @generated
	 * @ordered
	 */
	protected it.univaq.coevolution.emftext.emig.language.emig.Class classPar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassOpDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.CLASS_OP_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureOpDef> getFeatureOp() {
		if (featureOp == null) {
			featureOp = new EObjectContainmentEList<FeatureOpDef>(FeatureOpDef.class, this, EmigPackage.CLASS_OP_DEF__FEATURE_OP);
		}
		return featureOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.univaq.coevolution.emftext.emig.language.emig.Class getClassPar() {
		return classPar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassPar(it.univaq.coevolution.emftext.emig.language.emig.Class newClassPar, NotificationChain msgs) {
		it.univaq.coevolution.emftext.emig.language.emig.Class oldClassPar = classPar;
		classPar = newClassPar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.CLASS_OP_DEF__CLASS_PAR, oldClassPar, newClassPar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassPar(it.univaq.coevolution.emftext.emig.language.emig.Class newClassPar) {
		if (newClassPar != classPar) {
			NotificationChain msgs = null;
			if (classPar != null)
				msgs = ((InternalEObject)classPar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.CLASS_OP_DEF__CLASS_PAR, null, msgs);
			if (newClassPar != null)
				msgs = ((InternalEObject)newClassPar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.CLASS_OP_DEF__CLASS_PAR, null, msgs);
			msgs = basicSetClassPar(newClassPar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.CLASS_OP_DEF__CLASS_PAR, newClassPar, newClassPar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.CLASS_OP_DEF__FEATURE_OP:
				return ((InternalEList<?>)getFeatureOp()).basicRemove(otherEnd, msgs);
			case EmigPackage.CLASS_OP_DEF__CLASS_PAR:
				return basicSetClassPar(null, msgs);
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
			case EmigPackage.CLASS_OP_DEF__FEATURE_OP:
				return getFeatureOp();
			case EmigPackage.CLASS_OP_DEF__CLASS_PAR:
				return getClassPar();
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
			case EmigPackage.CLASS_OP_DEF__FEATURE_OP:
				getFeatureOp().clear();
				getFeatureOp().addAll((Collection<? extends FeatureOpDef>)newValue);
				return;
			case EmigPackage.CLASS_OP_DEF__CLASS_PAR:
				setClassPar((it.univaq.coevolution.emftext.emig.language.emig.Class)newValue);
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
			case EmigPackage.CLASS_OP_DEF__FEATURE_OP:
				getFeatureOp().clear();
				return;
			case EmigPackage.CLASS_OP_DEF__CLASS_PAR:
				setClassPar((it.univaq.coevolution.emftext.emig.language.emig.Class)null);
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
			case EmigPackage.CLASS_OP_DEF__FEATURE_OP:
				return featureOp != null && !featureOp.isEmpty();
			case EmigPackage.CLASS_OP_DEF__CLASS_PAR:
				return classPar != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassOpDefImpl
