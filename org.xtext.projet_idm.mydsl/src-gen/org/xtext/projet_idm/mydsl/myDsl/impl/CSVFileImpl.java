/**
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.projet_idm.mydsl.myDsl.CSVFile;
import org.xtext.projet_idm.mydsl.myDsl.MyDslPackage;
import org.xtext.projet_idm.mydsl.myDsl.Predict;
import org.xtext.projet_idm.mydsl.myDsl.SplitSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.CSVFileImpl#getL2 <em>L2</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.CSVFileImpl#getL3 <em>L3</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.CSVFileImpl#getL4 <em>L4</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.impl.CSVFileImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVFileImpl extends OperationImpl implements CSVFile
{
  /**
   * The cached value of the '{@link #getL2() <em>L2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL2()
   * @generated
   * @ordered
   */
  protected EList<SplitSet> l2;

  /**
   * The cached value of the '{@link #getL3() <em>L3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL3()
   * @generated
   * @ordered
   */
  protected EList<Predict> l3;

  /**
   * The cached value of the '{@link #getL4() <em>L4</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getL4()
   * @generated
   * @ordered
   */
  protected EList<String> l4;

  /**
   * The default value of the '{@link #getFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected static final String FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected String file = FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVFileImpl()
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
    return MyDslPackage.Literals.CSV_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SplitSet> getL2()
  {
    if (l2 == null)
    {
      l2 = new EObjectContainmentEList<SplitSet>(SplitSet.class, this, MyDslPackage.CSV_FILE__L2);
    }
    return l2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Predict> getL3()
  {
    if (l3 == null)
    {
      l3 = new EObjectContainmentEList<Predict>(Predict.class, this, MyDslPackage.CSV_FILE__L3);
    }
    return l3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getL4()
  {
    if (l4 == null)
    {
      l4 = new EDataTypeEList<String>(String.class, this, MyDslPackage.CSV_FILE__L4);
    }
    return l4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFile(String newFile)
  {
    String oldFile = file;
    file = newFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CSV_FILE__FILE, oldFile, file));
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
      case MyDslPackage.CSV_FILE__L2:
        return ((InternalEList<?>)getL2()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CSV_FILE__L3:
        return ((InternalEList<?>)getL3()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CSV_FILE__L2:
        return getL2();
      case MyDslPackage.CSV_FILE__L3:
        return getL3();
      case MyDslPackage.CSV_FILE__L4:
        return getL4();
      case MyDslPackage.CSV_FILE__FILE:
        return getFile();
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
      case MyDslPackage.CSV_FILE__L2:
        getL2().clear();
        getL2().addAll((Collection<? extends SplitSet>)newValue);
        return;
      case MyDslPackage.CSV_FILE__L3:
        getL3().clear();
        getL3().addAll((Collection<? extends Predict>)newValue);
        return;
      case MyDslPackage.CSV_FILE__L4:
        getL4().clear();
        getL4().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.CSV_FILE__FILE:
        setFile((String)newValue);
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
      case MyDslPackage.CSV_FILE__L2:
        getL2().clear();
        return;
      case MyDslPackage.CSV_FILE__L3:
        getL3().clear();
        return;
      case MyDslPackage.CSV_FILE__L4:
        getL4().clear();
        return;
      case MyDslPackage.CSV_FILE__FILE:
        setFile(FILE_EDEFAULT);
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
      case MyDslPackage.CSV_FILE__L2:
        return l2 != null && !l2.isEmpty();
      case MyDslPackage.CSV_FILE__L3:
        return l3 != null && !l3.isEmpty();
      case MyDslPackage.CSV_FILE__L4:
        return l4 != null && !l4.isEmpty();
      case MyDslPackage.CSV_FILE__FILE:
        return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
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
    result.append(" (l4: ");
    result.append(l4);
    result.append(", file: ");
    result.append(file);
    result.append(')');
    return result.toString();
  }

} //CSVFileImpl