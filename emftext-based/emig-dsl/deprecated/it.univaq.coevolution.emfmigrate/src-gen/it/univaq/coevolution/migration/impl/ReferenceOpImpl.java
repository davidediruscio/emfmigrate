/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.CHANGEREFERENCE;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.ReferenceOp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.ReferenceOpImpl#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ReferenceOpImpl#getCHANGE_op <em>CHANGE op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceOpImpl extends eStructuralFeatureOpImpl implements ReferenceOp
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EReference var;

  /**
   * The cached value of the '{@link #getCHANGE_op() <em>CHANGE op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCHANGE_op()
   * @generated
   * @ordered
   */
  protected CHANGEREFERENCE changE_op;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceOpImpl()
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
    return MigrationPackage.Literals.REFERENCE_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(EReference newVar, NotificationChain msgs)
  {
    EReference oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.REFERENCE_OP__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(EReference newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.REFERENCE_OP__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.REFERENCE_OP__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.REFERENCE_OP__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CHANGEREFERENCE getCHANGE_op()
  {
    return changE_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCHANGE_op(CHANGEREFERENCE newCHANGE_op, NotificationChain msgs)
  {
    CHANGEREFERENCE oldCHANGE_op = changE_op;
    changE_op = newCHANGE_op;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.REFERENCE_OP__CHANGE_OP, oldCHANGE_op, newCHANGE_op);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCHANGE_op(CHANGEREFERENCE newCHANGE_op)
  {
    if (newCHANGE_op != changE_op)
    {
      NotificationChain msgs = null;
      if (changE_op != null)
        msgs = ((InternalEObject)changE_op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.REFERENCE_OP__CHANGE_OP, null, msgs);
      if (newCHANGE_op != null)
        msgs = ((InternalEObject)newCHANGE_op).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.REFERENCE_OP__CHANGE_OP, null, msgs);
      msgs = basicSetCHANGE_op(newCHANGE_op, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.REFERENCE_OP__CHANGE_OP, newCHANGE_op, newCHANGE_op));
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
      case MigrationPackage.REFERENCE_OP__VAR:
        return basicSetVar(null, msgs);
      case MigrationPackage.REFERENCE_OP__CHANGE_OP:
        return basicSetCHANGE_op(null, msgs);
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
      case MigrationPackage.REFERENCE_OP__VAR:
        return getVar();
      case MigrationPackage.REFERENCE_OP__CHANGE_OP:
        return getCHANGE_op();
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
      case MigrationPackage.REFERENCE_OP__VAR:
        setVar((EReference)newValue);
        return;
      case MigrationPackage.REFERENCE_OP__CHANGE_OP:
        setCHANGE_op((CHANGEREFERENCE)newValue);
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
      case MigrationPackage.REFERENCE_OP__VAR:
        setVar((EReference)null);
        return;
      case MigrationPackage.REFERENCE_OP__CHANGE_OP:
        setCHANGE_op((CHANGEREFERENCE)null);
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
      case MigrationPackage.REFERENCE_OP__VAR:
        return var != null;
      case MigrationPackage.REFERENCE_OP__CHANGE_OP:
        return changE_op != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceOpImpl
