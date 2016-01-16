/**
 */
package eu.paasage.camel.metric;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.Condition#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Condition#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Condition#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.Condition#getValidity <em>Validity</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getCondition()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Condition extends CDOObject {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getCondition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.ComparisonOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparison Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see eu.paasage.camel.metric.ComparisonOperatorType
	 * @see #setComparisonOperator(ComparisonOperatorType)
	 * @see eu.paasage.camel.metric.MetricPackage#getCondition_ComparisonOperator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperatorType getComparisonOperator();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Condition#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see eu.paasage.camel.metric.ComparisonOperatorType
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperatorType value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see eu.paasage.camel.metric.MetricPackage#getCondition_Threshold()
	 * @model required="true"
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Condition#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity</em>' attribute.
	 * @see #setValidity(Date)
	 * @see eu.paasage.camel.metric.MetricPackage#getCondition_Validity()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='MetricCondition' unique='false' upper='*'"
	 * @generated
	 */
	Date getValidity();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.Condition#getValidity <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity</em>' attribute.
	 * @see #getValidity()
	 * @generated
	 */
	void setValidity(Date value);

} // Condition
