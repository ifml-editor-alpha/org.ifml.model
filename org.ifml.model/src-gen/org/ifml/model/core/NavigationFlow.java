/**
 */
package org.ifml.model.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ifml.model.core.NavigationFlow#getDataFlows <em>Data Flows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ifml.model.core.CorePackage#getNavigationFlow()
 * @model
 * @generated
 */
public interface NavigationFlow extends InteractionFlow {
    /**
     * Returns the value of the '<em><b>Data Flows</b></em>' reference list.
     * The list contents are of type {@link org.ifml.model.core.DataFlow}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Flows</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Flows</em>' reference list.
     * @see org.ifml.model.core.CorePackage#getNavigationFlow_DataFlows()
     * @model ordered="false"
     * @generated
     */
    EList<DataFlow> getDataFlows();

} // NavigationFlow
