/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.AttributeOp;
import it.univaq.coevolution.migration.ClassOp;
import it.univaq.coevolution.migration.ComplexOperator;
import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.ReferenceOp;

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
 * An implementation of the model object '<em><b>Complex Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl#getParams <em>Params</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl#getAttributeOperations <em>Attribute Operations</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.ComplexOperatorImpl#getReferenceOperations <em>Reference Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexOperatorImpl extends MinimalEObjectImpl.Container implements ComplexOperator
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
   * The cached value of the '{@link #getClassOperations() <em>Class Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassOperations()
   * @generated
   * @ordered
   */
  protected EList<ClassOp> classOperations;

  /**
   * The cached value of the '{@link #getAttributeOperations() <em>Attribute Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeOperations()
   * @generated
   * @ordered
   */
  protected EList<AttributeOp> attributeOperations;

  /**
   * The cached value of the '{@link #getReferenceOperations() <em>Reference Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceOperations()
   * @generated
   * @ordered
   */
  protected EList<ReferenceOp> referenceOperations;

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
    return MigrationPackage.Literals.COMPLEX_OPERATOR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.COMPLEX_OPERATOR__NAME, oldName, name));
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
      params = new EObjectContainmentEList<EObject>(EObject.class, this, MigrationPackage.COMPLEX_OPERATOR__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassOp> getClassOperations()
  {
    if (classOperations == null)
    {
      classOperations = new EObjectContainmentEList<ClassOp>(ClassOp.class, this, MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS);
    }
    return classOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeOp> getAttributeOperations()
  {
    if (attributeOperations == null)
    {
      attributeOperations = new EObjectContainmentEList<AttributeOp>(AttributeOp.class, this, MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS);
    }
    return attributeOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReferenceOp> getReferenceOperations()
  {
    if (referenceOperations == null)
    {
      referenceOperations = new EObjectContainmentEList<ReferenceOp>(ReferenceOp.class, this, MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS);
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
      case MigrationPackage.COMPLEX_OPERATOR__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS:
        return ((InternalEList<?>)getClassOperations()).basicRemove(otherEnd, msgs);
      case MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS:
        return ((InternalEList<?>)getAttributeOperations()).basicRemove(otherEnd, msgs);
      case MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS:
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
      case MigrationPackage.COMPLEX_OPERATOR__NAME:
        return getName();
      case MigrationPackage.COMPLEX_OPERATOR__PARAMS:
        return getParams();
      case MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS:
        return getClassOperations();
      case MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS:
        return getAttributeOperations();
      case MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS:
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
      case MigrationPackage.COMPLEX_OPERATOR__NAME:
        setName((String)newValue);
        return;
      case MigrationPackage.COMPLEX_OPERATOR__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends EObject>)newValue);
        return;
      case MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS:
        getClassOperations().clear();
        getClassOperations().addAll((Collection<? extends ClassOp>)newValue);
        return;
      case MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS:
        getAttributeOperations().clear();
        getAttributeOperations().addAll((Collection<? extends AttributeOp>)newValue);
        return;
      case MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS:
        getReferenceOperations().clear();
        getReferenceOperations().addAll((Collection<? extends ReferenceOp>)newValue);
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
      case MigrationPackage.COMPLEX_OPERATOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MigrationPackage.COMPLEX_OPERATOR__PARAMS:
        getParams().clear();
        return;
      case MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS:
        getClassOperations().clear();
        return;
      case MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS:
        getAttributeOperations().clear();
        return;
      case MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS:
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
      case MigrationPackage.COMPLEX_OPERATOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MigrationPackage.COMPLEX_OPERATOR__PARAMS:
        return params != null && !params.isEmpty();
      case MigrationPackage.COMPLEX_OPERATOR__CLASS_OPERATIONS:
        return classOperations != null && !classOperations.isEmpty();
      case MigrationPackage.COMPLEX_OPERATOR__ATTRIBUTE_OPERATIONS:
        return attributeOperations != null && !attributeOperations.isEmpty();
      case MigrationPackage.COMPLEX_OPERATOR__REFERENCE_OPERATIONS:
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

} //ComplexOperatorImpl
