/**
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.lisp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.Keyword#getIdentifier1 <em>Identifier1</em>}</li>
 * </ul>
 *
 * @see org.xtext.t2.lisp.lisp.LispPackage#getKeyword()
 * @model
 * @generated
 */
public interface Keyword extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier1</em>' containment reference.
   * @see #setIdentifier1(Identifier)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getKeyword_Identifier1()
   * @model containment="true"
   * @generated
   */
  Identifier getIdentifier1();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Keyword#getIdentifier1 <em>Identifier1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier1</em>' containment reference.
   * @see #getIdentifier1()
   * @generated
   */
  void setIdentifier1(Identifier value);

} // Keyword
