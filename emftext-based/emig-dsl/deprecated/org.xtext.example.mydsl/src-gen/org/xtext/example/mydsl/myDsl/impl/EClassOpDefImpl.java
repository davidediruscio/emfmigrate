/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.EAttributeOpDef;
import org.xtext.example.mydsl.myDsl.EClassOpDef;
import org.xtext.example.mydsl.myDsl.EReferenceOpDef;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Op Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.EClassOpDefImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EClassOpDefImpl extends OpDefImpl implements EClassOpDef
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected EClass var;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected EClass ref;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<EAttributeOpDef> attributes;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<EReferenceOpDef> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClassOpDefImpl()
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
    return MyDslPackage.Literals.ECLASS_OP_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(EClass newVar, NotificationChain msgs)
  {
    EClass oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ECLASS_OP_DEF__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(EClass newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ECLASS_OP_DEF__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ECLASS_OP_DEF__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECLASS_OP_DEF__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRef(EClass newRef, NotificationChain msgs)
  {
    EClass oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ECLASS_OP_DEF__REF, oldRef, newRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(EClass newRef)
  {
    if (newRef != ref)
    {
      NotificationChain msgs = null;
      if (ref != null)
        msgs = ((InternalEObject)ref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ECLASS_OP_DEF__REF, null, msgs);
      if (newRef != null)
        msgs = ((InternalEObject)newRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ECLASS_OP_DEF__REF, null, msgs);
      msgs = basicSetRef(newRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ECLASS_OP_DEF__REF, newRef, newRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAttributeOpDef> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<EAttributeOpDef>(EAttributeOpDef.class, this, MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReferenceOpDef> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<EReferenceOpDef>(EReferenceOpDef.class, this, MyDslPackage.ECLASS_OP_DEF__REFERENCES);
    }
    return references;
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
      case MyDslPackage.ECLASS_OP_DEF__VAR:
        return basicSetVar(null, msgs);
      case MyDslPackage.ECLASS_OP_DEF__REF:
        return basicSetRef(null, msgs);
      case MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ECLASS_OP_DEF__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ECLASS_OP_DEF__VAR:
        return getVar();
      case MyDslPackage.ECLASS_OP_DEF__REF:
        return getRef();
      case MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES:
        return getAttributes();
      case MyDslPackage.ECLASS_OP_DEF__REFERENCES:
        return getReferences();
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
      case MyDslPackage.ECLASS_OP_DEF__VAR:
        setVar((EClass)newValue);
        return;
      case MyDslPackage.ECLASS_OP_DEF__REF:
        setRef((EClass)newValue);
        return;
      case MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends EAttributeOpDef>)newValue);
        return;
      case MyDslPackage.ECLASS_OP_DEF__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends EReferenceOpDef>)newValue);
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
      case MyDslPackage.ECLASS_OP_DEF__VAR:
        setVar((EClass)null);
        return;
      case MyDslPackage.ECLASS_OP_DEF__REF:
        setRef((EClass)null);
        return;
      case MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MyDslPackage.ECLASS_OP_DEF__REFERENCES:
        getReferences().clear();
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
      case MyDslPackage.ECLASS_OP_DEF__VAR:
        return var != null;
      case MyDslPackage.ECLASS_OP_DEF__REF:
        return ref != null;
      case MyDslPackage.ECLASS_OP_DEF__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MyDslPackage.ECLASS_OP_DEF__REFERENCES:
        return references != null && !references.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EClassOpDefImpl
