/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.FilterMigrator;
import org.xtext.example.mydsl.myDsl.MigratorDX;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrator DX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MigratorDXImpl#getFilterDX <em>Filter DX</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigratorDXImpl extends MigratorImpl implements MigratorDX
{
  /**
   * The cached value of the '{@link #getElementDX() <em>Element DX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementDX()
   * @generated
   * @ordered
   */
  protected EClass elementDX;

  /**
   * The cached value of the '{@link #getFilterDX() <em>Filter DX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterDX()
   * @generated
   * @ordered
   */
  protected EList<FilterMigrator> filterDX;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MigratorDXImpl()
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
    return MyDslPackage.Literals.MIGRATOR_DX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementDX()
  {
    if (elementDX != null && elementDX.eIsProxy())
    {
      InternalEObject oldElementDX = (InternalEObject)elementDX;
      elementDX = (EClass)eResolveProxy(oldElementDX);
      if (elementDX != oldElementDX)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
      }
    }
    return elementDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetElementDX()
  {
    return elementDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementDX(EClass newElementDX)
  {
    EClass oldElementDX = elementDX;
    elementDX = newElementDX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FilterMigrator> getFilterDX()
  {
    if (filterDX == null)
    {
      filterDX = new EObjectContainmentEList<FilterMigrator>(FilterMigrator.class, this, MyDslPackage.MIGRATOR_DX__FILTER_DX);
    }
    return filterDX;
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
      case MyDslPackage.MIGRATOR_DX__FILTER_DX:
        return ((InternalEList<?>)getFilterDX()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MIGRATOR_DX__ELEMENT_DX:
        if (resolve) return getElementDX();
        return basicGetElementDX();
      case MyDslPackage.MIGRATOR_DX__FILTER_DX:
        return getFilterDX();
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
      case MyDslPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)newValue);
        return;
      case MyDslPackage.MIGRATOR_DX__FILTER_DX:
        getFilterDX().clear();
        getFilterDX().addAll((Collection<? extends FilterMigrator>)newValue);
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
      case MyDslPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)null);
        return;
      case MyDslPackage.MIGRATOR_DX__FILTER_DX:
        getFilterDX().clear();
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
      case MyDslPackage.MIGRATOR_DX__ELEMENT_DX:
        return elementDX != null;
      case MyDslPackage.MIGRATOR_DX__FILTER_DX:
        return filterDX != null && !filterDX.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MigratorDXImpl
