/**
 */
package eu.paasage.camel.organisation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.paasage.camel.organisation.OrganisationPackage
 * @generated
 */
public interface OrganisationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrganisationFactory eINSTANCE = eu.paasage.camel.organisation.impl.OrganisationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	OrganisationModel createOrganisationModel();

	/**
	 * Returns a new object of class '<em>Cloud Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Credentials</em>'.
	 * @generated
	 */
	CloudCredentials createCloudCredentials();

	/**
	 * Returns a new object of class '<em>Data Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Center</em>'.
	 * @generated
	 */
	DataCenter createDataCenter();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisation</em>'.
	 * @generated
	 */
	Organisation createOrganisation();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>External Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Identifier</em>'.
	 * @generated
	 */
	ExternalIdentifier createExternalIdentifier();

	/**
	 * Returns a new object of class '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission</em>'.
	 * @generated
	 */
	Permission createPermission();

	/**
	 * Returns a new object of class '<em>Information Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Resource Filter</em>'.
	 * @generated
	 */
	InformationResourceFilter createInformationResourceFilter();

	/**
	 * Returns a new object of class '<em>Service Resource Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Resource Filter</em>'.
	 * @generated
	 */
	ServiceResourceFilter createServiceResourceFilter();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Role Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Assignment</em>'.
	 * @generated
	 */
	RoleAssignment createRoleAssignment();

	/**
	 * Returns a new object of class '<em>User Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Group</em>'.
	 * @generated
	 */
	UserGroup createUserGroup();

	/**
	 * Returns a new object of class '<em>Paa Sage Credentials</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paa Sage Credentials</em>'.
	 * @generated
	 */
	PaaSageCredentials createPaaSageCredentials();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OrganisationPackage getOrganisationPackage();

} //OrganisationFactory
