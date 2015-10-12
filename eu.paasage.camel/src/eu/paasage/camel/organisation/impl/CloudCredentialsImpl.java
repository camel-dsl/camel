/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.organisation.CloudCredentials;
import eu.paasage.camel.organisation.CloudProvider;
import eu.paasage.camel.organisation.OrganisationPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getPublicSSHKey <em>Public SSH Key</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getPrivateSSHKey <em>Private SSH Key</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.CloudCredentialsImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudCredentialsImpl extends CredentialsImpl implements CloudCredentials {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.CLOUD_CREDENTIALS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider getCloudProvider() {
		return (CloudProvider)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__CLOUD_PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudProvider(CloudProvider newCloudProvider) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__CLOUD_PROVIDER, newCloudProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityGroup() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__SECURITY_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityGroup(String newSecurityGroup) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__SECURITY_GROUP, newSecurityGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicSSHKey() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PUBLIC_SSH_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicSSHKey(String newPublicSSHKey) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PUBLIC_SSH_KEY, newPublicSSHKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateSSHKey() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PRIVATE_SSH_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateSSHKey(String newPrivateSSHKey) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PRIVATE_SSH_KEY, newPrivateSSHKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__USERNAME, newUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return (String)eGet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		eSet(OrganisationPackage.Literals.CLOUD_CREDENTIALS__PASSWORD, newPassword);
	}

} //CloudCredentialsImpl
