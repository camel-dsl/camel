/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.impl.ModelImpl;

import eu.paasage.camel.metric.Condition;
import eu.paasage.camel.metric.ConditionContext;
import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricFormulaParameter;
import eu.paasage.camel.metric.MetricInstance;
import eu.paasage.camel.metric.MetricModel;
import eu.paasage.camel.metric.MetricObjectBinding;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Property;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.Sensor;
import eu.paasage.camel.metric.Window;

import eu.paasage.camel.unit.Unit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getMetricInstances <em>Metric Instances</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getSchedules <em>Schedules</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricModelImpl#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricModelImpl extends ModelImpl implements MetricModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConditionContext> getContexts() {
		return (EList<ConditionContext>)eGet(MetricPackage.Literals.METRIC_MODEL__CONTEXTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Metric> getMetrics() {
		return (EList<Metric>)eGet(MetricPackage.Literals.METRIC_MODEL__METRICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricInstance> getMetricInstances() {
		return (EList<MetricInstance>)eGet(MetricPackage.Literals.METRIC_MODEL__METRIC_INSTANCES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Condition> getConditions() {
		return (EList<Condition>)eGet(MetricPackage.Literals.METRIC_MODEL__CONDITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>)eGet(MetricPackage.Literals.METRIC_MODEL__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricObjectBinding> getBindings() {
		return (EList<MetricObjectBinding>)eGet(MetricPackage.Literals.METRIC_MODEL__BINDINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Window> getWindows() {
		return (EList<Window>)eGet(MetricPackage.Literals.METRIC_MODEL__WINDOWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Schedule> getSchedules() {
		return (EList<Schedule>)eGet(MetricPackage.Literals.METRIC_MODEL__SCHEDULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricFormulaParameter> getParameters() {
		return (EList<MetricFormulaParameter>)eGet(MetricPackage.Literals.METRIC_MODEL__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sensor> getSensors() {
		return (EList<Sensor>)eGet(MetricPackage.Literals.METRIC_MODEL__SENSORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Unit> getUnits() {
		return (EList<Unit>)eGet(MetricPackage.Literals.METRIC_MODEL__UNITS, true);
	}

} //MetricModelImpl
