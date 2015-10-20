/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.Model;

import eu.paasage.camel.requirement.ScaleRequirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getRules <em>Rules</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getEvents <em>Events</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getTimers <em>Timers</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityModel#getScaleRequirements <em>Scale Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel()
 * @model
 * @generated
 */
public interface ScalabilityModel extends Model {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.ScalabilityRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_Rules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ScalabilityRule> getRules();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_Events()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Event Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.EventInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Instances</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_EventInstances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EventInstance> getEventInstances();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.ScalingAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_Actions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ScalingAction> getActions();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.EventPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_Patterns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EventPattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Timers</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.Timer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timers</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_Timers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Timer> getTimers();

	/**
	 * Returns the value of the '<em><b>Scale Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.ScaleRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Requirements</em>' containment reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityModel_ScaleRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ScaleRequirement> getScaleRequirements();

} // ScalabilityModel
