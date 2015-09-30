/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.type.SingleValue;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricFormulaParameter#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricFormulaParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormulaParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='value_attribute_set_for_non_metric_formula_parameters'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot value_attribute_set_for_non_metric_formula_parameters='Tuple {\n\tmessage : String = \'MetricFormulaParameter: \' + self.name +\n\t\t\t\t\t\' has a value of null while not mapping to a metric or metric formula\',\n\tstatus : Boolean = not (self.oclIsKindOf(Metric) or\n\t\t\t\t\t(self.oclIsKindOf(MetricFormula))) implies self.value <> null\n}.status'"
 * @extends CDOObject
 * @generated
 */
public interface MetricFormulaParameter extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(SingleValue)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormulaParameter_Value()
	 * @model
	 * @generated
	 */
	SingleValue getValue();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricFormulaParameter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SingleValue value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormulaParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricFormulaParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MetricFormulaParameter
