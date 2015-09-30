/**
 */
package eu.paasage.camel.scalability.util;

import eu.paasage.camel.Action;

import eu.paasage.camel.Model;
import eu.paasage.camel.scalability.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.scalability.ScalabilityPackage
 * @generated
 */
public class ScalabilityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScalabilityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScalabilityPackage.eINSTANCE;
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
	protected ScalabilitySwitch<Adapter> modelSwitch =
		new ScalabilitySwitch<Adapter>() {
			@Override
			public Adapter caseScalabilityModel(ScalabilityModel object) {
				return createScalabilityModelAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventPattern(EventPattern object) {
				return createEventPatternAdapter();
			}
			@Override
			public Adapter caseBinaryEventPattern(BinaryEventPattern object) {
				return createBinaryEventPatternAdapter();
			}
			@Override
			public Adapter caseUnaryEventPattern(UnaryEventPattern object) {
				return createUnaryEventPatternAdapter();
			}
			@Override
			public Adapter caseSimpleEvent(SimpleEvent object) {
				return createSimpleEventAdapter();
			}
			@Override
			public Adapter caseFunctionalEvent(FunctionalEvent object) {
				return createFunctionalEventAdapter();
			}
			@Override
			public Adapter caseNonFunctionalEvent(NonFunctionalEvent object) {
				return createNonFunctionalEventAdapter();
			}
			@Override
			public Adapter caseEventInstance(EventInstance object) {
				return createEventInstanceAdapter();
			}
			@Override
			public Adapter caseScalabilityRule(ScalabilityRule object) {
				return createScalabilityRuleAdapter();
			}
			@Override
			public Adapter caseScalingAction(ScalingAction object) {
				return createScalingActionAdapter();
			}
			@Override
			public Adapter caseHorizontalScalingAction(HorizontalScalingAction object) {
				return createHorizontalScalingActionAdapter();
			}
			@Override
			public Adapter caseVerticalScalingAction(VerticalScalingAction object) {
				return createVerticalScalingActionAdapter();
			}
			@Override
			public Adapter caseTimer(Timer object) {
				return createTimerAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.ScalabilityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.ScalabilityModel
	 * @generated
	 */
	public Adapter createScalabilityModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.EventPattern
	 * @generated
	 */
	public Adapter createEventPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.BinaryEventPattern <em>Binary Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern
	 * @generated
	 */
	public Adapter createBinaryEventPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.UnaryEventPattern <em>Unary Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.UnaryEventPattern
	 * @generated
	 */
	public Adapter createUnaryEventPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.SimpleEvent <em>Simple Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.SimpleEvent
	 * @generated
	 */
	public Adapter createSimpleEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.FunctionalEvent <em>Functional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.FunctionalEvent
	 * @generated
	 */
	public Adapter createFunctionalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.NonFunctionalEvent <em>Non Functional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.NonFunctionalEvent
	 * @generated
	 */
	public Adapter createNonFunctionalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.EventInstance
	 * @generated
	 */
	public Adapter createEventInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.ScalabilityRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.ScalabilityRule
	 * @generated
	 */
	public Adapter createScalabilityRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.ScalingAction <em>Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.ScalingAction
	 * @generated
	 */
	public Adapter createScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.HorizontalScalingAction <em>Horizontal Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.HorizontalScalingAction
	 * @generated
	 */
	public Adapter createHorizontalScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.VerticalScalingAction <em>Vertical Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction
	 * @generated
	 */
	public Adapter createVerticalScalingActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.scalability.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.scalability.Timer
	 * @generated
	 */
	public Adapter createTimerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.paasage.camel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.paasage.camel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
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

} //ScalabilityAdapterFactory
