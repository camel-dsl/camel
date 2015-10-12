/**
 */
package eu.paasage.camel.metric;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.metric.MetricPackage
 * @generated
 */
public interface MetricFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricFactory eINSTANCE = eu.paasage.camel.metric.impl.MetricFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	MetricCondition createMetricCondition();

	/**
	 * Returns a new object of class '<em>Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Condition</em>'.
	 * @generated
	 */
	PropertyCondition createPropertyCondition();

	/**
	 * Returns a new object of class '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Metric Instance</em>'.
	 * @generated
	 */
	CompositeMetricInstance createCompositeMetricInstance();

	/**
	 * Returns a new object of class '<em>Raw Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Metric Instance</em>'.
	 * @generated
	 */
	RawMetricInstance createRawMetricInstance();

	/**
	 * Returns a new object of class '<em>Formula Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula Parameter</em>'.
	 * @generated
	 */
	MetricFormulaParameter createMetricFormulaParameter();

	/**
	 * Returns a new object of class '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula</em>'.
	 * @generated
	 */
	MetricFormula createMetricFormula();

	/**
	 * Returns a new object of class '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Metric</em>'.
	 * @generated
	 */
	CompositeMetric createCompositeMetric();

	/**
	 * Returns a new object of class '<em>Raw Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Metric</em>'.
	 * @generated
	 */
	RawMetric createRawMetric();

	/**
	 * Returns a new object of class '<em>Application Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Binding</em>'.
	 * @generated
	 */
	MetricApplicationBinding createMetricApplicationBinding();

	/**
	 * Returns a new object of class '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Binding</em>'.
	 * @generated
	 */
	MetricComponentBinding createMetricComponentBinding();

	/**
	 * Returns a new object of class '<em>VM Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VM Binding</em>'.
	 * @generated
	 */
	MetricVMBinding createMetricVMBinding();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule</em>'.
	 * @generated
	 */
	Schedule createSchedule();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Window</em>'.
	 * @generated
	 */
	Window createWindow();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	MetricModel createMetricModel();

	/**
	 * Returns a new object of class '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Metric Context</em>'.
	 * @generated
	 */
	CompositeMetricContext createCompositeMetricContext();

	/**
	 * Returns a new object of class '<em>Raw Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Metric Context</em>'.
	 * @generated
	 */
	RawMetricContext createRawMetricContext();

	/**
	 * Returns a new object of class '<em>Property Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Context</em>'.
	 * @generated
	 */
	PropertyContext createPropertyContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricPackage getMetricPackage();

} //MetricFactory
