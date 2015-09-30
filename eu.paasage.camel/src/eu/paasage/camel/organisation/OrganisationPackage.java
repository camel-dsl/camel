/**
 */
package eu.paasage.camel.organisation;

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
 * @see eu.paasage.camel.organisation.OrganisationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface OrganisationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "organisation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.paasage.eu/2015/06/camel/organisation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "organisation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganisationPackage eINSTANCE = eu.paasage.camel.organisation.impl.OrganisationPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.OrganisationModelImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getOrganisationModel()
	 * @generated
	 */
	int ORGANISATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__NAME = CamelPackage.MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__IMPORT_URI = CamelPackage.MODEL__IMPORT_URI;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__ORGANISATION = CamelPackage.MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__PROVIDER = CamelPackage.MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__EXTERNAL_IDENTIFIERS = CamelPackage.MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__USERS = CamelPackage.MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__USER_GROUPS = CamelPackage.MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Centres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__DATA_CENTRES = CamelPackage.MODEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__ROLES = CamelPackage.MODEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Role Assigments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__ROLE_ASSIGMENTS = CamelPackage.MODEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__PERMISSIONS = CamelPackage.MODEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__SECURITY_LEVEL = CamelPackage.MODEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Resource Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL__RESOURCE_FILTERS = CamelPackage.MODEL_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL_FEATURE_COUNT = CamelPackage.MODEL_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_MODEL_OPERATION_COUNT = CamelPackage.MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.CredentialsImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 1;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl <em>Cloud Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.CloudCredentialsImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCloudCredentials()
	 * @generated
	 */
	int CLOUD_CREDENTIALS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__NAME = CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloud Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__CLOUD_PROVIDER = CREDENTIALS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__SECURITY_GROUP = CREDENTIALS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Public SSH Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__PUBLIC_SSH_KEY = CREDENTIALS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Private SSH Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__PRIVATE_SSH_KEY = CREDENTIALS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__USERNAME = CREDENTIALS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS__PASSWORD = CREDENTIALS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cloud Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS_FEATURE_COUNT = CREDENTIALS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Cloud Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_CREDENTIALS_OPERATION_COUNT = CREDENTIALS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.DataCenterImpl <em>Data Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.DataCenterImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getDataCenter()
	 * @generated
	 */
	int DATA_CENTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__CODE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER__LOCATION = 2;

	/**
	 * The number of structural features of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Data Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CENTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.EntityImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.OrganisationImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Www</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__WWW = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__POSTAL_ADDRESS = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EMAIL = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.CloudProviderImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__NAME = ORGANISATION__NAME;

	/**
	 * The feature id for the '<em><b>Www</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__WWW = ORGANISATION__WWW;

	/**
	 * The feature id for the '<em><b>Postal Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__POSTAL_ADDRESS = ORGANISATION__POSTAL_ADDRESS;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__EMAIL = ORGANISATION__EMAIL;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__PUBLIC = ORGANISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Saa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__SAA_S = ORGANISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__PAA_S = ORGANISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Iaa S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__IAA_S = ORGANISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Provider Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__PROVIDER_MODEL = ORGANISATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security Capability</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__SECURITY_CAPABILITY = ORGANISATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = ORGANISATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_OPERATION_COUNT = ORGANISATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.UserImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getUser()
	 * @generated
	 */
	int USER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Www</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WWW = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>External Identifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EXTERNAL_IDENTIFIERS = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requirement Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REQUIREMENT_MODELS = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cloud Credentials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CLOUD_CREDENTIALS = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Deployment Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DEPLOYMENT_MODELS = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Paasage Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PAASAGE_CREDENTIALS = ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.ExternalIdentifierImpl <em>External Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.ExternalIdentifierImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getExternalIdentifier()
	 * @generated
	 */
	int EXTERNAL_IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>External Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.PermissionImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__END = 3;

	/**
	 * The feature id for the '<em><b>Resource Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__RESOURCE_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__ACTION = 5;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Check Start End Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION___CHECK_START_END_DATES__PERMISSION = 0;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.ResourceFilterImpl <em>Resource Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.ResourceFilterImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getResourceFilter()
	 * @generated
	 */
	int RESOURCE_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILTER__RESOURCE_PATTERN = 1;

	/**
	 * The number of structural features of the '<em>Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.InformationResourceFilterImpl <em>Information Resource Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.InformationResourceFilterImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getInformationResourceFilter()
	 * @generated
	 */
	int INFORMATION_RESOURCE_FILTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER__NAME = RESOURCE_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Resource Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER__RESOURCE_PATTERN = RESOURCE_FILTER__RESOURCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Information Resource Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_PATH = RESOURCE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Every Information Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER__EVERY_INFORMATION_RESOURCE = RESOURCE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER_FEATURE_COUNT = RESOURCE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Information Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_RESOURCE_FILTER_OPERATION_COUNT = RESOURCE_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl <em>Service Resource Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getServiceResourceFilter()
	 * @generated
	 */
	int SERVICE_RESOURCE_FILTER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER__NAME = RESOURCE_FILTER__NAME;

	/**
	 * The feature id for the '<em><b>Resource Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER__RESOURCE_PATTERN = RESOURCE_FILTER__RESOURCE_PATTERN;

	/**
	 * The feature id for the '<em><b>Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER__SERVICE_URL = RESOURCE_FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Every Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER__EVERY_SERVICE = RESOURCE_FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER_FEATURE_COUNT = RESOURCE_FILTER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service Resource Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_RESOURCE_FILTER_OPERATION_COUNT = RESOURCE_FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.RoleImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl <em>Role Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.RoleAssignmentImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getRoleAssignment()
	 * @generated
	 */
	int ROLE_ASSIGNMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__USER = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__ROLE = 2;

	/**
	 * The feature id for the '<em><b>User Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__USER_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__START = 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__END = 5;

	/**
	 * The feature id for the '<em><b>Assigned On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT__ASSIGNED_ON = 6;

	/**
	 * The number of structural features of the '<em>Role Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Check Assigned On Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT___CHECK_ASSIGNED_ON_DATES__ROLEASSIGNMENT = 0;

	/**
	 * The operation id for the '<em>Check Start End Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT___CHECK_START_END_DATES__ROLEASSIGNMENT = 1;

	/**
	 * The number of operations of the '<em>Role Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_ASSIGNMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.UserGroupImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__USERS = 1;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.impl.PaaSageCredentialsImpl <em>Paa Sage Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.impl.PaaSageCredentialsImpl
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getPaaSageCredentials()
	 * @generated
	 */
	int PAA_SAGE_CREDENTIALS = 16;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SAGE_CREDENTIALS__PASSWORD = CREDENTIALS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Paa Sage Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SAGE_CREDENTIALS_FEATURE_COUNT = CREDENTIALS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Paa Sage Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAA_SAGE_CREDENTIALS_OPERATION_COUNT = CREDENTIALS_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.SecurityLevel <em>Security Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.SecurityLevel
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 17;

	/**
	 * The meta object id for the '{@link eu.paasage.camel.organisation.ResourcePattern <em>Resource Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.paasage.camel.organisation.ResourcePattern
	 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getResourcePattern()
	 * @generated
	 */
	int RESOURCE_PATTERN = 18;


	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.OrganisationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel
	 * @generated
	 */
	EClass getOrganisationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getUsers()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_Users();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.organisation.OrganisationModel#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provider</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getProvider()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_Provider();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.organisation.OrganisationModel#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organisation</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getOrganisation()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_Organisation();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getUserGroups <em>User Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Groups</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getUserGroups()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_UserGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getDataCentres <em>Data Centres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Centres</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getDataCentres()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_DataCentres();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getRoleAssigments <em>Role Assigments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Assigments</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getRoleAssigments()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_RoleAssigments();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getRoles()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permissions</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getPermissions()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.OrganisationModel#getSecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Level</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getSecurityLevel()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EAttribute getOrganisationModel_SecurityLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getResourceFilters <em>Resource Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Filters</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getResourceFilters()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_ResourceFilters();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.OrganisationModel#getExternalIdentifiers <em>External Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifiers</em>'.
	 * @see eu.paasage.camel.organisation.OrganisationModel#getExternalIdentifiers()
	 * @see #getOrganisationModel()
	 * @generated
	 */
	EReference getOrganisationModel_ExternalIdentifiers();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see eu.paasage.camel.organisation.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.CloudCredentials <em>Cloud Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Credentials</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials
	 * @generated
	 */
	EClass getCloudCredentials();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getName()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.CloudCredentials#getCloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloud Provider</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getCloudProvider()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EReference getCloudCredentials_CloudProvider();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Group</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getSecurityGroup()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_SecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getPublicSSHKey <em>Public SSH Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public SSH Key</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getPublicSSHKey()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_PublicSSHKey();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getPrivateSSHKey <em>Private SSH Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private SSH Key</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getPrivateSSHKey()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_PrivateSSHKey();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getUsername()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_Username();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudCredentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see eu.paasage.camel.organisation.CloudCredentials#getPassword()
	 * @see #getCloudCredentials()
	 * @generated
	 */
	EAttribute getCloudCredentials_Password();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.DataCenter <em>Data Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Center</em>'.
	 * @see eu.paasage.camel.organisation.DataCenter
	 * @generated
	 */
	EClass getDataCenter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.DataCenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.DataCenter#getName()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.DataCenter#getCodeName <em>Code Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Name</em>'.
	 * @see eu.paasage.camel.organisation.DataCenter#getCodeName()
	 * @see #getDataCenter()
	 * @generated
	 */
	EAttribute getDataCenter_CodeName();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.DataCenter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see eu.paasage.camel.organisation.DataCenter#getLocation()
	 * @see #getDataCenter()
	 * @generated
	 */
	EReference getDataCenter_Location();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see eu.paasage.camel.organisation.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see eu.paasage.camel.organisation.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Organisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.Organisation#getName()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Organisation#getWww <em>Www</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Www</em>'.
	 * @see eu.paasage.camel.organisation.Organisation#getWww()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Www();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Organisation#getPostalAddress <em>Postal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Address</em>'.
	 * @see eu.paasage.camel.organisation.Organisation#getPostalAddress()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_PostalAddress();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Organisation#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see eu.paasage.camel.organisation.Organisation#getEmail()
	 * @see #getOrganisation()
	 * @generated
	 */
	EAttribute getOrganisation_Email();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Provider</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider
	 * @generated
	 */
	EClass getCloudProvider();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudProvider#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#isPublic()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_Public();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudProvider#isSaaS <em>Saa S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Saa S</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#isSaaS()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_SaaS();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudProvider#isPaaS <em>Paa S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paa S</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#isPaaS()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_PaaS();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.CloudProvider#isIaaS <em>Iaa S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iaa S</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#isIaaS()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EAttribute getCloudProvider_IaaS();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.CloudProvider#getProviderModel <em>Provider Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provider Model</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#getProviderModel()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_ProviderModel();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.organisation.CloudProvider#getSecurityCapability <em>Security Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Security Capability</em>'.
	 * @see eu.paasage.camel.organisation.CloudProvider#getSecurityCapability()
	 * @see #getCloudProvider()
	 * @generated
	 */
	EReference getCloudProvider_SecurityCapability();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see eu.paasage.camel.organisation.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see eu.paasage.camel.organisation.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see eu.paasage.camel.organisation.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see eu.paasage.camel.organisation.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.User#getWww <em>Www</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Www</em>'.
	 * @see eu.paasage.camel.organisation.User#getWww()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Www();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.User#getExternalIdentifiers <em>External Identifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Identifiers</em>'.
	 * @see eu.paasage.camel.organisation.User#getExternalIdentifiers()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ExternalIdentifiers();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.organisation.User#getRequirementModels <em>Requirement Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement Models</em>'.
	 * @see eu.paasage.camel.organisation.User#getRequirementModels()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_RequirementModels();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.paasage.camel.organisation.User#getCloudCredentials <em>Cloud Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cloud Credentials</em>'.
	 * @see eu.paasage.camel.organisation.User#getCloudCredentials()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_CloudCredentials();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.organisation.User#getDeploymentModels <em>Deployment Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployment Models</em>'.
	 * @see eu.paasage.camel.organisation.User#getDeploymentModels()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_DeploymentModels();

	/**
	 * Returns the meta object for the containment reference '{@link eu.paasage.camel.organisation.User#getPaasageCredentials <em>Paasage Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paasage Credentials</em>'.
	 * @see eu.paasage.camel.organisation.User#getPaasageCredentials()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_PaasageCredentials();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.ExternalIdentifier <em>External Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Identifier</em>'.
	 * @see eu.paasage.camel.organisation.ExternalIdentifier
	 * @generated
	 */
	EClass getExternalIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ExternalIdentifier#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see eu.paasage.camel.organisation.ExternalIdentifier#getIdentifier()
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	EAttribute getExternalIdentifier_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ExternalIdentifier#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eu.paasage.camel.organisation.ExternalIdentifier#getDescription()
	 * @see #getExternalIdentifier()
	 * @generated
	 */
	EAttribute getExternalIdentifier_Description();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see eu.paasage.camel.organisation.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Permission#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getName()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.Permission#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getRole()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_Role();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Permission#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getStart()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Start();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Permission#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getEnd()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_End();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.Permission#getResourceFilter <em>Resource Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Filter</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getResourceFilter()
	 * @see #getPermission()
	 * @generated
	 */
	EReference getPermission_ResourceFilter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Permission#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see eu.paasage.camel.organisation.Permission#getAction()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Action();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.organisation.Permission#checkStartEndDates(eu.paasage.camel.organisation.Permission) <em>Check Start End Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Start End Dates</em>' operation.
	 * @see eu.paasage.camel.organisation.Permission#checkStartEndDates(eu.paasage.camel.organisation.Permission)
	 * @generated
	 */
	EOperation getPermission__CheckStartEndDates__Permission();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.ResourceFilter <em>Resource Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Filter</em>'.
	 * @see eu.paasage.camel.organisation.ResourceFilter
	 * @generated
	 */
	EClass getResourceFilter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ResourceFilter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.ResourceFilter#getName()
	 * @see #getResourceFilter()
	 * @generated
	 */
	EAttribute getResourceFilter_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ResourceFilter#getResourcePattern <em>Resource Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Pattern</em>'.
	 * @see eu.paasage.camel.organisation.ResourceFilter#getResourcePattern()
	 * @see #getResourceFilter()
	 * @generated
	 */
	EAttribute getResourceFilter_ResourcePattern();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.InformationResourceFilter <em>Information Resource Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Resource Filter</em>'.
	 * @see eu.paasage.camel.organisation.InformationResourceFilter
	 * @generated
	 */
	EClass getInformationResourceFilter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.InformationResourceFilter#getInformationResourcePath <em>Information Resource Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Information Resource Path</em>'.
	 * @see eu.paasage.camel.organisation.InformationResourceFilter#getInformationResourcePath()
	 * @see #getInformationResourceFilter()
	 * @generated
	 */
	EAttribute getInformationResourceFilter_InformationResourcePath();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.InformationResourceFilter#isEveryInformationResource <em>Every Information Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Every Information Resource</em>'.
	 * @see eu.paasage.camel.organisation.InformationResourceFilter#isEveryInformationResource()
	 * @see #getInformationResourceFilter()
	 * @generated
	 */
	EAttribute getInformationResourceFilter_EveryInformationResource();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.ServiceResourceFilter <em>Service Resource Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Resource Filter</em>'.
	 * @see eu.paasage.camel.organisation.ServiceResourceFilter
	 * @generated
	 */
	EClass getServiceResourceFilter();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ServiceResourceFilter#getServiceURL <em>Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service URL</em>'.
	 * @see eu.paasage.camel.organisation.ServiceResourceFilter#getServiceURL()
	 * @see #getServiceResourceFilter()
	 * @generated
	 */
	EAttribute getServiceResourceFilter_ServiceURL();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.ServiceResourceFilter#isEveryService <em>Every Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Every Service</em>'.
	 * @see eu.paasage.camel.organisation.ServiceResourceFilter#isEveryService()
	 * @see #getServiceResourceFilter()
	 * @generated
	 */
	EAttribute getServiceResourceFilter_EveryService();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see eu.paasage.camel.organisation.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.RoleAssignment <em>Role Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Assignment</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment
	 * @generated
	 */
	EClass getRoleAssignment();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.RoleAssignment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getName()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EAttribute getRoleAssignment_Name();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.RoleAssignment#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getUser()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EReference getRoleAssignment_User();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.RoleAssignment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getRole()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EReference getRoleAssignment_Role();

	/**
	 * Returns the meta object for the reference '{@link eu.paasage.camel.organisation.RoleAssignment#getUserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Group</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getUserGroup()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EReference getRoleAssignment_UserGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.RoleAssignment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getStart()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EAttribute getRoleAssignment_Start();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.RoleAssignment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getEnd()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EAttribute getRoleAssignment_End();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.RoleAssignment#getAssignedOn <em>Assigned On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assigned On</em>'.
	 * @see eu.paasage.camel.organisation.RoleAssignment#getAssignedOn()
	 * @see #getRoleAssignment()
	 * @generated
	 */
	EAttribute getRoleAssignment_AssignedOn();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.organisation.RoleAssignment#checkAssignedOnDates(eu.paasage.camel.organisation.RoleAssignment) <em>Check Assigned On Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Assigned On Dates</em>' operation.
	 * @see eu.paasage.camel.organisation.RoleAssignment#checkAssignedOnDates(eu.paasage.camel.organisation.RoleAssignment)
	 * @generated
	 */
	EOperation getRoleAssignment__CheckAssignedOnDates__RoleAssignment();

	/**
	 * Returns the meta object for the '{@link eu.paasage.camel.organisation.RoleAssignment#checkStartEndDates(eu.paasage.camel.organisation.RoleAssignment) <em>Check Start End Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Start End Dates</em>' operation.
	 * @see eu.paasage.camel.organisation.RoleAssignment#checkStartEndDates(eu.paasage.camel.organisation.RoleAssignment)
	 * @generated
	 */
	EOperation getRoleAssignment__CheckStartEndDates__RoleAssignment();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see eu.paasage.camel.organisation.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.UserGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.paasage.camel.organisation.UserGroup#getName()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link eu.paasage.camel.organisation.UserGroup#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see eu.paasage.camel.organisation.UserGroup#getUsers()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Users();

	/**
	 * Returns the meta object for class '{@link eu.paasage.camel.organisation.PaaSageCredentials <em>Paa Sage Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paa Sage Credentials</em>'.
	 * @see eu.paasage.camel.organisation.PaaSageCredentials
	 * @generated
	 */
	EClass getPaaSageCredentials();

	/**
	 * Returns the meta object for the attribute '{@link eu.paasage.camel.organisation.PaaSageCredentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see eu.paasage.camel.organisation.PaaSageCredentials#getPassword()
	 * @see #getPaaSageCredentials()
	 * @generated
	 */
	EAttribute getPaaSageCredentials_Password();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.organisation.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Level</em>'.
	 * @see eu.paasage.camel.organisation.SecurityLevel
	 * @generated
	 */
	EEnum getSecurityLevel();

	/**
	 * Returns the meta object for enum '{@link eu.paasage.camel.organisation.ResourcePattern <em>Resource Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resource Pattern</em>'.
	 * @see eu.paasage.camel.organisation.ResourcePattern
	 * @generated
	 */
	EEnum getResourcePattern();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrganisationFactory getOrganisationFactory();

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
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.OrganisationModelImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getOrganisationModel()
		 * @generated
		 */
		EClass ORGANISATION_MODEL = eINSTANCE.getOrganisationModel();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__USERS = eINSTANCE.getOrganisationModel_Users();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__PROVIDER = eINSTANCE.getOrganisationModel_Provider();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__ORGANISATION = eINSTANCE.getOrganisationModel_Organisation();

		/**
		 * The meta object literal for the '<em><b>User Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__USER_GROUPS = eINSTANCE.getOrganisationModel_UserGroups();

		/**
		 * The meta object literal for the '<em><b>Data Centres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__DATA_CENTRES = eINSTANCE.getOrganisationModel_DataCentres();

		/**
		 * The meta object literal for the '<em><b>Role Assigments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__ROLE_ASSIGMENTS = eINSTANCE.getOrganisationModel_RoleAssigments();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__ROLES = eINSTANCE.getOrganisationModel_Roles();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__PERMISSIONS = eINSTANCE.getOrganisationModel_Permissions();

		/**
		 * The meta object literal for the '<em><b>Security Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION_MODEL__SECURITY_LEVEL = eINSTANCE.getOrganisationModel_SecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Resource Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__RESOURCE_FILTERS = eINSTANCE.getOrganisationModel_ResourceFilters();

		/**
		 * The meta object literal for the '<em><b>External Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION_MODEL__EXTERNAL_IDENTIFIERS = eINSTANCE.getOrganisationModel_ExternalIdentifiers();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.CredentialsImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl <em>Cloud Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.CloudCredentialsImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCloudCredentials()
		 * @generated
		 */
		EClass CLOUD_CREDENTIALS = eINSTANCE.getCloudCredentials();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__NAME = eINSTANCE.getCloudCredentials_Name();

		/**
		 * The meta object literal for the '<em><b>Cloud Provider</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_CREDENTIALS__CLOUD_PROVIDER = eINSTANCE.getCloudCredentials_CloudProvider();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__SECURITY_GROUP = eINSTANCE.getCloudCredentials_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Public SSH Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__PUBLIC_SSH_KEY = eINSTANCE.getCloudCredentials_PublicSSHKey();

		/**
		 * The meta object literal for the '<em><b>Private SSH Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__PRIVATE_SSH_KEY = eINSTANCE.getCloudCredentials_PrivateSSHKey();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__USERNAME = eINSTANCE.getCloudCredentials_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_CREDENTIALS__PASSWORD = eINSTANCE.getCloudCredentials_Password();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.DataCenterImpl <em>Data Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.DataCenterImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getDataCenter()
		 * @generated
		 */
		EClass DATA_CENTER = eINSTANCE.getDataCenter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__NAME = eINSTANCE.getDataCenter_Name();

		/**
		 * The meta object literal for the '<em><b>Code Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CENTER__CODE_NAME = eINSTANCE.getDataCenter_CodeName();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CENTER__LOCATION = eINSTANCE.getDataCenter_Location();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.EntityImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.OrganisationImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

		/**
		 * The meta object literal for the '<em><b>Www</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__WWW = eINSTANCE.getOrganisation_Www();

		/**
		 * The meta object literal for the '<em><b>Postal Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__POSTAL_ADDRESS = eINSTANCE.getOrganisation_PostalAddress();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATION__EMAIL = eINSTANCE.getOrganisation_Email();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.CloudProviderImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getCloudProvider()
		 * @generated
		 */
		EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__PUBLIC = eINSTANCE.getCloudProvider_Public();

		/**
		 * The meta object literal for the '<em><b>Saa S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__SAA_S = eINSTANCE.getCloudProvider_SaaS();

		/**
		 * The meta object literal for the '<em><b>Paa S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__PAA_S = eINSTANCE.getCloudProvider_PaaS();

		/**
		 * The meta object literal for the '<em><b>Iaa S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROVIDER__IAA_S = eINSTANCE.getCloudProvider_IaaS();

		/**
		 * The meta object literal for the '<em><b>Provider Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__PROVIDER_MODEL = eINSTANCE.getCloudProvider_ProviderModel();

		/**
		 * The meta object literal for the '<em><b>Security Capability</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_PROVIDER__SECURITY_CAPABILITY = eINSTANCE.getCloudProvider_SecurityCapability();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.UserImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Www</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WWW = eINSTANCE.getUser_Www();

		/**
		 * The meta object literal for the '<em><b>External Identifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__EXTERNAL_IDENTIFIERS = eINSTANCE.getUser_ExternalIdentifiers();

		/**
		 * The meta object literal for the '<em><b>Requirement Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__REQUIREMENT_MODELS = eINSTANCE.getUser_RequirementModels();

		/**
		 * The meta object literal for the '<em><b>Cloud Credentials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CLOUD_CREDENTIALS = eINSTANCE.getUser_CloudCredentials();

		/**
		 * The meta object literal for the '<em><b>Deployment Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__DEPLOYMENT_MODELS = eINSTANCE.getUser_DeploymentModels();

		/**
		 * The meta object literal for the '<em><b>Paasage Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PAASAGE_CREDENTIALS = eINSTANCE.getUser_PaasageCredentials();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.ExternalIdentifierImpl <em>External Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.ExternalIdentifierImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getExternalIdentifier()
		 * @generated
		 */
		EClass EXTERNAL_IDENTIFIER = eINSTANCE.getExternalIdentifier();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER__IDENTIFIER = eINSTANCE.getExternalIdentifier_Identifier();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_IDENTIFIER__DESCRIPTION = eINSTANCE.getExternalIdentifier_Description();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.PermissionImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__NAME = eINSTANCE.getPermission_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__ROLE = eINSTANCE.getPermission_Role();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__START = eINSTANCE.getPermission_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__END = eINSTANCE.getPermission_End();

		/**
		 * The meta object literal for the '<em><b>Resource Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSION__RESOURCE_FILTER = eINSTANCE.getPermission_ResourceFilter();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__ACTION = eINSTANCE.getPermission_Action();

		/**
		 * The meta object literal for the '<em><b>Check Start End Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERMISSION___CHECK_START_END_DATES__PERMISSION = eINSTANCE.getPermission__CheckStartEndDates__Permission();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.ResourceFilterImpl <em>Resource Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.ResourceFilterImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getResourceFilter()
		 * @generated
		 */
		EClass RESOURCE_FILTER = eINSTANCE.getResourceFilter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FILTER__NAME = eINSTANCE.getResourceFilter_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_FILTER__RESOURCE_PATTERN = eINSTANCE.getResourceFilter_ResourcePattern();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.InformationResourceFilterImpl <em>Information Resource Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.InformationResourceFilterImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getInformationResourceFilter()
		 * @generated
		 */
		EClass INFORMATION_RESOURCE_FILTER = eINSTANCE.getInformationResourceFilter();

		/**
		 * The meta object literal for the '<em><b>Information Resource Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_PATH = eINSTANCE.getInformationResourceFilter_InformationResourcePath();

		/**
		 * The meta object literal for the '<em><b>Every Information Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_RESOURCE_FILTER__EVERY_INFORMATION_RESOURCE = eINSTANCE.getInformationResourceFilter_EveryInformationResource();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl <em>Service Resource Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.ServiceResourceFilterImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getServiceResourceFilter()
		 * @generated
		 */
		EClass SERVICE_RESOURCE_FILTER = eINSTANCE.getServiceResourceFilter();

		/**
		 * The meta object literal for the '<em><b>Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE_FILTER__SERVICE_URL = eINSTANCE.getServiceResourceFilter_ServiceURL();

		/**
		 * The meta object literal for the '<em><b>Every Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_RESOURCE_FILTER__EVERY_SERVICE = eINSTANCE.getServiceResourceFilter_EveryService();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.RoleImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.RoleAssignmentImpl <em>Role Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.RoleAssignmentImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getRoleAssignment()
		 * @generated
		 */
		EClass ROLE_ASSIGNMENT = eINSTANCE.getRoleAssignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ASSIGNMENT__NAME = eINSTANCE.getRoleAssignment_Name();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ASSIGNMENT__USER = eINSTANCE.getRoleAssignment_User();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ASSIGNMENT__ROLE = eINSTANCE.getRoleAssignment_Role();

		/**
		 * The meta object literal for the '<em><b>User Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_ASSIGNMENT__USER_GROUP = eINSTANCE.getRoleAssignment_UserGroup();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ASSIGNMENT__START = eINSTANCE.getRoleAssignment_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ASSIGNMENT__END = eINSTANCE.getRoleAssignment_End();

		/**
		 * The meta object literal for the '<em><b>Assigned On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_ASSIGNMENT__ASSIGNED_ON = eINSTANCE.getRoleAssignment_AssignedOn();

		/**
		 * The meta object literal for the '<em><b>Check Assigned On Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_ASSIGNMENT___CHECK_ASSIGNED_ON_DATES__ROLEASSIGNMENT = eINSTANCE.getRoleAssignment__CheckAssignedOnDates__RoleAssignment();

		/**
		 * The meta object literal for the '<em><b>Check Start End Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE_ASSIGNMENT___CHECK_START_END_DATES__ROLEASSIGNMENT = eINSTANCE.getRoleAssignment__CheckStartEndDates__RoleAssignment();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.UserGroupImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__NAME = eINSTANCE.getUserGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__USERS = eINSTANCE.getUserGroup_Users();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.impl.PaaSageCredentialsImpl <em>Paa Sage Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.impl.PaaSageCredentialsImpl
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getPaaSageCredentials()
		 * @generated
		 */
		EClass PAA_SAGE_CREDENTIALS = eINSTANCE.getPaaSageCredentials();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAA_SAGE_CREDENTIALS__PASSWORD = eINSTANCE.getPaaSageCredentials_Password();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.SecurityLevel <em>Security Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.SecurityLevel
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getSecurityLevel()
		 * @generated
		 */
		EEnum SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

		/**
		 * The meta object literal for the '{@link eu.paasage.camel.organisation.ResourcePattern <em>Resource Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.paasage.camel.organisation.ResourcePattern
		 * @see eu.paasage.camel.organisation.impl.OrganisationPackageImpl#getResourcePattern()
		 * @generated
		 */
		EEnum RESOURCE_PATTERN = eINSTANCE.getResourcePattern();

	}

} //OrganisationPackage
