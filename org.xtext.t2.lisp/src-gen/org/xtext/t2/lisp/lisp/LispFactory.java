/**
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.lisp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.t2.lisp.lisp.LispPackage
 * @generated
 */
public interface LispFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LispFactory eINSTANCE = org.xtext.t2.lisp.lisp.impl.LispFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  Definition createDefinition();

  /**
   * Returns a new object of class '<em>Begin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Begin</em>'.
   * @generated
   */
  Begin createBegin();

  /**
   * Returns a new object of class '<em>Define</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define</em>'.
   * @generated
   */
  Define createDefine();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Numeros</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeros</em>'.
   * @generated
   */
  Numeros createNumeros();

  /**
   * Returns a new object of class '<em>Operacoes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operacoes</em>'.
   * @generated
   */
  Operacoes createOperacoes();

  /**
   * Returns a new object of class '<em>Condicao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condicao</em>'.
   * @generated
   */
  Condicao createCondicao();

  /**
   * Returns a new object of class '<em>Inteiros</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inteiros</em>'.
   * @generated
   */
  Inteiros createInteiros();

  /**
   * Returns a new object of class '<em>Decimal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal</em>'.
   * @generated
   */
  Decimal createDecimal();

  /**
   * Returns a new object of class '<em>Recursion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Recursion</em>'.
   * @generated
   */
  Recursion createRecursion();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LispPackage getLispPackage();

} //LispFactory
