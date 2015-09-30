/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Communication;
import eu.paasage.camel.deployment.CommunicationType;
import eu.paasage.camel.deployment.Configuration;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.ProvidedCommunication;
import eu.paasage.camel.deployment.RequiredCommunication;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationImpl#getProvidedCommunication <em>Provided Communication</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationImpl#getRequiredCommunication <em>Required Communication</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationImpl#getProvidedPortConfiguration <em>Provided Port Configuration</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationImpl#getRequiredPortConfiguration <em>Required Port Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationImpl extends DeploymentElementImpl implements Communication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType getType() {
		return (CommunicationType)eGet(DeploymentPackage.Literals.COMMUNICATION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CommunicationType newType) {
		eSet(DeploymentPackage.Literals.COMMUNICATION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCommunication getRequiredCommunication() {
		return (RequiredCommunication)eGet(DeploymentPackage.Literals.COMMUNICATION__REQUIRED_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCommunication(RequiredCommunication newRequiredCommunication) {
		eSet(DeploymentPackage.Literals.COMMUNICATION__REQUIRED_COMMUNICATION, newRequiredCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getProvidedPortConfiguration() {
		return (Configuration)eGet(DeploymentPackage.Literals.COMMUNICATION__PROVIDED_PORT_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedPortConfiguration(Configuration newProvidedPortConfiguration) {
		eSet(DeploymentPackage.Literals.COMMUNICATION__PROVIDED_PORT_CONFIGURATION, newProvidedPortConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getRequiredPortConfiguration() {
		return (Configuration)eGet(DeploymentPackage.Literals.COMMUNICATION__REQUIRED_PORT_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredPortConfiguration(Configuration newRequiredPortConfiguration) {
		eSet(DeploymentPackage.Literals.COMMUNICATION__REQUIRED_PORT_CONFIGURATION, newRequiredPortConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCommunication getProvidedCommunication() {
		return (ProvidedCommunication)eGet(DeploymentPackage.Literals.COMMUNICATION__PROVIDED_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedCommunication(ProvidedCommunication newProvidedCommunication) {
		eSet(DeploymentPackage.Literals.COMMUNICATION__PROVIDED_COMMUNICATION, newProvidedCommunication);
	}

} //CommunicationImpl
