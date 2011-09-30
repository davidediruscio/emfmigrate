/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.FeatureSetters;
import it.univaq.coevolution.migration.MigrationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Setters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#getMetafeature <em>Metafeature</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#getValueEString <em>Value EString</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#getValueEInt <em>Value EInt</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#isValueEBool <em>Value EBool</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.FeatureSettersImpl#getValueFeature <em>Value Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureSettersImpl extends MinimalEObjectImpl.Container implements FeatureSetters
{
  /**
   * The cached value of the '{@link #getMetafeature() <em>Metafeature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetafeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature metafeature;

  /**
   * The default value of the '{@link #getValueEString() <em>Value EString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueEString()
   * @generated
   * @ordered
   */
  protected static final String VALUE_ESTRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueEString() <em>Value EString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueEString()
   * @generated
   * @ordered
   */
  protected String valueEString = VALUE_ESTRING_EDEFAULT;

  /**
   * The default value of the '{@link #getValueEInt() <em>Value EInt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueEInt()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EINT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueEInt() <em>Value EInt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueEInt()
   * @generated
   * @ordered
   */
  protected int valueEInt = VALUE_EINT_EDEFAULT;

  /**
   * The default value of the '{@link #isValueEBool() <em>Value EBool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValueEBool()
   * @generated
   * @ordered
   */
  protected static final boolean VALUE_EBOOL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValueEBool() <em>Value EBool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValueEBool()
   * @generated
   * @ordered
   */
  protected boolean valueEBool = VALUE_EBOOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueRef()
   * @generated
   * @ordered
   */
  protected EList<EObject> valueRef;

  /**
   * The cached value of the '{@link #getValueFeature() <em>Value Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature valueFeature;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureSettersImpl()
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
    return MigrationPackage.Literals.FEATURE_SETTERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getMetafeature()
  {
    if (metafeature != null && metafeature.eIsProxy())
    {
      InternalEObject oldMetafeature = (InternalEObject)metafeature;
      metafeature = (EStructuralFeature)eResolveProxy(oldMetafeature);
      if (metafeature != oldMetafeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FEATURE_SETTERS__METAFEATURE, oldMetafeature, metafeature));
      }
    }
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetMetafeature()
  {
    return metafeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetafeature(EStructuralFeature newMetafeature)
  {
    EStructuralFeature oldMetafeature = metafeature;
    metafeature = newMetafeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS__METAFEATURE, oldMetafeature, metafeature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueEString()
  {
    return valueEString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueEString(String newValueEString)
  {
    String oldValueEString = valueEString;
    valueEString = newValueEString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS__VALUE_ESTRING, oldValueEString, valueEString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueEInt()
  {
    return valueEInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueEInt(int newValueEInt)
  {
    int oldValueEInt = valueEInt;
    valueEInt = newValueEInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS__VALUE_EINT, oldValueEInt, valueEInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isValueEBool()
  {
    return valueEBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueEBool(boolean newValueEBool)
  {
    boolean oldValueEBool = valueEBool;
    valueEBool = newValueEBool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS__VALUE_EBOOL, oldValueEBool, valueEBool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getValueRef()
  {
    if (valueRef == null)
    {
      valueRef = new EObjectResolvingEList<EObject>(EObject.class, this, MigrationPackage.FEATURE_SETTERS__VALUE_REF);
    }
    return valueRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getValueFeature()
  {
    if (valueFeature != null && valueFeature.eIsProxy())
    {
      InternalEObject oldValueFeature = (InternalEObject)valueFeature;
      valueFeature = (EStructuralFeature)eResolveProxy(oldValueFeature);
      if (valueFeature != oldValueFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE, oldValueFeature, valueFeature));
      }
    }
    return valueFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetValueFeature()
  {
    return valueFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueFeature(EStructuralFeature newValueFeature)
  {
    EStructuralFeature oldValueFeature = valueFeature;
    valueFeature = newValueFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE, oldValueFeature, valueFeature));
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
      case MigrationPackage.FEATURE_SETTERS__METAFEATURE:
        if (resolve) return getMetafeature();
        return basicGetMetafeature();
      case MigrationPackage.FEATURE_SETTERS__VALUE_ESTRING:
        return getValueEString();
      case MigrationPackage.FEATURE_SETTERS__VALUE_EINT:
        return getValueEInt();
      case MigrationPackage.FEATURE_SETTERS__VALUE_EBOOL:
        return isValueEBool();
      case MigrationPackage.FEATURE_SETTERS__VALUE_REF:
        return getValueRef();
      case MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE:
        if (resolve) return getValueFeature();
        return basicGetValueFeature();
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
      case MigrationPackage.FEATURE_SETTERS__METAFEATURE:
        setMetafeature((EStructuralFeature)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_ESTRING:
        setValueEString((String)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_EINT:
        setValueEInt((Integer)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_EBOOL:
        setValueEBool((Boolean)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_REF:
        getValueRef().clear();
        getValueRef().addAll((Collection<? extends EObject>)newValue);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE:
        setValueFeature((EStructuralFeature)newValue);
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
      case MigrationPackage.FEATURE_SETTERS__METAFEATURE:
        setMetafeature((EStructuralFeature)null);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_ESTRING:
        setValueEString(VALUE_ESTRING_EDEFAULT);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_EINT:
        setValueEInt(VALUE_EINT_EDEFAULT);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_EBOOL:
        setValueEBool(VALUE_EBOOL_EDEFAULT);
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_REF:
        getValueRef().clear();
        return;
      case MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE:
        setValueFeature((EStructuralFeature)null);
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
      case MigrationPackage.FEATURE_SETTERS__METAFEATURE:
        return metafeature != null;
      case MigrationPackage.FEATURE_SETTERS__VALUE_ESTRING:
        return VALUE_ESTRING_EDEFAULT == null ? valueEString != null : !VALUE_ESTRING_EDEFAULT.equals(valueEString);
      case MigrationPackage.FEATURE_SETTERS__VALUE_EINT:
        return valueEInt != VALUE_EINT_EDEFAULT;
      case MigrationPackage.FEATURE_SETTERS__VALUE_EBOOL:
        return valueEBool != VALUE_EBOOL_EDEFAULT;
      case MigrationPackage.FEATURE_SETTERS__VALUE_REF:
        return valueRef != null && !valueRef.isEmpty();
      case MigrationPackage.FEATURE_SETTERS__VALUE_FEATURE:
        return valueFeature != null;
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
    result.append(" (valueEString: ");
    result.append(valueEString);
    result.append(", valueEInt: ");
    result.append(valueEInt);
    result.append(", valueEBool: ");
    result.append(valueEBool);
    result.append(')');
    return result.toString();
  }

} //FeatureSettersImpl
