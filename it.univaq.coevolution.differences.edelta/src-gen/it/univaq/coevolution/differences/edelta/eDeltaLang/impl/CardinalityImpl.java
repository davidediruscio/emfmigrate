/**
 * <copyright>
 * </copyright>
 *
 */
package it.univaq.coevolution.differences.edelta.eDeltaLang.impl;

import it.univaq.coevolution.differences.edelta.eDeltaLang.Cardinality;
import it.univaq.coevolution.differences.edelta.eDeltaLang.EDeltaLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.CardinalityImpl#getInt <em>Int</em>}</li>
 *   <li>{@link it.univaq.coevolution.differences.edelta.eDeltaLang.impl.CardinalityImpl#getStar <em>Star</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityImpl extends MinimalEObjectImpl.Container implements Cardinality
{
  /**
   * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected static final int INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt()
   * @generated
   * @ordered
   */
  protected int int_ = INT_EDEFAULT;

  /**
   * The default value of the '{@link #getStar() <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStar()
   * @generated
   * @ordered
   */
  protected static final String STAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStar() <em>Star</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStar()
   * @generated
   * @ordered
   */
  protected String star = STAR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CardinalityImpl()
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
    return EDeltaLangPackage.Literals.CARDINALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInt()
  {
    return int_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt(int newInt)
  {
    int oldInt = int_;
    int_ = newInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.CARDINALITY__INT, oldInt, int_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStar()
  {
    return star;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStar(String newStar)
  {
    String oldStar = star;
    star = newStar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EDeltaLangPackage.CARDINALITY__STAR, oldStar, star));
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
      case EDeltaLangPackage.CARDINALITY__INT:
        return getInt();
      case EDeltaLangPackage.CARDINALITY__STAR:
        return getStar();
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
      case EDeltaLangPackage.CARDINALITY__INT:
        setInt((Integer)newValue);
        return;
      case EDeltaLangPackage.CARDINALITY__STAR:
        setStar((String)newValue);
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
      case EDeltaLangPackage.CARDINALITY__INT:
        setInt(INT_EDEFAULT);
        return;
      case EDeltaLangPackage.CARDINALITY__STAR:
        setStar(STAR_EDEFAULT);
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
      case EDeltaLangPackage.CARDINALITY__INT:
        return int_ != INT_EDEFAULT;
      case EDeltaLangPackage.CARDINALITY__STAR:
        return STAR_EDEFAULT == null ? star != null : !STAR_EDEFAULT.equals(star);
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
    result.append(" (int: ");
    result.append(int_);
    result.append(", star: ");
    result.append(star);
    result.append(')');
    return result.toString();
  }

} //CardinalityImpl
