/**
 */
package eu.paasage.camel.metric;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.PropertyContext#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getPropertyContext()
 * @model
 * @generated
 */
public interface PropertyContext extends ConditionContext {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see eu.paasage.camel.metric.MetricPackage#getPropertyContext_Property()
	 * @model required="true"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.PropertyContext#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

} // PropertyContext
