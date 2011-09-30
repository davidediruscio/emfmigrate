/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.RENAMEATTRIBUTE;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RENAMEATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl#getRefAttr <em>Ref Attr</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.RENAMEATTRIBUTEImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RENAMEATTRIBUTEImpl extends MinimalEObjectImpl.Container implements RENAMEATTRIBUTE
{
  /**
   * The cached value of the '{@link #getRefAttr() <em>Ref Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefAttr()
   * @generated
   * @ordered
   */
  protected EAttribute refAttr;

  /**
   * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected static final String NEW_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewName()
   * @generated
   * @ordered
   */
  protected String newName = NEW_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RENAMEATTRIBUTEImpl()
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
    return MigrationPackage.Literals.RENAMEATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefAttr()
  {
    if (refAttr != null && refAttr.eIsProxy())
    {
      InternalEObject oldRefAttr = (InternalEObject)refAttr;
      refAttr = (EAttribute)eResolveProxy(oldRefAttr);
      if (refAttr != oldRefAttr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.RENAMEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
      }
    }
    return refAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute basicGetRefAttr()
  {
    return refAttr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefAttr(EAttribute newRefAttr)
  {
    EAttribute oldRefAttr = refAttr;
    refAttr = newRefAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.RENAMEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewName()
  {
    return newName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewName(String newNewName)
  {
    String oldNewName = newName;
    newName = newNewName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.RENAMEATTRIBUTE__NEW_NAME, oldNewName, newName));
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
      case MigrationPackage.RENAMEATTRIBUTE__REF_ATTR:
        if (resolve) return getRefAttr();
        return basicGetRefAttr();
      case MigrationPackage.RENAMEATTRIBUTE__NEW_NAME:
        return getNewName();
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
      case MigrationPackage.RENAMEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)newValue);
        return;
      case MigrationPackage.RENAMEATTRIBUTE__NEW_NAME:
        setNewName((String)newValue);
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
      case MigrationPackage.RENAMEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)null);
        return;
      case MigrationPackage.RENAMEATTRIBUTE__NEW_NAME:
        setNewName(NEW_NAME_EDEFAULT);
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
      case MigrationPackage.RENAMEATTRIBUTE__REF_ATTR:
        return refAttr != null;
      case MigrationPackage.RENAMEATTRIBUTE__NEW_NAME:
        return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
    result.append(" (newName: ");
    result.append(newName);
    result.append(')');
    return result.toString();
  }

} //RENAMEATTRIBUTEImpl
