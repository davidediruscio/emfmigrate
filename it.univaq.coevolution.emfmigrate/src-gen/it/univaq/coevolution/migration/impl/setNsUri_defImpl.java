/**
 * <copyright>
 * </copyright>
 *

 */
package it.univaq.coevolution.migration.impl;

import it.univaq.coevolution.migration.MigrationPackage;
import it.univaq.coevolution.migration.setNsUri_def;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>set Ns Uri def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.migration.impl.setNsUri_defImpl#getOp <em>Op</em>}</li>
 *   <li>{@link it.univaq.coevolution.migration.impl.setNsUri_defImpl#getNsUri <em>Ns Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class setNsUri_defImpl extends MinimalEObjectImpl.Container implements setNsUri_def
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNsUri()
   * @generated
   * @ordered
   */
  protected static final String NS_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNsUri() <em>Ns Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNsUri()
   * @generated
   * @ordered
   */
  protected String nsUri = NS_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected setNsUri_defImpl()
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
    return MigrationPackage.Literals.SET_NS_URI_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.SET_NS_URI_DEF__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNsUri()
  {
    return nsUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNsUri(String newNsUri)
  {
    String oldNsUri = nsUri;
    nsUri = newNsUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MigrationPackage.SET_NS_URI_DEF__NS_URI, oldNsUri, nsUri));
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
      case MigrationPackage.SET_NS_URI_DEF__OP:
        return getOp();
      case MigrationPackage.SET_NS_URI_DEF__NS_URI:
        return getNsUri();
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
      case MigrationPackage.SET_NS_URI_DEF__OP:
        setOp((String)newValue);
        return;
      case MigrationPackage.SET_NS_URI_DEF__NS_URI:
        setNsUri((String)newValue);
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
      case MigrationPackage.SET_NS_URI_DEF__OP:
        setOp(OP_EDEFAULT);
        return;
      case MigrationPackage.SET_NS_URI_DEF__NS_URI:
        setNsUri(NS_URI_EDEFAULT);
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
      case MigrationPackage.SET_NS_URI_DEF__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case MigrationPackage.SET_NS_URI_DEF__NS_URI:
        return NS_URI_EDEFAULT == null ? nsUri != null : !NS_URI_EDEFAULT.equals(nsUri);
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
    result.append(" (op: ");
    result.append(op);
    result.append(", nsUri: ");
    result.append(nsUri);
    result.append(')');
    return result.toString();
  }

} //setNsUri_defImpl
