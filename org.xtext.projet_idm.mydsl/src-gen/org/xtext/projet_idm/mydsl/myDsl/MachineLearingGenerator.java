/**
 * generated by Xtext 2.19.0
 */
package org.xtext.projet_idm.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Learing Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet_idm.mydsl.myDsl.MachineLearingGenerator#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getMachineLearingGenerator()
 * @model
 * @generated
 */
public interface MachineLearingGenerator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projet_idm.mydsl.myDsl.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.projet_idm.mydsl.myDsl.MyDslPackage#getMachineLearingGenerator_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // MachineLearingGenerator
