/**
 */
package org.ifml.model.extensions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ifml.model.core.ContextDimension;
import org.ifml.model.core.Event;
import org.ifml.model.core.Expression;
import org.ifml.model.core.InteractionFlowElement;
import org.ifml.model.core.InteractionFlowModelElement;
import org.ifml.model.core.ViewComponent;
import org.ifml.model.core.ViewComponentPart;
import org.ifml.model.core.ViewContainer;
import org.ifml.model.core.ViewElement;
import org.ifml.model.core.ViewElementEvent;

import org.ifml.model.extensions.*;

import org.ifml.model.uml.Element;
import org.ifml.model.uml.NamedElement;
import org.ifml.model.uml.TemplaetableElement;

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
 * @see org.ifml.model.extensions.ExtensionsPackage
 * @generated
 */
public class ExtensionsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ExtensionsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionsSwitch() {
        if (modelPackage == null) {
            modelPackage = ExtensionsPackage.eINSTANCE;
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
            case ExtensionsPackage.FORM: {
                Form form = (Form)theEObject;
                T result = caseForm(form);
                if (result == null) result = caseViewComponent(form);
                if (result == null) result = caseViewElement(form);
                if (result == null) result = caseInteractionFlowElement(form);
                if (result == null) result = caseNamedElement(form);
                if (result == null) result = caseInteractionFlowModelElement(form);
                if (result == null) result = caseTemplaetableElement(form);
                if (result == null) result = caseElement(form);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.FIELD: {
                Field field = (Field)theEObject;
                T result = caseField(field);
                if (result == null) result = caseViewComponentPart(field);
                if (result == null) result = caseInteractionFlowElement(field);
                if (result == null) result = caseNamedElement(field);
                if (result == null) result = caseInteractionFlowModelElement(field);
                if (result == null) result = caseTemplaetableElement(field);
                if (result == null) result = caseElement(field);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SELECTION_FIELD: {
                SelectionField selectionField = (SelectionField)theEObject;
                T result = caseSelectionField(selectionField);
                if (result == null) result = caseField(selectionField);
                if (result == null) result = caseViewComponentPart(selectionField);
                if (result == null) result = caseInteractionFlowElement(selectionField);
                if (result == null) result = caseNamedElement(selectionField);
                if (result == null) result = caseInteractionFlowModelElement(selectionField);
                if (result == null) result = caseTemplaetableElement(selectionField);
                if (result == null) result = caseElement(selectionField);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.VALIDATION_RULE: {
                ValidationRule validationRule = (ValidationRule)theEObject;
                T result = caseValidationRule(validationRule);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SLOT: {
                Slot slot = (Slot)theEObject;
                T result = caseSlot(slot);
                if (result == null) result = caseViewComponentPart(slot);
                if (result == null) result = caseInteractionFlowElement(slot);
                if (result == null) result = caseNamedElement(slot);
                if (result == null) result = caseInteractionFlowModelElement(slot);
                if (result == null) result = caseTemplaetableElement(slot);
                if (result == null) result = caseElement(slot);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SORT_ATTRIBUTE: {
                SortAttribute sortAttribute = (SortAttribute)theEObject;
                T result = caseSortAttribute(sortAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SELECT_EVENT: {
                SelectEvent selectEvent = (SelectEvent)theEObject;
                T result = caseSelectEvent(selectEvent);
                if (result == null) result = caseViewElementEvent(selectEvent);
                if (result == null) result = caseEvent(selectEvent);
                if (result == null) result = caseInteractionFlowElement(selectEvent);
                if (result == null) result = caseNamedElement(selectEvent);
                if (result == null) result = caseInteractionFlowModelElement(selectEvent);
                if (result == null) result = caseTemplaetableElement(selectEvent);
                if (result == null) result = caseElement(selectEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.LIST: {
                List list = (List)theEObject;
                T result = caseList(list);
                if (result == null) result = caseViewComponent(list);
                if (result == null) result = caseViewElement(list);
                if (result == null) result = caseInteractionFlowElement(list);
                if (result == null) result = caseNamedElement(list);
                if (result == null) result = caseInteractionFlowModelElement(list);
                if (result == null) result = caseTemplaetableElement(list);
                if (result == null) result = caseElement(list);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SIMPLE_FIELD: {
                SimpleField simpleField = (SimpleField)theEObject;
                T result = caseSimpleField(simpleField);
                if (result == null) result = caseField(simpleField);
                if (result == null) result = caseViewComponentPart(simpleField);
                if (result == null) result = caseInteractionFlowElement(simpleField);
                if (result == null) result = caseNamedElement(simpleField);
                if (result == null) result = caseInteractionFlowModelElement(simpleField);
                if (result == null) result = caseTemplaetableElement(simpleField);
                if (result == null) result = caseElement(simpleField);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SUBMIT_EVENT: {
                SubmitEvent submitEvent = (SubmitEvent)theEObject;
                T result = caseSubmitEvent(submitEvent);
                if (result == null) result = caseViewElementEvent(submitEvent);
                if (result == null) result = caseEvent(submitEvent);
                if (result == null) result = caseInteractionFlowElement(submitEvent);
                if (result == null) result = caseNamedElement(submitEvent);
                if (result == null) result = caseInteractionFlowModelElement(submitEvent);
                if (result == null) result = caseTemplaetableElement(submitEvent);
                if (result == null) result = caseElement(submitEvent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.SELECTOR: {
                Selector selector = (Selector)theEObject;
                T result = caseSelector(selector);
                if (result == null) result = caseExpression(selector);
                if (result == null) result = caseViewComponentPart(selector);
                if (result == null) result = caseInteractionFlowElement(selector);
                if (result == null) result = caseInteractionFlowModelElement(selector);
                if (result == null) result = caseNamedElement(selector);
                if (result == null) result = caseTemplaetableElement(selector);
                if (result == null) result = caseElement(selector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.DEVICE: {
                Device device = (Device)theEObject;
                T result = caseDevice(device);
                if (result == null) result = caseContextDimension(device);
                if (result == null) result = caseNamedElement(device);
                if (result == null) result = caseElement(device);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.POSITION: {
                Position position = (Position)theEObject;
                T result = casePosition(position);
                if (result == null) result = caseContextDimension(position);
                if (result == null) result = caseNamedElement(position);
                if (result == null) result = caseElement(position);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.USER_ROLE: {
                UserRole userRole = (UserRole)theEObject;
                T result = caseUserRole(userRole);
                if (result == null) result = caseContextDimension(userRole);
                if (result == null) result = caseNamedElement(userRole);
                if (result == null) result = caseElement(userRole);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.DETAILS: {
                Details details = (Details)theEObject;
                T result = caseDetails(details);
                if (result == null) result = caseViewComponent(details);
                if (result == null) result = caseViewElement(details);
                if (result == null) result = caseInteractionFlowElement(details);
                if (result == null) result = caseNamedElement(details);
                if (result == null) result = caseInteractionFlowModelElement(details);
                if (result == null) result = caseTemplaetableElement(details);
                if (result == null) result = caseElement(details);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ExtensionsPackage.WINDOW: {
                Window window = (Window)theEObject;
                T result = caseWindow(window);
                if (result == null) result = caseViewContainer(window);
                if (result == null) result = caseViewElement(window);
                if (result == null) result = caseInteractionFlowElement(window);
                if (result == null) result = caseNamedElement(window);
                if (result == null) result = caseInteractionFlowModelElement(window);
                if (result == null) result = caseTemplaetableElement(window);
                if (result == null) result = caseElement(window);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Form</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForm(Form object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseField(Field object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Selection Field</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Selection Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelectionField(SelectionField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Validation Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValidationRule(ValidationRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Slot</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Slot</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSlot(Slot object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sort Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sort Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSortAttribute(SortAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Select Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Select Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelectEvent(SelectEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>List</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>List</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseList(List object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Field</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Field</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleField(SimpleField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Submit Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Submit Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSubmitEvent(SubmitEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSelector(Selector object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Device</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDevice(Device object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Position</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePosition(Position object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>User Role</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>User Role</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUserRole(UserRole object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Details</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Details</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDetails(Details object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Window</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindow(Window object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionFlowModelElement(InteractionFlowModelElement object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInteractionFlowElement(InteractionFlowElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewElement(ViewElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewComponent(ViewComponent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Component Part</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Component Part</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewComponentPart(ViewComponentPart object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEvent(Event object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewElementEvent(ViewElementEvent object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExpression(Expression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Context Dimension</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContextDimension(ContextDimension object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseViewContainer(ViewContainer object) {
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

} //ExtensionsSwitch
