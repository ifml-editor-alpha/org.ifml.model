/**
 */
package org.ifml.model.uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ifml.model.uml.Annotation;
import org.ifml.model.uml.Association;
import org.ifml.model.uml.Behavior;
import org.ifml.model.uml.BehavioralFeature;
import org.ifml.model.uml.Classifier;
import org.ifml.model.uml.Element;
import org.ifml.model.uml.MultiplicityElement;
import org.ifml.model.uml.NamedElement;
import org.ifml.model.uml.StructuralFeature;
import org.ifml.model.uml.TemplaetableElement;
import org.ifml.model.uml.TypedElement;
import org.ifml.model.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ifml.model.uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UmlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UmlSwitch<Adapter> modelSwitch =
        new UmlSwitch<Adapter>() {
            @Override
            public Adapter caseAssociation(Association object) {
                return createAssociationAdapter();
            }
            @Override
            public Adapter caseClassifier(Classifier object) {
                return createClassifierAdapter();
            }
            @Override
            public Adapter caseClass(org.ifml.model.uml.Class object) {
                return createClassAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseBehavioralFeature(BehavioralFeature object) {
                return createBehavioralFeatureAdapter();
            }
            @Override
            public Adapter caseBehavior(Behavior object) {
                return createBehaviorAdapter();
            }
            @Override
            public Adapter caseTemplaetableElement(TemplaetableElement object) {
                return createTemplaetableElementAdapter();
            }
            @Override
            public Adapter caseTypedElement(TypedElement object) {
                return createTypedElementAdapter();
            }
            @Override
            public Adapter caseMultiplicityElement(MultiplicityElement object) {
                return createMultiplicityElementAdapter();
            }
            @Override
            public Adapter caseStructuralFeature(StructuralFeature object) {
                return createStructuralFeatureAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseAnnotation(Annotation object) {
                return createAnnotationAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.BehavioralFeature <em>Behavioral Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.BehavioralFeature
     * @generated
     */
    public Adapter createBehavioralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Behavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Behavior
     * @generated
     */
    public Adapter createBehaviorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.TemplaetableElement <em>Templaetable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.TemplaetableElement
     * @generated
     */
    public Adapter createTemplaetableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.TypedElement
     * @generated
     */
    public Adapter createTypedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.MultiplicityElement <em>Multiplicity Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.MultiplicityElement
     * @generated
     */
    public Adapter createMultiplicityElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.StructuralFeature
     * @generated
     */
    public Adapter createStructuralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.ifml.model.uml.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.ifml.model.uml.Annotation
     * @generated
     */
    public Adapter createAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //UmlAdapterFactory
