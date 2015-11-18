/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.MetricCondition;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.MetricPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.MetricConditionImpl#getMetricContext <em>Metric Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricConditionImpl extends ConditionImpl implements MetricCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.METRIC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricContext getMetricContext() {
		return (MetricContext)eGet(MetricPackage.Literals.METRIC_CONDITION__METRIC_CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetricContext(MetricContext newMetricContext) {
		eSet(MetricPackage.Literals.METRIC_CONDITION__METRIC_CONTEXT, newMetricContext);
	}

} //MetricConditionImpl
