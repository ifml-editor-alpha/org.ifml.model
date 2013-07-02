/**
 */
package org.ifml.model.uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.uml.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.uml.UmlPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.ifml.model.uml.UmlPackage#getTypedElement_Type()
     * @model required="true" ordered="false"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.ifml.model.uml.TypedElement#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // TypedElement
