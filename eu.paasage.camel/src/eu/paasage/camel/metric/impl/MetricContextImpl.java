/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.Window;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricContextImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricContextImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricContextImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetricContextImpl extends ConditionContextImpl implements MetricContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		return (Metric)eGet(MetricPackage.Literals.METRIC_CONTEXT__METRIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		eSet(MetricPackage.Literals.METRIC_CONTEXT__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window getWindow() {
		return (Window)eGet(MetricPackage.Literals.METRIC_CONTEXT__WINDOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(Window newWindow) {
		eSet(MetricPackage.Literals.METRIC_CONTEXT__WINDOW, newWindow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return (Schedule)eGet(MetricPackage.Literals.METRIC_CONTEXT__SCHEDULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		eSet(MetricPackage.Literals.METRIC_CONTEXT__SCHEDULE, newSchedule);
	}

} //MetricContextImpl
