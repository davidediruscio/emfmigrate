/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.ComplexOperator;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigrationProgram;
import it.univaq.coevolution.migration.Model;
import it.univaq.coevolution.migration.PackageOp;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ModelImpl#getOperators <em>Operators</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ModelImpl#getMigrationProgr <em>Migration Progr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<PackageOp> packages;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected EList<ComplexOperator> operators;

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
  protected ModelImpl()
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
    return MigrationPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageOp> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<PackageOp>(PackageOp.class, this, MigrationPackage.MODEL__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MODEL__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexOperator> getOperators()
  {
    if (operators == null)
    {
      operators = new EObjectContainmentEList<ComplexOperator>(ComplexOperator.class, this, MigrationPackage.MODEL__OPERATORS);
    }
    return operators;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.MODEL__MIGRATION_PROGR, oldMigrationProgr, newMigrationProgr);
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
        msgs = ((InternalEObject)migrationProgr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.MODEL__MIGRATION_PROGR, null, msgs);
      if (newMigrationProgr != null)
        msgs = ((InternalEObject)newMigrationProgr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.MODEL__MIGRATION_PROGR, null, msgs);
      msgs = basicSetMigrationProgr(newMigrationProgr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MODEL__MIGRATION_PROGR, newMigrationProgr, newMigrationProgr));
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
      case MigrationPackage.MODEL__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case MigrationPackage.MODEL__OPERATORS:
        return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
      case MigrationPackage.MODEL__MIGRATION_PROGR:
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
      case MigrationPackage.MODEL__PACKAGES:
        return getPackages();
      case MigrationPackage.MODEL__TITLE:
        return getTitle();
      case MigrationPackage.MODEL__OPERATORS:
        return getOperators();
      case MigrationPackage.MODEL__MIGRATION_PROGR:
        return getMigrationProgr();
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
      case MigrationPackage.MODEL__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends PackageOp>)newValue);
        return;
      case MigrationPackage.MODEL__TITLE:
        setTitle((String)newValue);
        return;
      case MigrationPackage.MODEL__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends ComplexOperator>)newValue);
        return;
      case MigrationPackage.MODEL__MIGRATION_PROGR:
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
      case MigrationPackage.MODEL__PACKAGES:
        getPackages().clear();
        return;
      case MigrationPackage.MODEL__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case MigrationPackage.MODEL__OPERATORS:
        getOperators().clear();
        return;
      case MigrationPackage.MODEL__MIGRATION_PROGR:
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
      case MigrationPackage.MODEL__PACKAGES:
        return packages != null && !packages.isEmpty();
      case MigrationPackage.MODEL__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case MigrationPackage.MODEL__OPERATORS:
        return operators != null && !operators.isEmpty();
      case MigrationPackage.MODEL__MIGRATION_PROGR:
        return migrationProgr != null;
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
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
