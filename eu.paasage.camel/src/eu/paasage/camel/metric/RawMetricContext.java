/**
 */
package eu.paasage.camel.metric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raw Metric Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.RawMetricContext#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getRawMetricContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='raw_metric_context_correct_metric_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot raw_metric_context_correct_metric_type='Tuple {\n\tmessage : String = \'In RawMetricContext: \' + self.name + \' the metric: \' +\n\t\t\t\t\tself.metric.name + \' should be raw but it isn\\\'t\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(RawMetric)\n}.status'"
 * @generated
 */
public interface RawMetricContext extends MetricContext {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getRawMetricContext_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.RawMetricContext#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // RawMetricContext
