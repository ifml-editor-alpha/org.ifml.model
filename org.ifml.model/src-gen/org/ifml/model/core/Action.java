/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.Action#getActionEvents <em>Action Events</em>}</li>
 *   <li>{@link org.ifml.model.core.Action#getDynamicBehavior <em>Dynamic Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends InteractionFlowElement {
    /**
     * Returns the value of the '<em><b>Action Events</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.ActionEvent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action Events</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action Events</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getAction_ActionEvents()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ActionEvent> getActionEvents();

    /**
     * Returns the value of the '<em><b>Dynamic Behavior</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dynamic Behavior</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dynamic Behavior</em>' containment reference.
     * @see #setDynamicBehavior(DynamicBehavior)
     * @see org.ifml.model.core.CorePackage#getAction_DynamicBehavior()
     * @model containment="true"
     * @generated
     */
    DynamicBehavior getDynamicBehavior();

    /**
     * Sets the value of the '{@link org.ifml.model.core.Action#getDynamicBehavior <em>Dynamic Behavior</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dynamic Behavior</em>' containment reference.
     * @see #getDynamicBehavior()
     * @generated
     */
    void setDynamicBehavior(DynamicBehavior value);

} // Action
