/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.impl.ModelImpl;
import eu.paasage.camel.organisation.CloudProvider;
import eu.paasage.camel.organisation.DataCenter;
import eu.paasage.camel.organisation.ExternalIdentifier;
import eu.paasage.camel.organisation.Organisation;
import eu.paasage.camel.organisation.OrganisationModel;
import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.Permission;
import eu.paasage.camel.organisation.ResourceFilter;
import eu.paasage.camel.organisation.Role;
import eu.paasage.camel.organisation.RoleAssignment;
import eu.paasage.camel.organisation.SecurityLevel;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.organisation.UserGroup;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getExternalIdentifiers <em>External Identifiers</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getUserGroups <em>User Groups</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getDataCentres <em>Data Centres</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getRoleAssigments <em>Role Assigments</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.OrganisationModelImpl#getResourceFilters <em>Resource Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationModelImpl extends ModelImpl implements OrganisationModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.ORGANISATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider getProvider() {
		return (CloudProvider)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(CloudProvider newProvider) {
		eSet(OrganisationPackage.Literals.ORGANISATION_MODEL__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getOrganisation() {
		return (Organisation)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__ORGANISATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(Organisation newOrganisation) {
		eSet(OrganisationPackage.Literals.ORGANISATION_MODEL__ORGANISATION, newOrganisation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UserGroup> getUserGroups() {
		return (EList<UserGroup>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__USER_GROUPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataCenter> getDataCentres() {
		return (EList<DataCenter>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__DATA_CENTRES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RoleAssignment> getRoleAssigments() {
		return (EList<RoleAssignment>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__ROLE_ASSIGMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__PERMISSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel getSecurityLevel() {
		return (SecurityLevel)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__SECURITY_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(SecurityLevel newSecurityLevel) {
		eSet(OrganisationPackage.Literals.ORGANISATION_MODEL__SECURITY_LEVEL, newSecurityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ResourceFilter> getResourceFilters() {
		return (EList<ResourceFilter>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__RESOURCE_FILTERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExternalIdentifier> getExternalIdentifiers() {
		return (EList<ExternalIdentifier>)eGet(OrganisationPackage.Literals.ORGANISATION_MODEL__EXTERNAL_IDENTIFIERS, true);
	}

} //OrganisationModelImpl
