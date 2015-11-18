/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.LayerType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.CompositeMetric#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetric()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='metric_layer_enforcement metric_percentage_unit_enforcement metric_composite_unit_enforcement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot metric_layer_enforcement='Tuple {\n\tmessage : String = \'Composite Metric: \' + name +\n\t\t\t\t\t\' has a layer which is below those of its composing metrics in the respective formula\',\n\tstatus : Boolean = self.formula.parameters\n\t\t\t\t\t->forAll(p | (p.oclIsKindOf(Metric) implies self.greaterEqualThanLayer(self.layer, p.oclAsType(Metric).layer)))\n}.status' metric_percentage_unit_enforcement='Tuple {\n\tmessage : String = \'Composite Metric: \' + name +\n\t\t\t\t\t\' has an incorrect unit (percentage) by considering the units of its composing metrics and the function(s) involved in the respective metric formula\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.unit.unit = camel::unit::UnitType::PERCENTAGE)\n\t\t\t\t\tthen (self.formula.parameters\n\t\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies p.oclAsType(Metric).unit.unit = camel::unit::UnitType::PERCENTAGE) or\n\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV and self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->forAll(p1, p2 | (p1.oclIsKindOf(Metric) and p2.oclIsKindOf(Metric)) implies p1.oclAsType(Metric).unit.unit =\n\t\t\t\t\t\t\tp2.oclAsType(Metric).unit.unit)))\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status' metric_composite_unit_enforcement='Tuple {\n\tmessage : String = \'Composite Metric: \' + self.name +\n\t\t\t\t\t\' has a composite unit that does not correspond to the units of its composing metrics by also considering that its derivation formula maps to the DIV function\',\n\tstatus : Boolean = if\n\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV)\n\t\t\t\t\tthen ((self.unit.unit = camel::unit::UnitType::BYTES_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::BYTES and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n\t\t\t\t\t\tcamel::unit::UnitType::REQUESTS_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::REQUESTS and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n\t\t\t\t\t\tcamel::unit::UnitType::TRANSACTIONS_PER_SECOND) implies (self.formula.parameters\n\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::TRANSACTIONS and self.formula.parameters\n\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS))\n\t\t\t\t\telse true\n\t\t\t\t\tendif\n}.status'"
 * @generated
 */
public interface CompositeMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(MetricFormula)
	 * @see eu.paasage.camel.metric.MetricPackage#getCompositeMetric_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MetricFormula getFormula();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.CompositeMetric#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(MetricFormula value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" l1Required="true" l2Required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if (l1 = camel::LayerType::SaaS)\n\t\t\t\t\t\tthen true\n\t\t\t\t\t\telse (if (l1 = camel::LayerType::PaaS)\n\t\t\t\t\t\t\tthen (if (l2 = camel::LayerType::PaaS or l2 = camel::LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\telse (if (l2 = camel::LayerType::IaaS)\n\t\t\t\t\t\t\t\tthen true\n\t\t\t\t\t\t\t\telse false\n\t\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\t\tendif)\n\t\t\t\t\t\tendif'"
	 * @generated
	 */
	boolean greaterEqualThanLayer(LayerType l1, LayerType l2);

} // CompositeMetric
