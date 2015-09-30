/**
 */
package eu.paasage.camel.scalability.util;

import eu.paasage.camel.scalability.*;

import eu.paasage.camel.util.CamelValidator;

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
 * @see eu.paasage.camel.scalability.ScalabilityPackage
 * @generated
 */
public class ScalabilityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ScalabilityValidator INSTANCE = new ScalabilityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.scalability";

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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamelValidator camelValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalabilityValidator() {
		super();
		camelValidator = CamelValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ScalabilityPackage.eINSTANCE;
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
			case ScalabilityPackage.SCALABILITY_MODEL:
				return validateScalabilityModel((ScalabilityModel)value, diagnostics, context);
			case ScalabilityPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case ScalabilityPackage.EVENT_PATTERN:
				return validateEventPattern((EventPattern)value, diagnostics, context);
			case ScalabilityPackage.BINARY_EVENT_PATTERN:
				return validateBinaryEventPattern((BinaryEventPattern)value, diagnostics, context);
			case ScalabilityPackage.UNARY_EVENT_PATTERN:
				return validateUnaryEventPattern((UnaryEventPattern)value, diagnostics, context);
			case ScalabilityPackage.SIMPLE_EVENT:
				return validateSimpleEvent((SimpleEvent)value, diagnostics, context);
			case ScalabilityPackage.FUNCTIONAL_EVENT:
				return validateFunctionalEvent((FunctionalEvent)value, diagnostics, context);
			case ScalabilityPackage.NON_FUNCTIONAL_EVENT:
				return validateNonFunctionalEvent((NonFunctionalEvent)value, diagnostics, context);
			case ScalabilityPackage.EVENT_INSTANCE:
				return validateEventInstance((EventInstance)value, diagnostics, context);
			case ScalabilityPackage.SCALABILITY_RULE:
				return validateScalabilityRule((ScalabilityRule)value, diagnostics, context);
			case ScalabilityPackage.SCALING_ACTION:
				return validateScalingAction((ScalingAction)value, diagnostics, context);
			case ScalabilityPackage.HORIZONTAL_SCALING_ACTION:
				return validateHorizontalScalingAction((HorizontalScalingAction)value, diagnostics, context);
			case ScalabilityPackage.VERTICAL_SCALING_ACTION:
				return validateVerticalScalingAction((VerticalScalingAction)value, diagnostics, context);
			case ScalabilityPackage.TIMER:
				return validateTimer((Timer)value, diagnostics, context);
			case ScalabilityPackage.BINARY_PATTERN_OPERATOR_TYPE:
				return validateBinaryPatternOperatorType((BinaryPatternOperatorType)value, diagnostics, context);
			case ScalabilityPackage.TIMER_TYPE:
				return validateTimerType((TimerType)value, diagnostics, context);
			case ScalabilityPackage.UNARY_PATTERN_OPERATOR_TYPE:
				return validateUnaryPatternOperatorType((UnaryPatternOperatorType)value, diagnostics, context);
			case ScalabilityPackage.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalabilityModel(ScalabilityModel scalabilityModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)scalabilityModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)event, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventPattern(EventPattern eventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)eventPattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEventPattern(BinaryEventPattern binaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)binaryEventPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryEventPattern_binary_event_pattern_at_least_left_right(binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryEventPattern_binary_event_pattern_timer_one_event(binaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateBinaryEventPattern_binary_event_pattern_occur_bounds(binaryEventPattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the binary_event_pattern_at_least_left_right constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_AT_LEAST_LEFT_RIGHT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In BinaryEventPattern: ' + self.name +\n" +
		"\t\t\t\t\t' no left or right event has been specified',\n" +
		"\tstatus : Boolean = self.leftEvent <> null or self.rightEvent <> null\n" +
		"}.status";

	/**
	 * Validates the binary_event_pattern_at_least_left_right constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEventPattern_binary_event_pattern_at_least_left_right(BinaryEventPattern binaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN,
				 binaryEventPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "binary_event_pattern_at_least_left_right",
				 BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_AT_LEAST_LEFT_RIGHT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the binary_event_pattern_timer_one_event constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_TIMER_ONE_EVENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In BinaryEventPattern: ' + self.name +\n" +
		"\t\t\t\t\t' both a timer as well as left and right events have been specified',\n" +
		"\tstatus : Boolean = self.oclAsType(EventPattern).timer <> null\n" +
		"\t\t\t\t\timplies (self.leftEvent = null or self.rightEvent = null)\n" +
		"}.status";

	/**
	 * Validates the binary_event_pattern_timer_one_event constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEventPattern_binary_event_pattern_timer_one_event(BinaryEventPattern binaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN,
				 binaryEventPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "binary_event_pattern_timer_one_event",
				 BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_TIMER_ONE_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the binary_event_pattern_occur_bounds constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_OCCUR_BOUNDS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In BinaryEventPattern: ' + self.name +\n" +
		"\t\t\t\t\t' incorrect values were given for the lowerOccurrenceBound and upperOccurrenceBound attributes in conjunction with the use of the respective pattern operator: '\n" +
		"\t\t\t\t\t+ operator.toString(),\n" +
		"\tstatus : Boolean = (self.operator <> BinaryPatternOperatorType::REPEAT_UNTIL implies\n" +
		"\t\t\t\t\t(self.lowerOccurrenceBound = 0 and self.upperOccurrenceBound = 0)) and (self.operator =\n" +
		"\t\t\t\t\tBinaryPatternOperatorType::REPEAT_UNTIL and self.lowerOccurrenceBound >= 0 and self.upperOccurrenceBound > 0\n" +
		"\t\t\t\t\timplies self.lowerOccurrenceBound <= upperOccurrenceBound)\n" +
		"}.status";

	/**
	 * Validates the binary_event_pattern_occur_bounds constraint of '<em>Binary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryEventPattern_binary_event_pattern_occur_bounds(BinaryEventPattern binaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.BINARY_EVENT_PATTERN,
				 binaryEventPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "binary_event_pattern_occur_bounds",
				 BINARY_EVENT_PATTERN__BINARY_EVENT_PATTERN_OCCUR_BOUNDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryEventPattern(UnaryEventPattern unaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)unaryEventPattern, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)unaryEventPattern, diagnostics, context);
		if (result || diagnostics != null) result &= validateUnaryEventPattern_unary_event_pattern_correct_values_per_operator(unaryEventPattern, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the unary_event_pattern_correct_values_per_operator constraint of '<em>Unary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UNARY_EVENT_PATTERN__UNARY_EVENT_PATTERN_CORRECT_VALUES_PER_OPERATOR__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In UnaryEventPattern: ' + self.name +\n" +
		"\t\t\t\t\t' either a REPEAT operator there is an incorrect combination of values of the operator and occurrenceNum attributes and of the timer association. When operator is REPEAT, occurrenceNum should be positive; otherwise, equal to zero. When operator is WHERE, then a timer must be specified; otherwise, no timer should be specified',\n" +
		"\tstatus : Boolean = (self.operator\n" +
		"\t\t\t\t\t= UnaryPatternOperatorType::REPEAT implies occurrenceNum > 0) and (self.operator <>\n" +
		"\t\t\t\t\tUnaryPatternOperatorType::REPEAT implies occurrenceNum = 0) and (self.operator = UnaryPatternOperatorType::WHEN\n" +
		"\t\t\t\t\timplies self.oclAsType(EventPattern).timer <> null) and (self.operator <> UnaryPatternOperatorType::WHEN implies\n" +
		"\t\t\t\t\tself.oclAsType(EventPattern).timer = null)\n" +
		"}.status";

	/**
	 * Validates the unary_event_pattern_correct_values_per_operator constraint of '<em>Unary Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryEventPattern_unary_event_pattern_correct_values_per_operator(UnaryEventPattern unaryEventPattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.UNARY_EVENT_PATTERN,
				 unaryEventPattern,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "unary_event_pattern_correct_values_per_operator",
				 UNARY_EVENT_PATTERN__UNARY_EVENT_PATTERN_CORRECT_VALUES_PER_OPERATOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleEvent(SimpleEvent simpleEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)simpleEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalEvent(FunctionalEvent functionalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)functionalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonFunctionalEvent(NonFunctionalEvent nonFunctionalEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)nonFunctionalEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventInstance(EventInstance eventInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)eventInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateEventInstance_event_instance_same_layer_of_metric_as_in_event(eventInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateEventInstance_event_instance_metric_in_event(eventInstance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the event_instance_same_layer_of_metric_as_in_event constraint of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT_INSTANCE__EVENT_INSTANCE_SAME_LAYER_OF_METRIC_AS_IN_EVENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'EventInstance: ' + self.name +\n" +
		"\t\t\t\t\t' does not map to the same layer as the one designated by the metric referenced by the instance\\'s respective event:'\n" +
		"\t\t\t\t\t+ self.event.name,\n" +
		"\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n" +
		"\t\t\t\t\tthen self.equalLayer(self.layer,\n" +
		"\t\t\t\t\t\t\tself.event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric.layer)\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the event_instance_same_layer_of_metric_as_in_event constraint of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventInstance_event_instance_same_layer_of_metric_as_in_event(EventInstance eventInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.EVENT_INSTANCE,
				 eventInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "event_instance_same_layer_of_metric_as_in_event",
				 EVENT_INSTANCE__EVENT_INSTANCE_SAME_LAYER_OF_METRIC_AS_IN_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the event_instance_metric_in_event constraint of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT_INSTANCE__EVENT_INSTANCE_METRIC_IN_EVENT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'EventInstance: ' + self.name +\n" +
		"\t\t\t\t\t' has a metric instance with a metric which is not identical to the one associated to the event instance\\'s event: '\n" +
		"\t\t\t\t\t+ self.event.name,\n" +
		"\tstatus : Boolean = if (self.event.oclIsTypeOf(NonFunctionalEvent))\n" +
		"\t\t\t\t\tthen metricInstance.metric = event.oclAsType(NonFunctionalEvent).metricCondition.metricContext.metric\n" +
		"\t\t\t\t\telse true\n" +
		"\t\t\t\t\tendif\n" +
		"}.status";

	/**
	 * Validates the event_instance_metric_in_event constraint of '<em>Event Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventInstance_event_instance_metric_in_event(EventInstance eventInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.EVENT_INSTANCE,
				 eventInstance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "event_instance_metric_in_event",
				 EVENT_INSTANCE__EVENT_INSTANCE_METRIC_IN_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalabilityRule(ScalabilityRule scalabilityRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scalabilityRule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalabilityRule_scal_rule_horiz_req_count(scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalabilityRule_scal_rule_vert_req_correct_vals(scalabilityRule, diagnostics, context);
		if (result || diagnostics != null) result &= validateScalabilityRule_scal_rule_no_conficting_reqs(scalabilityRule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the scal_rule_horiz_req_count constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCALABILITY_RULE__SCAL_RULE_HORIZ_REQ_COUNT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In ScalabilityRule: ' + self.name +\n" +
		"\t\t\t\t\t' there is a HorizontalScalingAction which conflicts with a rule\\'s respective HorizontalScaleRequirement',\n" +
		"\tstatus : Boolean = self.actions\n" +
		"\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(HorizontalScalingAction) and p.oclAsType(HorizontalScalingAction).count > 0 and\n" +
		"\t\t\t\t\t\t(p.type = camel::ActionType::SCALE_IN or p.type = camel::ActionType::SCALE_OUT and self.scaleRequirements\n" +
		"\t\t\t\t\t\t->exists(q | q.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))) implies self.scaleRequirements\n" +
		"\t\t\t\t\t\t->forAll(t | if (t.oclIsTypeOf(camel::requirement::HorizontalScaleRequirement))\n" +
		"\t\t\t\t\t\t\tthen (t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances = - 1 or\n" +
		"\t\t\t\t\t\t\t\tp.oclAsType(HorizontalScalingAction).count <=\n" +
		"\t\t\t\t\t\t\t\t(t.oclAsType(camel::requirement::HorizontalScaleRequirement).maxInstances -\n" +
		"\t\t\t\t\t\t\t\tt.oclAsType(camel::requirement::HorizontalScaleRequirement).minInstances))\n" +
		"\t\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\t\tendif)))\n" +
		"}.status";

	/**
	 * Validates the scal_rule_horiz_req_count constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalabilityRule_scal_rule_horiz_req_count(ScalabilityRule scalabilityRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.SCALABILITY_RULE,
				 scalabilityRule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "scal_rule_horiz_req_count",
				 SCALABILITY_RULE__SCAL_RULE_HORIZ_REQ_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the scal_rule_vert_req_correct_vals constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCALABILITY_RULE__SCAL_RULE_VERT_REQ_CORRECT_VALS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In ScalabilityRule: ' + self.name +\n" +
		"\t\t\t\t\t' there is a VerticalScalingAction which conflicts with a rule\\'s respective VerticalScaleRequirement',\n" +
		"\tstatus : Boolean = self.actions\n" +
		"\t\t\t\t\t->forAll(p | (p.oclIsTypeOf(VerticalScalingAction) and (p.type = camel::ActionType::SCALE_UP or p.type =\n" +
		"\t\t\t\t\t\tcamel::ActionType::SCALE_DOWN and self.scaleRequirements\n" +
		"\t\t\t\t\t\t->exists(t | t.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))) implies self.scaleRequirements\n" +
		"\t\t\t\t\t\t->forAll(q | q.oclIsTypeOf(camel::requirement::VerticalScaleRequirement) implies\n" +
		"\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).coreUpdate > 0) implies\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores = - 1 or\n" +
		"\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).coreUpdate <=\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCores -\n" +
		"\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCores))) and\n" +
		"\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).storageUpdate > 0) implies\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage = - 1 or\n" +
		"\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).storageUpdate <=\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxStorage -\n" +
		"\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minStorage))) and\n" +
		"\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).CPUUpdate > 0) implies\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU = - 1 or\n" +
		"\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).CPUUpdate <=\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxCPU -\n" +
		"\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minCPU))) and\n" +
		"\t\t\t\t\t\t\t((p.oclAsType(VerticalScalingAction).memoryUpdate > 0) implies\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM = - 1 or\n" +
		"\t\t\t\t\t\t\tp.oclAsType(VerticalScalingAction).memoryUpdate <=\n" +
		"\t\t\t\t\t\t\t(q.oclAsType(camel::requirement::VerticalScaleRequirement).maxRAM -\n" +
		"\t\t\t\t\t\t\tq.oclAsType(camel::requirement::VerticalScaleRequirement).minRAM))))))\n" +
		"}.status";

	/**
	 * Validates the scal_rule_vert_req_correct_vals constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalabilityRule_scal_rule_vert_req_correct_vals(ScalabilityRule scalabilityRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.SCALABILITY_RULE,
				 scalabilityRule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "scal_rule_vert_req_correct_vals",
				 SCALABILITY_RULE__SCAL_RULE_VERT_REQ_CORRECT_VALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the scal_rule_no_conficting_reqs constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCALABILITY_RULE__SCAL_RULE_NO_CONFICTING_REQS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'In ScalabilityRule: ' + self.name +\n" +
		"\t\t\t\t\t' there is a pair of vertical or horizontal scale requirements that are conflicting, where conflicting means that they concern the same vm or component, respectively',\n" +
		"\tstatus : Boolean = self.scaleRequirements\n" +
		"\t\t\t\t\t->forAll(p1, p2 | if (p1 <> p2 and p1.oclType() = p2.oclType())\n" +
		"\t\t\t\t\t\tthen if (p1.oclIsTypeOf(camel::requirement::VerticalScaleRequirement))\n" +
		"\t\t\t\t\t\t\tthen p1.oclAsType(camel::requirement::VerticalScaleRequirement).vm <>\n" +
		"\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::VerticalScaleRequirement).vm\n" +
		"\t\t\t\t\t\t\telse p1.oclAsType(camel::requirement::HorizontalScaleRequirement).component <>\n" +
		"\t\t\t\t\t\t\t\tp2.oclAsType(camel::requirement::HorizontalScaleRequirement).component\n" +
		"\t\t\t\t\t\t\tendif\n" +
		"\t\t\t\t\t\telse true\n" +
		"\t\t\t\t\t\tendif)\n" +
		"}.status";

	/**
	 * Validates the scal_rule_no_conficting_reqs constraint of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalabilityRule_scal_rule_no_conficting_reqs(ScalabilityRule scalabilityRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.SCALABILITY_RULE,
				 scalabilityRule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "scal_rule_no_conficting_reqs",
				 SCALABILITY_RULE__SCAL_RULE_NO_CONFICTING_REQS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingAction(ScalingAction scalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)scalingAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)scalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= camelValidator.validateAction_correct_action_type(scalingAction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalScalingAction(HorizontalScalingAction horizontalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)horizontalScalingAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= camelValidator.validateAction_correct_action_type(horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateHorizontalScalingAction_horizontal_scale_action_correct_count(horizontalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateHorizontalScalingAction_horizontal_scale_action_correct_type(horizontalScalingAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the horizontal_scale_action_correct_count constraint of '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HORIZONTAL_SCALING_ACTION__HORIZONTAL_SCALE_ACTION_CORRECT_COUNT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'HorizontalScalingAction: ' + self.name +\n" +
		"\t\t\t\t\t' has a wrong (negative) value for the count attribute',\n" +
		"\tstatus : Boolean = count >= 0\n" +
		"}.status";

	/**
	 * Validates the horizontal_scale_action_correct_count constraint of '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalScalingAction_horizontal_scale_action_correct_count(HorizontalScalingAction horizontalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION,
				 horizontalScalingAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "horizontal_scale_action_correct_count",
				 HORIZONTAL_SCALING_ACTION__HORIZONTAL_SCALE_ACTION_CORRECT_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the horizontal_scale_action_correct_type constraint of '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HORIZONTAL_SCALING_ACTION__HORIZONTAL_SCALE_ACTION_CORRECT_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'HorizontalScalingAction: ' + self.name + ' has a wrong type (' +\n" +
		"\t\t\t\t\tself.type.toString() + '). It should be either SCALE_IN or SCALE_OUT',\n" +
		"\tstatus : Boolean = (self.type = camel::ActionType::SCALE_IN)\n" +
		"\t\t\t\t\tor (self.type = camel::ActionType::SCALE_OUT)\n" +
		"}.status";

	/**
	 * Validates the horizontal_scale_action_correct_type constraint of '<em>Horizontal Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalScalingAction_horizontal_scale_action_correct_type(HorizontalScalingAction horizontalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.HORIZONTAL_SCALING_ACTION,
				 horizontalScalingAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "horizontal_scale_action_correct_type",
				 HORIZONTAL_SCALING_ACTION__HORIZONTAL_SCALE_ACTION_CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScalingAction(VerticalScalingAction verticalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)verticalScalingAction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= camelValidator.validateAction_correct_action_type(verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerticalScalingAction_vertical_scale_action_correct_input(verticalScalingAction, diagnostics, context);
		if (result || diagnostics != null) result &= validateVerticalScalingAction_vertical_scale_action_correct_type(verticalScalingAction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the vertical_scale_action_correct_input constraint of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERTICAL_SCALING_ACTION__VERTICAL_SCALE_ACTION_CORRECT_INPUT__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VerticalScalingAction: ' + self.name +\n" +
		"\t\t\t\t\t' has the value of all VM characteristic update attributes equal to zero. At least one should be positive.',\n" +
		"\tstatus : Boolean = memoryUpdate\n" +
		"\t\t\t\t\t<> 0 or CPUUpdate <> 0.0 or coreUpdate <> 0 or storageUpdate <> 0\n" +
		"}.status";

	/**
	 * Validates the vertical_scale_action_correct_input constraint of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScalingAction_vertical_scale_action_correct_input(VerticalScalingAction verticalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION,
				 verticalScalingAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vertical_scale_action_correct_input",
				 VERTICAL_SCALING_ACTION__VERTICAL_SCALE_ACTION_CORRECT_INPUT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the vertical_scale_action_correct_type constraint of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VERTICAL_SCALING_ACTION__VERTICAL_SCALE_ACTION_CORRECT_TYPE__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'VerticalScalingAction: ' + self.name + ' has a wrong type (' +\n" +
		"\t\t\t\t\tself.type.toString() + '). It should be either SCALE_UP or SCALE_DOWN',\n" +
		"\tstatus : Boolean = (self.type = camel::ActionType::SCALE_UP)\n" +
		"\t\t\t\t\tor (self.type = camel::ActionType::SCALE_DOWN)\n" +
		"}.status";

	/**
	 * Validates the vertical_scale_action_correct_type constraint of '<em>Vertical Scaling Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerticalScalingAction_vertical_scale_action_correct_type(VerticalScalingAction verticalScalingAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.VERTICAL_SCALING_ACTION,
				 verticalScalingAction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "vertical_scale_action_correct_type",
				 VERTICAL_SCALING_ACTION__VERTICAL_SCALE_ACTION_CORRECT_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimer(Timer timer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)timer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)timer, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimer_timer_correct_values(timer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the timer_correct_values constraint of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMER__TIMER_CORRECT_VALUES__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Timer: ' + self.toString() +\n" +
		"\t\t\t\t\t' as wrong value combinations for its attributes. This means that either the timeValue is non-positive or the time type is WITHIN_MAX and a non-positive maxOccurrenceNum has been provided or that the time type is not WITHIN_MAX and a positive maxOccurrenceNum has been given',\n" +
		"\tstatus : Boolean = timeValue\n" +
		"\t\t\t\t\t> 0 and (self.type = TimerType::WITHIN_MAX implies self.maxOccurrenceNum > 0) and (self.type <>\n" +
		"\t\t\t\t\tTimerType::WITHIN_MAX implies self.maxOccurrenceNum = 0)\n" +
		"}.status";

	/**
	 * Validates the timer_correct_values constraint of '<em>Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimer_timer_correct_values(Timer timer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ScalabilityPackage.Literals.TIMER,
				 timer,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "timer_correct_values",
				 TIMER__TIMER_CORRECT_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryPatternOperatorType(BinaryPatternOperatorType binaryPatternOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerType(TimerType timerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryPatternOperatorType(UnaryPatternOperatorType unaryPatternOperatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //ScalabilityValidator
