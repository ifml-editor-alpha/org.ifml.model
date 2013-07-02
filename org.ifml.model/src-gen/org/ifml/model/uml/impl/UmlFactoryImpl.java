/**
 */
package org.ifml.model.uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import org.ifml.model.uml.UmlFactory;
import org.ifml.model.uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UmlFactory init() {
        try {
            UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/spec/UML"); 
            if (theUmlFactory != null) {
                return theUmlFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UmlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case UmlPackage.ASSOCIATION: return createAssociation();
            case UmlPackage.CLASSIFIER: return createClassifier();
            case UmlPackage.CLASS: return createClass();
            case UmlPackage.ELEMENT: return createElement();
            case UmlPackage.BEHAVIORAL_FEATURE: return createBehavioralFeature();
            case UmlPackage.BEHAVIOR: return createBehavior();
            case UmlPackage.TEMPLAETABLE_ELEMENT: return createTemplaetableElement();
            case UmlPackage.TYPED_ELEMENT: return createTypedElement();
            case UmlPackage.MULTIPLICITY_ELEMENT: return createMultiplicityElement();
            case UmlPackage.STRUCTURAL_FEATURE: return createStructuralFeature();
            case UmlPackage.NAMED_ELEMENT: return createNamedElement();
            case UmlPackage.ANNOTATION: return createAnnotation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Classifier createClassifier() {
        ClassifierImpl classifier = new ClassifierImpl();
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.ifml.model.uml.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Element createElement() {
        ElementImpl element = new ElementImpl();
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehavioralFeature createBehavioralFeature() {
        BehavioralFeatureImpl behavioralFeature = new BehavioralFeatureImpl();
        return behavioralFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Behavior createBehavior() {
        BehaviorImpl behavior = new BehaviorImpl();
        return behavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplaetableElement createTemplaetableElement() {
        TemplaetableElementImpl templaetableElement = new TemplaetableElementImpl();
        return templaetableElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypedElement createTypedElement() {
        TypedElementImpl typedElement = new TypedElementImpl();
        return typedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityElement createMultiplicityElement() {
        MultiplicityElementImpl multiplicityElement = new MultiplicityElementImpl();
        return multiplicityElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeature createStructuralFeature() {
        StructuralFeatureImpl structuralFeature = new StructuralFeatureImpl();
        return structuralFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedElement createNamedElement() {
        NamedElementImpl namedElement = new NamedElementImpl();
        return namedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Annotation createAnnotation() {
        AnnotationImpl annotation = new AnnotationImpl();
        return annotation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlPackage getUmlPackage() {
        return (UmlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UmlPackage getPackage() {
        return UmlPackage.eINSTANCE;
    }

} //UmlFactoryImpl
