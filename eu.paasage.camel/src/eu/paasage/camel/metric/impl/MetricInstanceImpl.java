/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.Metric;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.MetricInstance;
import eu.paasage.camel.metric.MetricObjectBinding;
import eu.paasage.camel.metric.MetricPackage;
import eu.paasage.camel.metric.Schedule;
import eu.paasage.camel.metric.Window;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getObjectBinding <em>Object Binding</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricInstanceImpl#getMetricContext <em>Metric Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetricInstanceImpl extends CDOObjectImpl implements MetricInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_INSTANCE;
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
		return (String)eGet(MetricPackage.Literals.METRIC_INSTANCE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getMetric() {
		return (Metric)eGet(MetricPackage.Literals.METRIC_INSTANCE__METRIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(Metric newMetric) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__METRIC, newMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return (Schedule)eGet(MetricPackage.Literals.METRIC_INSTANCE__SCHEDULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__SCHEDULE, newSchedule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window getWindow() {
		return (Window)eGet(MetricPackage.Literals.METRIC_INSTANCE__WINDOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindow(Window newWindow) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__WINDOW, newWindow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricObjectBinding getObjectBinding() {
		return (MetricObjectBinding)eGet(MetricPackage.Literals.METRIC_INSTANCE__OBJECT_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectBinding(MetricObjectBinding newObjectBinding) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__OBJECT_BINDING, newObjectBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricContext getMetricContext() {
		return (MetricContext)eGet(MetricPackage.Literals.METRIC_INSTANCE__METRIC_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricContext(MetricContext newMetricContext) {
		eSet(MetricPackage.Literals.METRIC_INSTANCE__METRIC_CONTEXT, newMetricContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkRecursiveness(final MetricInstance m1, final MetricInstance m2) {
		System.out.println("Checking recursiveness for MetricInstance: " + m1.getName());
				eu.paasage.camel.metric.CompositeMetricInstance cmi = (eu.paasage.camel.metric.CompositeMetricInstance)m1;
				for (eu.paasage.camel.metric.MetricInstance m: cmi.getComposingMetricInstances()){
					if (m.getName().equals(m2.getName())) return Boolean.TRUE;
					if (m instanceof eu.paasage.camel.metric.CompositeMetricInstance && checkRecursiveness(m,m2)) return Boolean.TRUE;
				}
				return Boolean.FALSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MetricPackage.METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE:
				return checkRecursiveness((MetricInstance)arguments.get(0), (MetricInstance)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetricInstanceImpl
