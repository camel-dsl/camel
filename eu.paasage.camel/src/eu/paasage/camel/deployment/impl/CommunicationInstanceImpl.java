/**
 */
package eu.paasage.camel.deployment.impl;

import eu.paasage.camel.deployment.Communication;
import eu.paasage.camel.deployment.CommunicationInstance;
import eu.paasage.camel.deployment.DeploymentPackage;
import eu.paasage.camel.deployment.ProvidedCommunicationInstance;
import eu.paasage.camel.deployment.RequiredCommunicationInstance;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationInstanceImpl#getProvidedCommunicationInstance <em>Provided Communication Instance</em>}</li>
 *   <li>{@link eu.paasage.camel.deployment.impl.CommunicationInstanceImpl#getRequiredCommunicationInstance <em>Required Communication Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationInstanceImpl extends DeploymentElementImpl implements CommunicationInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.COMMUNICATION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getType() {
		return (Communication)eGet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Communication newType) {
		eSet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedCommunicationInstance getProvidedCommunicationInstance() {
		return (ProvidedCommunicationInstance)eGet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__PROVIDED_COMMUNICATION_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedCommunicationInstance(ProvidedCommunicationInstance newProvidedCommunicationInstance) {
		eSet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__PROVIDED_COMMUNICATION_INSTANCE, newProvidedCommunicationInstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredCommunicationInstance getRequiredCommunicationInstance() {
		return (RequiredCommunicationInstance)eGet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__REQUIRED_COMMUNICATION_INSTANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredCommunicationInstance(RequiredCommunicationInstance newRequiredCommunicationInstance) {
		eSet(DeploymentPackage.Literals.COMMUNICATION_INSTANCE__REQUIRED_COMMUNICATION_INSTANCE, newRequiredCommunicationInstance);
	}

} //CommunicationInstanceImpl
