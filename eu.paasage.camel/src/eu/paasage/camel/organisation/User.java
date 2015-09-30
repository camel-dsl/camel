/**
 */
package eu.paasage.camel.organisation;

import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.requirement.RequirementModel;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.User#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getEmail <em>Email</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getFirstName <em>First Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getLastName <em>Last Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getWww <em>Www</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getExternalIdentifiers <em>External Identifiers</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getRequirementModels <em>Requirement Models</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getCloudCredentials <em>Cloud Credentials</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getDeploymentModels <em>Deployment Models</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.User#getPaasageCredentials <em>Paasage Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Entity {
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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_FirstName()
	 * @model required="true"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_LastName()
	 * @model required="true"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Www</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Www</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Www</em>' attribute.
	 * @see #setWww(String)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_Www()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='CloudProvider' unique='false' upper='*'"
	 * @generated
	 */
	String getWww();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getWww <em>Www</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Www</em>' attribute.
	 * @see #getWww()
	 * @generated
	 */
	void setWww(String value);

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
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_ExternalIdentifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalIdentifier> getExternalIdentifiers();

	/**
	 * Returns the value of the '<em><b>Requirement Models</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.requirement.RequirementModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Models</em>' reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_RequirementModels()
	 * @model
	 * @generated
	 */
	EList<RequirementModel> getRequirementModels();

	/**
	 * Returns the value of the '<em><b>Cloud Credentials</b></em>' containment reference list.
	 * The list contents are of type {@link eu.paasage.camel.organisation.CloudCredentials}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloud Credentials</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Credentials</em>' containment reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_CloudCredentials()
	 * @model containment="true"
	 * @generated
	 */
	EList<CloudCredentials> getCloudCredentials();

	/**
	 * Returns the value of the '<em><b>Deployment Models</b></em>' reference list.
	 * The list contents are of type {@link eu.paasage.camel.deployment.DeploymentModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Models</em>' reference list.
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_DeploymentModels()
	 * @model
	 * @generated
	 */
	EList<DeploymentModel> getDeploymentModels();

	/**
	 * Returns the value of the '<em><b>Paasage Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paasage Credentials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paasage Credentials</em>' containment reference.
	 * @see #setPaasageCredentials(PaaSageCredentials)
	 * @see eu.paasage.camel.organisation.OrganisationPackage#getUser_PaasageCredentials()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PaaSageCredentials getPaasageCredentials();

	/**
	 * Sets the value of the '{@link eu.paasage.camel.organisation.User#getPaasageCredentials <em>Paasage Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paasage Credentials</em>' containment reference.
	 * @see #getPaasageCredentials()
	 * @generated
	 */
	void setPaasageCredentials(PaaSageCredentials value);

} // User
