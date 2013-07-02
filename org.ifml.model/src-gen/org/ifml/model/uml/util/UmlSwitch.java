/**
 */
package org.ifml.model.uml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ifml.model.uml.UmlPackage
 * @generated
 */
public class UmlSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UmlPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlSwitch() {
        if (modelPackage == null) {
            modelPackage = UmlPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case UmlPackage.ASSOCIATION: {
                Association association = (Association)theEObject;
                T result = caseAssociation(association);
                if (result == null) result = caseClassifier(association);
                if (result == null) result = caseNamedElement(association);
                if (result == null) result = caseTemplaetableElement(association);
                if (result == null) result = caseElement(association);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.CLASSIFIER: {
                Classifier classifier = (Classifier)theEObject;
                T result = caseClassifier(classifier);
                if (result == null) result = caseNamedElement(classifier);
                if (result == null) result = caseTemplaetableElement(classifier);
                if (result == null) result = caseElement(classifier);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.CLASS: {
                org.ifml.model.uml.Class class_ = (org.ifml.model.uml.Class)theEObject;
                T result = caseClass(class_);
                if (result == null) result = caseClassifier(class_);
                if (result == null) result = caseNamedElement(class_);
                if (result == null) result = caseTemplaetableElement(class_);
                if (result == null) result = caseElement(class_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.BEHAVIORAL_FEATURE: {
                BehavioralFeature behavioralFeature = (BehavioralFeature)theEObject;
                T result = caseBehavioralFeature(behavioralFeature);
                if (result == null) result = caseNamedElement(behavioralFeature);
                if (result == null) result = caseElement(behavioralFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.BEHAVIOR: {
                Behavior behavior = (Behavior)theEObject;
                T result = caseBehavior(behavior);
                if (result == null) result = caseClass(behavior);
                if (result == null) result = caseClassifier(behavior);
                if (result == null) result = caseNamedElement(behavior);
                if (result == null) result = caseTemplaetableElement(behavior);
                if (result == null) result = caseElement(behavior);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.TEMPLAETABLE_ELEMENT: {
                TemplaetableElement templaetableElement = (TemplaetableElement)theEObject;
                T result = caseTemplaetableElement(templaetableElement);
                if (result == null) result = caseElement(templaetableElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.TYPED_ELEMENT: {
                TypedElement typedElement = (TypedElement)theEObject;
                T result = caseTypedElement(typedElement);
                if (result == null) result = caseNamedElement(typedElement);
                if (result == null) result = caseElement(typedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.MULTIPLICITY_ELEMENT: {
                MultiplicityElement multiplicityElement = (MultiplicityElement)theEObject;
                T result = caseMultiplicityElement(multiplicityElement);
                if (result == null) result = caseElement(multiplicityElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.STRUCTURAL_FEATURE: {
                StructuralFeature structuralFeature = (StructuralFeature)theEObject;
                T result = caseStructuralFeature(structuralFeature);
                if (result == null) result = caseMultiplicityElement(structuralFeature);
                if (result == null) result = caseTypedElement(structuralFeature);
                if (result == null) result = caseNamedElement(structuralFeature);
                if (result == null) result = caseElement(structuralFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.NAMED_ELEMENT: {
                NamedElement namedElement = (NamedElement)theEObject;
                T result = caseNamedElement(namedElement);
                if (result == null) result = caseElement(namedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case UmlPackage.ANNOTATION: {
                Annotation annotation = (Annotation)theEObject;
                T result = caseAnnotation(annotation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Association</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssociation(Association object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassifier(Classifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClass(org.ifml.model.uml.Class object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehavioralFeature(BehavioralFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBehavior(Behavior object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Templaetable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Templaetable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTemplaetableElement(TemplaetableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypedElement(TypedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiplicityElement(MultiplicityElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStructuralFeature(StructuralFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnnotation(Annotation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //UmlSwitch
