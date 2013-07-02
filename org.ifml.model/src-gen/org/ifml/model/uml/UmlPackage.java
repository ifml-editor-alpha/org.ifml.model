/**
 */
package org.ifml.model.uml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ifml.model.uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "uml";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.omg.org/spec/UML";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "uml";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UmlPackage eINSTANCE = org.ifml.model.uml.impl.UmlPackageImpl.init();

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.ElementImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getElement()
     * @generated
     */
    int ELEMENT = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ID = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT__ANNOTATIONS = 1;

    /**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.NamedElementImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.ClassifierImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getClassifier()
     * @generated
     */
    int CLASSIFIER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__ID = NAMED_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Structural Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER__STRUCTURAL_FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Classifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.AssociationImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getAssociation()
     * @generated
     */
    int ASSOCIATION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ID = CLASSIFIER__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Structural Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION__STRUCTURAL_FEATURES = CLASSIFIER__STRUCTURAL_FEATURES;

    /**
     * The number of structural features of the '<em>Association</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSOCIATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.ClassImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getClass_()
     * @generated
     */
    int CLASS = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__ID = CLASSIFIER__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__ANNOTATIONS = CLASSIFIER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__NAME = CLASSIFIER__NAME;

    /**
     * The feature id for the '<em><b>Structural Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS__STRUCTURAL_FEATURES = CLASSIFIER__STRUCTURAL_FEATURES;

    /**
     * The number of structural features of the '<em>Class</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.BehavioralFeatureImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getBehavioralFeature()
     * @generated
     */
    int BEHAVIORAL_FEATURE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORAL_FEATURE__ID = NAMED_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORAL_FEATURE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORAL_FEATURE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>Behavioral Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIORAL_FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.BehaviorImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getBehavior()
     * @generated
     */
    int BEHAVIOR = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__ID = CLASS__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__ANNOTATIONS = CLASS__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__NAME = CLASS__NAME;

    /**
     * The feature id for the '<em><b>Structural Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR__STRUCTURAL_FEATURES = CLASS__STRUCTURAL_FEATURES;

    /**
     * The number of structural features of the '<em>Behavior</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.TemplaetableElementImpl <em>Templaetable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.TemplaetableElementImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getTemplaetableElement()
     * @generated
     */
    int TEMPLAETABLE_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLAETABLE_ELEMENT__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLAETABLE_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

    /**
     * The number of structural features of the '<em>Templaetable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEMPLAETABLE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.TypedElementImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getTypedElement()
     * @generated
     */
    int TYPED_ELEMENT = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__ID = NAMED_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.MultiplicityElementImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getMultiplicityElement()
     * @generated
     */
    int MULTIPLICITY_ELEMENT = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT__ID = ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT__ANNOTATIONS = ELEMENT__ANNOTATIONS;

    /**
     * The number of structural features of the '<em>Multiplicity Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.StructuralFeatureImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getStructuralFeature()
     * @generated
     */
    int STRUCTURAL_FEATURE = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_FEATURE__ID = MULTIPLICITY_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_FEATURE__ANNOTATIONS = MULTIPLICITY_ELEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_FEATURE__NAME = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_FEATURE__TYPE = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Structural Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURAL_FEATURE_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.ifml.model.uml.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ifml.model.uml.impl.AnnotationImpl
     * @see org.ifml.model.uml.impl.UmlPackageImpl#getAnnotation()
     * @generated
     */
    int ANNOTATION = 11;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION__TEXT = 0;

    /**
     * The number of structural features of the '<em>Annotation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANNOTATION_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Association</em>'.
     * @see org.ifml.model.uml.Association
     * @generated
     */
    EClass getAssociation();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Classifier</em>'.
     * @see org.ifml.model.uml.Classifier
     * @generated
     */
    EClass getClassifier();

    /**
     * Returns the meta object for the containment reference list '{@link org.ifml.model.uml.Classifier#getStructuralFeatures <em>Structural Features</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Structural Features</em>'.
     * @see org.ifml.model.uml.Classifier#getStructuralFeatures()
     * @see #getClassifier()
     * @generated
     */
    EReference getClassifier_StructuralFeatures();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class</em>'.
     * @see org.ifml.model.uml.Class
     * @generated
     */
    EClass getClass_();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.ifml.model.uml.Element
     * @generated
     */
    EClass getElement();

    /**
     * Returns the meta object for the attribute '{@link org.ifml.model.uml.Element#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.ifml.model.uml.Element#getId()
     * @see #getElement()
     * @generated
     */
    EAttribute getElement_Id();

    /**
     * Returns the meta object for the containment reference list '{@link org.ifml.model.uml.Element#getAnnotations <em>Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Annotations</em>'.
     * @see org.ifml.model.uml.Element#getAnnotations()
     * @see #getElement()
     * @generated
     */
    EReference getElement_Annotations();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.BehavioralFeature <em>Behavioral Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavioral Feature</em>'.
     * @see org.ifml.model.uml.BehavioralFeature
     * @generated
     */
    EClass getBehavioralFeature();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Behavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior</em>'.
     * @see org.ifml.model.uml.Behavior
     * @generated
     */
    EClass getBehavior();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.TemplaetableElement <em>Templaetable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Templaetable Element</em>'.
     * @see org.ifml.model.uml.TemplaetableElement
     * @generated
     */
    EClass getTemplaetableElement();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Typed Element</em>'.
     * @see org.ifml.model.uml.TypedElement
     * @generated
     */
    EClass getTypedElement();

    /**
     * Returns the meta object for the attribute '{@link org.ifml.model.uml.TypedElement#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.ifml.model.uml.TypedElement#getType()
     * @see #getTypedElement()
     * @generated
     */
    EAttribute getTypedElement_Type();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.MultiplicityElement <em>Multiplicity Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicity Element</em>'.
     * @see org.ifml.model.uml.MultiplicityElement
     * @generated
     */
    EClass getMultiplicityElement();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structural Feature</em>'.
     * @see org.ifml.model.uml.StructuralFeature
     * @generated
     */
    EClass getStructuralFeature();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see org.ifml.model.uml.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link org.ifml.model.uml.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.ifml.model.uml.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link org.ifml.model.uml.Annotation <em>Annotation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Annotation</em>'.
     * @see org.ifml.model.uml.Annotation
     * @generated
     */
    EClass getAnnotation();

    /**
     * Returns the meta object for the attribute '{@link org.ifml.model.uml.Annotation#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see org.ifml.model.uml.Annotation#getText()
     * @see #getAnnotation()
     * @generated
     */
    EAttribute getAnnotation_Text();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UmlFactory getUmlFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.AssociationImpl <em>Association</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.AssociationImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getAssociation()
         * @generated
         */
        EClass ASSOCIATION = eINSTANCE.getAssociation();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.ClassifierImpl <em>Classifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.ClassifierImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getClassifier()
         * @generated
         */
        EClass CLASSIFIER = eINSTANCE.getClassifier();

        /**
         * The meta object literal for the '<em><b>Structural Features</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLASSIFIER__STRUCTURAL_FEATURES = eINSTANCE.getClassifier_StructuralFeatures();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.ClassImpl <em>Class</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.ClassImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getClass_()
         * @generated
         */
        EClass CLASS = eINSTANCE.getClass_();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.ElementImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getElement()
         * @generated
         */
        EClass ELEMENT = eINSTANCE.getElement();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

        /**
         * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT__ANNOTATIONS = eINSTANCE.getElement_Annotations();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.BehavioralFeatureImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getBehavioralFeature()
         * @generated
         */
        EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.BehaviorImpl <em>Behavior</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.BehaviorImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getBehavior()
         * @generated
         */
        EClass BEHAVIOR = eINSTANCE.getBehavior();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.TemplaetableElementImpl <em>Templaetable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.TemplaetableElementImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getTemplaetableElement()
         * @generated
         */
        EClass TEMPLAETABLE_ELEMENT = eINSTANCE.getTemplaetableElement();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.TypedElementImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getTypedElement()
         * @generated
         */
        EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.MultiplicityElementImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getMultiplicityElement()
         * @generated
         */
        EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.StructuralFeatureImpl <em>Structural Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.StructuralFeatureImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getStructuralFeature()
         * @generated
         */
        EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.NamedElementImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link org.ifml.model.uml.impl.AnnotationImpl <em>Annotation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.ifml.model.uml.impl.AnnotationImpl
         * @see org.ifml.model.uml.impl.UmlPackageImpl#getAnnotation()
         * @generated
         */
        EClass ANNOTATION = eINSTANCE.getAnnotation();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

    }

} //UmlPackage
