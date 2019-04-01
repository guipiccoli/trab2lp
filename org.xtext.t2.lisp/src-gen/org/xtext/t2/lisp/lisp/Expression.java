/**
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.lisp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.Expression#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Expression#getVariable4 <em>Variable4</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Expression#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Expression#getFormals <em>Formals</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.Expression#getBody1 <em>Body1</em>}</li>
 * </ul>
 *
 * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(Constant)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression_Constant()
   * @model containment="true"
   * @generated
   */
  Constant getConstant();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Expression#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(Constant value);

  /**
   * Returns the value of the '<em><b>Variable4</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable4</em>' containment reference.
   * @see #setVariable4(Variable)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression_Variable4()
   * @model containment="true"
   * @generated
   */
  Variable getVariable4();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Expression#getVariable4 <em>Variable4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable4</em>' containment reference.
   * @see #getVariable4()
   * @generated
   */
  void setVariable4(Variable value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Expression#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formals</em>' containment reference.
   * @see #setFormals(Formals)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression_Formals()
   * @model containment="true"
   * @generated
   */
  Formals getFormals();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Expression#getFormals <em>Formals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formals</em>' containment reference.
   * @see #getFormals()
   * @generated
   */
  void setFormals(Formals value);

  /**
   * Returns the value of the '<em><b>Body1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body1</em>' containment reference.
   * @see #setBody1(Body)
   * @see org.xtext.t2.lisp.lisp.LispPackage#getExpression_Body1()
   * @model containment="true"
   * @generated
   */
  Body getBody1();

  /**
   * Sets the value of the '{@link org.xtext.t2.lisp.lisp.Expression#getBody1 <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body1</em>' containment reference.
   * @see #getBody1()
   * @generated
   */
  void setBody1(Body value);

} // Expression
