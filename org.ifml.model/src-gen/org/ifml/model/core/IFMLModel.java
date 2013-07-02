/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

import org.ifml.model.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFML Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}</li>
 *   <li>{@link org.ifml.model.core.IFMLModel#getContentModel <em>Content Model</em>}</li>
 *   <li>{@link org.ifml.model.core.IFMLModel#getInteractionFlowModelViewPoints <em>Interaction Flow Model View Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getIFMLModel()
 * @model
 * @generated
 */
public interface IFMLModel extends NamedElement {
    /**
     * Returns the value of the '<em><b>Interaction Flow Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Flow Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Flow Model</em>' containment reference.
     * @see #setInteractionFlowModel(InteractionFlowModel)
     * @see org.ifml.model.core.CorePackage#getIFMLModel_InteractionFlowModel()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    InteractionFlowModel getInteractionFlowModel();

    /**
     * Sets the value of the '{@link org.ifml.model.core.IFMLModel#getInteractionFlowModel <em>Interaction Flow Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Interaction Flow Model</em>' containment reference.
     * @see #getInteractionFlowModel()
     * @generated
     */
    void setInteractionFlowModel(InteractionFlowModel value);

    /**
     * Returns the value of the '<em><b>Content Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Content Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Content Model</em>' containment reference.
     * @see #setContentModel(ContentModel)
     * @see org.ifml.model.core.CorePackage#getIFMLModel_ContentModel()
     * @model containment="true" required="true" ordered="false"
     * @generated
     */
    ContentModel getContentModel();

    /**
     * Sets the value of the '{@link org.ifml.model.core.IFMLModel#getContentModel <em>Content Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Content Model</em>' containment reference.
     * @see #getContentModel()
     * @generated
     */
    void setContentModel(ContentModel value);

    /**
     * Returns the value of the '<em><b>Interaction Flow Model View Points</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.ViewPoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interaction Flow Model View Points</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interaction Flow Model View Points</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getIFMLModel_InteractionFlowModelViewPoints()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ViewPoint> getInteractionFlowModelViewPoints();

} // IFMLModel
