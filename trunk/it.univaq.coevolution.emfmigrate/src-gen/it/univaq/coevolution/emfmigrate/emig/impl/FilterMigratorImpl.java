/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjDX;
import it.univaq.coevolution.emfmigrate.emig.DotNavigationObjSX;
import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.FilterMigrator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Migrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl#getFeatureSX <em>Feature SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.FilterMigratorImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterMigratorImpl extends MinimalEObjectImpl.Container implements FilterMigrator
{
  /**
   * The cached value of the '{@link #getFeatureSX() <em>Feature SX</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureSX()
   * @generated
   * @ordered
   */
  protected DotNavigationObjSX featureSX;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected DotNavigationObjDX value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterMigratorImpl()
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
    return EmigPackage.Literals.FILTER_MIGRATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotNavigationObjSX getFeatureSX()
  {
    return featureSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFeatureSX(DotNavigationObjSX newFeatureSX, NotificationChain msgs)
  {
    DotNavigationObjSX oldFeatureSX = featureSX;
    featureSX = newFeatureSX;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.FILTER_MIGRATOR__FEATURE_SX, oldFeatureSX, newFeatureSX);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeatureSX(DotNavigationObjSX newFeatureSX)
  {
    if (newFeatureSX != featureSX)
    {
      NotificationChain msgs = null;
      if (featureSX != null)
        msgs = ((InternalEObject)featureSX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.FILTER_MIGRATOR__FEATURE_SX, null, msgs);
      if (newFeatureSX != null)
        msgs = ((InternalEObject)newFeatureSX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.FILTER_MIGRATOR__FEATURE_SX, null, msgs);
      msgs = basicSetFeatureSX(newFeatureSX, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.FILTER_MIGRATOR__FEATURE_SX, newFeatureSX, newFeatureSX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.FILTER_MIGRATOR__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotNavigationObjDX getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(DotNavigationObjDX newValue, NotificationChain msgs)
  {
    DotNavigationObjDX oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.FILTER_MIGRATOR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(DotNavigationObjDX newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.FILTER_MIGRATOR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.FILTER_MIGRATOR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.FILTER_MIGRATOR__VALUE, newValue, newValue));
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
      case EmigPackage.FILTER_MIGRATOR__FEATURE_SX:
        return basicSetFeatureSX(null, msgs);
      case EmigPackage.FILTER_MIGRATOR__VALUE:
        return basicSetValue(null, msgs);
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
      case EmigPackage.FILTER_MIGRATOR__FEATURE_SX:
        return getFeatureSX();
      case EmigPackage.FILTER_MIGRATOR__OP:
        return getOp();
      case EmigPackage.FILTER_MIGRATOR__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EmigPackage.FILTER_MIGRATOR__FEATURE_SX:
        setFeatureSX((DotNavigationObjSX)newValue);
        return;
      case EmigPackage.FILTER_MIGRATOR__OP:
        setOp((String)newValue);
        return;
      case EmigPackage.FILTER_MIGRATOR__VALUE:
        setValue((DotNavigationObjDX)newValue);
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
      case EmigPackage.FILTER_MIGRATOR__FEATURE_SX:
        setFeatureSX((DotNavigationObjSX)null);
        return;
      case EmigPackage.FILTER_MIGRATOR__OP:
        setOp(OP_EDEFAULT);
        return;
      case EmigPackage.FILTER_MIGRATOR__VALUE:
        setValue((DotNavigationObjDX)null);
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
      case EmigPackage.FILTER_MIGRATOR__FEATURE_SX:
        return featureSX != null;
      case EmigPackage.FILTER_MIGRATOR__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EmigPackage.FILTER_MIGRATOR__VALUE:
        return value != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //FilterMigratorImpl
