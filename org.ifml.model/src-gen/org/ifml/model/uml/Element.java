/**
 */
package org.ifml.model.uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.uml.Element#getId <em>Id</em>}</li>
 *   <li>{@link org.ifml.model.uml.Element#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.uml.UmlPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject {
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.ifml.model.uml.UmlPackage#getElement_Id()
     * @model required="true" ordered="false"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.ifml.model.uml.Element#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.uml.Annotation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Annotations</em>' containment reference list.
     * @see org.ifml.model.uml.UmlPackage#getElement_Annotations()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Annotation> getAnnotations();

} // Element
