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

import org.xtext.t2.lisp.lisp.Identifier;
import org.xtext.t2.lisp.lisp.Keyword;
import org.xtext.t2.lisp.lisp.LispPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.t2.lisp.lisp.impl.KeywordImpl#getIdentifier1 <em>Identifier1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeywordImpl extends MinimalEObjectImpl.Container implements Keyword
{
  /**
   * The cached value of the '{@link #getIdentifier1() <em>Identifier1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier1()
   * @generated
   * @ordered
   */
  protected Identifier identifier1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KeywordImpl()
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
    return LispPackage.Literals.KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Identifier getIdentifier1()
  {
    return identifier1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentifier1(Identifier newIdentifier1, NotificationChain msgs)
  {
    Identifier oldIdentifier1 = identifier1;
    identifier1 = newIdentifier1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LispPackage.KEYWORD__IDENTIFIER1, oldIdentifier1, newIdentifier1);
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
  public void setIdentifier1(Identifier newIdentifier1)
  {
    if (newIdentifier1 != identifier1)
    {
      NotificationChain msgs = null;
      if (identifier1 != null)
        msgs = ((InternalEObject)identifier1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LispPackage.KEYWORD__IDENTIFIER1, null, msgs);
      if (newIdentifier1 != null)
        msgs = ((InternalEObject)newIdentifier1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LispPackage.KEYWORD__IDENTIFIER1, null, msgs);
      msgs = basicSetIdentifier1(newIdentifier1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LispPackage.KEYWORD__IDENTIFIER1, newIdentifier1, newIdentifier1));
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
      case LispPackage.KEYWORD__IDENTIFIER1:
        return basicSetIdentifier1(null, msgs);
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
      case LispPackage.KEYWORD__IDENTIFIER1:
        return getIdentifier1();
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
      case LispPackage.KEYWORD__IDENTIFIER1:
        setIdentifier1((Identifier)newValue);
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
      case LispPackage.KEYWORD__IDENTIFIER1:
        setIdentifier1((Identifier)null);
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
      case LispPackage.KEYWORD__IDENTIFIER1:
        return identifier1 != null;
    }
    return super.eIsSet(featureID);
  }

} //KeywordImpl
