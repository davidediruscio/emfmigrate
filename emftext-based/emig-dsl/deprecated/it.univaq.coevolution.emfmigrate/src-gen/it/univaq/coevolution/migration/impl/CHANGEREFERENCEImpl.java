/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.CHANGEREFERENCE;
import it.univaq.coevolution.migration.MigrationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CHANGEREFERENCE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.CHANGEREFERENCEImpl#getRefRef <em>Ref Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CHANGEREFERENCEImpl extends MinimalEObjectImpl.Container implements CHANGEREFERENCE
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CHANGEREFERENCEImpl()
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
    return MigrationPackage.Literals.CHANGEREFERENCE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.CHANGEREFERENCE__REF_REF, oldRefRef, refRef));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.CHANGEREFERENCE__REF_REF, oldRefRef, refRef));
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
      case MigrationPackage.CHANGEREFERENCE__REF_REF:
        if (resolve) return getRefRef();
        return basicGetRefRef();
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
      case MigrationPackage.CHANGEREFERENCE__REF_REF:
        setRefRef((EReference)newValue);
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
      case MigrationPackage.CHANGEREFERENCE__REF_REF:
        setRefRef((EReference)null);
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
      case MigrationPackage.CHANGEREFERENCE__REF_REF:
        return refRef != null;
    }
    return super.eIsSet(featureID);
  }

} //CHANGEREFERENCEImpl
