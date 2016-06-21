/**
 */
package eu.paasage.camel.metric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Metric Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.CompositeMetricContext#getComposingMetricContexts <em>Composing Metric Contexts</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetricContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='metrics_in_composing_contexts_in_metric_formula composite_metric_context_correct_metric_type'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot metrics_in_composing_contexts_in_metric_formula='Tuple {\n\tmessage : String = \'In MetricContext: \' + self.name +\n\t\t\t\t\t\' one or more composingMetricContexts correspond to metrics which are either equal to this context metric: \' +\n\t\t\t\t\tself.metric.name + \' or do not belong to the context metric\'\n\t\t\t\t\t\'s formula\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric) and self.composingMetricContexts\n\t\t\t\t\t->forAll(p | p.metric <> self.metric and self.metric.oclAsType(CompositeMetric).formula.containsMetric(p.metric))\n}.status' composite_metric_context_correct_metric_type='Tuple {\n\tmessage : String = \'In CompositeMetricContext: \' + self.name + \' the metric: \'\n\t\t\t\t\t+ self.metric.name + \' should be composite but it isn\\\'t\',\n\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric)\n}.status'"
 * @generated
 */
public interface CompositeMetricContext extends MetricContext {
	/**
	 * Returns the value of the '<em><b>Composing Metric Contexts</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composing Metric Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composing Metric Contexts</em>' reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetricContext_ComposingMetricContexts()
	 * @model
	 * @generated
	 */
	EList<MetricContext> getComposingMetricContexts();

} // CompositeMetricContext
