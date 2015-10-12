/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.Action;

import eu.paasage.camel.organisation.Entity;

import eu.paasage.camel.requirement.ScaleRequirement;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityRule#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityRule#getEvent <em>Event</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityRule#getActions <em>Actions</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityRule#getEntity <em>Entity</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.ScalabilityRule#getScaleRequirements <em>Scale Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='scal_rule_horiz_req_count scal_rule_vert_req_correct_vals scal_rule_no_conficting_reqs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot scal_rule_horiz_req_count='Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a HorizontalScalingAction which conflicts with a rule\\\'s respective HorizontalScaleRequirement\',\n\tstatus : Boolean = self.actions\n\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(HorizontalScalingAction) and p.oclAsType(HorizontalScalingAction).count > 0 and\n\t\t\t\t\t\t(p.type = camel::ActionType::SCALE_IN or p.type = camel::ActionType::SCALE_OUT and self.scaleRequirements\n\t\t\t\t\t\t->exists(q | q.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))) implies self.scaleRequirements\n\t\t\t\t\t\t->forAll(t | if (t.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))\n\t\t\t\t\t\t\tthen (t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances = - 1 or\n\t\t\t\t\t\t\t\tp.oclAsType(HorizontalScalingAction).count <=\n\t\t\t\t\t\t\t\t(t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances -\n\t\t\t\t\t\t\t\tt.oclAsType(camel::requirement::HorizontalScaleRequirement).minInstances))\n\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\tendif)))\n}.status' scal_rule_vert_req_correct_vals='Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a VerticalScalingAction which conflicts with a rule\\\'s respective VerticalScaleRequirement\',\n\tstatus : Boolean = self.actions\n\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(VerticalScalingAction) and (p.type = camel::ActionType::SCALE_UP or p.type =\n\t\t\t\t\t\tcamel::ActionType::SCALE_DOWN and self.scaleRequirements\n\t\t\t\t\t\t->exists(t | t.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))) implies self.scaleRequirements\n\t\t\t\t\t\t->forAll(q | q.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) implies\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).coreUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).coreUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCores))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).storageUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).storageUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minStorage))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).CPUUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).CPUUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCPU))) and\n\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).memoryUpdate > 0) implies\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM = - 1 or\n\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).memoryUpdate <=\n\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM -\n\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minRAM))))))\n}.status' scal_rule_no_conficting_reqs='Tuple {\n\tmessage : String = \'In ScalabilityRule: \' + self.name +\n\t\t\t\t\t\' there is a pair of vertical or horizontal scale requirements that are conflicting, where conflicting means that they concern the same vm or component, respectively\',\n\tstatus : Boolean = self.scaleRequirements\n\t\t\t\t\t->forAll(p1, p2 | if (p1 <> p2 and p1.oclType() = p2.oclType())\n\t\t\t\t\t\tthen if (p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif)\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface ScalabilityRule extends CDOObject {
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
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.ScalabilityRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule_Event()
	 * @model required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.ScalabilityRule#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule_Actions()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule_Entity()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Scale Requirements</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.ScaleRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Requirements</em>' reference list.
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getScalabilityRule_ScaleRequirements()
	 * @model
	 * @generated
	 */
	EList<ScaleRequirement> getScaleRequirements();

} // ScalabilityRule
