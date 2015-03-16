/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.OCLinEcoreSpecificationCS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OC Lin Ecore Specification CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OCLinEcoreSpecificationCSImpl#getExprString <em>Expr String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OCLinEcoreSpecificationCSImpl extends MinimalEObjectImpl.Container implements OCLinEcoreSpecificationCS
{
  /**
   * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedExpression()
   * @generated
   * @ordered
   */
  protected ExpCS ownedExpression;

  /**
   * The default value of the '{@link #getExprString() <em>Expr String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprString()
   * @generated
   * @ordered
   */
  protected static final String EXPR_STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExprString() <em>Expr String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprString()
   * @generated
   * @ordered
   */
  protected String exprString = EXPR_STRING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OCLinEcoreSpecificationCSImpl()
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
    return MyDslPackage.Literals.OC_LIN_ECORE_SPECIFICATION_CS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpCS getOwnedExpression()
  {
    return ownedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOwnedExpression(ExpCS newOwnedExpression, NotificationChain msgs)
  {
    ExpCS oldOwnedExpression = ownedExpression;
    ownedExpression = newOwnedExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedExpression(ExpCS newOwnedExpression)
  {
    if (newOwnedExpression != ownedExpression)
    {
      NotificationChain msgs = null;
      if (ownedExpression != null)
        msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION, null, msgs);
      if (newOwnedExpression != null)
        msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION, null, msgs);
      msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExprString()
  {
    return exprString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExprString(String newExprString)
  {
    String oldExprString = exprString;
    exprString = newExprString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING, oldExprString, exprString));
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
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION:
        return basicSetOwnedExpression(null, msgs);
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
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION:
        return getOwnedExpression();
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING:
        return getExprString();
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
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION:
        setOwnedExpression((ExpCS)newValue);
        return;
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING:
        setExprString((String)newValue);
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
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION:
        setOwnedExpression((ExpCS)null);
        return;
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING:
        setExprString(EXPR_STRING_EDEFAULT);
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
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__OWNED_EXPRESSION:
        return ownedExpression != null;
      case MyDslPackage.OC_LIN_ECORE_SPECIFICATION_CS__EXPR_STRING:
        return EXPR_STRING_EDEFAULT == null ? exprString != null : !EXPR_STRING_EDEFAULT.equals(exprString);
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
    result.append(" (exprString: ");
    result.append(exprString);
    result.append(')');
    return result.toString();
  }

} //OCLinEcoreSpecificationCSImpl
