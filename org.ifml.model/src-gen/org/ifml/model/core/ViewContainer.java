/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.ViewContainer#isIsLandMark <em>Is Land Mark</em>}</li>
 *   <li>{@link org.ifml.model.core.ViewContainer#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.ifml.model.core.ViewContainer#getViewElements <em>View Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getViewContainer()
 * @model
 * @generated
 */
public interface ViewContainer extends ViewElement {
    /**
     * Returns the value of the '<em><b>Is Land Mark</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Land Mark</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Land Mark</em>' attribute.
     * @see #setIsLandMark(boolean)
     * @see org.ifml.model.core.CorePackage#getViewContainer_IsLandMark()
     * @model required="true" ordered="false"
     * @generated
     */
    boolean isIsLandMark();

    /**
     * Sets the value of the '{@link org.ifml.model.core.ViewContainer#isIsLandMark <em>Is Land Mark</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Land Mark</em>' attribute.
     * @see #isIsLandMark()
     * @generated
     */
    void setIsLandMark(boolean value);

    /**
     * Returns the value of the '<em><b>Is Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Default</em>' attribute.
     * @see #setIsDefault(boolean)
     * @see org.ifml.model.core.CorePackage#getViewContainer_IsDefault()
     * @model required="true" ordered="false"
     * @generated
     */
    boolean isIsDefault();

    /**
     * Sets the value of the '{@link org.ifml.model.core.ViewContainer#isIsDefault <em>Is Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Default</em>' attribute.
     * @see #isIsDefault()
     * @generated
     */
    void setIsDefault(boolean value);

    /**
     * Returns the value of the '<em><b>View Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.ViewElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>View Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>View Elements</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getViewContainer_ViewElements()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ViewElement> getViewElements();

} // ViewContainer
