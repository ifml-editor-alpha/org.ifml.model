/**
 */
package org.ifml.model.uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ifml.model.uml.NamedElement;
import org.ifml.model.uml.StructuralFeature;
import org.ifml.model.uml.TypedElement;
import org.ifml.model.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ifml.model.uml.impl.StructuralFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ifml.model.uml.impl.StructuralFeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralFeatureImpl extends MultiplicityElementImpl implements StructuralFeature {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuralFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.Literals.STRUCTURAL_FEATURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURAL_FEATURE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.STRUCTURAL_FEATURE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.STRUCTURAL_FEATURE__NAME:
                return getName();
            case UmlPackage.STRUCTURAL_FEATURE__TYPE:
                return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UmlPackage.STRUCTURAL_FEATURE__NAME:
                setName((String)newValue);
                return;
            case UmlPackage.STRUCTURAL_FEATURE__TYPE:
                setType((String)newValue);
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
            case UmlPackage.STRUCTURAL_FEATURE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UmlPackage.STRUCTURAL_FEATURE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case UmlPackage.STRUCTURAL_FEATURE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case UmlPackage.STRUCTURAL_FEATURE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.STRUCTURAL_FEATURE__NAME: return UmlPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
                case UmlPackage.STRUCTURAL_FEATURE__TYPE: return UmlPackage.TYPED_ELEMENT__TYPE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.NAMED_ELEMENT__NAME: return UmlPackage.STRUCTURAL_FEATURE__NAME;
                default: return -1;
            }
        }
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
                case UmlPackage.TYPED_ELEMENT__TYPE: return UmlPackage.STRUCTURAL_FEATURE__TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //StructuralFeatureImpl
