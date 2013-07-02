/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.Event#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link org.ifml.model.core.Event#getNavigationFlows <em>Navigation Flows</em>}</li>
 *   <li>{@link org.ifml.model.core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends InteractionFlowElement {
    /**
     * Returns the value of the '<em><b>Activation Expression</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Activation Expression</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Activation Expression</em>' reference.
     * @see #setActivationExpression(ActivationExpression)
     * @see org.ifml.model.core.CorePackage#getEvent_ActivationExpression()
     * @model ordered="false"
     * @generated
     */
    ActivationExpression getActivationExpression();

    /**
     * Sets the value of the '{@link org.ifml.model.core.Event#getActivationExpression <em>Activation Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Expression</em>' reference.
     * @see #getActivationExpression()
     * @generated
     */
    void setActivationExpression(ActivationExpression value);

    /**
     * Returns the value of the '<em><b>Navigation Flows</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.NavigationFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Navigation Flows</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Navigation Flows</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getEvent_NavigationFlows()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<NavigationFlow> getNavigationFlows();

    /**
     * Returns the value of the '<em><b>Interaction Flow Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Flow Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Flow Expression</em>' containment reference.
     * @see #setInteractionFlowExpression(InteractionFlowExpression)
     * @see org.ifml.model.core.CorePackage#getEvent_InteractionFlowExpression()
     * @model containment="true" ordered="false"
     * @generated
     */
    InteractionFlowExpression getInteractionFlowExpression();

    /**
     * Sets the value of the '{@link org.ifml.model.core.Event#getInteractionFlowExpression <em>Interaction Flow Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Flow Expression</em>' containment reference.
     * @see #getInteractionFlowExpression()
     * @generated
     */
    void setInteractionFlowExpression(InteractionFlowExpression value);

} // Event
