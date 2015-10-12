/**
 */
package eu.paasage.camel.metric;

import eu.paasage.camel.CamelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.metric.MetricFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface MetricPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/metric";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metric";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricPackage eINSTANCE = eu.paasage.camel.metric.impl.MetricPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.ConditionImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMPARISON_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALIDITY = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricConditionImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricCondition()
	 * @generated
	 */
	int METRIC_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION__COMPARISON_OPERATOR = CONDITION__COMPARISON_OPERATOR;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION__THRESHOLD = CONDITION__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION__VALIDITY = CONDITION__VALIDITY;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION__METRIC_CONTEXT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.PropertyConditionImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyCondition()
	 * @generated
	 */
	int PROPERTY_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__COMPARISON_OPERATOR = CONDITION__COMPARISON_OPERATOR;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__THRESHOLD = CONDITION__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__VALIDITY = CONDITION__VALIDITY;

	/**
	 * The feature id for the '<em><b>Property Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__PROPERTY_CONTEXT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__UNIT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION__TIME_UNIT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricInstanceImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricInstance()
	 * @generated
	 */
	int METRIC_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__METRIC = 1;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__SCHEDULE = 2;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__WINDOW = 3;

	/**
	 * The feature id for the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__OBJECT_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__METRIC_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = 0;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.CompositeMetricInstanceImpl <em>Composite Metric Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.CompositeMetricInstanceImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetricInstance()
	 * @generated
	 */
	int COMPOSITE_METRIC_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__NAME = METRIC_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__METRIC = METRIC_INSTANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__SCHEDULE = METRIC_INSTANCE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__WINDOW = METRIC_INSTANCE__WINDOW;

	/**
	 * The feature id for the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__OBJECT_BINDING = METRIC_INSTANCE__OBJECT_BINDING;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__METRIC_CONTEXT = METRIC_INSTANCE__METRIC_CONTEXT;

	/**
	 * The feature id for the '<em><b>Composing Metric Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES = METRIC_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE_FEATURE_COUNT = METRIC_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE;

	/**
	 * The number of operations of the '<em>Composite Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_INSTANCE_OPERATION_COUNT = METRIC_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.RawMetricInstanceImpl <em>Raw Metric Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.RawMetricInstanceImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetricInstance()
	 * @generated
	 */
	int RAW_METRIC_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__NAME = METRIC_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__METRIC = METRIC_INSTANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__SCHEDULE = METRIC_INSTANCE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__WINDOW = METRIC_INSTANCE__WINDOW;

	/**
	 * The feature id for the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__OBJECT_BINDING = METRIC_INSTANCE__OBJECT_BINDING;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__METRIC_CONTEXT = METRIC_INSTANCE__METRIC_CONTEXT;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE__SENSOR = METRIC_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE_FEATURE_COUNT = METRIC_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE;

	/**
	 * The number of operations of the '<em>Raw Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_INSTANCE_OPERATION_COUNT = METRIC_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricFormulaParameterImpl <em>Formula Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricFormulaParameterImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFormulaParameter()
	 * @generated
	 */
	int METRIC_FORMULA_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Formula Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formula Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricFormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricFormulaImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFormula()
	 * @generated
	 */
	int METRIC_FORMULA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__NAME = METRIC_FORMULA_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__VALUE = METRIC_FORMULA_PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__FUNCTION = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__FUNCTION_ARITY = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__FUNCTION_PATTERN = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA__PARAMETERS = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_FEATURE_COUNT = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Contains Metric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA___CONTAINS_METRIC__METRIC = METRIC_FORMULA_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FORMULA_OPERATION_COUNT = METRIC_FORMULA_PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = METRIC_FORMULA_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE = METRIC_FORMULA_PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE_TYPE = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE_DIRECTION = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__UNIT = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__LAYER = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__PROPERTY = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = METRIC_FORMULA_PARAMETER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = METRIC_FORMULA_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = METRIC_FORMULA_PARAMETER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.CompositeMetricImpl <em>Composite Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.CompositeMetricImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetric()
	 * @generated
	 */
	int COMPOSITE_METRIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__VALUE = METRIC__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__VALUE_TYPE = METRIC__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__VALUE_DIRECTION = METRIC__VALUE_DIRECTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__LAYER = METRIC__LAYER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__PROPERTY = METRIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC__FORMULA = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = METRIC___CHECK_RECURSIVENESS__METRIC_METRIC;

	/**
	 * The operation id for the '<em>Greater Equal Than Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE = METRIC_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.RawMetricImpl <em>Raw Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.RawMetricImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetric()
	 * @generated
	 */
	int RAW_METRIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__VALUE = METRIC__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__DESCRIPTION = METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__VALUE_TYPE = METRIC__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__VALUE_DIRECTION = METRIC__VALUE_DIRECTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__UNIT = METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__LAYER = METRIC__LAYER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC__PROPERTY = METRIC__PROPERTY;

	/**
	 * The number of structural features of the '<em>Raw Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = METRIC___CHECK_RECURSIVENESS__METRIC_METRIC;

	/**
	 * The number of operations of the '<em>Raw Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricObjectBindingImpl <em>Object Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricObjectBindingImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricObjectBinding()
	 * @generated
	 */
	int METRIC_OBJECT_BINDING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OBJECT_BINDING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OBJECT_BINDING__EXECUTION_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Object Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OBJECT_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Object Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OBJECT_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricApplicationBindingImpl <em>Application Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricApplicationBindingImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricApplicationBinding()
	 * @generated
	 */
	int METRIC_APPLICATION_BINDING = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_APPLICATION_BINDING__NAME = METRIC_OBJECT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_APPLICATION_BINDING__EXECUTION_CONTEXT = METRIC_OBJECT_BINDING__EXECUTION_CONTEXT;

	/**
	 * The number of structural features of the '<em>Application Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_APPLICATION_BINDING_FEATURE_COUNT = METRIC_OBJECT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_APPLICATION_BINDING_OPERATION_COUNT = METRIC_OBJECT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricComponentBindingImpl <em>Component Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricComponentBindingImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricComponentBinding()
	 * @generated
	 */
	int METRIC_COMPONENT_BINDING = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING__NAME = METRIC_OBJECT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING__EXECUTION_CONTEXT = METRIC_OBJECT_BINDING__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Vm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING__VM_INSTANCE = METRIC_OBJECT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING__COMPONENT_INSTANCE = METRIC_OBJECT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING_FEATURE_COUNT = METRIC_OBJECT_BINDING_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_COMPONENT_BINDING_OPERATION_COUNT = METRIC_OBJECT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricVMBindingImpl <em>VM Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricVMBindingImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricVMBinding()
	 * @generated
	 */
	int METRIC_VM_BINDING = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VM_BINDING__NAME = METRIC_OBJECT_BINDING__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VM_BINDING__EXECUTION_CONTEXT = METRIC_OBJECT_BINDING__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Vm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VM_BINDING__VM_INSTANCE = METRIC_OBJECT_BINDING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VM_BINDING_FEATURE_COUNT = METRIC_OBJECT_BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VM Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_VM_BINDING_OPERATION_COUNT = METRIC_OBJECT_BINDING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.PropertyImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Sub Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SUB_PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SENSORS = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.ScheduleImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__END = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__REPETITIONS = 5;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__INTERVAL = 6;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Check Start End Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___CHECK_START_END_DATES__SCHEDULE = 0;

	/**
	 * The operation id for the '<em>Check Interval Repetitions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE___CHECK_INTERVAL_REPETITIONS__SCHEDULE = 1;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.SensorImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Is Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__IS_PUSH = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.WindowImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Window Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WINDOW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Size Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SIZE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Measurement Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MEASUREMENT_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Time Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TIME_SIZE = 5;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.ConditionContextImpl <em>Condition Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.ConditionContextImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getConditionContext()
	 * @generated
	 */
	int CONDITION_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__QUANTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__MIN_QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__MAX_QUANTITY = 5;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT__IS_RELATIVE = 6;

	/**
	 * The number of structural features of the '<em>Condition Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Condition Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricModelImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricModel()
	 * @generated
	 */
	int METRIC_MODEL = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__CONTEXTS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__METRICS = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metric Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__METRIC_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__CONDITIONS = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__PROPERTIES = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__BINDINGS = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__WINDOWS = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Schedules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__SCHEDULES = CamelPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__PARAMETERS = CamelPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__SENSORS = CamelPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL__UNITS = CamelPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.MetricContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.MetricContextImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricContext()
	 * @generated
	 */
	int METRIC_CONTEXT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__NAME = CONDITION_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__COMPONENT = CONDITION_CONTEXT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__APPLICATION = CONDITION_CONTEXT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__QUANTIFIER = CONDITION_CONTEXT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__MIN_QUANTITY = CONDITION_CONTEXT__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__MAX_QUANTITY = CONDITION_CONTEXT__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__IS_RELATIVE = CONDITION_CONTEXT__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__METRIC = CONDITION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__WINDOW = CONDITION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT__SCHEDULE = CONDITION_CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT_FEATURE_COUNT = CONDITION_CONTEXT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_CONTEXT_OPERATION_COUNT = CONDITION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.CompositeMetricContextImpl <em>Composite Metric Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.CompositeMetricContextImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetricContext()
	 * @generated
	 */
	int COMPOSITE_METRIC_CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__NAME = METRIC_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__COMPONENT = METRIC_CONTEXT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__APPLICATION = METRIC_CONTEXT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__QUANTIFIER = METRIC_CONTEXT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__MIN_QUANTITY = METRIC_CONTEXT__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__MAX_QUANTITY = METRIC_CONTEXT__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__IS_RELATIVE = METRIC_CONTEXT__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__METRIC = METRIC_CONTEXT__METRIC;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__WINDOW = METRIC_CONTEXT__WINDOW;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__SCHEDULE = METRIC_CONTEXT__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Composing Metric Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT__COMPOSING_METRIC_CONTEXTS = METRIC_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Metric Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT_FEATURE_COUNT = METRIC_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Metric Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_METRIC_CONTEXT_OPERATION_COUNT = METRIC_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.RawMetricContextImpl <em>Raw Metric Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.RawMetricContextImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetricContext()
	 * @generated
	 */
	int RAW_METRIC_CONTEXT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__NAME = METRIC_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__COMPONENT = METRIC_CONTEXT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__APPLICATION = METRIC_CONTEXT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__QUANTIFIER = METRIC_CONTEXT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__MIN_QUANTITY = METRIC_CONTEXT__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__MAX_QUANTITY = METRIC_CONTEXT__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__IS_RELATIVE = METRIC_CONTEXT__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__METRIC = METRIC_CONTEXT__METRIC;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__WINDOW = METRIC_CONTEXT__WINDOW;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__SCHEDULE = METRIC_CONTEXT__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT__SENSOR = METRIC_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Metric Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT_FEATURE_COUNT = METRIC_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raw Metric Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_METRIC_CONTEXT_OPERATION_COUNT = METRIC_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.impl.PropertyContextImpl <em>Property Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.impl.PropertyContextImpl
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyContext()
	 * @generated
	 */
	int PROPERTY_CONTEXT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__NAME = CONDITION_CONTEXT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__COMPONENT = CONDITION_CONTEXT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__APPLICATION = CONDITION_CONTEXT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__QUANTIFIER = CONDITION_CONTEXT__QUANTIFIER;

	/**
	 * The feature id for the '<em><b>Min Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__MIN_QUANTITY = CONDITION_CONTEXT__MIN_QUANTITY;

	/**
	 * The feature id for the '<em><b>Max Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__MAX_QUANTITY = CONDITION_CONTEXT__MAX_QUANTITY;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__IS_RELATIVE = CONDITION_CONTEXT__IS_RELATIVE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT__PROPERTY = CONDITION_CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_FEATURE_COUNT = CONDITION_CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONTEXT_OPERATION_COUNT = CONDITION_CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.ComparisonOperatorType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getComparisonOperatorType()
	 * @generated
	 */
	int COMPARISON_OPERATOR_TYPE = 25;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.MetricFunctionArityType <em>Function Arity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.MetricFunctionArityType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFunctionArityType()
	 * @generated
	 */
	int METRIC_FUNCTION_ARITY_TYPE = 26;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.MetricFunctionType <em>Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.MetricFunctionType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFunctionType()
	 * @generated
	 */
	int METRIC_FUNCTION_TYPE = 27;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.PropertyType <em>Property Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.PropertyType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 28;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.ScheduleType <em>Schedule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.ScheduleType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getScheduleType()
	 * @generated
	 */
	int SCHEDULE_TYPE = 29;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.WindowSizeType <em>Window Size Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.WindowSizeType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindowSizeType()
	 * @generated
	 */
	int WINDOW_SIZE_TYPE = 30;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.WindowType <em>Window Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.WindowType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindowType()
	 * @generated
	 */
	int WINDOW_TYPE = 31;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.QuantifierType <em>Quantifier Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.QuantifierType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getQuantifierType()
	 * @generated
	 */
	int QUANTIFIER_TYPE = 32;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.metric.FunctionPatternType <em>Function Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.metric.FunctionPatternType
	 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getFunctionPatternType()
	 * @generated
	 */
	int FUNCTION_PATTERN_TYPE = 33;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see eu.paasage.camel.metric.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Condition#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see eu.paasage.camel.metric.Condition#getComparisonOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Condition#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see eu.paasage.camel.metric.Condition#getThreshold()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Condition#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see eu.paasage.camel.metric.Condition#getValidity()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Validity();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see eu.paasage.camel.metric.MetricCondition
	 * @generated
	 */
	EClass getMetricCondition();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricCondition#getMetricContext <em>Metric Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Context</em>'.
	 * @see eu.paasage.camel.metric.MetricCondition#getMetricContext()
	 * @see #getMetricCondition()
	 * @generated
	 */
	EReference getMetricCondition_MetricContext();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.PropertyCondition <em>Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Condition</em>'.
	 * @see eu.paasage.camel.metric.PropertyCondition
	 * @generated
	 */
	EClass getPropertyCondition();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.PropertyCondition#getPropertyContext <em>Property Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Context</em>'.
	 * @see eu.paasage.camel.metric.PropertyCondition#getPropertyContext()
	 * @see #getPropertyCondition()
	 * @generated
	 */
	EReference getPropertyCondition_PropertyContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.PropertyCondition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see eu.paasage.camel.metric.PropertyCondition#getUnit()
	 * @see #getPropertyCondition()
	 * @generated
	 */
	EReference getPropertyCondition_Unit();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.PropertyCondition#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Unit</em>'.
	 * @see eu.paasage.camel.metric.PropertyCondition#getTimeUnit()
	 * @see #getPropertyCondition()
	 * @generated
	 */
	EReference getPropertyCondition_TimeUnit();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance
	 * @generated
	 */
	EClass getMetricInstance();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getName()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EAttribute getMetricInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricInstance#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getMetric()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_Metric();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricInstance#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getSchedule()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_Schedule();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricInstance#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getWindow()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_Window();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricInstance#getObjectBinding <em>Object Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object Binding</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getObjectBinding()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_ObjectBinding();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricInstance#getMetricContext <em>Metric Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Context</em>'.
	 * @see eu.paasage.camel.metric.MetricInstance#getMetricContext()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_MetricContext();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.MetricInstance#checkRecursiveness(eu.paasage.camel.metric.MetricInstance, eu.paasage.camel.metric.MetricInstance) <em>Check Recursiveness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Recursiveness</em>' operation.
	 * @see eu.paasage.camel.metric.MetricInstance#checkRecursiveness(eu.paasage.camel.metric.MetricInstance, eu.paasage.camel.metric.MetricInstance)
	 * @generated
	 */
	EOperation getMetricInstance__CheckRecursiveness__MetricInstance_MetricInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.CompositeMetricInstance <em>Composite Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Metric Instance</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetricInstance
	 * @generated
	 */
	EClass getCompositeMetricInstance();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.metric.CompositeMetricInstance#getComposingMetricInstances <em>Composing Metric Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composing Metric Instances</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetricInstance#getComposingMetricInstances()
	 * @see #getCompositeMetricInstance()
	 * @generated
	 */
	EReference getCompositeMetricInstance_ComposingMetricInstances();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.RawMetricInstance <em>Raw Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Metric Instance</em>'.
	 * @see eu.paasage.camel.metric.RawMetricInstance
	 * @generated
	 */
	EClass getRawMetricInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.RawMetricInstance#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see eu.paasage.camel.metric.RawMetricInstance#getSensor()
	 * @see #getRawMetricInstance()
	 * @generated
	 */
	EReference getRawMetricInstance_Sensor();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricFormulaParameter <em>Formula Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula Parameter</em>'.
	 * @see eu.paasage.camel.metric.MetricFormulaParameter
	 * @generated
	 */
	EClass getMetricFormulaParameter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricFormulaParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.MetricFormulaParameter#getName()
	 * @see #getMetricFormulaParameter()
	 * @generated
	 */
	EAttribute getMetricFormulaParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricFormulaParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see eu.paasage.camel.metric.MetricFormulaParameter#getValue()
	 * @see #getMetricFormulaParameter()
	 * @generated
	 */
	EReference getMetricFormulaParameter_Value();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see eu.paasage.camel.metric.MetricFormula
	 * @generated
	 */
	EClass getMetricFormula();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricFormula#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see eu.paasage.camel.metric.MetricFormula#getFunction()
	 * @see #getMetricFormula()
	 * @generated
	 */
	EAttribute getMetricFormula_Function();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricFormula#getFunctionArity <em>Function Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Arity</em>'.
	 * @see eu.paasage.camel.metric.MetricFormula#getFunctionArity()
	 * @see #getMetricFormula()
	 * @generated
	 */
	EAttribute getMetricFormula_FunctionArity();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricFormula#getFunctionPattern <em>Function Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Pattern</em>'.
	 * @see eu.paasage.camel.metric.MetricFormula#getFunctionPattern()
	 * @see #getMetricFormula()
	 * @generated
	 */
	EAttribute getMetricFormula_FunctionPattern();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.metric.MetricFormula#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see eu.paasage.camel.metric.MetricFormula#getParameters()
	 * @see #getMetricFormula()
	 * @generated
	 */
	EReference getMetricFormula_Parameters();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.MetricFormula#containsMetric(eu.paasage.camel.metric.Metric) <em>Contains Metric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Metric</em>' operation.
	 * @see eu.paasage.camel.metric.MetricFormula#containsMetric(eu.paasage.camel.metric.Metric)
	 * @generated
	 */
	EOperation getMetricFormula__ContainsMetric__Metric();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see eu.paasage.camel.metric.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.paasage.camel.metric.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.Metric#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see eu.paasage.camel.metric.Metric#getValueType()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Metric#getValueDirection <em>Value Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Direction</em>'.
	 * @see eu.paasage.camel.metric.Metric#getValueDirection()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_ValueDirection();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.Metric#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see eu.paasage.camel.metric.Metric#getUnit()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Metric#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eu.paasage.camel.metric.Metric#getLayer()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Layer();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.Metric#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see eu.paasage.camel.metric.Metric#getProperty()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_Property();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.Metric#checkRecursiveness(eu.paasage.camel.metric.Metric, eu.paasage.camel.metric.Metric) <em>Check Recursiveness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Recursiveness</em>' operation.
	 * @see eu.paasage.camel.metric.Metric#checkRecursiveness(eu.paasage.camel.metric.Metric, eu.paasage.camel.metric.Metric)
	 * @generated
	 */
	EOperation getMetric__CheckRecursiveness__Metric_Metric();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.CompositeMetric <em>Composite Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Metric</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetric
	 * @generated
	 */
	EClass getCompositeMetric();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.metric.CompositeMetric#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formula</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetric#getFormula()
	 * @see #getCompositeMetric()
	 * @generated
	 */
	EReference getCompositeMetric_Formula();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.CompositeMetric#greaterEqualThanLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType) <em>Greater Equal Than Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Greater Equal Than Layer</em>' operation.
	 * @see eu.paasage.camel.metric.CompositeMetric#greaterEqualThanLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType)
	 * @generated
	 */
	EOperation getCompositeMetric__GreaterEqualThanLayer__LayerType_LayerType();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.RawMetric <em>Raw Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Metric</em>'.
	 * @see eu.paasage.camel.metric.RawMetric
	 * @generated
	 */
	EClass getRawMetric();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricObjectBinding <em>Object Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Binding</em>'.
	 * @see eu.paasage.camel.metric.MetricObjectBinding
	 * @generated
	 */
	EClass getMetricObjectBinding();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.MetricObjectBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.MetricObjectBinding#getName()
	 * @see #getMetricObjectBinding()
	 * @generated
	 */
	EAttribute getMetricObjectBinding_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricObjectBinding#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Context</em>'.
	 * @see eu.paasage.camel.metric.MetricObjectBinding#getExecutionContext()
	 * @see #getMetricObjectBinding()
	 * @generated
	 */
	EReference getMetricObjectBinding_ExecutionContext();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricApplicationBinding <em>Application Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Binding</em>'.
	 * @see eu.paasage.camel.metric.MetricApplicationBinding
	 * @generated
	 */
	EClass getMetricApplicationBinding();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricComponentBinding <em>Component Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Binding</em>'.
	 * @see eu.paasage.camel.metric.MetricComponentBinding
	 * @generated
	 */
	EClass getMetricComponentBinding();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricComponentBinding#getVmInstance <em>Vm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Instance</em>'.
	 * @see eu.paasage.camel.metric.MetricComponentBinding#getVmInstance()
	 * @see #getMetricComponentBinding()
	 * @generated
	 */
	EReference getMetricComponentBinding_VmInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricComponentBinding#getComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Instance</em>'.
	 * @see eu.paasage.camel.metric.MetricComponentBinding#getComponentInstance()
	 * @see #getMetricComponentBinding()
	 * @generated
	 */
	EReference getMetricComponentBinding_ComponentInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricVMBinding <em>VM Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Binding</em>'.
	 * @see eu.paasage.camel.metric.MetricVMBinding
	 * @generated
	 */
	EClass getMetricVMBinding();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricVMBinding#getVmInstance <em>Vm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Instance</em>'.
	 * @see eu.paasage.camel.metric.MetricVMBinding#getVmInstance()
	 * @see #getMetricVMBinding()
	 * @generated
	 */
	EReference getMetricVMBinding_VmInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see eu.paasage.camel.metric.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Property#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.paasage.camel.metric.Property#getDescription()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Description();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.paasage.camel.metric.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.metric.Property#getSubProperties <em>Sub Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Properties</em>'.
	 * @see eu.paasage.camel.metric.Property#getSubProperties()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_SubProperties();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.metric.Property#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see eu.paasage.camel.metric.Property#getSensors()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Sensors();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see eu.paasage.camel.metric.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getName()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getStart()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Start();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getEnd()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_End();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getType()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Type();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.Schedule#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getUnit()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getRepetitions <em>Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetitions</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getRepetitions()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Repetitions();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Schedule#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see eu.paasage.camel.metric.Schedule#getInterval()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Interval();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.Schedule#checkStartEndDates(eu.paasage.camel.metric.Schedule) <em>Check Start End Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Start End Dates</em>' operation.
	 * @see eu.paasage.camel.metric.Schedule#checkStartEndDates(eu.paasage.camel.metric.Schedule)
	 * @generated
	 */
	EOperation getSchedule__CheckStartEndDates__Schedule();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.metric.Schedule#checkIntervalRepetitions(eu.paasage.camel.metric.Schedule) <em>Check Interval Repetitions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Interval Repetitions</em>' operation.
	 * @see eu.paasage.camel.metric.Schedule#checkIntervalRepetitions(eu.paasage.camel.metric.Schedule)
	 * @generated
	 */
	EOperation getSchedule__CheckIntervalRepetitions__Schedule();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see eu.paasage.camel.metric.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Sensor#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see eu.paasage.camel.metric.Sensor#getConfiguration()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Sensor#isIsPush <em>Is Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Push</em>'.
	 * @see eu.paasage.camel.metric.Sensor#isIsPush()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_IsPush();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see eu.paasage.camel.metric.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Window#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.Window#getName()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.Window#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see eu.paasage.camel.metric.Window#getUnit()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Window#getWindowType <em>Window Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Type</em>'.
	 * @see eu.paasage.camel.metric.Window#getWindowType()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_WindowType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Window#getSizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Type</em>'.
	 * @see eu.paasage.camel.metric.Window#getSizeType()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_SizeType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Window#getMeasurementSize <em>Measurement Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Size</em>'.
	 * @see eu.paasage.camel.metric.Window#getMeasurementSize()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_MeasurementSize();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.Window#getTimeSize <em>Time Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Size</em>'.
	 * @see eu.paasage.camel.metric.Window#getTimeSize()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_TimeSize();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.ConditionContext <em>Condition Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Context</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext
	 * @generated
	 */
	EClass getConditionContext();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.ConditionContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getName()
	 * @see #getConditionContext()
	 * @generated
	 */
	EAttribute getConditionContext_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.ConditionContext#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getComponent()
	 * @see #getConditionContext()
	 * @generated
	 */
	EReference getConditionContext_Component();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.ConditionContext#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getApplication()
	 * @see #getConditionContext()
	 * @generated
	 */
	EReference getConditionContext_Application();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.ConditionContext#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getQuantifier()
	 * @see #getConditionContext()
	 * @generated
	 */
	EAttribute getConditionContext_Quantifier();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.ConditionContext#getMinQuantity <em>Min Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Quantity</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getMinQuantity()
	 * @see #getConditionContext()
	 * @generated
	 */
	EAttribute getConditionContext_MinQuantity();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.ConditionContext#getMaxQuantity <em>Max Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Quantity</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#getMaxQuantity()
	 * @see #getConditionContext()
	 * @generated
	 */
	EAttribute getConditionContext_MaxQuantity();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.metric.ConditionContext#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see eu.paasage.camel.metric.ConditionContext#isIsRelative()
	 * @see #getConditionContext()
	 * @generated
	 */
	EAttribute getConditionContext_IsRelative();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.metric.MetricModel
	 * @generated
	 */
	EClass getMetricModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getContexts()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getMetrics()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getMetricInstances <em>Metric Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metric Instances</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getMetricInstances()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_MetricInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getConditions()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getProperties()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getBindings()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getWindows()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Windows();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getSchedules <em>Schedules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedules</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getSchedules()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Schedules();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getParameters()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getSensors()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.metric.MetricModel#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see eu.paasage.camel.metric.MetricModel#getUnits()
	 * @see #getMetricModel()
	 * @generated
	 */
	EReference getMetricModel_Units();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.MetricContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see eu.paasage.camel.metric.MetricContext
	 * @generated
	 */
	EClass getMetricContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricContext#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see eu.paasage.camel.metric.MetricContext#getMetric()
	 * @see #getMetricContext()
	 * @generated
	 */
	EReference getMetricContext_Metric();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricContext#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Window</em>'.
	 * @see eu.paasage.camel.metric.MetricContext#getWindow()
	 * @see #getMetricContext()
	 * @generated
	 */
	EReference getMetricContext_Window();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.MetricContext#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schedule</em>'.
	 * @see eu.paasage.camel.metric.MetricContext#getSchedule()
	 * @see #getMetricContext()
	 * @generated
	 */
	EReference getMetricContext_Schedule();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.CompositeMetricContext <em>Composite Metric Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Metric Context</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetricContext
	 * @generated
	 */
	EClass getCompositeMetricContext();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.metric.CompositeMetricContext#getComposingMetricContexts <em>Composing Metric Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composing Metric Contexts</em>'.
	 * @see eu.paasage.camel.metric.CompositeMetricContext#getComposingMetricContexts()
	 * @see #getCompositeMetricContext()
	 * @generated
	 */
	EReference getCompositeMetricContext_ComposingMetricContexts();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.RawMetricContext <em>Raw Metric Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Metric Context</em>'.
	 * @see eu.paasage.camel.metric.RawMetricContext
	 * @generated
	 */
	EClass getRawMetricContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.RawMetricContext#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see eu.paasage.camel.metric.RawMetricContext#getSensor()
	 * @see #getRawMetricContext()
	 * @generated
	 */
	EReference getRawMetricContext_Sensor();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.metric.PropertyContext <em>Property Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Context</em>'.
	 * @see eu.paasage.camel.metric.PropertyContext
	 * @generated
	 */
	EClass getPropertyContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.metric.PropertyContext#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see eu.paasage.camel.metric.PropertyContext#getProperty()
	 * @see #getPropertyContext()
	 * @generated
	 */
	EReference getPropertyContext_Property();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.ComparisonOperatorType <em>Comparison Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator Type</em>'.
	 * @see eu.paasage.camel.metric.ComparisonOperatorType
	 * @generated
	 */
	EEnum getComparisonOperatorType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.MetricFunctionArityType <em>Function Arity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Arity Type</em>'.
	 * @see eu.paasage.camel.metric.MetricFunctionArityType
	 * @generated
	 */
	EEnum getMetricFunctionArityType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.MetricFunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type</em>'.
	 * @see eu.paasage.camel.metric.MetricFunctionType
	 * @generated
	 */
	EEnum getMetricFunctionType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type</em>'.
	 * @see eu.paasage.camel.metric.PropertyType
	 * @generated
	 */
	EEnum getPropertyType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.ScheduleType <em>Schedule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Schedule Type</em>'.
	 * @see eu.paasage.camel.metric.ScheduleType
	 * @generated
	 */
	EEnum getScheduleType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.WindowSizeType <em>Window Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Window Size Type</em>'.
	 * @see eu.paasage.camel.metric.WindowSizeType
	 * @generated
	 */
	EEnum getWindowSizeType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.WindowType <em>Window Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Window Type</em>'.
	 * @see eu.paasage.camel.metric.WindowType
	 * @generated
	 */
	EEnum getWindowType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.QuantifierType <em>Quantifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier Type</em>'.
	 * @see eu.paasage.camel.metric.QuantifierType
	 * @generated
	 */
	EEnum getQuantifierType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.metric.FunctionPatternType <em>Function Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Pattern Type</em>'.
	 * @see eu.paasage.camel.metric.FunctionPatternType
	 * @generated
	 */
	EEnum getFunctionPatternType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricFactory getMetricFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.ConditionImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMPARISON_OPERATOR = eINSTANCE.getCondition_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__THRESHOLD = eINSTANCE.getCondition_Threshold();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALIDITY = eINSTANCE.getCondition_Validity();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricConditionImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricCondition()
		 * @generated
		 */
		EClass METRIC_CONDITION = eINSTANCE.getMetricCondition();

		/**
		 * The meta object literal for the '<em><b>Metric Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_CONDITION__METRIC_CONTEXT = eINSTANCE.getMetricCondition_MetricContext();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.PropertyConditionImpl <em>Property Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.PropertyConditionImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyCondition()
		 * @generated
		 */
		EClass PROPERTY_CONDITION = eINSTANCE.getPropertyCondition();

		/**
		 * The meta object literal for the '<em><b>Property Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONDITION__PROPERTY_CONTEXT = eINSTANCE.getPropertyCondition_PropertyContext();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONDITION__UNIT = eINSTANCE.getPropertyCondition_Unit();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONDITION__TIME_UNIT = eINSTANCE.getPropertyCondition_TimeUnit();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricInstanceImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricInstance()
		 * @generated
		 */
		EClass METRIC_INSTANCE = eINSTANCE.getMetricInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_INSTANCE__NAME = eINSTANCE.getMetricInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__METRIC = eINSTANCE.getMetricInstance_Metric();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__SCHEDULE = eINSTANCE.getMetricInstance_Schedule();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__WINDOW = eINSTANCE.getMetricInstance_Window();

		/**
		 * The meta object literal for the '<em><b>Object Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__OBJECT_BINDING = eINSTANCE.getMetricInstance_ObjectBinding();

		/**
		 * The meta object literal for the '<em><b>Metric Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__METRIC_CONTEXT = eINSTANCE.getMetricInstance_MetricContext();

		/**
		 * The meta object literal for the '<em><b>Check Recursiveness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = eINSTANCE.getMetricInstance__CheckRecursiveness__MetricInstance_MetricInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.CompositeMetricInstanceImpl <em>Composite Metric Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.CompositeMetricInstanceImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetricInstance()
		 * @generated
		 */
		EClass COMPOSITE_METRIC_INSTANCE = eINSTANCE.getCompositeMetricInstance();

		/**
		 * The meta object literal for the '<em><b>Composing Metric Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES = eINSTANCE.getCompositeMetricInstance_ComposingMetricInstances();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.RawMetricInstanceImpl <em>Raw Metric Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.RawMetricInstanceImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetricInstance()
		 * @generated
		 */
		EClass RAW_METRIC_INSTANCE = eINSTANCE.getRawMetricInstance();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_METRIC_INSTANCE__SENSOR = eINSTANCE.getRawMetricInstance_Sensor();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricFormulaParameterImpl <em>Formula Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricFormulaParameterImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFormulaParameter()
		 * @generated
		 */
		EClass METRIC_FORMULA_PARAMETER = eINSTANCE.getMetricFormulaParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_FORMULA_PARAMETER__NAME = eINSTANCE.getMetricFormulaParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_FORMULA_PARAMETER__VALUE = eINSTANCE.getMetricFormulaParameter_Value();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricFormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricFormulaImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFormula()
		 * @generated
		 */
		EClass METRIC_FORMULA = eINSTANCE.getMetricFormula();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_FORMULA__FUNCTION = eINSTANCE.getMetricFormula_Function();

		/**
		 * The meta object literal for the '<em><b>Function Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_FORMULA__FUNCTION_ARITY = eINSTANCE.getMetricFormula_FunctionArity();

		/**
		 * The meta object literal for the '<em><b>Function Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_FORMULA__FUNCTION_PATTERN = eINSTANCE.getMetricFormula_FunctionPattern();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_FORMULA__PARAMETERS = eINSTANCE.getMetricFormula_Parameters();

		/**
		 * The meta object literal for the '<em><b>Contains Metric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METRIC_FORMULA___CONTAINS_METRIC__METRIC = eINSTANCE.getMetricFormula__ContainsMetric__Metric();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__VALUE_TYPE = eINSTANCE.getMetric_ValueType();

		/**
		 * The meta object literal for the '<em><b>Value Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__VALUE_DIRECTION = eINSTANCE.getMetric_ValueDirection();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__UNIT = eINSTANCE.getMetric_Unit();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__LAYER = eINSTANCE.getMetric_Layer();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__PROPERTY = eINSTANCE.getMetric_Property();

		/**
		 * The meta object literal for the '<em><b>Check Recursiveness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = eINSTANCE.getMetric__CheckRecursiveness__Metric_Metric();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.CompositeMetricImpl <em>Composite Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.CompositeMetricImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetric()
		 * @generated
		 */
		EClass COMPOSITE_METRIC = eINSTANCE.getCompositeMetric();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_METRIC__FORMULA = eINSTANCE.getCompositeMetric_Formula();

		/**
		 * The meta object literal for the '<em><b>Greater Equal Than Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE = eINSTANCE.getCompositeMetric__GreaterEqualThanLayer__LayerType_LayerType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.RawMetricImpl <em>Raw Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.RawMetricImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetric()
		 * @generated
		 */
		EClass RAW_METRIC = eINSTANCE.getRawMetric();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricObjectBindingImpl <em>Object Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricObjectBindingImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricObjectBinding()
		 * @generated
		 */
		EClass METRIC_OBJECT_BINDING = eINSTANCE.getMetricObjectBinding();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_OBJECT_BINDING__NAME = eINSTANCE.getMetricObjectBinding_Name();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_OBJECT_BINDING__EXECUTION_CONTEXT = eINSTANCE.getMetricObjectBinding_ExecutionContext();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricApplicationBindingImpl <em>Application Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricApplicationBindingImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricApplicationBinding()
		 * @generated
		 */
		EClass METRIC_APPLICATION_BINDING = eINSTANCE.getMetricApplicationBinding();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricComponentBindingImpl <em>Component Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricComponentBindingImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricComponentBinding()
		 * @generated
		 */
		EClass METRIC_COMPONENT_BINDING = eINSTANCE.getMetricComponentBinding();

		/**
		 * The meta object literal for the '<em><b>Vm Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_COMPONENT_BINDING__VM_INSTANCE = eINSTANCE.getMetricComponentBinding_VmInstance();

		/**
		 * The meta object literal for the '<em><b>Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_COMPONENT_BINDING__COMPONENT_INSTANCE = eINSTANCE.getMetricComponentBinding_ComponentInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricVMBindingImpl <em>VM Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricVMBindingImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricVMBinding()
		 * @generated
		 */
		EClass METRIC_VM_BINDING = eINSTANCE.getMetricVMBinding();

		/**
		 * The meta object literal for the '<em><b>Vm Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_VM_BINDING__VM_INSTANCE = eINSTANCE.getMetricVMBinding_VmInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.PropertyImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Sub Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SUB_PROPERTIES = eINSTANCE.getProperty_SubProperties();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SENSORS = eINSTANCE.getProperty_Sensors();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.ScheduleImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__NAME = eINSTANCE.getSchedule_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__START = eINSTANCE.getSchedule_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__END = eINSTANCE.getSchedule_End();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__TYPE = eINSTANCE.getSchedule_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__UNIT = eINSTANCE.getSchedule_Unit();

		/**
		 * The meta object literal for the '<em><b>Repetitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__REPETITIONS = eINSTANCE.getSchedule_Repetitions();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__INTERVAL = eINSTANCE.getSchedule_Interval();

		/**
		 * The meta object literal for the '<em><b>Check Start End Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___CHECK_START_END_DATES__SCHEDULE = eINSTANCE.getSchedule__CheckStartEndDates__Schedule();

		/**
		 * The meta object literal for the '<em><b>Check Interval Repetitions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SCHEDULE___CHECK_INTERVAL_REPETITIONS__SCHEDULE = eINSTANCE.getSchedule__CheckIntervalRepetitions__Schedule();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.SensorImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__CONFIGURATION = eINSTANCE.getSensor_Configuration();

		/**
		 * The meta object literal for the '<em><b>Is Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__IS_PUSH = eINSTANCE.getSensor_IsPush();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.WindowImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__NAME = eINSTANCE.getWindow_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__UNIT = eINSTANCE.getWindow_Unit();

		/**
		 * The meta object literal for the '<em><b>Window Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__WINDOW_TYPE = eINSTANCE.getWindow_WindowType();

		/**
		 * The meta object literal for the '<em><b>Size Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__SIZE_TYPE = eINSTANCE.getWindow_SizeType();

		/**
		 * The meta object literal for the '<em><b>Measurement Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MEASUREMENT_SIZE = eINSTANCE.getWindow_MeasurementSize();

		/**
		 * The meta object literal for the '<em><b>Time Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TIME_SIZE = eINSTANCE.getWindow_TimeSize();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.ConditionContextImpl <em>Condition Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.ConditionContextImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getConditionContext()
		 * @generated
		 */
		EClass CONDITION_CONTEXT = eINSTANCE.getConditionContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CONTEXT__NAME = eINSTANCE.getConditionContext_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_CONTEXT__COMPONENT = eINSTANCE.getConditionContext_Component();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_CONTEXT__APPLICATION = eINSTANCE.getConditionContext_Application();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CONTEXT__QUANTIFIER = eINSTANCE.getConditionContext_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Min Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CONTEXT__MIN_QUANTITY = eINSTANCE.getConditionContext_MinQuantity();

		/**
		 * The meta object literal for the '<em><b>Max Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CONTEXT__MAX_QUANTITY = eINSTANCE.getConditionContext_MaxQuantity();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CONTEXT__IS_RELATIVE = eINSTANCE.getConditionContext_IsRelative();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricModelImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricModel()
		 * @generated
		 */
		EClass METRIC_MODEL = eINSTANCE.getMetricModel();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__CONTEXTS = eINSTANCE.getMetricModel_Contexts();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__METRICS = eINSTANCE.getMetricModel_Metrics();

		/**
		 * The meta object literal for the '<em><b>Metric Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__METRIC_INSTANCES = eINSTANCE.getMetricModel_MetricInstances();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__CONDITIONS = eINSTANCE.getMetricModel_Conditions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__PROPERTIES = eINSTANCE.getMetricModel_Properties();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__BINDINGS = eINSTANCE.getMetricModel_Bindings();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__WINDOWS = eINSTANCE.getMetricModel_Windows();

		/**
		 * The meta object literal for the '<em><b>Schedules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__SCHEDULES = eINSTANCE.getMetricModel_Schedules();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__PARAMETERS = eINSTANCE.getMetricModel_Parameters();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__SENSORS = eINSTANCE.getMetricModel_Sensors();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_MODEL__UNITS = eINSTANCE.getMetricModel_Units();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.MetricContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.MetricContextImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricContext()
		 * @generated
		 */
		EClass METRIC_CONTEXT = eINSTANCE.getMetricContext();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_CONTEXT__METRIC = eINSTANCE.getMetricContext_Metric();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_CONTEXT__WINDOW = eINSTANCE.getMetricContext_Window();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_CONTEXT__SCHEDULE = eINSTANCE.getMetricContext_Schedule();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.CompositeMetricContextImpl <em>Composite Metric Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.CompositeMetricContextImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getCompositeMetricContext()
		 * @generated
		 */
		EClass COMPOSITE_METRIC_CONTEXT = eINSTANCE.getCompositeMetricContext();

		/**
		 * The meta object literal for the '<em><b>Composing Metric Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_METRIC_CONTEXT__COMPOSING_METRIC_CONTEXTS = eINSTANCE.getCompositeMetricContext_ComposingMetricContexts();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.RawMetricContextImpl <em>Raw Metric Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.RawMetricContextImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getRawMetricContext()
		 * @generated
		 */
		EClass RAW_METRIC_CONTEXT = eINSTANCE.getRawMetricContext();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_METRIC_CONTEXT__SENSOR = eINSTANCE.getRawMetricContext_Sensor();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.impl.PropertyContextImpl <em>Property Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.impl.PropertyContextImpl
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyContext()
		 * @generated
		 */
		EClass PROPERTY_CONTEXT = eINSTANCE.getPropertyContext();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONTEXT__PROPERTY = eINSTANCE.getPropertyContext_Property();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.ComparisonOperatorType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getComparisonOperatorType()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR_TYPE = eINSTANCE.getComparisonOperatorType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.MetricFunctionArityType <em>Function Arity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.MetricFunctionArityType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFunctionArityType()
		 * @generated
		 */
		EEnum METRIC_FUNCTION_ARITY_TYPE = eINSTANCE.getMetricFunctionArityType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.MetricFunctionType <em>Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.MetricFunctionType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getMetricFunctionType()
		 * @generated
		 */
		EEnum METRIC_FUNCTION_TYPE = eINSTANCE.getMetricFunctionType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.PropertyType <em>Property Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.PropertyType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getPropertyType()
		 * @generated
		 */
		EEnum PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.ScheduleType <em>Schedule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.ScheduleType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getScheduleType()
		 * @generated
		 */
		EEnum SCHEDULE_TYPE = eINSTANCE.getScheduleType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.WindowSizeType <em>Window Size Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.WindowSizeType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindowSizeType()
		 * @generated
		 */
		EEnum WINDOW_SIZE_TYPE = eINSTANCE.getWindowSizeType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.WindowType <em>Window Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.WindowType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getWindowType()
		 * @generated
		 */
		EEnum WINDOW_TYPE = eINSTANCE.getWindowType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.QuantifierType <em>Quantifier Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.QuantifierType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getQuantifierType()
		 * @generated
		 */
		EEnum QUANTIFIER_TYPE = eINSTANCE.getQuantifierType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.metric.FunctionPatternType <em>Function Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.metric.FunctionPatternType
		 * @see eu.paasage.camel.metric.impl.MetricPackageImpl#getFunctionPatternType()
		 * @generated
		 */
		EEnum FUNCTION_PATTERN_TYPE = eINSTANCE.getFunctionPatternType();

	}

} //MetricPackage
