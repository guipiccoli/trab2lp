/**
 * generated by Xtext 2.17.0
 */
package org.xtext.t2.lisp.lisp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.t2.lisp.lisp.Body;
import org.xtext.t2.lisp.lisp.Constant;
import org.xtext.t2.lisp.lisp.Expression;
import org.xtext.t2.lisp.lisp.Formals;
import org.xtext.t2.lisp.lisp.LispPackage;
import org.xtext.t2.lisp.lisp.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getVariable4 <em>Variable4</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getFormals <em>Formals</em>}</li>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.ExpressionImpl#getBody1 <em>Body1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected Constant constant;

  /**
   * The cached value of the '{@link #getVariable4() <em>Variable4</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable4()
   * @generated
   * @ordered
   */
  protected Variable variable4;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormals() <em>Formals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormals()
   * @generated
   * @ordered
   */
  protected Formals formals;

  /**
   * The cached value of the '{@link #getBody1() <em>Body1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody1()
   * @generated
   * @ordered
   */
  protected Body body1;

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
  @Override
  public Constant getConstant()
  {
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstant(Constant newConstant, NotificationChain msgs)
  {
    Constant oldConstant = constant;
    constant = newConstant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__CONSTANT, oldConstant, newConstant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConstant(Constant newConstant)
  {
    if (newConstant != constant)
    {
      NotificationChain msgs = null;
      if (constant != null)
        msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__CONSTANT, null, msgs);
      if (newConstant != null)
        msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__CONSTANT, null, msgs);
      msgs = basicSetConstant(newConstant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__CONSTANT, newConstant, newConstant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVariable4()
  {
    return variable4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable4(Variable newVariable4, NotificationChain msgs)
  {
    Variable oldVariable4 = variable4;
    variable4 = newVariable4;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__VARIABLE4, oldVariable4, newVariable4);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVariable4(Variable newVariable4)
  {
    if (newVariable4 != variable4)
    {
      NotificationChain msgs = null;
      if (variable4 != null)
        msgs = ((InternalEObject)variable4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__VARIABLE4, null, msgs);
      if (newVariable4 != null)
        msgs = ((InternalEObject)newVariable4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__VARIABLE4, null, msgs);
      msgs = basicSetVariable4(newVariable4, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__VARIABLE4, newVariable4, newVariable4));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Formals getFormals()
  {
    return formals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormals(Formals newFormals, NotificationChain msgs)
  {
    Formals oldFormals = formals;
    formals = newFormals;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__FORMALS, oldFormals, newFormals);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFormals(Formals newFormals)
  {
    if (newFormals != formals)
    {
      NotificationChain msgs = null;
      if (formals != null)
        msgs = ((InternalEObject)formals).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__FORMALS, null, msgs);
      if (newFormals != null)
        msgs = ((InternalEObject)newFormals).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__FORMALS, null, msgs);
      msgs = basicSetFormals(newFormals, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__FORMALS, newFormals, newFormals));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Body getBody1()
  {
    return body1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody1(Body newBody1, NotificationChain msgs)
  {
    Body oldBody1 = body1;
    body1 = newBody1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__BODY1, oldBody1, newBody1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBody1(Body newBody1)
  {
    if (newBody1 != body1)
    {
      NotificationChain msgs = null;
      if (body1 != null)
        msgs = ((InternalEObject)body1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__BODY1, null, msgs);
      if (newBody1 != null)
        msgs = ((InternalEObject)newBody1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.EXPRESSION__BODY1, null, msgs);
      msgs = basicSetBody1(newBody1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.EXPRESSION__BODY1, newBody1, newBody1));
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
      case LispPackage.EXPRESSION__CONSTANT:
        return basicSetConstant(null, msgs);
      case LispPackage.EXPRESSION__VARIABLE4:
        return basicSetVariable4(null, msgs);
      case LispPackage.EXPRESSION__FORMALS:
        return basicSetFormals(null, msgs);
      case LispPackage.EXPRESSION__BODY1:
        return basicSetBody1(null, msgs);
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
      case LispPackage.EXPRESSION__CONSTANT:
        return getConstant();
      case LispPackage.EXPRESSION__VARIABLE4:
        return getVariable4();
      case LispPackage.EXPRESSION__NAME:
        return getName();
      case LispPackage.EXPRESSION__FORMALS:
        return getFormals();
      case LispPackage.EXPRESSION__BODY1:
        return getBody1();
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
      case LispPackage.EXPRESSION__CONSTANT:
        setConstant((Constant)newValue);
        return;
      case LispPackage.EXPRESSION__VARIABLE4:
        setVariable4((Variable)newValue);
        return;
      case LispPackage.EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case LispPackage.EXPRESSION__FORMALS:
        setFormals((Formals)newValue);
        return;
      case LispPackage.EXPRESSION__BODY1:
        setBody1((Body)newValue);
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
      case LispPackage.EXPRESSION__CONSTANT:
        setConstant((Constant)null);
        return;
      case LispPackage.EXPRESSION__VARIABLE4:
        setVariable4((Variable)null);
        return;
      case LispPackage.EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LispPackage.EXPRESSION__FORMALS:
        setFormals((Formals)null);
        return;
      case LispPackage.EXPRESSION__BODY1:
        setBody1((Body)null);
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
      case LispPackage.EXPRESSION__CONSTANT:
        return constant != null;
      case LispPackage.EXPRESSION__VARIABLE4:
        return variable4 != null;
      case LispPackage.EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LispPackage.EXPRESSION__FORMALS:
        return formals != null;
      case LispPackage.EXPRESSION__BODY1:
        return body1 != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
