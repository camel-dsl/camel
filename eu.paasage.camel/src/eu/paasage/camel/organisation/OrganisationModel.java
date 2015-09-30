/**
 */
package eu.paasage.camel.organisation;

import eu.paasage.camel.Model;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getProvider <em>Provider</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getExternalIdentifiers <em>External Identifiers</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getUsers <em>Users</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getUserGroups <em>User Groups</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getDataCentres <em>Data Centres</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getRoles <em>Roles</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getRoleAssigments <em>Role Assigments</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.OrganisationModel#getResourceFilters <em>Resource Filters</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='org_model_provider_or_organisation_supplied'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot org_model_provider_or_organisation_supplied='Tuple {\n\tmessage : String = \'The OrganisationModel: \' + self.name +\n\t\t\t\t\t\' should map to one and only organisation or cloud provider\',\n\tstatus : Boolean = provider <> null or organisation <> null\n}.status'"
 * @generated
 */
public interface OrganisationModel extends Model {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_Users()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' containment reference.
	 * @see #setProvider(CloudProvider)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_Provider()
	 * @model containment="true"
	 * @generated
	 */
	CloudProvider getProvider();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.OrganisationModel#getProvider <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' containment reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(CloudProvider value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' containment reference.
	 * @see #setOrganisation(Organisation)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_Organisation()
	 * @model containment="true"
	 * @generated
	 */
	Organisation getOrganisation();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.OrganisationModel#getOrganisation <em>Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' containment reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organisation value);

	/**
	 * Returns the value of the '<em><b>User Groups</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.UserGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Groups</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_UserGroups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UserGroup> getUserGroups();

	/**
	 * Returns the value of the '<em><b>Data Centres</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.DataCenter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Centres</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Centres</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_DataCentres()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataCenter> getDataCentres();

	/**
	 * Returns the value of the '<em><b>Role Assigments</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.RoleAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Assigments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Assigments</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_RoleAssigments()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RoleAssignment> getRoleAssigments();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_Roles()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.Permission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permissions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_Permissions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Permission> getPermissions();

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.paasage.camel.organisation.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see eu.paasage.camel.organisation.SecurityLevel
	 * @see #setSecurityLevel(SecurityLevel)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_SecurityLevel()
	 * @model required="true"
	 * @generated
	 */
	SecurityLevel getSecurityLevel();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.OrganisationModel#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see eu.paasage.camel.organisation.SecurityLevel
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Resource Filters</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.ResourceFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Filters</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_ResourceFilters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceFilter> getResourceFilters();

	/**
	 * Returns the value of the '<em><b>External Identifiers</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.ExternalIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Identifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Identifiers</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getOrganisationModel_ExternalIdentifiers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExternalIdentifier> getExternalIdentifiers();

} // OrganisationModel
