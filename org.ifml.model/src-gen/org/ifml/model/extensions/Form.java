/**
 */
package org.ifml.model.extensions;

import org.eclipse.emf.common.util.EList;

import org.ifml.model.core.ViewComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.extensions.Form#getSubmitEvent <em>Submit Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.extensions.ExtensionsPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends ViewComponent {
    /**
     * Returns the value of the '<em><b>Submit Event</b></em>' reference list.
     * The list contents are of type {@link org.ifml.model.extensions.SubmitEvent}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Submit Event</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Submit Event</em>' reference list.
     * @see org.ifml.model.extensions.ExtensionsPackage#getForm_SubmitEvent()
     * @model ordered="false"
     * @generated
     */
    EList<SubmitEvent> getSubmitEvent();

} // Form
