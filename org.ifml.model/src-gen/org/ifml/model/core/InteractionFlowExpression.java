/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.InteractionFlowExpression#getInteractionFlows <em>Interaction Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getInteractionFlowExpression()
 * @model
 * @generated
 */
public interface InteractionFlowExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Interaction Flows</b></em>' reference list.
     * The list contents are of type {@link org.ifml.model.core.InteractionFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Flows</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Flows</em>' reference list.
     * @see org.ifml.model.core.CorePackage#getInteractionFlowExpression_InteractionFlows()
     * @model required="true" ordered="false"
     * @generated
     */
    EList<InteractionFlow> getInteractionFlows();

} // InteractionFlowExpression
