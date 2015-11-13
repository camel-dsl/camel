/**
 */
package eu.paasage.camel.metric;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.metric.MetricFormula#getFunction <em>Function</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricFormula#getFunctionArity <em>Function Arity</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricFormula#getFunctionPattern <em>Function Pattern</em>}</li>
 *   <li>{@link eu.paasage.camel.metric.MetricFormula#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormula()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='metric_formula_correct_arity_for_function_wrt_parameters metric_formula_correct_arity_for_function'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot metric_formula_correct_arity_for_function_wrt_parameters='Tuple {\n\tmessage : String = \'MetricFormula: \' + self.toString() +\n\t\t\t\t\t\' has an incorrect arity: \' + functionArity.toString() + \' according to the size of the parameters list: \' +\n\t\t\t\t\tparameters\n\t\t\t\t\t->size().toString(),\n\tstatus : Boolean = ((self.functionArity = MetricFunctionArityType::UNARY) implies (self.parameters\n\t\t\t\t\t->size() = 1 and self.parameters\n\t\t\t\t\t->select(p | p.oclIsKindOf(Metric) or (p.oclIsTypeOf(MetricFormula) and p.oclAsType(MetricFormula).hasMetric()))\n\t\t\t\t\t->size() = 1)) and ((self.functionArity = MetricFunctionArityType::BINARY) implies self.parameters\n\t\t\t\t\t->size() = 2) and ((self.functionArity = MetricFunctionArityType::N_ARY) implies self.parameters\n\t\t\t\t\t->size() >= 2)\n}.status' metric_formula_correct_arity_for_function='Tuple {\n\tmessage : String = \'MetricFormula: \' + self.toString() + \' has function: \' +\n\t\t\t\t\tfunction.toString() + \' that does not correctly correspond to its arity: \' +\n\t\t\t\t\tfunctionArity.toString(),\n\tstatus : Boolean = ((self.function = MetricFunctionType::MODULO or self.function =\n\t\t\t\t\tMetricFunctionType::PERCENTILE) implies self.functionArity = MetricFunctionArityType::BINARY) and (((self.function\n\t\t\t\t\t= MetricFunctionType::MEAN or self.function = MetricFunctionType::STD or self.function = MetricFunctionType::MIN\n\t\t\t\t\tor self.function = MetricFunctionType::MAX or self.function = MetricFunctionType::MODE or self.function =\n\t\t\t\t\tMetricFunctionType::MEDIAN or self.function = MetricFunctionType::DERIVATIVE or self.function =\n\t\t\t\t\tMetricFunctionType::COUNT) implies self.functionArity = MetricFunctionArityType::UNARY)) and (((self.function =\n\t\t\t\t\tMetricFunctionType::TIMES or self.function = MetricFunctionType::DIV) implies (self.functionArity =\n\t\t\t\t\tMetricFunctionArityType::BINARY or self.functionArity = MetricFunctionArityType::N_ARY)))\n}.status'"
 * @generated
 */
public interface MetricFormula extends MetricFormulaParameter {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.MetricFunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see eu.paasage.camel.metric.MetricFunctionType
	 * @see #setFunction(MetricFunctionType)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormula_Function()
	 * @model required="true"
	 * @generated
	 */
	MetricFunctionType getFunction();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricFormula#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see eu.paasage.camel.metric.MetricFunctionType
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(MetricFunctionType value);

	/**
	 * Returns the value of the '<em><b>Function Arity</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.MetricFunctionArityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Arity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Arity</em>' attribute.
	 * @see eu.paasage.camel.metric.MetricFunctionArityType
	 * @see #setFunctionArity(MetricFunctionArityType)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormula_FunctionArity()
	 * @model required="true"
	 * @generated
	 */
	MetricFunctionArityType getFunctionArity();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricFormula#getFunctionArity <em>Function Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Arity</em>' attribute.
	 * @see eu.paasage.camel.metric.MetricFunctionArityType
	 * @see #getFunctionArity()
	 * @generated
	 */
	void setFunctionArity(MetricFunctionArityType value);

	/**
	 * Returns the value of the '<em><b>Function Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.metric.FunctionPatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Pattern</em>' attribute.
	 * @see eu.paasage.camel.metric.FunctionPatternType
	 * @see #setFunctionPattern(FunctionPatternType)
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormula_FunctionPattern()
	 * @model
	 * @generated
	 */
	FunctionPatternType getFunctionPattern();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.metric.MetricFormula#getFunctionPattern <em>Function Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Pattern</em>' attribute.
	 * @see eu.paasage.camel.metric.FunctionPatternType
	 * @see #getFunctionPattern()
	 * @generated
	 */
	void setFunctionPattern(FunctionPatternType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.metric.MetricFormulaParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see eu.paasage.camel.metric.MetricPackage#getMetricFormula_Parameters()
	 * @model required="true"
	 * @generated
	 */
	EList<MetricFormulaParameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model mRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.parameters\n\t\t\t\t\t\t->includes(m) or self.parameters\n\t\t\t\t\t\t->exists(p | p.oclIsTypeOf(MetricFormula) and p.oclAsType(MetricFormula).containsMetric(m))'"
	 * @generated
	 */
	boolean containsMetric(Metric m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.parameters\n\t\t\t\t\t\t->exists(p | p.oclIsKindOf(Metric)) or \n\t\t\t\t\t\tself.parameters->exists(p | p.oclIsTypeOf(MetricFormula) and p.oclAsType(MetricFormula).hasMetric())'"
	 * @generated
	 */
	boolean hasMetric();

} // MetricFormula
