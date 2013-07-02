/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.ViewComponentPart#getViewElementEvents <em>View Element Events</em>}</li>
 *   <li>{@link org.ifml.model.core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}</li>
 *   <li>{@link org.ifml.model.core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}</li>
 *   <li>{@link org.ifml.model.core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getViewComponentPart()
 * @model
 * @generated
 */
public interface ViewComponentPart extends InteractionFlowElement {
    /**
     * Returns the value of the '<em><b>View Element Events</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.ViewElementEvent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Element Events</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Element Events</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getViewComponentPart_ViewElementEvents()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ViewElementEvent> getViewElementEvents();

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
     * @see org.ifml.model.core.CorePackage#getViewComponentPart_ActivationExpression()
     * @model ordered="false"
     * @generated
     */
    ActivationExpression getActivationExpression();

    /**
     * Sets the value of the '{@link org.ifml.model.core.ViewComponentPart#getActivationExpression <em>Activation Expression</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Activation Expression</em>' reference.
     * @see #getActivationExpression()
     * @generated
     */
    void setActivationExpression(ActivationExpression value);

    /**
     * Returns the value of the '<em><b>Sub View Component Parts</b></em>' reference list.
     * The list contents are of type {@link org.ifml.model.core.ViewComponentPart}.
     * It is bidirectional and its opposite is '{@link org.ifml.model.core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub View Component Parts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub View Component Parts</em>' reference list.
     * @see org.ifml.model.core.CorePackage#getViewComponentPart_SubViewComponentParts()
     * @see org.ifml.model.core.ViewComponentPart#getParentViewComponentPart
     * @model opposite="parentViewComponentPart"
     * @generated
     */
    EList<ViewComponentPart> getSubViewComponentParts();

    /**
     * Returns the value of the '<em><b>Parent View Component Part</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.ifml.model.core.ViewComponentPart#getSubViewComponentParts <em>Sub View Component Parts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent View Component Part</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent View Component Part</em>' reference.
     * @see #setParentViewComponentPart(ViewComponentPart)
     * @see org.ifml.model.core.CorePackage#getViewComponentPart_ParentViewComponentPart()
     * @see org.ifml.model.core.ViewComponentPart#getSubViewComponentParts
     * @model opposite="subViewComponentParts" required="true"
     * @generated
     */
    ViewComponentPart getParentViewComponentPart();

    /**
     * Sets the value of the '{@link org.ifml.model.core.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent View Component Part</em>' reference.
     * @see #getParentViewComponentPart()
     * @generated
     */
    void setParentViewComponentPart(ViewComponentPart value);

} // ViewComponentPart
