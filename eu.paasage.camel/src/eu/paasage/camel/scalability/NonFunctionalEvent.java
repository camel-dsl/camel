/**
 */
package eu.paasage.camel.scalability;

import eu.paasage.camel.metric.MetricCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Functional Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.scalability.NonFunctionalEvent#getMetricCondition <em>Metric Condition</em>}</li>
 *   <li>{@link eu.paasage.camel.scalability.NonFunctionalEvent#isIsViolation <em>Is Violation</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.scalability.ScalabilityPackage#getNonFunctionalEvent()
 * @model
 * @generated
 */
public interface NonFunctionalEvent extends SimpleEvent {
	/**
	 * Returns the value of the '<em><b>Metric Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Condition</em>' reference.
	 * @see #setMetricCondition(MetricCondition)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getNonFunctionalEvent_MetricCondition()
	 * @model required="true"
	 * @generated
	 */
	MetricCondition getMetricCondition();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.NonFunctionalEvent#getMetricCondition <em>Metric Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Condition</em>' reference.
	 * @see #getMetricCondition()
	 * @generated
	 */
	void setMetricCondition(MetricCondition value);

	/**
	 * Returns the value of the '<em><b>Is Violation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Violation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Violation</em>' attribute.
	 * @see #setIsViolation(boolean)
	 * @see eu.paasage.camel.scalability.ScalabilityPackage#getNonFunctionalEvent_IsViolation()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsViolation();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.scalability.NonFunctionalEvent#isIsViolation <em>Is Violation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Violation</em>' attribute.
	 * @see #isIsViolation()
	 * @generated
	 */
	void setIsViolation(boolean value);

} // NonFunctionalEvent
