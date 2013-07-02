/**
 */
package org.ifml.model.extensions.impl;

import org.eclipse.emf.ecore.EClass;

import org.ifml.model.core.impl.ViewComponentPartImpl;

import org.ifml.model.extensions.ExtensionsPackage;
import org.ifml.model.extensions.Field;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class FieldImpl extends ViewComponentPartImpl implements Field {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExtensionsPackage.Literals.FIELD;
    }

} //FieldImpl
