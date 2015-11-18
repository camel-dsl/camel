/**
 */
package eu.paasage.camel.scalability.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.requirement.ScaleRequirement;

import eu.paasage.camel.scalability.Event;
import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.EventPattern;
import eu.paasage.camel.scalability.ScalabilityModel;
import eu.paasage.camel.scalability.ScalabilityPackage;
import eu.paasage.camel.scalability.ScalabilityRule;
import eu.paasage.camel.scalability.ScalingAction;
import eu.paasage.camel.scalability.Timer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl#getScaleRequirements <em>Scale Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalabilityModelImpl extends ModelImpl implements ScalabilityModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalabilityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScalabilityPackage.Literals.SCALABILITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScalabilityRule> getRules() {
		return (EList<ScalabilityRule>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Event> getEvents() {
		return (EList<Event>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventInstance> getEventInstances() {
		return (EList<EventInstance>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__EVENT_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScalingAction> getActions() {
		return (EList<ScalingAction>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__ACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventPattern> getPatterns() {
		return (EList<EventPattern>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__PATTERNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Timer> getTimers() {
		return (EList<Timer>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__TIMERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ScaleRequirement> getScaleRequirements() {
		return (EList<ScaleRequirement>)eGet(ScalabilityPackage.Literals.SCALABILITY_MODEL__SCALE_REQUIREMENTS, true);
	}

} //ScalabilityModelImpl
