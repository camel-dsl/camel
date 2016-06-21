/**
 */
package eu.paasage.camel.metric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.CompositeMetricInstance#getComposingMetricInstances <em>Composing Metric Instances</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetricInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='composite_metric_instance_to_components component_instances_metric_map_formula_templates component_metrics_refer_to_same_level_or_lower'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot composite_metric_instance_to_components='Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' maps to a composite metric but there exists a composing metric with a different execution context associated to it\',\n\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n\t\t\t\t\tand composingMetricInstances\n\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = objectBinding.executionContext)\n}.status' component_instances_metric_map_formula_templates='Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' should have component metric instances which map to the metrics referenced in the formula of the composite instance\\\'s metric\',\n\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n\t\t\t\t\tand self.metric.oclAsType(CompositeMetric).formula.parameters\n\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies self.composingMetricInstances\n\t\t\t\t\t\t->exists(q | q.metric = p)) and self.metric.oclAsType(CompositeMetric).formula.parameters\n\t\t\t\t\t->select(p | p.oclIsKindOf(Metric))\n\t\t\t\t\t->size() = self.composingMetricInstances\n\t\t\t\t\t->size()\n}.status' component_metrics_refer_to_same_level_or_lower='Tuple {\n\tmessage : String = \'CompositeMetricInstance: \' + self.name +\n\t\t\t\t\t\' as a binding with a type that maps to a lower cloud level with respect to the one of its composing metrics (e.g., MetricVMBinding while composing metric has MetricComponentBinding)\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(not (objectBinding.oclIsTypeOf(MetricApplicationBinding)))\n\t\t\t\t\tthen if (objectBinding.oclIsTypeOf(MetricComponentBinding))\n\t\t\t\t\t\tthen composingMetricInstances\n\t\t\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = self.objectBinding.executionContext and not\n\t\t\t\t\t\t\t\t(p.objectBinding.oclIsTypeOf(MetricApplicationBinding)) and if\n\t\t\t\t\t\t\t\t\t(self.objectBinding.oclAsType(MetricComponentBinding).componentInstance.oclIsKindOf(camel::deployment::InternalComponentInstance))\n\t\t\t\t\t\t\t\tthen if (p.objectBinding.oclIsTypeOf(MetricVMBinding))\n\t\t\t\t\t\t\t\t\tthen self.objectBinding.executionContext.deploymentModel.hostingInstances\n\t\t\t\t\t\t\t\t\t\t->exists(q | q.providedHostInstance.oclContainer() = p.objectBinding.oclAsType(MetricVMBinding).vmInstance and\n\t\t\t\t\t\t\t\t\t\t\tq.requiredHostInstance.oclContainer() = self.objectBinding.oclAsType(MetricComponentBinding).componentInstance)\n\t\t\t\t\t\t\t\t\telse true\n\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\telse composingMetricInstances\n\t\t\t\t\t\t\t->forAll(p | p.objectBinding.oclIsTypeOf(MetricVMBinding))\n\t\t\t\t\t\tendif\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status'"
 * @generated
 */
public interface CompositeMetricInstance extends MetricInstance {
	/**
	 * Returns the value of the '<em><b>Composing Metric Instances</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composing Metric Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composing Metric Instances</em>' reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetricInstance_ComposingMetricInstances()
	 * @model required="true"
	 * @generated
	 */
	EList<MetricInstance> getComposingMetricInstances();

} // CompositeMetricInstance
