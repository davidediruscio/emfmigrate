/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.emfmigrate.emig.impl;

import it.univaq.coevolution.emfmigrate.emig.EmigPackage;
import it.univaq.coevolution.emfmigrate.emig.FilterMigrator;
import it.univaq.coevolution.emfmigrate.emig.MigratorSX;
import it.univaq.coevolution.emfmigrate.emig.RewritingRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrator SX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl#getElementSX <em>Element SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl#getFilterSX <em>Filter SX</em>}</li>
 *   <li>{@link it.univaq.coevolution.emfmigrate.emig.impl.MigratorSXImpl#getRewritingRule <em>Rewriting Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigratorSXImpl extends MigratorImpl implements MigratorSX
{
  /**
   * The cached value of the '{@link #getElementSX() <em>Element SX</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementSX()
   * @generated
   * @ordered
   */
  protected EClass elementSX;

  /**
   * The cached value of the '{@link #getFilterSX() <em>Filter SX</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterSX()
   * @generated
   * @ordered
   */
  protected EList<FilterMigrator> filterSX;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MigratorSXImpl()
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
    return EmigPackage.Literals.MIGRATOR_SX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementSX()
  {
    if (elementSX != null && elementSX.eIsProxy())
    {
      InternalEObject oldElementSX = (InternalEObject)elementSX;
      elementSX = (EClass)eResolveProxy(oldElementSX);
      if (elementSX != oldElementSX)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmigPackage.MIGRATOR_SX__ELEMENT_SX, oldElementSX, elementSX));
      }
    }
    return elementSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetElementSX()
  {
    return elementSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementSX(EClass newElementSX)
  {
    EClass oldElementSX = elementSX;
    elementSX = newElementSX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATOR_SX__ELEMENT_SX, oldElementSX, elementSX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FilterMigrator> getFilterSX()
  {
    if (filterSX == null)
    {
      filterSX = new EObjectContainmentEList<FilterMigrator>(FilterMigrator.class, this, EmigPackage.MIGRATOR_SX__FILTER_SX);
    }
    return filterSX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RewritingRule getRewritingRule()
  {
    if (eContainerFeatureID() != EmigPackage.MIGRATOR_SX__REWRITING_RULE) return null;
    return (RewritingRule)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRewritingRule(RewritingRule newRewritingRule, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newRewritingRule, EmigPackage.MIGRATOR_SX__REWRITING_RULE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRewritingRule(RewritingRule newRewritingRule)
  {
    if (newRewritingRule != eInternalContainer() || (eContainerFeatureID() != EmigPackage.MIGRATOR_SX__REWRITING_RULE && newRewritingRule != null))
    {
      if (EcoreUtil.isAncestor(this, newRewritingRule))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newRewritingRule != null)
        msgs = ((InternalEObject)newRewritingRule).eInverseAdd(this, EmigPackage.REWRITING_RULE__MIGRATOR_SX, RewritingRule.class, msgs);
      msgs = basicSetRewritingRule(newRewritingRule, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EmigPackage.MIGRATOR_SX__REWRITING_RULE, newRewritingRule, newRewritingRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetRewritingRule((RewritingRule)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case EmigPackage.MIGRATOR_SX__FILTER_SX:
        return ((InternalEList<?>)getFilterSX()).basicRemove(otherEnd, msgs);
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        return basicSetRewritingRule(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        return eInternalContainer().eInverseRemove(this, EmigPackage.REWRITING_RULE__MIGRATOR_SX, RewritingRule.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case EmigPackage.MIGRATOR_SX__ELEMENT_SX:
        if (resolve) return getElementSX();
        return basicGetElementSX();
      case EmigPackage.MIGRATOR_SX__FILTER_SX:
        return getFilterSX();
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        return getRewritingRule();
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
      case EmigPackage.MIGRATOR_SX__ELEMENT_SX:
        setElementSX((EClass)newValue);
        return;
      case EmigPackage.MIGRATOR_SX__FILTER_SX:
        getFilterSX().clear();
        getFilterSX().addAll((Collection<? extends FilterMigrator>)newValue);
        return;
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        setRewritingRule((RewritingRule)newValue);
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
      case EmigPackage.MIGRATOR_SX__ELEMENT_SX:
        setElementSX((EClass)null);
        return;
      case EmigPackage.MIGRATOR_SX__FILTER_SX:
        getFilterSX().clear();
        return;
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        setRewritingRule((RewritingRule)null);
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
      case EmigPackage.MIGRATOR_SX__ELEMENT_SX:
        return elementSX != null;
      case EmigPackage.MIGRATOR_SX__FILTER_SX:
        return filterSX != null && !filterSX.isEmpty();
      case EmigPackage.MIGRATOR_SX__REWRITING_RULE:
        return getRewritingRule() != null;
    }
    return super.eIsSet(featureID);
  }

} //MigratorSXImpl
