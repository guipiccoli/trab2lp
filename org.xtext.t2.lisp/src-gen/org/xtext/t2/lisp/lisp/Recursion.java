/**
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.lisp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recursion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionID <em>Recursion ID</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionInt <em>Recursion Int</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionString <em>Recursion String</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionDefinition <em>Recursion Definition</em>}</li>
 * </ul>
 *
 * @see org.xtext.t2.lisp.lisp.LispPackage#getRecursion()
 * @model
 * @generated
 */
public interface Recursion extends EObject
{
  /**
   * Returns the value of the '<em><b>Recursion ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion ID</em>' attribute.
   * @see #setRecursionID(String)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getRecursion_RecursionID()
   * @model
   * @generated
   */
  String getRecursionID();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionID <em>Recursion ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion ID</em>' attribute.
   * @see #getRecursionID()
   * @generated
   */
  void setRecursionID(String value);

  /**
   * Returns the value of the '<em><b>Recursion Int</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion Int</em>' containment reference.
   * @see #setRecursionInt(Numeros)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getRecursion_RecursionInt()
   * @model containment="true"
   * @generated
   */
  Numeros getRecursionInt();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionInt <em>Recursion Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion Int</em>' containment reference.
   * @see #getRecursionInt()
   * @generated
   */
  void setRecursionInt(Numeros value);

  /**
   * Returns the value of the '<em><b>Recursion String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion String</em>' attribute.
   * @see #setRecursionString(String)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getRecursion_RecursionString()
   * @model
   * @generated
   */
  String getRecursionString();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionString <em>Recursion String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion String</em>' attribute.
   * @see #getRecursionString()
   * @generated
   */
  void setRecursionString(String value);

  /**
   * Returns the value of the '<em><b>Recursion Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recursion Definition</em>' containment reference.
   * @see #setRecursionDefinition(Definition)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getRecursion_RecursionDefinition()
   * @model containment="true"
   * @generated
   */
  Definition getRecursionDefinition();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Recursion#getRecursionDefinition <em>Recursion Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Recursion Definition</em>' containment reference.
   * @see #getRecursionDefinition()
   * @generated
   */
  void setRecursionDefinition(Definition value);

} // Recursion
