/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.metric.MetricInstance;

import eu.paasage.camel.requirement.ServiceLevelObjective;

import eu.paasage.camel.scalability.EventInstance;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getMetricInstance <em>Metric Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getValue <em>Value</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getRawData <em>Raw Data</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getMeasurementTime <em>Measurement Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getSlo <em>Slo</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.Measurement#getEventInstance <em>Event Instance</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='measurement_slo_refer_to_correct_metric measurement_event_instance_same_metric correct_measurement_value measurement_metric_refers_to_correct_execution_context'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot measurement_slo_refer_to_correct_metric='Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' should have a metric instance with a type that maps to the metric referred to by the the measurement\\\'s respective SLO\',\n\tstatus : Boolean = self.slo\n\t\t\t\t<> null implies (if (self.slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n\t\t\t\tthen self.slo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric =\n\t\t\t\t\tself.metricInstance.metric\n\t\t\t\telse false\n\t\t\t\tendif)\n}.status' measurement_event_instance_same_metric='Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' maps to non-functional event instance : \' + eventInstance.toString() +\n\t\t\t\t\' with a type related to a metric different from the one of this measurement\',\n\tstatus : Boolean = (self.eventInstance <> null and\n\t\t\t\tself.eventInstance.event.oclIsTypeOf(camel::scalability::NonFunctionalEvent)) implies self.metricInstance.metric =\n\t\t\t\tself.eventInstance.event.oclAsType(camel::scalability::NonFunctionalEvent).metricCondition.metricContext.metric\n}.status' correct_measurement_value='Tuple {\n\tmessage : String = \'Measurement: \' + self.name + \' has a value: \' + value.toString() +\n\t\t\t\t\' that is outside the range of values of metric instance: \' + metricInstance.name,\n\tstatus : Boolean = let type :\n\t\t\t\tcamel::type::ValueType = metricInstance.metric.valueType\n\t\t\tin if (type <> null)\n\t\t\t\tthen if (type.oclIsTypeOf(camel::type::Range))\n\t\t\t\t\tthen type.oclAsType(camel::type::Range).includesValue(self.value)\n\t\t\t\t\telse if (type.oclIsTypeOf(camel::type::RangeUnion))\n\t\t\t\t\t\tthen type.oclAsType(camel::type::RangeUnion).includesValue(self.value)\n\t\t\t\t\t\telse true\n\t\t\t\t\t\tendif\n\t\t\t\t\tendif\n\t\t\t\telse true\n\t\t\t\tendif\n}.status' measurement_metric_refers_to_correct_execution_context='Tuple {\n\tmessage : String = \'Measurement: \' + self.name +\n\t\t\t\t\' has execution context:\' + executionContext.name +\n\t\t\t\t\' which is different from the one of the binding of the respective metric instance:\' +\n\t\t\t\tmetricInstance.name,\n\tstatus : Boolean = executionContext = metricInstance.objectBinding.executionContext\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface Measurement extends CDOObject {
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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_ExecutionContext()
	 * @model required="true"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getExecutionContext <em>Execution Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' reference.
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(ExecutionContext value);

	/**
	 * Returns the value of the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Instance</em>' reference.
	 * @see #setMetricInstance(MetricInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_MetricInstance()
	 * @model required="true"
	 * @generated
	 */
	MetricInstance getMetricInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getMetricInstance <em>Metric Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Instance</em>' reference.
	 * @see #getMetricInstance()
	 * @generated
	 */
	void setMetricInstance(MetricInstance value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raw Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw Data</em>' attribute.
	 * @see #setRawData(String)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_RawData()
	 * @model
	 * @generated
	 */
	String getRawData();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getRawData <em>Raw Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Data</em>' attribute.
	 * @see #getRawData()
	 * @generated
	 */
	void setRawData(String value);

	/**
	 * Returns the value of the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Time</em>' attribute.
	 * @see #setMeasurementTime(Date)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_MeasurementTime()
	 * @model required="true"
	 * @generated
	 */
	Date getMeasurementTime();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getMeasurementTime <em>Measurement Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Time</em>' attribute.
	 * @see #getMeasurementTime()
	 * @generated
	 */
	void setMeasurementTime(Date value);

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
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_Slo()
	 * @model
	 * @generated
	 */
	ServiceLevelObjective getSlo();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getSlo <em>Slo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo</em>' reference.
	 * @see #getSlo()
	 * @generated
	 */
	void setSlo(ServiceLevelObjective value);

	/**
	 * Returns the value of the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Instance</em>' reference.
	 * @see #setEventInstance(EventInstance)
	 * @see eu.paasage.camel.execution.ExecutionPackage#getMeasurement_EventInstance()
	 * @model
	 * @generated
	 */
	EventInstance getEventInstance();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.execution.Measurement#getEventInstance <em>Event Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Instance</em>' reference.
	 * @see #getEventInstance()
	 * @generated
	 */
	void setEventInstance(EventInstance value);

} // Measurement
