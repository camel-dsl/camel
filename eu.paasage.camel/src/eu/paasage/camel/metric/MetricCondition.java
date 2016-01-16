/**
 */
package eu.paasage.camel.metric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricCondition#getMetricContext <em>Metric Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricCondition()
 * @model
 * @generated
 */
public interface MetricCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Context</em>' reference.
	 * @see #setMetricContext(MetricContext)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricCondition_MetricContext()
	 * @model required="true"
	 * @generated
	 */
	MetricContext getMetricContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricCondition#getMetricContext <em>Metric Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Context</em>' reference.
	 * @see #getMetricContext()
	 * @generated
	 */
	void setMetricContext(MetricContext value);

} // MetricCondition
