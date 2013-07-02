/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.SystemEvent#getTriggeringExpressions <em>Triggering Expressions</em>}</li>
 *   <li>{@link org.ifml.model.core.SystemEvent#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getSystemEvent()
 * @model
 * @generated
 */
public interface SystemEvent extends Event {
    /**
     * Returns the value of the '<em><b>Triggering Expressions</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.Expression}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggering Expressions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Triggering Expressions</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getSystemEvent_TriggeringExpressions()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    EList<Expression> getTriggeringExpressions();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.ifml.model.core.SystemEventTypeEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.ifml.model.core.SystemEventTypeEnum
     * @see #setType(SystemEventTypeEnum)
     * @see org.ifml.model.core.CorePackage#getSystemEvent_Type()
     * @model required="true" ordered="false"
     * @generated
     */
    SystemEventTypeEnum getType();

    /**
     * Sets the value of the '{@link org.ifml.model.core.SystemEvent#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.ifml.model.core.SystemEventTypeEnum
     * @see #getType()
     * @generated
     */
    void setType(SystemEventTypeEnum value);

} // SystemEvent
