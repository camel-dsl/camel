/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.unit.MonetaryUnit;
import eu.paasage.camel.unit.TimeIntervalUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.PropertyCondition#getPropertyContext <em>Property Context</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.PropertyCondition#getUnit <em>Unit</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.PropertyCondition#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getPropertyCondition()
 * @model
 * @generated
 */
public interface PropertyCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Property Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Context</em>' reference.
	 * @see #setPropertyContext(PropertyContext)
	 * @see eu.paasage.camel.metric.MetricPackage#getPropertyCondition_PropertyContext()
	 * @model required="true"
	 * @generated
	 */
	PropertyContext getPropertyContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.PropertyCondition#getPropertyContext <em>Property Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Context</em>' reference.
	 * @see #getPropertyContext()
	 * @generated
	 */
	void setPropertyContext(PropertyContext value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(MonetaryUnit)
	 * @see eu.paasage.camel.metric.MetricPackage#getPropertyCondition_Unit()
	 * @model
	 * @generated
	 */
	MonetaryUnit getUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.PropertyCondition#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(MonetaryUnit value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' reference.
	 * @see #setTimeUnit(TimeIntervalUnit)
	 * @see eu.paasage.camel.metric.MetricPackage#getPropertyCondition_TimeUnit()
	 * @model
	 * @generated
	 */
	TimeIntervalUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.PropertyCondition#getTimeUnit <em>Time Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' reference.
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(TimeIntervalUnit value);

} // PropertyCondition
