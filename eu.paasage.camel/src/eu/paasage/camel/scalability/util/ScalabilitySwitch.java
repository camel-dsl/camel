/**
 */
package eu.paasage.camel.scalability.util;

import eu.paasage.camel.Action;

import eu.paasage.camel.Model;
import eu.paasage.camel.scalability.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see eu.paasage.camel.scalability.ScalabilityPackage
 * @generated
 */
public class ScalabilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalabilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilitySwitch() {
		if (modelPackage == null) {
			modelPackage = ScalabilityPackage.eINSTANCE;
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
			case ScalabilityPackage.SCALABILITY_MODEL: {
				ScalabilityModel scalabilityModel = (ScalabilityModel)theEObject;
				T result = caseScalabilityModel(scalabilityModel);
				if (result == null) result = caseModel(scalabilityModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.EVENT_PATTERN: {
				EventPattern eventPattern = (EventPattern)theEObject;
				T result = caseEventPattern(eventPattern);
				if (result == null) result = caseEvent(eventPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.BINARY_EVENT_PATTERN: {
				BinaryEventPattern binaryEventPattern = (BinaryEventPattern)theEObject;
				T result = caseBinaryEventPattern(binaryEventPattern);
				if (result == null) result = caseEventPattern(binaryEventPattern);
				if (result == null) result = caseEvent(binaryEventPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.UNARY_EVENT_PATTERN: {
				UnaryEventPattern unaryEventPattern = (UnaryEventPattern)theEObject;
				T result = caseUnaryEventPattern(unaryEventPattern);
				if (result == null) result = caseEventPattern(unaryEventPattern);
				if (result == null) result = caseEvent(unaryEventPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.SIMPLE_EVENT: {
				SimpleEvent simpleEvent = (SimpleEvent)theEObject;
				T result = caseSimpleEvent(simpleEvent);
				if (result == null) result = caseEvent(simpleEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.FUNCTIONAL_EVENT: {
				FunctionalEvent functionalEvent = (FunctionalEvent)theEObject;
				T result = caseFunctionalEvent(functionalEvent);
				if (result == null) result = caseSimpleEvent(functionalEvent);
				if (result == null) result = caseEvent(functionalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.NON_FUNCTIONAL_EVENT: {
				NonFunctionalEvent nonFunctionalEvent = (NonFunctionalEvent)theEObject;
				T result = caseNonFunctionalEvent(nonFunctionalEvent);
				if (result == null) result = caseSimpleEvent(nonFunctionalEvent);
				if (result == null) result = caseEvent(nonFunctionalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.EVENT_INSTANCE: {
				EventInstance eventInstance = (EventInstance)theEObject;
				T result = caseEventInstance(eventInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.SCALABILITY_RULE: {
				ScalabilityRule scalabilityRule = (ScalabilityRule)theEObject;
				T result = caseScalabilityRule(scalabilityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.SCALING_ACTION: {
				ScalingAction scalingAction = (ScalingAction)theEObject;
				T result = caseScalingAction(scalingAction);
				if (result == null) result = caseAction(scalingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.HORIZONTAL_SCALING_ACTION: {
				HorizontalScalingAction horizontalScalingAction = (HorizontalScalingAction)theEObject;
				T result = caseHorizontalScalingAction(horizontalScalingAction);
				if (result == null) result = caseScalingAction(horizontalScalingAction);
				if (result == null) result = caseAction(horizontalScalingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.VERTICAL_SCALING_ACTION: {
				VerticalScalingAction verticalScalingAction = (VerticalScalingAction)theEObject;
				T result = caseVerticalScalingAction(verticalScalingAction);
				if (result == null) result = caseScalingAction(verticalScalingAction);
				if (result == null) result = caseAction(verticalScalingAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ScalabilityPackage.TIMER: {
				Timer timer = (Timer)theEObject;
				T result = caseTimer(timer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalabilityModel(ScalabilityModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPattern(EventPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryEventPattern(BinaryEventPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryEventPattern(UnaryEventPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleEvent(SimpleEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalEvent(FunctionalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Functional Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Functional Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonFunctionalEvent(NonFunctionalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventInstance(EventInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalabilityRule(ScalabilityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingAction(ScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalScalingAction(HorizontalScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scaling Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScalingAction(VerticalScalingAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimer(Timer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
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

} //ScalabilitySwitch
