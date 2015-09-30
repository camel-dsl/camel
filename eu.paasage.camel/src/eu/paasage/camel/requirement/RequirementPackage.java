/**
 */
package eu.paasage.camel.requirement;

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
 * @see eu.paasage.camel.requirement.RequirementFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RequirementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementPackage eINSTANCE = eu.paasage.camel.requirement.impl.RequirementPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.RequirementModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.RequirementModelImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementModel()
	 * @generated
	 */
	int REQUIREMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL__REQUIREMENTS = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.RequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.RequirementGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.RequirementGroupImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementGroup()
	 * @generated
	 */
	int REQUIREMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__REQUIREMENTS = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__APPLICATION = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirement Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__REQUIREMENT_OPERATOR = REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Check Recursiveness</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP___CHECK_RECURSIVENESS__REQUIREMENTGROUP_HARDREQUIREMENT_BOOLEAN_ELIST = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.HardRequirementImpl <em>Hard Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.HardRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHardRequirement()
	 * @generated
	 */
	int HARD_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The number of structural features of the '<em>Hard Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hard Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.SoftRequirementImpl <em>Soft Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.SoftRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getSoftRequirement()
	 * @generated
	 */
	int SOFT_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT__PRIORITY = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Soft Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Soft Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.ServiceLevelObjectiveImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getServiceLevelObjective()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Custom Service Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl <em>Optimisation Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.OptimisationRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOptimisationRequirement()
	 * @generated
	 */
	int OPTIMISATION_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__NAME = SOFT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__PRIORITY = SOFT_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Optimisation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__OPTIMISATION_FUNCTION = SOFT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__METRIC = SOFT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__PROPERTY = SOFT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__APPLICATION = SOFT_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT__COMPONENT = SOFT_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Optimisation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT_FEATURE_COUNT = SOFT_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Optimisation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMISATION_REQUIREMENT_OPERATION_COUNT = SOFT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.HardwareRequirementImpl <em>Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.HardwareRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHardwareRequirement()
	 * @generated
	 */
	int HARDWARE_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The number of structural features of the '<em>Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl <em>Qualitative Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getQualitativeHardwareRequirement()
	 * @generated
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__NAME = HARDWARE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK = HARDWARE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK = HARDWARE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Qualitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT_FEATURE_COUNT = HARDWARE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Qualitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT_OPERATION_COUNT = HARDWARE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl <em>Quantitative Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getQuantitativeHardwareRequirement()
	 * @generated
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__NAME = HARDWARE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU = HARDWARE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU = HARDWARE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CORES = HARDWARE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CORES = HARDWARE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM = HARDWARE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM = HARDWARE_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE = HARDWARE_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE = HARDWARE_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Quantitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT_FEATURE_COUNT = HARDWARE_REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Quantitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT_OPERATION_COUNT = HARDWARE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.ProviderRequirementImpl <em>Provider Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.ProviderRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getProviderRequirement()
	 * @generated
	 */
	int PROVIDER_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Providers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT__PROVIDERS = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provider Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provider Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDER_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.OSOrImageRequirementImpl <em>OS Or Image Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.OSOrImageRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOSOrImageRequirement()
	 * @generated
	 */
	int OS_OR_IMAGE_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OR_IMAGE_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The number of structural features of the '<em>OS Or Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OS Or Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.OSRequirementImpl <em>OS Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.OSRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOSRequirement()
	 * @generated
	 */
	int OS_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT__NAME = OS_OR_IMAGE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT__OS = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is64os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT__IS64OS = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OS Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT_FEATURE_COUNT = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OS Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT_OPERATION_COUNT = OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.ImageRequirementImpl <em>Image Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.ImageRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getImageRequirement()
	 * @generated
	 */
	int IMAGE_REQUIREMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT__NAME = OS_OR_IMAGE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT__IMAGE_ID = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT_FEATURE_COUNT = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT_OPERATION_COUNT = OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.SecurityRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Security Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_CONTROLS = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__APPLICATION = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__COMPONENT = HARD_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.LocationRequirementImpl <em>Location Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.LocationRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getLocationRequirement()
	 * @generated
	 */
	int LOCATION_REQUIREMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REQUIREMENT__LOCATIONS = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Location Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Location Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.ScaleRequirementImpl <em>Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.ScaleRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getScaleRequirement()
	 * @generated
	 */
	int SCALE_REQUIREMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REQUIREMENT__NAME = HARD_REQUIREMENT__NAME;

	/**
	 * The number of structural features of the '<em>Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl <em>Horizontal Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHorizontalScaleRequirement()
	 * @generated
	 */
	int HORIZONTAL_SCALE_REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__NAME = SCALE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES = SCALE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES = SCALE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__COMPONENT = SCALE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Horizontal Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT_FEATURE_COUNT = SCALE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Horizontal Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT_OPERATION_COUNT = SCALE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl <em>Vertical Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getVerticalScaleRequirement()
	 * @generated
	 */
	int VERTICAL_SCALE_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__NAME = SCALE_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Min CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_CPU = SCALE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max CPU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_CPU = SCALE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_CORES = SCALE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_CORES = SCALE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_RAM = SCALE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max RAM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_RAM = SCALE_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE = SCALE_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE = SCALE_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__VM = SCALE_REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Vertical Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT_FEATURE_COUNT = SCALE_REQUIREMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Vertical Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT_OPERATION_COUNT = SCALE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.RequirementOperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.RequirementOperatorType
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementOperatorType()
	 * @generated
	 */
	int REQUIREMENT_OPERATOR_TYPE = 19;


	/**
	 * The meta object id for the '{@link eu.paasage.camel.requirement.OptimisationFunctionType <em>Optimisation Function Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.requirement.OptimisationFunctionType
	 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOptimisationFunctionType()
	 * @generated
	 */
	int OPTIMISATION_FUNCTION_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.RequirementModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.requirement.RequirementModel
	 * @generated
	 */
	EClass getRequirementModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.requirement.RequirementModel#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see eu.paasage.camel.requirement.RequirementModel#getRequirements()
	 * @see #getRequirementModel()
	 * @generated
	 */
	EReference getRequirementModel_Requirements();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see eu.paasage.camel.requirement.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.requirement.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.RequirementGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see eu.paasage.camel.requirement.RequirementGroup
	 * @generated
	 */
	EClass getRequirementGroup();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.requirement.RequirementGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see eu.paasage.camel.requirement.RequirementGroup#getRequirements()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.requirement.RequirementGroup#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Application</em>'.
	 * @see eu.paasage.camel.requirement.RequirementGroup#getApplication()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Application();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.RequirementGroup#getRequirementOperator <em>Requirement Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Operator</em>'.
	 * @see eu.paasage.camel.requirement.RequirementGroup#getRequirementOperator()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_RequirementOperator();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.requirement.RequirementGroup#checkRecursiveness(eu.paasage.camel.requirement.RequirementGroup, eu.paasage.camel.requirement.HardRequirement, boolean, org.eclipse.emf.common.util.EList) <em>Check Recursiveness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Recursiveness</em>' operation.
	 * @see eu.paasage.camel.requirement.RequirementGroup#checkRecursiveness(eu.paasage.camel.requirement.RequirementGroup, eu.paasage.camel.requirement.HardRequirement, boolean, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRequirementGroup__CheckRecursiveness__RequirementGroup_HardRequirement_boolean_EList();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.HardRequirement <em>Hard Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Requirement</em>'.
	 * @see eu.paasage.camel.requirement.HardRequirement
	 * @generated
	 */
	EClass getHardRequirement();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.SoftRequirement <em>Soft Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Requirement</em>'.
	 * @see eu.paasage.camel.requirement.SoftRequirement
	 * @generated
	 */
	EClass getSoftRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.SoftRequirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see eu.paasage.camel.requirement.SoftRequirement#getPriority()
	 * @see #getSoftRequirement()
	 * @generated
	 */
	EAttribute getSoftRequirement_Priority();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.ServiceLevelObjective <em>Service Level Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objective</em>'.
	 * @see eu.paasage.camel.requirement.ServiceLevelObjective
	 * @generated
	 */
	EClass getServiceLevelObjective();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custom Service Level</em>'.
	 * @see eu.paasage.camel.requirement.ServiceLevelObjective#getCustomServiceLevel()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EReference getServiceLevelObjective_CustomServiceLevel();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.OptimisationRequirement <em>Optimisation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimisation Requirement</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement
	 * @generated
	 */
	EClass getOptimisationRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.OptimisationRequirement#getOptimisationFunction <em>Optimisation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimisation Function</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement#getOptimisationFunction()
	 * @see #getOptimisationRequirement()
	 * @generated
	 */
	EAttribute getOptimisationRequirement_OptimisationFunction();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.OptimisationRequirement#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement#getMetric()
	 * @see #getOptimisationRequirement()
	 * @generated
	 */
	EReference getOptimisationRequirement_Metric();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.OptimisationRequirement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement#getProperty()
	 * @see #getOptimisationRequirement()
	 * @generated
	 */
	EReference getOptimisationRequirement_Property();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.OptimisationRequirement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement#getApplication()
	 * @see #getOptimisationRequirement()
	 * @generated
	 */
	EReference getOptimisationRequirement_Application();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.OptimisationRequirement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationRequirement#getComponent()
	 * @see #getOptimisationRequirement()
	 * @generated
	 */
	EReference getOptimisationRequirement_Component();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.HardwareRequirement <em>Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Requirement</em>'.
	 * @see eu.paasage.camel.requirement.HardwareRequirement
	 * @generated
	 */
	EClass getHardwareRequirement();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Hardware Requirement</em>'.
	 * @see eu.paasage.camel.requirement.QualitativeHardwareRequirement
	 * @generated
	 */
	EClass getQualitativeHardwareRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Benchmark</em>'.
	 * @see eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMinBenchmark()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_MinBenchmark();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Benchmark</em>'.
	 * @see eu.paasage.camel.requirement.QualitativeHardwareRequirement#getMaxBenchmark()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_MaxBenchmark();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Hardware Requirement</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement
	 * @generated
	 */
	EClass getQuantitativeHardwareRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCPU <em>Min CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min CPU</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCPU()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinCPU();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCPU <em>Max CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max CPU</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCPU()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxCPU();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinCores()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxCores()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinRAM <em>Min RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min RAM</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinRAM()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinRAM();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxRAM <em>Max RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max RAM</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxRAM()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxRAM();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinStorage <em>Min Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMinStorage()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinStorage();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxStorage <em>Max Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage</em>'.
	 * @see eu.paasage.camel.requirement.QuantitativeHardwareRequirement#getMaxStorage()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxStorage();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.ProviderRequirement <em>Provider Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provider Requirement</em>'.
	 * @see eu.paasage.camel.requirement.ProviderRequirement
	 * @generated
	 */
	EClass getProviderRequirement();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.requirement.ProviderRequirement#getProviders <em>Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Providers</em>'.
	 * @see eu.paasage.camel.requirement.ProviderRequirement#getProviders()
	 * @see #getProviderRequirement()
	 * @generated
	 */
	EReference getProviderRequirement_Providers();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.OSOrImageRequirement <em>OS Or Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Or Image Requirement</em>'.
	 * @see eu.paasage.camel.requirement.OSOrImageRequirement
	 * @generated
	 */
	EClass getOSOrImageRequirement();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.OSRequirement <em>OS Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Requirement</em>'.
	 * @see eu.paasage.camel.requirement.OSRequirement
	 * @generated
	 */
	EClass getOSRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.OSRequirement#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see eu.paasage.camel.requirement.OSRequirement#getOs()
	 * @see #getOSRequirement()
	 * @generated
	 */
	EAttribute getOSRequirement_Os();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.OSRequirement#isIs64os <em>Is64os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is64os</em>'.
	 * @see eu.paasage.camel.requirement.OSRequirement#isIs64os()
	 * @see #getOSRequirement()
	 * @generated
	 */
	EAttribute getOSRequirement_Is64os();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.ImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Requirement</em>'.
	 * @see eu.paasage.camel.requirement.ImageRequirement
	 * @generated
	 */
	EClass getImageRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.ImageRequirement#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see eu.paasage.camel.requirement.ImageRequirement#getImageId()
	 * @see #getImageRequirement()
	 * @generated
	 */
	EAttribute getImageRequirement_ImageId();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see eu.paasage.camel.requirement.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.requirement.SecurityRequirement#getSecurityControls <em>Security Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Controls</em>'.
	 * @see eu.paasage.camel.requirement.SecurityRequirement#getSecurityControls()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityControls();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.SecurityRequirement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see eu.paasage.camel.requirement.SecurityRequirement#getApplication()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_Application();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.SecurityRequirement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see eu.paasage.camel.requirement.SecurityRequirement#getComponent()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_Component();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.LocationRequirement <em>Location Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Requirement</em>'.
	 * @see eu.paasage.camel.requirement.LocationRequirement
	 * @generated
	 */
	EClass getLocationRequirement();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.requirement.LocationRequirement#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see eu.paasage.camel.requirement.LocationRequirement#getLocations()
	 * @see #getLocationRequirement()
	 * @generated
	 */
	EReference getLocationRequirement_Locations();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.ScaleRequirement <em>Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Requirement</em>'.
	 * @see eu.paasage.camel.requirement.ScaleRequirement
	 * @generated
	 */
	EClass getScaleRequirement();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Scale Requirement</em>'.
	 * @see eu.paasage.camel.requirement.HorizontalScaleRequirement
	 * @generated
	 */
	EClass getHorizontalScaleRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see eu.paasage.camel.requirement.HorizontalScaleRequirement#getMinInstances()
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	EAttribute getHorizontalScaleRequirement_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see eu.paasage.camel.requirement.HorizontalScaleRequirement#getMaxInstances()
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	EAttribute getHorizontalScaleRequirement_MaxInstances();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.HorizontalScaleRequirement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see eu.paasage.camel.requirement.HorizontalScaleRequirement#getComponent()
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	EReference getHorizontalScaleRequirement_Component();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.requirement.VerticalScaleRequirement <em>Vertical Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Scale Requirement</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement
	 * @generated
	 */
	EClass getVerticalScaleRequirement();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCPU <em>Min CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min CPU</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCPU()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinCPU();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCPU <em>Max CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max CPU</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCPU()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxCPU();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMinCores()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxCores()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinRAM <em>Min RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min RAM</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMinRAM()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinRAM();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxRAM <em>Max RAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max RAM</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxRAM()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxRAM();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMinStorage <em>Min Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMinStorage()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinStorage();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxStorage <em>Max Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getMaxStorage()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxStorage();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.requirement.VerticalScaleRequirement#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vm</em>'.
	 * @see eu.paasage.camel.requirement.VerticalScaleRequirement#getVm()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EReference getVerticalScaleRequirement_Vm();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.requirement.RequirementOperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see eu.paasage.camel.requirement.RequirementOperatorType
	 * @generated
	 */
	EEnum getRequirementOperatorType();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.requirement.OptimisationFunctionType <em>Optimisation Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optimisation Function Type</em>'.
	 * @see eu.paasage.camel.requirement.OptimisationFunctionType
	 * @generated
	 */
	EEnum getOptimisationFunctionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementFactory getRequirementFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.RequirementModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.RequirementModelImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementModel()
		 * @generated
		 */
		EClass REQUIREMENT_MODEL = eINSTANCE.getRequirementModel();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_MODEL__REQUIREMENTS = eINSTANCE.getRequirementModel_Requirements();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.RequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.RequirementGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.RequirementGroupImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementGroup()
		 * @generated
		 */
		EClass REQUIREMENT_GROUP = eINSTANCE.getRequirementGroup();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__REQUIREMENTS = eINSTANCE.getRequirementGroup_Requirements();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__APPLICATION = eINSTANCE.getRequirementGroup_Application();

		/**
		 * The meta object literal for the '<em><b>Requirement Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__REQUIREMENT_OPERATOR = eINSTANCE.getRequirementGroup_RequirementOperator();

		/**
		 * The meta object literal for the '<em><b>Check Recursiveness</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT_GROUP___CHECK_RECURSIVENESS__REQUIREMENTGROUP_HARDREQUIREMENT_BOOLEAN_ELIST = eINSTANCE.getRequirementGroup__CheckRecursiveness__RequirementGroup_HardRequirement_boolean_EList();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.HardRequirementImpl <em>Hard Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.HardRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHardRequirement()
		 * @generated
		 */
		EClass HARD_REQUIREMENT = eINSTANCE.getHardRequirement();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.SoftRequirementImpl <em>Soft Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.SoftRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getSoftRequirement()
		 * @generated
		 */
		EClass SOFT_REQUIREMENT = eINSTANCE.getSoftRequirement();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_REQUIREMENT__PRIORITY = eINSTANCE.getSoftRequirement_Priority();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.ServiceLevelObjectiveImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getServiceLevelObjective()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVE = eINSTANCE.getServiceLevelObjective();

		/**
		 * The meta object literal for the '<em><b>Custom Service Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL = eINSTANCE.getServiceLevelObjective_CustomServiceLevel();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.OptimisationRequirementImpl <em>Optimisation Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.OptimisationRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOptimisationRequirement()
		 * @generated
		 */
		EClass OPTIMISATION_REQUIREMENT = eINSTANCE.getOptimisationRequirement();

		/**
		 * The meta object literal for the '<em><b>Optimisation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMISATION_REQUIREMENT__OPTIMISATION_FUNCTION = eINSTANCE.getOptimisationRequirement_OptimisationFunction();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_REQUIREMENT__METRIC = eINSTANCE.getOptimisationRequirement_Metric();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_REQUIREMENT__PROPERTY = eINSTANCE.getOptimisationRequirement_Property();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_REQUIREMENT__APPLICATION = eINSTANCE.getOptimisationRequirement_Application();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMISATION_REQUIREMENT__COMPONENT = eINSTANCE.getOptimisationRequirement_Component();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.HardwareRequirementImpl <em>Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.HardwareRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHardwareRequirement()
		 * @generated
		 */
		EClass HARDWARE_REQUIREMENT = eINSTANCE.getHardwareRequirement();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl <em>Qualitative Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.QualitativeHardwareRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getQualitativeHardwareRequirement()
		 * @generated
		 */
		EClass QUALITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getQualitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Benchmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK = eINSTANCE.getQualitativeHardwareRequirement_MinBenchmark();

		/**
		 * The meta object literal for the '<em><b>Max Benchmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK = eINSTANCE.getQualitativeHardwareRequirement_MaxBenchmark();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl <em>Quantitative Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.QuantitativeHardwareRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getQuantitativeHardwareRequirement()
		 * @generated
		 */
		EClass QUANTITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getQuantitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Min CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU = eINSTANCE.getQuantitativeHardwareRequirement_MinCPU();

		/**
		 * The meta object literal for the '<em><b>Max CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU = eINSTANCE.getQuantitativeHardwareRequirement_MaxCPU();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CORES = eINSTANCE.getQuantitativeHardwareRequirement_MinCores();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CORES = eINSTANCE.getQuantitativeHardwareRequirement_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Min RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM = eINSTANCE.getQuantitativeHardwareRequirement_MinRAM();

		/**
		 * The meta object literal for the '<em><b>Max RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM = eINSTANCE.getQuantitativeHardwareRequirement_MaxRAM();

		/**
		 * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE = eINSTANCE.getQuantitativeHardwareRequirement_MinStorage();

		/**
		 * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE = eINSTANCE.getQuantitativeHardwareRequirement_MaxStorage();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.ProviderRequirementImpl <em>Provider Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.ProviderRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getProviderRequirement()
		 * @generated
		 */
		EClass PROVIDER_REQUIREMENT = eINSTANCE.getProviderRequirement();

		/**
		 * The meta object literal for the '<em><b>Providers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDER_REQUIREMENT__PROVIDERS = eINSTANCE.getProviderRequirement_Providers();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.OSOrImageRequirementImpl <em>OS Or Image Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.OSOrImageRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOSOrImageRequirement()
		 * @generated
		 */
		EClass OS_OR_IMAGE_REQUIREMENT = eINSTANCE.getOSOrImageRequirement();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.OSRequirementImpl <em>OS Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.OSRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOSRequirement()
		 * @generated
		 */
		EClass OS_REQUIREMENT = eINSTANCE.getOSRequirement();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_REQUIREMENT__OS = eINSTANCE.getOSRequirement_Os();

		/**
		 * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_REQUIREMENT__IS64OS = eINSTANCE.getOSRequirement_Is64os();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.ImageRequirementImpl <em>Image Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.ImageRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getImageRequirement()
		 * @generated
		 */
		EClass IMAGE_REQUIREMENT = eINSTANCE.getImageRequirement();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REQUIREMENT__IMAGE_ID = eINSTANCE.getImageRequirement_ImageId();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.SecurityRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Security Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_CONTROLS = eINSTANCE.getSecurityRequirement_SecurityControls();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__APPLICATION = eINSTANCE.getSecurityRequirement_Application();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__COMPONENT = eINSTANCE.getSecurityRequirement_Component();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.LocationRequirementImpl <em>Location Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.LocationRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getLocationRequirement()
		 * @generated
		 */
		EClass LOCATION_REQUIREMENT = eINSTANCE.getLocationRequirement();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_REQUIREMENT__LOCATIONS = eINSTANCE.getLocationRequirement_Locations();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.ScaleRequirementImpl <em>Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.ScaleRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getScaleRequirement()
		 * @generated
		 */
		EClass SCALE_REQUIREMENT = eINSTANCE.getScaleRequirement();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl <em>Horizontal Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.HorizontalScaleRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getHorizontalScaleRequirement()
		 * @generated
		 */
		EClass HORIZONTAL_SCALE_REQUIREMENT = eINSTANCE.getHorizontalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCES = eINSTANCE.getHorizontalScaleRequirement_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCES = eINSTANCE.getHorizontalScaleRequirement_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HORIZONTAL_SCALE_REQUIREMENT__COMPONENT = eINSTANCE.getHorizontalScaleRequirement_Component();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl <em>Vertical Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.impl.VerticalScaleRequirementImpl
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getVerticalScaleRequirement()
		 * @generated
		 */
		EClass VERTICAL_SCALE_REQUIREMENT = eINSTANCE.getVerticalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Min CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_CPU = eINSTANCE.getVerticalScaleRequirement_MinCPU();

		/**
		 * The meta object literal for the '<em><b>Max CPU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_CPU = eINSTANCE.getVerticalScaleRequirement_MaxCPU();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_CORES = eINSTANCE.getVerticalScaleRequirement_MinCores();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_CORES = eINSTANCE.getVerticalScaleRequirement_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Min RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_RAM = eINSTANCE.getVerticalScaleRequirement_MinRAM();

		/**
		 * The meta object literal for the '<em><b>Max RAM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_RAM = eINSTANCE.getVerticalScaleRequirement_MaxRAM();

		/**
		 * The meta object literal for the '<em><b>Min Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE = eINSTANCE.getVerticalScaleRequirement_MinStorage();

		/**
		 * The meta object literal for the '<em><b>Max Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE = eINSTANCE.getVerticalScaleRequirement_MaxStorage();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTICAL_SCALE_REQUIREMENT__VM = eINSTANCE.getVerticalScaleRequirement_Vm();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.RequirementOperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.RequirementOperatorType
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getRequirementOperatorType()
		 * @generated
		 */
		EEnum REQUIREMENT_OPERATOR_TYPE = eINSTANCE.getRequirementOperatorType();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.requirement.OptimisationFunctionType <em>Optimisation Function Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.requirement.OptimisationFunctionType
		 * @see eu.paasage.camel.requirement.impl.RequirementPackageImpl#getOptimisationFunctionType()
		 * @generated
		 */
		EEnum OPTIMISATION_FUNCTION_TYPE = eINSTANCE.getOptimisationFunctionType();

	}

} //RequirementPackage
