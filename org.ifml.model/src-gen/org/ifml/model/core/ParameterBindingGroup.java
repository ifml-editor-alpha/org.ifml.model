/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.ParameterBindingGroup#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getParameterBindingGroup()
 * @model
 * @generated
 */
public interface ParameterBindingGroup extends InteractionFlowModelElement {
    /**
     * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference list.
     * The list contents are of type {@link org.ifml.model.core.ParameterBinding}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Bindings</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Bindings</em>' containment reference list.
     * @see org.ifml.model.core.CorePackage#getParameterBindingGroup_ParameterBindings()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ParameterBinding> getParameterBindings();

} // ParameterBindingGroup
