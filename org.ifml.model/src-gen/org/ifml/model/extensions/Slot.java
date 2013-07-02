/**
 */
package org.ifml.model.extensions;

import org.ifml.model.core.Parameter;
import org.ifml.model.core.ViewComponentPart;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.extensions.Slot#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.extensions.ExtensionsPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends ViewComponentPart {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' reference.
     * @see #setParameter(Parameter)
     * @see org.ifml.model.extensions.ExtensionsPackage#getSlot_Parameter()
     * @model
     * @generated
     */
    Parameter getParameter();

    /**
     * Sets the value of the '{@link org.ifml.model.extensions.Slot#getParameter <em>Parameter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter</em>' reference.
     * @see #getParameter()
     * @generated
     */
    void setParameter(Parameter value);

} // Slot
