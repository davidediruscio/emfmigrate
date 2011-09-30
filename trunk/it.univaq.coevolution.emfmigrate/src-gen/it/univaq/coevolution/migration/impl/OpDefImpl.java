/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.ComplexOperator;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.OpDef;
import it.univaq.coevolution.migration.featureSetters_def;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getOpdef <em>Opdef</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getSettersdef <em>Settersdef</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getComplex <em>Complex</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getString <em>String</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.OpDefImpl#getFeatureSettersdef <em>Feature Settersdef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpDefImpl extends MinimalEObjectImpl.Container implements OpDef
{
  /**
   * The default value of the '{@link #getOpdef() <em>Opdef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpdef()
   * @generated
   * @ordered
   */
  protected static final String OPDEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpdef() <em>Opdef</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpdef()
   * @generated
   * @ordered
   */
  protected String opdef = OPDEF_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ENamedElement ref;

  /**
   * The cached value of the '{@link #getSettersdef() <em>Settersdef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettersdef()
   * @generated
   * @ordered
   */
  protected EList<EObject> settersdef;

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
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getDst() <em>Dst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDst()
   * @generated
   * @ordered
   */
  protected EClass dst;

  /**
   * The cached value of the '{@link #getFeatureSettersdef() <em>Feature Settersdef</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeatureSettersdef()
   * @generated
   * @ordered
   */
  protected EList<featureSetters_def> featureSettersdef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpDefImpl()
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
    return MigrationPackage.Literals.OP_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpdef()
  {
    return opdef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpdef(String newOpdef)
  {
    String oldOpdef = opdef;
    opdef = newOpdef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__OPDEF, oldOpdef, opdef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ENamedElement getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(ENamedElement newRef, NotificationChain msgs)
  {
    ENamedElement oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ENamedElement newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.OP_DEF__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.OP_DEF__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getSettersdef()
  {
    if (settersdef == null)
    {
      settersdef = new EObjectContainmentEList<EObject>(EObject.class, this, MigrationPackage.OP_DEF__SETTERSDEF);
    }
    return settersdef;
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
      complex = new EObjectContainmentEList<ComplexOperator>(ComplexOperator.class, this, MigrationPackage.OP_DEF__COMPLEX);
    }
    return complex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDst()
  {
    return dst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDst(EClass newDst, NotificationChain msgs)
  {
    EClass oldDst = dst;
    dst = newDst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__DST, oldDst, newDst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDst(EClass newDst)
  {
    if (newDst != dst)
    {
      NotificationChain msgs = null;
      if (dst != null)
        msgs = ((InternalEObject)dst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.OP_DEF__DST, null, msgs);
      if (newDst != null)
        msgs = ((InternalEObject)newDst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MigrationPackage.OP_DEF__DST, null, msgs);
      msgs = basicSetDst(newDst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.OP_DEF__DST, newDst, newDst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<featureSetters_def> getFeatureSettersdef()
  {
    if (featureSettersdef == null)
    {
      featureSettersdef = new EObjectContainmentEList<featureSetters_def>(featureSetters_def.class, this, MigrationPackage.OP_DEF__FEATURE_SETTERSDEF);
    }
    return featureSettersdef;
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
      case MigrationPackage.OP_DEF__REF:
        return basicSetRef(null, msgs);
      case MigrationPackage.OP_DEF__SETTERSDEF:
        return ((InternalEList<?>)getSettersdef()).basicRemove(otherEnd, msgs);
      case MigrationPackage.OP_DEF__COMPLEX:
        return ((InternalEList<?>)getComplex()).basicRemove(otherEnd, msgs);
      case MigrationPackage.OP_DEF__DST:
        return basicSetDst(null, msgs);
      case MigrationPackage.OP_DEF__FEATURE_SETTERSDEF:
        return ((InternalEList<?>)getFeatureSettersdef()).basicRemove(otherEnd, msgs);
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
      case MigrationPackage.OP_DEF__OPDEF:
        return getOpdef();
      case MigrationPackage.OP_DEF__REF:
        return getRef();
      case MigrationPackage.OP_DEF__SETTERSDEF:
        return getSettersdef();
      case MigrationPackage.OP_DEF__COMPLEX:
        return getComplex();
      case MigrationPackage.OP_DEF__STRING:
        return getString();
      case MigrationPackage.OP_DEF__DST:
        return getDst();
      case MigrationPackage.OP_DEF__FEATURE_SETTERSDEF:
        return getFeatureSettersdef();
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
      case MigrationPackage.OP_DEF__OPDEF:
        setOpdef((String)newValue);
        return;
      case MigrationPackage.OP_DEF__REF:
        setRef((ENamedElement)newValue);
        return;
      case MigrationPackage.OP_DEF__SETTERSDEF:
        getSettersdef().clear();
        getSettersdef().addAll((Collection<? extends EObject>)newValue);
        return;
      case MigrationPackage.OP_DEF__COMPLEX:
        getComplex().clear();
        getComplex().addAll((Collection<? extends ComplexOperator>)newValue);
        return;
      case MigrationPackage.OP_DEF__STRING:
        setString((String)newValue);
        return;
      case MigrationPackage.OP_DEF__DST:
        setDst((EClass)newValue);
        return;
      case MigrationPackage.OP_DEF__FEATURE_SETTERSDEF:
        getFeatureSettersdef().clear();
        getFeatureSettersdef().addAll((Collection<? extends featureSetters_def>)newValue);
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
      case MigrationPackage.OP_DEF__OPDEF:
        setOpdef(OPDEF_EDEFAULT);
        return;
      case MigrationPackage.OP_DEF__REF:
        setRef((ENamedElement)null);
        return;
      case MigrationPackage.OP_DEF__SETTERSDEF:
        getSettersdef().clear();
        return;
      case MigrationPackage.OP_DEF__COMPLEX:
        getComplex().clear();
        return;
      case MigrationPackage.OP_DEF__STRING:
        setString(STRING_EDEFAULT);
        return;
      case MigrationPackage.OP_DEF__DST:
        setDst((EClass)null);
        return;
      case MigrationPackage.OP_DEF__FEATURE_SETTERSDEF:
        getFeatureSettersdef().clear();
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
      case MigrationPackage.OP_DEF__OPDEF:
        return OPDEF_EDEFAULT == null ? opdef != null : !OPDEF_EDEFAULT.equals(opdef);
      case MigrationPackage.OP_DEF__REF:
        return ref != null;
      case MigrationPackage.OP_DEF__SETTERSDEF:
        return settersdef != null && !settersdef.isEmpty();
      case MigrationPackage.OP_DEF__COMPLEX:
        return complex != null && !complex.isEmpty();
      case MigrationPackage.OP_DEF__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case MigrationPackage.OP_DEF__DST:
        return dst != null;
      case MigrationPackage.OP_DEF__FEATURE_SETTERSDEF:
        return featureSettersdef != null && !featureSettersdef.isEmpty();
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
    result.append(" (opdef: ");
    result.append(opdef);
    result.append(", string: ");
    result.append(string);
    result.append(')');
    return result.toString();
  }

} //OpDefImpl
