/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MigrationLibrary;
import org.xtext.example.mydsl.myDsl.MigrationProgram;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.MyModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MyModelImpl#getMigrationLib <em>Migration Lib</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.MyModelImpl#getMigrationProgr <em>Migration Progr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyModelImpl extends MinimalEObjectImpl.Container implements MyModel
{
  /**
   * The cached value of the '{@link #getMigrationLib() <em>Migration Lib</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigrationLib()
   * @generated
   * @ordered
   */
  protected MigrationLibrary migrationLib;

  /**
   * The cached value of the '{@link #getMigrationProgr() <em>Migration Progr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigrationProgr()
   * @generated
   * @ordered
   */
  protected MigrationProgram migrationProgr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyModelImpl()
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
    return MyDslPackage.Literals.MY_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationLibrary getMigrationLib()
  {
    return migrationLib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMigrationLib(MigrationLibrary newMigrationLib, NotificationChain msgs)
  {
    MigrationLibrary oldMigrationLib = migrationLib;
    migrationLib = newMigrationLib;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MY_MODEL__MIGRATION_LIB, oldMigrationLib, newMigrationLib);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMigrationLib(MigrationLibrary newMigrationLib)
  {
    if (newMigrationLib != migrationLib)
    {
      NotificationChain msgs = null;
      if (migrationLib != null)
        msgs = ((InternalEObject)migrationLib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MY_MODEL__MIGRATION_LIB, null, msgs);
      if (newMigrationLib != null)
        msgs = ((InternalEObject)newMigrationLib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MY_MODEL__MIGRATION_LIB, null, msgs);
      msgs = basicSetMigrationLib(newMigrationLib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MY_MODEL__MIGRATION_LIB, newMigrationLib, newMigrationLib));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MigrationProgram getMigrationProgr()
  {
    return migrationProgr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMigrationProgr(MigrationProgram newMigrationProgr, NotificationChain msgs)
  {
    MigrationProgram oldMigrationProgr = migrationProgr;
    migrationProgr = newMigrationProgr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MY_MODEL__MIGRATION_PROGR, oldMigrationProgr, newMigrationProgr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMigrationProgr(MigrationProgram newMigrationProgr)
  {
    if (newMigrationProgr != migrationProgr)
    {
      NotificationChain msgs = null;
      if (migrationProgr != null)
        msgs = ((InternalEObject)migrationProgr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MY_MODEL__MIGRATION_PROGR, null, msgs);
      if (newMigrationProgr != null)
        msgs = ((InternalEObject)newMigrationProgr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MY_MODEL__MIGRATION_PROGR, null, msgs);
      msgs = basicSetMigrationProgr(newMigrationProgr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MY_MODEL__MIGRATION_PROGR, newMigrationProgr, newMigrationProgr));
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
      case MyDslPackage.MY_MODEL__MIGRATION_LIB:
        return basicSetMigrationLib(null, msgs);
      case MyDslPackage.MY_MODEL__MIGRATION_PROGR:
        return basicSetMigrationProgr(null, msgs);
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
      case MyDslPackage.MY_MODEL__MIGRATION_LIB:
        return getMigrationLib();
      case MyDslPackage.MY_MODEL__MIGRATION_PROGR:
        return getMigrationProgr();
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
      case MyDslPackage.MY_MODEL__MIGRATION_LIB:
        setMigrationLib((MigrationLibrary)newValue);
        return;
      case MyDslPackage.MY_MODEL__MIGRATION_PROGR:
        setMigrationProgr((MigrationProgram)newValue);
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
      case MyDslPackage.MY_MODEL__MIGRATION_LIB:
        setMigrationLib((MigrationLibrary)null);
        return;
      case MyDslPackage.MY_MODEL__MIGRATION_PROGR:
        setMigrationProgr((MigrationProgram)null);
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
      case MyDslPackage.MY_MODEL__MIGRATION_LIB:
        return migrationLib != null;
      case MyDslPackage.MY_MODEL__MIGRATION_PROGR:
        return migrationProgr != null;
    }
    return super.eIsSet(featureID);
  }

} //MyModelImpl
