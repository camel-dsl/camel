/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.Model;

import eu.paasage.camel.scalability.EventInstance;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getActionRealisations <em>Action Realisations</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getExecutionContexts <em>Execution Contexts</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getSloAssessessments <em>Slo Assessessments</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.ExecutionModel#getRuleTriggers <em>Rule Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel()
 * @model
 * @generated
 */
public interface ExecutionModel extends Model {
	/**
	 * Returns the value of the '<em><b>Action Realisations</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.ActionRealisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Realisations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Realisations</em>' containment reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_ActionRealisations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActionRealisation> getActionRealisations();

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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_EventInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventInstance> getEventInstances();

	/**
	 * Returns the value of the '<em><b>Execution Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.ExecutionContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Contexts</em>' containment reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_ExecutionContexts()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExecutionContext> getExecutionContexts();

	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_Measurements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Slo Assessessments</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.SLOAssessment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slo Assessessments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Assessessments</em>' containment reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_SloAssessessments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SLOAssessment> getSloAssessessments();

	/**
	 * Returns the value of the '<em><b>Rule Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.RuleTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Triggers</em>' containment reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getExecutionModel_RuleTriggers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuleTrigger> getRuleTriggers();

} // ExecutionModel
