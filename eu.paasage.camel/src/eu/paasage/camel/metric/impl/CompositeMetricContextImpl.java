/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.CompositeMetricContext;
import eu.paasage.camel.metric.MetricContext;
import eu.paasage.camel.metric.MetricPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Metric Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.impl.CompositeMetricContextImpl#getComposingMetricContexts <em>Composing Metric Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeMetricContextImpl extends MetricContextImpl implements CompositeMetricContext {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeMetricContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricPackage.Literals.COMPOSITE_METRIC_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MetricContext> getComposingMetricContexts() {
		return (EList<MetricContext>)eGet(MetricPackage.Literals.COMPOSITE_METRIC_CONTEXT__COMPOSING_METRIC_CONTEXTS, true);
	}

} //CompositeMetricContextImpl
