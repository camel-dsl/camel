/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.CompositeMetricInstance;
import eu.paasage.camel.metric.MetricInstance;
import eu.paasage.camel.metric.MetricPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.CompositeMetricInstanceImpl#getComposingMetricInstances <em>Composing Metric Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeMetricInstanceImpl extends MetricInstanceImpl implements CompositeMetricInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMetricInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.COMPOSITE_METRIC_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricInstance> getComposingMetricInstances() {
		return (EList<MetricInstance>)eGet(MetricPackage.Literals.COMPOSITE_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES, true);
	}

} //CompositeMetricInstanceImpl
