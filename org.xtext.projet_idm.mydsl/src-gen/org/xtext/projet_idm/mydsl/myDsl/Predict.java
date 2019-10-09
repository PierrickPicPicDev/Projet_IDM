/**
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.Predict#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getPredict()
 * @model
 * @generated
 */
public interface Predict extends EObject
{
  /**
   * Returns the value of the '<em><b>Algo</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.projet_idm.mydsl.myDsl.ALGO}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algo</em>' attribute.
   * @see org.xtext.projet_idm.mydsl.myDsl.ALGO
   * @see #setAlgo(ALGO)
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getPredict_Algo()
   * @model
   * @generated
   */
  ALGO getAlgo();

  /**
   * Sets the value of the '{@link org.xtext.projet_idm.mydsl.myDsl.Predict#getAlgo <em>Algo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algo</em>' attribute.
   * @see org.xtext.projet_idm.mydsl.myDsl.ALGO
   * @see #getAlgo()
   * @generated
   */
  void setAlgo(ALGO value);

} // Predict