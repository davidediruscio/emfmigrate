/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.packageSetters_def;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>package Setters def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.packageSetters_defImpl#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.packageSetters_defImpl#getPar <em>Par</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class packageSetters_defImpl extends MinimalEObjectImpl.Container implements packageSetters_def
{
  /**
   * The cached value of the '{@link #getMetafeature() <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetafeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature metafeature;

  /**
   * The default value of the '{@link #getPar() <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected static final String PAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPar() <em>Par</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPar()
   * @generated
   * @ordered
   */
  protected String par = PAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected packageSetters_defImpl()
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
    return MigrationPackage.Literals.PACKAGE_SETTERS_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getMetafeature()
  {
    if (metafeature != null && metafeature.eIsProxy())
    {
      InternalEObject oldMetafeature = (InternalEObject)metafeature;
      metafeature = (EStructuralFeature)eResolveProxy(oldMetafeature);
      if (metafeature != oldMetafeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE, oldMetafeature, metafeature));
      }
    }
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetMetafeature()
  {
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetafeature(EStructuralFeature newMetafeature)
  {
    EStructuralFeature oldMetafeature = metafeature;
    metafeature = newMetafeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE, oldMetafeature, metafeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPar()
  {
    return par;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPar(String newPar)
  {
    String oldPar = par;
    par = newPar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.PACKAGE_SETTERS_DEF__PAR, oldPar, par));
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
      case MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE:
        if (resolve) return getMetafeature();
        return basicGetMetafeature();
      case MigrationPackage.PACKAGE_SETTERS_DEF__PAR:
        return getPar();
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
      case MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE:
        setMetafeature((EStructuralFeature)newValue);
        return;
      case MigrationPackage.PACKAGE_SETTERS_DEF__PAR:
        setPar((String)newValue);
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
      case MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE:
        setMetafeature((EStructuralFeature)null);
        return;
      case MigrationPackage.PACKAGE_SETTERS_DEF__PAR:
        setPar(PAR_EDEFAULT);
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
      case MigrationPackage.PACKAGE_SETTERS_DEF__METAFEATURE:
        return metafeature != null;
      case MigrationPackage.PACKAGE_SETTERS_DEF__PAR:
        return PAR_EDEFAULT == null ? par != null : !PAR_EDEFAULT.equals(par);
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
    result.append(" (par: ");
    result.append(par);
    result.append(')');
    return result.toString();
  }

} //packageSetters_defImpl
