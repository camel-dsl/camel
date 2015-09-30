/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.scalability.EventInstance;
import eu.paasage.camel.scalability.ScalabilityRule;
import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getScalabilityRule <em>Scalability Rule</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getEventInstances <em>Event Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getActionRealisations <em>Action Realisations</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getFiredOn <em>Fired On</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.RuleTrigger#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rule_trigger_event_instance_correct_events rule_trigger_correct_action rule_trigger_scal_reqs_of_correct_dep_model'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot rule_trigger_event_instance_correct_events='Tuple {\n\tmessage : String = \'The eventInstances \' + \' of RuleTrigger: \' + self.name +\n\t\t\t\t\' do not correspond to the event(s) of the respective scalability rule: \' + self.scalabilityRule.name,\n\tstatus : Boolean = if\n\t\t\t\t\t(self.scalabilityRule.event.oclIsKindOf(camel::scalability::SimpleEvent))\n\t\t\t\tthen (self.eventInstances\n\t\t\t\t\t->size() = 1 and self.eventInstances\n\t\t\t\t\t->exists(p | p.event.oclAsType(camel::scalability::SimpleEvent) =\n\t\t\t\t\t\tself.scalabilityRule.event.oclAsType(camel::scalability::SimpleEvent)))\n\t\t\t\telse self.eventInstances\n\t\t\t\t\t->forAll(p | self.scalabilityRule.event.oclAsType(camel::scalability::EventPattern).includesEvent(p.event))\n\t\t\t\tendif\n}.status' rule_trigger_correct_action='Tuple {\n\tmessage : String = \'Either the size of action realizations for RuleTrigger: \' + self.name +\n\t\t\t\t\' is not the same as the one corresponding to the actions of the respective scalability rule: \' +\n\t\t\t\tself.scalabilityRule.name +\n\t\t\t\t\' or there is an action realization mapping to an action not contained in the action list of the trigger\\\'s scalability rule\',\n\tstatus : Boolean = (self.actionRealisations\n\t\t\t\t->size() = self.scalabilityRule.actions\n\t\t\t\t->size()) and (self.actionRealisations\n\t\t\t\t->forAll(p | self.scalabilityRule.actions\n\t\t\t\t\t->exists(q | q = p.action)))\n}.status' rule_trigger_scal_reqs_of_correct_dep_model='Tuple {\n\tmessage : String = \'There is a scale requirements for the scalability rule: \' +\n\t\t\t\tself.scalabilityRule.name + \' of RuleTrigger: \' + self.name +\n\t\t\t\t\' with a component or vm not included in the deployment model of the trigger\\\'s respective execution context: \' +\n\t\t\t\tself.executionContext.name,\n\tstatus : Boolean = scalabilityRule.scaleRequirements\n\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement) and\n\t\t\t\t\t\tp.oclAsType(camel::requirement::HorizontalScaleRequirement).component <> null)\n\t\t\t\t\tthen (executionContext.deploymentModel.internalComponents\n\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::HorizontalScaleRequirement).component))\n\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) and\n\t\t\t\t\t\t\tp.oclAsType(camel::requirement::VerticalScaleRequirement).vm <> null)\n\t\t\t\t\t\tthen (executionContext.deploymentModel.vms\n\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::VerticalScaleRequirement).vm))\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface RuleTrigger extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.RuleTrigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scalability Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalability Rule</em>' reference.
	 * @see #setScalabilityRule(ScalabilityRule)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_ScalabilityRule()
	 * @model required="true"
	 * @generated
	 */
	ScalabilityRule getScalabilityRule();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.RuleTrigger#getScalabilityRule <em>Scalability Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalability Rule</em>' reference.
	 * @see #getScalabilityRule()
	 * @generated
	 */
	void setScalabilityRule(ScalabilityRule value);

	/**
	 * Returns the value of the '<em><b>Event Instances</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.scalability.EventInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Instances</em>' reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_EventInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<EventInstance> getEventInstances();

	/**
	 * Returns the value of the '<em><b>Action Realisations</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.execution.ActionRealisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Realisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Realisations</em>' reference list.
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_ActionRealisations()
	 * @model required="true"
	 * @generated
	 */
	EList<ActionRealisation> getActionRealisations();

	/**
	 * Returns the value of the '<em><b>Fired On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired On</em>' attribute.
	 * @see #setFiredOn(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_FiredOn()
	 * @model required="true"
	 * @generated
	 */
	Date getFiredOn();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.RuleTrigger#getFiredOn <em>Fired On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fired On</em>' attribute.
	 * @see #getFiredOn()
	 * @generated
	 */
	void setFiredOn(Date value);

	/**
	 * Returns the value of the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Context</em>' reference.
	 * @see #setExecutionContext(ExecutionContext)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getRuleTrigger_ExecutionContext()
	 * @model required="true"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.RuleTrigger#getExecutionContext <em>Execution Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' reference.
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(ExecutionContext value);

} // RuleTrigger
