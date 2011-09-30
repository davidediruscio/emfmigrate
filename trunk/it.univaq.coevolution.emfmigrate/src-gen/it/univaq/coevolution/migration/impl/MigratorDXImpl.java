/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.FilterMigrator;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigratorDX;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrator DX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigratorDXImpl#getElementDX <em>Element DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigratorDXImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigratorDXImpl#getFilterDX <em>Filter DX</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigratorDXImpl extends MinimalEObjectImpl.Container implements MigratorDX
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
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
    return MigrationPackage.Literals.MIGRATOR_DX;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MIGRATOR_DX__ELEMENT_DX, oldElementDX, elementDX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MIGRATOR_DX__NAME, oldName, name));
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
      filterDX = new EObjectContainmentEList<FilterMigrator>(FilterMigrator.class, this, MigrationPackage.MIGRATOR_DX__FILTER_DX);
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
      case MigrationPackage.MIGRATOR_DX__FILTER_DX:
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
      case MigrationPackage.MIGRATOR_DX__ELEMENT_DX:
        if (resolve) return getElementDX();
        return basicGetElementDX();
      case MigrationPackage.MIGRATOR_DX__NAME:
        return getName();
      case MigrationPackage.MIGRATOR_DX__FILTER_DX:
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
      case MigrationPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)newValue);
        return;
      case MigrationPackage.MIGRATOR_DX__NAME:
        setName((String)newValue);
        return;
      case MigrationPackage.MIGRATOR_DX__FILTER_DX:
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
      case MigrationPackage.MIGRATOR_DX__ELEMENT_DX:
        setElementDX((EClass)null);
        return;
      case MigrationPackage.MIGRATOR_DX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MigrationPackage.MIGRATOR_DX__FILTER_DX:
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
      case MigrationPackage.MIGRATOR_DX__ELEMENT_DX:
        return elementDX != null;
      case MigrationPackage.MIGRATOR_DX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MigrationPackage.MIGRATOR_DX__FILTER_DX:
        return filterDX != null && !filterDX.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MigratorDXImpl
