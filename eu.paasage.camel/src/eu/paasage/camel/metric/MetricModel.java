/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.Model;

import eu.paasage.camel.unit.Unit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getContexts <em>Contexts</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getMetricInstances <em>Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getConditions <em>Conditions</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getProperties <em>Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getBindings <em>Bindings</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getWindows <em>Windows</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getSensors <em>Sensors</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricModel#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel()
 * @model
 * @generated
 */
public interface MetricModel extends Model {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.ConditionContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionContext> getContexts();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Metric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Metrics()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Metric Instances</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Instances</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_MetricInstances()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetricInstance> getMetricInstances();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Conditions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Properties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricObjectBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Bindings()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetricObjectBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Windows()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Schedules</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Schedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedules</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Schedules()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Schedule> getSchedules();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricFormulaParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Parameters()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<MetricFormulaParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Sensors()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.unit.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricModel_Units()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Unit> getUnits();

} // MetricModel
