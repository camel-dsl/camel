/**
 */
package eu.paasage.camel.execution.util;

import eu.paasage.camel.execution.*;

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
 * @see eu.paasage.camel.execution.ExecutionPackage
 * @generated
 */
public class ExecutionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExecutionValidator INSTANCE = new ExecutionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.execution";

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
	public ExecutionValidator() {
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
	  return ExecutionPackage.eINSTANCE;
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
			case ExecutionPackage.EXECUTION_MODEL:
				return validateExecutionModel((ExecutionModel)value, diagnostics, context);
			case ExecutionPackage.ACTION_REALISATION:
				return validateActionRealisation((ActionRealisation)value, diagnostics, context);
			case ExecutionPackage.EXECUTION_CONTEXT:
				return validateExecutionContext((ExecutionContext)value, diagnostics, context);
			case ExecutionPackage.MEASUREMENT:
				return validateMeasurement((Measurement)value, diagnostics, context);
			case ExecutionPackage.APPLICATION_MEASUREMENT:
				return validateApplicationMeasurement((ApplicationMeasurement)value, diagnostics, context);
			case ExecutionPackage.INTERNAL_COMPONENT_MEASUREMENT:
				return validateInternalComponentMeasurement((InternalComponentMeasurement)value, diagnostics, context);
			case ExecutionPackage.COMMUNICATION_MEASUREMENT:
				return validateCommunicationMeasurement((CommunicationMeasurement)value, diagnostics, context);
			case ExecutionPackage.VM_MEASUREMENT:
				return validateVMMeasurement((VMMeasurement)value, diagnostics, context);
			case ExecutionPackage.SLO_ASSESSMENT:
				return validateSLOAssessment((SLOAssessment)value, diagnostics, context);
			case ExecutionPackage.RULE_TRIGGER:
				return validateRuleTrigger((RuleTrigger)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionModel(ExecutionModel executionModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)executionModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionRealisation(ActionRealisation actionRealisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)actionRealisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionContext(ExecutionContext executionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)executionContext, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionContext_execution_context_total_cost(executionContext, diagnostics, context);
		if (result || diagnostics != null) result &= validateExecutionContext_execution_context_unit_cost(executionContext, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the execution_context_total_cost constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXECUTION_CONTEXT__EXECUTION_CONTEXT_TOTAL_COST__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The total cost of execution context: ' + self.name +\n" +
		"\t\t\t\t' should be non-negative',\n" +
		"\tstatus : Boolean = self.totalCost >= 0\n" +
		"}.status";

	/**
	 * Validates the execution_context_total_cost constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionContext_execution_context_total_cost(ExecutionContext executionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.EXECUTION_CONTEXT,
				 executionContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "execution_context_total_cost",
				 EXECUTION_CONTEXT__EXECUTION_CONTEXT_TOTAL_COST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the execution_context_unit_cost constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EXECUTION_CONTEXT__EXECUTION_CONTEXT_UNIT_COST__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The unit of cost should be provided as the totalCost of execution context: '\n" +
		"\t\t\t\t+ self.name + ' is positive',\n" +
		"\tstatus : Boolean = self.totalCost > 0 implies costUnit <> null\n" +
		"}.status";

	/**
	 * Validates the execution_context_unit_cost constraint of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionContext_execution_context_unit_cost(ExecutionContext executionContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.EXECUTION_CONTEXT,
				 executionContext,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "execution_context_unit_cost",
				 EXECUTION_CONTEXT__EXECUTION_CONTEXT_UNIT_COST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)measurement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_slo_refer_to_correct_metric(measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_event_instance_same_metric(measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_correct_measurement_value(measurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_metric_refers_to_correct_execution_context(measurement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the measurement_slo_refer_to_correct_metric constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASUREMENT__MEASUREMENT_SLO_REFER_TO_CORRECT_METRIC__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Measurement: ' + self.name +\n" +
		"\t\t\t\t' should have a metric instance with a type that maps to the metric referred to by the the measurement\\'s respective SLO',\n" +
		"\tstatus : Boolean = self.slo\n" +
		"\t\t\t\t<> null implies (if (self.slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n" +
		"\t\t\t\tthen self.slo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric =\n" +
		"\t\t\t\t\tself.metricInstance.metric\n" +
		"\t\t\t\telse false\n" +
		"\t\t\t\tendif)\n" +
		"}.status";

	/**
	 * Validates the measurement_slo_refer_to_correct_metric constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement_measurement_slo_refer_to_correct_metric(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.MEASUREMENT,
				 measurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "measurement_slo_refer_to_correct_metric",
				 MEASUREMENT__MEASUREMENT_SLO_REFER_TO_CORRECT_METRIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the measurement_event_instance_same_metric constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASUREMENT__MEASUREMENT_EVENT_INSTANCE_SAME_METRIC__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Measurement: ' + self.name +\n" +
		"\t\t\t\t' maps to non-functional event instance : ' + eventInstance.toString() +\n" +
		"\t\t\t\t' with a type related to a metric different from the one of this measurement',\n" +
		"\tstatus : Boolean = (self.eventInstance <> null and\n" +
		"\t\t\t\tself.eventInstance.event.oclIsTypeOf(camel::scalability::NonFunctionalEvent)) implies self.metricInstance.metric =\n" +
		"\t\t\t\tself.eventInstance.event.oclAsType(camel::scalability::NonFunctionalEvent).metricCondition.metricContext.metric\n" +
		"}.status";

	/**
	 * Validates the measurement_event_instance_same_metric constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement_measurement_event_instance_same_metric(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.MEASUREMENT,
				 measurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "measurement_event_instance_same_metric",
				 MEASUREMENT__MEASUREMENT_EVENT_INSTANCE_SAME_METRIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the correct_measurement_value constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASUREMENT__CORRECT_MEASUREMENT_VALUE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Measurement: ' + self.name + ' has a value: ' + value.toString() +\n" +
		"\t\t\t\t' that is outside the range of values of metric instance: ' + metricInstance.name,\n" +
		"\tstatus : Boolean = let type :\n" +
		"\t\t\t\tcamel::type::ValueType = metricInstance.metric.valueType\n" +
		"\t\t\tin if (type <> null)\n" +
		"\t\t\t\tthen if (type.oclIsTypeOf(camel::type::Range))\n" +
		"\t\t\t\t\tthen type.oclAsType(camel::type::Range).includesValue(self.value)\n" +
		"\t\t\t\t\telse if (type.oclIsTypeOf(camel::type::RangeUnion))\n" +
		"\t\t\t\t\t\tthen type.oclAsType(camel::type::RangeUnion).includesValue(self.value)\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\telse true\n" +
		"\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the correct_measurement_value constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement_correct_measurement_value(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.MEASUREMENT,
				 measurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "correct_measurement_value",
				 MEASUREMENT__CORRECT_MEASUREMENT_VALUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the measurement_metric_refers_to_correct_execution_context constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEASUREMENT__MEASUREMENT_METRIC_REFERS_TO_CORRECT_EXECUTION_CONTEXT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Measurement: ' + self.name +\n" +
		"\t\t\t\t' has execution context:' + executionContext.name +\n" +
		"\t\t\t\t' which is different from the one of the binding of the respective metric instance:' +\n" +
		"\t\t\t\tmetricInstance.name,\n" +
		"\tstatus : Boolean = executionContext = metricInstance.objectBinding.executionContext\n" +
		"}.status";

	/**
	 * Validates the measurement_metric_refers_to_correct_execution_context constraint of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeasurement_measurement_metric_refers_to_correct_execution_context(Measurement measurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.MEASUREMENT,
				 measurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "measurement_metric_refers_to_correct_execution_context",
				 MEASUREMENT__MEASUREMENT_METRIC_REFERS_TO_CORRECT_EXECUTION_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationMeasurement(ApplicationMeasurement applicationMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)applicationMeasurement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_slo_refer_to_correct_metric(applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_event_instance_same_metric(applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_correct_measurement_value(applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_metric_refers_to_correct_execution_context(applicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplicationMeasurement_application_measurement_same_app(applicationMeasurement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the application_measurement_same_app constraint of '<em>Application Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String APPLICATION_MEASUREMENT__APPLICATION_MEASUREMENT_SAME_APP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ApplicationMeasurement: ' + self.name +\n" +
		"\t\t\t\t' has a different application from the one referenced by its execution context: ' +\n" +
		"\t\t\t\tself.executionContext.name,\n" +
		"\tstatus : Boolean = self.executionContext.application = self.application\n" +
		"}.status";

	/**
	 * Validates the application_measurement_same_app constraint of '<em>Application Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationMeasurement_application_measurement_same_app(ApplicationMeasurement applicationMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.APPLICATION_MEASUREMENT,
				 applicationMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "application_measurement_same_app",
				 APPLICATION_MEASUREMENT__APPLICATION_MEASUREMENT_SAME_APP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentMeasurement(InternalComponentMeasurement internalComponentMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)internalComponentMeasurement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_slo_refer_to_correct_metric(internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_event_instance_same_metric(internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_correct_measurement_value(internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_metric_refers_to_correct_execution_context(internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalComponentMeasurement_internal_component_measurement_metric_refer_to_same_component(internalComponentMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateInternalComponentMeasurement_internal_component_measurement_included_in_execution_context(internalComponentMeasurement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the internal_component_measurement_metric_refer_to_same_component constraint of '<em>Internal Component Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_MEASUREMENT_METRIC_REFER_TO_SAME_COMPONENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The ComponentInstance: ' +\n" +
		"\t\t\t\tinternalComponentInstance.name + ' of InternalComponentMeasurement: ' + self.name +\n" +
		"\t\t\t\t' is different from the one referenced by the binding of the respective metric instance: ' +\n" +
		"\t\t\t\tself.metricInstance.name,\n" +
		"\tstatus : Boolean = metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricComponentBinding) and\n" +
		"\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricComponentBinding).componentInstance =\n" +
		"\t\t\t\tinternalComponentInstance\n" +
		"}.status";

	/**
	 * Validates the internal_component_measurement_metric_refer_to_same_component constraint of '<em>Internal Component Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentMeasurement_internal_component_measurement_metric_refer_to_same_component(InternalComponentMeasurement internalComponentMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.INTERNAL_COMPONENT_MEASUREMENT,
				 internalComponentMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "internal_component_measurement_metric_refer_to_same_component",
				 INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_MEASUREMENT_METRIC_REFER_TO_SAME_COMPONENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the internal_component_measurement_included_in_execution_context constraint of '<em>Internal Component Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_MEASUREMENT_INCLUDED_IN_EXECUTION_CONTEXT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ComponentInstance: ' +\n" +
		"\t\t\t\tinternalComponentInstance.name + ' is not included in the deployment model of execution context: ' +\n" +
		"\t\t\t\tself.executionContext.name + ' for InternalComponentMeasurement: ' +\n" +
		"\t\t\t\tself.name,\n" +
		"\tstatus : Boolean = executionContext.deploymentModel.internalComponentInstances\n" +
		"\t\t\t\t->includes(internalComponentInstance)\n" +
		"}.status";

	/**
	 * Validates the internal_component_measurement_included_in_execution_context constraint of '<em>Internal Component Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInternalComponentMeasurement_internal_component_measurement_included_in_execution_context(InternalComponentMeasurement internalComponentMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.INTERNAL_COMPONENT_MEASUREMENT,
				 internalComponentMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "internal_component_measurement_included_in_execution_context",
				 INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_MEASUREMENT_INCLUDED_IN_EXECUTION_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMeasurement(CommunicationMeasurement communicationMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)communicationMeasurement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_slo_refer_to_correct_metric(communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_event_instance_same_metric(communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_correct_measurement_value(communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_metric_refers_to_correct_execution_context(communicationMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommunicationMeasurement_resource_coupling_measurement_diff_vm_instances(communicationMeasurement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resource_coupling_measurement_diff_vm_instances constraint of '<em>Communication Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMMUNICATION_MEASUREMENT__RESOURCE_COUPLING_MEASUREMENT_DIFF_VM_INSTANCES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The source: ' + sourceVMInstance.name +\n" +
		"\t\t\t\t' and destination: ' + destinationVMInstance.name + ' VM instances of ResourceCouplingMeasurement: ' + self.name +\n" +
		"\t\t\t\t' are either identical or not included in the deployment model of the respective execution context: ' +\n" +
		"\t\t\t\tself.executionContext.name,\n" +
		"\tstatus : Boolean = sourceVMInstance <> destinationVMInstance and\n" +
		"\t\t\t\t(executionContext.deploymentModel.vmInstances\n" +
		"\t\t\t\t->includes(sourceVMInstance)) and (executionContext.deploymentModel.vmInstances\n" +
		"\t\t\t\t->includes(destinationVMInstance))\n" +
		"}.status";

	/**
	 * Validates the resource_coupling_measurement_diff_vm_instances constraint of '<em>Communication Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationMeasurement_resource_coupling_measurement_diff_vm_instances(CommunicationMeasurement communicationMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.COMMUNICATION_MEASUREMENT,
				 communicationMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resource_coupling_measurement_diff_vm_instances",
				 COMMUNICATION_MEASUREMENT__RESOURCE_COUPLING_MEASUREMENT_DIFF_VM_INSTANCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMMeasurement(VMMeasurement vmMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)vmMeasurement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_slo_refer_to_correct_metric(vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_event_instance_same_metric(vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_correct_measurement_value(vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateMeasurement_measurement_metric_refers_to_correct_execution_context(vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVMMeasurement_resource_measurement_ec_deployment_model_vm_instance(vmMeasurement, diagnostics, context);
		if (result || diagnostics != null) result &= validateVMMeasurement_resource_measurement_metric_vm_instance(vmMeasurement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the resource_measurement_ec_deployment_model_vm_instance constraint of '<em>VM Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM_MEASUREMENT__RESOURCE_MEASUREMENT_EC_DEPLOYMENT_MODEL_VM_INSTANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The VMInstance: ' + vmInstance.name +\n" +
		"\t\t\t\t' of ResourceMeasurement: ' + self.name +\n" +
		"\t\t\t\t' is not included in the deployment model of the respective execution context: ' +\n" +
		"\t\t\t\tself.executionContext.name,\n" +
		"\tstatus : Boolean = vmInstance <> null implies (executionContext.deploymentModel.vmInstances\n" +
		"\t\t\t\t->includes(vmInstance))\n" +
		"}.status";

	/**
	 * Validates the resource_measurement_ec_deployment_model_vm_instance constraint of '<em>VM Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMMeasurement_resource_measurement_ec_deployment_model_vm_instance(VMMeasurement vmMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.VM_MEASUREMENT,
				 vmMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resource_measurement_ec_deployment_model_vm_instance",
				 VM_MEASUREMENT__RESOURCE_MEASUREMENT_EC_DEPLOYMENT_MODEL_VM_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the resource_measurement_metric_vm_instance constraint of '<em>VM Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VM_MEASUREMENT__RESOURCE_MEASUREMENT_METRIC_VM_INSTANCE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The binding of metric instance: ' + metricInstance.name +\n" +
		"\t\t\t\t' associated to ResourceMeasurement: ' + self.name +\n" +
		"\t\t\t\t' refers to a different VMInstance from the one related to this measurement',\n" +
		"\tstatus : Boolean = vmInstance <> null implies\n" +
		"\t\t\t\t(metricInstance.objectBinding.oclIsTypeOf(camel::metric::MetricVMBinding) and\n" +
		"\t\t\t\tmetricInstance.objectBinding.oclAsType(camel::metric::MetricVMBinding).vmInstance = vmInstance)\n" +
		"}.status";

	/**
	 * Validates the resource_measurement_metric_vm_instance constraint of '<em>VM Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVMMeasurement_resource_measurement_metric_vm_instance(VMMeasurement vmMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.VM_MEASUREMENT,
				 vmMeasurement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "resource_measurement_metric_vm_instance",
				 VM_MEASUREMENT__RESOURCE_MEASUREMENT_METRIC_VM_INSTANCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLOAssessment(SLOAssessment sloAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)sloAssessment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLOAssessment_slo_assessment_same_metric(sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLOAssessment_slo_assessment_slo_in_reqs_for_execution_context(sloAssessment, diagnostics, context);
		if (result || diagnostics != null) result &= validateSLOAssessment_slo_assessment_same_exec_context(sloAssessment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the slo_assessment_same_metric constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLO_ASSESSMENT__SLO_ASSESSMENT_SAME_METRIC__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The metric in slo: ' + slo.name + ' of SLOAssessment: ' + self.name +\n" +
		"\t\t\t\t' is not the same as the one referenced by the respective measurement: ' + measurement.name,\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t(slo.customServiceLevel.oclIsTypeOf(camel::metric::MetricCondition))\n" +
		"\t\t\t\tthen measurement.metricInstance.metric =\n" +
		"\t\t\t\t\tslo.customServiceLevel.oclAsType(camel::metric::MetricCondition).metricContext.metric\n" +
		"\t\t\t\telse false\n" +
		"\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the slo_assessment_same_metric constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLOAssessment_slo_assessment_same_metric(SLOAssessment sloAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.SLO_ASSESSMENT,
				 sloAssessment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "slo_assessment_same_metric",
				 SLO_ASSESSMENT__SLO_ASSESSMENT_SAME_METRIC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the slo_assessment_slo_in_reqs_for_execution_context constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLO_ASSESSMENT__SLO_ASSESSMENT_SLO_IN_REQS_FOR_EXECUTION_CONTEXT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'SLO: ' + self.slo.name +\n" +
		"\t\t\t\t' is not included in the requirement group of the respective execution context: ' + self.executionContext.name +\n" +
		"\t\t\t\t' of SLO Assessment: ' + self.name,\n" +
		"\tstatus : Boolean = self.executionContext.requirementGroup.requirements\n" +
		"\t\t\t\t->includes(self.slo)\n" +
		"}.status";

	/**
	 * Validates the slo_assessment_slo_in_reqs_for_execution_context constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLOAssessment_slo_assessment_slo_in_reqs_for_execution_context(SLOAssessment sloAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.SLO_ASSESSMENT,
				 sloAssessment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "slo_assessment_slo_in_reqs_for_execution_context",
				 SLO_ASSESSMENT__SLO_ASSESSMENT_SLO_IN_REQS_FOR_EXECUTION_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the slo_assessment_same_exec_context constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SLO_ASSESSMENT__SLO_ASSESSMENT_SAME_EXEC_CONTEXT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ExecutionContext: ' + executionContext.name + ' in SLOAssessment: ' +\n" +
		"\t\t\t\tself.name + ' is not the same as the one of the respective measurement: ' +\n" +
		"\t\t\t\tself.measurement.name,\n" +
		"\tstatus : Boolean = executionContext = measurement.executionContext\n" +
		"}.status";

	/**
	 * Validates the slo_assessment_same_exec_context constraint of '<em>SLO Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSLOAssessment_slo_assessment_same_exec_context(SLOAssessment sloAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.SLO_ASSESSMENT,
				 sloAssessment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "slo_assessment_same_exec_context",
				 SLO_ASSESSMENT__SLO_ASSESSMENT_SAME_EXEC_CONTEXT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleTrigger(RuleTrigger ruleTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)ruleTrigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuleTrigger_rule_trigger_event_instance_correct_events(ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuleTrigger_rule_trigger_correct_action(ruleTrigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateRuleTrigger_rule_trigger_scal_reqs_of_correct_dep_model(ruleTrigger, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the rule_trigger_event_instance_correct_events constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RULE_TRIGGER__RULE_TRIGGER_EVENT_INSTANCE_CORRECT_EVENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The eventInstances ' + ' of RuleTrigger: ' + self.name +\n" +
		"\t\t\t\t' do not correspond to the event(s) of the respective scalability rule: ' + self.scalabilityRule.name,\n" +
		"\tstatus : Boolean = if\n" +
		"\t\t\t\t\t(self.scalabilityRule.event.oclIsKindOf(camel::scalability::SimpleEvent))\n" +
		"\t\t\t\tthen (self.eventInstances\n" +
		"\t\t\t\t\t->size() = 1 and self.eventInstances\n" +
		"\t\t\t\t\t->exists(p | p.event.oclAsType(camel::scalability::SimpleEvent) =\n" +
		"\t\t\t\t\t\tself.scalabilityRule.event.oclAsType(camel::scalability::SimpleEvent)))\n" +
		"\t\t\t\telse self.eventInstances\n" +
		"\t\t\t\t\t->forAll(p | self.scalabilityRule.event.oclAsType(camel::scalability::EventPattern).includesEvent(p.event))\n" +
		"\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the rule_trigger_event_instance_correct_events constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleTrigger_rule_trigger_event_instance_correct_events(RuleTrigger ruleTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.RULE_TRIGGER,
				 ruleTrigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rule_trigger_event_instance_correct_events",
				 RULE_TRIGGER__RULE_TRIGGER_EVENT_INSTANCE_CORRECT_EVENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rule_trigger_correct_action constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RULE_TRIGGER__RULE_TRIGGER_CORRECT_ACTION__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Either the size of action realizations for RuleTrigger: ' + self.name +\n" +
		"\t\t\t\t' is not the same as the one corresponding to the actions of the respective scalability rule: ' +\n" +
		"\t\t\t\tself.scalabilityRule.name +\n" +
		"\t\t\t\t' or there is an action realization mapping to an action not contained in the action list of the trigger\\'s scalability rule',\n" +
		"\tstatus : Boolean = (self.actionRealisations\n" +
		"\t\t\t\t->size() = self.scalabilityRule.actions\n" +
		"\t\t\t\t->size()) and (self.actionRealisations\n" +
		"\t\t\t\t->forAll(p | self.scalabilityRule.actions\n" +
		"\t\t\t\t\t->exists(q | q = p.action)))\n" +
		"}.status";

	/**
	 * Validates the rule_trigger_correct_action constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleTrigger_rule_trigger_correct_action(RuleTrigger ruleTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.RULE_TRIGGER,
				 ruleTrigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rule_trigger_correct_action",
				 RULE_TRIGGER__RULE_TRIGGER_CORRECT_ACTION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rule_trigger_scal_reqs_of_correct_dep_model constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RULE_TRIGGER__RULE_TRIGGER_SCAL_REQS_OF_CORRECT_DEP_MODEL__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There is a scale requirements for the scalability rule: ' +\n" +
		"\t\t\t\tself.scalabilityRule.name + ' of RuleTrigger: ' + self.name +\n" +
		"\t\t\t\t' with a component or vm not included in the deployment model of the trigger\\'s respective execution context: ' +\n" +
		"\t\t\t\tself.executionContext.name,\n" +
		"\tstatus : Boolean = scalabilityRule.scaleRequirements\n" +
		"\t\t\t\t->forAll(p | if (p.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement) and\n" +
		"\t\t\t\t\t\tp.oclAsType(camel::requirement::HorizontalScaleRequirement).component <> null)\n" +
		"\t\t\t\t\tthen (executionContext.deploymentModel.internalComponents\n" +
		"\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::HorizontalScaleRequirement).component))\n" +
		"\t\t\t\t\telse if (p.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) and\n" +
		"\t\t\t\t\t\t\tp.oclAsType(camel::requirement::VerticalScaleRequirement).vm <> null)\n" +
		"\t\t\t\t\t\tthen (executionContext.deploymentModel.vms\n" +
		"\t\t\t\t\t\t\t->includes(p.oclAsType(camel::requirement::VerticalScaleRequirement).vm))\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\tendif)\n" +
		"}.status";

	/**
	 * Validates the rule_trigger_scal_reqs_of_correct_dep_model constraint of '<em>Rule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuleTrigger_rule_trigger_scal_reqs_of_correct_dep_model(RuleTrigger ruleTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ExecutionPackage.Literals.RULE_TRIGGER,
				 ruleTrigger,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rule_trigger_scal_reqs_of_correct_dep_model",
				 RULE_TRIGGER__RULE_TRIGGER_SCAL_REQS_OF_CORRECT_DEP_MODEL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
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

} //ExecutionValidator
