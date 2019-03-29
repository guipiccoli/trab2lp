/**
 * generated by Xtext 2.15.0
 */
package org.xtext.t2.lisp.lisp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.t2.lisp.lisp.Expression;
import org.xtext.t2.lisp.lisp.Inteiros;
import org.xtext.t2.lisp.lisp.LispPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getOperacoes <em>Operacoes</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getInteiros <em>Inteiros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The default value of the '{@link #getOperacoes() <em>Operacoes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperacoes()
   * @generated
   * @ordered
   */
  protected static final String OPERACOES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperacoes() <em>Operacoes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperacoes()
   * @generated
   * @ordered
   */
  protected String operacoes = OPERACOES_EDEFAULT;

  /**
   * The cached value of the '{@link #getInteiros() <em>Inteiros</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteiros()
   * @generated
   * @ordered
   */
  protected Inteiros inteiros;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return LispPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperacoes()
  {
    return operacoes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperacoes(String newOperacoes)
  {
    String oldOperacoes = operacoes;
    operacoes = newOperacoes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__OPERACOES, oldOperacoes, operacoes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inteiros getInteiros()
  {
    return inteiros;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteiros(Inteiros newInteiros, NotificationChain msgs)
  {
    Inteiros oldInteiros = inteiros;
    inteiros = newInteiros;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__INTEIROS, oldInteiros, newInteiros);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteiros(Inteiros newInteiros)
  {
    if (newInteiros != inteiros)
    {
      NotificationChain msgs = null;
      if (inteiros != null)
        msgs = ((InternalEObject)inteiros).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__INTEIROS, null, msgs);
      if (newInteiros != null)
        msgs = ((InternalEObject)newInteiros).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__INTEIROS, null, msgs);
      msgs = basicSetInteiros(newInteiros, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__INTEIROS, newInteiros, newInteiros));
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
      case LispPackage.EXPRESSION__INTEIROS:
        return basicSetInteiros(null, msgs);
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
      case LispPackage.EXPRESSION__OPERACOES:
        return getOperacoes();
      case LispPackage.EXPRESSION__INTEIROS:
        return getInteiros();
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
      case LispPackage.EXPRESSION__OPERACOES:
        setOperacoes((String)newValue);
        return;
      case LispPackage.EXPRESSION__INTEIROS:
        setInteiros((Inteiros)newValue);
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
      case LispPackage.EXPRESSION__OPERACOES:
        setOperacoes(OPERACOES_EDEFAULT);
        return;
      case LispPackage.EXPRESSION__INTEIROS:
        setInteiros((Inteiros)null);
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
      case LispPackage.EXPRESSION__OPERACOES:
        return OPERACOES_EDEFAULT == null ? operacoes != null : !OPERACOES_EDEFAULT.equals(operacoes);
      case LispPackage.EXPRESSION__INTEIROS:
        return inteiros != null;
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
    result.append(" (operacoes: ");
    result.append(operacoes);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
