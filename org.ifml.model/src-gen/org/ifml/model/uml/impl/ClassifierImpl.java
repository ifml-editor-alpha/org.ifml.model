/**
 */
package org.ifml.model.uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ifml.model.uml.Classifier;
import org.ifml.model.uml.StructuralFeature;
import org.ifml.model.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifml.model.uml.impl.ClassifierImpl#getStructuralFeatures <em>Structural Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassifierImpl extends NamedElementImpl implements Classifier {
    /**
     * The cached value of the '{@link #getStructuralFeatures() <em>Structural Features</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStructuralFeatures()
     * @generated
     * @ordered
     */
    protected EList<StructuralFeature> structuralFeatures;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ClassifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.Literals.CLASSIFIER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<StructuralFeature> getStructuralFeatures() {
        if (structuralFeatures == null) {
            structuralFeatures = new EObjectContainmentEList<StructuralFeature>(StructuralFeature.class, this, UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES);
        }
        return structuralFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
                return ((InternalEList<?>)getStructuralFeatures()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
                return getStructuralFeatures();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
                getStructuralFeatures().clear();
                getStructuralFeatures().addAll((Collection<? extends StructuralFeature>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
                getStructuralFeatures().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UmlPackage.CLASSIFIER__STRUCTURAL_FEATURES:
                return structuralFeatures != null && !structuralFeatures.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ClassifierImpl
