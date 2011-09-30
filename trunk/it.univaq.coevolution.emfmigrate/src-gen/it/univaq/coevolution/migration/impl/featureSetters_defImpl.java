/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.featureSetters_def;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>feature Setters def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl#getEType <em>EType</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.featureSetters_defImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class featureSetters_defImpl extends MinimalEObjectImpl.Container implements featureSetters_def
{
  /**
   * The default value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected static final int LOWER_BOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerBound() <em>Lower Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerBound()
   * @generated
   * @ordered
   */
  protected int lowerBound = LOWER_BOUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getEType() <em>EType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEType()
   * @generated
   * @ordered
   */
  protected EClassifier eType;

  /**
   * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpposite()
   * @generated
   * @ordered
   */
  protected ENamedElement opposite;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected featureSetters_defImpl()
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
    return MigrationPackage.Literals.FEATURE_SETTERS_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerBound()
  {
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerBound(int newLowerBound)
  {
    int oldLowerBound = lowerBound;
    lowerBound = newLowerBound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__LOWER_BOUND, oldLowerBound, lowerBound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClassifier getEType()
  {
    return eType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEType(EClassifier newEType, NotificationChain msgs)
  {
    EClassifier oldEType = eType;
    eType = newEType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__ETYPE, oldEType, newEType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEType(EClassifier newEType)
  {
    if (newEType != eType)
    {
      NotificationChain msgs = null;
      if (eType != null)
        msgs = ((InternalEObject)eType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FEATURE_SETTERS_DEF__ETYPE, null, msgs);
      if (newEType != null)
        msgs = ((InternalEObject)newEType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FEATURE_SETTERS_DEF__ETYPE, null, msgs);
      msgs = basicSetEType(newEType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__ETYPE, newEType, newEType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedElement getOpposite()
  {
    return opposite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpposite(ENamedElement newOpposite, NotificationChain msgs)
  {
    ENamedElement oldOpposite = opposite;
    opposite = newOpposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE, oldOpposite, newOpposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpposite(ENamedElement newOpposite)
  {
    if (newOpposite != opposite)
    {
      NotificationChain msgs = null;
      if (opposite != null)
        msgs = ((InternalEObject)opposite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE, null, msgs);
      if (newOpposite != null)
        msgs = ((InternalEObject)newOpposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE, null, msgs);
      msgs = basicSetOpposite(newOpposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE, newOpposite, newOpposite));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS_DEF__NAME, oldName, name));
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
      case MigrationPackage.FEATURE_SETTERS_DEF__ETYPE:
        return basicSetEType(null, msgs);
      case MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE:
        return basicSetOpposite(null, msgs);
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
      case MigrationPackage.FEATURE_SETTERS_DEF__LOWER_BOUND:
        return getLowerBound();
      case MigrationPackage.FEATURE_SETTERS_DEF__ETYPE:
        return getEType();
      case MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE:
        return getOpposite();
      case MigrationPackage.FEATURE_SETTERS_DEF__NAME:
        return getName();
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
      case MigrationPackage.FEATURE_SETTERS_DEF__LOWER_BOUND:
        setLowerBound((Integer)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__ETYPE:
        setEType((EClassifier)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE:
        setOpposite((ENamedElement)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__NAME:
        setName((String)newValue);
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
      case MigrationPackage.FEATURE_SETTERS_DEF__LOWER_BOUND:
        setLowerBound(LOWER_BOUND_EDEFAULT);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__ETYPE:
        setEType((EClassifier)null);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE:
        setOpposite((ENamedElement)null);
        return;
      case MigrationPackage.FEATURE_SETTERS_DEF__NAME:
        setName(NAME_EDEFAULT);
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
      case MigrationPackage.FEATURE_SETTERS_DEF__LOWER_BOUND:
        return lowerBound != LOWER_BOUND_EDEFAULT;
      case MigrationPackage.FEATURE_SETTERS_DEF__ETYPE:
        return eType != null;
      case MigrationPackage.FEATURE_SETTERS_DEF__OPPOSITE:
        return opposite != null;
      case MigrationPackage.FEATURE_SETTERS_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (lowerBound: ");
    result.append(lowerBound);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //featureSetters_defImpl
