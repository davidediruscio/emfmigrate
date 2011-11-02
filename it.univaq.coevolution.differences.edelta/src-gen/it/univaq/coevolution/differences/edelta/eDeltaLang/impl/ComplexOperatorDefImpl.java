/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.ComplexOperatorDef;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EAttributeOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EClassOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EPackageOperation;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EReferenceOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Operator Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getParams <em>Params</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getPackageOperations <em>Package Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getAttributeOperations <em>Attribute Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.ComplexOperatorDefImpl#getReferenceOperations <em>Reference Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexOperatorDefImpl extends MinimalEObjectImpl.Container implements ComplexOperatorDef
{
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
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<EObject> params;

  /**
   * The cached value of the '{@link #getPackageOperations() <em>Package Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageOperations()
   * @generated
   * @ordered
   */
  protected EList<EPackageOperation> packageOperations;

  /**
   * The cached value of the '{@link #getClassOperations() <em>Class Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOperations()
   * @generated
   * @ordered
   */
  protected EList<EClassOperation> classOperations;

  /**
   * The cached value of the '{@link #getAttributeOperations() <em>Attribute Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeOperations()
   * @generated
   * @ordered
   */
  protected EList<EAttributeOperation> attributeOperations;

  /**
   * The cached value of the '{@link #getReferenceOperations() <em>Reference Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceOperations()
   * @generated
   * @ordered
   */
  protected EList<EReferenceOperation> referenceOperations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComplexOperatorDefImpl()
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
    return EDeltaLangPackage.Literals.COMPLEX_OPERATOR_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<EObject>(EObject.class, this, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EPackageOperation> getPackageOperations()
  {
    if (packageOperations == null)
    {
      packageOperations = new EObjectContainmentEList<EPackageOperation>(EPackageOperation.class, this, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS);
    }
    return packageOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EClassOperation> getClassOperations()
  {
    if (classOperations == null)
    {
      classOperations = new EObjectContainmentEList<EClassOperation>(EClassOperation.class, this, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS);
    }
    return classOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EAttributeOperation> getAttributeOperations()
  {
    if (attributeOperations == null)
    {
      attributeOperations = new EObjectContainmentEList<EAttributeOperation>(EAttributeOperation.class, this, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS);
    }
    return attributeOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EReferenceOperation> getReferenceOperations()
  {
    if (referenceOperations == null)
    {
      referenceOperations = new EObjectContainmentEList<EReferenceOperation>(EReferenceOperation.class, this, EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS);
    }
    return referenceOperations;
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
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS:
        return ((InternalEList<?>)getPackageOperations()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS:
        return ((InternalEList<?>)getClassOperations()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS:
        return ((InternalEList<?>)getAttributeOperations()).basicRemove(otherEnd, msgs);
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS:
        return ((InternalEList<?>)getReferenceOperations()).basicRemove(otherEnd, msgs);
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
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__NAME:
        return getName();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS:
        return getParams();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS:
        return getPackageOperations();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS:
        return getClassOperations();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS:
        return getAttributeOperations();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS:
        return getReferenceOperations();
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
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__NAME:
        setName((String)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends EObject>)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS:
        getPackageOperations().clear();
        getPackageOperations().addAll((Collection<? extends EPackageOperation>)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS:
        getClassOperations().clear();
        getClassOperations().addAll((Collection<? extends EClassOperation>)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS:
        getAttributeOperations().clear();
        getAttributeOperations().addAll((Collection<? extends EAttributeOperation>)newValue);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS:
        getReferenceOperations().clear();
        getReferenceOperations().addAll((Collection<? extends EReferenceOperation>)newValue);
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
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS:
        getParams().clear();
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS:
        getPackageOperations().clear();
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS:
        getClassOperations().clear();
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS:
        getAttributeOperations().clear();
        return;
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS:
        getReferenceOperations().clear();
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
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PARAMS:
        return params != null && !params.isEmpty();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__PACKAGE_OPERATIONS:
        return packageOperations != null && !packageOperations.isEmpty();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__CLASS_OPERATIONS:
        return classOperations != null && !classOperations.isEmpty();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__ATTRIBUTE_OPERATIONS:
        return attributeOperations != null && !attributeOperations.isEmpty();
      case EDeltaLangPackage.COMPLEX_OPERATOR_DEF__REFERENCE_OPERATIONS:
        return referenceOperations != null && !referenceOperations.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ComplexOperatorDefImpl
