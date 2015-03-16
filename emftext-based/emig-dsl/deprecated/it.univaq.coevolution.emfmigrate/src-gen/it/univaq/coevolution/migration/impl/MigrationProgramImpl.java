/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigrationProgram;
import it.univaq.coevolution.migration.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getLibs <em>Libs</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getMigr <em>Migr</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getPath <em>Path</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getTransformationPackage <em>Transformation Package</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.MigrationProgramImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigrationProgramImpl extends MinimalEObjectImpl.Container implements MigrationProgram
{
  /**
   * The cached value of the '{@link #getLibs() <em>Libs</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibs()
   * @generated
   * @ordered
   */
  protected EList<String> libs;

  /**
   * The default value of the '{@link #getMigr() <em>Migr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigr()
   * @generated
   * @ordered
   */
  protected static final String MIGR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMigr() <em>Migr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigr()
   * @generated
   * @ordered
   */
  protected String migr = MIGR_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransformationPackage() <em>Transformation Package</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformationPackage()
   * @generated
   * @ordered
   */
  protected EList<EPackage> transformationPackage;

  /**
   * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected static final String DELTA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelta()
   * @generated
   * @ordered
   */
  protected String delta = DELTA_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MigrationProgramImpl()
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
    return MigrationPackage.Literals.MIGRATION_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLibs()
  {
    if (libs == null)
    {
      libs = new EDataTypeEList<String>(String.class, this, MigrationPackage.MIGRATION_PROGRAM__LIBS);
    }
    return libs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMigr()
  {
    return migr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMigr(String newMigr)
  {
    String oldMigr = migr;
    migr = newMigr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MIGRATION_PROGRAM__MIGR, oldMigr, migr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MIGRATION_PROGRAM__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackage> getTransformationPackage()
  {
    if (transformationPackage == null)
    {
      transformationPackage = new EObjectResolvingEList<EPackage>(EPackage.class, this, MigrationPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE);
    }
    return transformationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelta()
  {
    return delta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelta(String newDelta)
  {
    String oldDelta = delta;
    delta = newDelta;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.MIGRATION_PROGRAM__DELTA, oldDelta, delta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, MigrationPackage.MIGRATION_PROGRAM__RULES);
    }
    return rules;
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
      case MigrationPackage.MIGRATION_PROGRAM__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
      case MigrationPackage.MIGRATION_PROGRAM__LIBS:
        return getLibs();
      case MigrationPackage.MIGRATION_PROGRAM__MIGR:
        return getMigr();
      case MigrationPackage.MIGRATION_PROGRAM__PATH:
        return getPath();
      case MigrationPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        return getTransformationPackage();
      case MigrationPackage.MIGRATION_PROGRAM__DELTA:
        return getDelta();
      case MigrationPackage.MIGRATION_PROGRAM__RULES:
        return getRules();
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
      case MigrationPackage.MIGRATION_PROGRAM__LIBS:
        getLibs().clear();
        getLibs().addAll((Collection<? extends String>)newValue);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__MIGR:
        setMigr((String)newValue);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__PATH:
        setPath((String)newValue);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        getTransformationPackage().clear();
        getTransformationPackage().addAll((Collection<? extends EPackage>)newValue);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__DELTA:
        setDelta((String)newValue);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
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
      case MigrationPackage.MIGRATION_PROGRAM__LIBS:
        getLibs().clear();
        return;
      case MigrationPackage.MIGRATION_PROGRAM__MIGR:
        setMigr(MIGR_EDEFAULT);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        getTransformationPackage().clear();
        return;
      case MigrationPackage.MIGRATION_PROGRAM__DELTA:
        setDelta(DELTA_EDEFAULT);
        return;
      case MigrationPackage.MIGRATION_PROGRAM__RULES:
        getRules().clear();
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
      case MigrationPackage.MIGRATION_PROGRAM__LIBS:
        return libs != null && !libs.isEmpty();
      case MigrationPackage.MIGRATION_PROGRAM__MIGR:
        return MIGR_EDEFAULT == null ? migr != null : !MIGR_EDEFAULT.equals(migr);
      case MigrationPackage.MIGRATION_PROGRAM__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case MigrationPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        return transformationPackage != null && !transformationPackage.isEmpty();
      case MigrationPackage.MIGRATION_PROGRAM__DELTA:
        return DELTA_EDEFAULT == null ? delta != null : !DELTA_EDEFAULT.equals(delta);
      case MigrationPackage.MIGRATION_PROGRAM__RULES:
        return rules != null && !rules.isEmpty();
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
    result.append(" (libs: ");
    result.append(libs);
    result.append(", migr: ");
    result.append(migr);
    result.append(", path: ");
    result.append(path);
    result.append(", delta: ");
    result.append(delta);
    result.append(')');
    return result.toString();
  }

} //MigrationProgramImpl
