/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.CHANGEATTRIBUTE;
import it.univaq.coevolution.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CHANGEATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.CHANGEATTRIBUTEImpl#getRefAttr <em>Ref Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CHANGEATTRIBUTEImpl extends MinimalEObjectImpl.Container implements CHANGEATTRIBUTE
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CHANGEATTRIBUTEImpl()
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
    return MigrationPackage.Literals.CHANGEATTRIBUTE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.CHANGEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CHANGEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
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
      case MigrationPackage.CHANGEATTRIBUTE__REF_ATTR:
        if (resolve) return getRefAttr();
        return basicGetRefAttr();
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
      case MigrationPackage.CHANGEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)newValue);
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
      case MigrationPackage.CHANGEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)null);
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
      case MigrationPackage.CHANGEATTRIBUTE__REF_ATTR:
        return refAttr != null;
    }
    return super.eIsSet(featureID);
  }

} //CHANGEATTRIBUTEImpl
