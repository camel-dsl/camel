/**
 */
package eu.paasage.camel.metric.util;

import eu.paasage.camel.metric.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.metric.MetricPackage
 * @generated
 */
public class MetricValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MetricValidator INSTANCE = new MetricValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.metric";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MetricPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MetricPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case MetricPackage.METRIC_CONDITION:
				return validateMetricCondition((MetricCondition)value, diagnostics, context);
			case MetricPackage.PROPERTY_CONDITION:
				return validatePropertyCondition((PropertyCondition)value, diagnostics, context);
			case MetricPackage.METRIC_INSTANCE:
				return validateMetricInstance((MetricInstance)value, diagnostics, context);
			case MetricPackage.COMPOSITE_METRIC_INSTANCE:
				return validateCompositeMetricInstance((CompositeMetricInstance)value, diagnostics, context);
			case MetricPackage.RAW_METRIC_INSTANCE:
				return validateRawMetricInstance((RawMetricInstance)value, diagnostics, context);
			case MetricPackage.METRIC_FORMULA_PARAMETER:
				return validateMetricFormulaParameter((MetricFormulaParameter)value, diagnostics, context);
			case MetricPackage.METRIC_FORMULA:
				return validateMetricFormula((MetricFormula)value, diagnostics, context);
			case MetricPackage.METRIC:
				return validateMetric((Metric)value, diagnostics, context);
			case MetricPackage.COMPOSITE_METRIC:
				return validateCompositeMetric((CompositeMetric)value, diagnostics, context);
			case MetricPackage.RAW_METRIC:
				return validateRawMetric((RawMetric)value, diagnostics, context);
			case MetricPackage.METRIC_OBJECT_BINDING:
				return validateMetricObjectBinding((MetricObjectBinding)value, diagnostics, context);
			case MetricPackage.METRIC_APPLICATION_BINDING:
				return validateMetricApplicationBinding((MetricApplicationBinding)value, diagnostics, context);
			case MetricPackage.METRIC_COMPONENT_BINDING:
				return validateMetricComponentBinding((MetricComponentBinding)value, diagnostics, context);
			case MetricPackage.METRIC_VM_BINDING:
				return validateMetricVMBinding((MetricVMBinding)value, diagnostics, context);
			case MetricPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case MetricPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case MetricPackage.SENSOR:
				return validateSensor((Sensor)value, diagnostics, context);
			case MetricPackage.WINDOW:
				return validateWindow((Window)value, diagnostics, context);
			case MetricPackage.CONDITION_CONTEXT:
				return validateConditionContext((ConditionContext)value, diagnostics, context);
			case MetricPackage.METRIC_MODEL:
				return validateMetricModel((MetricModel)value, diagnostics, context);
			case MetricPackage.METRIC_CONTEXT:
				return validateMetricContext((MetricContext)value, diagnostics, context);
			case MetricPackage.COMPOSITE_METRIC_CONTEXT:
				return validateCompositeMetricContext((CompositeMetricContext)value, diagnostics, context);
			case MetricPackage.RAW_METRIC_CONTEXT:
				return validateRawMetricContext((RawMetricContext)value, diagnostics, context);
			case MetricPackage.PROPERTY_CONTEXT:
				return validatePropertyContext((PropertyContext)value, diagnostics, context);
			case MetricPackage.COMPARISON_OPERATOR_TYPE:
				return validateComparisonOperatorType((ComparisonOperatorType)value, diagnostics, context);
			case MetricPackage.METRIC_FUNCTION_ARITY_TYPE:
				return validateMetricFunctionArityType((MetricFunctionArityType)value, diagnostics, context);
			case MetricPackage.METRIC_FUNCTION_TYPE:
				return validateMetricFunctionType((MetricFunctionType)value, diagnostics, context);
			case MetricPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case MetricPackage.SCHEDULE_TYPE:
				return validateScheduleType((ScheduleType)value, diagnostics, context);
			case MetricPackage.WINDOW_SIZE_TYPE:
				return validateWindowSizeType((WindowSizeType)value, diagnostics, context);
			case MetricPackage.WINDOW_TYPE:
				return validateWindowType((WindowType)value, diagnostics, context);
			case MetricPackage.QUANTIFIER_TYPE:
				return validateQuantifierType((QuantifierType)value, diagnostics, context);
			case MetricPackage.FUNCTION_PATTERN_TYPE:
				return validateFunctionPatternType((FunctionPatternType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricCondition(MetricCondition metricCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)metricCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyCondition(PropertyCondition propertyCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)propertyCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricInstance(MetricInstance metricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)metricInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricInstance(CompositeMetricInstance compositeMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)compositeMetricInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetricInstance_composite_metric_instance_to_components(compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetricInstance_component_instances_metric_map_formula_templates(compositeMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetricInstance_component_metrics_refer_to_same_level_or_lower(compositeMetricInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the composite_metric_instance_to_components constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC_INSTANCE__COMPOSITE_METRIC_INSTANCE_TO_COMPONENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'CompositeMetricInstance: ' + self.name +\n" +
		"\t\t\t\t\t' maps to a composite metric but there exists a composing metric with a different execution context associated to it',\n" +
		"\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n" +
		"\t\t\t\t\tand composingMetricInstances\n" +
		"\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = objectBinding.executionContext)\n" +
		"}.status";

	/**
	 * Validates the composite_metric_instance_to_components constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricInstance_composite_metric_instance_to_components(CompositeMetricInstance compositeMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC_INSTANCE,
				 compositeMetricInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "composite_metric_instance_to_components",
				 COMPOSITE_METRIC_INSTANCE__COMPOSITE_METRIC_INSTANCE_TO_COMPONENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the component_instances_metric_map_formula_templates constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC_INSTANCE__COMPONENT_INSTANCES_METRIC_MAP_FORMULA_TEMPLATES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'CompositeMetricInstance: ' + self.name +\n" +
		"\t\t\t\t\t' should have component metric instances which map to the metrics referenced in the formula of the composite instance\\'s metric',\n" +
		"\tstatus : Boolean = metric.oclIsTypeOf(CompositeMetric)\n" +
		"\t\t\t\t\tand self.metric.oclAsType(CompositeMetric).formula.parameters\n" +
		"\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies self.composingMetricInstances\n" +
		"\t\t\t\t\t\t->exists(q | q.metric = p)) and self.metric.oclAsType(CompositeMetric).formula.parameters\n" +
		"\t\t\t\t\t->select(p | p.oclIsKindOf(Metric))\n" +
		"\t\t\t\t\t->size() = self.composingMetricInstances\n" +
		"\t\t\t\t\t->size()\n" +
		"}.status";

	/**
	 * Validates the component_instances_metric_map_formula_templates constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricInstance_component_instances_metric_map_formula_templates(CompositeMetricInstance compositeMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC_INSTANCE,
				 compositeMetricInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "component_instances_metric_map_formula_templates",
				 COMPOSITE_METRIC_INSTANCE__COMPONENT_INSTANCES_METRIC_MAP_FORMULA_TEMPLATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the component_metrics_refer_to_same_level_or_lower constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC_INSTANCE__COMPONENT_METRICS_REFER_TO_SAME_LEVEL_OR_LOWER__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'CompositeMetricInstance: ' + self.name +\n" +
		"\t\t\t\t\t' as a binding with a type that maps to a lower cloud level with respect to the one of its composing metrics (e.g., MetricVMBinding while composing metric has MetricComponentBinding)',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(not (objectBinding.oclIsTypeOf(MetricApplicationBinding)))\n" +
		"\t\t\t\t\tthen if (objectBinding.oclIsTypeOf(MetricComponentBinding))\n" +
		"\t\t\t\t\t\tthen composingMetricInstances\n" +
		"\t\t\t\t\t\t\t->forAll(p | p.objectBinding.executionContext = self.objectBinding.executionContext and not\n" +
		"\t\t\t\t\t\t\t\t(p.objectBinding.oclIsTypeOf(MetricApplicationBinding)) and if\n" +
		"\t\t\t\t\t\t\t\t\t(self.objectBinding.oclAsType(MetricComponentBinding).componentInstance.oclIsKindOf(camel::deployment::InternalComponentInstance))\n" +
		"\t\t\t\t\t\t\t\tthen if (p.objectBinding.oclIsTypeOf(MetricVMBinding))\n" +
		"\t\t\t\t\t\t\t\t\tthen self.objectBinding.executionContext.deploymentModel.hostingInstances\n" +
		"\t\t\t\t\t\t\t\t\t\t->exists(q | q.providedHostInstance.oclContainer() = p.objectBinding.oclAsType(MetricVMBinding).vmInstance and\n" +
		"\t\t\t\t\t\t\t\t\t\t\tq.requiredHostInstance.oclContainer() = self.objectBinding.oclAsType(MetricComponentBinding).componentInstance)\n" +
		"\t\t\t\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\t\t\telse false\n" +
		"\t\t\t\t\t\t\t\tendif)\n" +
		"\t\t\t\t\t\telse composingMetricInstances\n" +
		"\t\t\t\t\t\t\t->forAll(p | p.objectBinding.oclIsTypeOf(MetricVMBinding))\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the component_metrics_refer_to_same_level_or_lower constraint of '<em>Composite Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricInstance_component_metrics_refer_to_same_level_or_lower(CompositeMetricInstance compositeMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC_INSTANCE,
				 compositeMetricInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "component_metrics_refer_to_same_level_or_lower",
				 COMPOSITE_METRIC_INSTANCE__COMPONENT_METRICS_REFER_TO_SAME_LEVEL_OR_LOWER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawMetricInstance(RawMetricInstance rawMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rawMetricInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rawMetricInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateRawMetricInstance_raw_metric_instance_correct_metric_type(rawMetricInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the raw_metric_instance_correct_metric_type constraint of '<em>Raw Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAW_METRIC_INSTANCE__RAW_METRIC_INSTANCE_CORRECT_METRIC_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'RawMetricInstance: ' + self.name +\n" +
		"\t\t\t\t\t' mut map to a raw metric',\n" +
		"\tstatus : Boolean = metric.oclIsTypeOf(RawMetric)\n" +
		"}.status";

	/**
	 * Validates the raw_metric_instance_correct_metric_type constraint of '<em>Raw Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawMetricInstance_raw_metric_instance_correct_metric_type(RawMetricInstance rawMetricInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.RAW_METRIC_INSTANCE,
				 rawMetricInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "raw_metric_instance_correct_metric_type",
				 RAW_METRIC_INSTANCE__RAW_METRIC_INSTANCE_CORRECT_METRIC_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFormulaParameter(MetricFormulaParameter metricFormulaParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metricFormulaParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metricFormulaParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(metricFormulaParameter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the value_attribute_set_for_non_metric_formula_parameters constraint of '<em>Formula Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC_FORMULA_PARAMETER__VALUE_ATTRIBUTE_SET_FOR_NON_METRIC_FORMULA_PARAMETERS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MetricFormulaParameter: ' + self.name +\n" +
		"\t\t\t\t\t' has a value of null while not mapping to a metric or metric formula',\n" +
		"\tstatus : Boolean = not (self.oclIsKindOf(Metric) or\n" +
		"\t\t\t\t\t(self.oclIsKindOf(MetricFormula))) implies self.value <> null\n" +
		"}.status";

	/**
	 * Validates the value_attribute_set_for_non_metric_formula_parameters constraint of '<em>Formula Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(MetricFormulaParameter metricFormulaParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC_FORMULA_PARAMETER,
				 metricFormulaParameter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "value_attribute_set_for_non_metric_formula_parameters",
				 METRIC_FORMULA_PARAMETER__VALUE_ATTRIBUTE_SET_FOR_NON_METRIC_FORMULA_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFormula(MetricFormula metricFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metricFormula, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormula_metric_formula_correct_arity_for_function_wrt_parameters(metricFormula, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormula_metric_formula_correct_arity_for_function(metricFormula, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the metric_formula_correct_arity_for_function_wrt_parameters constraint of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC_FORMULA__METRIC_FORMULA_CORRECT_ARITY_FOR_FUNCTION_WRT_PARAMETERS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MetricFormula: ' + self.toString() +\n" +
		"\t\t\t\t\t' has an incorrect arity: ' + functionArity.toString() + ' according to the size of the parameters list: ' +\n" +
		"\t\t\t\t\tparameters\n" +
		"\t\t\t\t\t->size().toString(),\n" +
		"\tstatus : Boolean = ((self.functionArity = MetricFunctionArityType::UNARY) implies (self.parameters\n" +
		"\t\t\t\t\t->size() = 1 and self.parameters\n" +
		"\t\t\t\t\t->select(p | p.oclIsKindOf(Metric))\n" +
		"\t\t\t\t\t->size() = 1)) and ((self.functionArity = MetricFunctionArityType::BINARY) implies self.parameters\n" +
		"\t\t\t\t\t->size() = 2) and ((self.functionArity = MetricFunctionArityType::N_ARY) implies self.parameters\n" +
		"\t\t\t\t\t->size() >= 2)\n" +
		"}.status";

	/**
	 * Validates the metric_formula_correct_arity_for_function_wrt_parameters constraint of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFormula_metric_formula_correct_arity_for_function_wrt_parameters(MetricFormula metricFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC_FORMULA,
				 metricFormula,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_formula_correct_arity_for_function_wrt_parameters",
				 METRIC_FORMULA__METRIC_FORMULA_CORRECT_ARITY_FOR_FUNCTION_WRT_PARAMETERS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the metric_formula_correct_arity_for_function constraint of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC_FORMULA__METRIC_FORMULA_CORRECT_ARITY_FOR_FUNCTION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MetricFormula: ' + self.toString() + ' has function: ' +\n" +
		"\t\t\t\t\tfunction.toString() + ' that does not correctly correspond to its arity: ' +\n" +
		"\t\t\t\t\tfunctionArity.toString(),\n" +
		"\tstatus : Boolean = ((self.function = MetricFunctionType::MODULO or self.function =\n" +
		"\t\t\t\t\tMetricFunctionType::PERCENTILE) implies self.functionArity = MetricFunctionArityType::BINARY) and (((self.function\n" +
		"\t\t\t\t\t= MetricFunctionType::MEAN or self.function = MetricFunctionType::STD or self.function = MetricFunctionType::MIN\n" +
		"\t\t\t\t\tor self.function = MetricFunctionType::MAX or self.function = MetricFunctionType::MODE or self.function =\n" +
		"\t\t\t\t\tMetricFunctionType::MEDIAN or self.function = MetricFunctionType::DERIVATIVE or self.function =\n" +
		"\t\t\t\t\tMetricFunctionType::COUNT) implies self.functionArity = MetricFunctionArityType::UNARY)) and (((self.function =\n" +
		"\t\t\t\t\tMetricFunctionType::TIMES or self.function = MetricFunctionType::DIV) implies (self.functionArity =\n" +
		"\t\t\t\t\tMetricFunctionArityType::BINARY or self.functionArity = MetricFunctionArityType::N_ARY)))\n" +
		"}.status";

	/**
	 * Validates the metric_formula_correct_arity_for_function constraint of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFormula_metric_formula_correct_arity_for_function(MetricFormula metricFormula, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC_FORMULA,
				 metricFormula,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_formula_correct_arity_for_function",
				 METRIC_FORMULA__METRIC_FORMULA_CORRECT_ARITY_FOR_FUNCTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(metric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_metric_measures_measurable_property(metric, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the metric_measures_measurable_property constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC__METRIC_MEASURES_MEASURABLE_PROPERTY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Metric: ' + name + ' measures property: ' + self.property.name +\n" +
		"\t\t\t\t\t' which is ABSTRACT (i.e., not MEASURABLE)',\n" +
		"\tstatus : Boolean = self.property.type = PropertyType::MEASURABLE\n" +
		"}.status";

	/**
	 * Validates the metric_measures_measurable_property constraint of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetric_metric_measures_measurable_property(Metric metric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC,
				 metric,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_measures_measurable_property",
				 METRIC__METRIC_MEASURES_MEASURABLE_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetric(CompositeMetric compositeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)compositeMetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_metric_measures_measurable_property(compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetric_metric_layer_enforcement(compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetric_metric_percentage_unit_enforcement(compositeMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetric_metric_composite_unit_enforcement(compositeMetric, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the metric_layer_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC__METRIC_LAYER_ENFORCEMENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Composite Metric: ' + name +\n" +
		"\t\t\t\t\t' has a layer which is below those of its composing metrics in the respective formula',\n" +
		"\tstatus : Boolean = self.formula.parameters\n" +
		"\t\t\t\t\t->forAll(p | (p.oclIsKindOf(Metric) implies self.greaterEqualThanLayer(self.layer, p.oclAsType(Metric).layer)))\n" +
		"}.status";

	/**
	 * Validates the metric_layer_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetric_metric_layer_enforcement(CompositeMetric compositeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC,
				 compositeMetric,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_layer_enforcement",
				 COMPOSITE_METRIC__METRIC_LAYER_ENFORCEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the metric_percentage_unit_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC__METRIC_PERCENTAGE_UNIT_ENFORCEMENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Composite Metric: ' + name +\n" +
		"\t\t\t\t\t' has an incorrect unit (percentage) by considering the units of its composing metrics and the function(s) involved in the respective metric formula',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(self.unit.unit = camel::unit::UnitType::PERCENTAGE)\n" +
		"\t\t\t\t\tthen (self.formula.parameters\n" +
		"\t\t\t\t\t\t->forAll(p | p.oclIsKindOf(Metric) implies p.oclAsType(Metric).unit.unit = camel::unit::UnitType::PERCENTAGE) or\n" +
		"\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV and self.formula.parameters\n" +
		"\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n" +
		"\t\t\t\t\t\t->forAll(p1, p2 | (p1.oclIsKindOf(Metric) and p2.oclIsKindOf(Metric)) implies p1.oclAsType(Metric).unit.unit =\n" +
		"\t\t\t\t\t\t\tp2.oclAsType(Metric).unit.unit)))\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the metric_percentage_unit_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetric_metric_percentage_unit_enforcement(CompositeMetric compositeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC,
				 compositeMetric,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_percentage_unit_enforcement",
				 COMPOSITE_METRIC__METRIC_PERCENTAGE_UNIT_ENFORCEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the metric_composite_unit_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC__METRIC_COMPOSITE_UNIT_ENFORCEMENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Composite Metric: ' + self.name +\n" +
		"\t\t\t\t\t' has a composite unit that does not correspond to the units of its composing metrics by also considering that its derivation formula maps to the DIV function',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(self.formula.function = MetricFunctionType::DIV)\n" +
		"\t\t\t\t\tthen ((self.unit.unit = camel::unit::UnitType::BYTES_PER_SECOND) implies (self.formula.parameters\n" +
		"\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::BYTES and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n" +
		"\t\t\t\t\t\tcamel::unit::UnitType::REQUESTS_PER_SECOND) implies (self.formula.parameters\n" +
		"\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::REQUESTS and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS) and (self.unit.unit =\n" +
		"\t\t\t\t\t\tcamel::unit::UnitType::TRANSACTIONS_PER_SECOND) implies (self.formula.parameters\n" +
		"\t\t\t\t\t\t->size() = 2 and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(1).oclAsType(Metric).unit.unit = camel::unit::UnitType::TRANSACTIONS and self.formula.parameters\n" +
		"\t\t\t\t\t\t->at(2).oclAsType(Metric).unit.unit = camel::unit::UnitType::SECONDS))\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the metric_composite_unit_enforcement constraint of '<em>Composite Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetric_metric_composite_unit_enforcement(CompositeMetric compositeMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC,
				 compositeMetric,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metric_composite_unit_enforcement",
				 COMPOSITE_METRIC__METRIC_COMPOSITE_UNIT_ENFORCEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawMetric(RawMetric rawMetric, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rawMetric, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricFormulaParameter_value_attribute_set_for_non_metric_formula_parameters(rawMetric, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetric_metric_measures_measurable_property(rawMetric, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricObjectBinding(MetricObjectBinding metricObjectBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)metricObjectBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricApplicationBinding(MetricApplicationBinding metricApplicationBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)metricApplicationBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricComponentBinding(MetricComponentBinding metricComponentBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metricComponentBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metricComponentBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricComponentBinding_vm_and_sw_comp_connected_in_component_binding(metricComponentBinding, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vm_and_sw_comp_connected_in_component_binding constraint of '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC_COMPONENT_BINDING__VM_AND_SW_COMP_CONNECTED_IN_COMPONENT_BINDING__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MetricComponentBinding: ' + self.name +\n" +
		"\t\t\t\t\t' has a componentInstance: ' + self.componentInstance.name +\n" +
		"\t\t\t\t\t'which is either not included in the the respective deployment model of the binding\\'s execution context: ' +\n" +
		"\t\t\t\t\tself.executionContext.name +\n" +
		"\t\t\t\t\t' or is not connected in this deployment model with the vmInstance or it is an external component such that in this case a null value for the vmInstance should have been provided',\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t\t(componentInstance.oclIsTypeOf(camel::deployment::InternalComponentInstance))\n" +
		"\t\t\t\t\tthen (executionContext.deploymentModel.internalComponentInstances\n" +
		"\t\t\t\t\t\t->includes(componentInstance)) and if (vmInstance <> null)\n" +
		"\t\t\t\t\t\tthen (executionContext.deploymentModel.vmInstances\n" +
		"\t\t\t\t\t\t\t->includes(vmInstance)) and (executionContext.deploymentModel.hostingInstances\n" +
		"\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and c.providedHostInstance.oclContainer() = vmInstance) or\n" +
		"\t\t\t\t\t\t\t(executionContext.deploymentModel.hostingInstances\n" +
		"\t\t\t\t\t\t\t->exists(c | c.requiredHostInstance.oclContainer() = componentInstance and\n" +
		"\t\t\t\t\t\t\t\texecutionContext.deploymentModel.hostingInstances\n" +
		"\t\t\t\t\t\t\t\t->exists(d | d.requiredHostInstance.oclContainer() = c.providedHostInstance.oclContainer() and d.providedHostInstance.oclContainer() =\n" +
		"\t\t\t\t\t\t\t\t\tvmInstance))))\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\telse false\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the vm_and_sw_comp_connected_in_component_binding constraint of '<em>Component Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricComponentBinding_vm_and_sw_comp_connected_in_component_binding(MetricComponentBinding metricComponentBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC_COMPONENT_BINDING,
				 metricComponentBinding,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vm_and_sw_comp_connected_in_component_binding",
				 METRIC_COMPONENT_BINDING__VM_AND_SW_COMP_CONNECTED_IN_COMPONENT_BINDING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricVMBinding(MetricVMBinding metricVMBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metricVMBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metricVMBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateMetricVMBinding_vm_binding_vm_in_dep_model_of_app(metricVMBinding, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vm_binding_vm_in_dep_model_of_app constraint of '<em>VM Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String METRIC_VM_BINDING__VM_BINDING_VM_IN_DEP_MODEL_OF_APP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'MetricVMBinding: ' + self.name + ' has VMInstance: ' + vmInstance.name\n" +
		"\t\t\t\t\t+ ' which is not included in the deployment model of the respective execution context: ' +\n" +
		"\t\t\t\t\tself.executionContext.name,\n" +
		"\tstatus : Boolean = (executionContext.deploymentModel.vmInstances\n" +
		"\t\t\t\t\t->includes(vmInstance))\n" +
		"}.status";

	/**
	 * Validates the vm_binding_vm_in_dep_model_of_app constraint of '<em>VM Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricVMBinding_vm_binding_vm_in_dep_model_of_app(MetricVMBinding metricVMBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.METRIC_VM_BINDING,
				 metricVMBinding,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vm_binding_vm_in_dep_model_of_app",
				 METRIC_VM_BINDING__VM_BINDING_VM_IN_DEP_MODEL_OF_APP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)schedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)schedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateSchedule_schedule_correct_values(schedule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the schedule_correct_values constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCHEDULE__SCHEDULE_CORRECT_VALUES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Schedule: ' + self.name +\n" +
		"\t\t\t\t\t' has wrong value combination for its attributes and properties. In particular, either the type of the schedule is SINGLE_EVENT and a value of any of the rest of the attributes or the unit property has been given or the schedule type is different but a non-positive value of the interval attribute or no value for the unit property has been provided',\n" +
		"\tstatus : Boolean = (self.type\n" +
		"\t\t\t\t\t<> ScheduleType::SINGLE_EVENT implies (self.interval > 0 and self.unit <> null)) and ((self.type =\n" +
		"\t\t\t\t\tScheduleType::SINGLE_EVENT implies (interval = 0 and start = null and end = null and unit = null)))\n" +
		"}.status";

	/**
	 * Validates the schedule_correct_values constraint of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule_schedule_correct_values(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.SCHEDULE,
				 schedule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "schedule_correct_values",
				 SCHEDULE__SCHEDULE_CORRECT_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensor(Sensor sensor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)sensor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)window, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)window, diagnostics, context);
		if (result || diagnostics != null) result &= validateWindow_window_positive_params(window, diagnostics, context);
		if (result || diagnostics != null) result &= validateWindow_window_right_params_exist(window, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the window_positive_params constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WINDOW__WINDOW_POSITIVE_PARAMS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Window:' + self.name +\n" +
		"\t\t\t\t\t' has a negative value for the measurementSize and timeSize attributes',\n" +
		"\tstatus : Boolean = (measurementSize >= 0) and (timeSize >=\n" +
		"\t\t\t\t\t0)\n" +
		"}.status";

	/**
	 * Validates the window_positive_params constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow_window_positive_params(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.WINDOW,
				 window,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "window_positive_params",
				 WINDOW__WINDOW_POSITIVE_PARAMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the window_right_params_exist constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WINDOW__WINDOW_RIGHT_PARAMS_EXIST__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Window: ' + self.name +\n" +
		"\t\t\t\t\t' has wrong value combinations for its attributes and properties. If sizeType is MEASUREMENTS_ONLY, then the measurementSize should be positive and all other values zero or null. If sizeType is TIME_ONLY, then both the unit should not be null and the timeSize should be positive, while the measurementSize should be zero. For the other values of sizeType, the values of all remaining attributes and units should be provided',\n" +
		"\tstatus : Boolean = (self.sizeType\n" +
		"\t\t\t\t\t= WindowSizeType::MEASUREMENTS_ONLY implies (unit = null and timeSize = 0 and measurementSize > 0)) and\n" +
		"\t\t\t\t\t(self.sizeType = WindowSizeType::TIME_ONLY implies (unit <> null and timeSize > 0 and measurementSize = 0)) and\n" +
		"\t\t\t\t\t((self.sizeType = WindowSizeType::FIRST_MATCH or self.sizeType = WindowSizeType::BOTH_MATCH) implies (timeSize > 0\n" +
		"\t\t\t\t\tand unit <> null and measurementSize > 0))\n" +
		"}.status";

	/**
	 * Validates the window_right_params_exist constraint of '<em>Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindow_window_right_params_exist(Window window, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.WINDOW,
				 window,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "window_right_params_exist",
				 WINDOW__WINDOW_RIGHT_PARAMS_EXIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContext(ConditionContext conditionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)conditionContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_context_right_params(conditionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_at_least_one_alternative_in_condition_context(conditionContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the context_right_params constraint of '<em>Condition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITION_CONTEXT__CONTEXT_RIGHT_PARAMS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Context: ' + self.name +\n" +
		"\t\t\t\t\t' has wrong value combinations for the quantifier and quantity attributes. When quantifier equals to SOME, then we have the two following cases: (a) relative values: minQuantity should be greater than 0.0 and maxQuantity less or equal to 1.0 and minQuantity less or equal to maxQuantity; (b) absolute values: minQuantity should be greater or equal to 1 and maxQuantity either -1 (inf) or greater or equal to minQuantity and both quantities should be integer',\n" +
		"\tstatus : Boolean = ((self.quantifier\n" +
		"\t\t\t\t\t= QuantifierType::SOME and self.isRelative = true) implies (minQuantity > 0.0 and maxQuantity <= 1.0 and\n" +
		"\t\t\t\t\tmaxQuantity >= minQuantity)) and ((self.quantifier = QuantifierType::SOME and self.isRelative = false) implies\n" +
		"\t\t\t\t\t(minQuantity >= 1.0 and ((maxQuantity >= 1.0 and maxQuantity >= minQuantity) or maxQuantity = - 1.0)) and\n" +
		"\t\t\t\t\t(minQuantity / minQuantity.round()) = 1 and (maxQuantity / maxQuantity.round()) = 1)\n" +
		"}.status";

	/**
	 * Validates the context_right_params constraint of '<em>Condition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContext_context_right_params(ConditionContext conditionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.CONDITION_CONTEXT,
				 conditionContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "context_right_params",
				 CONDITION_CONTEXT__CONTEXT_RIGHT_PARAMS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the at_least_one_alternative_in_condition_context constraint of '<em>Condition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONDITION_CONTEXT__AT_LEAST_ONE_ALTERNATIVE_IN_CONDITION_CONTEXT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In ConditionContext: ' + self.name +\n" +
		"\t\t\t\t\t' either a component or an application should be referenced',\n" +
		"\tstatus : Boolean = self.component <> null or self.application <> null\n" +
		"}.status";

	/**
	 * Validates the at_least_one_alternative_in_condition_context constraint of '<em>Condition Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionContext_at_least_one_alternative_in_condition_context(ConditionContext conditionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.CONDITION_CONTEXT,
				 conditionContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_alternative_in_condition_context",
				 CONDITION_CONTEXT__AT_LEAST_ONE_ALTERNATIVE_IN_CONDITION_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricModel(MetricModel metricModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)metricModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricContext(MetricContext metricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)metricContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_context_right_params(metricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_at_least_one_alternative_in_condition_context(metricContext, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricContext(CompositeMetricContext compositeMetricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)compositeMetricContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_context_right_params(compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_at_least_one_alternative_in_condition_context(compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetricContext_metrics_in_composing_contexts_in_metric_formula(compositeMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateCompositeMetricContext_composite_metric_context_correct_metric_type(compositeMetricContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the metrics_in_composing_contexts_in_metric_formula constraint of '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC_CONTEXT__METRICS_IN_COMPOSING_CONTEXTS_IN_METRIC_FORMULA__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In MetricContext: ' + self.name +\n" +
		"\t\t\t\t\t' one or more composingMetricContexts correspond to metrics which are either equal to this context metric: ' +\n" +
		"\t\t\t\t\tself.metric.name + ' or do not belong to the context metric'\n" +
		"\t\t\t\t\t's formula',\n" +
		"\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric) and self.composingMetricContexts\n" +
		"\t\t\t\t\t->forAll(p | p.metric <> self.metric and self.metric.oclAsType(CompositeMetric).formula.containsMetric(p.metric))\n" +
		"}.status";

	/**
	 * Validates the metrics_in_composing_contexts_in_metric_formula constraint of '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricContext_metrics_in_composing_contexts_in_metric_formula(CompositeMetricContext compositeMetricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC_CONTEXT,
				 compositeMetricContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "metrics_in_composing_contexts_in_metric_formula",
				 COMPOSITE_METRIC_CONTEXT__METRICS_IN_COMPOSING_CONTEXTS_IN_METRIC_FORMULA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the composite_metric_context_correct_metric_type constraint of '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPOSITE_METRIC_CONTEXT__COMPOSITE_METRIC_CONTEXT_CORRECT_METRIC_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In CompositeMetricContext: ' + self.name + ' the metric: '\n" +
		"\t\t\t\t\t+ self.metric.name + ' should be composite but it isn\\'t',\n" +
		"\tstatus : Boolean = self.metric.oclIsTypeOf(CompositeMetric)\n" +
		"}.status";

	/**
	 * Validates the composite_metric_context_correct_metric_type constraint of '<em>Composite Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeMetricContext_composite_metric_context_correct_metric_type(CompositeMetricContext compositeMetricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.COMPOSITE_METRIC_CONTEXT,
				 compositeMetricContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "composite_metric_context_correct_metric_type",
				 COMPOSITE_METRIC_CONTEXT__COMPOSITE_METRIC_CONTEXT_CORRECT_METRIC_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawMetricContext(RawMetricContext rawMetricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)rawMetricContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_context_right_params(rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_at_least_one_alternative_in_condition_context(rawMetricContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateRawMetricContext_raw_metric_context_correct_metric_type(rawMetricContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the raw_metric_context_correct_metric_type constraint of '<em>Raw Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RAW_METRIC_CONTEXT__RAW_METRIC_CONTEXT_CORRECT_METRIC_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In RawMetricContext: ' + self.name + ' the metric: ' +\n" +
		"\t\t\t\t\tself.metric.name + ' should be raw but it isn\\'t',\n" +
		"\tstatus : Boolean = self.metric.oclIsTypeOf(RawMetric)\n" +
		"}.status";

	/**
	 * Validates the raw_metric_context_correct_metric_type constraint of '<em>Raw Metric Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRawMetricContext_raw_metric_context_correct_metric_type(RawMetricContext rawMetricContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(MetricPackage.Literals.RAW_METRIC_CONTEXT,
				 rawMetricContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "raw_metric_context_correct_metric_type",
				 RAW_METRIC_CONTEXT__RAW_METRIC_CONTEXT_CORRECT_METRIC_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyContext(PropertyContext propertyContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)propertyContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_context_right_params(propertyContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionContext_at_least_one_alternative_in_condition_context(propertyContext, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparisonOperatorType(ComparisonOperatorType comparisonOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFunctionArityType(MetricFunctionArityType metricFunctionArityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetricFunctionType(MetricFunctionType metricFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScheduleType(ScheduleType scheduleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowSizeType(WindowSizeType windowSizeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWindowType(WindowType windowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantifierType(QuantifierType quantifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionPatternType(FunctionPatternType functionPatternType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MetricValidator
