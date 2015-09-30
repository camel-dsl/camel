/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.execution.ExecutionContext;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricObjectBinding#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricObjectBinding#getExecutionContext <em>Execution Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricObjectBinding()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface MetricObjectBinding extends CDOObject {
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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricObjectBinding_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricObjectBinding#getName <em>Name</em>}' attribute.
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
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricObjectBinding_ExecutionContext()
	 * @model required="true"
	 * @generated
	 */
	ExecutionContext getExecutionContext();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricObjectBinding#getExecutionContext <em>Execution Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Context</em>' reference.
	 * @see #getExecutionContext()
	 * @generated
	 */
	void setExecutionContext(ExecutionContext value);

} // MetricObjectBinding
