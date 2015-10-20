/**
 */
package eu.paasage.camel.execution;

import eu.paasage.camel.CamelPackage;

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
 * @see eu.paasage.camel.execution.ExecutionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ExecutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "execution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/execution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "execution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionPackage eINSTANCE = eu.paasage.camel.execution.impl.ExecutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.ExecutionModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.ExecutionModelImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getExecutionModel()
	 * @generated
	 */
	int EXECUTION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Action Realisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__ACTION_REALISATIONS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__EVENT_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__EXECUTION_CONTEXTS = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__MEASUREMENTS = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Slo Assessessments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__SLO_ASSESSESSMENTS = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rule Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL__RULE_TRIGGERS = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.ActionRealisationImpl <em>Action Realisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.ActionRealisationImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getActionRealisation()
	 * @generated
	 */
	int ACTION_REALISATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Low Level Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION__LOW_LEVEL_ACTIONS = 4;

	/**
	 * The number of structural features of the '<em>Action Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Action Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_REALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.ExecutionContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.ExecutionContextImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getExecutionContext()
	 * @generated
	 */
	int EXECUTION_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__TOTAL_COST = 4;

	/**
	 * The feature id for the '<em><b>Cost Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__COST_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Deployment Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__DEPLOYMENT_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Requirement Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT__REQUIREMENT_GROUP = 7;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.MeasurementImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EXECUTION_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__METRIC_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__RAW_DATA = 4;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASUREMENT_TIME = 5;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__SLO = 6;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__EVENT_INSTANCE = 7;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.ApplicationMeasurementImpl <em>Application Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.ApplicationMeasurementImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getApplicationMeasurement()
	 * @generated
	 */
	int APPLICATION_MEASUREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__EXECUTION_CONTEXT = MEASUREMENT__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__METRIC_INSTANCE = MEASUREMENT__METRIC_INSTANCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__VALUE = MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__RAW_DATA = MEASUREMENT__RAW_DATA;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__MEASUREMENT_TIME = MEASUREMENT__MEASUREMENT_TIME;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__SLO = MEASUREMENT__SLO;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__EVENT_INSTANCE = MEASUREMENT__EVENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT__APPLICATION = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Application Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Application Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.InternalComponentMeasurementImpl <em>Internal Component Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.InternalComponentMeasurementImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getInternalComponentMeasurement()
	 * @generated
	 */
	int INTERNAL_COMPONENT_MEASUREMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__EXECUTION_CONTEXT = MEASUREMENT__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__METRIC_INSTANCE = MEASUREMENT__METRIC_INSTANCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__VALUE = MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__RAW_DATA = MEASUREMENT__RAW_DATA;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__MEASUREMENT_TIME = MEASUREMENT__MEASUREMENT_TIME;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__SLO = MEASUREMENT__SLO;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__EVENT_INSTANCE = MEASUREMENT__EVENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Internal Component Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_INSTANCE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Component Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Internal Component Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.CommunicationMeasurementImpl <em>Communication Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.CommunicationMeasurementImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getCommunicationMeasurement()
	 * @generated
	 */
	int COMMUNICATION_MEASUREMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__EXECUTION_CONTEXT = MEASUREMENT__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__METRIC_INSTANCE = MEASUREMENT__METRIC_INSTANCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__VALUE = MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__RAW_DATA = MEASUREMENT__RAW_DATA;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__MEASUREMENT_TIME = MEASUREMENT__MEASUREMENT_TIME;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__SLO = MEASUREMENT__SLO;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__EVENT_INSTANCE = MEASUREMENT__EVENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Source VM Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__SOURCE_VM_INSTANCE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination VM Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT__DESTINATION_VM_INSTANCE = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Communication Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.VMMeasurementImpl <em>VM Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.VMMeasurementImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getVMMeasurement()
	 * @generated
	 */
	int VM_MEASUREMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__NAME = MEASUREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__EXECUTION_CONTEXT = MEASUREMENT__EXECUTION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Metric Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__METRIC_INSTANCE = MEASUREMENT__METRIC_INSTANCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__VALUE = MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Raw Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__RAW_DATA = MEASUREMENT__RAW_DATA;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__MEASUREMENT_TIME = MEASUREMENT__MEASUREMENT_TIME;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__SLO = MEASUREMENT__SLO;

	/**
	 * The feature id for the '<em><b>Event Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__EVENT_INSTANCE = MEASUREMENT__EVENT_INSTANCE;

	/**
	 * The feature id for the '<em><b>Vm Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT__VM_INSTANCE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VM Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl <em>SLO Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.SLOAssessmentImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getSLOAssessment()
	 * @generated
	 */
	int SLO_ASSESSMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Slo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__SLO = 1;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__EXECUTION_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__MEASUREMENT = 4;

	/**
	 * The feature id for the '<em><b>Assessment Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT__ASSESSMENT_TIME = 5;

	/**
	 * The number of structural features of the '<em>SLO Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>SLO Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLO_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.execution.impl.RuleTriggerImpl <em>Rule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.execution.impl.RuleTriggerImpl
	 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getRuleTrigger()
	 * @generated
	 */
	int RULE_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scalability Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__SCALABILITY_RULE = 1;

	/**
	 * The feature id for the '<em><b>Event Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__EVENT_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Action Realisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__ACTION_REALISATIONS = 3;

	/**
	 * The feature id for the '<em><b>Trigerring Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__TRIGERRING_TIME = 4;

	/**
	 * The feature id for the '<em><b>Execution Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER__EXECUTION_CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Rule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_TRIGGER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.ExecutionModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel
	 * @generated
	 */
	EClass getExecutionModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getActionRealisations <em>Action Realisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Realisations</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getActionRealisations()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_ActionRealisations();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getEventInstances <em>Event Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Instances</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getEventInstances()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_EventInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getExecutionContexts <em>Execution Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Contexts</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getExecutionContexts()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_ExecutionContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getMeasurements()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_Measurements();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getSloAssessessments <em>Slo Assessessments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slo Assessessments</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getSloAssessessments()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_SloAssessessments();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.execution.ExecutionModel#getRuleTriggers <em>Rule Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Triggers</em>'.
	 * @see eu.paasage.camel.execution.ExecutionModel#getRuleTriggers()
	 * @see #getExecutionModel()
	 * @generated
	 */
	EReference getExecutionModel_RuleTriggers();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.ActionRealisation <em>Action Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Realisation</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation
	 * @generated
	 */
	EClass getActionRealisation();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ActionRealisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation#getName()
	 * @see #getActionRealisation()
	 * @generated
	 */
	EAttribute getActionRealisation_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ActionRealisation#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation#getAction()
	 * @see #getActionRealisation()
	 * @generated
	 */
	EReference getActionRealisation_Action();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ActionRealisation#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation#getStartTime()
	 * @see #getActionRealisation()
	 * @generated
	 */
	EAttribute getActionRealisation_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ActionRealisation#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation#getEndTime()
	 * @see #getActionRealisation()
	 * @generated
	 */
	EAttribute getActionRealisation_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ActionRealisation#getLowLevelActions <em>Low Level Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low Level Actions</em>'.
	 * @see eu.paasage.camel.execution.ActionRealisation#getLowLevelActions()
	 * @see #getActionRealisation()
	 * @generated
	 */
	EAttribute getActionRealisation_LowLevelActions();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.ExecutionContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext
	 * @generated
	 */
	EClass getExecutionContext();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ExecutionContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getName()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EAttribute getExecutionContext_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ExecutionContext#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getApplication()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_Application();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ExecutionContext#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getStartTime()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EAttribute getExecutionContext_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ExecutionContext#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getEndTime()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EAttribute getExecutionContext_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.ExecutionContext#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getTotalCost()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EAttribute getExecutionContext_TotalCost();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ExecutionContext#getCostUnit <em>Cost Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cost Unit</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getCostUnit()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_CostUnit();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ExecutionContext#getDeploymentModel <em>Deployment Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment Model</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getDeploymentModel()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_DeploymentModel();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ExecutionContext#getRequirementGroup <em>Requirement Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Group</em>'.
	 * @see eu.paasage.camel.execution.ExecutionContext#getRequirementGroup()
	 * @see #getExecutionContext()
	 * @generated
	 */
	EReference getExecutionContext_RequirementGroup();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see eu.paasage.camel.execution.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.Measurement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getName()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.Measurement#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Context</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getExecutionContext()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_ExecutionContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.Measurement#getMetricInstance <em>Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric Instance</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getMetricInstance()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_MetricInstance();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.Measurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getValue()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Value();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.Measurement#getRawData <em>Raw Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Data</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getRawData()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_RawData();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.Measurement#getMeasurementTime <em>Measurement Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measurement Time</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getMeasurementTime()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_MeasurementTime();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.Measurement#getSlo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slo</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getSlo()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Slo();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.Measurement#getEventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Instance</em>'.
	 * @see eu.paasage.camel.execution.Measurement#getEventInstance()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_EventInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.ApplicationMeasurement <em>Application Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Measurement</em>'.
	 * @see eu.paasage.camel.execution.ApplicationMeasurement
	 * @generated
	 */
	EClass getApplicationMeasurement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.ApplicationMeasurement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see eu.paasage.camel.execution.ApplicationMeasurement#getApplication()
	 * @see #getApplicationMeasurement()
	 * @generated
	 */
	EReference getApplicationMeasurement_Application();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.InternalComponentMeasurement <em>Internal Component Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component Measurement</em>'.
	 * @see eu.paasage.camel.execution.InternalComponentMeasurement
	 * @generated
	 */
	EClass getInternalComponentMeasurement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.InternalComponentMeasurement#getInternalComponentInstance <em>Internal Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Component Instance</em>'.
	 * @see eu.paasage.camel.execution.InternalComponentMeasurement#getInternalComponentInstance()
	 * @see #getInternalComponentMeasurement()
	 * @generated
	 */
	EReference getInternalComponentMeasurement_InternalComponentInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.CommunicationMeasurement <em>Communication Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Measurement</em>'.
	 * @see eu.paasage.camel.execution.CommunicationMeasurement
	 * @generated
	 */
	EClass getCommunicationMeasurement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.CommunicationMeasurement#getSourceVMInstance <em>Source VM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source VM Instance</em>'.
	 * @see eu.paasage.camel.execution.CommunicationMeasurement#getSourceVMInstance()
	 * @see #getCommunicationMeasurement()
	 * @generated
	 */
	EReference getCommunicationMeasurement_SourceVMInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.CommunicationMeasurement#getDestinationVMInstance <em>Destination VM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination VM Instance</em>'.
	 * @see eu.paasage.camel.execution.CommunicationMeasurement#getDestinationVMInstance()
	 * @see #getCommunicationMeasurement()
	 * @generated
	 */
	EReference getCommunicationMeasurement_DestinationVMInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.VMMeasurement <em>VM Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Measurement</em>'.
	 * @see eu.paasage.camel.execution.VMMeasurement
	 * @generated
	 */
	EClass getVMMeasurement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.VMMeasurement#getVmInstance <em>Vm Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Instance</em>'.
	 * @see eu.paasage.camel.execution.VMMeasurement#getVmInstance()
	 * @see #getVMMeasurement()
	 * @generated
	 */
	EReference getVMMeasurement_VmInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.SLOAssessment <em>SLO Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SLO Assessment</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment
	 * @generated
	 */
	EClass getSLOAssessment();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.SLOAssessment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#getName()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EAttribute getSLOAssessment_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.SLOAssessment#getSlo <em>Slo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slo</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#getSlo()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EReference getSLOAssessment_Slo();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.SLOAssessment#isAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#isAssessment()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EAttribute getSLOAssessment_Assessment();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.SLOAssessment#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Context</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#getExecutionContext()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EReference getSLOAssessment_ExecutionContext();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.SLOAssessment#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurement</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#getMeasurement()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EReference getSLOAssessment_Measurement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.SLOAssessment#getAssessmentTime <em>Assessment Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment Time</em>'.
	 * @see eu.paasage.camel.execution.SLOAssessment#getAssessmentTime()
	 * @see #getSLOAssessment()
	 * @generated
	 */
	EAttribute getSLOAssessment_AssessmentTime();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.execution.RuleTrigger <em>Rule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Trigger</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger
	 * @generated
	 */
	EClass getRuleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.RuleTrigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getName()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EAttribute getRuleTrigger_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.RuleTrigger#getScalabilityRule <em>Scalability Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalability Rule</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getScalabilityRule()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EReference getRuleTrigger_ScalabilityRule();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.execution.RuleTrigger#getEventInstances <em>Event Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event Instances</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getEventInstances()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EReference getRuleTrigger_EventInstances();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.execution.RuleTrigger#getActionRealisations <em>Action Realisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action Realisations</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getActionRealisations()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EReference getRuleTrigger_ActionRealisations();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.execution.RuleTrigger#getTrigerringTime <em>Trigerring Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigerring Time</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getTrigerringTime()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EAttribute getRuleTrigger_TrigerringTime();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.execution.RuleTrigger#getExecutionContext <em>Execution Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Execution Context</em>'.
	 * @see eu.paasage.camel.execution.RuleTrigger#getExecutionContext()
	 * @see #getRuleTrigger()
	 * @generated
	 */
	EReference getRuleTrigger_ExecutionContext();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionFactory getExecutionFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.ExecutionModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.ExecutionModelImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getExecutionModel()
		 * @generated
		 */
		EClass EXECUTION_MODEL = eINSTANCE.getExecutionModel();

		/**
		 * The meta object literal for the '<em><b>Action Realisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__ACTION_REALISATIONS = eINSTANCE.getExecutionModel_ActionRealisations();

		/**
		 * The meta object literal for the '<em><b>Event Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__EVENT_INSTANCES = eINSTANCE.getExecutionModel_EventInstances();

		/**
		 * The meta object literal for the '<em><b>Execution Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__EXECUTION_CONTEXTS = eINSTANCE.getExecutionModel_ExecutionContexts();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__MEASUREMENTS = eINSTANCE.getExecutionModel_Measurements();

		/**
		 * The meta object literal for the '<em><b>Slo Assessessments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__SLO_ASSESSESSMENTS = eINSTANCE.getExecutionModel_SloAssessessments();

		/**
		 * The meta object literal for the '<em><b>Rule Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_MODEL__RULE_TRIGGERS = eINSTANCE.getExecutionModel_RuleTriggers();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.ActionRealisationImpl <em>Action Realisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.ActionRealisationImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getActionRealisation()
		 * @generated
		 */
		EClass ACTION_REALISATION = eINSTANCE.getActionRealisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REALISATION__NAME = eINSTANCE.getActionRealisation_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_REALISATION__ACTION = eINSTANCE.getActionRealisation_Action();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REALISATION__START_TIME = eINSTANCE.getActionRealisation_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REALISATION__END_TIME = eINSTANCE.getActionRealisation_EndTime();

		/**
		 * The meta object literal for the '<em><b>Low Level Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_REALISATION__LOW_LEVEL_ACTIONS = eINSTANCE.getActionRealisation_LowLevelActions();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.ExecutionContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.ExecutionContextImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getExecutionContext()
		 * @generated
		 */
		EClass EXECUTION_CONTEXT = eINSTANCE.getExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTEXT__NAME = eINSTANCE.getExecutionContext_Name();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__APPLICATION = eINSTANCE.getExecutionContext_Application();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTEXT__START_TIME = eINSTANCE.getExecutionContext_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTEXT__END_TIME = eINSTANCE.getExecutionContext_EndTime();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_CONTEXT__TOTAL_COST = eINSTANCE.getExecutionContext_TotalCost();

		/**
		 * The meta object literal for the '<em><b>Cost Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__COST_UNIT = eINSTANCE.getExecutionContext_CostUnit();

		/**
		 * The meta object literal for the '<em><b>Deployment Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__DEPLOYMENT_MODEL = eINSTANCE.getExecutionContext_DeploymentModel();

		/**
		 * The meta object literal for the '<em><b>Requirement Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONTEXT__REQUIREMENT_GROUP = eINSTANCE.getExecutionContext_RequirementGroup();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.MeasurementImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__NAME = eINSTANCE.getMeasurement_Name();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EXECUTION_CONTEXT = eINSTANCE.getMeasurement_ExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Metric Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__METRIC_INSTANCE = eINSTANCE.getMeasurement_MetricInstance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__VALUE = eINSTANCE.getMeasurement_Value();

		/**
		 * The meta object literal for the '<em><b>Raw Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__RAW_DATA = eINSTANCE.getMeasurement_RawData();

		/**
		 * The meta object literal for the '<em><b>Measurement Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__MEASUREMENT_TIME = eINSTANCE.getMeasurement_MeasurementTime();

		/**
		 * The meta object literal for the '<em><b>Slo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__SLO = eINSTANCE.getMeasurement_Slo();

		/**
		 * The meta object literal for the '<em><b>Event Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__EVENT_INSTANCE = eINSTANCE.getMeasurement_EventInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.ApplicationMeasurementImpl <em>Application Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.ApplicationMeasurementImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getApplicationMeasurement()
		 * @generated
		 */
		EClass APPLICATION_MEASUREMENT = eINSTANCE.getApplicationMeasurement();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_MEASUREMENT__APPLICATION = eINSTANCE.getApplicationMeasurement_Application();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.InternalComponentMeasurementImpl <em>Internal Component Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.InternalComponentMeasurementImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getInternalComponentMeasurement()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT_MEASUREMENT = eINSTANCE.getInternalComponentMeasurement();

		/**
		 * The meta object literal for the '<em><b>Internal Component Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT_MEASUREMENT__INTERNAL_COMPONENT_INSTANCE = eINSTANCE.getInternalComponentMeasurement_InternalComponentInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.CommunicationMeasurementImpl <em>Communication Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.CommunicationMeasurementImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getCommunicationMeasurement()
		 * @generated
		 */
		EClass COMMUNICATION_MEASUREMENT = eINSTANCE.getCommunicationMeasurement();

		/**
		 * The meta object literal for the '<em><b>Source VM Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEASUREMENT__SOURCE_VM_INSTANCE = eINSTANCE.getCommunicationMeasurement_SourceVMInstance();

		/**
		 * The meta object literal for the '<em><b>Destination VM Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_MEASUREMENT__DESTINATION_VM_INSTANCE = eINSTANCE.getCommunicationMeasurement_DestinationVMInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.VMMeasurementImpl <em>VM Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.VMMeasurementImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getVMMeasurement()
		 * @generated
		 */
		EClass VM_MEASUREMENT = eINSTANCE.getVMMeasurement();

		/**
		 * The meta object literal for the '<em><b>Vm Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_MEASUREMENT__VM_INSTANCE = eINSTANCE.getVMMeasurement_VmInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.SLOAssessmentImpl <em>SLO Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.SLOAssessmentImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getSLOAssessment()
		 * @generated
		 */
		EClass SLO_ASSESSMENT = eINSTANCE.getSLOAssessment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_ASSESSMENT__NAME = eINSTANCE.getSLOAssessment_Name();

		/**
		 * The meta object literal for the '<em><b>Slo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_ASSESSMENT__SLO = eINSTANCE.getSLOAssessment_Slo();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_ASSESSMENT__ASSESSMENT = eINSTANCE.getSLOAssessment_Assessment();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_ASSESSMENT__EXECUTION_CONTEXT = eINSTANCE.getSLOAssessment_ExecutionContext();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLO_ASSESSMENT__MEASUREMENT = eINSTANCE.getSLOAssessment_Measurement();

		/**
		 * The meta object literal for the '<em><b>Assessment Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLO_ASSESSMENT__ASSESSMENT_TIME = eINSTANCE.getSLOAssessment_AssessmentTime();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.execution.impl.RuleTriggerImpl <em>Rule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.execution.impl.RuleTriggerImpl
		 * @see eu.paasage.camel.execution.impl.ExecutionPackageImpl#getRuleTrigger()
		 * @generated
		 */
		EClass RULE_TRIGGER = eINSTANCE.getRuleTrigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TRIGGER__NAME = eINSTANCE.getRuleTrigger_Name();

		/**
		 * The meta object literal for the '<em><b>Scalability Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TRIGGER__SCALABILITY_RULE = eINSTANCE.getRuleTrigger_ScalabilityRule();

		/**
		 * The meta object literal for the '<em><b>Event Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TRIGGER__EVENT_INSTANCES = eINSTANCE.getRuleTrigger_EventInstances();

		/**
		 * The meta object literal for the '<em><b>Action Realisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TRIGGER__ACTION_REALISATIONS = eINSTANCE.getRuleTrigger_ActionRealisations();

		/**
		 * The meta object literal for the '<em><b>Trigerring Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_TRIGGER__TRIGERRING_TIME = eINSTANCE.getRuleTrigger_TrigerringTime();

		/**
		 * The meta object literal for the '<em><b>Execution Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_TRIGGER__EXECUTION_CONTEXT = eINSTANCE.getRuleTrigger_ExecutionContext();

	}

} //ExecutionPackage
