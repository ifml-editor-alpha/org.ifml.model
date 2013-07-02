/**
 */
package org.ifml.model.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ifml.model.core.Action;
import org.ifml.model.core.ActionEvent;
import org.ifml.model.core.CorePackage;
import org.ifml.model.core.DynamicBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifml.model.core.impl.ActionImpl#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link org.ifml.model.core.impl.ActionImpl#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends InteractionFlowElementImpl implements Action {
    /**
     * The cached value of the '{@link #getActionEvents() <em>Action Events</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActionEvents()
     * @generated
     * @ordered
     */
    protected EList<ActionEvent> actionEvents;

    /**
     * The cached value of the '{@link #getDynamicBehavior() <em>Dynamic Behavior</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDynamicBehavior()
     * @generated
     * @ordered
     */
    protected DynamicBehavior dynamicBehavior;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CorePackage.Literals.ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ActionEvent> getActionEvents() {
        if (actionEvents == null) {
            actionEvents = new EObjectContainmentEList<ActionEvent>(ActionEvent.class, this, CorePackage.ACTION__ACTION_EVENTS);
        }
        return actionEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DynamicBehavior getDynamicBehavior() {
        return dynamicBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDynamicBehavior(DynamicBehavior newDynamicBehavior, NotificationChain msgs) {
        DynamicBehavior oldDynamicBehavior = dynamicBehavior;
        dynamicBehavior = newDynamicBehavior;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ACTION__DYNAMIC_BEHAVIOR, oldDynamicBehavior, newDynamicBehavior);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDynamicBehavior(DynamicBehavior newDynamicBehavior) {
        if (newDynamicBehavior != dynamicBehavior) {
            NotificationChain msgs = null;
            if (dynamicBehavior != null)
                msgs = ((InternalEObject)dynamicBehavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTION__DYNAMIC_BEHAVIOR, null, msgs);
            if (newDynamicBehavior != null)
                msgs = ((InternalEObject)newDynamicBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ACTION__DYNAMIC_BEHAVIOR, null, msgs);
            msgs = basicSetDynamicBehavior(newDynamicBehavior, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ACTION__DYNAMIC_BEHAVIOR, newDynamicBehavior, newDynamicBehavior));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CorePackage.ACTION__ACTION_EVENTS:
                return ((InternalEList<?>)getActionEvents()).basicRemove(otherEnd, msgs);
            case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
                return basicSetDynamicBehavior(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case CorePackage.ACTION__ACTION_EVENTS:
                return getActionEvents();
            case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
                return getDynamicBehavior();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case CorePackage.ACTION__ACTION_EVENTS:
                getActionEvents().clear();
                getActionEvents().addAll((Collection<? extends ActionEvent>)newValue);
                return;
            case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
                setDynamicBehavior((DynamicBehavior)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case CorePackage.ACTION__ACTION_EVENTS:
                getActionEvents().clear();
                return;
            case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
                setDynamicBehavior((DynamicBehavior)null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case CorePackage.ACTION__ACTION_EVENTS:
                return actionEvents != null && !actionEvents.isEmpty();
            case CorePackage.ACTION__DYNAMIC_BEHAVIOR:
                return dynamicBehavior != null;
        }
        return super.eIsSet(featureID);
    }

} //ActionImpl
