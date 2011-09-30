/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.FilterMigrator;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.STRING;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 *   <li>{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl#getInternalFeature <em>Internal Feature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl#getDxobj <em>Dxobj</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FilterMigratorImpl#getDxgetters <em>Dxgetters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterMigratorImpl extends MinimalEObjectImpl.Container implements FilterMigrator
{
  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature feature;

  /**
   * The cached value of the '{@link #getInternalFeature() <em>Internal Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternalFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature internalFeature;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected STRING op;

  /**
   * The cached value of the '{@link #getDxobj() <em>Dxobj</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDxobj()
   * @generated
   * @ordered
   */
  protected EObject dxobj;

  /**
   * The cached value of the '{@link #getDxgetters() <em>Dxgetters</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDxgetters()
   * @generated
   * @ordered
   */
  protected EStructuralFeature dxgetters;

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
    return MigrationPackage.Literals.FILTER_MIGRATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EStructuralFeature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FILTER_MIGRATOR__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(EStructuralFeature newFeature)
  {
    EStructuralFeature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getInternalFeature()
  {
    if (internalFeature != null && internalFeature.eIsProxy())
    {
      InternalEObject oldInternalFeature = (InternalEObject)internalFeature;
      internalFeature = (EStructuralFeature)eResolveProxy(oldInternalFeature);
      if (internalFeature != oldInternalFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE, oldInternalFeature, internalFeature));
      }
    }
    return internalFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetInternalFeature()
  {
    return internalFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInternalFeature(EStructuralFeature newInternalFeature)
  {
    EStructuralFeature oldInternalFeature = internalFeature;
    internalFeature = newInternalFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE, oldInternalFeature, internalFeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(STRING newOp, NotificationChain msgs)
  {
    STRING oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(STRING newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FILTER_MIGRATOR__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FILTER_MIGRATOR__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getDxobj()
  {
    if (dxobj != null && dxobj.eIsProxy())
    {
      InternalEObject oldDxobj = (InternalEObject)dxobj;
      dxobj = eResolveProxy(oldDxobj);
      if (dxobj != oldDxobj)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FILTER_MIGRATOR__DXOBJ, oldDxobj, dxobj));
      }
    }
    return dxobj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetDxobj()
  {
    return dxobj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDxobj(EObject newDxobj)
  {
    EObject oldDxobj = dxobj;
    dxobj = newDxobj;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__DXOBJ, oldDxobj, dxobj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getDxgetters()
  {
    if (dxgetters != null && dxgetters.eIsProxy())
    {
      InternalEObject oldDxgetters = (InternalEObject)dxgetters;
      dxgetters = (EStructuralFeature)eResolveProxy(oldDxgetters);
      if (dxgetters != oldDxgetters)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FILTER_MIGRATOR__DXGETTERS, oldDxgetters, dxgetters));
      }
    }
    return dxgetters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetDxgetters()
  {
    return dxgetters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDxgetters(EStructuralFeature newDxgetters)
  {
    EStructuralFeature oldDxgetters = dxgetters;
    dxgetters = newDxgetters;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FILTER_MIGRATOR__DXGETTERS, oldDxgetters, dxgetters));
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
      case MigrationPackage.FILTER_MIGRATOR__OP:
        return basicSetOp(null, msgs);
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
      case MigrationPackage.FILTER_MIGRATOR__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE:
        if (resolve) return getInternalFeature();
        return basicGetInternalFeature();
      case MigrationPackage.FILTER_MIGRATOR__OP:
        return getOp();
      case MigrationPackage.FILTER_MIGRATOR__DXOBJ:
        if (resolve) return getDxobj();
        return basicGetDxobj();
      case MigrationPackage.FILTER_MIGRATOR__DXGETTERS:
        if (resolve) return getDxgetters();
        return basicGetDxgetters();
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
      case MigrationPackage.FILTER_MIGRATOR__FEATURE:
        setFeature((EStructuralFeature)newValue);
        return;
      case MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE:
        setInternalFeature((EStructuralFeature)newValue);
        return;
      case MigrationPackage.FILTER_MIGRATOR__OP:
        setOp((STRING)newValue);
        return;
      case MigrationPackage.FILTER_MIGRATOR__DXOBJ:
        setDxobj((EObject)newValue);
        return;
      case MigrationPackage.FILTER_MIGRATOR__DXGETTERS:
        setDxgetters((EStructuralFeature)newValue);
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
      case MigrationPackage.FILTER_MIGRATOR__FEATURE:
        setFeature((EStructuralFeature)null);
        return;
      case MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE:
        setInternalFeature((EStructuralFeature)null);
        return;
      case MigrationPackage.FILTER_MIGRATOR__OP:
        setOp((STRING)null);
        return;
      case MigrationPackage.FILTER_MIGRATOR__DXOBJ:
        setDxobj((EObject)null);
        return;
      case MigrationPackage.FILTER_MIGRATOR__DXGETTERS:
        setDxgetters((EStructuralFeature)null);
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
      case MigrationPackage.FILTER_MIGRATOR__FEATURE:
        return feature != null;
      case MigrationPackage.FILTER_MIGRATOR__INTERNAL_FEATURE:
        return internalFeature != null;
      case MigrationPackage.FILTER_MIGRATOR__OP:
        return op != null;
      case MigrationPackage.FILTER_MIGRATOR__DXOBJ:
        return dxobj != null;
      case MigrationPackage.FILTER_MIGRATOR__DXGETTERS:
        return dxgetters != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterMigratorImpl
