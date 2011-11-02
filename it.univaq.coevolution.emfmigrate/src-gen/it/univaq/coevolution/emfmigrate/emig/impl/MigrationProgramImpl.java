/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.Artifact;
import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.MigrationProgram;
import it.univaq.coevolution.emfmigrate.emig.Rule;

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
 * An implementation of the model object '<em><b>Migration Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getLibs <em>Libs</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getMigr <em>Migr</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getTypeArt <em>Type Art</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getTransformationPackage <em>Transformation Package</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigrationProgramImpl#getRules <em>Rules</em>}</li>
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
   * The cached value of the '{@link #getTypeArt() <em>Type Art</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeArt()
   * @generated
   * @ordered
   */
  protected Artifact typeArt;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
    return EmigPackage.Literals.MIGRATION_PROGRAM;
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
      libs = new EDataTypeEList<String>(String.class, this, EmigPackage.MIGRATION_PROGRAM__LIBS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATION_PROGRAM__MIGR, oldMigr, migr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact getTypeArt()
  {
    return typeArt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeArt(Artifact newTypeArt, NotificationChain msgs)
  {
    Artifact oldTypeArt = typeArt;
    typeArt = newTypeArt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATION_PROGRAM__TYPE_ART, oldTypeArt, newTypeArt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeArt(Artifact newTypeArt)
  {
    if (newTypeArt != typeArt)
    {
      NotificationChain msgs = null;
      if (typeArt != null)
        msgs = ((InternalEObject)typeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MIGRATION_PROGRAM__TYPE_ART, null, msgs);
      if (newTypeArt != null)
        msgs = ((InternalEObject)newTypeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmigPackage.MIGRATION_PROGRAM__TYPE_ART, null, msgs);
      msgs = basicSetTypeArt(newTypeArt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATION_PROGRAM__TYPE_ART, newTypeArt, newTypeArt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATION_PROGRAM__NAME, oldName, name));
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
      transformationPackage = new EObjectResolvingEList<EPackage>(EPackage.class, this, EmigPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATION_PROGRAM__DELTA, oldDelta, delta));
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
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, EmigPackage.MIGRATION_PROGRAM__RULES);
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
      case EmigPackage.MIGRATION_PROGRAM__TYPE_ART:
        return basicSetTypeArt(null, msgs);
      case EmigPackage.MIGRATION_PROGRAM__RULES:
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
      case EmigPackage.MIGRATION_PROGRAM__LIBS:
        return getLibs();
      case EmigPackage.MIGRATION_PROGRAM__MIGR:
        return getMigr();
      case EmigPackage.MIGRATION_PROGRAM__TYPE_ART:
        return getTypeArt();
      case EmigPackage.MIGRATION_PROGRAM__NAME:
        return getName();
      case EmigPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        return getTransformationPackage();
      case EmigPackage.MIGRATION_PROGRAM__DELTA:
        return getDelta();
      case EmigPackage.MIGRATION_PROGRAM__RULES:
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
      case EmigPackage.MIGRATION_PROGRAM__LIBS:
        getLibs().clear();
        getLibs().addAll((Collection<? extends String>)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__MIGR:
        setMigr((String)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__TYPE_ART:
        setTypeArt((Artifact)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__NAME:
        setName((String)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        getTransformationPackage().clear();
        getTransformationPackage().addAll((Collection<? extends EPackage>)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__DELTA:
        setDelta((String)newValue);
        return;
      case EmigPackage.MIGRATION_PROGRAM__RULES:
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
      case EmigPackage.MIGRATION_PROGRAM__LIBS:
        getLibs().clear();
        return;
      case EmigPackage.MIGRATION_PROGRAM__MIGR:
        setMigr(MIGR_EDEFAULT);
        return;
      case EmigPackage.MIGRATION_PROGRAM__TYPE_ART:
        setTypeArt((Artifact)null);
        return;
      case EmigPackage.MIGRATION_PROGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EmigPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        getTransformationPackage().clear();
        return;
      case EmigPackage.MIGRATION_PROGRAM__DELTA:
        setDelta(DELTA_EDEFAULT);
        return;
      case EmigPackage.MIGRATION_PROGRAM__RULES:
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
      case EmigPackage.MIGRATION_PROGRAM__LIBS:
        return libs != null && !libs.isEmpty();
      case EmigPackage.MIGRATION_PROGRAM__MIGR:
        return MIGR_EDEFAULT == null ? migr != null : !MIGR_EDEFAULT.equals(migr);
      case EmigPackage.MIGRATION_PROGRAM__TYPE_ART:
        return typeArt != null;
      case EmigPackage.MIGRATION_PROGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EmigPackage.MIGRATION_PROGRAM__TRANSFORMATION_PACKAGE:
        return transformationPackage != null && !transformationPackage.isEmpty();
      case EmigPackage.MIGRATION_PROGRAM__DELTA:
        return DELTA_EDEFAULT == null ? delta != null : !DELTA_EDEFAULT.equals(delta);
      case EmigPackage.MIGRATION_PROGRAM__RULES:
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
    result.append(", name: ");
    result.append(name);
    result.append(", delta: ");
    result.append(delta);
    result.append(')');
    return result.toString();
  }

} //MigrationProgramImpl
