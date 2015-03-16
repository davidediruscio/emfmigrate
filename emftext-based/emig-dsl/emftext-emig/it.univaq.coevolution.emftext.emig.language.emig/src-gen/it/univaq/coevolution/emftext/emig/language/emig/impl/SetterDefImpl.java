/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.coevolution.emftext.emig.language.emig.impl;

import be.ac.vub.simpleocl.OclExpression;
import be.ac.vub.simpleocl.Primitive;
import it.univaq.coevolution.emftext.emig.language.emig.EmigPackage;
import it.univaq.coevolution.emftext.emig.language.emig.MParameter;
import it.univaq.coevolution.emftext.emig.language.emig.SetterDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import be.ac.vub.simpleocl.impl.LocatedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setter Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.emftext.emig.language.emig.impl.SetterDefImpl#getParametersDef <em>Parameters Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetterDefImpl extends LocatedElementImpl implements SetterDef {
	/**
	 * The default value of the '{@link #getMetafeature() <em>Metafeature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetafeature()
	 * @generated
	 * @ordered
	 */
	protected static final String METAFEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetafeature() <em>Metafeature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetafeature()
	 * @generated
	 * @ordered
	 */
	protected String metafeature = METAFEATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParametersDef() <em>Parameters Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersDef()
	 * @generated
	 * @ordered
	 */
	protected EList<MParameter> parametersDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetterDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmigPackage.Literals.SETTER_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetafeature() {
		return metafeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetafeature(String newMetafeature) {
		String oldMetafeature = metafeature;
		metafeature = newMetafeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.SETTER_DEF__METAFEATURE, oldMetafeature, metafeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MParameter> getParametersDef() {
		if (parametersDef == null) {
			parametersDef = new EObjectContainmentEList<MParameter>(MParameter.class, this, EmigPackage.SETTER_DEF__PARAMETERS_DEF);
		}
		return parametersDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmigPackage.SETTER_DEF__PARAMETERS_DEF:
				return ((InternalEList<?>)getParametersDef()).basicRemove(otherEnd, msgs);
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
			case EmigPackage.SETTER_DEF__METAFEATURE:
				return getMetafeature();
			case EmigPackage.SETTER_DEF__PARAMETERS_DEF:
				return getParametersDef();
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
			case EmigPackage.SETTER_DEF__METAFEATURE:
				setMetafeature((String)newValue);
				return;
			case EmigPackage.SETTER_DEF__PARAMETERS_DEF:
				getParametersDef().clear();
				getParametersDef().addAll((Collection<? extends MParameter>)newValue);
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
			case EmigPackage.SETTER_DEF__METAFEATURE:
				setMetafeature(METAFEATURE_EDEFAULT);
				return;
			case EmigPackage.SETTER_DEF__PARAMETERS_DEF:
				getParametersDef().clear();
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
			case EmigPackage.SETTER_DEF__METAFEATURE:
				return METAFEATURE_EDEFAULT == null ? metafeature != null : !METAFEATURE_EDEFAULT.equals(metafeature);
			case EmigPackage.SETTER_DEF__PARAMETERS_DEF:
				return parametersDef != null && !parametersDef.isEmpty();
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
		result.append(" (metafeature: ");
		result.append(metafeature);
		result.append(')');
		return result.toString();
	}

} //SetterDefImpl
