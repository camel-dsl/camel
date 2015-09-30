/**
 */
package eu.paasage.camel.scalability;

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
 * @see eu.paasage.camel.scalability.ScalabilityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ScalabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scalability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/scalability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scalability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScalabilityPackage eINSTANCE = eu.paasage.camel.scalability.impl.ScalabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.ScalabilityModelImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalabilityModel()
	 * @generated
	 */
	int SCALABILITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__RULES = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__EVENTS = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__EVENT_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__ACTIONS = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__PATTERNS = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__TIMERS = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scale Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL__SCALE_REQUIREMENTS = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.EventImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.EventPatternImpl <em>Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.EventPatternImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEventPattern()
	 * @generated
	 */
	int EVENT_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN__TIMER = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN_FEATURE_COUNT = EVENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Includes Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Includes Left Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT = EVENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Includes Right Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT = EVENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PATTERN_OPERATION_COUNT = EVENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl <em>Binary Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.BinaryEventPatternImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getBinaryEventPattern()
	 * @generated
	 */
	int BINARY_EVENT_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__NAME = EVENT_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__TIMER = EVENT_PATTERN__TIMER;

	/**
	 * The feature id for the '<em><b>Left Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__LEFT_EVENT = EVENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__RIGHT_EVENT = EVENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Occurrence Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__LOWER_OCCURRENCE_BOUND = EVENT_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Occurrence Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__UPPER_OCCURRENCE_BOUND = EVENT_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN__OPERATOR = EVENT_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Binary Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN_FEATURE_COUNT = EVENT_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Includes Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT;

	/**
	 * The operation id for the '<em>Includes Left Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT;

	/**
	 * The operation id for the '<em>Includes Right Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT;

	/**
	 * The number of operations of the '<em>Binary Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EVENT_PATTERN_OPERATION_COUNT = EVENT_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.UnaryEventPatternImpl <em>Unary Event Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.UnaryEventPatternImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getUnaryEventPattern()
	 * @generated
	 */
	int UNARY_EVENT_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN__NAME = EVENT_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN__TIMER = EVENT_PATTERN__TIMER;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN__EVENT = EVENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN__OCCURRENCE_NUM = EVENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN__OPERATOR = EVENT_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Unary Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN_FEATURE_COUNT = EVENT_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Includes Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT;

	/**
	 * The operation id for the '<em>Includes Left Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT;

	/**
	 * The operation id for the '<em>Includes Right Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT = EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT;

	/**
	 * The number of operations of the '<em>Unary Event Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EVENT_PATTERN_OPERATION_COUNT = EVENT_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.SimpleEventImpl <em>Simple Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.SimpleEventImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getSimpleEvent()
	 * @generated
	 */
	int SIMPLE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT__NAME = EVENT__NAME;

	/**
	 * The number of structural features of the '<em>Simple Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.FunctionalEventImpl <em>Functional Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.FunctionalEventImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getFunctionalEvent()
	 * @generated
	 */
	int FUNCTIONAL_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EVENT__NAME = SIMPLE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Functional Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EVENT__FUNCTIONAL_TYPE = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Functional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.NonFunctionalEventImpl <em>Non Functional Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.NonFunctionalEventImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getNonFunctionalEvent()
	 * @generated
	 */
	int NON_FUNCTIONAL_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_EVENT__NAME = SIMPLE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Metric Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_EVENT__METRIC_CONDITION = SIMPLE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Violation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_EVENT__IS_VIOLATION = SIMPLE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Functional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_EVENT_FEATURE_COUNT = SIMPLE_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Functional Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_EVENT_OPERATION_COUNT = SIMPLE_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.EventInstanceImpl <em>Event Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.EventInstanceImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEventInstance()
	 * @generated
	 */
	int EVENT_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__LAYER = 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__EVENT = 3;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__METRIC_INSTANCE = 4;

	/**
	 * The number of structural features of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Equal Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE___EQUAL_LAYER__LAYERTYPE_LAYERTYPE = 0;

	/**
	 * The number of operations of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.ScalabilityRuleImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalabilityRule()
	 * @generated
	 */
	int SCALABILITY_RULE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Scale Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE__SCALE_REQUIREMENTS = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALABILITY_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.ScalingActionImpl <em>Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.ScalingActionImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalingAction()
	 * @generated
	 */
	int SCALING_ACTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_ACTION__NAME = CamelPackage.ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_ACTION__TYPE = CamelPackage.ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_ACTION__VM = CamelPackage.ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_ACTION_FEATURE_COUNT = CamelPackage.ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_ACTION_OPERATION_COUNT = CamelPackage.ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl <em>Horizontal Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getHorizontalScalingAction()
	 * @generated
	 */
	int HORIZONTAL_SCALING_ACTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION__NAME = SCALING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION__TYPE = SCALING_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION__VM = SCALING_ACTION__VM;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION__COUNT = SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION__INTERNAL_COMPONENT = SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Horizontal Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION_FEATURE_COUNT = SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Horizontal Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALING_ACTION_OPERATION_COUNT = SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl <em>Vertical Scaling Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.VerticalScalingActionImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getVerticalScalingAction()
	 * @generated
	 */
	int VERTICAL_SCALING_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__NAME = SCALING_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__TYPE = SCALING_ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__VM = SCALING_ACTION__VM;

	/**
	 * The feature id for the '<em><b>Memory Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__MEMORY_UPDATE = SCALING_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CPU Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__CPU_UPDATE = SCALING_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Core Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__CORE_UPDATE = SCALING_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__STORAGE_UPDATE = SCALING_ACTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Io Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__IO_UPDATE = SCALING_ACTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Network Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION__NETWORK_UPDATE = SCALING_ACTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Vertical Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION_FEATURE_COUNT = SCALING_ACTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Vertical Scaling Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALING_ACTION_OPERATION_COUNT = SCALING_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.impl.TimerImpl <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.impl.TimerImpl
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Time Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__TIME_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max Occurrence Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__MAX_OCCURRENCE_NUM = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__UNIT = 4;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.BinaryPatternOperatorType <em>Binary Pattern Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.BinaryPatternOperatorType
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getBinaryPatternOperatorType()
	 * @generated
	 */
	int BINARY_PATTERN_OPERATOR_TYPE = 14;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.TimerType <em>Timer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.TimerType
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getTimerType()
	 * @generated
	 */
	int TIMER_TYPE = 15;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.UnaryPatternOperatorType <em>Unary Pattern Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.UnaryPatternOperatorType
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getUnaryPatternOperatorType()
	 * @generated
	 */
	int UNARY_PATTERN_OPERATOR_TYPE = 16;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.scalability.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.scalability.StatusType
	 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.ScalabilityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel
	 * @generated
	 */
	EClass getScalabilityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getRules()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getEvents()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getEventInstances <em>Event Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Instances</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getEventInstances()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_EventInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getActions()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getPatterns()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_Patterns();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getTimers <em>Timers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timers</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getTimers()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_Timers();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.scalability.ScalabilityModel#getScaleRequirements <em>Scale Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scale Requirements</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityModel#getScaleRequirements()
	 * @see #getScalabilityModel()
	 * @generated
	 */
	EReference getScalabilityModel_ScaleRequirements();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see eu.paasage.camel.scalability.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.scalability.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.EventPattern <em>Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Pattern</em>'.
	 * @see eu.paasage.camel.scalability.EventPattern
	 * @generated
	 */
	EClass getEventPattern();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.EventPattern#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timer</em>'.
	 * @see eu.paasage.camel.scalability.EventPattern#getTimer()
	 * @see #getEventPattern()
	 * @generated
	 */
	EReference getEventPattern_Timer();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.scalability.EventPattern#includesEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Event</em>' operation.
	 * @see eu.paasage.camel.scalability.EventPattern#includesEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 */
	EOperation getEventPattern__IncludesEvent__SimpleEvent();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.scalability.EventPattern#includesLeftEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Left Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Left Event</em>' operation.
	 * @see eu.paasage.camel.scalability.EventPattern#includesLeftEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 */
	EOperation getEventPattern__IncludesLeftEvent__SimpleEvent();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.scalability.EventPattern#includesRightEvent(eu.paasage.camel.scalability.SimpleEvent) <em>Includes Right Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Includes Right Event</em>' operation.
	 * @see eu.paasage.camel.scalability.EventPattern#includesRightEvent(eu.paasage.camel.scalability.SimpleEvent)
	 * @generated
	 */
	EOperation getEventPattern__IncludesRightEvent__SimpleEvent();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.BinaryEventPattern <em>Binary Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Event Pattern</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern
	 * @generated
	 */
	EClass getBinaryEventPattern();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.BinaryEventPattern#getLeftEvent <em>Left Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Event</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern#getLeftEvent()
	 * @see #getBinaryEventPattern()
	 * @generated
	 */
	EReference getBinaryEventPattern_LeftEvent();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.BinaryEventPattern#getRightEvent <em>Right Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Event</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern#getRightEvent()
	 * @see #getBinaryEventPattern()
	 * @generated
	 */
	EReference getBinaryEventPattern_RightEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.BinaryEventPattern#getLowerOccurrenceBound <em>Lower Occurrence Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Occurrence Bound</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern#getLowerOccurrenceBound()
	 * @see #getBinaryEventPattern()
	 * @generated
	 */
	EAttribute getBinaryEventPattern_LowerOccurrenceBound();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.BinaryEventPattern#getUpperOccurrenceBound <em>Upper Occurrence Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Occurrence Bound</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern#getUpperOccurrenceBound()
	 * @see #getBinaryEventPattern()
	 * @generated
	 */
	EAttribute getBinaryEventPattern_UpperOccurrenceBound();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.BinaryEventPattern#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eu.paasage.camel.scalability.BinaryEventPattern#getOperator()
	 * @see #getBinaryEventPattern()
	 * @generated
	 */
	EAttribute getBinaryEventPattern_Operator();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.UnaryEventPattern <em>Unary Event Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Event Pattern</em>'.
	 * @see eu.paasage.camel.scalability.UnaryEventPattern
	 * @generated
	 */
	EClass getUnaryEventPattern();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.UnaryEventPattern#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see eu.paasage.camel.scalability.UnaryEventPattern#getEvent()
	 * @see #getUnaryEventPattern()
	 * @generated
	 */
	EReference getUnaryEventPattern_Event();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.UnaryEventPattern#getOccurrenceNum <em>Occurrence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence Num</em>'.
	 * @see eu.paasage.camel.scalability.UnaryEventPattern#getOccurrenceNum()
	 * @see #getUnaryEventPattern()
	 * @generated
	 */
	EAttribute getUnaryEventPattern_OccurrenceNum();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.UnaryEventPattern#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see eu.paasage.camel.scalability.UnaryEventPattern#getOperator()
	 * @see #getUnaryEventPattern()
	 * @generated
	 */
	EAttribute getUnaryEventPattern_Operator();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.SimpleEvent <em>Simple Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Event</em>'.
	 * @see eu.paasage.camel.scalability.SimpleEvent
	 * @generated
	 */
	EClass getSimpleEvent();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.FunctionalEvent <em>Functional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Event</em>'.
	 * @see eu.paasage.camel.scalability.FunctionalEvent
	 * @generated
	 */
	EClass getFunctionalEvent();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.FunctionalEvent#getFunctionalType <em>Functional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Type</em>'.
	 * @see eu.paasage.camel.scalability.FunctionalEvent#getFunctionalType()
	 * @see #getFunctionalEvent()
	 * @generated
	 */
	EAttribute getFunctionalEvent_FunctionalType();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.NonFunctionalEvent <em>Non Functional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Event</em>'.
	 * @see eu.paasage.camel.scalability.NonFunctionalEvent
	 * @generated
	 */
	EClass getNonFunctionalEvent();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.NonFunctionalEvent#getMetricCondition <em>Metric Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Condition</em>'.
	 * @see eu.paasage.camel.scalability.NonFunctionalEvent#getMetricCondition()
	 * @see #getNonFunctionalEvent()
	 * @generated
	 */
	EReference getNonFunctionalEvent_MetricCondition();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.NonFunctionalEvent#isIsViolation <em>Is Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Violation</em>'.
	 * @see eu.paasage.camel.scalability.NonFunctionalEvent#isIsViolation()
	 * @see #getNonFunctionalEvent()
	 * @generated
	 */
	EAttribute getNonFunctionalEvent_IsViolation();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Instance</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance
	 * @generated
	 */
	EClass getEventInstance();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.EventInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance#getName()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.EventInstance#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance#getStatus()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_Status();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.EventInstance#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance#getLayer()
	 * @see #getEventInstance()
	 * @generated
	 */
	EAttribute getEventInstance_Layer();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.EventInstance#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance#getEvent()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_Event();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.EventInstance#getMetricInstance <em>Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Instance</em>'.
	 * @see eu.paasage.camel.scalability.EventInstance#getMetricInstance()
	 * @see #getEventInstance()
	 * @generated
	 */
	EReference getEventInstance_MetricInstance();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.scalability.EventInstance#equalLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType) <em>Equal Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equal Layer</em>' operation.
	 * @see eu.paasage.camel.scalability.EventInstance#equalLayer(eu.paasage.camel.LayerType, eu.paasage.camel.LayerType)
	 * @generated
	 */
	EOperation getEventInstance__EqualLayer__LayerType_LayerType();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.ScalabilityRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule
	 * @generated
	 */
	EClass getScalabilityRule();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.ScalabilityRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule#getName()
	 * @see #getScalabilityRule()
	 * @generated
	 */
	EAttribute getScalabilityRule_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.ScalabilityRule#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule#getEvent()
	 * @see #getScalabilityRule()
	 * @generated
	 */
	EReference getScalabilityRule_Event();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.scalability.ScalabilityRule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule#getActions()
	 * @see #getScalabilityRule()
	 * @generated
	 */
	EReference getScalabilityRule_Actions();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.scalability.ScalabilityRule#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entity</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule#getEntity()
	 * @see #getScalabilityRule()
	 * @generated
	 */
	EReference getScalabilityRule_Entity();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.scalability.ScalabilityRule#getScaleRequirements <em>Scale Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scale Requirements</em>'.
	 * @see eu.paasage.camel.scalability.ScalabilityRule#getScaleRequirements()
	 * @see #getScalabilityRule()
	 * @generated
	 */
	EReference getScalabilityRule_ScaleRequirements();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.ScalingAction <em>Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Action</em>'.
	 * @see eu.paasage.camel.scalability.ScalingAction
	 * @generated
	 */
	EClass getScalingAction();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.ScalingAction#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm</em>'.
	 * @see eu.paasage.camel.scalability.ScalingAction#getVm()
	 * @see #getScalingAction()
	 * @generated
	 */
	EReference getScalingAction_Vm();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.HorizontalScalingAction <em>Horizontal Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Scaling Action</em>'.
	 * @see eu.paasage.camel.scalability.HorizontalScalingAction
	 * @generated
	 */
	EClass getHorizontalScalingAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.HorizontalScalingAction#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see eu.paasage.camel.scalability.HorizontalScalingAction#getCount()
	 * @see #getHorizontalScalingAction()
	 * @generated
	 */
	EAttribute getHorizontalScalingAction_Count();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.HorizontalScalingAction#getInternalComponent <em>Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Component</em>'.
	 * @see eu.paasage.camel.scalability.HorizontalScalingAction#getInternalComponent()
	 * @see #getHorizontalScalingAction()
	 * @generated
	 */
	EReference getHorizontalScalingAction_InternalComponent();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.VerticalScalingAction <em>Vertical Scaling Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Scaling Action</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction
	 * @generated
	 */
	EClass getVerticalScalingAction();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getMemoryUpdate <em>Memory Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getMemoryUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_MemoryUpdate();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getCPUUpdate <em>CPU Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CPU Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getCPUUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_CPUUpdate();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getCoreUpdate <em>Core Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getCoreUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_CoreUpdate();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getStorageUpdate <em>Storage Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getStorageUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_StorageUpdate();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getIoUpdate <em>Io Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getIoUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_IoUpdate();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.VerticalScalingAction#getNetworkUpdate <em>Network Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Update</em>'.
	 * @see eu.paasage.camel.scalability.VerticalScalingAction#getNetworkUpdate()
	 * @see #getVerticalScalingAction()
	 * @generated
	 */
	EAttribute getVerticalScalingAction_NetworkUpdate();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.scalability.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see eu.paasage.camel.scalability.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.Timer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.paasage.camel.scalability.Timer#getType()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_Type();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.Timer#getTimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Value</em>'.
	 * @see eu.paasage.camel.scalability.Timer#getTimeValue()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_TimeValue();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.Timer#getMaxOccurrenceNum <em>Max Occurrence Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurrence Num</em>'.
	 * @see eu.paasage.camel.scalability.Timer#getMaxOccurrenceNum()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_MaxOccurrenceNum();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.scalability.Timer#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see eu.paasage.camel.scalability.Timer#getUnit()
	 * @see #getTimer()
	 * @generated
	 */
	EReference getTimer_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.scalability.Timer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.scalability.Timer#getName()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_Name();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.scalability.BinaryPatternOperatorType <em>Binary Pattern Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Pattern Operator Type</em>'.
	 * @see eu.paasage.camel.scalability.BinaryPatternOperatorType
	 * @generated
	 */
	EEnum getBinaryPatternOperatorType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.scalability.TimerType <em>Timer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Timer Type</em>'.
	 * @see eu.paasage.camel.scalability.TimerType
	 * @generated
	 */
	EEnum getTimerType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.scalability.UnaryPatternOperatorType <em>Unary Pattern Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Pattern Operator Type</em>'.
	 * @see eu.paasage.camel.scalability.UnaryPatternOperatorType
	 * @generated
	 */
	EEnum getUnaryPatternOperatorType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.scalability.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see eu.paasage.camel.scalability.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScalabilityFactory getScalabilityFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.ScalabilityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.ScalabilityModelImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalabilityModel()
		 * @generated
		 */
		EClass SCALABILITY_MODEL = eINSTANCE.getScalabilityModel();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__RULES = eINSTANCE.getScalabilityModel_Rules();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__EVENTS = eINSTANCE.getScalabilityModel_Events();

		/**
		 * The meta object literal for the '<em><b>Event Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__EVENT_INSTANCES = eINSTANCE.getScalabilityModel_EventInstances();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__ACTIONS = eINSTANCE.getScalabilityModel_Actions();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__PATTERNS = eINSTANCE.getScalabilityModel_Patterns();

		/**
		 * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__TIMERS = eINSTANCE.getScalabilityModel_Timers();

		/**
		 * The meta object literal for the '<em><b>Scale Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_MODEL__SCALE_REQUIREMENTS = eINSTANCE.getScalabilityModel_ScaleRequirements();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.EventImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.EventPatternImpl <em>Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.EventPatternImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEventPattern()
		 * @generated
		 */
		EClass EVENT_PATTERN = eINSTANCE.getEventPattern();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PATTERN__TIMER = eINSTANCE.getEventPattern_Timer();

		/**
		 * The meta object literal for the '<em><b>Includes Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_PATTERN___INCLUDES_EVENT__SIMPLEEVENT = eINSTANCE.getEventPattern__IncludesEvent__SimpleEvent();

		/**
		 * The meta object literal for the '<em><b>Includes Left Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_PATTERN___INCLUDES_LEFT_EVENT__SIMPLEEVENT = eINSTANCE.getEventPattern__IncludesLeftEvent__SimpleEvent();

		/**
		 * The meta object literal for the '<em><b>Includes Right Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_PATTERN___INCLUDES_RIGHT_EVENT__SIMPLEEVENT = eINSTANCE.getEventPattern__IncludesRightEvent__SimpleEvent();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.BinaryEventPatternImpl <em>Binary Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.BinaryEventPatternImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getBinaryEventPattern()
		 * @generated
		 */
		EClass BINARY_EVENT_PATTERN = eINSTANCE.getBinaryEventPattern();

		/**
		 * The meta object literal for the '<em><b>Left Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EVENT_PATTERN__LEFT_EVENT = eINSTANCE.getBinaryEventPattern_LeftEvent();

		/**
		 * The meta object literal for the '<em><b>Right Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EVENT_PATTERN__RIGHT_EVENT = eINSTANCE.getBinaryEventPattern_RightEvent();

		/**
		 * The meta object literal for the '<em><b>Lower Occurrence Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EVENT_PATTERN__LOWER_OCCURRENCE_BOUND = eINSTANCE.getBinaryEventPattern_LowerOccurrenceBound();

		/**
		 * The meta object literal for the '<em><b>Upper Occurrence Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EVENT_PATTERN__UPPER_OCCURRENCE_BOUND = eINSTANCE.getBinaryEventPattern_UpperOccurrenceBound();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EVENT_PATTERN__OPERATOR = eINSTANCE.getBinaryEventPattern_Operator();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.UnaryEventPatternImpl <em>Unary Event Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.UnaryEventPatternImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getUnaryEventPattern()
		 * @generated
		 */
		EClass UNARY_EVENT_PATTERN = eINSTANCE.getUnaryEventPattern();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EVENT_PATTERN__EVENT = eINSTANCE.getUnaryEventPattern_Event();

		/**
		 * The meta object literal for the '<em><b>Occurrence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EVENT_PATTERN__OCCURRENCE_NUM = eINSTANCE.getUnaryEventPattern_OccurrenceNum();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EVENT_PATTERN__OPERATOR = eINSTANCE.getUnaryEventPattern_Operator();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.SimpleEventImpl <em>Simple Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.SimpleEventImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getSimpleEvent()
		 * @generated
		 */
		EClass SIMPLE_EVENT = eINSTANCE.getSimpleEvent();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.FunctionalEventImpl <em>Functional Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.FunctionalEventImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getFunctionalEvent()
		 * @generated
		 */
		EClass FUNCTIONAL_EVENT = eINSTANCE.getFunctionalEvent();

		/**
		 * The meta object literal for the '<em><b>Functional Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_EVENT__FUNCTIONAL_TYPE = eINSTANCE.getFunctionalEvent_FunctionalType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.NonFunctionalEventImpl <em>Non Functional Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.NonFunctionalEventImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getNonFunctionalEvent()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_EVENT = eINSTANCE.getNonFunctionalEvent();

		/**
		 * The meta object literal for the '<em><b>Metric Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FUNCTIONAL_EVENT__METRIC_CONDITION = eINSTANCE.getNonFunctionalEvent_MetricCondition();

		/**
		 * The meta object literal for the '<em><b>Is Violation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_FUNCTIONAL_EVENT__IS_VIOLATION = eINSTANCE.getNonFunctionalEvent_IsViolation();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.EventInstanceImpl <em>Event Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.EventInstanceImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getEventInstance()
		 * @generated
		 */
		EClass EVENT_INSTANCE = eINSTANCE.getEventInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__NAME = eINSTANCE.getEventInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__STATUS = eINSTANCE.getEventInstance_Status();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_INSTANCE__LAYER = eINSTANCE.getEventInstance_Layer();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__EVENT = eINSTANCE.getEventInstance_Event();

		/**
		 * The meta object literal for the '<em><b>Metric Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INSTANCE__METRIC_INSTANCE = eINSTANCE.getEventInstance_MetricInstance();

		/**
		 * The meta object literal for the '<em><b>Equal Layer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT_INSTANCE___EQUAL_LAYER__LAYERTYPE_LAYERTYPE = eINSTANCE.getEventInstance__EqualLayer__LayerType_LayerType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.ScalabilityRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.ScalabilityRuleImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalabilityRule()
		 * @generated
		 */
		EClass SCALABILITY_RULE = eINSTANCE.getScalabilityRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALABILITY_RULE__NAME = eINSTANCE.getScalabilityRule_Name();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_RULE__EVENT = eINSTANCE.getScalabilityRule_Event();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_RULE__ACTIONS = eINSTANCE.getScalabilityRule_Actions();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_RULE__ENTITY = eINSTANCE.getScalabilityRule_Entity();

		/**
		 * The meta object literal for the '<em><b>Scale Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALABILITY_RULE__SCALE_REQUIREMENTS = eINSTANCE.getScalabilityRule_ScaleRequirements();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.ScalingActionImpl <em>Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.ScalingActionImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getScalingAction()
		 * @generated
		 */
		EClass SCALING_ACTION = eINSTANCE.getScalingAction();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_ACTION__VM = eINSTANCE.getScalingAction_Vm();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl <em>Horizontal Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.HorizontalScalingActionImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getHorizontalScalingAction()
		 * @generated
		 */
		EClass HORIZONTAL_SCALING_ACTION = eINSTANCE.getHorizontalScalingAction();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_SCALING_ACTION__COUNT = eINSTANCE.getHorizontalScalingAction_Count();

		/**
		 * The meta object literal for the '<em><b>Internal Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HORIZONTAL_SCALING_ACTION__INTERNAL_COMPONENT = eINSTANCE.getHorizontalScalingAction_InternalComponent();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.VerticalScalingActionImpl <em>Vertical Scaling Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.VerticalScalingActionImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getVerticalScalingAction()
		 * @generated
		 */
		EClass VERTICAL_SCALING_ACTION = eINSTANCE.getVerticalScalingAction();

		/**
		 * The meta object literal for the '<em><b>Memory Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__MEMORY_UPDATE = eINSTANCE.getVerticalScalingAction_MemoryUpdate();

		/**
		 * The meta object literal for the '<em><b>CPU Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__CPU_UPDATE = eINSTANCE.getVerticalScalingAction_CPUUpdate();

		/**
		 * The meta object literal for the '<em><b>Core Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__CORE_UPDATE = eINSTANCE.getVerticalScalingAction_CoreUpdate();

		/**
		 * The meta object literal for the '<em><b>Storage Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__STORAGE_UPDATE = eINSTANCE.getVerticalScalingAction_StorageUpdate();

		/**
		 * The meta object literal for the '<em><b>Io Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__IO_UPDATE = eINSTANCE.getVerticalScalingAction_IoUpdate();

		/**
		 * The meta object literal for the '<em><b>Network Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALING_ACTION__NETWORK_UPDATE = eINSTANCE.getVerticalScalingAction_NetworkUpdate();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.impl.TimerImpl <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.impl.TimerImpl
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__TYPE = eINSTANCE.getTimer_Type();

		/**
		 * The meta object literal for the '<em><b>Time Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__TIME_VALUE = eINSTANCE.getTimer_TimeValue();

		/**
		 * The meta object literal for the '<em><b>Max Occurrence Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__MAX_OCCURRENCE_NUM = eINSTANCE.getTimer_MaxOccurrenceNum();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER__UNIT = eINSTANCE.getTimer_Unit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__NAME = eINSTANCE.getTimer_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.BinaryPatternOperatorType <em>Binary Pattern Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.BinaryPatternOperatorType
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getBinaryPatternOperatorType()
		 * @generated
		 */
		EEnum BINARY_PATTERN_OPERATOR_TYPE = eINSTANCE.getBinaryPatternOperatorType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.TimerType <em>Timer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.TimerType
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getTimerType()
		 * @generated
		 */
		EEnum TIMER_TYPE = eINSTANCE.getTimerType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.UnaryPatternOperatorType <em>Unary Pattern Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.UnaryPatternOperatorType
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getUnaryPatternOperatorType()
		 * @generated
		 */
		EEnum UNARY_PATTERN_OPERATOR_TYPE = eINSTANCE.getUnaryPatternOperatorType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.scalability.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.scalability.StatusType
		 * @see eu.paasage.camel.scalability.impl.ScalabilityPackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

	}

} //ScalabilityPackage
