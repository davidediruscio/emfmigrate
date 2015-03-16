/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.setter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl#getVar <em>Var</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl#getSetters <em>Setters</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.EPackageOperationImpl#getComplex <em>Complex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EPackageOperationImpl extends MinimalEObjectImpl.Container implements EPackageOperation
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EPackage var;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EObject op;

  /**
   * The cached value of the '{@link #getSetters() <em>Setters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetters()
   * @generated
   * @ordered
   */
  protected EList<setter> setters;

  /**
   * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClasses()
   * @generated
   * @ordered
   */
  protected EList<EClassOperation> classes;

  /**
   * The cached value of the '{@link #getComplex() <em>Complex</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplex()
   * @generated
   * @ordered
   */
  protected EList<ComplexOperator> complex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EPackageOperationImpl()
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
    return EDeltaLangPackage.Literals.EPACKAGE_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPackage getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(EPackage newVar, NotificationChain msgs)
  {
    EPackage oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.EPACKAGE_OPERATION__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(EPackage newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EDeltaLangPackage.EPACKAGE_OPERATION__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EDeltaLangPackage.EPACKAGE_OPERATION__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.EPACKAGE_OPERATION__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOp(EObject newOp, NotificationChain msgs)
  {
    EObject oldOp = op;
    op = newOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.EPACKAGE_OPERATION__OP, oldOp, newOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(EObject newOp)
  {
    if (newOp != op)
    {
      NotificationChain msgs = null;
      if (op != null)
        msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EDeltaLangPackage.EPACKAGE_OPERATION__OP, null, msgs);
      if (newOp != null)
        msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EDeltaLangPackage.EPACKAGE_OPERATION__OP, null, msgs);
      msgs = basicSetOp(newOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.EPACKAGE_OPERATION__OP, newOp, newOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<setter> getSetters()
  {
    if (setters == null)
    {
      setters = new EObjectContainmentEList<setter>(setter.class, this, EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS);
    }
    return setters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EClassOperation> getClasses()
  {
    if (classes == null)
    {
      classes = new EObjectContainmentEList<EClassOperation>(EClassOperation.class, this, EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES);
    }
    return classes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ComplexOperator> getComplex()
  {
    if (complex == null)
    {
      complex = new EObjectContainmentEList<ComplexOperator>(ComplexOperator.class, this, EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX);
    }
    return complex;
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
      case EDeltaLangPackage.EPACKAGE_OPERATION__VAR:
        return basicSetVar(null, msgs);
      case EDeltaLangPackage.EPACKAGE_OPERATION__OP:
        return basicSetOp(null, msgs);
      case EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS:
        return ((InternalEList<?>)getSetters()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES:
        return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX:
        return ((InternalEList<?>)getComplex()).basicRemove(otherEnd, msgs);
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
      case EDeltaLangPackage.EPACKAGE_OPERATION__VAR:
        return getVar();
      case EDeltaLangPackage.EPACKAGE_OPERATION__OP:
        return getOp();
      case EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS:
        return getSetters();
      case EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES:
        return getClasses();
      case EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX:
        return getComplex();
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
      case EDeltaLangPackage.EPACKAGE_OPERATION__VAR:
        setVar((EPackage)newValue);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__OP:
        setOp((EObject)newValue);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS:
        getSetters().clear();
        getSetters().addAll((Collection<? extends setter>)newValue);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES:
        getClasses().clear();
        getClasses().addAll((Collection<? extends EClassOperation>)newValue);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX:
        getComplex().clear();
        getComplex().addAll((Collection<? extends ComplexOperator>)newValue);
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
      case EDeltaLangPackage.EPACKAGE_OPERATION__VAR:
        setVar((EPackage)null);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__OP:
        setOp((EObject)null);
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS:
        getSetters().clear();
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES:
        getClasses().clear();
        return;
      case EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX:
        getComplex().clear();
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
      case EDeltaLangPackage.EPACKAGE_OPERATION__VAR:
        return var != null;
      case EDeltaLangPackage.EPACKAGE_OPERATION__OP:
        return op != null;
      case EDeltaLangPackage.EPACKAGE_OPERATION__SETTERS:
        return setters != null && !setters.isEmpty();
      case EDeltaLangPackage.EPACKAGE_OPERATION__CLASSES:
        return classes != null && !classes.isEmpty();
      case EDeltaLangPackage.EPACKAGE_OPERATION__COMPLEX:
        return complex != null && !complex.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EPackageOperationImpl
