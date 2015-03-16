/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MOVEREFERENCE;
import it.univaq.coevolution.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOVEREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl#getRefRef <em>Ref Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MOVEREFERENCEImpl#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MOVEREFERENCEImpl extends MinimalEObjectImpl.Container implements MOVEREFERENCE
{
  /**
   * The cached value of the '{@link #getRefRef() <em>Ref Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefRef()
   * @generated
   * @ordered
   */
  protected EReference refRef;

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
  protected MOVEREFERENCEImpl()
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
    return MigrationPackage.Literals.MOVEREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefRef()
  {
    if (refRef != null && refRef.eIsProxy())
    {
      InternalEObject oldRefRef = (InternalEObject)refRef;
      refRef = (EReference)eResolveProxy(oldRefRef);
      if (refRef != oldRefRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.MOVEREFERENCE__REF_REF, oldRefRef, refRef));
      }
    }
    return refRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference basicGetRefRef()
  {
    return refRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefRef(EReference newRefRef)
  {
    EReference oldRefRef = refRef;
    refRef = newRefRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MOVEREFERENCE__REF_REF, oldRefRef, refRef));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.MOVEREFERENCE__DST, oldDst, dst));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MOVEREFERENCE__DST, oldDst, dst));
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
      case MigrationPackage.MOVEREFERENCE__REF_REF:
        if (resolve) return getRefRef();
        return basicGetRefRef();
      case MigrationPackage.MOVEREFERENCE__DST:
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
      case MigrationPackage.MOVEREFERENCE__REF_REF:
        setRefRef((EReference)newValue);
        return;
      case MigrationPackage.MOVEREFERENCE__DST:
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
      case MigrationPackage.MOVEREFERENCE__REF_REF:
        setRefRef((EReference)null);
        return;
      case MigrationPackage.MOVEREFERENCE__DST:
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
      case MigrationPackage.MOVEREFERENCE__REF_REF:
        return refRef != null;
      case MigrationPackage.MOVEREFERENCE__DST:
        return dst != null;
    }
    return super.eIsSet(featureID);
  }

} //MOVEREFERENCEImpl
