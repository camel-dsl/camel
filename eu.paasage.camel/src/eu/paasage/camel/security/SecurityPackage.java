/**
 */
package eu.paasage.camel.security;

import eu.paasage.camel.CamelPackage;

import eu.paasage.camel.metric.MetricPackage;

import eu.paasage.camel.requirement.RequirementPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.paasage.camel.security.SecurityFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = eu.paasage.camel.security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecurityModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecurityModelImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityModel()
	 * @generated
	 */
	int SECURITY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Security Controls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_CONTROLS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_REQUIREMENTS = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_PROPERTIES = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Raw Security Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__RAW_SECURITY_METRICS = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Composite Security Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__COMPOSITE_SECURITY_METRICS = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Raw Security Metric Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__RAW_SECURITY_METRIC_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Composite Security Metric Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__COMPOSITE_SECURITY_METRIC_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Security Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_DOMAINS = CamelPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Security Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_CAPABILITIES = CamelPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security SL Os</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL__SECURITY_SL_OS = CamelPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecurityDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecurityDomainImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityDomain()
	 * @generated
	 */
	int SECURITY_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DOMAIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DOMAIN__NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DOMAIN__SUB_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecurityControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecurityControlImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityControl()
	 * @generated
	 */
	int SECURITY_CONTROL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Sub Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SUB_DOMAIN = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SPECIFICATION = 3;

	/**
	 * The feature id for the '<em><b>Security Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SECURITY_PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Raw Security Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__RAW_SECURITY_METRICS = 5;

	/**
	 * The feature id for the '<em><b>Composite Security Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__COMPOSITE_SECURITY_METRICS = 6;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.RawSecurityMetricInstanceImpl <em>Raw Security Metric Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.RawSecurityMetricInstanceImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getRawSecurityMetricInstance()
	 * @generated
	 */
	int RAW_SECURITY_METRIC_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__NAME = MetricPackage.RAW_METRIC_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__METRIC = MetricPackage.RAW_METRIC_INSTANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__SCHEDULE = MetricPackage.RAW_METRIC_INSTANCE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__WINDOW = MetricPackage.RAW_METRIC_INSTANCE__WINDOW;

	/**
	 * The feature id for the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__OBJECT_BINDING = MetricPackage.RAW_METRIC_INSTANCE__OBJECT_BINDING;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__METRIC_CONTEXT = MetricPackage.RAW_METRIC_INSTANCE__METRIC_CONTEXT;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE__SENSOR = MetricPackage.RAW_METRIC_INSTANCE__SENSOR;

	/**
	 * The number of structural features of the '<em>Raw Security Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE_FEATURE_COUNT = MetricPackage.RAW_METRIC_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = MetricPackage.RAW_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE;

	/**
	 * The number of operations of the '<em>Raw Security Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_INSTANCE_OPERATION_COUNT = MetricPackage.RAW_METRIC_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.RawSecurityMetricImpl <em>Raw Security Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.RawSecurityMetricImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getRawSecurityMetric()
	 * @generated
	 */
	int RAW_SECURITY_METRIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__NAME = MetricPackage.RAW_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__VALUE = MetricPackage.RAW_METRIC__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__DESCRIPTION = MetricPackage.RAW_METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__VALUE_TYPE = MetricPackage.RAW_METRIC__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__VALUE_DIRECTION = MetricPackage.RAW_METRIC__VALUE_DIRECTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__UNIT = MetricPackage.RAW_METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__LAYER = MetricPackage.RAW_METRIC__LAYER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC__PROPERTY = MetricPackage.RAW_METRIC__PROPERTY;

	/**
	 * The number of structural features of the '<em>Raw Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_FEATURE_COUNT = MetricPackage.RAW_METRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = MetricPackage.RAW_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC;

	/**
	 * The number of operations of the '<em>Raw Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_SECURITY_METRIC_OPERATION_COUNT = MetricPackage.RAW_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecurityPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecurityPropertyImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityProperty()
	 * @generated
	 */
	int SECURITY_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__NAME = MetricPackage.PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__DESCRIPTION = MetricPackage.PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__TYPE = MetricPackage.PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__SUB_PROPERTIES = MetricPackage.PROPERTY__SUB_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__SENSORS = MetricPackage.PROPERTY__SENSORS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY__DOMAIN = MetricPackage.PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY_FEATURE_COUNT = MetricPackage.PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_PROPERTY_OPERATION_COUNT = MetricPackage.PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.CertifiableImpl <em>Certifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.CertifiableImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCertifiable()
	 * @generated
	 */
	int CERTIFIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__NAME = SECURITY_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__DESCRIPTION = SECURITY_PROPERTY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__TYPE = SECURITY_PROPERTY__TYPE;

	/**
	 * The feature id for the '<em><b>Sub Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__SUB_PROPERTIES = SECURITY_PROPERTY__SUB_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__SENSORS = SECURITY_PROPERTY__SENSORS;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE__DOMAIN = SECURITY_PROPERTY__DOMAIN;

	/**
	 * The number of structural features of the '<em>Certifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE_FEATURE_COUNT = SECURITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Certifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFIABLE_OPERATION_COUNT = SECURITY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecuritySLOImpl <em>SLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecuritySLOImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecuritySLO()
	 * @generated
	 */
	int SECURITY_SLO = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SLO__NAME = RequirementPackage.SERVICE_LEVEL_OBJECTIVE__NAME;

	/**
	 * The feature id for the '<em><b>Custom Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SLO__CUSTOM_SERVICE_LEVEL = RequirementPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL;

	/**
	 * The number of structural features of the '<em>SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SLO_FEATURE_COUNT = RequirementPackage.SERVICE_LEVEL_OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SLO_OPERATION_COUNT = RequirementPackage.SERVICE_LEVEL_OBJECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.SecurityCapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.SecurityCapabilityImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityCapability()
	 * @generated
	 */
	int SECURITY_CAPABILITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Security Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__SECURITY_CONTROLS = 1;

	/**
	 * The feature id for the '<em><b>Data Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY__DATA_CENTER = 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.CompositeSecurityMetricImpl <em>Composite Security Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.CompositeSecurityMetricImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCompositeSecurityMetric()
	 * @generated
	 */
	int COMPOSITE_SECURITY_METRIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__NAME = MetricPackage.COMPOSITE_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__VALUE = MetricPackage.COMPOSITE_METRIC__VALUE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__DESCRIPTION = MetricPackage.COMPOSITE_METRIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__VALUE_TYPE = MetricPackage.COMPOSITE_METRIC__VALUE_TYPE;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__VALUE_DIRECTION = MetricPackage.COMPOSITE_METRIC__VALUE_DIRECTION;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__UNIT = MetricPackage.COMPOSITE_METRIC__UNIT;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__LAYER = MetricPackage.COMPOSITE_METRIC__LAYER;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__PROPERTY = MetricPackage.COMPOSITE_METRIC__PROPERTY;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC__FORMULA = MetricPackage.COMPOSITE_METRIC__FORMULA;

	/**
	 * The number of structural features of the '<em>Composite Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_FEATURE_COUNT = MetricPackage.COMPOSITE_METRIC_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC = MetricPackage.COMPOSITE_METRIC___CHECK_RECURSIVENESS__METRIC_METRIC;

	/**
	 * The operation id for the '<em>Greater Equal Than Layer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE = MetricPackage.COMPOSITE_METRIC___GREATER_EQUAL_THAN_LAYER__LAYERTYPE_LAYERTYPE;

	/**
	 * The number of operations of the '<em>Composite Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_OPERATION_COUNT = MetricPackage.COMPOSITE_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.security.impl.CompositeSecurityMetricInstanceImpl <em>Composite Security Metric Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.security.impl.CompositeSecurityMetricInstanceImpl
	 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCompositeSecurityMetricInstance()
	 * @generated
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__NAME = MetricPackage.COMPOSITE_METRIC_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__METRIC = MetricPackage.COMPOSITE_METRIC_INSTANCE__METRIC;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__SCHEDULE = MetricPackage.COMPOSITE_METRIC_INSTANCE__SCHEDULE;

	/**
	 * The feature id for the '<em><b>Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__WINDOW = MetricPackage.COMPOSITE_METRIC_INSTANCE__WINDOW;

	/**
	 * The feature id for the '<em><b>Object Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__OBJECT_BINDING = MetricPackage.COMPOSITE_METRIC_INSTANCE__OBJECT_BINDING;

	/**
	 * The feature id for the '<em><b>Metric Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__METRIC_CONTEXT = MetricPackage.COMPOSITE_METRIC_INSTANCE__METRIC_CONTEXT;

	/**
	 * The feature id for the '<em><b>Composing Metric Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES = MetricPackage.COMPOSITE_METRIC_INSTANCE__COMPOSING_METRIC_INSTANCES;

	/**
	 * The number of structural features of the '<em>Composite Security Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE_FEATURE_COUNT = MetricPackage.COMPOSITE_METRIC_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE = MetricPackage.COMPOSITE_METRIC_INSTANCE___CHECK_RECURSIVENESS__METRICINSTANCE_METRICINSTANCE;

	/**
	 * The number of operations of the '<em>Composite Security Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SECURITY_METRIC_INSTANCE_OPERATION_COUNT = MetricPackage.COMPOSITE_METRIC_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecurityModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.security.SecurityModel
	 * @generated
	 */
	EClass getSecurityModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecurityControls <em>Security Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Controls</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecurityControls()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecurityControls();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecurityRequirements <em>Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Requirements</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecurityRequirements()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecurityRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecurityProperties <em>Security Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Properties</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecurityProperties()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecurityProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getRawSecurityMetrics <em>Raw Security Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raw Security Metrics</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getRawSecurityMetrics()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_RawSecurityMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Security Metrics</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetrics()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_CompositeSecurityMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getRawSecurityMetricInstances <em>Raw Security Metric Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raw Security Metric Instances</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getRawSecurityMetricInstances()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_RawSecurityMetricInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetricInstances <em>Composite Security Metric Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Security Metric Instances</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getCompositeSecurityMetricInstances()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_CompositeSecurityMetricInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecurityDomains <em>Security Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Domains</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecurityDomains()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecurityDomains();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecurityCapabilities <em>Security Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Capabilities</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecurityCapabilities()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecurityCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.security.SecurityModel#getSecuritySLOs <em>Security SL Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security SL Os</em>'.
	 * @see eu.paasage.camel.security.SecurityModel#getSecuritySLOs()
	 * @see #getSecurityModel()
	 * @generated
	 */
	EReference getSecurityModel_SecuritySLOs();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecurityDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see eu.paasage.camel.security.SecurityDomain
	 * @generated
	 */
	EClass getSecurityDomain();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.security.SecurityDomain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eu.paasage.camel.security.SecurityDomain#getId()
	 * @see #getSecurityDomain()
	 * @generated
	 */
	EAttribute getSecurityDomain_Id();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.security.SecurityDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.security.SecurityDomain#getName()
	 * @see #getSecurityDomain()
	 * @generated
	 */
	EAttribute getSecurityDomain_Name();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.security.SecurityDomain#getSubDomain <em>Sub Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Domain</em>'.
	 * @see eu.paasage.camel.security.SecurityDomain#getSubDomain()
	 * @see #getSecurityDomain()
	 * @generated
	 */
	EReference getSecurityDomain_SubDomain();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecurityControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see eu.paasage.camel.security.SecurityControl
	 * @generated
	 */
	EClass getSecurityControl();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.security.SecurityControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getName()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.security.SecurityControl#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getDomain()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_Domain();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.security.SecurityControl#getSubDomain <em>Sub Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Domain</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getSubDomain()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_SubDomain();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.security.SecurityControl#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getSpecification()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Specification();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.security.SecurityControl#getSecurityProperties <em>Security Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Properties</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getSecurityProperties()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_SecurityProperties();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.security.SecurityControl#getRawSecurityMetrics <em>Raw Security Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Raw Security Metrics</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getRawSecurityMetrics()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_RawSecurityMetrics();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.security.SecurityControl#getCompositeSecurityMetrics <em>Composite Security Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composite Security Metrics</em>'.
	 * @see eu.paasage.camel.security.SecurityControl#getCompositeSecurityMetrics()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EReference getSecurityControl_CompositeSecurityMetrics();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.RawSecurityMetricInstance <em>Raw Security Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Security Metric Instance</em>'.
	 * @see eu.paasage.camel.security.RawSecurityMetricInstance
	 * @generated
	 */
	EClass getRawSecurityMetricInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.RawSecurityMetric <em>Raw Security Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Security Metric</em>'.
	 * @see eu.paasage.camel.security.RawSecurityMetric
	 * @generated
	 */
	EClass getRawSecurityMetric();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecurityProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see eu.paasage.camel.security.SecurityProperty
	 * @generated
	 */
	EClass getSecurityProperty();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.security.SecurityProperty#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see eu.paasage.camel.security.SecurityProperty#getDomain()
	 * @see #getSecurityProperty()
	 * @generated
	 */
	EReference getSecurityProperty_Domain();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.Certifiable <em>Certifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certifiable</em>'.
	 * @see eu.paasage.camel.security.Certifiable
	 * @generated
	 */
	EClass getCertifiable();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecuritySLO <em>SLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLO</em>'.
	 * @see eu.paasage.camel.security.SecuritySLO
	 * @generated
	 */
	EClass getSecuritySLO();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.SecurityCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see eu.paasage.camel.security.SecurityCapability
	 * @generated
	 */
	EClass getSecurityCapability();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.security.SecurityCapability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.security.SecurityCapability#getName()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EAttribute getSecurityCapability_Name();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.security.SecurityCapability#getSecurityControls <em>Security Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Controls</em>'.
	 * @see eu.paasage.camel.security.SecurityCapability#getSecurityControls()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EReference getSecurityCapability_SecurityControls();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.security.SecurityCapability#getDataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Center</em>'.
	 * @see eu.paasage.camel.security.SecurityCapability#getDataCenter()
	 * @see #getSecurityCapability()
	 * @generated
	 */
	EReference getSecurityCapability_DataCenter();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.CompositeSecurityMetric <em>Composite Security Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Security Metric</em>'.
	 * @see eu.paasage.camel.security.CompositeSecurityMetric
	 * @generated
	 */
	EClass getCompositeSecurityMetric();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.security.CompositeSecurityMetricInstance <em>Composite Security Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Security Metric Instance</em>'.
	 * @see eu.paasage.camel.security.CompositeSecurityMetricInstance
	 * @generated
	 */
	EClass getCompositeSecurityMetricInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecurityModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecurityModelImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityModel()
		 * @generated
		 */
		EClass SECURITY_MODEL = eINSTANCE.getSecurityModel();

		/**
		 * The meta object literal for the '<em><b>Security Controls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_CONTROLS = eINSTANCE.getSecurityModel_SecurityControls();

		/**
		 * The meta object literal for the '<em><b>Security Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_REQUIREMENTS = eINSTANCE.getSecurityModel_SecurityRequirements();

		/**
		 * The meta object literal for the '<em><b>Security Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_PROPERTIES = eINSTANCE.getSecurityModel_SecurityProperties();

		/**
		 * The meta object literal for the '<em><b>Raw Security Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__RAW_SECURITY_METRICS = eINSTANCE.getSecurityModel_RawSecurityMetrics();

		/**
		 * The meta object literal for the '<em><b>Composite Security Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__COMPOSITE_SECURITY_METRICS = eINSTANCE.getSecurityModel_CompositeSecurityMetrics();

		/**
		 * The meta object literal for the '<em><b>Raw Security Metric Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__RAW_SECURITY_METRIC_INSTANCES = eINSTANCE.getSecurityModel_RawSecurityMetricInstances();

		/**
		 * The meta object literal for the '<em><b>Composite Security Metric Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__COMPOSITE_SECURITY_METRIC_INSTANCES = eINSTANCE.getSecurityModel_CompositeSecurityMetricInstances();

		/**
		 * The meta object literal for the '<em><b>Security Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_DOMAINS = eINSTANCE.getSecurityModel_SecurityDomains();

		/**
		 * The meta object literal for the '<em><b>Security Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_CAPABILITIES = eINSTANCE.getSecurityModel_SecurityCapabilities();

		/**
		 * The meta object literal for the '<em><b>Security SL Os</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MODEL__SECURITY_SL_OS = eINSTANCE.getSecurityModel_SecuritySLOs();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecurityDomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecurityDomainImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityDomain()
		 * @generated
		 */
		EClass SECURITY_DOMAIN = eINSTANCE.getSecurityDomain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_DOMAIN__ID = eINSTANCE.getSecurityDomain_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_DOMAIN__NAME = eINSTANCE.getSecurityDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Sub Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_DOMAIN__SUB_DOMAIN = eINSTANCE.getSecurityDomain_SubDomain();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecurityControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecurityControlImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityControl()
		 * @generated
		 */
		EClass SECURITY_CONTROL = eINSTANCE.getSecurityControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__NAME = eINSTANCE.getSecurityControl_Name();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__DOMAIN = eINSTANCE.getSecurityControl_Domain();

		/**
		 * The meta object literal for the '<em><b>Sub Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__SUB_DOMAIN = eINSTANCE.getSecurityControl_SubDomain();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__SPECIFICATION = eINSTANCE.getSecurityControl_Specification();

		/**
		 * The meta object literal for the '<em><b>Security Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__SECURITY_PROPERTIES = eINSTANCE.getSecurityControl_SecurityProperties();

		/**
		 * The meta object literal for the '<em><b>Raw Security Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__RAW_SECURITY_METRICS = eINSTANCE.getSecurityControl_RawSecurityMetrics();

		/**
		 * The meta object literal for the '<em><b>Composite Security Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CONTROL__COMPOSITE_SECURITY_METRICS = eINSTANCE.getSecurityControl_CompositeSecurityMetrics();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.RawSecurityMetricInstanceImpl <em>Raw Security Metric Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.RawSecurityMetricInstanceImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getRawSecurityMetricInstance()
		 * @generated
		 */
		EClass RAW_SECURITY_METRIC_INSTANCE = eINSTANCE.getRawSecurityMetricInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.RawSecurityMetricImpl <em>Raw Security Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.RawSecurityMetricImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getRawSecurityMetric()
		 * @generated
		 */
		EClass RAW_SECURITY_METRIC = eINSTANCE.getRawSecurityMetric();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecurityPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecurityPropertyImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityProperty()
		 * @generated
		 */
		EClass SECURITY_PROPERTY = eINSTANCE.getSecurityProperty();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_PROPERTY__DOMAIN = eINSTANCE.getSecurityProperty_Domain();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.CertifiableImpl <em>Certifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.CertifiableImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCertifiable()
		 * @generated
		 */
		EClass CERTIFIABLE = eINSTANCE.getCertifiable();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecuritySLOImpl <em>SLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecuritySLOImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecuritySLO()
		 * @generated
		 */
		EClass SECURITY_SLO = eINSTANCE.getSecuritySLO();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.SecurityCapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.SecurityCapabilityImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getSecurityCapability()
		 * @generated
		 */
		EClass SECURITY_CAPABILITY = eINSTANCE.getSecurityCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CAPABILITY__NAME = eINSTANCE.getSecurityCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Security Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CAPABILITY__SECURITY_CONTROLS = eINSTANCE.getSecurityCapability_SecurityControls();

		/**
		 * The meta object literal for the '<em><b>Data Center</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_CAPABILITY__DATA_CENTER = eINSTANCE.getSecurityCapability_DataCenter();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.CompositeSecurityMetricImpl <em>Composite Security Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.CompositeSecurityMetricImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCompositeSecurityMetric()
		 * @generated
		 */
		EClass COMPOSITE_SECURITY_METRIC = eINSTANCE.getCompositeSecurityMetric();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.security.impl.CompositeSecurityMetricInstanceImpl <em>Composite Security Metric Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.security.impl.CompositeSecurityMetricInstanceImpl
		 * @see eu.paasage.camel.security.impl.SecurityPackageImpl#getCompositeSecurityMetricInstance()
		 * @generated
		 */
		EClass COMPOSITE_SECURITY_METRIC_INSTANCE = eINSTANCE.getCompositeSecurityMetricInstance();

	}

} //SecurityPackage
