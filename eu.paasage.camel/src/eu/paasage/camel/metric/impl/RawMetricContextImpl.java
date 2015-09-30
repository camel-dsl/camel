/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.RawMetricContext;
import eu.paasage.camel.metric.Sensor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raw Metric Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.RawMetricContextImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RawMetricContextImpl extends MetricContextImpl implements RawMetricContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RawMetricContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.RAW_METRIC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		return (Sensor)eGet(MetricPackage.Literals.RAW_METRIC_CONTEXT__SENSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		eSet(MetricPackage.Literals.RAW_METRIC_CONTEXT__SENSOR, newSensor);
	}

} //RawMetricContextImpl
