/**
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.CSVFile#getL2 <em>L2</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.CSVFile#getL3 <em>L3</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.CSVFile#getL4 <em>L4</em>}</li>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.CSVFile#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getCSVFile()
 * @model
 * @generated
 */
public interface CSVFile extends Operation
{
  /**
   * Returns the value of the '<em><b>L2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projet_idm.mydsl.myDsl.SplitSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L2</em>' containment reference list.
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getCSVFile_L2()
   * @model containment="true"
   * @generated
   */
  EList<SplitSet> getL2();

  /**
   * Returns the value of the '<em><b>L3</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projet_idm.mydsl.myDsl.Predict}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L3</em>' containment reference list.
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getCSVFile_L3()
   * @model containment="true"
   * @generated
   */
  EList<Predict> getL3();

  /**
   * Returns the value of the '<em><b>L4</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L4</em>' attribute list.
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getCSVFile_L4()
   * @model unique="false"
   * @generated
   */
  EList<String> getL4();

  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getCSVFile_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link org.xtext.projet_idm.mydsl.myDsl.CSVFile#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

} // CSVFile
