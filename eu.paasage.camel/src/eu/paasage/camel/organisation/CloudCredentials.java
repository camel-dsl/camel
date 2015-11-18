/**
 */
package eu.paasage.camel.organisation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getCloudProvider <em>Cloud Provider</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getPublicSSHKey <em>Public SSH Key</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getPrivateSSHKey <em>Private SSH Key</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getUsername <em>Username</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.CloudCredentials#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials()
 * @model
 * @generated
 */
public interface CloudCredentials extends Credentials {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cloud Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Provider</em>' reference.
	 * @see #setCloudProvider(CloudProvider)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_CloudProvider()
	 * @model required="true"
	 * @generated
	 */
	CloudProvider getCloudProvider();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getCloudProvider <em>Cloud Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Provider</em>' reference.
	 * @see #getCloudProvider()
	 * @generated
	 */
	void setCloudProvider(CloudProvider value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_SecurityGroup()
	 * @model
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>Public SSH Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public SSH Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public SSH Key</em>' attribute.
	 * @see #setPublicSSHKey(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_PublicSSHKey()
	 * @model
	 * @generated
	 */
	String getPublicSSHKey();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getPublicSSHKey <em>Public SSH Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public SSH Key</em>' attribute.
	 * @see #getPublicSSHKey()
	 * @generated
	 */
	void setPublicSSHKey(String value);

	/**
	 * Returns the value of the '<em><b>Private SSH Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private SSH Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private SSH Key</em>' attribute.
	 * @see #setPrivateSSHKey(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_PrivateSSHKey()
	 * @model
	 * @generated
	 */
	String getPrivateSSHKey();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getPrivateSSHKey <em>Private SSH Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private SSH Key</em>' attribute.
	 * @see #getPrivateSSHKey()
	 * @generated
	 */
	void setPrivateSSHKey(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getCloudCredentials_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.CloudCredentials#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // CloudCredentials
