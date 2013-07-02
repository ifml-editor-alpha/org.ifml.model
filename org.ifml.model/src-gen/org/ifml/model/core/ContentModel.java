/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

import org.ifml.model.uml.Element;
import org.ifml.model.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.ContentModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getContentModel()
 * @model
 * @generated
 */
public interface ContentModel extends NamedElement {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.uml.Element}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getContentModel_Elements()
     * @model containment="true"
     * @generated
     */
    EList<Element> getElements();

} // ContentModel
