/**
 */
package eu.paasage.camel.metric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.RawMetricInstance#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getRawMetricInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='raw_metric_instance_correct_metric_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot raw_metric_instance_correct_metric_type='Tuple {\n\tmessage : String = \'RawMetricInstance: \' + self.name +\n\t\t\t\t\t\' mut map to a raw metric\',\n\tstatus : Boolean = metric.oclIsTypeOf(RawMetric)\n}.status'"
 * @generated
 */
public interface RawMetricInstance extends MetricInstance {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see eu.paasage.camel.metric.MetricPackage#getRawMetricInstance_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.RawMetricInstance#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // RawMetricInstance
