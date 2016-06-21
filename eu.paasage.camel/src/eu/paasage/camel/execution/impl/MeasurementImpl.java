/**
 */
package eu.paasage.camel.execution.impl;

import eu.paasage.camel.execution.ExecutionContext;
import eu.paasage.camel.execution.ExecutionPackage;
import eu.paasage.camel.execution.Measurement;

import eu.paasage.camel.metric.MetricInstance;

import eu.paasage.camel.requirement.ServiceLevelObjective;

import eu.paasage.camel.scalability.EventInstance;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getExecutionContext <em>Execution Context</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getMetricInstance <em>Metric Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getRawData <em>Raw Data</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getMeasurementTime <em>Measurement Time</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getSlo <em>Slo</em>}</li>
 *   <li>{@link eu.paasage.camel.execution.impl.MeasurementImpl#getEventInstance <em>Event Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends CDOObjectImpl implements Measurement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ExecutionPackage.Literals.MEASUREMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionContext getExecutionContext() {
		return (ExecutionContext)eGet(ExecutionPackage.Literals.MEASUREMENT__EXECUTION_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionContext(ExecutionContext newExecutionContext) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__EXECUTION_CONTEXT, newExecutionContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricInstance getMetricInstance() {
		return (MetricInstance)eGet(ExecutionPackage.Literals.MEASUREMENT__METRIC_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricInstance(MetricInstance newMetricInstance) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__METRIC_INSTANCE, newMetricInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return (Double)eGet(ExecutionPackage.Literals.MEASUREMENT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRawData() {
		return (String)eGet(ExecutionPackage.Literals.MEASUREMENT__RAW_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawData(String newRawData) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__RAW_DATA, newRawData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMeasurementTime() {
		return (Date)eGet(ExecutionPackage.Literals.MEASUREMENT__MEASUREMENT_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurementTime(Date newMeasurementTime) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__MEASUREMENT_TIME, newMeasurementTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjective getSlo() {
		return (ServiceLevelObjective)eGet(ExecutionPackage.Literals.MEASUREMENT__SLO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlo(ServiceLevelObjective newSlo) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__SLO, newSlo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInstance getEventInstance() {
		return (EventInstance)eGet(ExecutionPackage.Literals.MEASUREMENT__EVENT_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventInstance(EventInstance newEventInstance) {
		eSet(ExecutionPackage.Literals.MEASUREMENT__EVENT_INSTANCE, newEventInstance);
	}

} //MeasurementImpl
