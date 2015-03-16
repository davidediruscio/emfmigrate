/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.Parameter;
import it.univaq.coevolution.emfmigrate.emig.setterDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>setter Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.setterDefImpl#getPar <em>Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class setterDefImpl extends MinimalEObjectImpl.Container implements setterDef
{
  /**
   * The cached value of the '{@link #getMetafeature() <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetafeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature metafeature;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getPar() <em>Par</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected EList<Parameter> par;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected setterDefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EmigPackage.Literals.SETTER_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getMetafeature()
  {
    if (metafeature != null && metafeature.eIsProxy())
    {
      InternalEObject oldMetafeature = (InternalEObject)metafeature;
      metafeature = (EStructuralFeature)eResolveProxy(oldMetafeature);
      if (metafeature != oldMetafeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmigPackage.SETTER_DEF__METAFEATURE, oldMetafeature, metafeature));
      }
    }
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetMetafeature()
  {
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetafeature(EStructuralFeature newMetafeature)
  {
    EStructuralFeature oldMetafeature = metafeature;
    metafeature = newMetafeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.SETTER_DEF__METAFEATURE, oldMetafeature, metafeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.SETTER_DEF__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getPar()
  {
    if (par == null)
    {
      par = new EObjectContainmentEList<Parameter>(Parameter.class, this, EmigPackage.SETTER_DEF__PAR);
    }
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EmigPackage.SETTER_DEF__PAR:
        return ((InternalEList<?>)getPar()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EmigPackage.SETTER_DEF__METAFEATURE:
        if (resolve) return getMetafeature();
        return basicGetMetafeature();
      case EmigPackage.SETTER_DEF__OPERATOR:
        return getOperator();
      case EmigPackage.SETTER_DEF__PAR:
        return getPar();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EmigPackage.SETTER_DEF__METAFEATURE:
        setMetafeature((EStructuralFeature)newValue);
        return;
      case EmigPackage.SETTER_DEF__OPERATOR:
        setOperator((String)newValue);
        return;
      case EmigPackage.SETTER_DEF__PAR:
        getPar().clear();
        getPar().addAll((Collection<? extends Parameter>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EmigPackage.SETTER_DEF__METAFEATURE:
        setMetafeature((EStructuralFeature)null);
        return;
      case EmigPackage.SETTER_DEF__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case EmigPackage.SETTER_DEF__PAR:
        getPar().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EmigPackage.SETTER_DEF__METAFEATURE:
        return metafeature != null;
      case EmigPackage.SETTER_DEF__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case EmigPackage.SETTER_DEF__PAR:
        return par != null && !par.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //setterDefImpl
