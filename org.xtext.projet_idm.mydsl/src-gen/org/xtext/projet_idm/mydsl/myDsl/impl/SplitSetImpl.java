/**
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.projet_idm.mydsl.myDsl.MyDslPackage;
import org.xtext.projet_idm.mydsl.myDsl.STRAT;
import org.xtext.projet_idm.mydsl.myDsl.SplitSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.SplitSetImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.SplitSetImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.SplitSetImpl#getStrat <em>Strat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitSetImpl extends MinimalEObjectImpl.Container implements SplitSet
{
  /**
   * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected static final String VAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected String var = VAR_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getStrat() <em>Strat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrat()
   * @generated
   * @ordered
   */
  protected static final STRAT STRAT_EDEFAULT = STRAT.TRAIN_TEST;

  /**
   * The cached value of the '{@link #getStrat() <em>Strat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrat()
   * @generated
   * @ordered
   */
  protected STRAT strat = STRAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplitSetImpl()
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
    return MyDslPackage.Literals.SPLIT_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(String newVar)
  {
    String oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPLIT_SET__VAR, oldVar, var));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPLIT_SET__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public STRAT getStrat()
  {
    return strat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrat(STRAT newStrat)
  {
    STRAT oldStrat = strat;
    strat = newStrat == null ? STRAT_EDEFAULT : newStrat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SPLIT_SET__STRAT, oldStrat, strat));
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
      case MyDslPackage.SPLIT_SET__VAR:
        return getVar();
      case MyDslPackage.SPLIT_SET__SIZE:
        return getSize();
      case MyDslPackage.SPLIT_SET__STRAT:
        return getStrat();
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
      case MyDslPackage.SPLIT_SET__VAR:
        setVar((String)newValue);
        return;
      case MyDslPackage.SPLIT_SET__SIZE:
        setSize((String)newValue);
        return;
      case MyDslPackage.SPLIT_SET__STRAT:
        setStrat((STRAT)newValue);
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
      case MyDslPackage.SPLIT_SET__VAR:
        setVar(VAR_EDEFAULT);
        return;
      case MyDslPackage.SPLIT_SET__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case MyDslPackage.SPLIT_SET__STRAT:
        setStrat(STRAT_EDEFAULT);
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
      case MyDslPackage.SPLIT_SET__VAR:
        return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
      case MyDslPackage.SPLIT_SET__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case MyDslPackage.SPLIT_SET__STRAT:
        return strat != STRAT_EDEFAULT;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (var: ");
    result.append(var);
    result.append(", size: ");
    result.append(size);
    result.append(", strat: ");
    result.append(strat);
    result.append(')');
    return result.toString();
  }

} //SplitSetImpl