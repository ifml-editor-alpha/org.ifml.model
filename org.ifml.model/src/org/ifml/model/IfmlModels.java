package org.ifml.model;

import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.ifml.eclipse.emf.ecore.EClassPair;
import org.ifml.eclipse.emf.ecore.EmfConnectionContext;
import org.ifml.eclipse.emf.ecore.EmfMetaModelResolver;
import org.ifml.model.core.CorePackage;
import org.ifml.model.core.IFMLModel;
import org.ifml.model.extensions.ExtensionsPackage;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;

/**
 * Provides utility methods for IFML models.
 */
public final class IfmlModels {

    private static final EmfMetaModelResolver META_MODEL_RESOLVER = new EmfMetaModelResolver.Builder()
            .containmentPredicate(CorePackage.Literals.INTERACTION_FLOW_MODEL__INTERACTION_FLOW_MODEL_ELEMENTS,
                    new Predicate<EClassPair>() {

                        private final Set<EClass> eClasses = ImmutableSet.of(CorePackage.Literals.SYSTEM_EVENT,
                                CorePackage.Literals.VIEW_CONTAINER, CorePackage.Literals.ACTION,
                                CorePackage.Literals.ACTIVATION_EXPRESSION);

                        @Override
                        public boolean apply(EClassPair input) {
                            for (EClass eClass : eClasses) {
                                if (eClass.isSuperTypeOf(input.getSecond())) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    })
            .containmentPredicate(CorePackage.Literals.VIEW_COMPONENT__VIEW_COMPONENT_PARTS, new Predicate<EClassPair>() {

                @Override
                public boolean apply(EClassPair input) {
                    if (ExtensionsPackage.Literals.FORM.equals(input.getFirst())) {
                        return ExtensionsPackage.Literals.FIELD.isSuperTypeOf(input.getSecond())
                                || ExtensionsPackage.Literals.VALIDATION_RULE.isSuperTypeOf(input.getSecond());
                    } else if (ExtensionsPackage.Literals.DETAILS.equals(input.getFirst())) {
                        return CorePackage.Literals.DATA_BINDING.equals(input.getSecond())
                                || CorePackage.Literals.CONDITIONAL_EXPRESSION.equals(input.getSecond());
                    } else if (ExtensionsPackage.Literals.LIST.equals(input.getFirst())) {
                        return CorePackage.Literals.DATA_BINDING.equals(input.getSecond())
                                || CorePackage.Literals.CONDITIONAL_EXPRESSION.equals(input.getSecond());
                    }
                    return true;
                }
            })
            .containmentPredicate(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS, new Predicate<EClassPair>() {

                @Override
                public boolean apply(EClassPair input) {
                    EClass sourceClass = input.getFirst();
                    EClass connClass = input.getSecond();
                    if (CorePackage.Literals.DATA_FLOW.equals(connClass)) {
                        return !CorePackage.Literals.EVENT.isSuperTypeOf(sourceClass);
                    } else if (CorePackage.Literals.NAVIGATION_FLOW.equals(connClass)) {
                        return CorePackage.Literals.EVENT.isSuperTypeOf(sourceClass);
                    }
                    return true;
                }
            })
            .connectionPredicate(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS,
                    new Predicate<EmfConnectionContext>() {

                        @Override
                        public boolean apply(EmfConnectionContext input) {
                            EObject sourceObject = input.getSourceObject();
                            EObject targetObject = input.getTargetObject();
                            EClass connClass = input.getConnectionClass();
                            if (CorePackage.Literals.DATA_FLOW.equals(input.getConnectionClass())) {
                                return !sourceObject.equals(targetObject)
                                        && !CorePackage.Literals.EVENT.isSuperTypeOf(targetObject.eClass())
                                        && !(CorePackage.Literals.ACTION.isSuperTypeOf(sourceObject.eClass()) && CorePackage.Literals.ACTION
                                                .isSuperTypeOf(targetObject.eClass()));
                            } else if (CorePackage.Literals.NAVIGATION_FLOW.equals(connClass)) {
                                return !sourceObject.equals(targetObject)
                                        && !CorePackage.Literals.EVENT.isSuperTypeOf(targetObject.eClass())
                                        && !(CorePackage.Literals.ACTION_EVENT.isSuperTypeOf(sourceObject.eClass()) && CorePackage.Literals.ACTION
                                                .isSuperTypeOf(targetObject.eClass()));
                            } else {
                                return true;
                            }
                        }
                    }

            )
            .connectionEndpointReferences(CorePackage.Literals.INTERACTION_FLOW,
                    CorePackage.Literals.INTERACTION_FLOW__SRC_INTERACTION_FLOW_ELEMENT,
                    CorePackage.Literals.INTERACTION_FLOW__TRGT_INTERACTION_FLOW_ELEMENT).build();

    private IfmlModels() {
    }

    /**
     * Returns the IFML model stored in a {@link Resource}.
     * 
     * @param res
     *            a persistent document.
     * @return the IFML model.
     */
    public static Optional<IFMLModel> getIfmlModel(Resource res) {
        try {
            IFMLModel ifmlModel = (IFMLModel) Iterables.find(res.getContents(), Predicates.instanceOf(IFMLModel.class));
            return Optional.of(ifmlModel);
        } catch (NoSuchElementException e) {
            return Optional.absent();
        }
    }

    /**
     * Returns the containment reference designed to contain child objects for a parent object.
     * 
     * @param parentObject
     *            the parent object.
     * @param childObject
     *            the child object.
     * @return the containment reference.
     */
    public static Optional<EReference> getContainmentReference(EObject parentObject, EObject childObject) {
        return META_MODEL_RESOLVER.getContainmentReference(parentObject.eClass(), childObject.eClass());
    }

    /**
     * Returns whether a new model object of a specific type can be added to an existing parent object.
     * 
     * @param parentClass
     *            the parent object.
     * @param eClass
     *            the {@link EClass} of the new model object.
     * 
     * @return {@code true} if a new object of type {@code eClass} can be added to {@code parentObject}.
     */
    public static boolean canAdd(EClass parentClass, EClass eClass) {
        return META_MODEL_RESOLVER.getContainmentReference(parentClass, eClass).isPresent();
    }

    /**
     * Returns the containment reference designed to contain connections.
     * 
     * @param sourceClass
     *            the source class.
     * @param connClass
     *            the connection class.
     * @return the structural reference.
     */
    public static Optional<EReference> getConnectionReference(EClass sourceClass, EClass connClass) {
        return META_MODEL_RESOLVER.getContainmentReference(sourceClass, connClass);
    }

    /**
     * Returns the reference designed to contain inverse connections.
     * 
     * @param targetClass
     *            the target class.
     * @param connClass
     *            the connection class.
     * @return the inverse reference.
     */
    public static Optional<EReference> getInverseConnectionReference(EClass targetClass, EClass connClass) {
        if (CorePackage.Literals.NAVIGATION_FLOW.equals(connClass)) {
            return Optional.<EReference> of(CorePackage.Literals.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOWS);
        }
        return Optional.absent();
    }

    /**
     * Returns whether a connection can start from a specific source object.
     * 
     * @param sourceObject
     *            the source object.
     * @param connClass
     *            the connection class.
     * @return {@code tru} if a new connection of type {@code connClass} can start from {@code sourceObject}.
     */
    public static boolean canStartFrom(EObject sourceObject, EClass connClass) {
        return META_MODEL_RESOLVER.getContainmentReference(sourceObject.eClass(), connClass).isPresent();
    }

    /**
     * Returns whether a connection can connect the given source and target objects.
     * 
     * @param sourceObj
     *            the source object.
     * @param targetObj
     *            the target object.
     * @param connClass
     *            the connection class.
     * @return {@code true} if a new connection of type {@code connClass} can be used to connect {@code sourceObj} with
     *         {@code targetObj}
     */
    public static boolean canConnect(EObject sourceObj, EObject targetObj, EClass connClass) {
        return META_MODEL_RESOLVER.canConnect(sourceObj, targetObj, connClass);
    }

    /**
     * Returns the reference designed to reference the source of a connection.
     * 
     * @param connClass
     *            the connection class.
     * @return the reference.
     */
    public static Optional<EReference> getSourceReference(EClass connClass) {
        return META_MODEL_RESOLVER.getConnectionSourceReference(connClass);
    }

    /**
     * Returns the reference designed to reference the target of a connection.
     * 
     * @param connClass
     *            the connection class.
     * @return the reference.
     */
    public static Optional<EReference> getTargetReference(EClass connClass) {
        return META_MODEL_RESOLVER.getConnectionTargetReference(connClass);
    }

}
