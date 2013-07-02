/**
 */
package org.ifml.model.uml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ifml.model.core.CorePackage;

import org.ifml.model.core.impl.CorePackageImpl;

import org.ifml.model.extensions.ExtensionsPackage;

import org.ifml.model.extensions.impl.ExtensionsPackageImpl;

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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass classEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behavioralFeatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass templaetableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiplicityElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass structuralFeatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.ifml.model.uml.UmlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UmlPackageImpl() {
        super(eNS_URI, UmlFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UmlPackage init() {
        if (isInited) return (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

        // Obtain or create and register package
        UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
        ExtensionsPackageImpl theExtensionsPackage = (ExtensionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) instanceof ExtensionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionsPackage.eNS_URI) : ExtensionsPackage.eINSTANCE);

        // Create package meta-data objects
        theUmlPackage.createPackageContents();
        theCorePackage.createPackageContents();
        theExtensionsPackage.createPackageContents();

        // Initialize created meta-data
        theUmlPackage.initializePackageContents();
        theCorePackage.initializePackageContents();
        theExtensionsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUmlPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
        return theUmlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociation() {
        return associationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClassifier() {
        return classifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getClassifier_StructuralFeatures() {
        return (EReference)classifierEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getClass_() {
        return classEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElement() {
        return elementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Id() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Annotations() {
        return (EReference)elementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehavioralFeature() {
        return behavioralFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBehavior() {
        return behaviorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemplaetableElement() {
        return templaetableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypedElement() {
        return typedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypedElement_Type() {
        return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiplicityElement() {
        return multiplicityElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStructuralFeature() {
        return structuralFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedElement() {
        return namedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNamedElement_Name() {
        return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnnotation() {
        return annotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnnotation_Text() {
        return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlFactory getUmlFactory() {
        return (UmlFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        associationEClass = createEClass(ASSOCIATION);

        classifierEClass = createEClass(CLASSIFIER);
        createEReference(classifierEClass, CLASSIFIER__STRUCTURAL_FEATURES);

        classEClass = createEClass(CLASS);

        elementEClass = createEClass(ELEMENT);
        createEAttribute(elementEClass, ELEMENT__ID);
        createEReference(elementEClass, ELEMENT__ANNOTATIONS);

        behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);

        behaviorEClass = createEClass(BEHAVIOR);

        templaetableElementEClass = createEClass(TEMPLAETABLE_ELEMENT);

        typedElementEClass = createEClass(TYPED_ELEMENT);
        createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE);

        multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);

        structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

        namedElementEClass = createEClass(NAMED_ELEMENT);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

        annotationEClass = createEClass(ANNOTATION);
        createEAttribute(annotationEClass, ANNOTATION__TEXT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        associationEClass.getESuperTypes().add(this.getClassifier());
        classifierEClass.getESuperTypes().add(this.getNamedElement());
        classifierEClass.getESuperTypes().add(this.getTemplaetableElement());
        classEClass.getESuperTypes().add(this.getClassifier());
        behavioralFeatureEClass.getESuperTypes().add(this.getNamedElement());
        behaviorEClass.getESuperTypes().add(this.getClass_());
        templaetableElementEClass.getESuperTypes().add(this.getElement());
        typedElementEClass.getESuperTypes().add(this.getNamedElement());
        multiplicityElementEClass.getESuperTypes().add(this.getElement());
        structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
        structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
        namedElementEClass.getESuperTypes().add(this.getElement());

        // Initialize classes and features; add operations and parameters
        initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(classifierEClass, Classifier.class, "Classifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getClassifier_StructuralFeatures(), this.getStructuralFeature(), null, "structuralFeatures", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(classEClass, org.ifml.model.uml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEReference(getElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(templaetableElementEClass, TemplaetableElement.class, "TemplaetableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTypedElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAnnotation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //UmlPackageImpl
