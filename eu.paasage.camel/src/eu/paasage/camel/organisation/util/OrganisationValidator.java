/**
 */
package eu.paasage.camel.organisation.util;

import eu.paasage.camel.organisation.*;

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
 * @see eu.paasage.camel.organisation.OrganisationPackage
 * @generated
 */
public class OrganisationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrganisationValidator INSTANCE = new OrganisationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "eu.paasage.camel.organisation";

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
	public OrganisationValidator() {
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
	  return OrganisationPackage.eINSTANCE;
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
			case OrganisationPackage.ORGANISATION_MODEL:
				return validateOrganisationModel((OrganisationModel)value, diagnostics, context);
			case OrganisationPackage.CREDENTIALS:
				return validateCredentials((Credentials)value, diagnostics, context);
			case OrganisationPackage.CLOUD_CREDENTIALS:
				return validateCloudCredentials((CloudCredentials)value, diagnostics, context);
			case OrganisationPackage.DATA_CENTER:
				return validateDataCenter((DataCenter)value, diagnostics, context);
			case OrganisationPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case OrganisationPackage.ORGANISATION:
				return validateOrganisation((Organisation)value, diagnostics, context);
			case OrganisationPackage.CLOUD_PROVIDER:
				return validateCloudProvider((CloudProvider)value, diagnostics, context);
			case OrganisationPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case OrganisationPackage.EXTERNAL_IDENTIFIER:
				return validateExternalIdentifier((ExternalIdentifier)value, diagnostics, context);
			case OrganisationPackage.PERMISSION:
				return validatePermission((Permission)value, diagnostics, context);
			case OrganisationPackage.RESOURCE_FILTER:
				return validateResourceFilter((ResourceFilter)value, diagnostics, context);
			case OrganisationPackage.INFORMATION_RESOURCE_FILTER:
				return validateInformationResourceFilter((InformationResourceFilter)value, diagnostics, context);
			case OrganisationPackage.SERVICE_RESOURCE_FILTER:
				return validateServiceResourceFilter((ServiceResourceFilter)value, diagnostics, context);
			case OrganisationPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case OrganisationPackage.ROLE_ASSIGNMENT:
				return validateRoleAssignment((RoleAssignment)value, diagnostics, context);
			case OrganisationPackage.USER_GROUP:
				return validateUserGroup((UserGroup)value, diagnostics, context);
			case OrganisationPackage.PAA_SAGE_CREDENTIALS:
				return validatePaaSageCredentials((PaaSageCredentials)value, diagnostics, context);
			case OrganisationPackage.SECURITY_LEVEL:
				return validateSecurityLevel((SecurityLevel)value, diagnostics, context);
			case OrganisationPackage.RESOURCE_PATTERN:
				return validateResourcePattern((ResourcePattern)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationModel(OrganisationModel organisationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)organisationModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)organisationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateOrganisationModel_org_model_provider_or_organisation_supplied(organisationModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the org_model_provider_or_organisation_supplied constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ORGANISATION_MODEL__ORG_MODEL_PROVIDER_OR_ORGANISATION_SUPPLIED__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The OrganisationModel: ' + self.name +\n" +
		"\t\t\t\t\t' should map to one and only organisation or cloud provider',\n" +
		"\tstatus : Boolean = provider <> null or organisation <> null\n" +
		"}.status";

	/**
	 * Validates the org_model_provider_or_organisation_supplied constraint of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisationModel_org_model_provider_or_organisation_supplied(OrganisationModel organisationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.ORGANISATION_MODEL,
				 organisationModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "org_model_provider_or_organisation_supplied",
				 ORGANISATION_MODEL__ORG_MODEL_PROVIDER_OR_ORGANISATION_SUPPLIED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredentials(Credentials credentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)credentials, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudCredentials(CloudCredentials cloudCredentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)cloudCredentials, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)dataCenter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCenter_unique_datacenter_per_provider(dataCenter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataCenter_no_datacenter_same_location_same_provider(dataCenter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the unique_datacenter_per_provider constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_CENTER__UNIQUE_DATACENTER_PER_PROVIDER__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There exist data centers of cloud provider that have the same name or the same code name',\n" +
		"\tstatus : Boolean = DataCenter.allInstances()\n" +
		"\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.name <> p2.name and p1.codeName <>\n" +
		"\t\t\t\t\t\tp2.codeName)\n" +
		"}.status";

	/**
	 * Validates the unique_datacenter_per_provider constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter_unique_datacenter_per_provider(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.DATA_CENTER,
				 dataCenter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "unique_datacenter_per_provider",
				 DATA_CENTER__UNIQUE_DATACENTER_PER_PROVIDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_datacenter_same_location_same_provider constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_CENTER__NO_DATACENTER_SAME_LOCATION_SAME_PROVIDER__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There exist data centers of cloud provider which are on the same fine-grained location',\n" +
		"\tstatus : Boolean = DataCenter.allInstances()\n" +
		"\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and p1.name <> p2.name and p1.oclContainer().oclAsType(OrganisationModel).provider = p2.oclContainer().oclAsType(OrganisationModel).provider implies p1.location <>\n" +
		"\t\t\t\t\t\tp2.location)\n" +
		"}.status";

	/**
	 * Validates the no_datacenter_same_location_same_provider constraint of '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataCenter_no_datacenter_same_location_same_provider(DataCenter dataCenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.DATA_CENTER,
				 dataCenter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_datacenter_same_location_same_provider",
				 DATA_CENTER__NO_DATACENTER_SAME_LOCATION_SAME_PROVIDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)entity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganisation(Organisation organisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)organisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudProvider(CloudProvider cloudProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)cloudProvider, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalIdentifier(ExternalIdentifier externalIdentifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)externalIdentifier, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)permission, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)permission, diagnostics, context);
		if (result || diagnostics != null) result &= validatePermission_permission_valid_actions(permission, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the permission_valid_actions constraint of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PERMISSION__PERMISSION_VALID_ACTIONS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'Wrong actions were identified for resource:' + self.resourceFilter.name +\n" +
		"\t\t\t\t\t' in the context of Permission: ' + self.name,\n" +
		"\tstatus : Boolean = self.action = camel::ActionType::READ or self.action =\n" +
		"\t\t\t\t\tcamel::ActionType::WRITE\n" +
		"}.status";

	/**
	 * Validates the permission_valid_actions constraint of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermission_permission_valid_actions(Permission permission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.PERMISSION,
				 permission,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "permission_valid_actions",
				 PERMISSION__PERMISSION_VALID_ACTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceFilter(ResourceFilter resourceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)resourceFilter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationResourceFilter(InformationResourceFilter informationResourceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)informationResourceFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)informationResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateInformationResourceFilter_information_resource_filter_validity(informationResourceFilter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the information_resource_filter_validity constraint of '<em>Information Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_FILTER_VALIDITY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'InformationResourceFilter: ' + self.name +\n" +
		"\t\t\t\t\t' is not valid as both its own attributes were set',\n" +
		"\tstatus : Boolean = everyInformationResource = true implies\n" +
		"\t\t\t\t\tinformationResourcePath = null\n" +
		"}.status";

	/**
	 * Validates the information_resource_filter_validity constraint of '<em>Information Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInformationResourceFilter_information_resource_filter_validity(InformationResourceFilter informationResourceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.INFORMATION_RESOURCE_FILTER,
				 informationResourceFilter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "information_resource_filter_validity",
				 INFORMATION_RESOURCE_FILTER__INFORMATION_RESOURCE_FILTER_VALIDITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceResourceFilter(ServiceResourceFilter serviceResourceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)serviceResourceFilter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)serviceResourceFilter, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceResourceFilter_service_resource_filter_validity(serviceResourceFilter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the service_resource_filter_validity constraint of '<em>Service Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_RESOURCE_FILTER__SERVICE_RESOURCE_FILTER_VALIDITY__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'ServiceResourceFilter: ' + self.name +\n" +
		"\t\t\t\t\t' is not valid as both its own attributes were set',\n" +
		"\tstatus : Boolean = everyService = true implies serviceURL = null\n" +
		"}.status";

	/**
	 * Validates the service_resource_filter_validity constraint of '<em>Service Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceResourceFilter_service_resource_filter_validity(ServiceResourceFilter serviceResourceFilter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.SERVICE_RESOURCE_FILTER,
				 serviceResourceFilter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "service_resource_filter_validity",
				 SERVICE_RESOURCE_FILTER__SERVICE_RESOURCE_FILTER_VALIDITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAssignment(RoleAssignment roleAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)roleAssignment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleAssignment_role_assignment_at_least_user_or_group(roleAssignment, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoleAssignment_same_role_concurrent_assignments(roleAssignment, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the role_assignment_at_least_user_or_group constraint of '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_ASSIGNMENT__ROLE_ASSIGNMENT_AT_LEAST_USER_OR_GROUP__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There is no user or user group associated to RoleAssigment:' +\n" +
		"\t\t\t\t\tself.name,\n" +
		"\tstatus : Boolean = self.user <> null or self.userGroup <> null\n" +
		"}.status";

	/**
	 * Validates the role_assignment_at_least_user_or_group constraint of '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAssignment_role_assignment_at_least_user_or_group(RoleAssignment roleAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.ROLE_ASSIGNMENT,
				 roleAssignment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "role_assignment_at_least_user_or_group",
				 ROLE_ASSIGNMENT__ROLE_ASSIGNMENT_AT_LEAST_USER_OR_GROUP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the same_role_concurrent_assignments constraint of '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROLE_ASSIGNMENT__SAME_ROLE_CONCURRENT_ASSIGNMENTS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'There are two or more role assignments which are odentical, i.e., refer to the same organisation, user/user group and role',\n" +
		"\tstatus : Boolean = RoleAssignment.allInstances()\n" +
		"\t\t\t\t\t->forAll(p1, p2 | p1 <> p2 and ((p1.user <> null and p2.user <> null and p1.user = p2.user) or (p1.userGroup <>\n" +
		"\t\t\t\t\t\tnull and p2.userGroup <> null and p1.userGroup = p2.userGroup)) implies p1.role <> p2.role)\n" +
		"}.status";

	/**
	 * Validates the same_role_concurrent_assignments constraint of '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleAssignment_same_role_concurrent_assignments(RoleAssignment roleAssignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(OrganisationPackage.Literals.ROLE_ASSIGNMENT,
				 roleAssignment,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "same_role_concurrent_assignments",
				 ROLE_ASSIGNMENT__SAME_ROLE_CONCURRENT_ASSIGNMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserGroup(UserGroup userGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)userGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaaSageCredentials(PaaSageCredentials paaSageCredentials, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)paaSageCredentials, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityLevel(SecurityLevel securityLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcePattern(ResourcePattern resourcePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //OrganisationValidator
