/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.MigratorDX;
import it.univaq.coevolution.migration.MigratorSX;
import it.univaq.coevolution.migration.RewritingRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewriting Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.RewritingRuleImpl#getMigratorsSX <em>Migrators SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.RewritingRuleImpl#getMigratorDX <em>Migrator DX</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.RewritingRuleImpl#getMigratorSX <em>Migrator SX</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewritingRuleImpl extends MinimalEObjectImpl.Container implements RewritingRule
{
  /**
   * The cached value of the '{@link #getMigratorsSX() <em>Migrators SX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigratorsSX()
   * @generated
   * @ordered
   */
  protected EList<MigratorSX> migratorsSX;

  /**
   * The cached value of the '{@link #getMigratorDX() <em>Migrator DX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigratorDX()
   * @generated
   * @ordered
   */
  protected EList<MigratorDX> migratorDX;

  /**
   * The cached value of the '{@link #getMigratorSX() <em>Migrator SX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMigratorSX()
   * @generated
   * @ordered
   */
  protected EList<MigratorSX> migratorSX;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RewritingRuleImpl()
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
    return MigrationPackage.Literals.REWRITING_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MigratorSX> getMigratorsSX()
  {
    if (migratorsSX == null)
    {
      migratorsSX = new EObjectContainmentEList<MigratorSX>(MigratorSX.class, this, MigrationPackage.REWRITING_RULE__MIGRATORS_SX);
    }
    return migratorsSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MigratorDX> getMigratorDX()
  {
    if (migratorDX == null)
    {
      migratorDX = new EObjectContainmentEList<MigratorDX>(MigratorDX.class, this, MigrationPackage.REWRITING_RULE__MIGRATOR_DX);
    }
    return migratorDX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MigratorSX> getMigratorSX()
  {
    if (migratorSX == null)
    {
      migratorSX = new EObjectContainmentEList<MigratorSX>(MigratorSX.class, this, MigrationPackage.REWRITING_RULE__MIGRATOR_SX);
    }
    return migratorSX;
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
      case MigrationPackage.REWRITING_RULE__MIGRATORS_SX:
        return ((InternalEList<?>)getMigratorsSX()).basicRemove(otherEnd, msgs);
      case MigrationPackage.REWRITING_RULE__MIGRATOR_DX:
        return ((InternalEList<?>)getMigratorDX()).basicRemove(otherEnd, msgs);
      case MigrationPackage.REWRITING_RULE__MIGRATOR_SX:
        return ((InternalEList<?>)getMigratorSX()).basicRemove(otherEnd, msgs);
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
      case MigrationPackage.REWRITING_RULE__MIGRATORS_SX:
        return getMigratorsSX();
      case MigrationPackage.REWRITING_RULE__MIGRATOR_DX:
        return getMigratorDX();
      case MigrationPackage.REWRITING_RULE__MIGRATOR_SX:
        return getMigratorSX();
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
      case MigrationPackage.REWRITING_RULE__MIGRATORS_SX:
        getMigratorsSX().clear();
        getMigratorsSX().addAll((Collection<? extends MigratorSX>)newValue);
        return;
      case MigrationPackage.REWRITING_RULE__MIGRATOR_DX:
        getMigratorDX().clear();
        getMigratorDX().addAll((Collection<? extends MigratorDX>)newValue);
        return;
      case MigrationPackage.REWRITING_RULE__MIGRATOR_SX:
        getMigratorSX().clear();
        getMigratorSX().addAll((Collection<? extends MigratorSX>)newValue);
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
      case MigrationPackage.REWRITING_RULE__MIGRATORS_SX:
        getMigratorsSX().clear();
        return;
      case MigrationPackage.REWRITING_RULE__MIGRATOR_DX:
        getMigratorDX().clear();
        return;
      case MigrationPackage.REWRITING_RULE__MIGRATOR_SX:
        getMigratorSX().clear();
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
      case MigrationPackage.REWRITING_RULE__MIGRATORS_SX:
        return migratorsSX != null && !migratorsSX.isEmpty();
      case MigrationPackage.REWRITING_RULE__MIGRATOR_DX:
        return migratorDX != null && !migratorDX.isEmpty();
      case MigrationPackage.REWRITING_RULE__MIGRATOR_SX:
        return migratorSX != null && !migratorSX.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RewritingRuleImpl
