/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperator;
import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorImpl#getNew <em>New</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexOperatorImpl extends MinimalEObjectImpl.Container implements ComplexOperator
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ComplexOperatorDef ref;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<EObject> args;

  /**
   * The cached value of the '{@link #getNew() <em>New</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew()
   * @generated
   * @ordered
   */
  protected EList<String> new_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexOperatorImpl()
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
    return EDeltaLangPackage.Literals.COMPLEX_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperatorDef getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ComplexOperatorDef)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EDeltaLangPackage.COMPLEX_OPERATOR__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperatorDef basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ComplexOperatorDef newRef)
  {
    ComplexOperatorDef oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.COMPLEX_OPERATOR__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getArgs()
  {
    if (args == null)
    {
      args = new EObjectResolvingEList<EObject>(EObject.class, this, EDeltaLangPackage.COMPLEX_OPERATOR__ARGS);
    }
    return args;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNew()
  {
    if (new_ == null)
    {
      new_ = new EDataTypeEList<String>(String.class, this, EDeltaLangPackage.COMPLEX_OPERATOR__NEW);
    }
    return new_;
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
      case EDeltaLangPackage.COMPLEX_OPERATOR__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case EDeltaLangPackage.COMPLEX_OPERATOR__ARGS:
        return getArgs();
      case EDeltaLangPackage.COMPLEX_OPERATOR__NEW:
        return getNew();
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
      case EDeltaLangPackage.COMPLEX_OPERATOR__REF:
        setRef((ComplexOperatorDef)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends EObject>)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR__NEW:
        getNew().clear();
        getNew().addAll((Collection<? extends String>)newValue);
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
      case EDeltaLangPackage.COMPLEX_OPERATOR__REF:
        setRef((ComplexOperatorDef)null);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR__ARGS:
        getArgs().clear();
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR__NEW:
        getNew().clear();
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
      case EDeltaLangPackage.COMPLEX_OPERATOR__REF:
        return ref != null;
      case EDeltaLangPackage.COMPLEX_OPERATOR__ARGS:
        return args != null && !args.isEmpty();
      case EDeltaLangPackage.COMPLEX_OPERATOR__NEW:
        return new_ != null && !new_.isEmpty();
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
    result.append(" (new: ");
    result.append(new_);
    result.append(')');
    return result.toString();
  }

} //ComplexOperatorImpl
