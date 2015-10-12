/**
 */
package eu.paasage.camel.metric.impl;

import eu.paasage.camel.metric.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricFactoryImpl extends EFactoryImpl implements MetricFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricFactory init() {
		try {
			MetricFactory theMetricFactory = (MetricFactory)EPackage.Registry.INSTANCE.getEFactory(MetricPackage.eNS_URI);
			if (theMetricFactory != null) {
				return theMetricFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetricPackage.METRIC_CONDITION: return (EObject)createMetricCondition();
			case MetricPackage.PROPERTY_CONDITION: return (EObject)createPropertyCondition();
			case MetricPackage.COMPOSITE_METRIC_INSTANCE: return (EObject)createCompositeMetricInstance();
			case MetricPackage.RAW_METRIC_INSTANCE: return (EObject)createRawMetricInstance();
			case MetricPackage.METRIC_FORMULA_PARAMETER: return (EObject)createMetricFormulaParameter();
			case MetricPackage.METRIC_FORMULA: return (EObject)createMetricFormula();
			case MetricPackage.COMPOSITE_METRIC: return (EObject)createCompositeMetric();
			case MetricPackage.RAW_METRIC: return (EObject)createRawMetric();
			case MetricPackage.METRIC_APPLICATION_BINDING: return (EObject)createMetricApplicationBinding();
			case MetricPackage.METRIC_COMPONENT_BINDING: return (EObject)createMetricComponentBinding();
			case MetricPackage.METRIC_VM_BINDING: return (EObject)createMetricVMBinding();
			case MetricPackage.PROPERTY: return (EObject)createProperty();
			case MetricPackage.SCHEDULE: return (EObject)createSchedule();
			case MetricPackage.SENSOR: return (EObject)createSensor();
			case MetricPackage.WINDOW: return (EObject)createWindow();
			case MetricPackage.METRIC_MODEL: return (EObject)createMetricModel();
			case MetricPackage.COMPOSITE_METRIC_CONTEXT: return (EObject)createCompositeMetricContext();
			case MetricPackage.RAW_METRIC_CONTEXT: return (EObject)createRawMetricContext();
			case MetricPackage.PROPERTY_CONTEXT: return (EObject)createPropertyContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetricPackage.COMPARISON_OPERATOR_TYPE:
				return createComparisonOperatorTypeFromString(eDataType, initialValue);
			case MetricPackage.METRIC_FUNCTION_ARITY_TYPE:
				return createMetricFunctionArityTypeFromString(eDataType, initialValue);
			case MetricPackage.METRIC_FUNCTION_TYPE:
				return createMetricFunctionTypeFromString(eDataType, initialValue);
			case MetricPackage.PROPERTY_TYPE:
				return createPropertyTypeFromString(eDataType, initialValue);
			case MetricPackage.SCHEDULE_TYPE:
				return createScheduleTypeFromString(eDataType, initialValue);
			case MetricPackage.WINDOW_SIZE_TYPE:
				return createWindowSizeTypeFromString(eDataType, initialValue);
			case MetricPackage.WINDOW_TYPE:
				return createWindowTypeFromString(eDataType, initialValue);
			case MetricPackage.QUANTIFIER_TYPE:
				return createQuantifierTypeFromString(eDataType, initialValue);
			case MetricPackage.FUNCTION_PATTERN_TYPE:
				return createFunctionPatternTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetricPackage.COMPARISON_OPERATOR_TYPE:
				return convertComparisonOperatorTypeToString(eDataType, instanceValue);
			case MetricPackage.METRIC_FUNCTION_ARITY_TYPE:
				return convertMetricFunctionArityTypeToString(eDataType, instanceValue);
			case MetricPackage.METRIC_FUNCTION_TYPE:
				return convertMetricFunctionTypeToString(eDataType, instanceValue);
			case MetricPackage.PROPERTY_TYPE:
				return convertPropertyTypeToString(eDataType, instanceValue);
			case MetricPackage.SCHEDULE_TYPE:
				return convertScheduleTypeToString(eDataType, instanceValue);
			case MetricPackage.WINDOW_SIZE_TYPE:
				return convertWindowSizeTypeToString(eDataType, instanceValue);
			case MetricPackage.WINDOW_TYPE:
				return convertWindowTypeToString(eDataType, instanceValue);
			case MetricPackage.QUANTIFIER_TYPE:
				return convertQuantifierTypeToString(eDataType, instanceValue);
			case MetricPackage.FUNCTION_PATTERN_TYPE:
				return convertFunctionPatternTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricCondition createMetricCondition() {
		MetricConditionImpl metricCondition = new MetricConditionImpl();
		return metricCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCondition createPropertyCondition() {
		PropertyConditionImpl propertyCondition = new PropertyConditionImpl();
		return propertyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMetricInstance createCompositeMetricInstance() {
		CompositeMetricInstanceImpl compositeMetricInstance = new CompositeMetricInstanceImpl();
		return compositeMetricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawMetricInstance createRawMetricInstance() {
		RawMetricInstanceImpl rawMetricInstance = new RawMetricInstanceImpl();
		return rawMetricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFormulaParameter createMetricFormulaParameter() {
		MetricFormulaParameterImpl metricFormulaParameter = new MetricFormulaParameterImpl();
		return metricFormulaParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFormula createMetricFormula() {
		MetricFormulaImpl metricFormula = new MetricFormulaImpl();
		return metricFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMetric createCompositeMetric() {
		CompositeMetricImpl compositeMetric = new CompositeMetricImpl();
		return compositeMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawMetric createRawMetric() {
		RawMetricImpl rawMetric = new RawMetricImpl();
		return rawMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricApplicationBinding createMetricApplicationBinding() {
		MetricApplicationBindingImpl metricApplicationBinding = new MetricApplicationBindingImpl();
		return metricApplicationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricComponentBinding createMetricComponentBinding() {
		MetricComponentBindingImpl metricComponentBinding = new MetricComponentBindingImpl();
		return metricComponentBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricVMBinding createMetricVMBinding() {
		MetricVMBindingImpl metricVMBinding = new MetricVMBindingImpl();
		return metricVMBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricModel createMetricModel() {
		MetricModelImpl metricModel = new MetricModelImpl();
		return metricModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeMetricContext createCompositeMetricContext() {
		CompositeMetricContextImpl compositeMetricContext = new CompositeMetricContextImpl();
		return compositeMetricContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawMetricContext createRawMetricContext() {
		RawMetricContextImpl rawMetricContext = new RawMetricContextImpl();
		return rawMetricContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyContext createPropertyContext() {
		PropertyContextImpl propertyContext = new PropertyContextImpl();
		return propertyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType createComparisonOperatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorType result = ComparisonOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFunctionArityType createMetricFunctionArityTypeFromString(EDataType eDataType, String initialValue) {
		MetricFunctionArityType result = MetricFunctionArityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricFunctionArityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricFunctionType createMetricFunctionTypeFromString(EDataType eDataType, String initialValue) {
		MetricFunctionType result = MetricFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyTypeFromString(EDataType eDataType, String initialValue) {
		PropertyType result = PropertyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType createScheduleTypeFromString(EDataType eDataType, String initialValue) {
		ScheduleType result = ScheduleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScheduleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSizeType createWindowSizeTypeFromString(EDataType eDataType, String initialValue) {
		WindowSizeType result = WindowSizeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowType createWindowTypeFromString(EDataType eDataType, String initialValue) {
		WindowType result = WindowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifierType createQuantifierTypeFromString(EDataType eDataType, String initialValue) {
		QuantifierType result = QuantifierType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionPatternType createFunctionPatternTypeFromString(EDataType eDataType, String initialValue) {
		FunctionPatternType result = FunctionPatternType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricPackage getMetricPackage() {
		return (MetricPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricPackage getPackage() {
		return MetricPackage.eINSTANCE;
	}

} //MetricFactoryImpl
