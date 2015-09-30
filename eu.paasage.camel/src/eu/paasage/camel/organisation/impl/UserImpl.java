/**
 */
package eu.paasage.camel.organisation.impl;

import eu.paasage.camel.deployment.DeploymentModel;
import eu.paasage.camel.organisation.CloudCredentials;
import eu.paasage.camel.organisation.ExternalIdentifier;
import eu.paasage.camel.organisation.OrganisationPackage;
import eu.paasage.camel.organisation.PaaSageCredentials;
import eu.paasage.camel.organisation.User;
import eu.paasage.camel.requirement.RequirementModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getWww <em>Www</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getExternalIdentifiers <em>External Identifiers</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getRequirementModels <em>Requirement Models</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getCloudCredentials <em>Cloud Credentials</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getDeploymentModels <em>Deployment Models</em>}</li>
 *   <li>{@link eu.paasage.camel.organisation.impl.UserImpl#getPaasageCredentials <em>Paasage Credentials</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends EntityImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrganisationPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(OrganisationPackage.Literals.USER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OrganisationPackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return (String)eGet(OrganisationPackage.Literals.USER__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		eSet(OrganisationPackage.Literals.USER__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return (String)eGet(OrganisationPackage.Literals.USER__LAST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		eSet(OrganisationPackage.Literals.USER__LAST_NAME, newLastName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return (String)eGet(OrganisationPackage.Literals.USER__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		eSet(OrganisationPackage.Literals.USER__EMAIL, newEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWww() {
		return (String)eGet(OrganisationPackage.Literals.USER__WWW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWww(String newWww) {
		eSet(OrganisationPackage.Literals.USER__WWW, newWww);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExternalIdentifier> getExternalIdentifiers() {
		return (EList<ExternalIdentifier>)eGet(OrganisationPackage.Literals.USER__EXTERNAL_IDENTIFIERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RequirementModel> getRequirementModels() {
		return (EList<RequirementModel>)eGet(OrganisationPackage.Literals.USER__REQUIREMENT_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CloudCredentials> getCloudCredentials() {
		return (EList<CloudCredentials>)eGet(OrganisationPackage.Literals.USER__CLOUD_CREDENTIALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DeploymentModel> getDeploymentModels() {
		return (EList<DeploymentModel>)eGet(OrganisationPackage.Literals.USER__DEPLOYMENT_MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaaSageCredentials getPaasageCredentials() {
		return (PaaSageCredentials)eGet(OrganisationPackage.Literals.USER__PAASAGE_CREDENTIALS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaasageCredentials(PaaSageCredentials newPaasageCredentials) {
		eSet(OrganisationPackage.Literals.USER__PAASAGE_CREDENTIALS, newPaasageCredentials);
	}

} //UserImpl
