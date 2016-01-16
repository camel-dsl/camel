/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.requirement.ServiceLevelObjective;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLO Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#getSlo <em>Slo</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#isAssessment <em>Assessment</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.SLOAssessment#getAssessmentTime <em>Assessment Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='slo_assessment_same_metric slo_assessment_slo_in_reqs_for_execution_context slo_assessment_same_exec_context'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot slo_assessment_same_metric='Tuple {\n\tmessage : String = \'The metric in slo: \' + slo.name + \' of SLOAssessment: \' + self.name +\n\t\t\t\t\' is not the same as the one referenced by the respective measurement: \' + measurement.name,\n\tstatus : Boolean = if\n\t\t\t\t\t(slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\tthen measurement.metricInstance.metric =\n\t\t\t\t\tslo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric\n\t\t\t\telse false\n\t\t\t\tendif\n}.status' slo_assessment_slo_in_reqs_for_execution_context='Tuple {\n\tmessage : String = \'SLO: \' + self.slo.name +\n\t\t\t\t\' is not included in the requirement group of the respective execution context: \' + self.executionContext.name +\n\t\t\t\t\' of SLO Assessment: \' + self.name,\n\tstatus : Boolean = self.executionContext.requirementGroup.requirements\n\t\t\t\t->includes(self.slo)\n}.status' slo_assessment_same_exec_context='Tuple {\n\tmessage : String = \'ExecutionContext: \' + executionContext.name + \' in SLOAssessment: \' +\n\t\t\t\tself.name + \' is not the same as the one of the respective measurement: \' +\n\t\t\t\tself.measurement.name,\n\tstatus : Boolean = executionContext = measurement.executionContext\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface SLOAssessment extends CDOObject {
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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo</em>' reference.
	 * @see #setSlo(ServiceLevelObjective)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_Slo()
	 * @model required="true"
	 * @generated
	 */
	ServiceLevelObjective getSlo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#getSlo <em>Slo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo</em>' reference.
	 * @see #getSlo()
	 * @generated
	 */
	void setSlo(ServiceLevelObjective value);

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' attribute.
	 * @see #setAssessment(boolean)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_Assessment()
	 * @model required="true"
	 * @generated
	 */
	boolean isAssessment();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#isAssessment <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' attribute.
	 * @see #isAssessment()
	 * @generated
	 */
	void setAssessment(boolean value);

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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_ExecutionContext()
	 * @model required="true"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#getExecutionContext <em>Execution Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' reference.
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(ExecutionContext value);

	/**
	 * Returns the value of the '<em><b>Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' reference.
	 * @see #setMeasurement(Measurement)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_Measurement()
	 * @model required="true"
	 * @generated
	 */
	Measurement getMeasurement();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#getMeasurement <em>Measurement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement</em>' reference.
	 * @see #getMeasurement()
	 * @generated
	 */
	void setMeasurement(Measurement value);

	/**
	 * Returns the value of the '<em><b>Assessment Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Time</em>' attribute.
	 * @see #setAssessmentTime(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getSLOAssessment_AssessmentTime()
	 * @model required="true"
	 * @generated
	 */
	Date getAssessmentTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.SLOAssessment#getAssessmentTime <em>Assessment Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Time</em>' attribute.
	 * @see #getAssessmentTime()
	 * @generated
	 */
	void setAssessmentTime(Date value);

} // SLOAssessment
