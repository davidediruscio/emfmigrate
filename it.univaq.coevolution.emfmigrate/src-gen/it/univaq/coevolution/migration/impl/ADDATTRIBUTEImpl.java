/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.ADDATTRIBUTE;
import it.univaq.coevolution.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADDATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.ADDATTRIBUTEImpl#getNew <em>New</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADDATTRIBUTEImpl extends MinimalEObjectImpl.Container implements ADDATTRIBUTE
{
  /**
   * The default value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected static final String NEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected String new_ = NEW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ADDATTRIBUTEImpl()
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
    return MigrationPackage.Literals.ADDATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNew()
  {
    return new_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew(String newNew)
  {
    String oldNew = new_;
    new_ = newNew;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.ADDATTRIBUTE__NEW, oldNew, new_));
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
      case MigrationPackage.ADDATTRIBUTE__NEW:
        return getNew();
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
      case MigrationPackage.ADDATTRIBUTE__NEW:
        setNew((String)newValue);
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
      case MigrationPackage.ADDATTRIBUTE__NEW:
        setNew(NEW_EDEFAULT);
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
      case MigrationPackage.ADDATTRIBUTE__NEW:
        return NEW_EDEFAULT == null ? new_ != null : !NEW_EDEFAULT.equals(new_);
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
    result.append(" (new: ");
    result.append(new_);
    result.append(')');
    return result.toString();
  }

} //ADDATTRIBUTEImpl
