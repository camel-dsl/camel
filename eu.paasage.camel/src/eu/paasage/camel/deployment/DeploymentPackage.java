/**
 */
package eu.paasage.camel.deployment;

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
 * @see eu.paasage.camel.deployment.DeploymentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface DeploymentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/deployment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeploymentPackage eINSTANCE = eu.paasage.camel.deployment.impl.DeploymentPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.DeploymentElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.DeploymentElementImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getDeploymentElement()
	 * @generated
	 */
	int DEPLOYMENT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.DeploymentModelImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getDeploymentModel()
	 * @generated
	 */
	int DEPLOYMENT_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Internal Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__INTERNAL_COMPONENTS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Component Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__INTERNAL_COMPONENT_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__VMS = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vm Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__VM_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__COMMUNICATIONS = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__COMMUNICATION_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Hostings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__HOSTINGS = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hosting Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__HOSTING_INSTANCES = CamelPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vm Requirement Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__VM_REQUIREMENT_SETS = CamelPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Global VM Requirement Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL__GLOBAL_VM_REQUIREMENT_SET = CamelPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ComponentImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_COMMUNICATIONS = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROVIDED_HOSTS = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIGURATIONS = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.InternalComponentImpl <em>Internal Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.InternalComponentImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getInternalComponent()
	 * @generated
	 */
	int INTERNAL_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__PROVIDED_COMMUNICATIONS = COMPONENT__PROVIDED_COMMUNICATIONS;

	/**
	 * The feature id for the '<em><b>Provided Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__PROVIDED_HOSTS = COMPONENT__PROVIDED_HOSTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__CONFIGURATIONS = COMPONENT__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Composite Internal Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__REQUIRED_COMMUNICATIONS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Host</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT__REQUIRED_HOST = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT___CONTAINS__INTERNALCOMPONENT_INTERNALCOMPONENT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.VMImpl <em>VM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.VMImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVM()
	 * @generated
	 */
	int VM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDED_COMMUNICATIONS = COMPONENT__PROVIDED_COMMUNICATIONS;

	/**
	 * The feature id for the '<em><b>Provided Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__PROVIDED_HOSTS = COMPONENT__PROVIDED_HOSTS;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CONFIGURATIONS = COMPONENT__CONFIGURATIONS;

	/**
	 * The feature id for the '<em><b>Vm Requirement Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VM_REQUIREMENT_SET = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>VM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl <em>VM Requirement Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.VMRequirementSetImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVMRequirementSet()
	 * @generated
	 */
	int VM_REQUIREMENT_SET = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Location Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__LOCATION_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Provider Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__PROVIDER_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Qualitative Hardware Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Quantitative Hardware Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Os Or Image Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET__OS_OR_IMAGE_REQUIREMENT = 5;

	/**
	 * The number of structural features of the '<em>VM Requirement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VM Requirement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_REQUIREMENT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ConfigurationImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Download Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DOWNLOAD_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upload Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__UPLOAD_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Install Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__INSTALL_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configure Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONFIGURE_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__START_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stop Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__STOP_COMMAND = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.CommunicationImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__PROVIDED_COMMUNICATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Communication</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__REQUIRED_COMMUNICATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provided Port Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__PROVIDED_PORT_CONFIGURATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Port Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__REQUIRED_PORT_CONFIGURATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.CommunicationPortImpl <em>Communication Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.CommunicationPortImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationPort()
	 * @generated
	 */
	int COMMUNICATION_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT__PORT_NUMBER = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ProvidedCommunicationImpl <em>Provided Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ProvidedCommunicationImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedCommunication()
	 * @generated
	 */
	int PROVIDED_COMMUNICATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION__NAME = COMMUNICATION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION__PORT_NUMBER = COMMUNICATION_PORT__PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Provided Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.RequiredCommunicationImpl <em>Required Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.RequiredCommunicationImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredCommunication()
	 * @generated
	 */
	int REQUIRED_COMMUNICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION__NAME = COMMUNICATION_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION__PORT_NUMBER = COMMUNICATION_PORT__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION__IS_MANDATORY = COMMUNICATION_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_FEATURE_COUNT = COMMUNICATION_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_OPERATION_COUNT = COMMUNICATION_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.HostingImpl <em>Hosting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.HostingImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHosting()
	 * @generated
	 */
	int HOSTING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Provided Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__PROVIDED_HOST = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__REQUIRED_HOST = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Host Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__PROVIDED_HOST_CONFIGURATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Host Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING__REQUIRED_HOST_CONFIGURATION = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hosting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.HostingPortImpl <em>Hosting Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.HostingPortImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingPort()
	 * @generated
	 */
	int HOSTING_PORT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Hosting Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hosting Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ProvidedHostImpl <em>Provided Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ProvidedHostImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedHost()
	 * @generated
	 */
	int PROVIDED_HOST = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST__NAME = HOSTING_PORT__NAME;

	/**
	 * The number of structural features of the '<em>Provided Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_FEATURE_COUNT = HOSTING_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_OPERATION_COUNT = HOSTING_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.RequiredHostImpl <em>Required Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.RequiredHostImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredHost()
	 * @generated
	 */
	int REQUIRED_HOST = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST__NAME = HOSTING_PORT__NAME;

	/**
	 * The number of structural features of the '<em>Required Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_FEATURE_COUNT = HOSTING_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_OPERATION_COUNT = HOSTING_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ComponentInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Communication Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provided Host Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instantiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__INSTANTIATED_ON = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destroyed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DESTROYED_ON = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.InternalComponentInstanceImpl <em>Internal Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.InternalComponentInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getInternalComponentInstance()
	 * @generated
	 */
	int INTERNAL_COMPONENT_INSTANCE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Provided Communication Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES = COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES;

	/**
	 * The feature id for the '<em><b>Provided Host Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES = COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES;

	/**
	 * The feature id for the '<em><b>Instantiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__INSTANTIATED_ON = COMPONENT_INSTANCE__INSTANTIATED_ON;

	/**
	 * The feature id for the '<em><b>Destroyed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__DESTROYED_ON = COMPONENT_INSTANCE__DESTROYED_ON;

	/**
	 * The feature id for the '<em><b>Required Communication Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__REQUIRED_COMMUNICATION_INSTANCES = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Host Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE__REQUIRED_HOST_INSTANCE = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Internal Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Internal Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COMPONENT_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.VMInstanceImpl <em>VM Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.VMInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVMInstance()
	 * @generated
	 */
	int VM_INSTANCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>Provided Communication Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES = COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES;

	/**
	 * The feature id for the '<em><b>Provided Host Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__PROVIDED_HOST_INSTANCES = COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES;

	/**
	 * The feature id for the '<em><b>Instantiated On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__INSTANTIATED_ON = COMPONENT_INSTANCE__INSTANTIATED_ON;

	/**
	 * The feature id for the '<em><b>Destroyed On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__DESTROYED_ON = COMPONENT_INSTANCE__DESTROYED_ON;

	/**
	 * The feature id for the '<em><b>Vm Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__VM_TYPE = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vm Type Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__VM_TYPE_VALUE = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE__IP = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VM Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Check Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE___CHECK_DATES__VMINSTANCE = COMPONENT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>VM Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_INSTANCE_OPERATION_COUNT = COMPONENT_INSTANCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.CommunicationInstanceImpl <em>Communication Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.CommunicationInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationInstance()
	 * @generated
	 */
	int COMMUNICATION_INSTANCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Communication Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE__PROVIDED_COMMUNICATION_INSTANCE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Communication Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE__REQUIRED_COMMUNICATION_INSTANCE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_INSTANCE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.CommunicationPortInstanceImpl <em>Communication Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.CommunicationPortInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationPortInstance()
	 * @generated
	 */
	int COMMUNICATION_PORT_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_INSTANCE__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_INSTANCE__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Communication Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_INSTANCE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Communication Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_PORT_INSTANCE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ProvidedCommunicationInstanceImpl <em>Provided Communication Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ProvidedCommunicationInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedCommunicationInstance()
	 * @generated
	 */
	int PROVIDED_COMMUNICATION_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_INSTANCE__NAME = COMMUNICATION_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_INSTANCE__TYPE = COMMUNICATION_PORT_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Provided Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_INSTANCE_FEATURE_COUNT = COMMUNICATION_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_COMMUNICATION_INSTANCE_OPERATION_COUNT = COMMUNICATION_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.RequiredCommunicationInstanceImpl <em>Required Communication Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.RequiredCommunicationInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredCommunicationInstance()
	 * @generated
	 */
	int REQUIRED_COMMUNICATION_INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_INSTANCE__NAME = COMMUNICATION_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_INSTANCE__TYPE = COMMUNICATION_PORT_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Required Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_INSTANCE_FEATURE_COUNT = COMMUNICATION_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Communication Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_COMMUNICATION_INSTANCE_OPERATION_COUNT = COMMUNICATION_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.HostingInstanceImpl <em>Hosting Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.HostingInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingInstance()
	 * @generated
	 */
	int HOSTING_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Host Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE__PROVIDED_HOST_INSTANCE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Host Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE__REQUIRED_HOST_INSTANCE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hosting Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Hosting Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_INSTANCE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.HostingPortInstanceImpl <em>Hosting Port Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.HostingPortInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingPortInstance()
	 * @generated
	 */
	int HOSTING_PORT_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_INSTANCE__NAME = DEPLOYMENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_INSTANCE__TYPE = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hosting Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_INSTANCE_FEATURE_COUNT = DEPLOYMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hosting Port Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTING_PORT_INSTANCE_OPERATION_COUNT = DEPLOYMENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.ProvidedHostInstanceImpl <em>Provided Host Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.ProvidedHostInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedHostInstance()
	 * @generated
	 */
	int PROVIDED_HOST_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_INSTANCE__NAME = HOSTING_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_INSTANCE__TYPE = HOSTING_PORT_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Provided Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_INSTANCE_FEATURE_COUNT = HOSTING_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_HOST_INSTANCE_OPERATION_COUNT = HOSTING_PORT_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.impl.RequiredHostInstanceImpl <em>Required Host Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.impl.RequiredHostInstanceImpl
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredHostInstance()
	 * @generated
	 */
	int REQUIRED_HOST_INSTANCE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_INSTANCE__NAME = HOSTING_PORT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_INSTANCE__TYPE = HOSTING_PORT_INSTANCE__TYPE;

	/**
	 * The number of structural features of the '<em>Required Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_INSTANCE_FEATURE_COUNT = HOSTING_PORT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Host Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_HOST_INSTANCE_OPERATION_COUNT = HOSTING_PORT_INSTANCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link eu.paasage.camel.deployment.CommunicationType <em>Communication Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.deployment.CommunicationType
	 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationType()
	 * @generated
	 */
	int COMMUNICATION_TYPE = 26;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.DeploymentElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentElement
	 * @generated
	 */
	EClass getDeploymentElement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.DeploymentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentElement#getName()
	 * @see #getDeploymentElement()
	 * @generated
	 */
	EAttribute getDeploymentElement_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.DeploymentModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel
	 * @generated
	 */
	EClass getDeploymentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getInternalComponents <em>Internal Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Components</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getInternalComponents()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_InternalComponents();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getInternalComponentInstances <em>Internal Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Component Instances</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getInternalComponentInstances()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_InternalComponentInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getVms <em>Vms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vms</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getVms()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_Vms();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getVmInstances <em>Vm Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Instances</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getVmInstances()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_VmInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communications</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getCommunications()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_Communications();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getHostings <em>Hostings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hostings</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getHostings()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_Hostings();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getCommunicationInstances <em>Communication Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Instances</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getCommunicationInstances()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_CommunicationInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getHostingInstances <em>Hosting Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosting Instances</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getHostingInstances()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_HostingInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.DeploymentModel#getVmRequirementSets <em>Vm Requirement Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vm Requirement Sets</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getVmRequirementSets()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_VmRequirementSets();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.DeploymentModel#getGlobalVMRequirementSet <em>Global VM Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global VM Requirement Set</em>'.
	 * @see eu.paasage.camel.deployment.DeploymentModel#getGlobalVMRequirementSet()
	 * @see #getDeploymentModel()
	 * @generated
	 */
	EReference getDeploymentModel_GlobalVMRequirementSet();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see eu.paasage.camel.deployment.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.Component#getProvidedCommunications <em>Provided Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Communications</em>'.
	 * @see eu.paasage.camel.deployment.Component#getProvidedCommunications()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedCommunications();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.Component#getProvidedHosts <em>Provided Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Hosts</em>'.
	 * @see eu.paasage.camel.deployment.Component#getProvidedHosts()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ProvidedHosts();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.Component#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see eu.paasage.camel.deployment.Component#getConfigurations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Configurations();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.InternalComponent <em>Internal Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponent
	 * @generated
	 */
	EClass getInternalComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.InternalComponent#getRequiredCommunications <em>Required Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Communications</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponent#getRequiredCommunications()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_RequiredCommunications();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.InternalComponent#getCompositeInternalComponents <em>Composite Internal Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composite Internal Components</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponent#getCompositeInternalComponents()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_CompositeInternalComponents();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.InternalComponent#getRequiredHost <em>Required Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Host</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponent#getRequiredHost()
	 * @see #getInternalComponent()
	 * @generated
	 */
	EReference getInternalComponent_RequiredHost();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.deployment.InternalComponent#contains(eu.paasage.camel.deployment.InternalComponent, eu.paasage.camel.deployment.InternalComponent) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see eu.paasage.camel.deployment.InternalComponent#contains(eu.paasage.camel.deployment.InternalComponent, eu.paasage.camel.deployment.InternalComponent)
	 * @generated
	 */
	EOperation getInternalComponent__Contains__InternalComponent_InternalComponent();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.VM <em>VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM</em>'.
	 * @see eu.paasage.camel.deployment.VM
	 * @generated
	 */
	EClass getVM();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VM#getVmRequirementSet <em>Vm Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Requirement Set</em>'.
	 * @see eu.paasage.camel.deployment.VM#getVmRequirementSet()
	 * @see #getVM()
	 * @generated
	 */
	EReference getVM_VmRequirementSet();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.VMRequirementSet <em>VM Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Requirement Set</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet
	 * @generated
	 */
	EClass getVMRequirementSet();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.VMRequirementSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getName()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EAttribute getVMRequirementSet_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMRequirementSet#getLocationRequirement <em>Location Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location Requirement</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getLocationRequirement()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EReference getVMRequirementSet_LocationRequirement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMRequirementSet#getProviderRequirement <em>Provider Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider Requirement</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getProviderRequirement()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EReference getVMRequirementSet_ProviderRequirement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qualitative Hardware Requirement</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getQualitativeHardwareRequirement()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EReference getVMRequirementSet_QualitativeHardwareRequirement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantitative Hardware Requirement</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getQuantitativeHardwareRequirement()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EReference getVMRequirementSet_QuantitativeHardwareRequirement();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMRequirementSet#getOsOrImageRequirement <em>Os Or Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Os Or Image Requirement</em>'.
	 * @see eu.paasage.camel.deployment.VMRequirementSet#getOsOrImageRequirement()
	 * @see #getVMRequirementSet()
	 * @generated
	 */
	EReference getVMRequirementSet_OsOrImageRequirement();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see eu.paasage.camel.deployment.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getDownloadCommand <em>Download Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getDownloadCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_DownloadCommand();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getUploadCommand <em>Upload Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getUploadCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_UploadCommand();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getInstallCommand <em>Install Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Install Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getInstallCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_InstallCommand();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getConfigureCommand <em>Configure Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configure Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getConfigureCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_ConfigureCommand();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getStartCommand <em>Start Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getStartCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_StartCommand();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Configuration#getStopCommand <em>Stop Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Command</em>'.
	 * @see eu.paasage.camel.deployment.Configuration#getStopCommand()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_StopCommand();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see eu.paasage.camel.deployment.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.Communication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.Communication#getType()
	 * @see #getCommunication()
	 * @generated
	 */
	EAttribute getCommunication_Type();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.Communication#getRequiredCommunication <em>Required Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Communication</em>'.
	 * @see eu.paasage.camel.deployment.Communication#getRequiredCommunication()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_RequiredCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.Communication#getProvidedPortConfiguration <em>Provided Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Port Configuration</em>'.
	 * @see eu.paasage.camel.deployment.Communication#getProvidedPortConfiguration()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_ProvidedPortConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.Communication#getRequiredPortConfiguration <em>Required Port Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Port Configuration</em>'.
	 * @see eu.paasage.camel.deployment.Communication#getRequiredPortConfiguration()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_RequiredPortConfiguration();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.Communication#getProvidedCommunication <em>Provided Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Communication</em>'.
	 * @see eu.paasage.camel.deployment.Communication#getProvidedCommunication()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_ProvidedCommunication();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.CommunicationPort <em>Communication Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Port</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationPort
	 * @generated
	 */
	EClass getCommunicationPort();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.CommunicationPort#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationPort#getPortNumber()
	 * @see #getCommunicationPort()
	 * @generated
	 */
	EAttribute getCommunicationPort_PortNumber();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.ProvidedCommunication <em>Provided Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Communication</em>'.
	 * @see eu.paasage.camel.deployment.ProvidedCommunication
	 * @generated
	 */
	EClass getProvidedCommunication();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.RequiredCommunication <em>Required Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Communication</em>'.
	 * @see eu.paasage.camel.deployment.RequiredCommunication
	 * @generated
	 */
	EClass getRequiredCommunication();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.RequiredCommunication#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see eu.paasage.camel.deployment.RequiredCommunication#isIsMandatory()
	 * @see #getRequiredCommunication()
	 * @generated
	 */
	EAttribute getRequiredCommunication_IsMandatory();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.Hosting <em>Hosting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosting</em>'.
	 * @see eu.paasage.camel.deployment.Hosting
	 * @generated
	 */
	EClass getHosting();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.Hosting#getProvidedHost <em>Provided Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Host</em>'.
	 * @see eu.paasage.camel.deployment.Hosting#getProvidedHost()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_ProvidedHost();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.Hosting#getRequiredHost <em>Required Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Host</em>'.
	 * @see eu.paasage.camel.deployment.Hosting#getRequiredHost()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_RequiredHost();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.Hosting#getProvidedHostConfiguration <em>Provided Host Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided Host Configuration</em>'.
	 * @see eu.paasage.camel.deployment.Hosting#getProvidedHostConfiguration()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_ProvidedHostConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.Hosting#getRequiredHostConfiguration <em>Required Host Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Host Configuration</em>'.
	 * @see eu.paasage.camel.deployment.Hosting#getRequiredHostConfiguration()
	 * @see #getHosting()
	 * @generated
	 */
	EReference getHosting_RequiredHostConfiguration();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.HostingPort <em>Hosting Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosting Port</em>'.
	 * @see eu.paasage.camel.deployment.HostingPort
	 * @generated
	 */
	EClass getHostingPort();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.ProvidedHost <em>Provided Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Host</em>'.
	 * @see eu.paasage.camel.deployment.ProvidedHost
	 * @generated
	 */
	EClass getProvidedHost();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.RequiredHost <em>Required Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Host</em>'.
	 * @see eu.paasage.camel.deployment.RequiredHost
	 * @generated
	 */
	EClass getRequiredHost();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.ComponentInstance#getProvidedCommunicationInstances <em>Provided Communication Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Communication Instances</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance#getProvidedCommunicationInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ProvidedCommunicationInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.ComponentInstance#getProvidedHostInstances <em>Provided Host Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Host Instances</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance#getProvidedHostInstances()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ProvidedHostInstances();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.ComponentInstance#getInstantiatedOn <em>Instantiated On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiated On</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance#getInstantiatedOn()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_InstantiatedOn();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.ComponentInstance#getDestroyedOn <em>Destroyed On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destroyed On</em>'.
	 * @see eu.paasage.camel.deployment.ComponentInstance#getDestroyedOn()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_DestroyedOn();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.InternalComponentInstance <em>Internal Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Component Instance</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponentInstance
	 * @generated
	 */
	EClass getInternalComponentInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.deployment.InternalComponentInstance#getRequiredCommunicationInstances <em>Required Communication Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Communication Instances</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponentInstance#getRequiredCommunicationInstances()
	 * @see #getInternalComponentInstance()
	 * @generated
	 */
	EReference getInternalComponentInstance_RequiredCommunicationInstances();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.deployment.InternalComponentInstance#getRequiredHostInstance <em>Required Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Host Instance</em>'.
	 * @see eu.paasage.camel.deployment.InternalComponentInstance#getRequiredHostInstance()
	 * @see #getInternalComponentInstance()
	 * @generated
	 */
	EReference getInternalComponentInstance_RequiredHostInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.VMInstance <em>VM Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VM Instance</em>'.
	 * @see eu.paasage.camel.deployment.VMInstance
	 * @generated
	 */
	EClass getVMInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMInstance#getVmType <em>Vm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Type</em>'.
	 * @see eu.paasage.camel.deployment.VMInstance#getVmType()
	 * @see #getVMInstance()
	 * @generated
	 */
	EReference getVMInstance_VmType();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.deployment.VMInstance#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see eu.paasage.camel.deployment.VMInstance#getIp()
	 * @see #getVMInstance()
	 * @generated
	 */
	EAttribute getVMInstance_Ip();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.VMInstance#getVmTypeValue <em>Vm Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm Type Value</em>'.
	 * @see eu.paasage.camel.deployment.VMInstance#getVmTypeValue()
	 * @see #getVMInstance()
	 * @generated
	 */
	EReference getVMInstance_VmTypeValue();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.deployment.VMInstance#checkDates(eu.paasage.camel.deployment.VMInstance) <em>Check Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Dates</em>' operation.
	 * @see eu.paasage.camel.deployment.VMInstance#checkDates(eu.paasage.camel.deployment.VMInstance)
	 * @generated
	 */
	EOperation getVMInstance__CheckDates__VMInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.CommunicationInstance <em>Communication Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Instance</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationInstance
	 * @generated
	 */
	EClass getCommunicationInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.CommunicationInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationInstance#getType()
	 * @see #getCommunicationInstance()
	 * @generated
	 */
	EReference getCommunicationInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.CommunicationInstance#getProvidedCommunicationInstance <em>Provided Communication Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Communication Instance</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationInstance#getProvidedCommunicationInstance()
	 * @see #getCommunicationInstance()
	 * @generated
	 */
	EReference getCommunicationInstance_ProvidedCommunicationInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.CommunicationInstance#getRequiredCommunicationInstance <em>Required Communication Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Communication Instance</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationInstance#getRequiredCommunicationInstance()
	 * @see #getCommunicationInstance()
	 * @generated
	 */
	EReference getCommunicationInstance_RequiredCommunicationInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.CommunicationPortInstance <em>Communication Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Port Instance</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationPortInstance
	 * @generated
	 */
	EClass getCommunicationPortInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.CommunicationPortInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationPortInstance#getType()
	 * @see #getCommunicationPortInstance()
	 * @generated
	 */
	EReference getCommunicationPortInstance_Type();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.ProvidedCommunicationInstance <em>Provided Communication Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Communication Instance</em>'.
	 * @see eu.paasage.camel.deployment.ProvidedCommunicationInstance
	 * @generated
	 */
	EClass getProvidedCommunicationInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.RequiredCommunicationInstance <em>Required Communication Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Communication Instance</em>'.
	 * @see eu.paasage.camel.deployment.RequiredCommunicationInstance
	 * @generated
	 */
	EClass getRequiredCommunicationInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.HostingInstance <em>Hosting Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosting Instance</em>'.
	 * @see eu.paasage.camel.deployment.HostingInstance
	 * @generated
	 */
	EClass getHostingInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.HostingInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.HostingInstance#getType()
	 * @see #getHostingInstance()
	 * @generated
	 */
	EReference getHostingInstance_Type();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.HostingInstance#getProvidedHostInstance <em>Provided Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Host Instance</em>'.
	 * @see eu.paasage.camel.deployment.HostingInstance#getProvidedHostInstance()
	 * @see #getHostingInstance()
	 * @generated
	 */
	EReference getHostingInstance_ProvidedHostInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.HostingInstance#getRequiredHostInstance <em>Required Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Host Instance</em>'.
	 * @see eu.paasage.camel.deployment.HostingInstance#getRequiredHostInstance()
	 * @see #getHostingInstance()
	 * @generated
	 */
	EReference getHostingInstance_RequiredHostInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.HostingPortInstance <em>Hosting Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosting Port Instance</em>'.
	 * @see eu.paasage.camel.deployment.HostingPortInstance
	 * @generated
	 */
	EClass getHostingPortInstance();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.deployment.HostingPortInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see eu.paasage.camel.deployment.HostingPortInstance#getType()
	 * @see #getHostingPortInstance()
	 * @generated
	 */
	EReference getHostingPortInstance_Type();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.ProvidedHostInstance <em>Provided Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Host Instance</em>'.
	 * @see eu.paasage.camel.deployment.ProvidedHostInstance
	 * @generated
	 */
	EClass getProvidedHostInstance();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.deployment.RequiredHostInstance <em>Required Host Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Host Instance</em>'.
	 * @see eu.paasage.camel.deployment.RequiredHostInstance
	 * @generated
	 */
	EClass getRequiredHostInstance();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.deployment.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Type</em>'.
	 * @see eu.paasage.camel.deployment.CommunicationType
	 * @generated
	 */
	EEnum getCommunicationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeploymentFactory getDeploymentFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.DeploymentElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.DeploymentElementImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getDeploymentElement()
		 * @generated
		 */
		EClass DEPLOYMENT_ELEMENT = eINSTANCE.getDeploymentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_ELEMENT__NAME = eINSTANCE.getDeploymentElement_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.DeploymentModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.DeploymentModelImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getDeploymentModel()
		 * @generated
		 */
		EClass DEPLOYMENT_MODEL = eINSTANCE.getDeploymentModel();

		/**
		 * The meta object literal for the '<em><b>Internal Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__INTERNAL_COMPONENTS = eINSTANCE.getDeploymentModel_InternalComponents();

		/**
		 * The meta object literal for the '<em><b>Internal Component Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__INTERNAL_COMPONENT_INSTANCES = eINSTANCE.getDeploymentModel_InternalComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Vms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__VMS = eINSTANCE.getDeploymentModel_Vms();

		/**
		 * The meta object literal for the '<em><b>Vm Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__VM_INSTANCES = eINSTANCE.getDeploymentModel_VmInstances();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__COMMUNICATIONS = eINSTANCE.getDeploymentModel_Communications();

		/**
		 * The meta object literal for the '<em><b>Hostings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__HOSTINGS = eINSTANCE.getDeploymentModel_Hostings();

		/**
		 * The meta object literal for the '<em><b>Communication Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__COMMUNICATION_INSTANCES = eINSTANCE.getDeploymentModel_CommunicationInstances();

		/**
		 * The meta object literal for the '<em><b>Hosting Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__HOSTING_INSTANCES = eINSTANCE.getDeploymentModel_HostingInstances();

		/**
		 * The meta object literal for the '<em><b>Vm Requirement Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__VM_REQUIREMENT_SETS = eINSTANCE.getDeploymentModel_VmRequirementSets();

		/**
		 * The meta object literal for the '<em><b>Global VM Requirement Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_MODEL__GLOBAL_VM_REQUIREMENT_SET = eINSTANCE.getDeploymentModel_GlobalVMRequirementSet();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ComponentImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Provided Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_COMMUNICATIONS = eINSTANCE.getComponent_ProvidedCommunications();

		/**
		 * The meta object literal for the '<em><b>Provided Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROVIDED_HOSTS = eINSTANCE.getComponent_ProvidedHosts();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIGURATIONS = eINSTANCE.getComponent_Configurations();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.InternalComponentImpl <em>Internal Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.InternalComponentImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getInternalComponent()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT = eINSTANCE.getInternalComponent();

		/**
		 * The meta object literal for the '<em><b>Required Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__REQUIRED_COMMUNICATIONS = eINSTANCE.getInternalComponent_RequiredCommunications();

		/**
		 * The meta object literal for the '<em><b>Composite Internal Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__COMPOSITE_INTERNAL_COMPONENTS = eINSTANCE.getInternalComponent_CompositeInternalComponents();

		/**
		 * The meta object literal for the '<em><b>Required Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT__REQUIRED_HOST = eINSTANCE.getInternalComponent_RequiredHost();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTERNAL_COMPONENT___CONTAINS__INTERNALCOMPONENT_INTERNALCOMPONENT = eINSTANCE.getInternalComponent__Contains__InternalComponent_InternalComponent();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.VMImpl <em>VM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.VMImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVM()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVM();

		/**
		 * The meta object literal for the '<em><b>Vm Requirement Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM__VM_REQUIREMENT_SET = eINSTANCE.getVM_VmRequirementSet();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.VMRequirementSetImpl <em>VM Requirement Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.VMRequirementSetImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVMRequirementSet()
		 * @generated
		 */
		EClass VM_REQUIREMENT_SET = eINSTANCE.getVMRequirementSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_REQUIREMENT_SET__NAME = eINSTANCE.getVMRequirementSet_Name();

		/**
		 * The meta object literal for the '<em><b>Location Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_REQUIREMENT_SET__LOCATION_REQUIREMENT = eINSTANCE.getVMRequirementSet_LocationRequirement();

		/**
		 * The meta object literal for the '<em><b>Provider Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_REQUIREMENT_SET__PROVIDER_REQUIREMENT = eINSTANCE.getVMRequirementSet_ProviderRequirement();

		/**
		 * The meta object literal for the '<em><b>Qualitative Hardware Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getVMRequirementSet_QualitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Quantitative Hardware Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getVMRequirementSet_QuantitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Os Or Image Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_REQUIREMENT_SET__OS_OR_IMAGE_REQUIREMENT = eINSTANCE.getVMRequirementSet_OsOrImageRequirement();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ConfigurationImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Download Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__DOWNLOAD_COMMAND = eINSTANCE.getConfiguration_DownloadCommand();

		/**
		 * The meta object literal for the '<em><b>Upload Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__UPLOAD_COMMAND = eINSTANCE.getConfiguration_UploadCommand();

		/**
		 * The meta object literal for the '<em><b>Install Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__INSTALL_COMMAND = eINSTANCE.getConfiguration_InstallCommand();

		/**
		 * The meta object literal for the '<em><b>Configure Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CONFIGURE_COMMAND = eINSTANCE.getConfiguration_ConfigureCommand();

		/**
		 * The meta object literal for the '<em><b>Start Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__START_COMMAND = eINSTANCE.getConfiguration_StartCommand();

		/**
		 * The meta object literal for the '<em><b>Stop Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__STOP_COMMAND = eINSTANCE.getConfiguration_StopCommand();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.CommunicationImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION__TYPE = eINSTANCE.getCommunication_Type();

		/**
		 * The meta object literal for the '<em><b>Required Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__REQUIRED_COMMUNICATION = eINSTANCE.getCommunication_RequiredCommunication();

		/**
		 * The meta object literal for the '<em><b>Provided Port Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__PROVIDED_PORT_CONFIGURATION = eINSTANCE.getCommunication_ProvidedPortConfiguration();

		/**
		 * The meta object literal for the '<em><b>Required Port Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__REQUIRED_PORT_CONFIGURATION = eINSTANCE.getCommunication_RequiredPortConfiguration();

		/**
		 * The meta object literal for the '<em><b>Provided Communication</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__PROVIDED_COMMUNICATION = eINSTANCE.getCommunication_ProvidedCommunication();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.CommunicationPortImpl <em>Communication Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.CommunicationPortImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationPort()
		 * @generated
		 */
		EClass COMMUNICATION_PORT = eINSTANCE.getCommunicationPort();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_PORT__PORT_NUMBER = eINSTANCE.getCommunicationPort_PortNumber();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ProvidedCommunicationImpl <em>Provided Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ProvidedCommunicationImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedCommunication()
		 * @generated
		 */
		EClass PROVIDED_COMMUNICATION = eINSTANCE.getProvidedCommunication();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.RequiredCommunicationImpl <em>Required Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.RequiredCommunicationImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredCommunication()
		 * @generated
		 */
		EClass REQUIRED_COMMUNICATION = eINSTANCE.getRequiredCommunication();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_COMMUNICATION__IS_MANDATORY = eINSTANCE.getRequiredCommunication_IsMandatory();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.HostingImpl <em>Hosting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.HostingImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHosting()
		 * @generated
		 */
		EClass HOSTING = eINSTANCE.getHosting();

		/**
		 * The meta object literal for the '<em><b>Provided Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__PROVIDED_HOST = eINSTANCE.getHosting_ProvidedHost();

		/**
		 * The meta object literal for the '<em><b>Required Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__REQUIRED_HOST = eINSTANCE.getHosting_RequiredHost();

		/**
		 * The meta object literal for the '<em><b>Provided Host Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__PROVIDED_HOST_CONFIGURATION = eINSTANCE.getHosting_ProvidedHostConfiguration();

		/**
		 * The meta object literal for the '<em><b>Required Host Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING__REQUIRED_HOST_CONFIGURATION = eINSTANCE.getHosting_RequiredHostConfiguration();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.HostingPortImpl <em>Hosting Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.HostingPortImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingPort()
		 * @generated
		 */
		EClass HOSTING_PORT = eINSTANCE.getHostingPort();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ProvidedHostImpl <em>Provided Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ProvidedHostImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedHost()
		 * @generated
		 */
		EClass PROVIDED_HOST = eINSTANCE.getProvidedHost();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.RequiredHostImpl <em>Required Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.RequiredHostImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredHost()
		 * @generated
		 */
		EClass REQUIRED_HOST = eINSTANCE.getRequiredHost();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ComponentInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Provided Communication Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED_COMMUNICATION_INSTANCES = eINSTANCE.getComponentInstance_ProvidedCommunicationInstances();

		/**
		 * The meta object literal for the '<em><b>Provided Host Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED_HOST_INSTANCES = eINSTANCE.getComponentInstance_ProvidedHostInstances();

		/**
		 * The meta object literal for the '<em><b>Instantiated On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__INSTANTIATED_ON = eINSTANCE.getComponentInstance_InstantiatedOn();

		/**
		 * The meta object literal for the '<em><b>Destroyed On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__DESTROYED_ON = eINSTANCE.getComponentInstance_DestroyedOn();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.InternalComponentInstanceImpl <em>Internal Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.InternalComponentInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getInternalComponentInstance()
		 * @generated
		 */
		EClass INTERNAL_COMPONENT_INSTANCE = eINSTANCE.getInternalComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Required Communication Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT_INSTANCE__REQUIRED_COMMUNICATION_INSTANCES = eINSTANCE.getInternalComponentInstance_RequiredCommunicationInstances();

		/**
		 * The meta object literal for the '<em><b>Required Host Instance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_COMPONENT_INSTANCE__REQUIRED_HOST_INSTANCE = eINSTANCE.getInternalComponentInstance_RequiredHostInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.VMInstanceImpl <em>VM Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.VMInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getVMInstance()
		 * @generated
		 */
		EClass VM_INSTANCE = eINSTANCE.getVMInstance();

		/**
		 * The meta object literal for the '<em><b>Vm Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_INSTANCE__VM_TYPE = eINSTANCE.getVMInstance_VmType();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_INSTANCE__IP = eINSTANCE.getVMInstance_Ip();

		/**
		 * The meta object literal for the '<em><b>Vm Type Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_INSTANCE__VM_TYPE_VALUE = eINSTANCE.getVMInstance_VmTypeValue();

		/**
		 * The meta object literal for the '<em><b>Check Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM_INSTANCE___CHECK_DATES__VMINSTANCE = eINSTANCE.getVMInstance__CheckDates__VMInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.CommunicationInstanceImpl <em>Communication Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.CommunicationInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationInstance()
		 * @generated
		 */
		EClass COMMUNICATION_INSTANCE = eINSTANCE.getCommunicationInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INSTANCE__TYPE = eINSTANCE.getCommunicationInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Provided Communication Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INSTANCE__PROVIDED_COMMUNICATION_INSTANCE = eINSTANCE.getCommunicationInstance_ProvidedCommunicationInstance();

		/**
		 * The meta object literal for the '<em><b>Required Communication Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_INSTANCE__REQUIRED_COMMUNICATION_INSTANCE = eINSTANCE.getCommunicationInstance_RequiredCommunicationInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.CommunicationPortInstanceImpl <em>Communication Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.CommunicationPortInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationPortInstance()
		 * @generated
		 */
		EClass COMMUNICATION_PORT_INSTANCE = eINSTANCE.getCommunicationPortInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_PORT_INSTANCE__TYPE = eINSTANCE.getCommunicationPortInstance_Type();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ProvidedCommunicationInstanceImpl <em>Provided Communication Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ProvidedCommunicationInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedCommunicationInstance()
		 * @generated
		 */
		EClass PROVIDED_COMMUNICATION_INSTANCE = eINSTANCE.getProvidedCommunicationInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.RequiredCommunicationInstanceImpl <em>Required Communication Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.RequiredCommunicationInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredCommunicationInstance()
		 * @generated
		 */
		EClass REQUIRED_COMMUNICATION_INSTANCE = eINSTANCE.getRequiredCommunicationInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.HostingInstanceImpl <em>Hosting Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.HostingInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingInstance()
		 * @generated
		 */
		EClass HOSTING_INSTANCE = eINSTANCE.getHostingInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING_INSTANCE__TYPE = eINSTANCE.getHostingInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Provided Host Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING_INSTANCE__PROVIDED_HOST_INSTANCE = eINSTANCE.getHostingInstance_ProvidedHostInstance();

		/**
		 * The meta object literal for the '<em><b>Required Host Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING_INSTANCE__REQUIRED_HOST_INSTANCE = eINSTANCE.getHostingInstance_RequiredHostInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.HostingPortInstanceImpl <em>Hosting Port Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.HostingPortInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getHostingPortInstance()
		 * @generated
		 */
		EClass HOSTING_PORT_INSTANCE = eINSTANCE.getHostingPortInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTING_PORT_INSTANCE__TYPE = eINSTANCE.getHostingPortInstance_Type();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.ProvidedHostInstanceImpl <em>Provided Host Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.ProvidedHostInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getProvidedHostInstance()
		 * @generated
		 */
		EClass PROVIDED_HOST_INSTANCE = eINSTANCE.getProvidedHostInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.impl.RequiredHostInstanceImpl <em>Required Host Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.impl.RequiredHostInstanceImpl
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getRequiredHostInstance()
		 * @generated
		 */
		EClass REQUIRED_HOST_INSTANCE = eINSTANCE.getRequiredHostInstance();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.deployment.CommunicationType <em>Communication Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.deployment.CommunicationType
		 * @see eu.paasage.camel.deployment.impl.DeploymentPackageImpl#getCommunicationType()
		 * @generated
		 */
		EEnum COMMUNICATION_TYPE = eINSTANCE.getCommunicationType();

	}

} //DeploymentPackage
