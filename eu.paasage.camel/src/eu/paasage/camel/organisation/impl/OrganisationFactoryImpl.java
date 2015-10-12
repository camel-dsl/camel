/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.*;

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
public class OrganisationFactoryImpl extends EFactoryImpl implements OrganisationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrganisationFactory init() {
		try {
			OrganisationFactory theOrganisationFactory = (OrganisationFactory)EPackage.Registry.INSTANCE.getEFactory(OrganisationPackage.eNS_URI);
			if (theOrganisationFactory != null) {
				return theOrganisationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrganisationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationFactoryImpl() {
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
			case OrganisationPackage.ORGANISATION_MODEL: return (EObject)createOrganisationModel();
			case OrganisationPackage.CLOUD_CREDENTIALS: return (EObject)createCloudCredentials();
			case OrganisationPackage.DATA_CENTER: return (EObject)createDataCenter();
			case OrganisationPackage.ENTITY: return (EObject)createEntity();
			case OrganisationPackage.ORGANISATION: return (EObject)createOrganisation();
			case OrganisationPackage.CLOUD_PROVIDER: return (EObject)createCloudProvider();
			case OrganisationPackage.USER: return (EObject)createUser();
			case OrganisationPackage.EXTERNAL_IDENTIFIER: return (EObject)createExternalIdentifier();
			case OrganisationPackage.PERMISSION: return (EObject)createPermission();
			case OrganisationPackage.INFORMATION_RESOURCE_FILTER: return (EObject)createInformationResourceFilter();
			case OrganisationPackage.SERVICE_RESOURCE_FILTER: return (EObject)createServiceResourceFilter();
			case OrganisationPackage.ROLE: return (EObject)createRole();
			case OrganisationPackage.ROLE_ASSIGNMENT: return (EObject)createRoleAssignment();
			case OrganisationPackage.USER_GROUP: return (EObject)createUserGroup();
			case OrganisationPackage.PAA_SAGE_CREDENTIALS: return (EObject)createPaaSageCredentials();
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
			case OrganisationPackage.SECURITY_LEVEL:
				return createSecurityLevelFromString(eDataType, initialValue);
			case OrganisationPackage.RESOURCE_PATTERN:
				return createResourcePatternFromString(eDataType, initialValue);
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
			case OrganisationPackage.SECURITY_LEVEL:
				return convertSecurityLevelToString(eDataType, instanceValue);
			case OrganisationPackage.RESOURCE_PATTERN:
				return convertResourcePatternToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationModel createOrganisationModel() {
		OrganisationModelImpl organisationModel = new OrganisationModelImpl();
		return organisationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudCredentials createCloudCredentials() {
		CloudCredentialsImpl cloudCredentials = new CloudCredentialsImpl();
		return cloudCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataCenter createDataCenter() {
		DataCenterImpl dataCenter = new DataCenterImpl();
		return dataCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation createOrganisation() {
		OrganisationImpl organisation = new OrganisationImpl();
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalIdentifier createExternalIdentifier() {
		ExternalIdentifierImpl externalIdentifier = new ExternalIdentifierImpl();
		return externalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationResourceFilter createInformationResourceFilter() {
		InformationResourceFilterImpl informationResourceFilter = new InformationResourceFilterImpl();
		return informationResourceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceResourceFilter createServiceResourceFilter() {
		ServiceResourceFilterImpl serviceResourceFilter = new ServiceResourceFilterImpl();
		return serviceResourceFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleAssignment createRoleAssignment() {
		RoleAssignmentImpl roleAssignment = new RoleAssignmentImpl();
		return roleAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup createUserGroup() {
		UserGroupImpl userGroup = new UserGroupImpl();
		return userGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaaSageCredentials createPaaSageCredentials() {
		PaaSageCredentialsImpl paaSageCredentials = new PaaSageCredentialsImpl();
		return paaSageCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel createSecurityLevelFromString(EDataType eDataType, String initialValue) {
		SecurityLevel result = SecurityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePattern createResourcePatternFromString(EDataType eDataType, String initialValue) {
		ResourcePattern result = ResourcePattern.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourcePatternToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationPackage getOrganisationPackage() {
		return (OrganisationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrganisationPackage getPackage() {
		return OrganisationPackage.eINSTANCE;
	}

} //OrganisationFactoryImpl
