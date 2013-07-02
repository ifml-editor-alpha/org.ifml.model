/**
 */
package org.ifml.model.uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.uml.Classifier#getStructuralFeatures <em>Structural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.uml.UmlPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends NamedElement, TemplaetableElement {
    /**
     * Returns the value of the '<em><b>Structural Features</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.uml.StructuralFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structural Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structural Features</em>' containment reference list.
     * @see org.ifml.model.uml.UmlPackage#getClassifier_StructuralFeatures()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<StructuralFeature> getStructuralFeatures();

} // Classifier
