/**
 */
package eu.paasage.camel.metric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricContext#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricContext#getWindow <em>Window</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricContext#getSchedule <em>Schedule</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricContext()
 * @model abstract="true"
 * @generated
 */
public interface MetricContext extends ConditionContext {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricContext_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricContext#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' reference.
	 * @see #setWindow(Window)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricContext_Window()
	 * @model
	 * @generated
	 */
	Window getWindow();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricContext#getWindow <em>Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window</em>' reference.
	 * @see #getWindow()
	 * @generated
	 */
	void setWindow(Window value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see #setSchedule(Schedule)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricContext_Schedule()
	 * @model
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricContext#getSchedule <em>Schedule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

} // MetricContext
