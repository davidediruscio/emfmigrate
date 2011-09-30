/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MOVEATTRIBUTE;
import it.univaq.coevolution.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOVEATTRIBUTE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl#getRefAttr <em>Ref Attr</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MOVEATTRIBUTEImpl#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOVEATTRIBUTEImpl extends MinimalEObjectImpl.Container implements MOVEATTRIBUTE
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
   * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDst()
   * @generated
   * @ordered
   */
  protected EClass dst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MOVEATTRIBUTEImpl()
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
    return MigrationPackage.Literals.MOVEATTRIBUTE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.MOVEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MOVEATTRIBUTE__REF_ATTR, oldRefAttr, refAttr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDst()
  {
    if (dst != null && dst.eIsProxy())
    {
      InternalEObject oldDst = (InternalEObject)dst;
      dst = (EClass)eResolveProxy(oldDst);
      if (dst != oldDst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.MOVEATTRIBUTE__DST, oldDst, dst));
      }
    }
    return dst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetDst()
  {
    return dst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDst(EClass newDst)
  {
    EClass oldDst = dst;
    dst = newDst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MOVEATTRIBUTE__DST, oldDst, dst));
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
      case MigrationPackage.MOVEATTRIBUTE__REF_ATTR:
        if (resolve) return getRefAttr();
        return basicGetRefAttr();
      case MigrationPackage.MOVEATTRIBUTE__DST:
        if (resolve) return getDst();
        return basicGetDst();
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
      case MigrationPackage.MOVEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)newValue);
        return;
      case MigrationPackage.MOVEATTRIBUTE__DST:
        setDst((EClass)newValue);
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
      case MigrationPackage.MOVEATTRIBUTE__REF_ATTR:
        setRefAttr((EAttribute)null);
        return;
      case MigrationPackage.MOVEATTRIBUTE__DST:
        setDst((EClass)null);
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
      case MigrationPackage.MOVEATTRIBUTE__REF_ATTR:
        return refAttr != null;
      case MigrationPackage.MOVEATTRIBUTE__DST:
        return dst != null;
    }
    return super.eIsSet(featureID);
  }

} //MOVEATTRIBUTEImpl
