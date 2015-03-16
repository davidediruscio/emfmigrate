/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.MigrationLibrary;
import it.univaq.coevolution.emfmigrate.emig.MigrationProgram;
import it.univaq.coevolution.emfmigrate.emig.MyModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl#getMigrationLib <em>Migration Lib</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MyModelImpl#getMigrationProgr <em>Migration Progr</em>}</li>
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
    return EmigPackage.Literals.MY_MODEL;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.MY_MODEL__MIGRATION_LIB, oldMigrationLib, newMigrationLib);
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
        msgs = ((InternalEObject)migrationLib).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MY_MODEL__MIGRATION_LIB, null, msgs);
      if (newMigrationLib != null)
        msgs = ((InternalEObject)newMigrationLib).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MY_MODEL__MIGRATION_LIB, null, msgs);
      msgs = basicSetMigrationLib(newMigrationLib, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MY_MODEL__MIGRATION_LIB, newMigrationLib, newMigrationLib));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.MY_MODEL__MIGRATION_PROGR, oldMigrationProgr, newMigrationProgr);
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
        msgs = ((InternalEObject)migrationProgr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MY_MODEL__MIGRATION_PROGR, null, msgs);
      if (newMigrationProgr != null)
        msgs = ((InternalEObject)newMigrationProgr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MY_MODEL__MIGRATION_PROGR, null, msgs);
      msgs = basicSetMigrationProgr(newMigrationProgr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MY_MODEL__MIGRATION_PROGR, newMigrationProgr, newMigrationProgr));
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
      case EmigPackage.MY_MODEL__MIGRATION_LIB:
        return basicSetMigrationLib(null, msgs);
      case EmigPackage.MY_MODEL__MIGRATION_PROGR:
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
      case EmigPackage.MY_MODEL__MIGRATION_LIB:
        return getMigrationLib();
      case EmigPackage.MY_MODEL__MIGRATION_PROGR:
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
      case EmigPackage.MY_MODEL__MIGRATION_LIB:
        setMigrationLib((MigrationLibrary)newValue);
        return;
      case EmigPackage.MY_MODEL__MIGRATION_PROGR:
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
      case EmigPackage.MY_MODEL__MIGRATION_LIB:
        setMigrationLib((MigrationLibrary)null);
        return;
      case EmigPackage.MY_MODEL__MIGRATION_PROGR:
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
      case EmigPackage.MY_MODEL__MIGRATION_LIB:
        return migrationLib != null;
      case EmigPackage.MY_MODEL__MIGRATION_PROGR:
        return migrationProgr != null;
    }
    return super.eIsSet(featureID);
  }

} //MyModelImpl
